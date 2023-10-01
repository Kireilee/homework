import java.util.ArrayList;
import java.util.Scanner;

//定义影城类
public class Cinema {
    //定义放映厅类
    public static class Hall {
        //定义座位类
        public static class Seat {
            //座位号
            private int seatNo;
            //座位状态，0表示空闲，1表示占用
            private int status;
            //构造方法
            public Seat(int seatNo, int status) {
                this.seatNo = seatNo;
                this.status = status;
            }
            //获取和设置座位号的方法
            public int getSeatNo() {
                return seatNo;
            }
            public void setSeatNo(int seatNo) {
                this.seatNo = seatNo;
            }
            //获取和设置座位状态的方法
            public int getStatus() {
                return status;
            }
            public void setStatus(int status) {
                this.status = status;
            }
        }
        //放映厅编号
        private int hallNo;
        //放映厅座位数
        private int seatNum;
        //放映厅座位数组
        private Seat[][] seats;
        //构造方法
        public Hall(int hallNo, int row, int col) {
            this.hallNo = hallNo;
            this.seatNum = row * col;
            this.seats = new Seat[row][col];
            //初始化座位数组，所有座位都为空闲
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    seats[i][j] = new Seat(i * col + j + 1, 0);
                }
            }
        }
        //获取和设置放映厅编号的方法
        public int getHallNo() {
            return hallNo;
        }
        public void setHallNo(int hallNo) {
            this.hallNo = hallNo;
        }
        //获取和设置放映厅座位数的方法
        public int getSeatNum() {
            return seatNum;
        }
        public void setSeatNum(int seatNum) {
            this.seatNum = seatNum;
        }
        //获取和设置放映厅座位数组的方法
        public Seat[][] getSeats() {
            return seats;
        }
        public void setSeats(Seat[][] seats) {
            this.seats = seats;
        }
    }

    //定义影片类
    public static class Movie {
        //片名
        private String title;
        //导演
        private String director;
        //主演
        private String[] actors;
        //类型
        private String genre;
        //剧情简介
        private String summary;
        //时长（分钟）
        private int duration;
        //构造方法
        public Movie(String title, String director, String[] actors, String genre, String summary, int duration) {
            this.title = title;
            this.director = director;
            this.actors = actors;
            this.genre = genre;
            this.summary = summary;
            this.duration = duration;
        }
        //获取和设置片名的方法
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        //获取和设置导演的方法
        public String getDirector() {
            return director;
        }
        public void setDirector(String director) {
            this.director = director;
        }
        //获取和设置主演的方法
        public String[] getActors() {
            return actors;
        }
        public void setActors(String[] actors) {
            this.actors = actors;
        }
        //获取和设置类型的方法
        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        //获取和设置剧情简介的方法
        public String getSummary() {
            return summary;
        }
        public void setSummary(String summary) {
            this.summary = summary;
        }
        //获取和设置时长的方法
        public int getDuration() {
            return duration;
        }
        public void setDuration(int duration) {
            this.duration = duration;
        }

    }

    //定义场次类
    public static class Session {
        //场次编号
        private int sessionNo;
        //放映厅
        private Hall hall;
        //影片
        private Movie movie;
        //开始时间（小时）
        private int startTime;
        //结束时间（小时）
        private int endTime;
        //价格
        private double price;
        //构造方法
        public Session(int sessionNo, Hall hall, Movie movie, int startTime, int endTime, double price) {
            this.sessionNo = sessionNo;
            this.hall = hall;
            this.movie = movie;
            this.startTime = startTime;
            this.endTime = endTime;
            this.price = price;
        }
        //获取和设置场次编号的方法
        public int getSessionNo() {
            return sessionNo;
        }
        public void setSessionNo(int sessionNo) {
            this.sessionNo = sessionNo;
        }
        //获取和设置放映厅的方法
        public Hall getHall() {
            return hall;
        }
        public void setHall(Hall hall) {
            this.hall = hall;
        }
        //获取和设置影片的方法
        public Movie getMovie() {
            return movie;
        }
        public void setMovie(Movie movie) {
            this.movie = movie;
        }
        //获取和设置开始时间的方法
        public int getStartTime() {
            return startTime;
        }
        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }
        //获取和设置结束时间的方法
        public int getEndTime() {
            return endTime;
        }
        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
        //获取和设置价格的方法
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

    }

    //定义用户类
    public static class User {
        //用户ID
        private int userId;
        //用户名
        private String userName;
        //密码
        private String password;
        //用户级别（金牌、银牌、铜牌）
        private String level;
        //用户注册时间
        private String registerTime;
        //用户累计消费总金额
        private double totalAmount;
        //用户累计消费次数
        private int totalTimes;
        //用户手机号
        private String phoneNum;
        //用户邮箱
        private String email;

        public void setPassword(String password) {
            this.password = password;
        }

        public int getUserId() {
            return userId;
        }

        public String getUserName() {
            return userName;
        }
    }

    //定义电影票类
    public static class Ticket {
        //电影票ID编号
        private String ticketId;
        //场次信息
        private Session session;
        //座位信息
        private Hall.Seat seat;
        //用户信息
        private User user;
        //票价（根据用户级别打折）
        private double price;
        //取票状态，0表示未取，1表示已取
        private int status;

//构造方法

//省略

//获取和设置各个属性的方法

//省略

    }

    //定义管理员类，继承自用户类，增加管理员特有的功能

