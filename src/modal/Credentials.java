package modal;

/**
 * It's a class that holds the credentials for the admin and student accounts
 */
public class Credentials
{
  private static String emailAdmin = "admin@gmail.com";
  private static String emailPassword = "123456789";
  private static String studentEmail = "325833@via.dk";
  private static String studentPassword = "123456789";


  /**
   * This function returns the adminEmail variable
   *
   * @return The adminEmail variable is being returned.
   */
  public static String getAdminEmail()
  {
    return emailAdmin;
  }


  /**
   * This function returns the admin password.
   *
   * @return The adminPassword variable is being returned.
   */
  public static String getAdminPassword()
  {
    return emailPassword;
  }



  /**
   * This function returns the student's email
   *
   * @return The studentEmail variable is being returned.
   */
  public static String getStudentEmail()
  {
    return studentEmail;
  }




  /**
   * This function returns the student's password
   *
   * @return The studentPassword variable is being returned.
   */
  public static String getStudentPassword()
  {
    return studentPassword;
  }


}
