package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class rmr {
    public final qmr a;
    public final qmr b;
    public final qmr c;

    public rmr(qmr qmrVar, qmr qmrVar2, qmr qmrVar3) {
        this.a = qmrVar;
        this.b = qmrVar2;
        this.c = qmrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmr)) {
            return false;
        }
        rmr rmrVar = (rmr) obj;
        return this.a.equals(rmrVar.a) && this.b.equals(rmrVar.b) && this.c.equals(rmrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LastDayRangeSettingUiState(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ")";
    }
}
