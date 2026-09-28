package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class mty {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mty(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mty)) {
            return false;
        }
        mty mtyVar = (mty) obj;
        return this.a == mtyVar.a && this.b == mtyVar.b && this.c == mtyVar.c && this.d == mtyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneUpPromoTagPresentation(textResId=");
        sb.append(this.a);
        sb.append(", showOneUpIcon=");
        sb.append(this.b);
        sb.append(", showChevron=");
        return lng.a(", clickable=", ")", sb, this.c, this.d);
    }
}
