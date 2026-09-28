package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class axn {
    public final String a;
    public final String b;

    public axn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axn)) {
            return false;
        }
        axn axnVar = (axn) obj;
        return this.a.equals(axnVar.a) && this.b.equals(axnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantRacingMarketCategoryTabState(id=", this.a, ", name=", this.b, ")");
    }
}
