package com.sporty.android.core.model.gift;

/* JADX INFO: loaded from: classes7.dex */
public class Bonus implements Comparable<Bonus> {
    public long max;
    public long min;
    public int qualifyingSelections;
    public long ratio;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.qualifyingSelections == ((Bonus) obj).qualifyingSelections;
    }

    public int hashCode() {
        return this.qualifyingSelections;
    }

    @Override // java.lang.Comparable
    public int compareTo(Bonus bonus) {
        return this.qualifyingSelections - bonus.qualifyingSelections;
    }
}
