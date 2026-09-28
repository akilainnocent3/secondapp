package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ibu {
    public final String a;
    public final fau b;

    public ibu(String str, fau fauVar) {
        this.a = str;
        this.b = fauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibu)) {
            return false;
        }
        ibu ibuVar = (ibu) obj;
        return this.a.equals(ibuVar.a) && this.b == ibuVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LuckyWheelSpinResult(winningAmount=" + this.a + ", resultType=" + this.b + ")";
    }
}
