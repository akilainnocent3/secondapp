package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class lxz extends cpp<PointF> {
    public Path q;
    public final cpp<PointF> r;

    public lxz(xmt xmtVar, cpp<PointF> cppVar) {
        super(xmtVar, cppVar.b, cppVar.c, cppVar.d, cppVar.e, cppVar.f, cppVar.g, cppVar.h);
        this.r = cppVar;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        boolean z;
        T t;
        T t2 = this.c;
        T t3 = this.b;
        if (t2 == 0 || t3 == 0) {
            z = false;
        } else {
            PointF pointF = (PointF) t2;
            if (((PointF) t3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (t3 == 0 || (t = this.c) == 0 || z) {
            return;
        }
        PointF pointF2 = (PointF) t3;
        PointF pointF3 = (PointF) t;
        cpp<PointF> cppVar = this.r;
        PointF pointF4 = cppVar.o;
        PointF pointF5 = cppVar.p;
        Matrix matrix = srh0.a;
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF4.x + pointF2.x;
            float f2 = pointF2.y + pointF4.y;
            float f3 = pointF3.x;
            float f4 = f3 + pointF5.x;
            float f5 = pointF3.y;
            path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
        }
        this.q = path;
    }
}
