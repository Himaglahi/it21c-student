public class oop {
    
    
    public static void main (String [] args){
        Student student = new Student ();
        
        student.name = "Joash S. Rautraut";
        student.section = student.setSection();
        student.motto = student.getmotto();
        
        System.out.println(student.name);
        System.out.println(student.section);
        System.out.println(student.motto);
                
    }
}
