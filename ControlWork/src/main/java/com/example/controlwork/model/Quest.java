package com.example.controlwork.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quests")
public class Quest {
    @Id
    @Column(name = "questId")
    private Long questId;

    @Column(name = "personId")
    private String personId;

    @Column(name = "questTitle")
    private String questTitle;

    @Column(name = "questText")
    private String questText;

    @Column(name = "reward")
    private Integer reward;

    @Column(name = "penalty")
    private Integer penalty;

    @Column(name = "timeOfStarted")
    private java.sql.Timestamp timeOfStarted;

    @Column(name = "timeForQuestInMinutes")
    private Integer timeForQuestInMinutes;

    @Column(name = "placeId")
    private String placeId;

    @Column(name = "modelId")
    private String modelId;

    @Column(name = "levelDifficulty")
    private Integer levelDifficulty;

    @Column(name = "questStatus")
    private String questStatus;

    // Геттеры и сеттеры
    public Long getQuestId() { return questId; }
    public void setQuestId(Long questId) { this.questId = questId; }
    public String getPersonId() { return personId; }
    public void setPersonId(String personId) { this.personId = personId; }
    public String getQuestTitle() { return questTitle; }
    public void setQuestTitle(String questTitle) { this.questTitle = questTitle; }
    public String getQuestText() { return questText; }
    public void setQuestText(String questText) { this.questText = questText; }
    public Integer getReward() { return reward; }
    public void setReward(Integer reward) { this.reward = reward; }
    public Integer getPenalty() { return penalty; }
    public void setPenalty(Integer penalty) { this.penalty = penalty; }
    public java.sql.Timestamp getTimeOfStarted() { return timeOfStarted; }
    public void setTimeOfStarted(java.sql.Timestamp timeOfStarted) { this.timeOfStarted = timeOfStarted; }
    public Integer getTimeForQuestInMinutes() { return timeForQuestInMinutes; }
    public void setTimeForQuestInMinutes(Integer timeForQuestInMinutes) { this.timeForQuestInMinutes = timeForQuestInMinutes; }
    public String getPlaceId() { return placeId; }
    public void setPlaceId(String placeId) { this.placeId = placeId; }
    public String getModelId() { return modelId; }
    public void setModelId(String modelId) { this.modelId = modelId; }
    public Integer getLevelDifficulty() { return levelDifficulty; }
    public void setLevelDifficulty(Integer levelDifficulty) { this.levelDifficulty = levelDifficulty; }
    public String getQuestStatus() { return questStatus; }
    public void setQuestStatus(String questStatus) { this.questStatus = questStatus; }
}