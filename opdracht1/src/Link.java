public class Link {

    private Link next;
    private Student student;
    private int size;
    private boolean last;

    public Link(Student _student, int size) {
        student = _student;
        size++;
        this.size = size;
        last = true;
    }

    public void push(Student addMe) {

        if (last) {
            this.last = false;
            next = new Link(addMe, size);
        } else {
            next.push(addMe);
        }

    }

    public Student pop() {

        Student returnStudent = null;


        if (last) {
            if (student != null) {
                student.setNextPop(true);
                returnStudent = student;
            } else {
                returnStudent = null;
            }
        } else {
            Student popStudent = next.pop();
            if (popStudent.isNextPop()) {
                popStudent.setNextPop(false);
                this.next = null;
                last = true;
                returnStudent = popStudent;
            } else {
                returnStudent = popStudent;
            }

        }
        return returnStudent;
    }

    public void printWomen() {
        if(student != null){
        if (student.getGeslacht().equals( "v") || student.getGeslacht().equals( "V")) {
            student.printStudent();
        }}
        if (!last) {
            next.printWomen();
        }
        else{
            System.out.println("Alle stuenten geprint");
        }
    }

    public void printMan() {
        if (student != null) {
            if (student.getGeslacht().equals("m") || student.getGeslacht().equals( "M")) {
                student.printStudent();
            }
        }
        if (!last) {
            next.printMan();
        }
        if (last){
            System.out.println("Alle studenten geprint");
        }
    }

    public void printStack() {
        if (student != null) {
            student.printStudent();
        }
        if (!last) {
            next.printStack();
        }
        else{
            System.out.println("Alle studenten geprint.");
        }
    }

    public boolean peek(Student s) {
        if (student == null) {
            if (last) {
                return false;
            } else {
                return next.peek(s);
            }

        } else {
            if (s.getStudentnummer() == student.getStudentnummer()) {
                return true;
            } else if (last) {
                return false;
            } else {
                return next.peek(s);
            }
        }
    }

    public int getSize() {
        if (last) {
            return size-1;
        } else {
            return next.getSize();
        }
    }

    public Student start() {
        if (student != null) {
            return student;
        }
        return next.start();
    }

}
