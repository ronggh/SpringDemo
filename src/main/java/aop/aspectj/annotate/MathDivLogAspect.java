package aop.aspectj.annotate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class MathDivLogAspect {
    /**
     * 相同的切入点进行抽取，全类名，方法
     */
    @Pointcut(value = "execution(* aop.aspectj.annotate.MathDiv.div(..))")
    public void pointCut(){

    }

    //

    /**
     * 使用@Before 代表前置通知
     * @param joinPoint,可以获取原方法的信息
     * joinPoint.getSignature().getName() 获取方法名称，
     * joinPoint.getArgs() 获取方法参数列表
     */
    @Before(value = "pointCut()")
    public void beforeDiv(JoinPoint joinPoint){
        System.out.println(" ===> beforeDiv...原方法名：" + joinPoint.getSignature().getName()
                +"\t 参数：{" + Arrays.toString(joinPoint.getArgs()) +"}");
    }

    @After(value = "pointCut()")
    public void afterDiv(JoinPoint joinPoint){
        System.out.println(" ===> afterDiv...原方法名：" + joinPoint.getSignature().getName());
    }

    /**
     * 正常返回
     */
    @AfterReturning(value="pointCut()",returning = "result")
    public void afterDivReturn(JoinPoint joinPoint,Object result){
        System.out.println(" ===> afterDivReturn...原方法名：" + joinPoint.getSignature().getName());
        System.out.println(" ===> 返回值是：" + result);
    }

    /**
     * 异常返回
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value="pointCut()",throwing="exception")
    public void afterDivThrowing(JoinPoint joinPoint,Exception exception){
        System.out.println(" ===> afterDivThrowing...原方法名：" + joinPoint.getSignature().getName());
        System.out.println(" ===> 异常：" + exception);
    }

}
