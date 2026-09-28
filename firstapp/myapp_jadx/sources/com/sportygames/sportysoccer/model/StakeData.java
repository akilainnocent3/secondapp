package com.sportygames.sportysoccer.model;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class StakeData {
    private final Float amount;
    private final String id;
    private final List<Float> payouts;

    public StakeData(String str, List<Float> list, Float f) {
        this.id = str;
        this.payouts = list;
        this.amount = f;
    }

    public Float getAmount() {
        return this.amount;
    }

    public String getId() {
        return this.id;
    }

    public List<Float> getStakePayouts() {
        return this.payouts;
    }

    public String toString() {
        return "StakeData{id='" + this.id + "', payouts=" + this.payouts + ", amount=" + this.amount + '}';
    }
}
