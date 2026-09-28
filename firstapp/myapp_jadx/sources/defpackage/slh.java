package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class slh implements jef, u12.a, tmp {
    public final Path a;
    public final klr b;
    public final w12 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final o58 g;
    public final pxo h;
    public vuh0 i;
    public final iot j;
    public u12<Float, Float> k;
    public float l;

    public slh(iot iotVar, w12 w12Var, yx80 yx80Var) {
        Path path = new Path();
        this.a = path;
        this.b = new klr(1);
        this.f = new ArrayList();
        this.c = w12Var;
        String str = yx80Var.c;
        de0 de0Var = yx80Var.e;
        ae0 ae0Var = yx80Var.d;
        this.d = str;
        this.e = yx80Var.f;
        this.j = iotVar;
        if (w12Var.n() != null) {
            zwh zwhVarB = ((be0) w12Var.n().a).b();
            this.k = zwhVarB;
            zwhVarB.a(this);
            w12Var.g(this.k);
        }
        if (ae0Var == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(yx80Var.b);
        u12<Integer, Integer> u12VarB = ae0Var.b();
        this.g = (o58) u12VarB;
        u12VarB.a(this);
        w12Var.g(u12VarB);
        u12<Integer, Integer> u12VarB2 = de0Var.b();
        this.h = (pxo) u12VarB2;
        u12VarB2.a(this);
        w12Var.g(u12VarB2);
    }

    @Override // u12.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        for (int i = 0; i < list2.size(); i++) {
            cza czaVar = list2.get(i);
            if (czaVar instanceof jxz) {
                this.f.add((jxz) czaVar);
            }
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
    }

    @Override // defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((jxz) arrayList.get(i)).d(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.cza
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        PointF pointF = vot.a;
        if (obj == 1) {
            this.g.j(cptVar);
            return;
        }
        if (obj == 4) {
            this.h.j(cptVar);
            return;
        }
        ColorFilter colorFilter = vot.I;
        w12 w12Var = this.c;
        if (obj == colorFilter) {
            vuh0 vuh0Var = this.i;
            if (vuh0Var != null) {
                w12Var.q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.i = vuh0Var2;
            vuh0Var2.a(this);
            w12Var.g(this.i);
            return;
        }
        if (obj == vot.e) {
            u12<Float, Float> u12Var = this.k;
            if (u12Var != null) {
                u12Var.j(cptVar);
                return;
            }
            vuh0 vuh0Var3 = new vuh0(cptVar, null);
            this.k = vuh0Var3;
            vuh0Var3.a(this);
            w12Var.g(this.k);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        MaskFilter maskFilter;
        if (this.e) {
            return;
        }
        o58 o58Var = this.g;
        int iL = o58Var.l(o58Var.c.b(), o58Var.c());
        float fIntValue = this.h.e().intValue() / 100.0f;
        int iC = (rqv.c((int) (i * fIntValue)) << 24) | (iL & 16777215);
        klr klrVar = this.b;
        klrVar.setColor(iC);
        vuh0 vuh0Var = this.i;
        if (vuh0Var != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var.e());
        }
        u12<Float, Float> u12Var = this.k;
        if (u12Var != null) {
            float fFloatValue = u12Var.e().floatValue();
            if (fFloatValue == 0.0f) {
                klrVar.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                w12 w12Var = this.c;
                if (w12Var.A == fFloatValue) {
                    maskFilter = w12Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    w12Var.B = blurMaskFilter;
                    w12Var.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                klrVar.setMaskFilter(maskFilter);
            }
            this.l = fFloatValue;
        }
        if (sefVar != null) {
            sefVar.a((int) (fIntValue * 255.0f), klrVar);
        } else {
            klrVar.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, klrVar);
                return;
            } else {
                path.addPath(((jxz) arrayList.get(i2)).d(), matrix);
                i2++;
            }
        }
    }
}
