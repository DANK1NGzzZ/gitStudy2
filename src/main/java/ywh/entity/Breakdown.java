package ywh.entity;

import lombok.Data;

@Data
public class Breakdown {
    private String breakdownId;         //主键id
    private String breakdownTitle;      //故障标题
    private String classRoom;           //故障教室
    private String breakdownContent;    //故障内容
    private String breakdownState;      //故障状态
    private String createBy;            //创建人
    private String createTime;          //创建时间
    private String solveBy;             //解决人
    private String solveTime;           //解决时间
    private String createName;          //创建人姓名
    private String solveName;           //解决人姓名

    public String getBreakdownId() {
        return breakdownId;
    }

    public void setBreakdownId(String breakdownId) {
        this.breakdownId = breakdownId;
    }

    public String getBreakdownTitle() {
        return breakdownTitle;
    }

    public void setBreakdownTitle(String breakdownTitle) {
        this.breakdownTitle = breakdownTitle;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getBreakdownContent() {
        return breakdownContent;
    }

    public void setBreakdownContent(String breakdownContent) {
        this.breakdownContent = breakdownContent;
    }

    public String getBreakdownState() {
        return breakdownState;
    }

    public void setBreakdownState(String breakdownState) {
        this.breakdownState = breakdownState;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSolveBy() {
        return solveBy;
    }

    public void setSolveBy(String solveBy) {
        this.solveBy = solveBy;
    }

    public String getSolveTime() {
        return solveTime;
    }

    public void setSolveTime(String solveTime) {
        this.solveTime = solveTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getSolveName() {
        return solveName;
    }

    public void setSolveName(String solveName) {
        this.solveName = solveName;
    }

    @Override
    public String toString() {
        return "Breakdown{" +
                "breakdownId='" + breakdownId + '\'' +
                ", breakdownTitle='" + breakdownTitle + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", breakdownContent='" + breakdownContent + '\'' +
                ", breakdownState='" + breakdownState + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", solveBy='" + solveBy + '\'' +
                ", solveTime='" + solveTime + '\'' +
                ", createName='" + createName + '\'' +
                ", solveName='" + solveName + '\'' +
                '}';
    }
}
