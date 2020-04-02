public class Class1
        public static void main(String[] args) {



            // как добавить mysql jdbc драйвер через maven

        /*

        File=>Project Structure=>Libriaries=>+=>From maven=>

        В строке поиска пишем "mysql*"

        => Выбираем: mysql-connector-8.0.19

        немножко подождать пока загрузится

         */





            Connection conn = null;

            Statement statement = null;

            ResultSet resultSet = null;

            try {



                String url = "jdbc:mysql://0.0.0.0:3306/user5?useUnicode=true&serverTimezone=UTC";

                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(url,"user5","user5");

                System.out.println("Connected...!");

                statement = conn.createStatement();

                resultSet = statement.executeQuery("select * from Gorod");

                while(resultSet.next()) {

                    String column1 = resultSet.getString(2);

                    System.out.println("Column1: "+column1);

                }



            } catch (Exception e) {



            }



        }

}