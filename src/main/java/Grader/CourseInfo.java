/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grader;


/**
 *
 * @author Amazon KDP
 */

class CourseInfo {
    private String name;
    private String code;
    private int unit;
    private int score;

    public CourseInfo(String name, String code, int unit, int score) {
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getUnit() {
        return unit;
    }

    public int getScore() {
        return score;
    }

    public int getGradePoint() {
        if (score >= 70 && score <= 100) return 5;
        else if (score >= 60 && score <= 69) return 4;
        else if (score >= 50 && score <= 59) return 3;
        else if (score >= 45 && score <= 49) return 2;
        else if (score >= 40 && score <= 44) return 1;
        else return 0; // Fail
    }

    public String getGrade() {
        if (score >= 70 && score <= 100) return "A";
        else if (score >= 60 && score <= 69) return "B";
        else if (score >= 50 && score <= 59) return "C";
        else if (score >= 45 && score <= 49) return "D";
        else if (score >= 40 && score <= 44) return "E";
        else return "F"; // Fail
    }

    // public int getGradeUnit() {
    //     return getGradePoint(); // Grade Unit is the same as Grade Point in this example
    // }
}

/**
 *
 * @author Amazon KDP
 */
