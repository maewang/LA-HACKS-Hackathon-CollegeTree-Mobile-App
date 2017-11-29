package hack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tree extends JFrame {
	
	
	private static JLabel description = new JLabel();
	private static JLabel legendlbl;
	private static ImageIcon legend;
	public static JPanel content = new JPanel();
    private static JFrame frame = new JFrame();
    private static int choiceNum;
	public static ArrayList<button> buttonList  = new ArrayList<button>();

//if (choice == "computr science")
	 //String[] subClassList = {"but1", "but2", "but3","but4", "but5", "but6", "but7", "but8", "but9","but1", "but2", "but3"};
	
	 private static String[] CSMajorReq = {"CS31","CS32","CS33","CS35L","CS111","CS118", "CS133", "CS136", "CS143", "CS144", "Math61", "CS180", "CS181" };
	 static String[] CSMajorDescription = {"Object-oriented software development. Abstract data type definition and use. Overloading, inheritance, polymorphism. Object-oriented view of data structures: stacks, queues, lists. Algorithm analysis. Trees, graphs, and associated algorithms. Searching and sorting. Case studies and exercises from computer science applications. Letter grading.",
"Introductory course on computer architecture, assembly language, and operating systems fundamentals. Number systems, machine language, and assembly language. Procedure calls, stacks, interrupts, and traps. Assemblers, linkers, and loaders. Operating systems concepts: processes and process management, input/output (I/O) programming, memory management, file systems. Letter grading.","Lecture, four hours; discussion, two hours; outside study, nine hours. Enforced requisite: course 32. Introductory course on computer architecture, assembly language, and operating systems fundamentals. Number systems, machine language, and assembly language. Procedure calls, stacks, interrupts, and traps. Assemblers, linkers, and loaders. Operating systems concepts: processes and process management, input/output (I/O) programming, memory management, file systems. Letter grading.","Lecture, four hours; laboratory, two hours; outside study, nine hours. Enforced requisites: courses 32, 33, 35L. Introduction to operating systems design and evaluation. Computer software systems performance, robustness, and functionality. Kernel structure, bootstrapping, input/output (I/O) devices and interrupts. Processes and threads; address spaces, memory management, and virtual memory. Scheduling, synchronization. File systems: layout, performance, robustness. Distributed systems: networking, remote procedure call (RPC), asynchronous RPC, distributed file systems, transactions. Protection and security. Exercises involving applications using, and internals of, real-world operating systems. Letter grading.","Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisites: courses 111 (may be taken concurrently), 131. Distributed memory and shared memory parallel architectures; asynchronous parallel languages: MPI, Maisie; primitives for parallel computation: specification of parallelism, interprocess communication and synchronization; design of parallel programs for scientific computation and distributed systems. Letter grading.","Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisite: course 111. Designed for juniors/seniors. Introduction to design and performance evaluation of computer networks, including such topics as what protocols are, layered network architecture, Internet protocol architecture, network applications, transport protocols, routing algorithms and protocols, internetworking, congestion control, and link layer protocols including Ethernet and wireless channels. Letter grading.", "Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisites: courses 111 (may be taken concurrently), 131. Distributed memory and shared memory parallel architectures; asynchronous parallel languages: MPI, Maisie; primitives for parallel computation: specification of parallelism, interprocess communication and synchronization; design of parallel programs for scientific computation and distributed systems. Letter grading.", "Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisite: course 118. Introduction to basic concepts of information security necessary for students to understand risks and mitigations associated with protection of systems and data. Topics include security models and architectures, security threats and risk analysis, access control and authentication/authorization, cryptography, network security, secure application design, and ethics and law. Letter grading.","Lecture, four hours; laboratory, two hours; outside study, six hours. Enforced requisite: course 111. Information systems and database systems in enterprises. File organization and secondary storage structures. Relational model and relational database systems. Network, hierarchical, and other models. Query languages. Database design principles. Transactions, concurrency, and recovery. Integrity and authorization. Letter grading.","Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisite: course 143. Important concepts and theory for building effective and safe Web applications and first-hand experience with basic tools. Topics include basic Web architecture and protocol, XML and XML query language, mapping between XML and relational models, information retrieval model and theory, security and user model, Web services and distributed transactions. Letter grading.", "Lecture, three hours; discussion, one hour. Requisites: courses 31A, 31B. Not open for credit to students with credit for course 180 or 184. Discrete structures commonly used in computer science and mathematics, including sets and relations, permutations and combinations, graphs and trees, induction. P/NP or letter grading.", "Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisites: course 32, Mathematics 61. Designed for junior/senior Computer Science majors. Introduction to design and analysis of algorithms. Design techniques: divide-and-conquer, greedy method, dynamic programming; selection of prototypical algorithms; choice of data structures and representations; complexity measures: time, space, upper, lower bounds, asymptotic complexity; NP-completeness. Letter grading.", "Lecture, four hours; discussion, two hours; outside study, six hours. Enforced requisite: course 180. Designed for junior/senior Computer Science majors. Grammars, automata, and languages. Finite-state languages and finite-state automata. Context-free languages and pushdown story automata. Unrestricted rewriting systems, recursively enumerable and recursive languages, and Turing machines. Closure properties, pumping lemmas, and decision algorithms. Introduction to computability. Letter grading."};
	 String[] prereqArray = {"", "CS31", "CS32", "CS32", "CS33,CS35L", "CS111", "CS111,CS131", "CS118", "CS111", "CS143", "", "CS32,Math61", "CS180" };
	 
	 private static String[] MathMajorReq = {"Math31A","Math31B","Math32A","Math32B","Math33A","Math33B", "Math100", "Math101", "Math103A" };
	 static String[] MathMajorDescription = {"Lecture, three hours; discussion, one hour. Preparation: at least three and one half years of high school mathematics (including some coordinate geometry and trigonometry). Requisite: successful completion of Mathematics Diagnostic Test or course 1 with grade of C- or better. Differential calculus and applications; introduction to integration. P/NP or letter grading.",
			 "Lecture, three hours; discussion, one hour. Requisite: course 31A with grade of C- or better. Not open for credit to students with credit for course 3B. Transcendental functions; methods and applications of integration; sequences and series. P/NP or letter grading.",
			 "Lecture, three hours; discussion, one hour. Enforced requisite: course 31A with grade of C- or better. Introduction to differential calculus of several variables, vector field theory. P/NP or letter grading.",
			 "Lecture, three hours; discussion, one hour. Enforced requisites: courses 31B and 32A, with grades of C- or better. Introduction to integral calculus of several variables, line and surface integrals. P/NP or letter grading.",
			 "Lecture, three hours; discussion, one hour. Enforced requisite: course 3B or 31B or 32A with grade of C- or better. Introduction to linear algebra: systems of linear equations, matrix algebra, linear independence, subspaces, bases and dimension, orthogonality, least-squares methods, determinants, eigenvalues and eigenvectors, matrix diagonalization, and symmetric matrices. P/NP or letter grading.",
			 "Lecture, three hours; discussion, one hour. Enforced requisite: course 31B with grade of C- or better. Highly recommended: course 33A. First-order, linear differential equations; second-order, linear differential equations with constant coefficients; power series solutions; linear systems. P/NP or letter grading.",
			 "Lecture, three hours. Requisite: course 31A with grade of C- or better. Problem-solving techniques and mathematical topics useful as preparation for Putnam Examination and similar competitions. Continued fractions, inequalities, modular arithmetic, closed form evaluation of sums and products, problems in geometry, rational functions and polynomials, other nonroutine problems. Participants expected to take Putnam Examination. P/NP grading.",
			 "Lecture, three hours. Requisite: course 100 or significant experience with mathematical competitions. Enrollment based on one selection test or past Putnam results. Advanced problem solving techniques and mathematical topics useful as preparation for Putnam competition. Problems in abstract algebra, linear algebra, number theory, combinatorics, probability, real and complex analysis, differential, equations, Fourier analysis. Regular practice tests given, similar in difficulty to Putnam competition. May be repeated for maximum of 12 units. P/NP or letter grading.",
			 "Seminar, one hour; fieldwork (classroom observation and participation), two hours. Requisites: courses 31A, 31B, 32A, 33A, 33B. Course 103A is enforced requisite to 103B, which is enforced requisite to 103C. Observation, participation, or tutoring in mathematics classes at middle school and secondary levels. May be repeated for credit. P/NP (undergraduates) or S/U (graduates) grading."};
	 String[] MathprereqArray = {"", "Math31A", "Math31A", "Math31B,Math32A", "Math31B,Math32A", "Math31B,Math32A", "Math31A", "Math100", "Math31A,Math31B,Math32A,Math32B,Math33B" };
	 
	 private static String[] FOODMajorReq = {"FOOD ST27", "FOOD ST187", "FOOD ST195CE", "FOOD ST197","FOOD ST199"};
	 static String[] FOODDescription = {"Lecture, four hours. Development of process of further thinking about stories behind conclusions from nutrition studies and food scientific literature. Exercises, discussions, reports, and readings designed to provide practices to become critical thinker in food science and literature. P/NP or letter grading.","Lecture, three hours. Variable topics in one area within food studies. May be repeated for credit with topic and/or instructor change. P/NP or letter grading.","Tutorial, to be arranged; fieldwork, eight to 10 hours. Limited to juniors/seniors. Internship in corporate, governmental, or nonprofit setting coordinated through Center for Community Learning (CCL). Students complete weekly written assignments, attend biweekly meetings with graduate student coordinator, and write final research paper. ","Tutorial, to be arranged. Limited to juniors/seniors. Individual intensive study, with scheduled meetings between faculty member and student. Assigned reading and tangible evidence of mastery of subject matter required. May be repeated for credit. Individual contract required. P/NP or letter grading.","Tutorial, to be arranged. Limited to juniors/seniors. Supervised individual research projects in food studies under guidance of faculty mentor. Culminating paper required. May be repeated for credit."};
	 String[] FOODprereqArray = {"","","FOOD ST27","",""};
	 
	 //Functions
	 
 public Tree(String choice){
	 
	 if (choice == "Computer science"){
		 this.choiceNum = 1;
		 for (int i = 0; i < CSMajorReq.length; i++){
				button a = new button(CSMajorReq[i], prereqArray[i], CSMajorDescription[i], i );	
			    buttonList.add(a);
		 }		 
	 }else if(choice == "Math") {
		 this.choiceNum = 2;
		 for (int i = 0; i < MathMajorReq.length; i++){
				button a = new button(MathMajorReq[i], MathprereqArray[i], MathMajorDescription[i], i );	
			    buttonList.add(a);
		 }	
	 }else if (choice == "Food Sciences") {
		 this.choiceNum = 3;
		 for (int i = 0; i < FOODMajorReq.length; i++){
				button a = new button(FOODMajorReq[i], FOODprereqArray[i], FOODDescription[i], i );	
			    buttonList.add(a);
		 }	
	 }
	 
	 

	 		setContentPane(content);
			content.setLayout(null);
			Description_setup();
			
			
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    this.getContentPane().setBackground(Color.white);
	    this.setIconImage(new ImageIcon("images/icon.png").getImage());
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("College Tree");
	   
	    
	    this.setVisible(true);
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    Tree.print_tree();

		 		

	 } 
	 
	 public static button getButtonJnode(String name){
		 for (int i = 0; i < buttonList.size(); i++){
			 if (buttonList.get(i).getName().toString().equals(name)){
				 System.out.println(name);
				 return buttonList.get(i);
			 }
		 }
		 return null;
	 }
	 
	 
	 public static void clearAllColors() {
		 for (int i = 0; i < buttonList.size(); i++){
			 buttonList.get(i).getButton().setBackground(Color.white);
		 }
	 }
	 
	 public static String getCourseDesc(int x){
		 if (choiceNum == 1) {
			 return CSMajorDescription[x];
		 }
		 else if (choiceNum == 2) {
			 return MathMajorDescription[x];
		 }
		 else if (choiceNum == 3) {
			 return FOODDescription[x];
		 }
		 return null;
	 }
	 
	 public static JLabel getJLabel(){
		 return description;
	 }
	 
	
		 
	private void Description_setup() {
		Dimension getBounds = Toolkit.getDefaultToolkit().getScreenSize(); 
		int maxWidth = (int) getBounds.getWidth();
		int maxHeight = (int) getBounds.getHeight();
		description.setBounds(0,3*(maxHeight/5),maxWidth,2*(maxHeight/5));
		this.add(description);
		//description.setText("Click on the button on the corresponding class to see a description");
		//description.setText("<html>text 1<br>text 2<br>text 3</html>");
	} 
	

	
	public static void print_tree() {
		Dimension getBounds = Toolkit.getDefaultToolkit().getScreenSize(); 
		int maxWidth = (int) getBounds.getWidth();
		int maxHeight = (int) getBounds.getHeight();
		System.out.println(maxWidth);
		int xoffset = maxWidth/5;
		int yoffset = maxHeight/5;
		int x,y;
		x = 0; 
		y = 0;
		for (int i = 0; i < buttonList.size(); i++) {
			if(x - 100 > maxWidth){
				x = 0;
				y += yoffset;
				//y coordinates must be moved by about 300, and positionCenter = 0
			}
			buttonList.get(i).jbutton.setLocation(x,y);
			content.add(buttonList.get(i).jbutton);
			x += xoffset;
		}
		legendset();
			
	
	    /*for (int i = 0; i < buttonList.size(); i++) {
	    	
	    	
		    buttonList.get(i).jbutton.setLocation(i*300,300);
		    content.add(buttonList.get(i).jbutton);
	    }*/
	
	}
	private static void legendset() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		legendlbl = new JLabel();
		legend = new ImageIcon("images/legend.png");
		legendlbl.setBounds(width-300,height-3*(height/5),300,200);
		//legendlbl.setBounds(0,0,300,200);
		legendlbl.setIcon(legend);
		content.add(legendlbl);
		
	}
	 
	
/*
	private void Titleset() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		this.Title = new JLabel();
		this.image = new ImageIcon("images/Title.jpg");
		this.Title.setBounds(width/2-150,10,334,64);
		this.Title.setIcon(image);
		this.add(Title);
	}*/

	
	
}




