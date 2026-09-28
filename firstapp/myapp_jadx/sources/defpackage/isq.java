package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class isq {
    public final jrq a;
    public final jrq b;

    public isq(jrq jrqVar, jrq jrqVar2) {
        this.a = jrqVar;
        this.b = jrqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isq)) {
            return false;
        }
        isq isqVar = (isq) obj;
        return this.a.equals(isqVar.a) && this.b.equals(isqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNLotteryUserPickAndDrawResult(userPick=" + this.a + ", drawResult=" + this.b + ")";
    }
}
