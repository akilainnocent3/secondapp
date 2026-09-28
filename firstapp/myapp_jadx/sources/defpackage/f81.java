package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.i;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class f81 {

    public static final class a implements Function0<Unit> {
        public final /* synthetic */ double a;
        public final /* synthetic */ ytw<Double> b;

        public a(double d, ytw<Double> ytwVar) {
            this.a = d;
            this.b = ytwVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.b.setValue(Double.valueOf(this.a));
            return Unit.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(u71 u71Var, List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            Double d = (Double) this.a.get(num.intValue());
            d.doubleValue();
            return d;
        }
    }

    public static final class c implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class d implements iaj<tur, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ ytw i;

        public d(List list, long j, long j2, long j3, long j4, long j5, ytw ytwVar) {
            this.a = list;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.i = ytwVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.iaj
        public final Unit d(tur turVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            tur turVar2 = turVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(turVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                double dDoubleValue = ((Number) this.a.get(iIntValue)).doubleValue();
                aVar2.N(2058375035);
                ytw ytwVar = this.i;
                boolean zC = Intrinsics.c((Double) ytwVar.getValue(), dDoubleValue);
                String str = Double.isInfinite(dDoubleValue) ? "∞" : String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf((long) dDoubleValue)}, 1));
                boolean zF = aVar2.f(dDoubleValue);
                Object objY = aVar2.y();
                if (zF || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new a(dDoubleValue, ytwVar);
                    aVar2.r(objY);
                }
                f81.f(str, zC, (Function0) objY, this.b, this.c, this.d, this.e, this.f, aVar2, 14380032);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0166  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0183  */
    /* JADX WARN: Code duplicated, block: B:113:0x018c  */
    /* JADX WARN: Code duplicated, block: B:115:0x019c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01df  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0202  */
    /* JADX WARN: Code duplicated, block: B:146:0x0258  */
    /* JADX WARN: Code duplicated, block: B:149:0x0268  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:94:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x015a  */
    public static final void a(final String str, final ArrayList<Double> arrayList, final Function0<Unit> function0, final Function1<? super Double, Unit> function1, ytw<Double> ytwVar, final String str2, ytw<Double> ytwVar2, ytw<Double> ytwVar3, ytw<Double> ytwVar4, final ytw<Double> ytwVar5, final ytw<Double> ytwVar6, final Function0<Unit> function2, final Function0<Unit> function3, Function0<Unit> function4, final Function0<Unit> function5, final Function0<Unit> function6, final String str3, final String str4, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        ytw<Double> ytwVarA;
        int i4;
        int i5;
        final ytw<Double> ytwVarA2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final Function0<Unit> function7;
        int i11;
        int i12;
        boolean z3;
        final ytw<Double> ytwVar7;
        final ytw<Double> ytwVar8;
        final ytw<Double> ytwVar9;
        final ytw<Double> ytwVar10;
        final Function0<Unit> function8;
        e eVarZ;
        int i13;
        ytw<Double> ytwVarA3;
        Object objY;
        final ytw<Double> ytwVar11;
        final Function0<Unit> function9;
        int i14;
        final ytw<Double> ytwVar12;
        int i15;
        int i16;
        function0.getClass();
        function1.getClass();
        str3.getClass();
        str4.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(85920530);
        int i17 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(arrayList) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        int i18 = i3 & 16;
        int i19 = Http2.INITIAL_MAX_FRAME_SIZE;
        if (i18 == 0) {
            ytwVarA = ytwVar;
            int i20 = bVarI.M(ytwVarA) ? 16384 : 8192;
            int i21 = i17 | i20;
            if (bVarI.M(str2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            int i22 = i21 | i4;
            if ((i3 & 64) == 0 || !bVarI.M(ytwVar2)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            int i23 = i22 | i5;
            if ((i3 & 128) == 0) {
                ytwVarA2 = ytwVar3;
                if (bVarI.M(ytwVarA2)) {
                    i6 = 8388608;
                }
                int i24 = i23 | i6 | 33554432;
                if (bVarI.M(ytwVar5)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i8 = i24 | i7;
                if (bVarI.M(ytwVar6)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i10 = i2 | i9;
                if ((i2 & 48) == 0) {
                    if (bVarI.A(function2)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i10 |= i16;
                }
                if ((i2 & 384) == 0) {
                    function7 = function3;
                    if (bVarI.A(function7)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i10 |= i15;
                } else {
                    function7 = function3;
                }
                i11 = i10 | 3072;
                if ((i2 & 24576) == 0) {
                    if (!bVarI.A(function5)) {
                        i19 = 8192;
                    }
                    i12 = i11 | i19;
                } else {
                    i12 = i11;
                }
                if ((i2 & 196608) == 0) {
                    i12 |= bVarI.A(function6) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i12 |= bVarI.M(str3) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    i12 |= bVarI.M(str4) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i12 |= bVarI.b(z) ? 67108864 : 33554432;
                }
                if ((i2 & 805306368) == 0) {
                    i12 |= bVarI.b(z2) ? 536870912 : 268435456;
                }
                if ((i8 & 306783379) == 306783378 || (i12 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i8 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if ((i3 & 16) != 0) {
                            i13 = i8 & (-57345);
                            ytwVarA = i.a(0.0d);
                        } else {
                            i13 = i8;
                        }
                        if ((i3 & 64) != 0) {
                            ytwVarA3 = i.a(0.0d);
                            i13 &= -3670017;
                        } else {
                            ytwVarA3 = ytwVar2;
                        }
                        if ((i3 & 128) != 0) {
                            i13 &= -29360129;
                            ytwVarA2 = i.a(0.0d);
                        }
                        fsw fswVarA = i.a(0.0d);
                        int i25 = i13 & (-234881025);
                        objY = bVarI.y();
                        ytw<Double> ytwVar13 = ytwVarA3;
                        if (objY == androidx.compose.runtime.a.C0041a.a) {
                            objY = new n71();
                            bVarI.r(objY);
                        }
                        ytwVar11 = ytwVar13;
                        function9 = (Function0) objY;
                        i14 = i25;
                        ytwVar12 = fswVarA;
                    } else {
                        bVarI.G();
                        int i26 = (i3 & 16) != 0 ? i8 & (-57345) : i8;
                        if ((i3 & 64) != 0) {
                            i26 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i26 &= -29360129;
                        }
                        i14 = i26 & (-234881025);
                        ytwVar12 = ytwVar4;
                        function9 = function4;
                        ytwVar11 = ytwVar2;
                    }
                    final ytw<Double> ytwVar14 = ytwVarA;
                    bVarI.Y();
                    u60.a(function0, new yle(true, false, false), pp8.b(-996552855, new Function2() { // from class: w71
                        /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            final Window window;
                            boolean z4;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                                if (parent == null) {
                                    window = null;
                                } else {
                                    eme emeVar = parent instanceof eme ? (eme) parent : null;
                                    if (emeVar != null) {
                                        window = emeVar.getWindow();
                                    } else {
                                        window = null;
                                    }
                                }
                                boolean zA = aVar2.A(window);
                                Object objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: y71
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Window window2 = window;
                                            if (window2 != null) {
                                                window2.setGravity(80);
                                            }
                                            if (window2 != null) {
                                                window2.setBackgroundDrawable(new ColorDrawable(0));
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                use useVar = xvf.a;
                                aVar2.t((Function0) objY2);
                                Object objY3 = aVar2.y();
                                if (objY3 == c0042a) {
                                    objY3 = m.b(0);
                                    aVar2.r(objY3);
                                }
                                ytw ytwVar15 = (ytw) objY3;
                                float fU1 = ((mmd) aVar2.O(kna.h)).u1(((Number) ytwVar15.getValue()).intValue());
                                d.a aVar3 = d.a.b;
                                d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.6f, j58.b), zk40.a);
                                n54 n54Var = ht.a.a;
                                aiv aivVarC = g75.c(n54Var, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarB);
                                yka.k.getClass();
                                tsr.a aVar4 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar = yka.a.f;
                                hlh0.a(aVar2, aivVarC, bVar);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                                n54 n54Var2 = ht.a.h;
                                d dVarG = j.g(dVar2.b(aVar3, n54Var2), 1.0f);
                                Object objY4 = aVar2.y();
                                if (objY4 == c0042a) {
                                    z4 = false;
                                    objY4 = new z71(ytwVar15, 0);
                                    aVar2.r(objY4);
                                } else {
                                    z4 = false;
                                }
                                d dVarA = w.a(dVarG, (Function1) objY4);
                                aiv aivVarC2 = g75.c(n54Var, z4);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarA);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, aivVarC2, bVar);
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                op5.a.getClass();
                                String str5 = str2;
                                f81.b(str, arrayList, function0, function1, op5.i(str5), aVar2, 0);
                                aVar2.s();
                                ytw ytwVar16 = ytwVar11;
                                double dDoubleValue = ((Number) ytwVar16.getValue()).doubleValue();
                                ytw ytwVar17 = ytwVarA2;
                                ytw ytwVar18 = ytwVar12;
                                ytw ytwVar19 = ytwVar5;
                                ytw ytwVar20 = ytwVar6;
                                if (dDoubleValue > 0.0d || ((Number) ytwVar17.getValue()).doubleValue() > 0.0d || ((Number) ytwVar18.getValue()).doubleValue() > 0.0d || ((Number) ytwVar19.getValue()).doubleValue() > 0.0d || ((Number) ytwVar20.getValue()).doubleValue() > 0.0d) {
                                    aVar2.N(-999630311);
                                    f81.e(str5, ((Number) ytwVar16.getValue()).doubleValue(), ((Number) ytwVar17.getValue()).doubleValue(), ((Number) ytwVar18.getValue()).doubleValue(), ((Number) ytwVar19.getValue()).doubleValue(), ((Number) ytwVar20.getValue()).doubleValue(), function2, function7, function9, function5, function6, str3, str4, z, z2, ytwVar14, abk0.a(h.j(dVar2.b(aVar3, n54Var2), 16.0f, 0.0f, 16.0f, fU1 + 12.0f, 2), 999.0f), aVar2, 0);
                                    aVar2 = aVar2;
                                } else {
                                    aVar2.N(-1004826221);
                                }
                                aVar2.H();
                                aVar2.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, ((i14 >> 6) & 14) | 432, 0);
                    ytwVar7 = ytwVar11;
                    ytwVar8 = ytwVarA2;
                    ytwVar10 = ytwVar12;
                    function8 = function9;
                    ytwVar9 = ytwVar14;
                } else {
                    bVarI.G();
                    ytwVar7 = ytwVar2;
                    ytwVar8 = ytwVarA2;
                    ytwVar9 = ytwVarA;
                    ytwVar10 = ytwVar4;
                    function8 = function4;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(str, arrayList, function0, function1, ytwVar9, str2, ytwVar7, ytwVar8, ytwVar10, ytwVar5, ytwVar6, function2, function3, function8, function5, function6, str3, str4, z, z2, i, i2, i3) { // from class: x71
                        public final /* synthetic */ Function0 A;
                        public final /* synthetic */ Function0 B;
                        public final /* synthetic */ Function0 C;
                        public final /* synthetic */ Function0 D;
                        public final /* synthetic */ Function0 E;
                        public final /* synthetic */ String F;
                        public final /* synthetic */ String G;
                        public final /* synthetic */ boolean H;
                        public final /* synthetic */ boolean I;
                        public final /* synthetic */ int J;
                        public final /* synthetic */ int K;
                        public final /* synthetic */ String a;
                        public final /* synthetic */ ArrayList b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ ytw e;
                        public final /* synthetic */ String f;
                        public final /* synthetic */ ytw i;
                        public final /* synthetic */ ytw v;
                        public final /* synthetic */ ytw w;
                        public final /* synthetic */ ytw y;
                        public final /* synthetic */ ytw z;

                        {
                            this.J = i2;
                            this.K = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            int iA2 = qj40.a(this.J);
                            f81.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (a) obj, iA, iA2, this.K);
                            return Unit.a;
                        }
                    };
                }
            }
            ytwVarA2 = ytwVar3;
            i6 = 4194304;
            int i27 = i23 | i6 | 33554432;
            if (bVarI.M(ytwVar5)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i8 = i27 | i7;
            if (bVarI.M(ytwVar6)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i10 = i2 | i9;
            if ((i2 & 48) == 0) {
                if (bVarI.A(function2)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i10 |= i16;
            }
            if ((i2 & 384) == 0) {
                function7 = function3;
                if (bVarI.A(function7)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i10 |= i15;
            } else {
                function7 = function3;
            }
            i11 = i10 | 3072;
            if ((i2 & 24576) == 0) {
                if (!bVarI.A(function5)) {
                    i19 = 8192;
                }
                i12 = i11 | i19;
            } else {
                i12 = i11;
            }
            if ((i2 & 196608) == 0) {
                i12 |= bVarI.A(function6) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i12 |= bVarI.M(str3) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i12 |= bVarI.M(str4) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i12 |= bVarI.b(z) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i12 |= bVarI.b(z2) ? 536870912 : 268435456;
            }
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bVarI.q(i8 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if ((i3 & 16) != 0) {
                        i13 = i8 & (-57345);
                        ytwVarA = i.a(0.0d);
                    } else {
                        i13 = i8;
                    }
                    if ((i3 & 64) != 0) {
                        ytwVarA3 = i.a(0.0d);
                        i13 &= -3670017;
                    } else {
                        ytwVarA3 = ytwVar2;
                    }
                    if ((i3 & 128) != 0) {
                        i13 &= -29360129;
                        ytwVarA2 = i.a(0.0d);
                    }
                    fsw fswVarA2 = i.a(0.0d);
                    int i28 = i13 & (-234881025);
                    objY = bVarI.y();
                    ytw<Double> ytwVar15 = ytwVarA3;
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new n71();
                        bVarI.r(objY);
                    }
                    ytwVar11 = ytwVar15;
                    function9 = (Function0) objY;
                    i14 = i28;
                    ytwVar12 = fswVarA2;
                } else {
                    if ((i3 & 16) != 0) {
                        i13 = i8 & (-57345);
                        ytwVarA = i.a(0.0d);
                    } else {
                        i13 = i8;
                    }
                    if ((i3 & 64) != 0) {
                        ytwVarA3 = i.a(0.0d);
                        i13 &= -3670017;
                    } else {
                        ytwVarA3 = ytwVar2;
                    }
                    if ((i3 & 128) != 0) {
                        i13 &= -29360129;
                        ytwVarA2 = i.a(0.0d);
                    }
                    fsw fswVarA3 = i.a(0.0d);
                    int i29 = i13 & (-234881025);
                    objY = bVarI.y();
                    ytw<Double> ytwVar16 = ytwVarA3;
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new n71();
                        bVarI.r(objY);
                    }
                    ytwVar11 = ytwVar16;
                    function9 = (Function0) objY;
                    i14 = i29;
                    ytwVar12 = fswVarA3;
                }
                final ytw ytwVar17 = ytwVarA;
                bVarI.Y();
                u60.a(function0, new yle(true, false, false), pp8.b(-996552855, new Function2() { // from class: w71
                    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final Window window;
                        boolean z4;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                            if (parent == null) {
                                window = null;
                            } else {
                                eme emeVar = parent instanceof eme ? (eme) parent : null;
                                if (emeVar != null) {
                                    window = emeVar.getWindow();
                                } else {
                                    window = null;
                                }
                            }
                            boolean zA = aVar2.A(window);
                            Object objY2 = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: y71
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window2 = window;
                                        if (window2 != null) {
                                            window2.setGravity(80);
                                        }
                                        if (window2 != null) {
                                            window2.setBackgroundDrawable(new ColorDrawable(0));
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            use useVar = xvf.a;
                            aVar2.t((Function0) objY2);
                            Object objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = m.b(0);
                                aVar2.r(objY3);
                            }
                            ytw ytwVar18 = (ytw) objY3;
                            float fU1 = ((mmd) aVar2.O(kna.h)).u1(((Number) ytwVar18.getValue()).intValue());
                            d.a aVar3 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.6f, j58.b), zk40.a);
                            n54 n54Var = ht.a.a;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                            n54 n54Var2 = ht.a.h;
                            d dVarG = j.g(dVar2.b(aVar3, n54Var2), 1.0f);
                            Object objY4 = aVar2.y();
                            if (objY4 == c0042a) {
                                z4 = false;
                                objY4 = new z71(ytwVar18, 0);
                                aVar2.r(objY4);
                            } else {
                                z4 = false;
                            }
                            d dVarA = w.a(dVarG, (Function1) objY4);
                            aiv aivVarC2 = g75.c(n54Var, z4);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarA);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op5.a.getClass();
                            String str5 = str2;
                            f81.b(str, arrayList, function0, function1, op5.i(str5), aVar2, 0);
                            aVar2.s();
                            ytw ytwVar19 = ytwVar11;
                            double dDoubleValue = ((Number) ytwVar19.getValue()).doubleValue();
                            ytw ytwVar110 = ytwVarA2;
                            ytw ytwVar111 = ytwVar12;
                            ytw ytwVar112 = ytwVar5;
                            ytw ytwVar20 = ytwVar6;
                            if (dDoubleValue > 0.0d || ((Number) ytwVar110.getValue()).doubleValue() > 0.0d || ((Number) ytwVar111.getValue()).doubleValue() > 0.0d || ((Number) ytwVar112.getValue()).doubleValue() > 0.0d || ((Number) ytwVar20.getValue()).doubleValue() > 0.0d) {
                                aVar2.N(-999630311);
                                f81.e(str5, ((Number) ytwVar19.getValue()).doubleValue(), ((Number) ytwVar110.getValue()).doubleValue(), ((Number) ytwVar111.getValue()).doubleValue(), ((Number) ytwVar112.getValue()).doubleValue(), ((Number) ytwVar20.getValue()).doubleValue(), function2, function7, function9, function5, function6, str3, str4, z, z2, ytwVar17, abk0.a(h.j(dVar2.b(aVar3, n54Var2), 16.0f, 0.0f, 16.0f, fU1 + 12.0f, 2), 999.0f), aVar2, 0);
                                aVar2 = aVar2;
                            } else {
                                aVar2.N(-1004826221);
                            }
                            aVar2.H();
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i14 >> 6) & 14) | 432, 0);
                ytwVar7 = ytwVar11;
                ytwVar8 = ytwVarA2;
                ytwVar10 = ytwVar12;
                function8 = function9;
                ytwVar9 = ytwVar17;
            } else {
                bVarI.G();
                ytwVar7 = ytwVar2;
                ytwVar8 = ytwVarA2;
                ytwVar9 = ytwVarA;
                ytwVar10 = ytwVar4;
                function8 = function4;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2(str, arrayList, function0, function1, ytwVar9, str2, ytwVar7, ytwVar8, ytwVar10, ytwVar5, ytwVar6, function2, function3, function8, function5, function6, str3, str4, z, z2, i, i2, i3) { // from class: x71
                    public final /* synthetic */ Function0 A;
                    public final /* synthetic */ Function0 B;
                    public final /* synthetic */ Function0 C;
                    public final /* synthetic */ Function0 D;
                    public final /* synthetic */ Function0 E;
                    public final /* synthetic */ String F;
                    public final /* synthetic */ String G;
                    public final /* synthetic */ boolean H;
                    public final /* synthetic */ boolean I;
                    public final /* synthetic */ int J;
                    public final /* synthetic */ int K;
                    public final /* synthetic */ String a;
                    public final /* synthetic */ ArrayList b;
                    public final /* synthetic */ Function0 c;
                    public final /* synthetic */ Function1 d;
                    public final /* synthetic */ ytw e;
                    public final /* synthetic */ String f;
                    public final /* synthetic */ ytw i;
                    public final /* synthetic */ ytw v;
                    public final /* synthetic */ ytw w;
                    public final /* synthetic */ ytw y;
                    public final /* synthetic */ ytw z;

                    {
                        this.J = i2;
                        this.K = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1);
                        int iA2 = qj40.a(this.J);
                        f81.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (a) obj, iA, iA2, this.K);
                        return Unit.a;
                    }
                };
            }
        }
        ytwVarA = ytwVar;
        int i210 = i17 | i20;
        if (bVarI.M(str2)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i211 = i210 | i4;
        if ((i3 & 64) == 0) {
            i5 = 524288;
        } else {
            i5 = 524288;
        }
        int i212 = i211 | i5;
        if ((i3 & 128) == 0) {
            ytwVarA2 = ytwVar3;
            if (bVarI.M(ytwVarA2)) {
                i6 = 8388608;
            }
            int i213 = i212 | i6 | 33554432;
            if (bVarI.M(ytwVar5)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i8 = i213 | i7;
            if (bVarI.M(ytwVar6)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i10 = i2 | i9;
            if ((i2 & 48) == 0) {
                if (bVarI.A(function2)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i10 |= i16;
            }
            if ((i2 & 384) == 0) {
                function7 = function3;
                if (bVarI.A(function7)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i10 |= i15;
            } else {
                function7 = function3;
            }
            i11 = i10 | 3072;
            if ((i2 & 24576) == 0) {
                if (!bVarI.A(function5)) {
                    i19 = 8192;
                }
                i12 = i11 | i19;
            } else {
                i12 = i11;
            }
            if ((i2 & 196608) == 0) {
                i12 |= bVarI.A(function6) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i12 |= bVarI.M(str3) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i12 |= bVarI.M(str4) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i12 |= bVarI.b(z) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i12 |= bVarI.b(z2) ? 536870912 : 268435456;
            }
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bVarI.q(i8 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if ((i3 & 16) != 0) {
                        i13 = i8 & (-57345);
                        ytwVarA = i.a(0.0d);
                    } else {
                        i13 = i8;
                    }
                    if ((i3 & 64) != 0) {
                        ytwVarA3 = i.a(0.0d);
                        i13 &= -3670017;
                    } else {
                        ytwVarA3 = ytwVar2;
                    }
                    if ((i3 & 128) != 0) {
                        i13 &= -29360129;
                        ytwVarA2 = i.a(0.0d);
                    }
                    fsw fswVarA4 = i.a(0.0d);
                    int i214 = i13 & (-234881025);
                    objY = bVarI.y();
                    ytw<Double> ytwVar18 = ytwVarA3;
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new n71();
                        bVarI.r(objY);
                    }
                    ytwVar11 = ytwVar18;
                    function9 = (Function0) objY;
                    i14 = i214;
                    ytwVar12 = fswVarA4;
                } else {
                    if ((i3 & 16) != 0) {
                        i13 = i8 & (-57345);
                        ytwVarA = i.a(0.0d);
                    } else {
                        i13 = i8;
                    }
                    if ((i3 & 64) != 0) {
                        ytwVarA3 = i.a(0.0d);
                        i13 &= -3670017;
                    } else {
                        ytwVarA3 = ytwVar2;
                    }
                    if ((i3 & 128) != 0) {
                        i13 &= -29360129;
                        ytwVarA2 = i.a(0.0d);
                    }
                    fsw fswVarA5 = i.a(0.0d);
                    int i215 = i13 & (-234881025);
                    objY = bVarI.y();
                    ytw<Double> ytwVar19 = ytwVarA3;
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new n71();
                        bVarI.r(objY);
                    }
                    ytwVar11 = ytwVar19;
                    function9 = (Function0) objY;
                    i14 = i215;
                    ytwVar12 = fswVarA5;
                }
                final ytw ytwVar110 = ytwVarA;
                bVarI.Y();
                u60.a(function0, new yle(true, false, false), pp8.b(-996552855, new Function2() { // from class: w71
                    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final Window window;
                        boolean z4;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                            if (parent == null) {
                                window = null;
                            } else {
                                eme emeVar = parent instanceof eme ? (eme) parent : null;
                                if (emeVar != null) {
                                    window = emeVar.getWindow();
                                } else {
                                    window = null;
                                }
                            }
                            boolean zA = aVar2.A(window);
                            Object objY2 = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: y71
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Window window2 = window;
                                        if (window2 != null) {
                                            window2.setGravity(80);
                                        }
                                        if (window2 != null) {
                                            window2.setBackgroundDrawable(new ColorDrawable(0));
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            use useVar = xvf.a;
                            aVar2.t((Function0) objY2);
                            Object objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = m.b(0);
                                aVar2.r(objY3);
                            }
                            ytw ytwVar111 = (ytw) objY3;
                            float fU1 = ((mmd) aVar2.O(kna.h)).u1(((Number) ytwVar111.getValue()).intValue());
                            d.a aVar3 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.6f, j58.b), zk40.a);
                            n54 n54Var = ht.a.a;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                            n54 n54Var2 = ht.a.h;
                            d dVarG = j.g(dVar2.b(aVar3, n54Var2), 1.0f);
                            Object objY4 = aVar2.y();
                            if (objY4 == c0042a) {
                                z4 = false;
                                objY4 = new z71(ytwVar111, 0);
                                aVar2.r(objY4);
                            } else {
                                z4 = false;
                            }
                            d dVarA = w.a(dVarG, (Function1) objY4);
                            aiv aivVarC2 = g75.c(n54Var, z4);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarA);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op5.a.getClass();
                            String str5 = str2;
                            f81.b(str, arrayList, function0, function1, op5.i(str5), aVar2, 0);
                            aVar2.s();
                            ytw ytwVar112 = ytwVar11;
                            double dDoubleValue = ((Number) ytwVar112.getValue()).doubleValue();
                            ytw ytwVar113 = ytwVarA2;
                            ytw ytwVar114 = ytwVar12;
                            ytw ytwVar115 = ytwVar5;
                            ytw ytwVar20 = ytwVar6;
                            if (dDoubleValue > 0.0d || ((Number) ytwVar113.getValue()).doubleValue() > 0.0d || ((Number) ytwVar114.getValue()).doubleValue() > 0.0d || ((Number) ytwVar115.getValue()).doubleValue() > 0.0d || ((Number) ytwVar20.getValue()).doubleValue() > 0.0d) {
                                aVar2.N(-999630311);
                                f81.e(str5, ((Number) ytwVar112.getValue()).doubleValue(), ((Number) ytwVar113.getValue()).doubleValue(), ((Number) ytwVar114.getValue()).doubleValue(), ((Number) ytwVar115.getValue()).doubleValue(), ((Number) ytwVar20.getValue()).doubleValue(), function2, function7, function9, function5, function6, str3, str4, z, z2, ytwVar110, abk0.a(h.j(dVar2.b(aVar3, n54Var2), 16.0f, 0.0f, 16.0f, fU1 + 12.0f, 2), 999.0f), aVar2, 0);
                                aVar2 = aVar2;
                            } else {
                                aVar2.N(-1004826221);
                            }
                            aVar2.H();
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i14 >> 6) & 14) | 432, 0);
                ytwVar7 = ytwVar11;
                ytwVar8 = ytwVarA2;
                ytwVar10 = ytwVar12;
                function8 = function9;
                ytwVar9 = ytwVar110;
            } else {
                bVarI.G();
                ytwVar7 = ytwVar2;
                ytwVar8 = ytwVarA2;
                ytwVar9 = ytwVarA;
                ytwVar10 = ytwVar4;
                function8 = function4;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2(str, arrayList, function0, function1, ytwVar9, str2, ytwVar7, ytwVar8, ytwVar10, ytwVar5, ytwVar6, function2, function3, function8, function5, function6, str3, str4, z, z2, i, i2, i3) { // from class: x71
                    public final /* synthetic */ Function0 A;
                    public final /* synthetic */ Function0 B;
                    public final /* synthetic */ Function0 C;
                    public final /* synthetic */ Function0 D;
                    public final /* synthetic */ Function0 E;
                    public final /* synthetic */ String F;
                    public final /* synthetic */ String G;
                    public final /* synthetic */ boolean H;
                    public final /* synthetic */ boolean I;
                    public final /* synthetic */ int J;
                    public final /* synthetic */ int K;
                    public final /* synthetic */ String a;
                    public final /* synthetic */ ArrayList b;
                    public final /* synthetic */ Function0 c;
                    public final /* synthetic */ Function1 d;
                    public final /* synthetic */ ytw e;
                    public final /* synthetic */ String f;
                    public final /* synthetic */ ytw i;
                    public final /* synthetic */ ytw v;
                    public final /* synthetic */ ytw w;
                    public final /* synthetic */ ytw y;
                    public final /* synthetic */ ytw z;

                    {
                        this.J = i2;
                        this.K = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1);
                        int iA2 = qj40.a(this.J);
                        f81.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (a) obj, iA, iA2, this.K);
                        return Unit.a;
                    }
                };
            }
        }
        ytwVarA2 = ytwVar3;
        i6 = 4194304;
        int i216 = i212 | i6 | 33554432;
        if (bVarI.M(ytwVar5)) {
            i7 = 536870912;
        } else {
            i7 = 268435456;
        }
        i8 = i216 | i7;
        if (bVarI.M(ytwVar6)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        i10 = i2 | i9;
        if ((i2 & 48) == 0) {
            if (bVarI.A(function2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            function7 = function3;
            if (bVarI.A(function7)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        } else {
            function7 = function3;
        }
        i11 = i10 | 3072;
        if ((i2 & 24576) == 0) {
            if (!bVarI.A(function5)) {
                i19 = 8192;
            }
            i12 = i11 | i19;
        } else {
            i12 = i11;
        }
        if ((i2 & 196608) == 0) {
            i12 |= bVarI.A(function6) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i12 |= bVarI.M(str3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i12 |= bVarI.M(str4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i12 |= bVarI.b(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i12 |= bVarI.b(z2) ? 536870912 : 268435456;
        }
        if ((i8 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bVarI.q(i8 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if ((i3 & 16) != 0) {
                    i13 = i8 & (-57345);
                    ytwVarA = i.a(0.0d);
                } else {
                    i13 = i8;
                }
                if ((i3 & 64) != 0) {
                    ytwVarA3 = i.a(0.0d);
                    i13 &= -3670017;
                } else {
                    ytwVarA3 = ytwVar2;
                }
                if ((i3 & 128) != 0) {
                    i13 &= -29360129;
                    ytwVarA2 = i.a(0.0d);
                }
                fsw fswVarA6 = i.a(0.0d);
                int i217 = i13 & (-234881025);
                objY = bVarI.y();
                ytw<Double> ytwVar111 = ytwVarA3;
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new n71();
                    bVarI.r(objY);
                }
                ytwVar11 = ytwVar111;
                function9 = (Function0) objY;
                i14 = i217;
                ytwVar12 = fswVarA6;
            } else {
                if ((i3 & 16) != 0) {
                    i13 = i8 & (-57345);
                    ytwVarA = i.a(0.0d);
                } else {
                    i13 = i8;
                }
                if ((i3 & 64) != 0) {
                    ytwVarA3 = i.a(0.0d);
                    i13 &= -3670017;
                } else {
                    ytwVarA3 = ytwVar2;
                }
                if ((i3 & 128) != 0) {
                    i13 &= -29360129;
                    ytwVarA2 = i.a(0.0d);
                }
                fsw fswVarA7 = i.a(0.0d);
                int i218 = i13 & (-234881025);
                objY = bVarI.y();
                ytw<Double> ytwVar112 = ytwVarA3;
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new n71();
                    bVarI.r(objY);
                }
                ytwVar11 = ytwVar112;
                function9 = (Function0) objY;
                i14 = i218;
                ytwVar12 = fswVarA7;
            }
            final ytw ytwVar113 = ytwVarA;
            bVarI.Y();
            u60.a(function0, new yle(true, false, false), pp8.b(-996552855, new Function2() { // from class: w71
                /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final Window window;
                    boolean z4;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                        if (parent == null) {
                            window = null;
                        } else {
                            eme emeVar = parent instanceof eme ? (eme) parent : null;
                            if (emeVar != null) {
                                window = emeVar.getWindow();
                            } else {
                                window = null;
                            }
                        }
                        boolean zA = aVar2.A(window);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: y71
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Window window2 = window;
                                    if (window2 != null) {
                                        window2.setGravity(80);
                                    }
                                    if (window2 != null) {
                                        window2.setBackgroundDrawable(new ColorDrawable(0));
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        use useVar = xvf.a;
                        aVar2.t((Function0) objY2);
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = m.b(0);
                            aVar2.r(objY3);
                        }
                        ytw ytwVar114 = (ytw) objY3;
                        float fU1 = ((mmd) aVar2.O(kna.h)).u1(((Number) ytwVar114.getValue()).intValue());
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.6f, j58.b), zk40.a);
                        n54 n54Var = ht.a.a;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        n54 n54Var2 = ht.a.h;
                        d dVarG = j.g(dVar2.b(aVar3, n54Var2), 1.0f);
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            z4 = false;
                            objY4 = new z71(ytwVar114, 0);
                            aVar2.r(objY4);
                        } else {
                            z4 = false;
                        }
                        d dVarA = w.a(dVarG, (Function1) objY4);
                        aiv aivVarC2 = g75.c(n54Var, z4);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarA);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        op5.a.getClass();
                        String str5 = str2;
                        f81.b(str, arrayList, function0, function1, op5.i(str5), aVar2, 0);
                        aVar2.s();
                        ytw ytwVar115 = ytwVar11;
                        double dDoubleValue = ((Number) ytwVar115.getValue()).doubleValue();
                        ytw ytwVar116 = ytwVarA2;
                        ytw ytwVar117 = ytwVar12;
                        ytw ytwVar118 = ytwVar5;
                        ytw ytwVar20 = ytwVar6;
                        if (dDoubleValue > 0.0d || ((Number) ytwVar116.getValue()).doubleValue() > 0.0d || ((Number) ytwVar117.getValue()).doubleValue() > 0.0d || ((Number) ytwVar118.getValue()).doubleValue() > 0.0d || ((Number) ytwVar20.getValue()).doubleValue() > 0.0d) {
                            aVar2.N(-999630311);
                            f81.e(str5, ((Number) ytwVar115.getValue()).doubleValue(), ((Number) ytwVar116.getValue()).doubleValue(), ((Number) ytwVar117.getValue()).doubleValue(), ((Number) ytwVar118.getValue()).doubleValue(), ((Number) ytwVar20.getValue()).doubleValue(), function2, function7, function9, function5, function6, str3, str4, z, z2, ytwVar113, abk0.a(h.j(dVar2.b(aVar3, n54Var2), 16.0f, 0.0f, 16.0f, fU1 + 12.0f, 2), 999.0f), aVar2, 0);
                            aVar2 = aVar2;
                        } else {
                            aVar2.N(-1004826221);
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i14 >> 6) & 14) | 432, 0);
            ytwVar7 = ytwVar11;
            ytwVar8 = ytwVarA2;
            ytwVar10 = ytwVar12;
            function8 = function9;
            ytwVar9 = ytwVar113;
        } else {
            bVarI.G();
            ytwVar7 = ytwVar2;
            ytwVar8 = ytwVarA2;
            ytwVar9 = ytwVarA;
            ytwVar10 = ytwVar4;
            function8 = function4;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, arrayList, function0, function1, ytwVar9, str2, ytwVar7, ytwVar8, ytwVar10, ytwVar5, ytwVar6, function2, function3, function8, function5, function6, str3, str4, z, z2, i, i2, i3) { // from class: x71
                public final /* synthetic */ Function0 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ Function0 E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ int J;
                public final /* synthetic */ int K;
                public final /* synthetic */ String a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ ytw e;
                public final /* synthetic */ String f;
                public final /* synthetic */ ytw i;
                public final /* synthetic */ ytw v;
                public final /* synthetic */ ytw w;
                public final /* synthetic */ ytw y;
                public final /* synthetic */ ytw z;

                {
                    this.J = i2;
                    this.K = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    int iA2 = qj40.a(this.J);
                    f81.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (a) obj, iA, iA2, this.K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final ArrayList<Double> arrayList, final Function0<Unit> function0, final Function1<? super Double, Unit> function1, final String str2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-35461045);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(arrayList) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int iT = StringsKt.T(upperCase, str2, 0, false, 6);
                Double dH = iT != -1 ? kotlin.text.b.h(kotlin.text.c.p(fu5.a("[^0-9.,]", upperCase.substring(iT + 3), ""), ",", "", false)) : null;
                objY2 = Double.valueOf(dH != null ? dH.doubleValue() : 100.0d);
                bVarI.r(objY2);
            }
            final double dDoubleValue = ((Number) objY2).doubleValue();
            i060 i060VarE = j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12);
            long jD = r58.d(4279900959L);
            final long jD2 = r58.d(4280427821L);
            final long jD3 = r58.d(4282006596L);
            final long jD4 = r58.d(4289310135L);
            final long jD5 = r58.d(4282293037L);
            final long j = j58.f;
            final long jD6 = r58.d(4279506459L);
            final long jD7 = r58.d(4287402396L);
            List listK = kotlin.collections.b.k(new j58(r58.d(4284732988L)), new j58(r58.d(4281240366L)));
            ya5.a aVar2 = ya5.a;
            final hfs hfsVarH = ya5.a.h(aVar2, listK, 0.0f, 0.0f, 14);
            final hfs hfsVarH2 = ya5.a.h(aVar2, kotlin.collections.b.k(new j58(r58.d(4282579458L)), new j58(r58.d(4282305284L))), 0.0f, 0.0f, 14);
            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
            Function2 function2 = new Function2() { // from class: a81
                /* JADX WARN: Code duplicated, block: B:48:0x02ee  */
                /* JADX WARN: Code duplicated, block: B:50:0x02f8  */
                /* JADX WARN: Code duplicated, block: B:52:0x0305  */
                /* JADX WARN: Code duplicated, block: B:54:0x031c  */
                /* JADX WARN: Code duplicated, block: B:55:0x0320  */
                /* JADX WARN: Code duplicated, block: B:57:0x0421  */
                /* JADX WARN: Code duplicated, block: B:60:0x0443  */
                /* JADX WARN: Code duplicated, block: B:61:0x0448  */
                /* JADX WARN: Code duplicated, block: B:64:0x044d  */
                /* JADX WARN: Code duplicated, block: B:65:0x044f  */
                /* JADX WARN: Code duplicated, block: B:71:0x0478  */
                /* JADX WARN: Code duplicated, block: B:74:0x04c0  */
                /* JADX WARN: Code duplicated, block: B:76:0x04c9  */
                /* JADX WARN: Code duplicated, block: B:78:0x04d1  */
                /* JADX WARN: Code duplicated, block: B:83:0x04f1  */
                /* JADX WARN: Code duplicated, block: B:89:0x050a  */
                /* JADX WARN: Code duplicated, block: B:91:0x0590  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Throwable, qx80] */
                /* JADX WARN: Type inference failed for: r6v28 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    yka.a.C1350a c1350a;
                    boolean z2;
                    a.C0041a.C0042a c0042a2;
                    final ytw ytwVar2;
                    Double d2;
                    op5 op5Var;
                    ?? r6;
                    nk0 nk0Var;
                    Double d3;
                    double dDoubleValue2;
                    float f;
                    final Function1 function3;
                    boolean zM;
                    Object objY3;
                    final ytw ytwVar3;
                    aiv aivVarC;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    boolean zM2;
                    Object objY4;
                    double dDoubleValue3;
                    int i3;
                    String str3;
                    boolean z3;
                    nk0 nk0VarM;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d.a aVar4 = d.a.b;
                        d dVarC2 = c.c(aVar3, aVar4);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar3, i78VarA, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC2, cVar);
                        d dVarB = androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), jD2, zk40.a);
                        n54 n54Var = ht.a.a;
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode3 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO3 = aVar3.o();
                        d dVarC3 = c.c(aVar3, dVarB);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC2, bVar2);
                        hlh0.a(aVar3, ne00VarO3, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        op5 op5Var2 = op5.a;
                        String strC = op5.c(op5Var2, "auto_bet:sg_common", "Auto Bet");
                        qyd0 qyd0Var = gah0.a;
                        imf0 imf0VarB = imf0.b(((eah0) aVar3.O(qyd0Var)).h, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                        long j2 = j58.f;
                        n54 n54Var2 = ht.a.e;
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        yka.a.C1350a c1350a3 = c1350a;
                        lkf0.b(strC, dVar2.b(aVar4, n54Var2), j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarB, aVar3, 384, 0, 65528);
                        Function0 function4 = function0;
                        boolean zM3 = aVar3.M(function4);
                        Object objY5 = aVar3.y();
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (zM3 || objY5 == c0042a3) {
                            z2 = false;
                            objY5 = new d81(function4, 0);
                            aVar3.r(objY5);
                        } else {
                            z2 = false;
                        }
                        c6n.b((Function0) objY5, dVar2.b(aVar4, ht.a.f), false, null, mr8.a, aVar3, 196608, 28);
                        aVar3.s();
                        ty0.a(aVar3, j.i(aVar4, 12.0f));
                        lkf0.b(op5.c(op5Var2, "number_of_rounds:sg_common", "Number of Rounds"), h.g(aVar4, 16.0f, 8.0f), j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) aVar3.O(qyd0Var)).k, 0L, 0L, t9i.C, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), aVar3, 432, 0, 65528);
                        ty0.a(aVar3, j.i(aVar4, 10.0f));
                        p7l.a aVar6 = new p7l.a(2);
                        kw0.i iVar = new kw0.i(10.0f, true, new hw0());
                        kw0.i iVar2 = new kw0.i(10.0f, true, new hw0());
                        d dVarH = h.h(j.g(aVar4, 1.0f), 16.0f, 0.0f, 2);
                        final ArrayList arrayList2 = arrayList;
                        boolean zA = aVar3.A(arrayList2);
                        Object objY6 = aVar3.y();
                        ytw ytwVar4 = ytwVar;
                        if (zA) {
                            c0042a2 = c0042a3;
                        } else {
                            c0042a2 = c0042a3;
                            if (objY6 != c0042a2) {
                                ytwVar2 = ytwVar4;
                            }
                            a.C0041a.C0042a c0042a4 = c0042a2;
                            iur.a(aVar6, dVarH, null, null, iVar2, iVar, null, false, null, (Function1) objY6, aVar3, 102432816, 0, 668);
                            ty0.a(aVar3, j.i(aVar4, 14.0f));
                            d2 = (Double) ytwVar2.getValue();
                            if (d2 != null) {
                                dDoubleValue3 = d2.doubleValue();
                                if (Double.isInfinite(dDoubleValue3)) {
                                    nk0VarM = new nk0("Auto bet will continue until stopped.");
                                    op5Var = op5Var2;
                                    z3 = false;
                                } else {
                                    double d4 = dDoubleValue * dDoubleValue3;
                                    TreeMap treeMap = pw.a;
                                    String strA = oxc.a(str2, " ", pw.m(d4));
                                    if (Double.isInfinite(dDoubleValue3)) {
                                        str3 = "∞";
                                        i3 = 1;
                                    } else {
                                        i3 = 1;
                                        str3 = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf((long) dDoubleValue3)}, 1));
                                    }
                                    z3 = false;
                                    nk0.b bVar3 = new nk0.b((Object) null);
                                    bVar3.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                    op5Var = op5Var2;
                                    bVar3.g("(".concat(op5.c(op5Var, "a_bet_of:sg_common", "A bet of ")));
                                    t9i t9iVar = t9i.E;
                                    bVar3.l(new ora0(0L, 0L, t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
                                    bVar3.g(strA);
                                    bVar3.h();
                                    bVar3.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                    bVar3.g(op5.c(op5Var, "will_be_placed_in_the_next:sg_common", "will be placed in the next "));
                                    bVar3.l(new ora0(0L, 0L, t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
                                    bVar3.g(str3);
                                    bVar3.h();
                                    bVar3.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                    bVar3.g(op5.c(op5Var, "rounds:sg_common", "rounds").concat(")"));
                                    nk0VarM = bVar3.m();
                                }
                                nk0Var = nk0VarM;
                                r6 = z3;
                            } else {
                                op5Var = op5Var2;
                                r6 = 0;
                                nk0Var = null;
                            }
                            f81.c(str, nk0Var, aVar3, 0);
                            d dVarG2 = h.g(wtc.b(aVar4, 14.0f, aVar3, aVar4, 1.0f), 16.0f, 4.0f);
                            d3 = (Double) ytwVar2.getValue();
                            if (d3 != null) {
                                dDoubleValue2 = d3.doubleValue();
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            if (dDoubleValue2 > 0.0d) {
                                f = 1.0f;
                            } else {
                                f = 0.45f;
                            }
                            d dVarA = ls7.a(j.i(dw.a(dVarG2, f), 54.0f), j060.c(12.0f));
                            function3 = function1;
                            zM = aVar3.M(function3);
                            objY3 = aVar3.y();
                            if (!zM || objY3 == c0042a4) {
                                ytwVar3 = ytwVar2;
                                objY3 = new Function0() { // from class: o71
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Double d5 = (Double) ytwVar3.getValue();
                                        if (d5 != null) {
                                            function3.invoke(d5);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY3);
                            } else {
                                ytwVar3 = ytwVar2;
                            }
                            d dVarB2 = d35.b(androidx.compose.foundation.a.a(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY3, 15), hfsVarH, r6, 0.0f, 6), 1.0f, hfsVarH2, j060.c(12.0f));
                            aivVarC = g75.c(n54Var, false);
                            iHashCode = Long.hashCode(aVar3.m());
                            ne00VarO = aVar3.o();
                            dVarC = c.c(aVar3, dVarB2);
                            if (aVar3.k() != null) {
                                l2a.b();
                                throw r6;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar5);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, aivVarC, bVar2);
                            hlh0.a(aVar3, ne00VarO, dVar);
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar3, iHashCode, c1350a3);
                            }
                            hlh0.a(aVar3, dVarC, cVar);
                            zM2 = aVar3.M(function3);
                            objY4 = aVar3.y();
                            if (zM2 || objY4 == c0042a4) {
                                objY4 = new Function0() { // from class: p71
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Double d5 = (Double) ytwVar3.getValue();
                                        if (d5 != null) {
                                            function3.invoke(d5);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY4);
                            }
                            nk5.c((Function0) objY4, j.e(aVar4, 1.0f), false, null, ek5.g(j2, 0L, aVar3, 13), null, null, null, mr8.b, aVar3, 805306416, 492);
                            aVar3.s();
                            ty0.a(aVar3, j.i(aVar4, 4.0f));
                            lkf0.b(op5.c(op5Var, "auto_bet_stop_text:sg_common", "Number of Rounds"), h.i(new HorizontalAlignElement(ht.a.n), 16.0f, 4.0f, 16.0f, 16.0f), jD4, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.c(((eah0) aVar3.O(qyd0Var)).l), aVar3, 384, 0, 65528);
                            aVar3.s();
                        }
                        final long j3 = jD3;
                        final long j4 = jD5;
                        final long j5 = jD6;
                        final long j6 = j;
                        final long j7 = jD7;
                        ytwVar2 = ytwVar4;
                        objY6 = new Function1() { // from class: e81
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                lvr lvrVar = (lvr) obj3;
                                lvrVar.getClass();
                                u71 u71Var = new u71(0);
                                ArrayList arrayList3 = arrayList2;
                                lvrVar.c(arrayList3.size(), new f81.b(u71Var, arrayList3), new f81.c(arrayList3), new op8(-1117249557, new f81.d(arrayList3, j3, j4, j5, j6, j7, ytwVar2), true));
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY6);
                        a.C0041a.C0042a c0042a5 = c0042a2;
                        iur.a(aVar6, dVarH, null, null, iVar2, iVar, null, false, null, (Function1) objY6, aVar3, 102432816, 0, 668);
                        ty0.a(aVar3, j.i(aVar4, 14.0f));
                        d2 = (Double) ytwVar2.getValue();
                        if (d2 != null) {
                            dDoubleValue3 = d2.doubleValue();
                            if (Double.isInfinite(dDoubleValue3)) {
                                nk0VarM = new nk0("Auto bet will continue until stopped.");
                                op5Var = op5Var2;
                                z3 = false;
                            } else {
                                double d5 = dDoubleValue * dDoubleValue3;
                                TreeMap treeMap2 = pw.a;
                                String strA2 = oxc.a(str2, " ", pw.m(d5));
                                if (Double.isInfinite(dDoubleValue3)) {
                                    str3 = "∞";
                                    i3 = 1;
                                } else {
                                    i3 = 1;
                                    str3 = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf((long) dDoubleValue3)}, 1));
                                }
                                z3 = false;
                                nk0.b bVar4 = new nk0.b((Object) null);
                                bVar4.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                op5Var = op5Var2;
                                bVar4.g("(".concat(op5.c(op5Var, "a_bet_of:sg_common", "A bet of ")));
                                t9i t9iVar2 = t9i.E;
                                bVar4.l(new ora0(0L, 0L, t9iVar2, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
                                bVar4.g(strA2);
                                bVar4.h();
                                bVar4.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                bVar4.g(op5.c(op5Var, "will_be_placed_in_the_next:sg_common", "will be placed in the next "));
                                bVar4.l(new ora0(0L, 0L, t9iVar2, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
                                bVar4.g(str3);
                                bVar4.h();
                                bVar4.l(new ora0(0L, 0L, (t9i) null, new n9i(i3), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527));
                                bVar4.g(op5.c(op5Var, "rounds:sg_common", "rounds").concat(")"));
                                nk0VarM = bVar4.m();
                            }
                            nk0Var = nk0VarM;
                            r6 = z3;
                        } else {
                            op5Var = op5Var2;
                            r6 = 0;
                            nk0Var = null;
                        }
                        f81.c(str, nk0Var, aVar3, 0);
                        d dVarG3 = h.g(wtc.b(aVar4, 14.0f, aVar3, aVar4, 1.0f), 16.0f, 4.0f);
                        d3 = (Double) ytwVar2.getValue();
                        if (d3 != null) {
                            dDoubleValue2 = d3.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        if (dDoubleValue2 > 0.0d) {
                            f = 1.0f;
                        } else {
                            f = 0.45f;
                        }
                        d dVarA2 = ls7.a(j.i(dw.a(dVarG3, f), 54.0f), j060.c(12.0f));
                        function3 = function1;
                        zM = aVar3.M(function3);
                        objY3 = aVar3.y();
                        if (zM) {
                            ytwVar3 = ytwVar2;
                            objY3 = new Function0() { // from class: o71
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Double d6 = (Double) ytwVar3.getValue();
                                    if (d6 != null) {
                                        function3.invoke(d6);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY3);
                        } else {
                            ytwVar3 = ytwVar2;
                            objY3 = new Function0() { // from class: o71
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Double d6 = (Double) ytwVar3.getValue();
                                    if (d6 != null) {
                                        function3.invoke(d6);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY3);
                        }
                        d dVarB3 = d35.b(androidx.compose.foundation.a.a(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY3, 15), hfsVarH, r6, 0.0f, 6), 1.0f, hfsVarH2, j060.c(12.0f));
                        aivVarC = g75.c(n54Var, false);
                        iHashCode = Long.hashCode(aVar3.m());
                        ne00VarO = aVar3.o();
                        dVarC = c.c(aVar3, dVarB3);
                        if (aVar3.k() != null) {
                            l2a.b();
                            throw r6;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, bVar2);
                        hlh0.a(aVar3, ne00VarO, dVar);
                        if (aVar3.g()) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a3);
                        } else {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a3);
                        }
                        hlh0.a(aVar3, dVarC, cVar);
                        zM2 = aVar3.M(function3);
                        objY4 = aVar3.y();
                        if (zM2) {
                            objY4 = new Function0() { // from class: p71
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Double d6 = (Double) ytwVar3.getValue();
                                    if (d6 != null) {
                                        function3.invoke(d6);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY4);
                        } else {
                            objY4 = new Function0() { // from class: p71
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Double d6 = (Double) ytwVar3.getValue();
                                    if (d6 != null) {
                                        function3.invoke(d6);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY4);
                        }
                        nk5.c((Function0) objY4, j.e(aVar4, 1.0f), false, null, ek5.g(j2, 0L, aVar3, 13), null, null, null, mr8.b, aVar3, 805306416, 492);
                        aVar3.s();
                        ty0.a(aVar3, j.i(aVar4, 4.0f));
                        lkf0.b(op5.c(op5Var, "auto_bet_stop_text:sg_common", "Number of Rounds"), h.i(new HorizontalAlignElement(ht.a.n), 16.0f, 4.0f, 16.0f, 16.0f), jD4, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.c(((eah0) aVar3.O(qyd0Var)).l), aVar3, 384, 0, 65528);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            };
            bVar = bVarI;
            ihe0.a(dVarG, i060VarE, jD, 0L, 0.0f, 12.0f, null, pp8.b(135699536, function2, bVar), bVar, 12804486, 72);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, arrayList, function0, function1, str2, i) { // from class: b81
                public final /* synthetic */ String a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f81.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final nk0 nk0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(235950917);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(nk0Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ihe0.a(h.g(j.g(androidx.compose.ui.d.a.b, 1.0f), 16.0f, 4.0f), j060.c(10.0f), r58.d(4280953908L), 0L, 0.0f, 0.0f, null, pp8.b(-1671395744, new Function2() { // from class: s71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = h.g(aVar3, 12.0f, 10.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        long j = j58.f;
                        qyd0 qyd0Var = gah0.a;
                        lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) aVar2.O(qyd0Var)).k, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), aVar2, 384, 0, 65530);
                        a aVar5 = aVar2;
                        nk0 nk0Var2 = nk0Var;
                        if (nk0Var2 == null || StringsKt.U(nk0Var2)) {
                            aVar5.N(-2044461480);
                        } else {
                            aVar5.N(-2025640512);
                            ty0.a(aVar5, j.i(aVar3, 4.0f));
                            lkf0.c(nk0Var2, null, r58.d(4294967295L), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((eah0) aVar5.O(qyd0Var)).l, aVar5, 384, 0, 131066);
                            aVar5 = aVar5;
                        }
                        aVar5.H();
                        aVar5.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12607878, 104);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, nk0Var, i) { // from class: t71
                public final /* synthetic */ String a;
                public final /* synthetic */ nk0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f81.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final String str, final String str2, final String str3, final boolean z, androidx.compose.ui.d dVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str4;
        androidx.compose.runtime.b bVar;
        androidx.compose.ui.d dVar2 = dVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1298400665);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= bVarI.M(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(dVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            final i060 i060VarC = j060.c(10.0f);
            List listK = kotlin.collections.b.k(new j58(r58.d(str3.equals("CASHOUT") ? 4291595264L : 4291559424L)), new j58(r58.d(str3.equals("CASHOUT") ? 4287653632L : 4287627264L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            final hfs hfsVar = new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2);
            dVar2 = dVar;
            final String str5 = str4;
            bVar = bVarI;
            ihe0.c(function0, j.i(dVar2, 48.0f), false, i060VarC, j58.l, 0L, 0.0f, 8.0f, null, null, pp8.b(1721541170, new Function2() { // from class: q71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarA = androidx.compose.foundation.a.a(ls7.a(j.e(aVar3, 1.0f), i060VarC), hfsVar, null, 0.0f, 6);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarA);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar2);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, aVar3);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar3);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        long j = j58.f;
                        lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) aVar2.O(gah0.a)).k, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), aVar2, 384, 0, 65530);
                        a aVar5 = aVar2;
                        if (str3.equals("CANCEL") && z) {
                            aVar5.N(147688124);
                            ty0.a(aVar5, j.i(aVar3, 1.0f));
                            lkf0.b(str5, null, j, b2x.a(10, aVar5), null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar5, 384, 0, 130546);
                            aVar5 = aVar5;
                        } else {
                            aVar5.N(129939508);
                        }
                        aVar5.H();
                        aVar5.s();
                        aVar5.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i3 >> 15) & 14) | 12607488, 868);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final androidx.compose.ui.d dVar3 = dVar2;
            eVarZ.d = new Function2() { // from class: r71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f81.d(str, str2, str3, z, dVar3, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final double d2, final double d3, double d4, final double d5, final double d6, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final String str2, final String str3, final boolean z, final boolean z2, final ytw ytwVar, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        double d7;
        androidx.compose.runtime.b bVar;
        boolean z3;
        yka.a.c cVar;
        boolean z4;
        androidx.compose.runtime.b bVar2;
        String str4;
        int i2;
        boolean z5;
        String str5;
        boolean z6;
        androidx.compose.runtime.b bVarI = aVar.i(-1957635275);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.f(d2) ? 32 : 16) | (bVarI.f(d3) ? 256 : 128) | (bVarI.f(d4) ? 2048 : 1024) | (bVarI.f(d5) ? 16384 : 8192) | (bVarI.f(d6) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function1) ? 8388608 : 4194304) | (bVarI.A(function2) ? 67108864 : 33554432) | (bVarI.A(function3) ? 536870912 : 268435456);
        int i4 = (bVarI.A(function4) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? 16384 : 8192) | (bVarI.M(ytwVar) ? 131072 : 65536) | (bVarI.M(dVar) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i4) == 599186) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar3, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(10.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            if (d3 > 0.0d || d2 > 0.0d || d4 > 0.0d) {
                bVarI.N(-165364202);
                String str6 = ytwVar.getValue() + "x";
                long j = j58.f;
                imf0 imf0VarG = ni60.g(imf0.b(((eah0) bVarI.O(gah0.a)).k, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), R.dimen._28sdp, bVarI);
                z3 = false;
                cVar = cVar2;
                z4 = true;
                lkf0.b(str6, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, bVarI, 384, 0, 65530);
                bVar2 = bVarI;
                bVar2.X(false);
            } else {
                bVarI.N(-179576183);
                bVarI.X(false);
                bVar2 = bVarI;
                cVar = cVar2;
                z3 = false;
                z4 = true;
            }
            androidx.compose.ui.d dVarG2 = j.g(aVar3, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(10.0f, z4, new hw0()), ht.a.j, bVar2, 6);
            int iHashCode3 = Long.hashCode(bVar2.T);
            ne00 ne00VarS3 = bVar2.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar2, dVarG2);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar2);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA, bVar3);
            hlh0.a(bVar2, ne00VarS3, dVar2);
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar2, iHashCode3, c1350a);
            }
            hlh0.a(bVar2, dVarC3, cVar);
            op5.a.getClass();
            String strI = op5.i(str);
            f160 f160Var = f160.a;
            if (d2 > r6 || d5 > 0) {
                bVar2.N(1735472373);
                if (d2 > r6) {
                    str4 = "Cashout " + strI + " " + d2;
                } else {
                    str4 = str2;
                }
                androidx.compose.runtime.b bVar4 = bVar2;
                i2 = 1720588653;
                d(str4, str3, d2 > r6 ? "CASHOUT" : "CANCEL", z, f160Var.a(1.0f, aVar3, true), d2 > r6 ? function0 : function3, bVar4, ((r17 >> 3) & 112) | (r17 & 7168));
                bVar = bVar4;
                z5 = false;
                bVar.X(false);
            } else {
                bVar2.N(1720588653);
                bVar2.X(z3);
                boolean z7 = z3;
                bVar = bVar2;
                z5 = z7;
                i2 = 1720588653;
            }
            if (d3 > 0.0d || d6 > r6) {
                bVar.N(1736061590);
                if (d3 > 0.0d) {
                    str5 = "Cashout " + strI + " " + d3;
                } else {
                    str5 = str2;
                }
                d(str5, str3, d3 > 0.0d ? "CASHOUT" : "CANCEL", z2, f160Var.a(1.0f, aVar3, true), d3 > 0.0d ? function1 : function4, bVar, (r17 >> 3) & 7280);
                z5 = false;
            } else {
                bVar.N(i2);
            }
            bVar.X(z5);
            if (d4 > r6) {
                bVar.N(1736626782);
                StringBuilder sb = new StringBuilder("Cashout ");
                sb.append(strI);
                sb.append(" ");
                d7 = d4;
                sb.append(d7);
                d(sb.toString(), str3, "CASHOUT", false, f160Var.a(1.0f, aVar3, true), function2, bVar, ((i4 >> 3) & 112) | 3456 | ((i3 >> 9) & 458752));
                z6 = false;
            } else {
                d7 = d4;
                z6 = false;
                bVar.N(i2);
            }
            bVar.X(z6);
            f30.a(bVar, true, true, true);
        } else {
            d7 = d4;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final double d8 = d7;
            eVarZ.d = new Function2(str, d2, d3, d8, d5, d6, function0, function1, function2, function3, function4, str2, str3, z, z2, ytwVar, dVar, i) { // from class: c81
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ ytw E;
                public final /* synthetic */ d F;
                public final /* synthetic */ String a;
                public final /* synthetic */ double b;
                public final /* synthetic */ double c;
                public final /* synthetic */ double d;
                public final /* synthetic */ double e;
                public final /* synthetic */ double f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f81.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final String str, final boolean z, final Function0<Unit> function0, final long j, final long j2, final long j3, final long j4, final long j5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-376321354);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            i060 i060VarC = j060.c(8.0f);
            long j6 = z ? j2 : j3;
            long j7 = z ? j58.l : j;
            long j8 = z ? j4 : j5;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(d35.a(androidx.compose.foundation.a.b(ls7.a(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 40.0f), i060VarC), j6, zk40.a), 1.5f, j7, i060VarC), false, null, null, function0, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(str, null, j8, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.e(imf0.b(((eah0) bVarI.O(gah0.a)).k, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211)), bVarI, i2 & 14, 0, 65530);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, function0, j, j2, j3, j4, j5, i) { // from class: v71
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long i;
                public final /* synthetic */ long v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(14380033);
                    f81.f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
