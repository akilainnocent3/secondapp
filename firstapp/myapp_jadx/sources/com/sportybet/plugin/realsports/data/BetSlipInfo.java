package com.sportybet.plugin.realsports.data;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class BetSlipInfo {
    private final int betType;
    private boolean canBetOneCut = true;
    private Boolean hasTax;
    private String maxNetWin;
    private BigDecimal maxPW;
    private BigDecimal maxScaled;
    private String maxWHTax;
    private BigDecimal minScaled;
    private BigDecimal net;
    private final String netWin;
    private BigDecimal noRoundTotalOdds;
    private BigDecimal stake;
    private String totalOdds;
    private String totalOddsForGiftDialog;
    private final String whTax;

    public BetSlipInfo(int i, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z) {
        this.betType = i;
        this.netWin = str;
        this.whTax = str2;
        this.maxPW = bigDecimal;
        this.stake = bigDecimal2;
        this.minScaled = bigDecimal3;
        this.maxScaled = bigDecimal4;
        this.hasTax = Boolean.valueOf(z);
    }

    public int getBetType() {
        return this.betType;
    }

    public Boolean getHasTax() {
        return this.hasTax;
    }

    public String getMaxNetWin() {
        return this.maxNetWin;
    }

    public BigDecimal getMaxPW() {
        return this.maxPW;
    }

    public BigDecimal getMaxScaled() {
        return this.maxScaled;
    }

    public String getMaxWHTax() {
        return this.maxWHTax;
    }

    public BigDecimal getMinScaled() {
        return this.minScaled;
    }

    public BigDecimal getNet() {
        return this.net;
    }

    public String getNetWin() {
        return this.netWin;
    }

    public BigDecimal getNoRoundingTotalOdds() {
        return this.noRoundTotalOdds;
    }

    public BigDecimal getStake() {
        return this.stake;
    }

    public String getTotalOdds() {
        return this.totalOdds;
    }

    public String getTotalOddsForGiftDialog() {
        return this.totalOddsForGiftDialog;
    }

    public String getWhTax() {
        return this.whTax;
    }

    public boolean isCanBetOneCut() {
        return this.canBetOneCut;
    }

    public void setCanBetOneCut(boolean z) {
        this.canBetOneCut = z;
    }

    public void setHasTax(Boolean bool) {
        this.hasTax = bool;
    }

    public void setNet(BigDecimal bigDecimal) {
        this.net = bigDecimal;
    }

    public void setNoRoundTotalOdds(BigDecimal bigDecimal) {
        this.noRoundTotalOdds = bigDecimal;
    }

    public void setStake(BigDecimal bigDecimal) {
        this.stake = bigDecimal;
    }

    public void setTotalOdds(String str) {
        this.totalOdds = str;
    }

    public void setTotalOddsForGiftDialog(String str) {
        this.totalOddsForGiftDialog = str;
    }

    public BetSlipInfo(int i, String str, String str2, BigDecimal bigDecimal, boolean z) {
        this.betType = i;
        this.netWin = str;
        this.whTax = str2;
        this.minScaled = bigDecimal;
        this.hasTax = Boolean.valueOf(z);
    }

    public BetSlipInfo(int i, String str, String str2, String str3, String str4, boolean z) {
        this.betType = i;
        this.netWin = str;
        this.maxNetWin = str2;
        this.whTax = str3;
        this.maxWHTax = str4;
        this.hasTax = Boolean.valueOf(z);
    }

    public BetSlipInfo(int i, String str, String str2, boolean z) {
        this.betType = i;
        this.netWin = str;
        this.whTax = str2;
        this.hasTax = Boolean.valueOf(z);
    }
}
