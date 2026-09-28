package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qco {
    public final pco a;
    public final int b;
    public final String c;

    public qco(pco pcoVar, int i, String str) {
        this.a = pcoVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qco)) {
            return false;
        }
        qco qcoVar = (qco) obj;
        return this.a == qcoVar.a && this.b == qcoVar.b && this.c.equals(qcoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinBetHistorySettlementTypeButtonState(settlementType=");
        sb.append(this.a);
        sb.append(", textResId=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
