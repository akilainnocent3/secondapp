package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.config.tax.TaxConfigs;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class FooterInfo {
    private int FlexiBetCount;
    private String WHTax;
    private int betTotalCount;
    private int betType;
    private BigDecimal bonus;
    private int canBetStatusCount;
    private String exciseTax;
    private CharSequence gift;
    private boolean isBonusActivated;
    private boolean isBonusEnable;
    private boolean isExistBonus;
    private boolean isGiftChecked = false;
    private BigDecimal maxPW;
    private BigDecimal maxScaled;
    private BigDecimal maxStake;
    private BigDecimal minScaled;
    private BigDecimal minStake;
    private BigDecimal multipleMinScaled;
    private String multipleTotalOdds;
    private String multipleTotalOddsForGift;
    private String multipleTotalStake;
    private String potentialWin;
    private BigDecimal ptMax;
    private BigDecimal ptMin;
    private String singleTotalStake;
    private BigDecimal stake;
    private String systemTotalStake;
    private TaxConfigs taxConfigData;

    public int getBetTotalCount() {
        return this.betTotalCount;
    }

    public int getBetType() {
        return this.betType;
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }

    public int getCanBetStatusCount() {
        return this.canBetStatusCount;
    }

    public String getExciseTax() {
        return this.exciseTax;
    }

    public int getFlexiBetCount() {
        return this.FlexiBetCount;
    }

    public CharSequence getGift() {
        return this.gift;
    }

    public BigDecimal getMaxPW() {
        return this.maxPW;
    }

    public BigDecimal getMaxScaled() {
        return this.maxScaled;
    }

    public BigDecimal getMaxStake() {
        return this.maxStake;
    }

    public BigDecimal getMinScaled() {
        return this.minScaled;
    }

    public BigDecimal getMinStake() {
        return this.minStake;
    }

    public BigDecimal getMultipleMinScaled() {
        return this.multipleMinScaled;
    }

    public String getMultipleTotalOdds() {
        return this.multipleTotalOdds;
    }

    public String getMultipleTotalOddsForGift() {
        return this.multipleTotalOddsForGift;
    }

    public String getMultipleTotalStake() {
        return this.multipleTotalStake;
    }

    public String getPotentialWin() {
        return this.potentialWin;
    }

    public BigDecimal getPtMax() {
        return this.ptMax;
    }

    public BigDecimal getPtMin() {
        return this.ptMin;
    }

    public String getSingleTotalStake() {
        return this.singleTotalStake;
    }

    public BigDecimal getStake() {
        return this.stake;
    }

    public String getSystemTotalStake() {
        return this.systemTotalStake;
    }

    public TaxConfigs getTaxConfig() {
        return this.taxConfigData;
    }

    public String getWHTax() {
        return this.WHTax;
    }

    public boolean isBonusActivated() {
        return this.isBonusActivated;
    }

    public boolean isBonusEnable() {
        return this.isBonusEnable;
    }

    public boolean isExistBonus() {
        return this.isExistBonus;
    }

    public boolean isGiftChecked() {
        return this.isGiftChecked;
    }

    public void setBetTotalCount(int i) {
        this.betTotalCount = i;
    }

    public void setBetType(int i) {
        this.betType = i;
    }

    public void setBonus(BigDecimal bigDecimal) {
        this.bonus = bigDecimal;
    }

    public void setBonusActivated(boolean z) {
        this.isBonusActivated = z;
    }

    public void setBonusEnable(boolean z) {
        this.isBonusEnable = z;
    }

    public void setCanBetStatusCount(int i) {
        this.canBetStatusCount = i;
    }

    public void setExciseTax(String str) {
        this.exciseTax = str;
    }

    public void setExistBonus(boolean z) {
        this.isExistBonus = z;
    }

    public void setFlexiBetCount(int i) {
        this.FlexiBetCount = i;
    }

    public void setGift(CharSequence charSequence) {
        this.gift = charSequence;
    }

    public void setGiftChecked(boolean z) {
        this.isGiftChecked = z;
    }

    public void setMaxPW(BigDecimal bigDecimal) {
        this.maxPW = bigDecimal;
    }

    public void setMaxScaled(BigDecimal bigDecimal) {
        this.maxScaled = bigDecimal;
    }

    public void setMaxStake(BigDecimal bigDecimal) {
        this.maxStake = bigDecimal;
    }

    public void setMinScaled(BigDecimal bigDecimal) {
        this.minScaled = bigDecimal;
    }

    public void setMinStake(BigDecimal bigDecimal) {
        this.minStake = bigDecimal;
    }

    public void setMultipleMinScaled(BigDecimal bigDecimal) {
        this.multipleMinScaled = bigDecimal;
    }

    public void setMultipleTotalOdds(String str) {
        this.multipleTotalOdds = str;
    }

    public void setMultipleTotalOddsForGift(String str) {
        this.multipleTotalOddsForGift = str;
    }

    public void setMultipleTotalStake(String str) {
        this.multipleTotalStake = str;
    }

    public void setPotentialWin(String str) {
        this.potentialWin = str;
    }

    public void setPtMax(BigDecimal bigDecimal) {
        this.ptMax = bigDecimal;
    }

    public void setPtMin(BigDecimal bigDecimal) {
        this.ptMin = bigDecimal;
    }

    public void setSingleTotalStake(String str) {
        this.singleTotalStake = str;
    }

    public void setStake(BigDecimal bigDecimal) {
        this.stake = bigDecimal;
    }

    public void setSystemTotalStake(String str) {
        this.systemTotalStake = str;
    }

    public void setTaxConfig(TaxConfigs taxConfigs) {
        this.taxConfigData = taxConfigs;
    }

    public void setWHTax(String str) {
        this.WHTax = str;
    }
}
