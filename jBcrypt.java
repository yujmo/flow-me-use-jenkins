import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by Administrator on 2017/6/2.
 * <p>
 * Description:
 */
public class Test
{
    public static void main(String[] args)
    {
        //这是加密方式
        String hashed = BCrypt.hashpw("nimda", BCrypt.gensalt());
        System.out.println(hashed);

        //这是解密方式
        if (BCrypt.checkpw("nimda", hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");
    }
}
