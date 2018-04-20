package JPMC_Interview;

/**
 * Created by krishnasfamily on 30/07/16.
 */
class StudentResult implements Comparable<StudentResult> {
    //Integer is imp will be useful in comparing
    private Integer rank;
    private String name;
    private Integer marksInMaths;
    private Integer marksInScince;
    private Integer totalMarks;

// all getter and setter methods are not required to write simply you can say // getters and setters for above

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarksInMaths() {
        return marksInMaths;
    }

    public void setMarksInMaths(Integer marksInMaths) {
        this.marksInMaths = marksInMaths;
    }

    public Integer getMarksInScince() {
        return marksInScince;
    }

    public void setMarksInScince(Integer marksInScince) {
        this.marksInScince = marksInScince;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public int compareTo(StudentResult sr) {
        return this.rank.compareTo(sr.getRank());
    }

}
