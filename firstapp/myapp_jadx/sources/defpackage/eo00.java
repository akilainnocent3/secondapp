package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class eo00 {
    public static final void a(final d dVar, hjx hjxVar, final kq00 kq00Var, final el00 el00Var, final bsi bsiVar, final k130 k130Var, go00 go00Var, final Function0 function0, final Function0 function1, final Function0 function2, final Function1 function3, final Function0 function4, final Function1 function5, final gaj gajVar, final gaj gajVar2, final Function1 function6, final Function2 function7, final Function2 function8, final Function1 function9, final Function1 function10, final Function1 function11, final Function1 function12, final gaj gajVar3, final Function2 function13, final Function0 function14, final Function1 function15, final Function0 function16, final Function0 function17, final Function0 function18, a aVar, final int i) {
        b bVar;
        final hjx hjxVar2;
        final go00 go00Var2;
        hjx hjxVarA;
        int i2;
        go00 go00Var3;
        final hjx hjxVar3;
        b bVar2;
        kq00Var.getClass();
        function15.getClass();
        b bVarI = aVar.i(1508431557);
        int i3 = i | 16 | (bVarI.A(kq00Var) ? 256 : 128) | (bVarI.A(el00Var) ? 2048 : 1024) | (bVarI.A(bsiVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(k130Var == null ? -1 : k130Var.ordinal()) ? 131072 : 65536) | 1572864 | (bVarI.A(function0) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432) | (bVarI.A(function2) ? 536870912 : 268435456);
        int i4 = (bVarI.A(function3) ? (char) 4 : (char) 2) | (bVarI.A(function4) ? ' ' : (char) 16) | (bVarI.A(function5) ? 256 : 128) | (bVarI.A(gajVar) ? 2048 : 1024) | (bVarI.A(gajVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function6) ? 131072 : 65536) | (bVarI.A(function7) ? 1048576 : 524288) | (bVarI.A(function8) ? 8388608 : 4194304) | (bVarI.A(function9) ? 67108864 : 33554432) | (bVarI.A(function10) ? (char) 0 : (char) 0);
        int i5 = (bVarI.A(function11) ? (char) 4 : (char) 2) | (bVarI.A(function12) ? ' ' : (char) 16) | (bVarI.A(gajVar3) ? 256 : 128) | (bVarI.A(function13) ? 2048 : 1024) | (bVarI.A(function14) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function15) ? 131072 : 65536) | (bVarI.A(function16) ? (char) 0 : (char) 0) | (bVarI.A(function17) ? 8388608 : 4194304) | (bVarI.A(function18) ? (char) 0 : (char) 0);
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                hjxVarA = tix.a(new vkx[0], bVarI);
                i2 = i3 & (-113);
                go00Var3 = go00.b.INSTANCE;
            } else {
                bVarI.G();
                go00Var3 = go00Var;
                i2 = i3 & (-113);
                hjxVarA = hjxVar;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zA = ((i2 & 7168) == 2048 || bVarI.A(el00Var)) | ((i2 & 896) == 256 || bVarI.A(kq00Var)) | ((i2 & 57344) == 16384 || bVarI.A(bsiVar)) | ((i2 & 29360128) == 8388608) | ((i2 & 234881024) == 67108864) | ((i2 & 1879048192) == 536870912) | ((i2 & 458752) == 131072) | ((i4 & 14) == 4) | ((i5 & 458752) == 131072) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384) | ((i4 & 458752) == 131072) | ((i4 & 3670016) == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((i5 & 3670016) == 1048576) | ((i5 & 29360128) == 8388608) | bVarI.A(hjxVarA) | ((i5 & 234881024) == 67108864) | ((i5 & 57344) == 16384);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                hjxVar3 = hjxVarA;
                Function1 function19 = new Function1() { // from class: gn00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final kq00 kq00Var2 = kq00Var;
                        final el00 el00Var2 = el00Var;
                        final bsi bsiVar2 = bsiVar;
                        final Function0 function20 = function0;
                        final Function0 function21 = function1;
                        final Function0 function22 = function2;
                        final k130 k130Var2 = k130Var;
                        final Function1 function23 = function3;
                        final Function1 function24 = function15;
                        final Function0 function25 = function4;
                        final Function1 function26 = function5;
                        final gaj gajVar4 = gajVar;
                        final gaj gajVar5 = gajVar2;
                        final Function1 function27 = function6;
                        final Function2 function28 = function7;
                        final Function2 function29 = function8;
                        final Function1 function30 = function9;
                        final Function1 function31 = function10;
                        final Function1 function32 = function11;
                        final Function1 function33 = function12;
                        final gaj gajVar6 = gajVar3;
                        final Function2 function34 = function13;
                        final Function0 function35 = function16;
                        final Function0 function36 = function17;
                        final hjx hjxVar4 = hjxVar3;
                        final Function0 function37 = function18;
                        op8 op8Var = new op8(272789540, new iaj() { // from class: wn00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                Object objY3 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (objY3 == c0042a2) {
                                    objY3 = new jn00();
                                    aVar2.r(objY3);
                                }
                                Function1 function38 = (Function1) objY3;
                                hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY4 = aVar2.y();
                                if (zA2 || objY4 == c0042a2) {
                                    objY4 = new kn00(hjxVar5, 0);
                                    aVar2.r(objY4);
                                }
                                Function0 function39 = (Function0) objY4;
                                boolean zA3 = aVar2.A(hjxVar5);
                                Object objY5 = aVar2.y();
                                if (zA3 || objY5 == c0042a2) {
                                    objY5 = new ln00(hjxVar5, 0);
                                    aVar2.r(objY5);
                                }
                                Function0 function40 = (Function0) objY5;
                                boolean zA4 = aVar2.A(hjxVar5);
                                Object objY6 = aVar2.y();
                                if (zA4 || objY6 == c0042a2) {
                                    objY6 = new mn00(hjxVar5, 0);
                                    aVar2.r(objY6);
                                }
                                sp00.b(kq00Var2, el00Var2, bsiVar2, function20, function21, function22, k130Var2, function23, function24, function25, function26, gajVar4, gajVar5, function27, function28, function29, function30, function31, function32, function33, function38, gajVar6, function34, function35, function36, function39, function40, (Function1) objY6, function37, aVar2, 584);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(go00.b.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        final ytw ytwVar2 = ytwVar;
                        hhx.a(ghxVar, jq40.a(a0c.a.class), o2gVar, m2gVar, null, null, null, null, new op8(-1790531955, new iaj() { // from class: xn00
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                ytw ytwVar3 = ytwVar2;
                                boolean zBooleanValue = ((Boolean) ytwVar3.getValue()).booleanValue();
                                w8i0 w8i0VarA = zdt.a(aVar2);
                                if (w8i0VarA == null) {
                                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                e1c e1cVar = (e1c) p8i0.a(jq40.a(e1c.class), w8i0VarA, null, cll.a(w8i0VarA, aVar2), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                                Object objY3 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (objY3 == c0042a2) {
                                    objY3 = new ter(ytwVar3, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function38 = (Function0) objY3;
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY4 = aVar2.y();
                                if (zA2 || objY4 == c0042a2) {
                                    objY4 = new Function0() { // from class: hn00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            hjxVar5.k();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                Function0 function39 = (Function0) objY4;
                                boolean zA3 = aVar2.A(hjxVar5);
                                Object objY5 = aVar2.y();
                                if (zA3 || objY5 == c0042a2) {
                                    objY5 = new Function0() { // from class: in00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar5, a0c.d.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY5);
                                }
                                Function0 function40 = (Function0) objY5;
                                boolean zA4 = aVar2.A(hjxVar5);
                                Object objY6 = aVar2.y();
                                if (zA4 || objY6 == c0042a2) {
                                    objY6 = new wer(hjxVar5, 1);
                                    aVar2.r(objY6);
                                }
                                w0c.d(zBooleanValue, function38, function39, function21, function40, (Function1) objY6, e1cVar, aVar2, 2097200);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(a0c.d.class), o2gVar, m2gVar, null, null, null, null, new op8(158602092, new iaj() { // from class: yn00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA2 || objY3 == c0042a2) {
                                    objY3 = new un00(hjxVar5, 0);
                                    aVar2.r(objY3);
                                }
                                Function0 function38 = (Function0) objY3;
                                boolean zA3 = aVar2.A(hjxVar5);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a2) {
                                    objY4 = new gaj() { // from class: vn00
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            String str = (String) obj6;
                                            String str2 = (String) obj7;
                                            String str3 = (String) obj8;
                                            str.getClass();
                                            str2.getClass();
                                            str3.getClass();
                                            yfx.h(hjxVar5, new a0c.e(str, str3, str2), null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                szb.d(function38, (gaj) objY4, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(a0c.e.class), o2gVar, m2gVar, null, null, null, null, new op8(2107736139, new iaj() { // from class: zn00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new Function0() { // from class: on00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            hjxVar5.k();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                zyb.c((Function0) objY3, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        final Function0 function38 = function14;
                        hhx.a(ghxVar, jq40.a(a0c.b.class), o2gVar, m2gVar, null, null, null, null, new op8(-238097110, new iaj() { // from class: ao00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                final ytw ytwVar3 = ytwVar2;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA2 || objY3 == c0042a2) {
                                    objY3 = new Function0() { // from class: rn00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            hjxVar5.k();
                                            ytwVar3.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                Function0 function39 = (Function0) objY3;
                                final Function0 function40 = function38;
                                boolean zM = aVar2.M(function40) | aVar2.A(hjxVar5);
                                Object objY4 = aVar2.y();
                                if (zM || objY4 == c0042a2) {
                                    objY4 = new Function0() { // from class: sn00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function40.invoke();
                                            hjxVar5.k();
                                            ytwVar3.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                rp7.c(function39, (Function0) objY4, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(a0c.c.class), o2gVar, m2gVar, null, null, null, null, new op8(1711036937, new iaj() { // from class: bo00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new Function0() { // from class: nn00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            hjxVar5.k();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                a2c.a((Function0) objY3, function21, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(go00.c.class), o2gVar, m2gVar, null, null, null, null, new op8(-634796312, new iaj() { // from class: co00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA2 || objY3 == c0042a2) {
                                    objY3 = new v04(hjxVar5, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function39 = (Function0) objY3;
                                boolean zA3 = aVar2.A(hjxVar5);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a2) {
                                    objY4 = new tn00(hjxVar5, 0);
                                    aVar2.r(objY4);
                                }
                                teh0.b(0, 0, aVar2, function39, (Function0) objY4);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(go00.a.class), o2gVar, m2gVar, null, null, null, null, new op8(1314337735, new iaj() { // from class: do00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final hjx hjxVar5 = hjxVar4;
                                boolean zA2 = aVar2.A(hjxVar5);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new Function0() { // from class: qn00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            hjxVar5.k();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                weh0.b((Function0) objY3, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                bVar2 = bVarI;
                bVar2.r(function19);
                objY2 = function19;
            } else {
                bVar2 = bVarI;
                hjxVar3 = hjxVarA;
            }
            b bVar3 = bVar2;
            go00 go00Var4 = go00Var3;
            uix.b(hjxVar3, go00Var4, dVar, null, null, null, null, null, null, (Function1) objY2, bVar3, 504, 2040);
            bVar = bVar3;
            go00Var2 = go00Var4;
            hjxVar2 = hjxVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            hjxVar2 = hjxVar;
            go00Var2 = go00Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(hjxVar2, kq00Var, el00Var, bsiVar, k130Var, go00Var2, function0, function1, function2, function3, function4, function5, gajVar, gajVar2, function6, function7, function8, function9, function10, function11, function12, gajVar3, function13, function14, function15, function16, function17, function18, i) { // from class: pn00
                public final /* synthetic */ Function0 A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ gaj C;
                public final /* synthetic */ gaj D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function2 F;
                public final /* synthetic */ Function2 G;
                public final /* synthetic */ Function1 H;
                public final /* synthetic */ Function1 I;
                public final /* synthetic */ Function1 J;
                public final /* synthetic */ Function1 K;
                public final /* synthetic */ gaj L;
                public final /* synthetic */ Function2 M;
                public final /* synthetic */ Function0 N;
                public final /* synthetic */ Function1 O;
                public final /* synthetic */ Function0 P;
                public final /* synthetic */ Function0 Q;
                public final /* synthetic */ Function0 R;
                public final /* synthetic */ hjx b;
                public final /* synthetic */ kq00 c;
                public final /* synthetic */ el00 d;
                public final /* synthetic */ bsi e;
                public final /* synthetic */ k130 f;
                public final /* synthetic */ go00 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function1 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(37383);
                    eo00.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