//定义一个管理员类，继承自用户类

    public static class Admin extends User {

//定义一个构造方法，用于创建管理员对象

        public Admin() {

            super(); //调用父类的构造方法
        }

//定义一个方法，用于重置指定用户的密码

        public void resetPassword(User user) {

            user.setPassword("123456"); //将用户的密码重置为123456

            System.out.println("已重置用户" + user.getUserName() + "的密码为123456");

        }

//定义一个方法，用于列出所有用户信息

        public void listAllUsers(ArrayList<User> users) {

            System.out.println("以下是所有用户的信息：");

            for (User user : users) { //遍历用户列表，打印每个用户的信息

                System.out.println(user);

            }

        }

//定义一个方法，用于删除用户信息

        public void deleteUser(ArrayList<User> users, int userId) {

            boolean found = false; //标记是否找到匹配的用户

            for (User user : users) { //遍历用户列表，根据用户ID进行匹配

                if (user.getUserId() == userId) {

                    found = true; //找到匹配的用户，设置标记为真

                    users.remove(user); //从用户列表中移除该用户

                    System.out.println("已删除用户" + user.getUserName() + "的信息");

                    break;

                }

            }

            if (!found) { //没有找到匹配的用户，提示用户

                System.out.println("没有找到用户ID为" + userId + "的用户，请检查输入是否正确");

            }

        }

//定义一个方法，用于查询用户信息

        public void queryUser(ArrayList<User> users, String keyword) {

            boolean found = false; //标记是否找到匹配的用户

            for (User user : users) { //遍历用户列表，根据用户ID或用户名进行匹配

                if (user.getUserId() == Integer.parseInt(keyword) || user.getUserName().equals(keyword)) {

                    found = true; //找到匹配的用户，设置标记为真

                    System.out.println("以下是用户" + user.getUserName() + "的信息：");

                    System.out.println(user); //打印该用户的信息

                    break;

                }

            }

            if (!found) { //没有找到匹配的用户，提示用户

                System.out.println("没有找到用户ID或用户名为" + keyword + "的用户，请检查输入是否正确");

            }

        }


    }
    //定义经理类，继承自用户类，增加经理特有的功能
    public static class Manager extends User {

//构造方法

//省略

//列出所有正在上映影片的信息的方法

        public void listAllMovies(ArrayList<Movie> movies) {

            System.out.println("以下是所有正在上映影片的信息：");

            for (Movie movie : movies) {

//遍历影片列表，打印每个影片的信息

                System.out.println("片名：" + movie.getTitle());

                System.out.println("导演：" + movie.getDirector());

                System.out.print("主演：");

                for (String actor : movie.getActors()) {

//遍历主演数组，打印每个主演的名字

                    System.out.print(actor + " ");

                }

                System.out.println();

                System.out.println("类型：" + movie.getGenre());

                System.out.println("剧情简介：" + movie.getSummary());

                System.out.println("时长（分钟）：" + movie.getDuration());

                System.out.println("------------------------");

            }

        }

//添加即将上映的影片的信息的方法

        public void addMovie(ArrayList<Movie> movies, String title, String director, String[] actors, String genre, String summary, int duration) {

            Movie movie = new Movie(title, director, actors, genre, summary, duration);

//创建一个新的影片对象

            movies.add(movie);

//将影片对象添加到影片列表中

            System.out.println("已添加影片" + title + "的信息");

        }

//修改已经/即将上映影片的信息的方法

        public void modifyMovie(ArrayList<Movie> movies, String title, String director, String[] actors, String genre, String summary, int duration) {

            boolean found = false;

//标记是否找到匹配的影片

            for (Movie movie : movies) {

//遍历影片列表，根据片名进行匹配

                if (movie.getTitle().equals(title)) {

                    found = true;

//找到匹配的影片，修改其信息

                    movie.setDirector(director);

                    movie.setActors(actors);

                    movie.setGenre(genre);

                    movie.setSummary(summary);

                    movie.setDuration(duration);

                    System.out.println("已修改影片" + title + "的信息");

                    break;

                }

            }

            if (!found) {

//没有找到匹配的影片，提示用户

                System.out.println("没有找到影片" + title + "的信息，请检查输入是否正确");

            }

        }

//删除影片的信息的方法

        public void deleteMovie(ArrayList<Movie> movies, String title) {

            System.out.println("您确定要删除影片" + title + "的信息吗？（Y/N）");

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Y")) {

//如果输入Y，表示确认删除

                for (int i = 0; i < movies.size(); i++) {

//遍历影片列表，找到匹配的片名

                    if (movies.get(i).getTitle().equals(title)) {

                        movies.remove(i);

//从列表中删除该影片

                        System.out.println("已删除影片" + title + "的信息");

                        break;

                    }

                }

            } else {

                System.out.println("取消删除操作");

            }

        }

