public class CourseDBElement implements Comparable<CourseDBElement> {
	 private int numCredits;
	    private String roomNum;
	    private String instructor;
    private String id;
    private int crn;
   

    /**
     * Default Constructor
     */
    public CourseDBElement() {
        roomNum = "";
        instructor = "";
        id = "";
        crn = 0;
        numCredits = 0;
    }

   
    public CourseDBElement(String id, int crn, int numCredits, String roomNum, String instructor) {
        this.id = id;
        this.crn = crn;
        this.numCredits = numCredits;
        this.roomNum = roomNum;
        this.instructor = instructor;
    }

    @Override
    public int compareTo(CourseDBElement element) {
        return this.crn - element.crn;
    }

   
    public int getCRN() {
        return crn;
    }

    public String getRoomNum() {
        return roomNum;
    }
    

    public String getID() {
        return id;
    }
    
    
    
    public void setCRN(int crn) {
        this.crn = crn;
    }

    
    @Override
    public int hashCode() {
        String str = Integer.toString(crn);
        return str.hashCode();
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CourseDBElement other = (CourseDBElement) obj;
        return crn == other.crn;
    }

   
    @Override
    public String toString() {
        String str = "\nCourse:"
    + id + " CRN:" +
        		crn + " Credits:" + 
    numCredits +
                     " Instructor:" + instructor 
                     + " Room:" + roomNum;
        return str;
    }
}
