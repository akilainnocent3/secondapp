package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class ewf extends awf {
    public ewf() {
        super(0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // defpackage.awf
    public final String toString() {
        StringBuilder sb = new StringBuilder("ElementShadow{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append(", alphaProportion=");
        sb.append(this.g);
        sb.append(", rollingXDegrees=");
        sb.append(this.h);
        sb.append(", rollingYDegrees=");
        sb.append(this.i);
        sb.append(", rotateDegrees=");
        sb.append(this.j);
        sb.append(", collisionArea=");
        return j26.a(sb, Arrays.toString(this.k), '}');
    }
}
