package installCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericValidator implements AbstractValidator{
	
	    private static AbstractValidator instance = null;

	    private GenericValidator(  )
	    {
	    }

	   
	    public static synchronized AbstractValidator getInstance(  )
	    {
	        if ( instance == null )
	        {
	            instance = new GenericValidator(  );
	        }

	        return instance;
	    }

	   
	    public synchronized void validate( Customer.CustBuilder param )
	        throws AttributeValidatorException
	    {
	        Class clazz = param.getClass(  );
	        Method[] methods = clazz.getMethods(  );

	        Iterator methodIter = Arrays.asList( methods ).iterator(  );
	        Method method = null;
	        String methodName = null;
	        //System.out.println(clazz);
	        while ( methodIter.hasNext(  ) )
	        {
	            method = (Method) methodIter.next(  );
	            methodName = method.getName(  );
	            
	            
	            //System.out.println(method.getDeclaringClass(  ));
	            if ( methodName.startsWith( "get" ) &&
	                    clazz.equals( method.getDeclaringClass(  ) ) )
	            {
	            	//System.out.println("Method Name  :"+ methodName);
	                Object methodResult = null;

	                try
	                {
	                    //methodResult = method.invoke( param, null );
	                	methodResult = method.invoke(param, null);
	                	//System.out.println(methodResult);
	                	/*if(methodResult.equals(""))
	                		System.out.println("HE HE HE");*/
	                }
	                catch ( IllegalArgumentException e )
	                {
	                    throw new AttributeValidatorException( e.getMessage(  ) );
	                }
	                catch ( IllegalAccessException e )
	                {
	                    throw new AttributeValidatorException( e.getMessage(  ) );
	                }
	                catch ( InvocationTargetException e )
	                {
	                    throw new AttributeValidatorException( e.getMessage(  ) );
	                }

	                if ( methodResult.equals(""))
	                {
	                    String attributeName = methodName.substring( 3, 4 ).toLowerCase(  ) +
	                        methodName.substring( 4, methodName.length(  ) );
	                    String className = clazz.getName(  );
	                    className = className.substring( className.lastIndexOf( '.' ) + 1 );

	                    throw new AttributeValidatorException( "Error: " + attributeName +" cannot be empty");
	                }

	                if ( methodResult instanceof Collection )
	                {
	                    Collection col = (Collection) methodResult;
	                    Iterator iter = col.iterator(  );
	                    Object subParam = null;

	                    while ( iter.hasNext(  ) )
	                    {
	                        subParam = iter.next(  );

	                        if ( subParam instanceof Customer.CustBuilder )
	                        {
	                           Customer.CustBuilder abstractParam = ( Customer.CustBuilder ) subParam;
	                            abstractParam.validateWith( this );
	                        }
	                    }
	                }
	            }
	        }
	    
	}


}
