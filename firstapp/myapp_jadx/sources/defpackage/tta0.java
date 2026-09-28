package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tta0 {
    public final boolean a;
    public final aua0 b;
    public final a c;

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return b7f.a(dy5.a("Color(dividerColorResId=", this.a, this.b, ", backgroundColorResId=", ", iconColorResId="), this.c, ", titleTextColorResId=", this.d, ")");
        }
    }

    public tta0(boolean z, aua0 aua0Var, a aVar) {
        this.a = z;
        this.b = aua0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tta0)) {
            return false;
        }
        tta0 tta0Var = (tta0) obj;
        return this.a == tta0Var.a && this.b.equals(tta0Var.b) && this.c.equals(tta0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "SpeedControllerState(shouldShowRedDot=" + this.a + ", speedOptionBarState=" + this.b + ", color=" + this.c + ")";
    }
}
