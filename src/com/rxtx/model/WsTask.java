package com.rxtx.model;

import java.util.Date;

public class WsTask {
    private Integer taskId;

    private String rfId;

    private String carNo;

    private Date waitBeginTime;

    private Date watiEndTime;

    private Integer waitDuration;

    private String waitStationNo;

    private Date repairBeginTime;

    private Date repairEndTime;

    private Integer repairDuration;

    private String repairStationNo;

    private Date washBeginTime;

    private Date washEndTime;

    private Integer washDuration;

    private String washStationNo;

    private String taskStatus;

    private Date taskBeginTime;

    private Date taskEndTime;

    private Integer taskDuration;

    private String taskCsr;

    private String expectedTime;

    private Boolean isDeleted;

    private Date createdAt;

    private Date updatedAt;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getRfId() {
        return rfId;
    }

    public void setRfId(String rfId) {
        this.rfId = rfId == null ? null : rfId.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public Date getWaitBeginTime() {
        return waitBeginTime;
    }

    public void setWaitBeginTime(Date waitBeginTime) {
        this.waitBeginTime = waitBeginTime;
    }

    public Date getWatiEndTime() {
        return watiEndTime;
    }

    public void setWatiEndTime(Date watiEndTime) {
        this.watiEndTime = watiEndTime;
    }

    public Integer getWaitDuration() {
        return waitDuration;
    }

    public void setWaitDuration(Integer waitDuration) {
        this.waitDuration = waitDuration;
    }

    public String getWaitStationNo() {
        return waitStationNo;
    }

    public void setWaitStationNo(String waitStationNo) {
        this.waitStationNo = waitStationNo == null ? null : waitStationNo.trim();
    }

    public Date getRepairBeginTime() {
        return repairBeginTime;
    }

    public void setRepairBeginTime(Date repairBeginTime) {
        this.repairBeginTime = repairBeginTime;
    }

    public Date getRepairEndTime() {
        return repairEndTime;
    }

    public void setRepairEndTime(Date repairEndTime) {
        this.repairEndTime = repairEndTime;
    }

    public Integer getRepairDuration() {
        return repairDuration;
    }

    public void setRepairDuration(Integer repairDuration) {
        this.repairDuration = repairDuration;
    }

    public String getRepairStationNo() {
        return repairStationNo;
    }

    public void setRepairStationNo(String repairStationNo) {
        this.repairStationNo = repairStationNo == null ? null : repairStationNo.trim();
    }

    public Date getWashBeginTime() {
        return washBeginTime;
    }

    public void setWashBeginTime(Date washBeginTime) {
        this.washBeginTime = washBeginTime;
    }

    public Date getWashEndTime() {
        return washEndTime;
    }

    public void setWashEndTime(Date washEndTime) {
        this.washEndTime = washEndTime;
    }

    public Integer getWashDuration() {
        return washDuration;
    }

    public void setWashDuration(Integer washDuration) {
        this.washDuration = washDuration;
    }

    public String getWashStationNo() {
        return washStationNo;
    }

    public void setWashStationNo(String washStationNo) {
        this.washStationNo = washStationNo == null ? null : washStationNo.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public Date getTaskBeginTime() {
        return taskBeginTime;
    }

    public void setTaskBeginTime(Date taskBeginTime) {
        this.taskBeginTime = taskBeginTime;
    }

    public Date getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public Integer getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(Integer taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskCsr() {
        return taskCsr;
    }

    public void setTaskCsr(String taskCsr) {
        this.taskCsr = taskCsr == null ? null : taskCsr.trim();
    }

    public String getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime == null ? null : expectedTime.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}