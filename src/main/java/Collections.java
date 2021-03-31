import java.util.Scanner;

public class Collections {
    /**
     * sql第一题三种
     * select DISTINCT a.name  from tbl_middle_student a left join tbl_middle_score b on a.id=b.stu_id where b.score=100
     * select  a.name  from tbl_middle_student a where a.id in( select distinct stu_id  from  tbl_middle_score b where  b.score=100)
     * select  b.name from tbl_middle_score a  right join tbl_middle_student b on a.stu_id=b.id where a.score=100 group by b.name
     * */
    /**
     * sql第二题种
     *     SELECT c.name classname, a.name,b.height
     *     FROM tbl_middle_student a inner join (SELECT  classid, MAX(height) height
     *     FROM tbl_middle_student
     *     GROUP BY classid) b on  a.classid =b.classid and a.height=b.height
     *     left join tbl_middle_class c on a.classid=c.id
     *     order by c.name
     *
     * */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个int数据:");
        System.out.println("哈哈哈");
        int N=scan.nextInt();
      int  a= getMaxSize(N);
      int cost=0;
        System.out.println("N="+N+",打印菱形");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
                cost++;
            }
            System.out.println("");
        }
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(a-i-2)+1; k++) {
                cost++;
                System.out.print("*");
            }
            System.out.println("");
        }
        int c=N-cost;
        System.out.println("剩余*:"+c);
    }

    private static int getMaxSize(int a) {
        int c = 0;
        for(int i = 0; i*i< a; i++){
            int b=2*i*i+2*i+1;
            if(b>a){
                c=i;
                break;
            }else if(b==a){
                c=i+1;
                break;
            }
        }
        return c;
    }




}
