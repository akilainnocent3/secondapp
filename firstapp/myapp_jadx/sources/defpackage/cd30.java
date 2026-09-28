package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cd30 implements ed30 {
    public final String a;
    public final int b;
    public final int c;

    public cd30(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd30)) {
            return false;
        }
        cd30 cd30Var = (cd30) obj;
        return this.a.equals(cd30Var.a) && this.b == cd30Var.b && this.c == cd30Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", ml5.a(this.b, "QuickBetTertiaryTextRacingState(text=", this.a, ", textColorResId=", ", textStyleResId="));
    }
}