//增加场次的方法

        public void addSession(ArrayList<Session> sessions, int sessionNo, Hall hall, Movie movie, int startTime, int endTime, double price) {

            Session session = new Session(sessionNo, hall, movie, startTime, endTime, price);

//创建一个新的场次对象

            sessions.add(session);

//将场次对象添加到场次列表中

            System.out.println("已添加场次" + sessionNo + "的信息");

        }

//修改场次的方法

        public void modifySession(ArrayList<Session> sessions, int sessionNo, Hall hall, Movie movie, int startTime, int endTime, double price) {

            boolean found = false;

//标记是否找到匹配的场次

            for (Session session : sessions) {

//遍历场次列表，根据场次编号进行匹配

                if (session.getSessionNo() == sessionNo) {

                    found = true;

//找到匹配的场次，修改其信息

                    session.setHall(hall);

                    session.setMovie(movie);

                    session.setStartTime(startTime);

                    session.setEndTime(endTime);

                    session.setPrice(price);

                    System.out.println("已修改场次" + sessionNo + "的信息");

                    break;

                }

            }

            if (!found) {

//没有找到匹配的场次，提示用户

                System.out.println("没有找到场次" + sessionNo + "的信息，请检查输入是否正确");

            }

        }

//删除场次的方法

        public void deleteSession(ArrayList<Session> sessions, int sessionNo) {

            System.out.println("您确定要删除场次" + sessionNo + "的信息吗？（Y/N）");

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Y")) {

//如果输入Y，表示确认删除

                for (int i = 0; i < sessions.size(); i++) {

//遍历场次列表，找到匹配的场次编号

                    if (sessions.get(i).getSessionNo() == sessionNo) {

                        sessions.remove(i);

//从列表中删除该场次

                        System.out.println("已删除场次" + sessionNo + "的信息");

                        break;

                    }

                }

            } else {

                System.out.println("取消删除操作");

            }

        }

