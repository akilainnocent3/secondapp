package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yoc {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public yoc(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataDefenseObj{centerX=");
        sb.append(this.a);
        sb.append(", centerY=");
        sb.append(this.b);
        sb.append(", scale=1.0, rollingYDegrees=");
        sb.append(this.c);
        sb.append(", rollingXDegrees=0.0, rotateDegrees=0.0, alphaProportion=");
        return h70.a(sb, this.d, '}');
    }
}
