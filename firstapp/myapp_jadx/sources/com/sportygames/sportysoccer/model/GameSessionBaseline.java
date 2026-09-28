package com.sportygames.sportysoccer.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class GameSessionBaseline {
    private static final float DENOMINATOR = 1000000.0f;

    @SerializedName("defaultStake")
    public int defaultStake;

    @SerializedName("firstPayout")
    private int firstPayout;
    public boolean isValid;

    @SerializedName("maxStake")
    public int maxStake;

    @SerializedName("minStake")
    public int minStake;

    public GameSessionBaseline(boolean z) {
        this.isValid = z;
    }

    public float getPayout() {
        return this.firstPayout / DENOMINATOR;
    }
}
