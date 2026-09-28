package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ekq {
    public final String a;
    public final String b;

    public ekq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekq)) {
            return false;
        }
        ekq ekqVar = (ekq) obj;
        return this.a.equals(ekqVar.a) && this.b.equals(ekqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LNHistoryLotterySelection(lotteryId=", this.a, ", lotteryTitle=", this.b, ")");
    }
}
