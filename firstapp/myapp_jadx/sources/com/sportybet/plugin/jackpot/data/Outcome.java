package com.sportybet.plugin.jackpot.data;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class Outcome implements Comparable<Outcome> {
    public String desc;
    public int flag;
    public String id;
    public int isActive;
    public String odds;
    public int oddsChangesFlag;
    public double probability;
    public int status;

    public Outcome(Outcome outcome) {
        this.id = outcome.id;
        this.odds = outcome.odds;
        this.isActive = outcome.isActive;
        this.desc = outcome.desc;
        this.status = outcome.status;
        this.flag = outcome.flag;
        this.oddsChangesFlag = outcome.oddsChangesFlag;
        this.probability = outcome.probability;
    }

    @Override // java.lang.Comparable
    public int compareTo(Outcome outcome) {
        return new BigDecimal(this.odds).subtract(new BigDecimal(outcome.odds)).signum();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((Outcome) obj).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void update(String str) {
        if (str == null) {
            return;
        }
        try {
            String[] strArrSplit = str.split("#+");
            this.id = strArrSplit[0];
            this.desc = strArrSplit[1];
            String str2 = this.odds;
            this.odds = strArrSplit[2];
            this.isActive = Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length > 4 && Double.parseDouble(strArrSplit[4]) > 1.0E-4d) {
                this.probability = Double.parseDouble(strArrSplit[4]);
            }
            if (this.isActive != 1 || this.odds.length() <= 0 || str2 == null || str2.length() <= 0) {
                return;
            }
            if (Float.parseFloat(this.odds) > Float.parseFloat(str2)) {
                this.flag = 1;
            } else if (Float.parseFloat(this.odds) < Float.parseFloat(str2)) {
                this.flag = 2;
            }
        } catch (Exception unused) {
        }
    }

    public Outcome() {
    }
}
