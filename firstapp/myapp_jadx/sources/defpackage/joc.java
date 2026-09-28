package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class joc {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;

    public joc(String str, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataBall{ballStatus='");
        sb.append(this.a);
        sb.append("', centerX=");
        sb.append(this.b);
        sb.append(", centerY=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", alphaProportion=");
        sb.append(this.e);
        sb.append(", rotate=");
        sb.append(this.f);
        sb.append(", rolling=");
        return ruw.a(sb, this.g, '}');
    }
}