//列出所有场次信息的方法

        public void listAllSessions(ArrayList<Session> sessions) {

            System.out.println("以下是所有场次的信息：");

            for (Session session : sessions) {

//遍历场次列表，打印每个场次的信息

                System.out.println("场次编号：" + session.getSessionNo());

                System.out.println("放映厅编号：" + session.getHall().getHallNo());

                System.out.println("影片名称：" + session.getMovie().getTitle());

                System.out.println("开始时间（小时）：" + session.getStartTime());

                System.out.println("结束时间（小时）：" + session.getEndTime());

                System.out.println("价格（元）：" + session.getPrice());

                System.out.println("------------------------");

            }

        }

    }

    //定义前台类，继承自用户类，增加前台特有的功能
    //定义一个前台类，继承自用户类

    public static class Receptionist extends User {

//定义一个构造方法，用于创建前台对象

        public Receptionist() {

            super(); //调用父类的构造方法

        }

//定义一个方法，用于列出所有正在上映影片的信息

        public void listAllMovies(ArrayList<Movie> movies) {

            System.out.println("以下是所有正在上映影片的信息：");

            for (Movie movie : movies) { //遍历影片列表，打印每个影片的信息

                System.out.println(movie);

            }

        }

//定义一个方法，用于列出所有影片的场次信息

        public void listAllSessions(ArrayList<Session> sessions) {

            System.out.println("以下是所有影片的场次信息：");

            for (Session session : sessions) { //遍历场次列表，打印每个场次的信息

                System.out.println(session);

            }

        }

//定义一个方法，用于列出指定电影和场次信息

        public void listSessionByMovie(ArrayList<Session> sessions, String title) {

            boolean found = false; //标记是否找到匹配的电影

            for (Session session : sessions) { //遍历场次列表，根据电影名称进行匹配

                if (session.getMovie().getTitle().equals(title)) {

                    found = true; //找到匹配的电影，设置标记为真

                    System.out.println("以下是电影" + title + "的场次信息：");

                    System.out.println(session); //打印该场次的信息

                    break;

                }

            }

            if (!found) { //没有找到匹配的电影，提示用户

                System.out.println("没有找到电影名称为" + title + "的电影，请检查输入是否正确");

            }

        }

//定义一个方法，用于售票功能

        public void sellTicket(ArrayList<Ticket> tickets, ArrayList<Session> sessions, String title, int sessionNo, String userName, double payment) {

            Session session = null; //创建一个场次对象，用于存储匹配的场次信息

            for (Session s : sessions) { //遍历场次列表，根据电影名称和场次编号进行匹配

                if (s.getMovie().getTitle().equals(title) && s.getSessionNo() == sessionNo) {

                    session = s; //找到匹配的场次，赋值给场次对象

                    break;

                }

            }

            if (session != null) { //如果找到匹配的场次，继续执行售票功能

                if (payment >= session.getPrice()) { //如果支付金额大于或等于票价

                    Ticket ticket = new Ticket(); //创建一个电影票对象

                    tickets.add(ticket); //将电影票对象添加到电影票列表中

                    System.out.println("售票成功，以下是您的电影票信息：");

                    System.out.println(ticket); //打印电影票的信息

                    System.out.println("请牢记您的电子ID编号，并在观影前取票");

                    System.out.println("您的找零为" + (payment - session.getPrice()) + "元"); //计算并打印找零金额

                } else { //如果支付金额小于票价

                    System.out.println("售票失败，您的支付金额不足");

                }

            } else { //如果没有找到匹配的场次，提示用户

                System.out.println("没有找到电影名称为" + title + "且场次编号为" + sessionNo + "的场次，请检查输入是否正确");

            }

        }

    }

//定义一个静态方法，用于启动影城管理系统

    public static void startSystem() {

        initData(); //调用初始化数据的方法

        showMenu(); //调用显示菜单的方法

        Scanner sc = new Scanner(System.in); //创建扫描器对象，用于接收用户输入

        int input = sc.nextInt(); //接收用户输入的整数，表示身份选择

        User user = null; //创建一个用户对象，用于存储登录成功的用户信息

        while (input != 0) { //如果用户输入不为0，表示还要继续使用系统

            user = login(input); //调用登录验证的方法，返回一个用户对象

            if (user != null) { //如果用户对象不为空，表示登录成功

                switch (input) { //根据用户选择的身份进行分支处理

                    case 1: //如果用户选择的身份是管理员

                        showAdminMenu(); //调用显示管理员菜单的方法

                        doAdminAction((Admin) user); //调用执行管理员操作的方法，将用户对象强制转换为管理员类的实例

                        break;

                    case 2: //如果用户选择的身份是经理

                        showManagerMenu(); //调用显示经理菜单的方法

                        doManagerAction((Manager) user); //调用执行经理操作的方法，将用户对象强制转换为经理类的实例

                        break;

                    case 3: //如果用户选择的身份是前台

                        showReceptionistMenu(); //调用显示前台菜单的方法

                        doReceptionistAction((Receptionist) user); //调用执行前台操作的方法，将用户对象强制转换为前台类的实例

                        break;

                    case 4: //如果用户选择的身份是普通用户

                        showUserMenu(); //调用显示用户菜单的方法

                        doUserAction(user); //调用执行用户操作的方法，无需转换类型

                        break;

                    default:

                        System.out.println("无效的身份选择，请重新输入");

                        break;

                }

            }

            showMenu(); //再次调用显示菜单的方法

            input = sc.nextInt(); //接收用户输入的下一个整数，表示身份选择

        }

        System.out.println("感谢您使用影城管理系统，再见！");

//如果用户输入为0，表示要退出系统，打印结束语句

    }
    public static void main(String[] args) {

        startSystem(); //调用启动影城管理系统的方法

    }
}