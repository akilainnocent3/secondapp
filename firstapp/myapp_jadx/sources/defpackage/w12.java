package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w12 implements jef, u12.a, smp {
    public float A;
    public BlurMaskFilter B;
    public klr C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final klr d = new klr(1);
    public final klr e;
    public final klr f;
    public final klr g;
    public final klr h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final iot o;
    public final drr p;
    public final utu q;
    public final zwh r;
    public w12 s;
    public w12 t;
    public List<w12> u;
    public final ArrayList v;
    public final isg0 w;
    public boolean x;
    public boolean y;
    public klr z;

    public w12(iot iotVar, drr drrVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new klr(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new klr(mode2);
        klr klrVar = new klr(1);
        this.g = klrVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        klr klrVar2 = new klr();
        klrVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = klrVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = iotVar;
        this.p = drrVar;
        String str = drrVar.c;
        List<stu> list = drrVar.h;
        str.concat("#draw");
        if (drrVar.u == drr.b.b) {
            klrVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            klrVar.setXfermode(new PorterDuffXfermode(mode));
        }
        qe0 qe0Var = drrVar.i;
        qe0Var.getClass();
        isg0 isg0Var = new isg0(qe0Var);
        this.w = isg0Var;
        isg0Var.b(this);
        if (list != null && !list.isEmpty()) {
            utu utuVar = new utu(list);
            this.q = utuVar;
            ArrayList arrayList = utuVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((u12) obj).a(this);
            }
            ArrayList arrayList2 = this.q.b;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                u12<?, ?> u12Var = (u12) obj2;
                g(u12Var);
                u12Var.a(this);
            }
        }
        drr drrVar2 = this.p;
        if (drrVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        zwh zwhVar = new zwh(drrVar2.t);
        this.r = zwhVar;
        zwhVar.b = true;
        zwhVar.a(new u12.a() { // from class: v12
            @Override // u12.a
            public final void a() {
                w12 w12Var = this.a;
                boolean z = w12Var.r.l() == 1.0f;
                if (z != w12Var.x) {
                    w12Var.x = z;
                    w12Var.o.invalidateSelf();
                }
            }
        });
        boolean z = this.r.e().floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        g(this.r);
    }

    @Override // u12.a
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.smp
    public final void c(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
        w12 w12Var = this.s;
        drr drrVar = this.p;
        if (w12Var != null) {
            String str = w12Var.p.c;
            rmp rmpVar3 = new rmp(rmpVar2);
            rmpVar3.a.add(str);
            if (rmpVar.a(i, this.s.p.c)) {
                w12 w12Var2 = this.s;
                rmp rmpVar4 = new rmp(rmpVar3);
                rmpVar4.b = w12Var2;
                arrayList.add(rmpVar4);
            }
            if (rmpVar.c(i, this.s.p.c) && rmpVar.d(i, drrVar.c)) {
                this.s.r(rmpVar, rmpVar.b(i, this.s.p.c) + i, arrayList, rmpVar3);
            }
        }
        String str2 = drrVar.c;
        String str3 = drrVar.c;
        if (rmpVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                rmp rmpVar5 = new rmp(rmpVar2);
                rmpVar5.a.add(str3);
                if (rmpVar.a(i, str3)) {
                    rmp rmpVar6 = new rmp(rmpVar5);
                    rmpVar6.b = this;
                    arrayList.add(rmpVar6);
                }
                rmpVar2 = rmpVar5;
            }
            if (rmpVar.d(i, str3)) {
                r(rmpVar, rmpVar.b(i, str3) + i, arrayList, rmpVar2);
            }
        }
    }

    @Override // defpackage.jef
    public void f(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        k();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List<w12> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.u.get(size).w.e());
                }
            } else {
                w12 w12Var = this.t;
                if (w12Var != null) {
                    matrix2.preConcat(w12Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void g(u12<?, ?> u12Var) {
        if (u12Var == null) {
            return;
        }
        this.v.add(u12Var);
    }

    public void i(cpt cptVar, Object obj) {
        this.w.c(cptVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x020f  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:113:0x022a  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:119:0x0257  */
    /* JADX WARN: Code duplicated, block: B:129:0x026e  */
    /* JADX WARN: Code duplicated, block: B:132:0x027b A[LOOP:2: B:127:0x0268->B:132:0x027b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0287  */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:144:0x0321  */
    /* JADX WARN: Code duplicated, block: B:145:0x0331  */
    /* JADX WARN: Code duplicated, block: B:147:0x033a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0364  */
    /* JADX WARN: Code duplicated, block: B:153:0x0392  */
    /* JADX WARN: Code duplicated, block: B:163:0x038b A[EDGE_INSN: B:163:0x038b->B:150:0x038b BREAK  A[LOOP:1: B:111:0x021e->B:149:0x0384], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x025a A[EDGE_INSN: B:170:0x025a->B:121:0x025a BREAK  A[LOOP:2: B:127:0x0268->B:132:0x027b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    @Override // defpackage.jef
    public final void j(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        utu utuVar;
        Path path;
        float f;
        int i2;
        RectF rectF;
        klr klrVar;
        jf4 jf4Var;
        Paint paint;
        int i3;
        List<stu> list;
        ArrayList arrayList;
        List<stu> list2;
        u12 u12Var;
        u12 u12Var2;
        boolean z;
        int iOrdinal;
        int i4;
        Paint paint2;
        Path path2;
        char c;
        int i5;
        Integer numE;
        if (this.x) {
            drr drrVar = this.p;
            boolean z2 = drrVar.v;
            zup zupVar = drrVar.y;
            if (z2) {
                return;
            }
            k();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(this.u.get(size).w.e());
            }
            isg0 isg0Var = this.w;
            u12<Integer, Integer> u12Var3 = isg0Var.p;
            int iIntValue = (int) ((((i / 255.0f) * ((u12Var3 == null || (numE = u12Var3.e()) == null) ? 100 : numE.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !o() && zupVar == zup.a) {
                matrix2.preConcat(isg0Var.e());
                m(canvas, matrix2, iIntValue, sefVar);
                p(0.0f);
                return;
            }
            RectF rectF2 = this.i;
            f(rectF2, matrix2, false);
            if (this.s != null && drrVar.u != drr.b.b) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.f(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(isg0Var.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zO = o();
            utu utuVar2 = this.q;
            Path path3 = this.a;
            if (zO) {
                int size2 = utuVar2.c.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        stu stuVar = utuVar2.c.get(i6);
                        Path path4 = (Path) ((u12) utuVar2.a.get(i6)).e();
                        if (path4 == null) {
                            i2 = size2;
                        } else {
                            path3.set(path4);
                            path3.transform(matrix2);
                            int iOrdinal2 = stuVar.a.ordinal();
                            i2 = size2;
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        if (iOrdinal2 == 3) {
                                        }
                                        rectF = this.m;
                                        path3.computeBounds(rectF, false);
                                        if (i6 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i6++;
                                        size2 = i2;
                                        utuVar2 = utuVar2;
                                        path3 = path3;
                                    }
                                }
                                utuVar = utuVar2;
                                path = path3;
                                f = 0.0f;
                            }
                            if (stuVar.d) {
                                utuVar = utuVar2;
                                path = path3;
                                f = 0.0f;
                            }
                            rectF = this.m;
                            path3.computeBounds(rectF, false);
                            if (i6 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i6++;
                            size2 = i2;
                            utuVar2 = utuVar2;
                            path3 = path3;
                        }
                        i6++;
                        size2 = i2;
                        utuVar2 = utuVar2;
                        path3 = path3;
                    } else {
                        utuVar = utuVar2;
                        path = path3;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                utuVar = utuVar2;
                path = path3;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                klr klrVar2 = this.d;
                klrVar2.setAlpha(255);
                int iOrdinal3 = zupVar.ordinal();
                if (iOrdinal3 == 1) {
                    jf4Var = Build.VERSION.SDK_INT >= 29 ? jf4.MULTIPLY : jf4.MODULATE;
                } else if (iOrdinal3 == 2) {
                    jf4Var = jf4.SCREEN;
                } else if (iOrdinal3 == 3) {
                    jf4Var = jf4.OVERLAY;
                } else if (iOrdinal3 == 4) {
                    jf4Var = jf4.DARKEN;
                } else if (iOrdinal3 != 5) {
                    jf4Var = iOrdinal3 != 16 ? null : jf4.PLUS;
                } else {
                    jf4Var = jf4.LIGHTEN;
                }
                arz.a(klrVar2, jf4Var);
                Matrix matrix4 = srh0.a;
                canvas.saveLayer(rectF2, klrVar2);
                if (zupVar != zup.b) {
                    l(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.C == null) {
                            klr klrVar3 = new klr();
                            this.C = klrVar3;
                            klrVar3.setColor(-1);
                        }
                        canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                    }
                    m(canvas, matrix2, iIntValue, sefVar);
                    if (o()) {
                        paint = this.e;
                        canvas.saveLayer(rectF2, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            l(canvas);
                        }
                        i3 = 0;
                        while (true) {
                            list = utuVar.c;
                            arrayList = utuVar.a;
                            list2 = utuVar.c;
                            if (i3 < list.size()) {
                                break;
                            }
                            stu stuVar2 = list2.get(i3);
                            u12Var = (u12) arrayList.get(i3);
                            u12Var2 = (u12) utuVar.b.get(i3);
                            stu.a aVar = stuVar2.a;
                            z = stuVar2.d;
                            iOrdinal = aVar.ordinal();
                            i4 = i3;
                            paint2 = this.f;
                            if (iOrdinal != 0) {
                                path2 = path;
                                c = 255;
                                if (z) {
                                    canvas.saveLayer(rectF2, klrVar2);
                                    canvas.drawRect(rectF2, klrVar2);
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, klrVar2);
                                }
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3 && !arrayList.isEmpty()) {
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < list2.size()) {
                                                klrVar2.setAlpha(255);
                                                canvas.drawRect(rectF2, klrVar2);
                                                break;
                                            } else if (list2.get(i5).a != stu.a.d) {
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    path2 = path;
                                } else if (z) {
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, klrVar2);
                                    paint2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                    path2 = path;
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2 = path;
                                    canvas.saveLayer(rectF2, paint);
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                    canvas.drawPath(path2, klrVar2);
                                    canvas.restore();
                                }
                                c = 255;
                            } else {
                                path2 = path;
                                if (i4 == 0) {
                                    klrVar2.setColor(-16777216);
                                    c = 255;
                                    klrVar2.setAlpha(255);
                                    canvas.drawRect(rectF2, klrVar2);
                                } else {
                                    c = 255;
                                }
                                if (z) {
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, klrVar2);
                                    paint2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) u12Var.e());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                }
                            }
                            i3 = i4 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        l(canvas);
                        this.s.j(canvas, matrix, i, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                m(canvas, matrix2, iIntValue, sefVar);
                if (o()) {
                    paint = this.e;
                    canvas.saveLayer(rectF2, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        l(canvas);
                    }
                    i3 = 0;
                    while (true) {
                        list = utuVar.c;
                        arrayList = utuVar.a;
                        list2 = utuVar.c;
                        if (i3 < list.size()) {
                            break;
                            break;
                        }
                        stu stuVar3 = list2.get(i3);
                        u12Var = (u12) arrayList.get(i3);
                        u12Var2 = (u12) utuVar.b.get(i3);
                        stu.a aVar2 = stuVar3.a;
                        z = stuVar3.d;
                        iOrdinal = aVar2.ordinal();
                        i4 = i3;
                        paint2 = this.f;
                        if (iOrdinal != 0) {
                            path2 = path;
                            c = 255;
                            if (z) {
                                canvas.saveLayer(rectF2, klrVar2);
                                canvas.drawRect(rectF2, klrVar2);
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, klrVar2);
                            }
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < list2.size()) {
                                            klrVar2.setAlpha(255);
                                            canvas.drawRect(rectF2, klrVar2);
                                            break;
                                        } else {
                                            if (list2.get(i5).a != stu.a.d) {
                                                break;
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                                path2 = path;
                            } else if (z) {
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, klrVar2);
                                paint2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                path2 = path;
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2 = path;
                                canvas.saveLayer(rectF2, paint);
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                klrVar2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, klrVar2);
                                canvas.restore();
                            }
                            c = 255;
                        } else {
                            path2 = path;
                            if (i4 == 0) {
                                klrVar2.setColor(-16777216);
                                c = 255;
                                klrVar2.setAlpha(255);
                                canvas.drawRect(rectF2, klrVar2);
                            } else {
                                c = 255;
                            }
                            if (z) {
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, klrVar2);
                                paint2.setAlpha((int) (((Integer) u12Var2.e()).intValue() * 2.55f));
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) u12Var.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                            }
                        }
                        i3 = i4 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    l(canvas);
                    this.s.j(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (klrVar = this.z) != null) {
                klrVar.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            p(0.0f);
        }
    }

    public final void k() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (w12 w12Var = this.t; w12Var != null; w12Var = w12Var.t) {
            this.u.add(w12Var);
        }
    }

    public final void l(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void m(Canvas canvas, Matrix matrix, int i, sef sefVar);

    public gg4 n() {
        return this.p.w;
    }

    public final boolean o() {
        utu utuVar = this.q;
        return (utuVar == null || utuVar.a.isEmpty()) ? false : true;
    }

    public final void p(float f) {
        vd00 vd00Var = this.o.a.a;
        String str = this.p.c;
        HashMap map = vd00Var.c;
        if (vd00Var.a) {
            uhv uhvVar = (uhv) map.get(str);
            if (uhvVar == null) {
                uhvVar = new uhv();
                map.put(str, uhvVar);
            }
            int i = uhvVar.a + 1;
            uhvVar.a = i;
            if (i == Integer.MAX_VALUE) {
                uhvVar.a = i / 2;
            }
            if (str.equals("__container")) {
                tx0.a aVar = new tx0.a();
                while (aVar.hasNext()) {
                    ((vd00.a) aVar.next()).a();
                }
            }
        }
    }

    public final void q(u12<?, ?> u12Var) {
        this.v.remove(u12Var);
    }

    public void s(boolean z) {
        if (z && this.z == null) {
            this.z = new klr();
        }
        this.y = z;
    }

    public void t(float f) {
        isg0 isg0Var = this.w;
        u12<Integer, Integer> u12Var = isg0Var.p;
        if (u12Var != null) {
            u12Var.i(f);
        }
        u12<?, Float> u12Var2 = isg0Var.v;
        if (u12Var2 != null) {
            u12Var2.i(f);
        }
        u12<?, Float> u12Var3 = isg0Var.w;
        if (u12Var3 != null) {
            u12Var3.i(f);
        }
        u12<PointF, PointF> u12Var4 = isg0Var.l;
        if (u12Var4 != null) {
            u12Var4.i(f);
        }
        u12<?, PointF> u12Var5 = isg0Var.m;
        if (u12Var5 != null) {
            u12Var5.i(f);
        }
        u12<cz60, cz60> u12Var6 = isg0Var.n;
        if (u12Var6 != null) {
            u12Var6.i(f);
        }
        u12<Float, Float> u12Var7 = isg0Var.o;
        if (u12Var7 != null) {
            u12Var7.i(f);
        }
        zwh zwhVar = isg0Var.q;
        if (zwhVar != null) {
            zwhVar.i(f);
        }
        zwh zwhVar2 = isg0Var.r;
        if (zwhVar2 != null) {
            zwhVar2.i(f);
        }
        zwh zwhVar3 = isg0Var.s;
        if (zwhVar3 != null) {
            zwhVar3.i(f);
        }
        zwh zwhVar4 = isg0Var.t;
        if (zwhVar4 != null) {
            zwhVar4.i(f);
        }
        zwh zwhVar5 = isg0Var.u;
        if (zwhVar5 != null) {
            zwhVar5.i(f);
        }
        int i = 0;
        utu utuVar = this.q;
        if (utuVar != null) {
            ArrayList arrayList = utuVar.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((u12) arrayList.get(i2)).i(f);
            }
        }
        zwh zwhVar6 = this.r;
        if (zwhVar6 != null) {
            zwhVar6.i(f);
        }
        w12 w12Var = this.s;
        if (w12Var != null) {
            w12Var.t(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((u12) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
    }

    public void r(rmp rmpVar, int i, ArrayList arrayList, rmp rmpVar2) {
    }
}
