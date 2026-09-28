package defpackage;

import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.layout.z;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class xkt extends y implements civ, x5w {
    public static final a D = a.a;
    public final q A;
    public s160 B;
    public rtw<b0, stw<lyi0<tsr>>> C;
    public b f;
    public Function1<? super r160, Unit> i;
    public hi10 v;
    public boolean w;
    public boolean y;
    public boolean z;

    public static final class a extends qlr implements Function1<hi10, Unit> {
        public static final a a = new a(1);

        /* JADX WARN: Code duplicated, block: B:22:0x005e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0060 A[LOOP:0: B:13:0x0029->B:23:0x0060, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x0063 A[EDGE_INSN: B:29:0x0063->B:24:0x0063 BREAK  A[LOOP:0: B:13:0x0029->B:23:0x0060], SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(hi10 hi10Var) {
            hi10 hi10Var2 = hi10Var;
            if (hi10Var2.Z0()) {
                xkt xktVar = hi10Var2.b;
                a aVar = xkt.D;
                if (!xktVar.z) {
                    Function1<r160, Unit> function1M = hi10Var2.a.m();
                    rtw<b0, stw<lyi0<tsr>>> rtwVar = xktVar.C;
                    if (function1M != null) {
                        xktVar.I0(hi10Var2, 9223372034707292159L, 0L);
                        xktVar.i = function1M;
                    } else if (rtwVar != null) {
                        Object[] objArr = rtwVar.c;
                        long[] jArr = rtwVar.a;
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
                                            xktVar.V0((stw) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                        rtwVar.g();
                    }
                }
            }
            return Unit.a;
        }
    }

    public final class b implements r160 {
        public boolean a;
        public long b = 9223372034707292159L;
        public long c = 0;

        public b() {
        }

        @Override // defpackage.r160
        public final void F0(b0 b0Var, float f) {
            xkt xktVar = xkt.this;
            s160 s160Var = xktVar.B;
            if (s160Var == null) {
                s160Var = new s160();
                xktVar.B = s160Var;
            }
            int iD = ay0.D(b0Var, s160Var.b);
            if (iD >= 0) {
                float[] fArr = s160Var.c;
                if (fArr[iD] != f) {
                    fArr[iD] = f;
                    s160Var.d[iD] = 1;
                    return;
                } else {
                    byte[] bArr = s160Var.d;
                    if (bArr[iD] == 2) {
                        bArr[iD] = 0;
                        return;
                    }
                    return;
                }
            }
            int i = s160Var.a;
            b0[] b0VarArr = s160Var.b;
            if (i == b0VarArr.length) {
                int i2 = i * 2;
                s160Var.b = (b0[]) Arrays.copyOf(b0VarArr, i2);
                s160Var.c = Arrays.copyOf(s160Var.c, i2);
                s160Var.d = Arrays.copyOf(s160Var.d, i2);
            }
            s160Var.b[i] = b0Var;
            s160Var.d[i] = 3;
            s160Var.c[i] = f;
            s160Var.a++;
        }

        @Override // defpackage.r160
        public final urr f1() {
            this.a = true;
            xkt xktVar = xkt.this;
            urr urrVarF1 = xktVar.f1();
            if (iwo.b(this.b, 9223372034707292159L)) {
                this.b = jwo.a(urrVarF1.w(0L));
                this.c = urrVarF1.a();
            }
            xktVar.T1().V.b();
            return urrVarF1;
        }

        @Override // defpackage.mmd
        public final float getDensity() {
            return xkt.this.getDensity();
        }

        @Override // defpackage.mmd
        public final float y1() {
            return xkt.this.y1();
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ hi10 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, hi10 hi10Var) {
            super(0);
            this.b = j;
            this.c = j2;
            this.d = hi10Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            xkt xktVar = xkt.this;
            xktVar.S0().a = false;
            xktVar.S0().b = this.b;
            xktVar.S0().c = this.c;
            Function1<r160, Unit> function1M = this.d.a.m();
            if (function1M != null) {
                function1M.invoke(xktVar.S0());
            }
            return Unit.a;
        }
    }

    public static final class d implements biv {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<kt, Integer> c;
        public final /* synthetic */ Function1<r160, Unit> d;
        public final /* synthetic */ Function1<y.a, Unit> e;
        public final /* synthetic */ xkt f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2, xkt xktVar) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
            this.e = function2;
            this.f = xktVar;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.b;
        }

        @Override // defpackage.biv
        public final int c() {
            return this.a;
        }

        @Override // defpackage.biv
        public final void l() {
            this.e.invoke(this.f.A);
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.d;
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.c;
        }
    }

    public xkt() {
        z.a aVar = z.a;
        this.A = new q(this);
    }

    public static void T0(ywx ywxVar) {
        vsr vsrVar;
        ywx ywxVar2 = ywxVar.H;
        tsr tsrVar = ywxVar.E;
        if (!Intrinsics.g(ywxVar2 != null ? ywxVar2.E : null, tsrVar)) {
            tsrVar.V.p.N.g();
            return;
        }
        pt ptVarA = tsrVar.V.p.A();
        if (ptVarA == null || (vsrVar = ((zhv) ptVarA).N) == null) {
            return;
        }
        vsrVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(tsr tsrVar, b0 b0Var) {
        char c2;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c3;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        rtw<b0, stw<lyi0<tsr>>> rtwVar = this.C;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (rtwVar != null) {
            Object[] objArr = rtwVar.c;
            long[] jArr3 = rtwVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c4) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c3 = c4;
                                stw stwVar = (stw) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = stwVar.b;
                                long[] jArr4 = stwVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c3) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    tsr tsrVar2 = (tsr) ((lyi0) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (tsrVar2 != null) {
                                                        boolean zE = tsrVar2.e();
                                                        i4 = i8;
                                                        if (zE) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    stwVar.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c3 = c4;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c4 = c3;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c2 = c4;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c4 = c2;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c2 = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c2 = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        rtw<b0, stw<lyi0<tsr>>> rtwVar2 = this.C;
        if (rtwVar2 != null) {
            long[] jArr5 = rtwVar2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c2) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((stw) rtwVar2.c[i18]).b()) {
                                    rtwVar2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        rtw<b0, stw<lyi0<tsr>>> rtwVar3 = this.C;
        if (rtwVar3 == null) {
            rtwVar3 = new rtw<>((Object) null);
            this.C = rtwVar3;
        }
        stw<lyi0<tsr>> stwVarD = rtwVar3.d(b0Var);
        if (stwVarD == null) {
            stwVarD = new stw<>((Object) null);
            rtwVar3.m(b0Var, stwVarD);
        }
        stwVarD.k(new lyi0<>(tsrVar));
    }

    @Override // defpackage.x5w
    public final void E(boolean z) {
        xkt xktVarQ0 = Q0();
        tsr tsrVarT1 = xktVarQ0 != null ? xktVarQ0.T1() : null;
        if (Intrinsics.g(tsrVarT1, T1())) {
            this.w = z;
            return;
        }
        if ((tsrVarT1 != null ? tsrVarT1.V.d : null) != tsr.d.c) {
            if ((tsrVarT1 != null ? tsrVarT1.V.d : null) != tsr.d.d) {
                return;
            }
        }
        this.w = z;
    }

    public abstract int G0(kt ktVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(hi10 hi10Var, long j, long j2) {
        boolean z;
        char c2;
        long j3;
        long j4;
        long j5;
        tsr tsrVar;
        boolean z2;
        int i;
        char c3;
        long j6;
        ghz snapshotObserver;
        rtw<b0, stw<lyi0<tsr>>> rtwVar = this.C;
        s160 s160Var = this.B;
        if (s160Var == null) {
            s160Var = new s160();
            this.B = s160Var;
        }
        s160 s160Var2 = s160Var;
        wgz wgzVar = T1().C;
        if (wgzVar != null && (snapshotObserver = wgzVar.getSnapshotObserver()) != null) {
            snapshotObserver.a(hi10Var, D, new c(j, j2, hi10Var));
        }
        boolean zQ0 = q0();
        stw<lyi0<tsr>> stwVar = s160Var2.e;
        stw<b0> stwVar2 = s160Var2.f;
        int i2 = s160Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = s160Var2.d[i3];
            if (b2 == 3) {
                b0 b0Var = s160Var2.b[i3];
                b0Var.getClass();
                stwVar2.k(b0Var);
            } else if (b2 != 0 && rtwVar != null) {
                b0 b0Var2 = s160Var2.b[i3];
                b0Var2.getClass();
                stw<lyi0<tsr>> stwVarK = rtwVar.k(b0Var2);
                if (stwVarK != null) {
                    stwVar.j(stwVarK);
                }
            }
        }
        int i4 = s160Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = s160Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                b0[] b0VarArr = s160Var2.b;
                b0VarArr[i6 - i5] = b0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = s160Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            s160Var2.b[i8] = null;
        }
        s160Var2.a -= i5;
        xkt xktVarQ0 = Q0();
        Object[] objArr = stwVar2.b;
        long[] jArr = stwVar2.a;
        int length = jArr.length - 2;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c4) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c3 = c4;
                            b0 b0Var3 = (b0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            xkt xktVar = xktVarQ0 == null ? this : xktVarQ0;
                            i = i9;
                            xkt xktVar2 = xktVar;
                            while (true) {
                                s160 s160Var3 = xktVar2.B;
                                if (s160Var3 != null) {
                                    z2 = zQ0;
                                    if (ay0.s(b0Var3, s160Var3.b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zQ0;
                                xkt xktVarQ1 = xktVar2.Q0();
                                if (xktVarQ1 == null) {
                                    break;
                                }
                                xktVar2 = xktVarQ1;
                                zQ0 = z2;
                            }
                            rtw<b0, stw<lyi0<tsr>>> rtwVar2 = xktVar2.C;
                            stw<lyi0<tsr>> stwVarK2 = rtwVar2 != null ? rtwVar2.k(b0Var3) : null;
                            if (stwVarK2 != null) {
                                xktVar.V0(stwVarK2);
                            }
                        } else {
                            z2 = zQ0;
                            i = i9;
                            c3 = c4;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c4 = c3;
                        j7 = j6;
                        i9 = i;
                        zQ0 = z2;
                    }
                    z = zQ0;
                    c2 = c4;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zQ0;
                    c2 = c4;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c4 = c2;
                j7 = j3;
                zQ0 = z;
                i9 = 8;
            }
        } else {
            z = zQ0;
            c2 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        stwVar2.e();
        Object[] objArr2 = stwVar.b;
        long[] jArr2 = stwVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c2) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (tsrVar = (tsr) ((lyi0) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                tsrVar.e0(false);
                            } else {
                                tsrVar.g0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        stwVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    public final void J0(biv bivVar) {
        long j;
        long j2;
        rtw<b0, stw<lyi0<tsr>>> rtwVar = this.C;
        if (this.z) {
            return;
        }
        Function1<r160, Unit> function1M = bivVar.m();
        if (function1M != null) {
            boolean z = this.i != function1M;
            if (z || !S0().a) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                urr urrVarF1 = f1();
                long jA = jwo.a(urrVarF1.w(0L));
                long jA2 = urrVarF1.a();
                j2 = jA;
                j = jA2;
                z = (iwo.b(jA, S0().b) && jxo.b(jA2, S0().c)) ? false : true;
            }
            if (z) {
                hi10 hi10Var = this.v;
                if (hi10Var != null) {
                    hi10Var.a = bivVar;
                } else {
                    hi10Var = new hi10(bivVar, this);
                    this.v = hi10Var;
                }
                I0(hi10Var, j2, j);
                this.i = bivVar.m();
                return;
            }
            return;
        }
        if (rtwVar != null) {
            Object[] objArr = rtwVar.c;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                V0((stw) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
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
            rtwVar.g();
        }
    }

    public abstract xkt K0();

    @Override // androidx.compose.ui.layout.t
    public final biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wkn.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i, i2, map, function1, function2, this);
    }

    public abstract boolean N0();

    public abstract biv O0();

    public abstract xkt Q0();

    public abstract long R0();

    public final b S0() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    @Override // defpackage.civ
    public abstract tsr T1();

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(stw<lyi0<tsr>> stwVar) {
        tsr tsrVar;
        Object[] objArr = stwVar.b;
        long[] jArr = stwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (tsrVar = (tsr) ((lyi0) objArr[(i << 3) + i3]).get()) != null) {
                        if (q0()) {
                            tsrVar.e0(false);
                        } else {
                            tsrVar.g0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void W0();

    @Override // defpackage.eiv
    public final int f0(kt ktVar) {
        int iG0;
        if (!N0() || (iG0 = G0(ktVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ktVar instanceof t2i0;
        long j = this.e;
        return iG0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    public abstract urr f1();

    @Override // defpackage.nzo
    public boolean q0() {
        return false;
    }
}
