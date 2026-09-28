package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a62 implements u12.a, tmp, jef {
    public final iot e;
    public final w12 f;
    public final float[] h;
    public final klr i;
    public final zwh j;
    public final pxo k;
    public final ArrayList l;
    public final zwh m;
    public vuh0 n;
    public u12<Float, Float> o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public static final class a {
        public final ArrayList a = new ArrayList();
        public final ywg0 b;

        public a(ywg0 ywg0Var) {
            this.b = ywg0Var;
        }
    }

    public a62(iot iotVar, w12 w12Var, Paint.Cap cap, Paint.Join join, float f, de0 de0Var, be0 be0Var, ArrayList arrayList, be0 be0Var2) {
        klr klrVar = new klr(1);
        this.i = klrVar;
        this.p = 0.0f;
        this.e = iotVar;
        this.f = w12Var;
        klrVar.setStyle(Paint.Style.STROKE);
        klrVar.setStrokeCap(cap);
        klrVar.setStrokeJoin(join);
        klrVar.setStrokeMiter(f);
        this.k = (pxo) de0Var.b();
        this.j = be0Var.b();
        if (be0Var2 == null) {
            this.m = null;
        } else {
            this.m = be0Var2.b();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((be0) arrayList.get(i)).b());
        }
        w12Var.g(this.k);
        w12Var.g(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            w12Var.g((u12) this.l.get(i2));
        }
        zwh zwhVar = this.m;
        if (zwhVar != null) {
            w12Var.g(zwhVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((u12) this.l.get(i3)).a(this);
        }
        zwh zwhVar2 = this.m;
        if (zwhVar2 != null) {
            zwhVar2.a(this);
        }
        if (w12Var.n() != null) {
            zwh zwhVarB = ((be0) w12Var.n().a).b();
            this.o = zwhVarB;
            zwhVarB.a(this);
            w12Var.g(this.o);
        }
    }

    @Override // u12.a
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
        oy80.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size() - 1;
        a aVar2 = null;
        ywg0 ywg0Var = null;
        while (true) {
            aVar = oy80.a.b;
            if (size < 0) {
                break;
            }
            cza czaVar = (cza) arrayList2.get(size);
            if (czaVar instanceof ywg0) {
                ywg0 ywg0Var2 = (ywg0) czaVar;
                if (ywg0Var2.c == aVar) {
                    ywg0Var = ywg0Var2;
                }
            }
            size--;
        }
        if (ywg0Var != null) {
            ywg0Var.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            cza czaVar2 = list2.get(size2);
            if (czaVar2 instanceof ywg0) {
                ywg0 ywg0Var3 = (ywg0) czaVar2;
                if (ywg0Var3.c == aVar) {
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                    a aVar3 = new a(ywg0Var3);
                    ywg0Var3.c(this);
                    aVar2 = aVar3;
                } else if (!(czaVar2 instanceof jxz)) {
                    if (aVar2 == null) {
                        aVar2 = new a(ywg0Var);
                    }
                    aVar2.a.add((jxz) czaVar2);
                }
            } else if (!(czaVar2 instanceof jxz)) {
                if (aVar2 == null) {
                    aVar2 = new a(ywg0Var);
                }
                aVar2.a.add((jxz) czaVar2);
            }
        }
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        rqv.g(rmpVar, i, arrayList, rmpVar2, this);
    }

    @Override // defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i2 = 0; i2 < aVar.a.size(); i2++) {
                path.addPath(((jxz) aVar.a.get(i2)).d(), matrix);
            }
            i++;
        }
    }

    @Override // defpackage.smp
    public void i(cpt cptVar, Object obj) {
        PointF pointF = vot.a;
        if (obj == 4) {
            this.k.j(cptVar);
            return;
        }
        if (obj == vot.q) {
            this.j.j(cptVar);
            return;
        }
        ColorFilter colorFilter = vot.I;
        w12 w12Var = this.f;
        if (obj == colorFilter) {
            vuh0 vuh0Var = this.n;
            if (vuh0Var != null) {
                w12Var.q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.n = vuh0Var2;
            vuh0Var2.a(this);
            w12Var.g(this.n);
            return;
        }
        if (obj == vot.e) {
            u12<Float, Float> u12Var = this.o;
            if (u12Var != null) {
                u12Var.j(cptVar);
                return;
            }
            vuh0 vuh0Var3 = new vuh0(cptVar, null);
            this.o = vuh0Var3;
            vuh0Var3.a(this);
            w12Var.g(this.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
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
    public void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        a62 a62Var = this;
        float[] fArr2 = srh0.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = a62Var.k.e().intValue() / 100.0f;
        int iC = rqv.c((int) (i * fIntValue));
        klr klrVar = a62Var.i;
        klrVar.setAlpha(iC);
        klrVar.setStrokeWidth(a62Var.j.l());
        if (klrVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = a62Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = a62Var.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((u12) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            zwh zwhVar = a62Var.m;
            klrVar.setPathEffect(new DashPathEffect(fArr, zwhVar == null ? 0.0f : zwhVar.e().floatValue()));
        }
        vuh0 vuh0Var = a62Var.n;
        if (vuh0Var != null) {
            klrVar.setColorFilter((ColorFilter) vuh0Var.e());
        }
        u12<Float, Float> u12Var = a62Var.o;
        if (u12Var != null) {
            float fFloatValue2 = u12Var.e().floatValue();
            if (fFloatValue2 == 0.0f) {
                klrVar.setMaskFilter(null);
            } else if (fFloatValue2 != a62Var.p) {
                w12 w12Var = a62Var.f;
                if (w12Var.A == fFloatValue2) {
                    maskFilter = w12Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    w12Var.B = blurMaskFilter;
                    w12Var.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                klrVar.setMaskFilter(maskFilter);
            }
            a62Var.p = fFloatValue2;
        }
        if (sefVar != null) {
            sefVar.a((int) (fIntValue * 255.0f), klrVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = a62Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            a aVar = (a) arrayList2.get(i5);
            ywg0 ywg0Var = aVar.b;
            ArrayList arrayList3 = aVar.a;
            Path path = a62Var.b;
            if (ywg0Var != null) {
                if (ywg0Var != null) {
                    path.reset();
                    for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                        path.addPath(((jxz) arrayList3.get(size2)).d());
                    }
                    float fFloatValue3 = ywg0Var.d.e().floatValue() / f2;
                    float fFloatValue4 = ywg0Var.e.e().floatValue() / f2;
                    float fFloatValue5 = ywg0Var.f.e().floatValue() / 360.0f;
                    if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                        PathMeasure pathMeasure = a62Var.a;
                        pathMeasure.setPath(path, z);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length += pathMeasure.getLength();
                        }
                        float f3 = fFloatValue5 * length;
                        float f4 = (fFloatValue3 * length) + f3;
                        float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                        int size3 = arrayList3.size() - i3;
                        float f5 = 0.0f;
                        while (size3 >= 0) {
                            int i6 = i3;
                            Path pathD = ((jxz) arrayList3.get(size3)).d();
                            Path path2 = a62Var.c;
                            path2.set(pathD);
                            pathMeasure.setPath(path2, z);
                            float length2 = pathMeasure.getLength();
                            if (fMin > length) {
                                float f6 = fMin - length;
                                if (f6 >= f5 + length2 || f5 >= f6) {
                                    f = f5 + length2;
                                    if (f < f4 && f5 <= fMin) {
                                        if (f > fMin || f4 >= f5) {
                                            srh0.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                            canvas.drawPath(path2, klrVar);
                                        } else {
                                            canvas.drawPath(path2, klrVar);
                                        }
                                    }
                                } else {
                                    srh0.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(path2, klrVar);
                                }
                            } else {
                                f = f5 + length2;
                                if (f < f4) {
                                }
                            }
                            f5 += length2;
                            size3--;
                            a62Var = this;
                            i3 = i6;
                            z = false;
                        }
                    } else {
                        canvas.drawPath(path, klrVar);
                    }
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((jxz) arrayList3.get(size4)).d());
                }
                canvas.drawPath(path, klrVar);
            }
            i5++;
            a62Var = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
