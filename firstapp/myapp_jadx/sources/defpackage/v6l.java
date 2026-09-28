package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v6l {
    public static final hrr y;
    public final androidx.compose.ui.graphics.layer.a a;
    public Outline f;
    public float j;
    public b9z k;
    public bxz l;
    public j90 m;
    public boolean n;
    public qc6 o;
    public b90 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public mmd b = ocf.a;
    public asr c = asr.a;
    public Function1<? super tcf, Unit> d = b.a;
    public final a e = new a();
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final dk7 r = new dk7();

    public static final class a extends qlr implements Function1<tcf, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            tcf tcfVar2 = tcfVar;
            v6l v6lVar = v6l.this;
            bxz bxzVar = v6lVar.l;
            if (v6lVar.n && v6lVar.w && bxzVar != null) {
                qc6.b bVarF1 = tcfVar2.F1();
                long jD = bVarF1.d();
                bVarF1.a().p();
                try {
                    bVarF1.a.a(bxzVar, 1);
                    v6lVar.d(tcfVar2);
                } finally {
                    hrh.a(bVarF1, jD);
                }
            } else {
                v6lVar.d(tcfVar2);
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<tcf, Unit> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            return Unit.a;
        }
    }

    static {
        hrr hrrVar;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("robolectric")) {
            hrrVar = irr.a;
        } else {
            hrrVar = Build.VERSION.SDK_INT >= 28 ? krr.a : jrr.a;
        }
        y = hrrVar;
    }

    public v6l(androidx.compose.ui.graphics.layer.a aVar) {
        this.a = aVar;
        aVar.l(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            androidx.compose.ui.graphics.layer.a aVar = this.a;
            if (z || aVar.N() > 0.0f) {
                bxz bxzVar = this.l;
                if (bxzVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = bxzVar instanceof j90;
                    if (!z2) {
                        zkh.a("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ((j90) bxzVar).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            d9z.a(outline, bxzVar);
                        } else {
                            if (!z2) {
                                zkh.a("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = bxzVar;
                    if (outline != null) {
                        outline.setAlpha(aVar.a());
                        outline2 = outline;
                    }
                    aVar.H(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        aVar.l(false);
                        aVar.g();
                    } else {
                        aVar.l(this.w);
                    }
                } else {
                    aVar.l(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jD = kc6.d(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jD : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(aVar.a());
                    aVar.H(outline5, kc6.c(j3));
                }
            } else {
                aVar.l(false);
                aVar.H(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[LOOP:0: B:14:0x0029->B:24:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[EDGE_INSN: B:29:0x0069->B:25:0x0069 BREAK  A[LOOP:0: B:14:0x0029->B:24:0x0066], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            dk7 dk7Var = this.r;
            v6l v6lVar = dk7Var.a;
            if (v6lVar != null) {
                v6lVar.q--;
                v6lVar.b();
                dk7Var.a = null;
            }
            stw<v6l> stwVar = dk7Var.c;
            if (stwVar != null) {
                Object[] objArr = stwVar.b;
                long[] jArr = stwVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    v6l v6lVar2 = (v6l) objArr[(i << 3) + i3];
                                    v6lVar2.q--;
                                    v6lVar2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                stwVar.e();
            }
            this.a.g();
        }
    }

    public final void c(lc6 lc6Var, v6l v6lVar) {
        boolean z;
        float f;
        if (this.s) {
            return;
        }
        a();
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!aVar.w()) {
            try {
                aVar.K(this.b, this.c, this, this.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = aVar.N() > 0.0f;
        if (z2) {
            lc6Var.j();
        }
        Canvas canvasC = i40.c(lc6Var);
        boolean zIsHardwareAccelerated = canvasC.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = this.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fA = aVar.a();
            l58 l58VarO = aVar.o();
            int iF = aVar.F();
            if (fA < 1.0f || iF != 3 || l58VarO != null || aVar.m() == 1) {
                b90 b90VarA = this.p;
                if (b90VarA == null) {
                    b90VarA = c90.a();
                    this.p = b90VarA;
                }
                b90VarA.b(fA);
                b90VarA.c(iF);
                b90VarA.k(l58VarO);
                canvasC = canvasC;
                f = f2;
                canvasC.saveLayer(f, f3, f4, f5, b90VarA.a);
            } else {
                canvasC.save();
                canvasC = canvasC;
                f = f2;
            }
            canvasC.translate(f, f3);
            canvasC.concat(aVar.E());
        }
        boolean z3 = !zIsHardwareAccelerated && this.w;
        if (z3) {
            lc6Var.p();
            b9z b9zVarE = e();
            if (b9zVarE instanceof b9z.b) {
                lc6Var.i(((b9z.b) b9zVarE).a);
            } else if (b9zVarE instanceof b9z.c) {
                j90 j90VarA = this.m;
                if (j90VarA != null) {
                    j90VarA.j();
                } else {
                    j90VarA = m90.a();
                    this.m = j90VarA;
                }
                bxz.s(j90VarA, ((b9z.c) b9zVarE).a);
                lc6Var.o(j90VarA, 1);
            } else {
                if (!(b9zVarE instanceof b9z.a)) {
                    uhc.a();
                    return;
                }
                lc6Var.o(((b9z.a) b9zVarE).a, 1);
            }
        }
        if (v6lVar != null) {
            dk7 dk7Var = v6lVar.r;
            if (!dk7Var.e) {
                vkn.a("Only add dependencies during a tracking");
            }
            stw<v6l> stwVar = dk7Var.c;
            if (stwVar != null) {
                stwVar.d(this);
            } else if (dk7Var.a != null) {
                stw<v6l> stwVarA = hz60.a();
                v6l v6lVar2 = dk7Var.a;
                v6lVar2.getClass();
                stwVarA.d(v6lVar2);
                stwVarA.d(this);
                dk7Var.c = stwVarA;
                dk7Var.a = null;
            } else {
                dk7Var.a = this;
            }
            stw<v6l> stwVar2 = dk7Var.d;
            if (stwVar2 != null) {
                z = !stwVar2.l(this);
            } else if (dk7Var.b != this) {
                z = true;
            } else {
                dk7Var.b = null;
                z = false;
            }
            if (z) {
                this.q++;
            }
        }
        if (((h40) lc6Var).a.isHardwareAccelerated()) {
            aVar.I(lc6Var);
        } else {
            qc6 qc6Var = this.o;
            if (qc6Var == null) {
                qc6Var = new qc6();
                this.o = qc6Var;
            }
            qc6.b bVar = qc6Var.b;
            mmd mmdVar = this.b;
            asr asrVar = this.c;
            long jD = kc6.d(this.u);
            mmd mmdVarB = bVar.b();
            asr asrVarC = bVar.c();
            lc6 lc6VarA = bVar.a();
            long jD2 = bVar.d();
            v6l v6lVar3 = bVar.b;
            bVar.f(mmdVar);
            bVar.g(asrVar);
            bVar.e(lc6Var);
            bVar.h(jD);
            bVar.b = this;
            lc6Var.p();
            try {
                d(qc6Var);
                lc6Var.f();
                bVar.f(mmdVarB);
                bVar.g(asrVarC);
                bVar.e(lc6VarA);
                bVar.h(jD2);
                bVar.b = v6lVar3;
            } catch (Throwable th) {
                lc6Var.f();
                bVar.f(mmdVarB);
                bVar.g(asrVarC);
                bVar.e(lc6VarA);
                bVar.h(jD2);
                bVar.b = v6lVar3;
                throw th;
            }
        }
        if (z3) {
            lc6Var.f();
        }
        if (z2) {
            lc6Var.q();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasC.restore();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[LOOP:0: B:20:0x004c->B:30:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[EDGE_INSN: B:34:0x008c->B:31:0x008c BREAK  A[LOOP:0: B:20:0x004c->B:30:0x0089], SYNTHETIC] */
    public final void d(tcf tcfVar) {
        dk7 dk7Var = this.r;
        dk7Var.b = dk7Var.a;
        stw<v6l> stwVar = dk7Var.c;
        if (stwVar != null && stwVar.c()) {
            stw<v6l> stwVarA = dk7Var.d;
            if (stwVarA == null) {
                stwVarA = hz60.a();
                dk7Var.d = stwVarA;
            }
            stwVarA.j(stwVar);
            stwVar.e();
        }
        dk7Var.e = true;
        this.d.invoke(tcfVar);
        dk7Var.e = false;
        v6l v6lVar = dk7Var.b;
        if (v6lVar != null) {
            v6lVar.q--;
            v6lVar.b();
        }
        stw<v6l> stwVar2 = dk7Var.d;
        if (stwVar2 == null || !stwVar2.c()) {
            return;
        }
        Object[] objArr = stwVar2.b;
        long[] jArr = stwVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            v6l v6lVar2 = (v6l) objArr[(i << 3) + i3];
                            v6lVar2.q--;
                            v6lVar2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        stwVar2.e();
    }

    public final b9z e() {
        b9z bVar;
        b9z b9zVar = this.k;
        bxz bxzVar = this.l;
        if (b9zVar != null) {
            return b9zVar;
        }
        if (bxzVar != null) {
            b9z.a aVar = new b9z.a(bxzVar);
            this.k = aVar;
            return aVar;
        }
        long jD = kc6.d(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jD = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            bVar = new b9z.c(bys.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            bVar = new b9z.b(new lk40(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = bVar;
        return bVar;
    }

    public final void f(mmd mmdVar, asr asrVar, long j, Function1<? super tcf, Unit> function1) {
        boolean zB = jxo.b(this.u, j);
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            aVar.i((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = mmdVar;
        this.c = asrVar;
        this.d = function1;
        aVar.K(mmdVar, asrVar, this, this.e);
    }

    public final void g(float f) {
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (aVar.a() == f) {
            return;
        }
        aVar.b(f);
    }

    public final void h(float f, long j, long j2) {
        if (gly.c(this.h, j) && yw90.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(x1b x1bVar) {
        w6l w6lVar;
        if (x1bVar instanceof w6l) {
            w6lVar = (w6l) x1bVar;
            int i = w6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6lVar.c = i - Integer.MIN_VALUE;
            } else {
                w6lVar = new w6l(this, x1bVar);
            }
        } else {
            w6lVar = new w6l(this, x1bVar);
        }
        Object objA = w6lVar.a;
        y5b y5bVar = y5b.a;
        int i2 = w6lVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            w6lVar.c = 1;
            objA = y.a(this, w6lVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        return new t70((Bitmap) objA);
    }
}
