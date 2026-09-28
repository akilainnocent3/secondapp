package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class xob0 {
    public final imf0 a;
    public final imf0 b;
    public final imf0 c;
    public final imf0 d;
    public final imf0 e;

    public xob0(imf0 imf0Var, imf0 imf0Var2, imf0 imf0Var3, imf0 imf0Var4, imf0 imf0Var5) {
        this.a = imf0Var;
        this.b = imf0Var2;
        this.c = imf0Var3;
        this.d = imf0Var4;
        this.e = imf0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xob0)) {
            return false;
        }
        xob0 xob0Var = (xob0) obj;
        return this.a.equals(xob0Var.a) && this.b.equals(xob0Var.b) && this.c.equals(xob0Var.c) && this.d.equals(xob0Var.d) && this.e.equals(xob0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gg8.b(gg8.b(gg8.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "SportyGamesTypography(gMainButton=" + this.a + ", gSupportButton=" + this.b + ", gSubtextButton=" + this.c + ", gHeaderGameName=" + this.d + ", gShTab=" + this.e + ')';
    }
}
