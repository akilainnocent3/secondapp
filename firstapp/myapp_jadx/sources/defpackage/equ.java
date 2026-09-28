package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class equ {
    public final String a;
    public final String b;

    public equ(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof equ)) {
            return false;
        }
        equ equVar = (equ) obj;
        return this.a.equals(equVar.a) && this.b.equals(equVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("MarketItem(category=", this.a, ", subCategory=", this.b, ")");
    }
}
