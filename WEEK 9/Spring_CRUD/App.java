package in.vjit.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
//import in.vjit.beans.Student;
import in.vjit.mapper.StudentRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.vjit.beans.Student;
import in.vjit.resources.SpringConfigFile;

/**
* Hello world!
*
*/
public class App
{
    public static void main(String[] args)
    {

        @SuppressWarnings("resource")
        ApplicationContext context =
        new AnnotationConfigApplicationContext(SpringConfigFile.class);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        //--------------------------INSERT OPERATION-------------------------
        /*int std_rollno = 103;
        String std_name = "Kiran";
        float std_marks = 89.5f;

        String insert_sql_query = "INSERT INTO STUDENT VALUES(?,?,?)";

        int count = jdbcTemplate.update(insert_sql_query,std_rollno,std_name,std_marks);

        if(count > 0)
        {
            System.out.println("Insertion Success");
        }
        else
        {
            System.out.println("Insertion failed");
        }*/

        //-------------------------UPDATE OPERATION--------------------------
        /*float marks = 99.3f;
        int rollno = 102;

        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";

        int count = jdbcTemplate.update(update_sql_query,marks,rollno);

        if(count > 0)
        {
            System.out.println("Updated Success");
        }
        else
        {
            System.out.println("Not Updated");
        }*/

        //-----------------------DELETE OPERATION------------------------------
        /*int rollno = 102;

        String delete_sql_query = "DELETE FROM student WHERE std_roll=?";

        int count = jdbcTemplate.update(delete_sql_query,rollno);

        if(count > 0)
        {
            System.out.println("deletion success");
        }
        else
        {
            System.out.println("deletion failed");
        }*/

        //--------------------SELECT OPERATION---------------------------------
        String select_sql_query = "SELECT * FROM student";

        List<Student> std_list =
        jdbcTemplate.query(select_sql_query, new StudentRowMapper());

        for(Student std : std_list)
        {
            System.out.println("Rollno :" + std.getRollno());
            System.out.println("Name :" + std.getName());
            System.out.println("Marks :" + std.getMarks());
            System.out.println("-------------------------");
        }

    }

}
