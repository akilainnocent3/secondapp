package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class roc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public roc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCoin{centerX=");
        sb.append(this.a);
        sb.append(", centerY=");
        sb.append(this.b);
        sb.append(", alphaProportion=");
        sb.append(this.c);
        sb.append(", rollingDegrees=");
        return h70.a(sb, this.d, '}');
    }
}
