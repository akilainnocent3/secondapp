package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class f4a0 {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ j3a0 a;

        public a(j3a0 j3a0Var) {
            this.a = j3a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                lkf0.d(this.a.a().getMessage(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262142);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ long a;
        public final /* synthetic */ j3a0 b;
        public final /* synthetic */ String c;

        public b(long j, j3a0 j3a0Var, String str) {
            this.a = j;
            this.b = j3a0Var;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                umz umzVar = ek5.a;
                ak5 ak5VarG = ek5.g(this.a, 0L, aVar2, 13);
                final j3a0 j3a0Var = this.b;
                boolean zM = aVar2.M(j3a0Var);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function0() { // from class: g4a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            j3a0Var.b();
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                nk5.c((Function0) objY, null, false, null, ak5VarG, null, null, null, pp8.b(521110564, new h4a0(this.c), aVar2), aVar2, 805306368, 494);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ j3a0 a;

        public c(j3a0 j3a0Var) {
            this.a = j3a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                final j3a0 j3a0Var = this.a;
                boolean zM = aVar2.M(j3a0Var);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function0() { // from class: i4a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            j3a0Var.dismiss();
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                c6n.a((Function0) objY, null, false, null, null, zp9.a, aVar2, 1572864, 62);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final op8 op8Var, Function2 function2, Function2 function3, imf0 imf0Var, final long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        Function2 function4;
        long j3;
        imf0 imf0Var2;
        Function2 function5;
        androidx.compose.runtime.b bVarI = aVar.i(-264666338);
        int i2 = i | (bVarI.A(op8Var) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128) | (bVarI.M(imf0Var) ? 2048 : 1024) | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.e(j2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(j.y(aVar2, 0.0f, 600.0f, 1), 1.0f), 16.0f, 0.0f, 0.0f, 2.0f, 6);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ2 = h.j((!Float.isNaN(30.0f) ? androidx.compose.foundation.layout.a.a(aVar2, mt.a, 4) : aVar2).n(!Float.isNaN(12.0f) ? androidx.compose.foundation.layout.a.a(aVar2, mt.b, 2) : aVar2), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            w1i.a(i2 & 14, op8Var, bVarI, true);
            d dVarJ3 = h.j(new HorizontalAlignElement(ht.a.o), 0.0f, 0.0f, function3 == null ? 8.0f : 0.0f, 0.0f, 11);
            aiv aivVarC2 = g75.c(n54Var, false);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarJ3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int I4 = bVarI.I();
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I4))) {
                n30.a(I4, bVarI, I4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            chf chfVar = iza.a;
            imf0Var2 = imf0Var;
            int i3 = (i2 & 112) | 8;
            function4 = function2;
            hna.b(new j730[]{tp0.a(j, chfVar), lkf0.a.a(imf0Var2)}, function4, bVarI, i3);
            if (function3 != null) {
                bVarI.N(916269829);
                j3 = j2;
                function5 = function3;
                hna.a(chfVar.a(new j58(j3)), function5, bVarI, ((i2 >> 3) & 112) | 8);
                bVarI.X(false);
            } else {
                function5 = function3;
                j3 = j2;
                bVarI.N(916475483);
                bVarI.X(false);
            }
            f30.a(bVarI, true, true, true);
        } else {
            function4 = function2;
            j3 = j2;
            imf0Var2 = imf0Var;
            function5 = function3;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function2 function6 = function5;
            final imf0 imf0Var3 = imf0Var2;
            final Function2 function7 = function4;
            final long j4 = j3;
            eVarZ.d = new Function2(function7, function6, imf0Var3, j, j4, i) { // from class: a4a0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ imf0 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f4a0.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final op8 op8Var, Function2 function2, Function2 function3, imf0 imf0Var, final long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        Function2 function4;
        Function2 function5;
        imf0 imf0Var2;
        long j3;
        boolean z;
        int i2;
        boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(-931325388);
        int i3 = i | (bVarI.A(op8Var) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128) | (bVarI.M(imf0Var) ? 2048 : 1024) | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.e(j2) ? 131072 : 65536);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            float f = function3 == null ? 8.0f : 0.0f;
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(aVar2, 16.0f, 0.0f, f, 0.0f, 10);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new c4a0();
                bVarI.r(objY);
            }
            aiv aivVar = (aiv) objY;
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVar, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH = h.h(i.b(aVar2, "text"), 0.0f, 6.0f, 1);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            w1i.a(i3 & 14, op8Var, bVarI, true);
            if (function2 != null) {
                bVarI.N(-1014168049);
                d dVarB = i.b(aVar2, "action");
                aiv aivVarC2 = g75.c(n54Var, false);
                int I3 = bVarI.I();
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarB);
                bVarI.D();
                i2 = 8;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                    n30.a(I3, bVarI, I3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                imf0Var2 = imf0Var;
                function4 = function2;
                hna.b(new j730[]{tp0.a(j, iza.a), lkf0.a.a(imf0Var2)}, function4, bVarI, 8 | (i3 & 112));
                bVarI.X(true);
                z = false;
                bVarI.X(false);
            } else {
                function4 = function2;
                imf0Var2 = imf0Var;
                z = false;
                i2 = 8;
                bVarI.N(-1013852841);
                bVarI.X(false);
            }
            if (function3 != null) {
                bVarI.N(-1013804481);
                d dVarB2 = i.b(aVar2, "dismissAction");
                aiv aivVarC3 = g75.c(n54Var, z);
                int I4 = bVarI.I();
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarB2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I4))) {
                    n30.a(I4, bVarI, I4, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                j3 = j2;
                int i4 = i2 | ((i3 >> 3) & 112);
                function5 = function3;
                hna.a(tp0.a(j3, iza.a), function5, bVarI, i4);
                z2 = true;
                bVarI.X(true);
                bVarI.X(false);
            } else {
                function5 = function3;
                j3 = j2;
                z2 = true;
                bVarI.N(-1013535401);
                bVarI.X(z);
            }
            bVarI.X(z2);
        } else {
            function4 = function2;
            function5 = function3;
            imf0Var2 = imf0Var;
            j3 = j2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final long j4 = j3;
            final imf0 imf0Var3 = imf0Var2;
            final Function2 function6 = function5;
            final Function2 function7 = function4;
            eVarZ.d = new Function2(function7, function6, imf0Var3, j, j4, i) { // from class: z3a0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ imf0 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f4a0.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final Function2 function2, final Function2 function3, final boolean z, final qx80 qx80Var, final long j, final long j2, final long j3, final long j4, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function2 function4;
        Function2 function5;
        boolean z2;
        qx80 qx80Var2;
        int i3;
        op8 op8Var2;
        androidx.compose.runtime.b bVarI = aVar.i(-1218779924);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function2;
            i2 |= bVarI.A(function4) ? 32 : 16;
        } else {
            function4 = function2;
        }
        if ((i & 384) == 0) {
            function5 = function3;
            i2 |= bVarI.A(function5) ? 256 : 128;
        } else {
            function5 = function3;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            qx80Var2 = qx80Var;
            i2 |= bVarI.M(qx80Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            qx80Var2 = qx80Var;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.e(j3) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((100663296 & i) == 0) {
            i3 = i4 | (bVarI.e(j4) ? 67108864 : 33554432);
        } else {
            i3 = i4;
        }
        if ((805306368 & i) == 0) {
            op8Var2 = op8Var;
            i3 |= bVarI.A(op8Var2) ? 536870912 : 268435456;
        } else {
            op8Var2 = op8Var;
        }
        if (bVarI.q(i3 & 1, (i3 & 306783379) != 306783378)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            float f = k4a0.d;
            op8 op8VarB = pp8.b(-1343524879, new e4a0(z2, function4, op8Var2, function5, j3, j4), bVarI);
            int i5 = i3 >> 9;
            ihe0.a(dVar, qx80Var2, j, j2, 0.0f, f, null, op8VarB, bVarI, (i3 & 14) | 12779520 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 80);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y3a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    f4a0.c(dVar, function2, function3, z, qx80Var, j, j2, j3, j4, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:119:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:123:0x0197  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:134:0x023d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0254  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    public static final void d(final j3a0 j3a0Var, d dVar, boolean z, qx80 qx80Var, long j, long j2, long j3, long j4, long j5, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        long jD;
        long jD2;
        long jD3;
        int i6;
        int i7;
        boolean z3;
        androidx.compose.runtime.b bVar;
        final d dVar2;
        final qx80 qx80Var2;
        final boolean z4;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        e eVarZ;
        d dVar3;
        qx80 qx80VarB;
        int i8;
        long jD4;
        int i9;
        long jD5;
        qx80 qx80Var3;
        long j11;
        long j12;
        int i10;
        long j13;
        boolean z5;
        String strA;
        op8 op8VarB;
        boolean z6;
        op8 op8Var;
        int i11;
        androidx.compose.runtime.b bVarI = aVar.i(274621471);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(j3a0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i3 |= 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jD = j;
                        int i13 = bVarI.e(jD) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i3 |= i13;
                    } else {
                        jD = j;
                    }
                    i3 |= i13;
                } else {
                    jD = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jD2 = j2;
                        int i14 = bVarI.e(jD2) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        jD2 = j2;
                    }
                    i3 |= i14;
                } else {
                    jD2 = j2;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jD3 = j3;
                        int i15 = bVarI.e(jD3) ? 1048576 : 524288;
                        i3 |= i15;
                    } else {
                        jD3 = j3;
                    }
                    i3 |= i15;
                } else {
                    jD3 = j3;
                }
                if ((12582912 & i) == 0) {
                    i3 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        i11 = i3;
                        i7 = i12;
                        int i16 = bVarI.e(j5) ? 67108864 : 33554432;
                        i6 = i11 | i16;
                    } else {
                        i11 = i3;
                        i7 = i12;
                    }
                    i6 = i11 | i16;
                } else {
                    i6 = i3;
                    i7 = i12;
                }
                if ((i6 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i6 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i7 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        qx80VarB = xy80.b(k4a0.e, bVarI);
                        i8 = i6 & (-7169);
                        if ((i2 & 16) != 0) {
                            jD = g68.d(k4a0.c, bVarI);
                            i8 = i6 & (-64513);
                        }
                        if ((i2 & 32) != 0) {
                            jD2 = g68.d(k4a0.g, bVarI);
                            i8 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            jD3 = g68.d(k4a0.a, bVarI);
                            i8 &= -3670017;
                        }
                        jD4 = g68.d(k4a0.a, bVarI);
                        i9 = i8 & (-29360129);
                        if ((i2 & 256) != 0) {
                            j12 = jD2;
                            j13 = jD4;
                            jD5 = g68.d(k4a0.f, bVarI);
                            qx80Var3 = qx80VarB;
                            z5 = z2;
                            j11 = jD;
                            i10 = i8 & (-264241153);
                        } else {
                            jD5 = j5;
                            qx80Var3 = qx80VarB;
                            j11 = jD;
                            j12 = jD2;
                            i10 = i9;
                            j13 = jD4;
                            z5 = z2;
                        }
                    } else {
                        bVarI.G();
                        int i17 = i6 & (-7169);
                        if ((i2 & 16) != 0) {
                            i17 = i6 & (-64513);
                        }
                        if ((i2 & 32) != 0) {
                            i17 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        i10 = i17 & (-29360129);
                        if ((i2 & 256) != 0) {
                            i10 = i17 & (-264241153);
                        }
                        dVar3 = dVar;
                        qx80Var3 = qx80Var;
                        j13 = j4;
                        jD5 = j5;
                        z5 = z2;
                        j11 = jD;
                        j12 = jD2;
                    }
                    bVarI.Y();
                    strA = j3a0Var.a().a();
                    op8VarB = null;
                    if (strA != null) {
                        bVarI.N(-663815981);
                        op8 op8VarB2 = pp8.b(-1378313599, new b(jD3, j3a0Var, strA), bVarI);
                        z6 = false;
                        bVarI.X(false);
                        op8Var = op8VarB2;
                    } else {
                        z6 = false;
                        bVarI.N(-663517017);
                        bVarI.X(false);
                        op8Var = null;
                    }
                    if (j3a0Var.a().b()) {
                        bVarI.N(-663364652);
                        op8VarB = pp8.b(-1812633777, new c(j3a0Var), bVarI);
                        bVarI.X(z6);
                    } else {
                        bVarI.N(-662974393);
                        bVarI.X(z6);
                    }
                    int i18 = i10 << 3;
                    bVar = bVarI;
                    c(h.f(dVar3, 12.0f), op8Var, op8VarB, z5, qx80Var3, j11, j12, j13, jD5, pp8.b(-1266389126, new a(j3a0Var), bVarI), bVar, (i18 & 3670016) | (i18 & 7168) | 805306368 | (458752 & i18) | (234881024 & i10));
                    dVar2 = dVar3;
                    j8 = jD3;
                    z4 = z5;
                    qx80Var2 = qx80Var3;
                    j6 = j11;
                    j7 = j12;
                    j9 = j13;
                    j10 = jD5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    qx80Var2 = qx80Var;
                    z4 = z2;
                    j6 = jD;
                    j7 = jD2;
                    j8 = jD3;
                    j9 = j4;
                    j10 = j5;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: x3a0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            f4a0.d(j3a0Var, dVar2, z4, qx80Var2, j6, j7, j8, j9, j10, (a) obj, iA, i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jD = j;
                    if (bVarI.e(jD)) {
                    }
                    i3 |= i13;
                } else {
                    jD = j;
                }
                i3 |= i13;
            } else {
                jD = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jD2 = j2;
                    if (bVarI.e(jD2)) {
                    }
                    i3 |= i14;
                } else {
                    jD2 = j2;
                }
                i3 |= i14;
            } else {
                jD2 = j2;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jD3 = j3;
                    if (bVarI.e(jD3)) {
                    }
                    i3 |= i15;
                } else {
                    jD3 = j3;
                }
                i3 |= i15;
            } else {
                jD3 = j3;
            }
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    i11 = i3;
                    i7 = i12;
                    if (bVarI.e(j5)) {
                    }
                    i6 = i11 | i16;
                } else {
                    i11 = i3;
                    i7 = i12;
                }
                i6 = i11 | i16;
            } else {
                i6 = i3;
                i7 = i12;
            }
            if ((i6 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    qx80VarB = xy80.b(k4a0.e, bVarI);
                    i8 = i6 & (-7169);
                    if ((i2 & 16) != 0) {
                        jD = g68.d(k4a0.c, bVarI);
                        i8 = i6 & (-64513);
                    }
                    if ((i2 & 32) != 0) {
                        jD2 = g68.d(k4a0.g, bVarI);
                        i8 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jD3 = g68.d(k4a0.a, bVarI);
                        i8 &= -3670017;
                    }
                    jD4 = g68.d(k4a0.a, bVarI);
                    i9 = i8 & (-29360129);
                    if ((i2 & 256) != 0) {
                        j12 = jD2;
                        j13 = jD4;
                        jD5 = g68.d(k4a0.f, bVarI);
                        qx80Var3 = qx80VarB;
                        z5 = z2;
                        j11 = jD;
                        i10 = i8 & (-264241153);
                    } else {
                        jD5 = j5;
                        qx80Var3 = qx80VarB;
                        j11 = jD;
                        j12 = jD2;
                        i10 = i9;
                        j13 = jD4;
                        z5 = z2;
                    }
                } else {
                    if (i7 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    qx80VarB = xy80.b(k4a0.e, bVarI);
                    i8 = i6 & (-7169);
                    if ((i2 & 16) != 0) {
                        jD = g68.d(k4a0.c, bVarI);
                        i8 = i6 & (-64513);
                    }
                    if ((i2 & 32) != 0) {
                        jD2 = g68.d(k4a0.g, bVarI);
                        i8 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jD3 = g68.d(k4a0.a, bVarI);
                        i8 &= -3670017;
                    }
                    jD4 = g68.d(k4a0.a, bVarI);
                    i9 = i8 & (-29360129);
                    if ((i2 & 256) != 0) {
                        j12 = jD2;
                        j13 = jD4;
                        jD5 = g68.d(k4a0.f, bVarI);
                        qx80Var3 = qx80VarB;
                        z5 = z2;
                        j11 = jD;
                        i10 = i8 & (-264241153);
                    } else {
                        jD5 = j5;
                        qx80Var3 = qx80VarB;
                        j11 = jD;
                        j12 = jD2;
                        i10 = i9;
                        j13 = jD4;
                        z5 = z2;
                    }
                }
                bVarI.Y();
                strA = j3a0Var.a().a();
                op8VarB = null;
                if (strA != null) {
                    bVarI.N(-663815981);
                    op8 op8VarB3 = pp8.b(-1378313599, new b(jD3, j3a0Var, strA), bVarI);
                    z6 = false;
                    bVarI.X(false);
                    op8Var = op8VarB3;
                } else {
                    z6 = false;
                    bVarI.N(-663517017);
                    bVarI.X(false);
                    op8Var = null;
                }
                if (j3a0Var.a().b()) {
                    bVarI.N(-663364652);
                    op8VarB = pp8.b(-1812633777, new c(j3a0Var), bVarI);
                    bVarI.X(z6);
                } else {
                    bVarI.N(-662974393);
                    bVarI.X(z6);
                }
                int i19 = i10 << 3;
                bVar = bVarI;
                c(h.f(dVar3, 12.0f), op8Var, op8VarB, z5, qx80Var3, j11, j12, j13, jD5, pp8.b(-1266389126, new a(j3a0Var), bVarI), bVar, (i19 & 3670016) | (i19 & 7168) | 805306368 | (458752 & i19) | (234881024 & i10));
                dVar2 = dVar3;
                j8 = jD3;
                z4 = z5;
                qx80Var2 = qx80Var3;
                j6 = j11;
                j7 = j12;
                j9 = j13;
                j10 = jD5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                qx80Var2 = qx80Var;
                z4 = z2;
                j6 = jD;
                j7 = jD2;
                j8 = jD3;
                j9 = j4;
                j10 = j5;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: x3a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        f4a0.d(j3a0Var, dVar2, z4, qx80Var2, j6, j7, j8, j9, j10, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (bVarI.b(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jD = j;
                    if (bVarI.e(jD)) {
                    }
                    i3 |= i13;
                } else {
                    jD = j;
                }
                i3 |= i13;
            } else {
                jD = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jD2 = j2;
                    if (bVarI.e(jD2)) {
                    }
                    i3 |= i14;
                } else {
                    jD2 = j2;
                }
                i3 |= i14;
            } else {
                jD2 = j2;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    jD3 = j3;
                    if (bVarI.e(jD3)) {
                    }
                    i3 |= i15;
                } else {
                    jD3 = j3;
                }
                i3 |= i15;
            } else {
                jD3 = j3;
            }
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    i11 = i3;
                    i7 = i12;
                    if (bVarI.e(j5)) {
                    }
                    i6 = i11 | i16;
                } else {
                    i11 = i3;
                    i7 = i12;
                }
                i6 = i11 | i16;
            } else {
                i6 = i3;
                i7 = i12;
            }
            if ((i6 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    qx80VarB = xy80.b(k4a0.e, bVarI);
                    i8 = i6 & (-7169);
                    if ((i2 & 16) != 0) {
                        jD = g68.d(k4a0.c, bVarI);
                        i8 = i6 & (-64513);
                    }
                    if ((i2 & 32) != 0) {
                        jD2 = g68.d(k4a0.g, bVarI);
                        i8 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jD3 = g68.d(k4a0.a, bVarI);
                        i8 &= -3670017;
                    }
                    jD4 = g68.d(k4a0.a, bVarI);
                    i9 = i8 & (-29360129);
                    if ((i2 & 256) != 0) {
                        j12 = jD2;
                        j13 = jD4;
                        jD5 = g68.d(k4a0.f, bVarI);
                        qx80Var3 = qx80VarB;
                        z5 = z2;
                        j11 = jD;
                        i10 = i8 & (-264241153);
                    } else {
                        jD5 = j5;
                        qx80Var3 = qx80VarB;
                        j11 = jD;
                        j12 = jD2;
                        i10 = i9;
                        j13 = jD4;
                        z5 = z2;
                    }
                } else {
                    if (i7 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    qx80VarB = xy80.b(k4a0.e, bVarI);
                    i8 = i6 & (-7169);
                    if ((i2 & 16) != 0) {
                        jD = g68.d(k4a0.c, bVarI);
                        i8 = i6 & (-64513);
                    }
                    if ((i2 & 32) != 0) {
                        jD2 = g68.d(k4a0.g, bVarI);
                        i8 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        jD3 = g68.d(k4a0.a, bVarI);
                        i8 &= -3670017;
                    }
                    jD4 = g68.d(k4a0.a, bVarI);
                    i9 = i8 & (-29360129);
                    if ((i2 & 256) != 0) {
                        j12 = jD2;
                        j13 = jD4;
                        jD5 = g68.d(k4a0.f, bVarI);
                        qx80Var3 = qx80VarB;
                        z5 = z2;
                        j11 = jD;
                        i10 = i8 & (-264241153);
                    } else {
                        jD5 = j5;
                        qx80Var3 = qx80VarB;
                        j11 = jD;
                        j12 = jD2;
                        i10 = i9;
                        j13 = jD4;
                        z5 = z2;
                    }
                }
                bVarI.Y();
                strA = j3a0Var.a().a();
                op8VarB = null;
                if (strA != null) {
                    bVarI.N(-663815981);
                    op8 op8VarB4 = pp8.b(-1378313599, new b(jD3, j3a0Var, strA), bVarI);
                    z6 = false;
                    bVarI.X(false);
                    op8Var = op8VarB4;
                } else {
                    z6 = false;
                    bVarI.N(-663517017);
                    bVarI.X(false);
                    op8Var = null;
                }
                if (j3a0Var.a().b()) {
                    bVarI.N(-663364652);
                    op8VarB = pp8.b(-1812633777, new c(j3a0Var), bVarI);
                    bVarI.X(z6);
                } else {
                    bVarI.N(-662974393);
                    bVarI.X(z6);
                }
                int i110 = i10 << 3;
                bVar = bVarI;
                c(h.f(dVar3, 12.0f), op8Var, op8VarB, z5, qx80Var3, j11, j12, j13, jD5, pp8.b(-1266389126, new a(j3a0Var), bVarI), bVar, (i110 & 3670016) | (i110 & 7168) | 805306368 | (458752 & i110) | (234881024 & i10));
                dVar2 = dVar3;
                j8 = jD3;
                z4 = z5;
                qx80Var2 = qx80Var3;
                j6 = j11;
                j7 = j12;
                j9 = j13;
                j10 = jD5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                qx80Var2 = qx80Var;
                z4 = z2;
                j6 = jD;
                j7 = jD2;
                j8 = jD3;
                j9 = j4;
                j10 = j5;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: x3a0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        f4a0.d(j3a0Var, dVar2, z4, qx80Var2, j6, j7, j8, j9, j10, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jD = j;
                if (bVarI.e(jD)) {
                }
                i3 |= i13;
            } else {
                jD = j;
            }
            i3 |= i13;
        } else {
            jD = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jD2 = j2;
                if (bVarI.e(jD2)) {
                }
                i3 |= i14;
            } else {
                jD2 = j2;
            }
            i3 |= i14;
        } else {
            jD2 = j2;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jD3 = j3;
                if (bVarI.e(jD3)) {
                }
                i3 |= i15;
            } else {
                jD3 = j3;
            }
            i3 |= i15;
        } else {
            jD3 = j3;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0) {
                i11 = i3;
                i7 = i12;
                if (bVarI.e(j5)) {
                }
                i6 = i11 | i16;
            } else {
                i11 = i3;
                i7 = i12;
            }
            i6 = i11 | i16;
        } else {
            i6 = i3;
            i7 = i12;
        }
        if ((i6 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i6 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                qx80VarB = xy80.b(k4a0.e, bVarI);
                i8 = i6 & (-7169);
                if ((i2 & 16) != 0) {
                    jD = g68.d(k4a0.c, bVarI);
                    i8 = i6 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    jD2 = g68.d(k4a0.g, bVarI);
                    i8 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jD3 = g68.d(k4a0.a, bVarI);
                    i8 &= -3670017;
                }
                jD4 = g68.d(k4a0.a, bVarI);
                i9 = i8 & (-29360129);
                if ((i2 & 256) != 0) {
                    j12 = jD2;
                    j13 = jD4;
                    jD5 = g68.d(k4a0.f, bVarI);
                    qx80Var3 = qx80VarB;
                    z5 = z2;
                    j11 = jD;
                    i10 = i8 & (-264241153);
                } else {
                    jD5 = j5;
                    qx80Var3 = qx80VarB;
                    j11 = jD;
                    j12 = jD2;
                    i10 = i9;
                    j13 = jD4;
                    z5 = z2;
                }
            } else {
                if (i7 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                qx80VarB = xy80.b(k4a0.e, bVarI);
                i8 = i6 & (-7169);
                if ((i2 & 16) != 0) {
                    jD = g68.d(k4a0.c, bVarI);
                    i8 = i6 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    jD2 = g68.d(k4a0.g, bVarI);
                    i8 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jD3 = g68.d(k4a0.a, bVarI);
                    i8 &= -3670017;
                }
                jD4 = g68.d(k4a0.a, bVarI);
                i9 = i8 & (-29360129);
                if ((i2 & 256) != 0) {
                    j12 = jD2;
                    j13 = jD4;
                    jD5 = g68.d(k4a0.f, bVarI);
                    qx80Var3 = qx80VarB;
                    z5 = z2;
                    j11 = jD;
                    i10 = i8 & (-264241153);
                } else {
                    jD5 = j5;
                    qx80Var3 = qx80VarB;
                    j11 = jD;
                    j12 = jD2;
                    i10 = i9;
                    j13 = jD4;
                    z5 = z2;
                }
            }
            bVarI.Y();
            strA = j3a0Var.a().a();
            op8VarB = null;
            if (strA != null) {
                bVarI.N(-663815981);
                op8 op8VarB5 = pp8.b(-1378313599, new b(jD3, j3a0Var, strA), bVarI);
                z6 = false;
                bVarI.X(false);
                op8Var = op8VarB5;
            } else {
                z6 = false;
                bVarI.N(-663517017);
                bVarI.X(false);
                op8Var = null;
            }
            if (j3a0Var.a().b()) {
                bVarI.N(-663364652);
                op8VarB = pp8.b(-1812633777, new c(j3a0Var), bVarI);
                bVarI.X(z6);
            } else {
                bVarI.N(-662974393);
                bVarI.X(z6);
            }
            int i111 = i10 << 3;
            bVar = bVarI;
            c(h.f(dVar3, 12.0f), op8Var, op8VarB, z5, qx80Var3, j11, j12, j13, jD5, pp8.b(-1266389126, new a(j3a0Var), bVarI), bVar, (i111 & 3670016) | (i111 & 7168) | 805306368 | (458752 & i111) | (234881024 & i10));
            dVar2 = dVar3;
            j8 = jD3;
            z4 = z5;
            qx80Var2 = qx80Var3;
            j6 = j11;
            j7 = j12;
            j9 = j13;
            j10 = jD5;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            qx80Var2 = qx80Var;
            z4 = z2;
            j6 = jD;
            j7 = jD2;
            j8 = jD3;
            j9 = j4;
            j10 = j5;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x3a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    f4a0.d(j3a0Var, dVar2, z4, qx80Var2, j6, j7, j8, j9, j10, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }
}
