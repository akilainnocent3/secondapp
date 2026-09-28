package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class z6l implements vgz {
    public int C;
    public b9z E;
    public boolean F;
    public boolean G;
    public boolean I;
    public v6l a;
    public final t6l b;
    public final AndroidComposeView c;
    public Function2<? super lc6, ? super v6l, Unit> d;
    public Function0<Unit> e;
    public boolean i;
    public float[] w;
    public boolean y;
    public long f = 9223372034707292159L;
    public final float[] v = ddv.a();
    public mmd z = omd.a();
    public asr A = asr.a;
    public final qc6 B = new qc6();
    public long D = jsg0.b;
    public boolean H = true;
    public final a J = new a();

    public static final class a extends qlr implements Function1<tcf, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            tcf tcfVar2 = tcfVar;
            lc6 lc6VarA = tcfVar2.F1().a();
            Function2<? super lc6, ? super v6l, Unit> function2 = z6l.this.d;
            if (function2 != null) {
                function2.invoke(lc6VarA, tcfVar2.F1().b);
            }
            return Unit.a;
        }
    }

    public z6l(v6l v6lVar, t6l t6lVar, AndroidComposeView androidComposeView, Function2<? super lc6, ? super v6l, Unit> function2, Function0<Unit> function0) {
        this.a = v6lVar;
        this.b = t6lVar;
        this.c = androidComposeView;
        this.d = function2;
        this.e = function0;
    }

    @Override // defpackage.vgz
    public final void a(float[] fArr) {
        ddv.g(fArr, m());
    }

    @Override // defpackage.vgz
    public final void b(qtw qtwVar, boolean z) {
        float[] fArrL = z ? l() : m();
        if (this.H) {
            return;
        }
        if (fArrL != null) {
            ddv.c(fArrL, qtwVar);
            return;
        }
        qtwVar.a = 0.0f;
        qtwVar.b = 0.0f;
        qtwVar.c = 0.0f;
        qtwVar.d = 0.0f;
    }

    @Override // defpackage.vgz
    public final void c(no50 no50Var) {
        long j;
        Function0<Unit> function0;
        int i;
        Function0<Unit> function1;
        int i2 = no50Var.a | this.C;
        this.A = no50Var.I;
        this.z = no50Var.H;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.D = no50Var.C;
        }
        if ((i2 & 1) != 0) {
            v6l v6lVar = this.a;
            float f = no50Var.b;
            androidx.compose.ui.graphics.layer.a aVar = v6lVar.a;
            if (aVar.G() != f) {
                aVar.k(f);
            }
        }
        if ((i2 & 2) != 0) {
            v6l v6lVar2 = this.a;
            float f2 = no50Var.c;
            androidx.compose.ui.graphics.layer.a aVar2 = v6lVar2.a;
            if (aVar2.O() != f2) {
                aVar2.v(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.a.g(no50Var.d);
        }
        if ((i2 & 8) != 0) {
            v6l v6lVar3 = this.a;
            float f3 = no50Var.e;
            androidx.compose.ui.graphics.layer.a aVar3 = v6lVar3.a;
            if (aVar3.z() != f3) {
                aVar3.B(f3);
            }
        }
        if ((i2 & 16) != 0) {
            v6l v6lVar4 = this.a;
            float f4 = no50Var.f;
            androidx.compose.ui.graphics.layer.a aVar4 = v6lVar4.a;
            if (aVar4.y() != f4) {
                aVar4.f(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            v6l v6lVar5 = this.a;
            float f5 = no50Var.i;
            androidx.compose.ui.graphics.layer.a aVar5 = v6lVar5.a;
            if (aVar5.N() != f5) {
                aVar5.t(f5);
                v6lVar5.g = true;
                v6lVar5.a();
            }
            if (no50Var.i > 0.0f && !this.I && (function1 = this.e) != null) {
                function1.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            v6l v6lVar6 = this.a;
            long j2 = no50Var.v;
            androidx.compose.ui.graphics.layer.a aVar6 = v6lVar6.a;
            long jA = aVar6.A();
            int i4 = j58.n;
            if (!nbh0.a(j2, jA)) {
                aVar6.h(j2);
            }
        }
        if ((i2 & 128) != 0) {
            v6l v6lVar7 = this.a;
            long j3 = no50Var.w;
            androidx.compose.ui.graphics.layer.a aVar7 = v6lVar7.a;
            long jC = aVar7.C();
            int i5 = j58.n;
            if (!nbh0.a(j3, jC)) {
                aVar7.n(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            v6l v6lVar8 = this.a;
            float f6 = no50Var.A;
            androidx.compose.ui.graphics.layer.a aVar8 = v6lVar8.a;
            if (aVar8.x() != f6) {
                aVar8.u(f6);
            }
        }
        if ((i2 & 256) != 0) {
            v6l v6lVar9 = this.a;
            float f7 = no50Var.y;
            androidx.compose.ui.graphics.layer.a aVar9 = v6lVar9.a;
            if (aVar9.L() != f7) {
                aVar9.q(f7);
            }
        }
        if ((i2 & 512) != 0) {
            v6l v6lVar10 = this.a;
            float f8 = no50Var.z;
            androidx.compose.ui.graphics.layer.a aVar10 = v6lVar10.a;
            if (aVar10.s() != f8) {
                aVar10.r(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            v6l v6lVar11 = this.a;
            float f9 = no50Var.B;
            androidx.compose.ui.graphics.layer.a aVar11 = v6lVar11.a;
            if (aVar11.D() != f9) {
                aVar11.p(f9);
            }
        }
        if (i3 != 0) {
            boolean zA = jsg0.a(this.D, jsg0.b);
            v6l v6lVar12 = this.a;
            if (zA) {
                if (!gly.c(v6lVar12.v, 9205357640488583168L)) {
                    v6lVar12.v = 9205357640488583168L;
                    v6lVar12.a.J(9205357640488583168L);
                }
                j = 4294967295L;
            } else {
                j = 4294967295L;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.D & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.D >> 32)) * ((int) (this.f >> 32)))) << 32);
                if (!gly.c(v6lVar12.v, jFloatToRawIntBits)) {
                    v6lVar12.v = jFloatToRawIntBits;
                    v6lVar12.a.J(jFloatToRawIntBits);
                }
            }
        } else {
            j = 4294967295L;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            v6l v6lVar13 = this.a;
            boolean z2 = no50Var.E;
            if (v6lVar13.w != z2) {
                v6lVar13.w = z2;
                v6lVar13.g = true;
                v6lVar13.a();
            }
        }
        if ((131072 & i2) != 0) {
            v6l v6lVar14 = this.a;
            m750 m750Var = no50Var.J;
            androidx.compose.ui.graphics.layer.a aVar12 = v6lVar14.a;
            if (!Intrinsics.g(aVar12.d(), m750Var)) {
                aVar12.e(m750Var);
            }
        }
        if ((262144 & i2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar13 = this.a.a;
            if (!Intrinsics.g(aVar13.o(), null)) {
                aVar13.j();
            }
        }
        if ((524288 & i2) != 0) {
            v6l v6lVar15 = this.a;
            int i6 = no50Var.K;
            androidx.compose.ui.graphics.layer.a aVar14 = v6lVar15.a;
            if (aVar14.F() != i6) {
                aVar14.c(i6);
            }
        }
        if ((32768 & i2) != 0) {
            v6l v6lVar16 = this.a;
            int i7 = no50Var.F;
            if (i7 == 0) {
                i = 0;
            } else if (i7 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i7 != 2) {
                    ib5.a("Not supported composition strategy");
                    return;
                }
            }
            androidx.compose.ui.graphics.layer.a aVar15 = v6lVar16.a;
            if (aVar15.m() != i) {
                aVar15.M(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.F = true;
            this.G = true;
        }
        if (Intrinsics.g(this.E, no50Var.L)) {
            z = false;
        } else {
            b9z b9zVar = no50Var.L;
            this.E = b9zVar;
            if (b9zVar != null) {
                v6l v6lVar17 = this.a;
                if (b9zVar instanceof b9z.b) {
                    lk40 lk40Var = ((b9z.b) b9zVar).a;
                    float f10 = lk40Var.a;
                    float f11 = lk40Var.b;
                    v6lVar17.h(0.0f, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & j), (((long) Float.floatToRawIntBits(lk40Var.c - lk40Var.a)) << 32) | (((long) Float.floatToRawIntBits(lk40Var.d - f11)) & j));
                } else if (b9zVar instanceof b9z.a) {
                    bxz bxzVar = ((b9z.a) b9zVar).a;
                    v6lVar17.k = null;
                    v6lVar17.i = 9205357640488583168L;
                    v6lVar17.h = 0L;
                    v6lVar17.j = 0.0f;
                    v6lVar17.g = true;
                    v6lVar17.n = false;
                    v6lVar17.l = bxzVar;
                    v6lVar17.a();
                } else {
                    if (!(b9zVar instanceof b9z.c)) {
                        uhc.a();
                        return;
                    }
                    b9z.c cVar = (b9z.c) b9zVar;
                    j90 j90Var = cVar.b;
                    if (j90Var != null) {
                        v6lVar17.k = null;
                        v6lVar17.i = 9205357640488583168L;
                        v6lVar17.h = 0L;
                        v6lVar17.j = 0.0f;
                        v6lVar17.g = true;
                        v6lVar17.n = false;
                        v6lVar17.l = j90Var;
                        v6lVar17.a();
                    } else {
                        lz50 lz50Var = cVar.a;
                        v6lVar17.h(Float.intBitsToFloat((int) (lz50Var.h >> 32)), (((long) Float.floatToRawIntBits(lz50Var.a)) << 32) | (((long) Float.floatToRawIntBits(lz50Var.b)) & j), (((long) Float.floatToRawIntBits(lz50Var.b())) << 32) | (((long) Float.floatToRawIntBits(lz50Var.a())) & j));
                    }
                }
                if ((b9zVar instanceof b9z.a) && Build.VERSION.SDK_INT < 33 && (function0 = this.e) != null) {
                    function0.invoke();
                }
            }
        }
        this.C = no50Var.a;
        if (i2 != 0 || z) {
            int i8 = Build.VERSION.SDK_INT;
            AndroidComposeView androidComposeView = this.c;
            if (i8 >= 26) {
                o7k0.a(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (androidComposeView.f) {
                androidComposeView.u(0.0f);
            }
        }
    }

    @Override // defpackage.vgz
    public final long d(long j, boolean z) {
        float[] fArrM;
        if (z) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.H ? j : ddv.b(fArrM, j);
    }

    @Override // defpackage.vgz
    public final void destroy() {
        duw duwVar;
        Reference referencePoll;
        this.d = null;
        this.e = null;
        this.i = true;
        boolean z = this.y;
        AndroidComposeView androidComposeView = this.c;
        if (z) {
            this.y = false;
            ArrayList arrayList = androidComposeView.O;
            if (!androidComposeView.Q) {
                arrayList.remove(this);
                ArrayList arrayList2 = androidComposeView.P;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                }
            }
        }
        t6l t6lVar = this.b;
        if (t6lVar != null) {
            t6lVar.a(this.a);
            e4p e4pVar = androidComposeView.L0;
            do {
                ReferenceQueue referenceQueue = (ReferenceQueue) e4pVar.b;
                duwVar = (duw) e4pVar.a;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    duwVar.j(referencePoll);
                }
            } while (referencePoll != null);
            duwVar.b(new WeakReference(this, (ReferenceQueue) e4pVar.b));
            androidComposeView.O.remove(this);
        }
    }

    @Override // defpackage.vgz
    public final void e(Function2<? super lc6, ? super v6l, Unit> function2, Function0<Unit> function0) {
        t6l t6lVar = this.b;
        if (t6lVar == null) {
            throw w20.a("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.a.s) {
            wkn.a("layer should have been released before reuse");
        }
        this.a = t6lVar.c();
        this.i = false;
        this.d = function2;
        this.e = function0;
        this.F = false;
        this.G = false;
        this.H = true;
        ddv.d(this.v);
        float[] fArr = this.w;
        if (fArr != null) {
            ddv.d(fArr);
        }
        this.D = jsg0.b;
        this.I = false;
        this.f = 9223372034707292159L;
        this.E = null;
        this.C = 0;
    }

    @Override // defpackage.vgz
    public final void f(long j) {
        if (jxo.b(j, this.f)) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.f) {
            androidComposeView.u(-4.0f);
        }
        this.f = j;
        if (this.y || this.i) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.y) {
            this.y = true;
            ArrayList arrayList = androidComposeView.O;
            if (!androidComposeView.Q) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList2 = androidComposeView.P;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                androidComposeView.P = arrayList2;
            }
            arrayList2.add(this);
        }
    }

    @Override // defpackage.vgz
    public final void g(lc6 lc6Var, v6l v6lVar) {
        k();
        this.I = this.a.a.N() > 0.0f;
        qc6 qc6Var = this.B;
        qc6.b bVar = qc6Var.b;
        bVar.e(lc6Var);
        bVar.b = v6lVar;
        y6l.a(qc6Var, this.a);
    }

    @Override // defpackage.vgz
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // defpackage.vgz
    public final boolean h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        v6l v6lVar = this.a;
        if (!v6lVar.w) {
            return true;
        }
        b9z b9zVarE = v6lVar.e();
        if (b9zVarE instanceof b9z.b) {
            lk40 lk40Var = ((b9z.b) b9zVarE).a;
            if (lk40Var.a <= fIntBitsToFloat && fIntBitsToFloat < lk40Var.c && lk40Var.b <= fIntBitsToFloat2 && fIntBitsToFloat2 < lk40Var.d) {
                return true;
            }
        } else {
            if (!(b9zVarE instanceof b9z.c)) {
                if (b9zVarE instanceof b9z.a) {
                    return tx80.a(((b9z.a) b9zVarE).a, fIntBitsToFloat, fIntBitsToFloat2);
                }
                uhc.a();
                return false;
            }
            lz50 lz50Var = ((b9z.c) b9zVarE).a;
            float f = lz50Var.a;
            long j2 = lz50Var.f;
            long j3 = lz50Var.h;
            long j4 = lz50Var.g;
            float f2 = lz50Var.d;
            float f3 = lz50Var.b;
            float f4 = lz50Var.c;
            long j5 = lz50Var.e;
            if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                int i = (int) (j5 >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                int i2 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= lz50Var.b()) {
                    int i3 = (int) (j3 >> 32);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                    int i4 = (int) (j4 >> 32);
                    if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= lz50Var.b()) {
                        int i5 = (int) (j5 & 4294967295L);
                        int i6 = (int) (j3 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= lz50Var.a()) {
                            int i7 = (int) (j2 & 4294967295L);
                            int i8 = (int) (j4 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= lz50Var.a()) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f;
                                float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                                float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                                float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                                if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                    return tx80.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, lz50Var.e);
                                }
                                if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                    return tx80.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, lz50Var.h);
                                }
                                if (fIntBitsToFloat > fIntBitsToFloat7 && fIntBitsToFloat2 < fIntBitsToFloat8) {
                                    return tx80.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, lz50Var.f);
                                }
                                if (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) {
                                    return true;
                                }
                                return tx80.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, lz50Var.g);
                            }
                        }
                    }
                }
                j90 j90VarA = m90.a();
                bxz.s(j90VarA, lz50Var);
                return tx80.a(j90VarA, fIntBitsToFloat, fIntBitsToFloat2);
            }
        }
        return false;
    }

    @Override // defpackage.vgz
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            ddv.g(fArr, fArrL);
        }
    }

    @Override // defpackage.vgz
    public final void invalidate() {
        if (this.y || this.i) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.y) {
            this.y = true;
            ArrayList arrayList = androidComposeView.O;
            if (!androidComposeView.Q) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList2 = androidComposeView.P;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                androidComposeView.P = arrayList2;
            }
            arrayList2.add(this);
        }
    }

    @Override // defpackage.vgz
    public final void j(long j) {
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.f) {
            androidComposeView.u(-4.0f);
        }
        v6l v6lVar = this.a;
        if (!iwo.b(v6lVar.t, j)) {
            v6lVar.t = j;
            v6lVar.a.i((int) (j >> 32), v6lVar.u, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            o7k0.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    @Override // defpackage.vgz
    public final void k() {
        if (this.y) {
            if (!jsg0.a(this.D, jsg0.b) && !jxo.b(this.a.u, this.f)) {
                v6l v6lVar = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.D >> 32)) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.D & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!gly.c(v6lVar.v, jFloatToRawIntBits)) {
                    v6lVar.v = jFloatToRawIntBits;
                    v6lVar.a.J(jFloatToRawIntBits);
                }
            }
            this.a.f(this.z, this.A, this.f, this.J);
            if (this.y) {
                this.y = false;
                AndroidComposeView androidComposeView = this.c;
                ArrayList arrayList = androidComposeView.O;
                if (androidComposeView.Q) {
                    return;
                }
                arrayList.remove(this);
                ArrayList arrayList2 = androidComposeView.P;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                }
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.w;
        if (fArrA == null) {
            fArrA = ddv.a();
            this.w = fArrA;
        }
        if (this.G) {
            this.G = false;
            float[] fArrM = m();
            if (this.H) {
                return fArrM;
            }
            if (!r0p.a(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z = this.F;
        float[] fArr = this.v;
        if (z) {
            v6l v6lVar = this.a;
            long jA = v6lVar.v;
            androidx.compose.ui.graphics.layer.a aVar = v6lVar.a;
            if ((9223372034707292159L & jA) == 9205357640488583168L) {
                jA = wo9.a(kc6.d(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
            float fZ = aVar.z();
            float fY = aVar.y();
            float fL = aVar.L();
            float fS = aVar.s();
            float fX = aVar.x();
            float fG = aVar.G();
            float fO = aVar.O();
            double d = ((double) fL) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fY * fCos) - (1.0f * fSin);
            float f3 = (1.0f * fCos) + (fY * fSin);
            double d2 = ((double) fS) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fZ * fCos2);
            float f10 = (f3 * fCos2) + ((-fZ) * fSin2);
            double d3 = ((double) fX) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fG;
            float f16 = f14 * fG;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fG;
            float f18 = f12 * fO;
            float f19 = fCos * fCos3 * fO;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fO;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.F = false;
            this.H = fdv.a(fArr);
        }
        return fArr;
    }
}
