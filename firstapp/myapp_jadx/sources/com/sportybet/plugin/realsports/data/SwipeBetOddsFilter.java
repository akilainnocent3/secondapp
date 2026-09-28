package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetOddsFilter {
    public boolean isMax;
    public float max;
    public double maxOdds;
    public float min;
    public double minOdds;

    public SwipeBetOddsFilter(float f, float f2, double d, double d2, boolean z) {
        this.min = f;
        this.max = f2;
        this.minOdds = d;
        this.maxOdds = d2;
        this.isMax = z;
    }
}
