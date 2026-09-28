package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kwf implements jxz, u12.a, tmp {
    public final String b;
    public final iot c;
    public final zz10 d;
    public final u12<?, PointF> e;
    public final zn7 f;
    public boolean h;
    public final Path a = new Path();
    public final qna g = new qna();

    public kwf(iot iotVar, w12 w12Var, zn7 zn7Var) {
        this.b = zn7Var.a;
        this.c = iotVar;
        u12<?, ?> u12VarB = zn7Var.c.b();
        this.d = (zz10) u12VarB;
        u12<PointF, PointF> u12VarB2 = zn7Var.b.b();
        this.e = u12VarB2;
        this.f = zn7Var;
        w12Var.g(u12VarB);
        w12Var.g(u12VarB2);
        u12VarB.a(this);
        u12VarB2.a(this);
    }

    @Override // u12.a
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            cza czaVar = (cza) arrayList.get(i);
            if (czaVar instanceof ywg0) {
                ywg0 ywg0Var = (ywg0) czaVar;
                if (ywg0Var.c == oy80.a.a) {
                    this.g.a.add(ywg0Var);
                    ywg0Var.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
    }

    @Override // defpackage.jxz
    public final Path d() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        zn7 zn7Var = this.f;
        if (zn7Var.e) {
            this.h = true;
            return path;
        }
        PointF pointFE = this.d.e();
        float f = pointFE.x / 2.0f;
        float f2 = pointFE.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (zn7Var.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFE2 = this.e.e();
        path.offset(pointFE2.x, pointFE2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        if (obj == vot.f) {
            this.d.j(cptVar);
        } else if (obj == vot.i) {
            this.e.j(cptVar);
        }
    }
}
