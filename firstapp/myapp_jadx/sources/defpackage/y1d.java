package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y1d {
    public static final void a(final d dVar, final hjx hjxVar, c2d c2dVar, Function1 function1, a aVar, final int i) {
        final Function1 function2;
        final c2d c2dVar2;
        c2d c2dVar3;
        function1.getClass();
        b bVarI = aVar.i(-1475451754);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(hjxVar) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                c2dVar3 = c2d.m.INSTANCE;
            } else {
                bVarI.G();
                c2dVar3 = c2dVar;
            }
            bVarI.Y();
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final s520 s520Var = (s520) p8i0.a(jq40.a(s520.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            final ytw ytwVarC = wyh.c(s520Var.d, bVarI, 0, 7);
            boolean zM = bVarI.M(ytwVarC) | ((((i2 & 112) ^ 48) > 32 && bVarI.A(hjxVar)) || (i2 & 48) == 32) | bVarI.A(s520Var);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                function2 = function1;
                objY = new Function1() { // from class: u0d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final hjx hjxVar2 = hjxVar;
                        final s520 s520Var2 = s520Var;
                        final twd0 twd0Var = ytwVarC;
                        op8 op8Var = new op8(1083041175, new iaj() { // from class: o1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                boolean z = ((s520.a) twd0Var.getValue()).e;
                                final hjx hjxVar3 = hjxVar2;
                                boolean zA = aVar2.A(hjxVar3);
                                Object objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: x0d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.l.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA2 = aVar2.A(hjxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new e1d(hjxVar3, 0);
                                    aVar2.r(objY3);
                                }
                                Function0 function3 = (Function0) objY3;
                                boolean zA3 = aVar2.A(hjxVar3);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a) {
                                    objY4 = new Function0() { // from class: f1d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.v.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                Function0 function4 = (Function0) objY4;
                                boolean zA4 = aVar2.A(hjxVar3);
                                Object objY5 = aVar2.y();
                                if (zA4 || objY5 == c0042a) {
                                    objY5 = new g1d(hjxVar3, 0);
                                    aVar2.r(objY5);
                                }
                                Function0 function5 = (Function0) objY5;
                                boolean zA5 = aVar2.A(hjxVar3);
                                Object objY6 = aVar2.y();
                                if (zA5 || objY6 == c0042a) {
                                    objY6 = new h1d(hjxVar3, 0);
                                    aVar2.r(objY6);
                                }
                                Function0 function6 = (Function0) objY6;
                                boolean zA6 = aVar2.A(hjxVar3);
                                Object objY7 = aVar2.y();
                                if (zA6 || objY7 == c0042a) {
                                    objY7 = new Function0() { // from class: i1d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.r.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY7);
                                }
                                Function0 function7 = (Function0) objY7;
                                boolean zA7 = aVar2.A(hjxVar3);
                                Object objY8 = aVar2.y();
                                if (zA7 || objY8 == c0042a) {
                                    objY8 = new j1d(hjxVar3, 0);
                                    aVar2.r(objY8);
                                }
                                Function0 function8 = (Function0) objY8;
                                boolean zA8 = aVar2.A(hjxVar3);
                                Object objY9 = aVar2.y();
                                if (zA8 || objY9 == c0042a) {
                                    objY9 = new Function0() { // from class: k1d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.a.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY9);
                                }
                                Function0 function9 = (Function0) objY9;
                                boolean zA9 = aVar2.A(hjxVar3);
                                Object objY10 = aVar2.y();
                                if (zA9 || objY10 == c0042a) {
                                    objY10 = new Function0() { // from class: l1d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.u.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY10);
                                }
                                Function0 function10 = (Function0) objY10;
                                boolean zA10 = aVar2.A(hjxVar3);
                                Object objY11 = aVar2.y();
                                if (zA10 || objY11 == c0042a) {
                                    objY11 = new Function0() { // from class: m1d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            yfx.h(hjxVar3, c2d.w.INSTANCE, null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY11);
                                }
                                Function0 function11 = (Function0) objY11;
                                boolean zA11 = aVar2.A(hjxVar3);
                                Object objY12 = aVar2.y();
                                if (zA11 || objY12 == c0042a) {
                                    objY12 = new y0d(hjxVar3, 0);
                                    aVar2.r(objY12);
                                }
                                Function0 function12 = (Function0) objY12;
                                boolean zA12 = aVar2.A(hjxVar3);
                                Object objY13 = aVar2.y();
                                if (zA12 || objY13 == c0042a) {
                                    objY13 = new z0d(hjxVar3, 0);
                                    aVar2.r(objY13);
                                }
                                Function0 function13 = (Function0) objY13;
                                boolean zA13 = aVar2.A(hjxVar3);
                                Object objY14 = aVar2.y();
                                if (zA13 || objY14 == c0042a) {
                                    objY14 = new a1d(hjxVar3, 0);
                                    aVar2.r(objY14);
                                }
                                Function0 function14 = (Function0) objY14;
                                boolean zA14 = aVar2.A(hjxVar3);
                                Object objY15 = aVar2.y();
                                if (zA14 || objY15 == c0042a) {
                                    objY15 = new b1d(hjxVar3, 0);
                                    aVar2.r(objY15);
                                }
                                Function0 function15 = (Function0) objY15;
                                boolean zA15 = aVar2.A(hjxVar3);
                                Object objY16 = aVar2.y();
                                if (zA15 || objY16 == c0042a) {
                                    objY16 = new e2(hjxVar3, 1);
                                    aVar2.r(objY16);
                                }
                                Function0 function16 = (Function0) objY16;
                                s520 s520Var3 = s520Var2;
                                boolean zA16 = aVar2.A(s520Var3);
                                Object objY17 = aVar2.y();
                                if (zA16 || objY17 == c0042a) {
                                    objY17 = new f2(s520Var3, 1);
                                    aVar2.r(objY17);
                                }
                                Function0 function17 = (Function0) objY17;
                                boolean zA17 = aVar2.A(hjxVar3);
                                Object objY18 = aVar2.y();
                                if (zA17 || objY18 == c0042a) {
                                    objY18 = new c1d(hjxVar3, 0);
                                    aVar2.r(objY18);
                                }
                                kku.a(function0, function3, function4, function5, function6, function7, function8, function9, function10, function11, function12, function13, function14, function15, function16, z, function17, (Function0) objY18, aVar2, 0);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(c2d.m.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        final Function1 function3 = function2;
                        hhx.a(ghxVar, jq40.a(c2d.i.class), o2gVar, m2gVar, null, null, null, null, new op8(393951694, new iaj() { // from class: r1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).intValue();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hbg.a(function3, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(c2d.l.class), o2gVar, m2gVar, null, null, null, null, zx8.a);
                        hhx.a(ghxVar, jq40.a(c2d.f.class), o2gVar, m2gVar, null, null, null, null, new op8(639759568, new iaj() { // from class: s1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar3 = hjxVar2;
                                boolean zA = aVar2.A(hjxVar3);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == a.C0041a.a) {
                                    objY2 = new n1d(hjxVar3, 0);
                                    aVar2.r(objY2);
                                }
                                k5g.b(null, (Function1) objY2, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(c2d.h.class), jpu.b(new Pair(jq40.b(EncryptedRequest.class), new djx.e(EncryptedRequest.class))), m2gVar, null, null, null, null, zx8.b);
                        hhx.a(ghxVar, jq40.a(c2d.v.class), o2gVar, m2gVar, null, null, null, null, zx8.c);
                        hhx.a(ghxVar, jq40.a(c2d.g.class), o2gVar, m2gVar, null, null, null, null, zx8.d);
                        hhx.a(ghxVar, jq40.a(c2d.o.class), o2gVar, m2gVar, null, null, null, null, zx8.e);
                        hhx.a(ghxVar, jq40.a(c2d.r.class), o2gVar, m2gVar, null, null, null, null, new op8(1254279253, new iaj() { // from class: t1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar3 = hjxVar2;
                                boolean zA = aVar2.A(hjxVar3);
                                Object objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY2 == c0042a) {
                                    objY2 = new w1d(hjxVar3, 0);
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA2 = aVar2.A(hjxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new x1d(hjxVar3, 0);
                                    aVar2.r(objY3);
                                }
                                Function0 function4 = (Function0) objY3;
                                Object objY4 = aVar2.y();
                                if (objY4 == c0042a) {
                                    objY4 = new v0d();
                                    aVar2.r(objY4);
                                }
                                bbh0.b(function0, function4, (Function0) objY4, aVar2, 384);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(c2d.q.class), o2gVar, m2gVar, null, null, null, null, zx8.f);
                        hhx.a(ghxVar, jq40.a(c2d.s.class), o2gVar, m2gVar, null, null, null, null, zx8.g);
                        hhx.a(ghxVar, jq40.a(c2d.p.class), o2gVar, m2gVar, null, null, null, null, zx8.h);
                        hhx.a(ghxVar, jq40.a(c2d.a.class), o2gVar, m2gVar, null, null, null, null, new op8(225904934, new iaj() { // from class: u1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar3 = hjxVar2;
                                boolean zA = aVar2.A(hjxVar3);
                                Object objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY2 == c0042a) {
                                    objY2 = new p1d(hjxVar3, 0);
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA2 = aVar2.A(hjxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new q1d(hjxVar3, 0);
                                    aVar2.r(objY3);
                                }
                                hy.a(function0, (Function0) objY3, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(c2d.e.class), o2gVar, m2gVar, null, null, null, null, zx8.i);
                        hhx.a(ghxVar, jq40.a(c2d.c.class), o2gVar, m2gVar, null, null, null, null, zx8.j);
                        hhx.a(ghxVar, jq40.a(c2d.u.class), o2gVar, m2gVar, null, null, null, null, new op8(594616745, new iaj() { // from class: v1d
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                hjx hjxVar3 = hjxVar2;
                                boolean zA = aVar2.A(hjxVar3);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == a.C0041a.a) {
                                    objY2 = new w0d(hjxVar3, 0);
                                    aVar2.r(objY2);
                                }
                                b6j0.c((Function0) objY2, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(c2d.t.class), o2gVar, m2gVar, null, null, null, null, zx8.k);
                        hhx.a(ghxVar, jq40.a(c2d.w.class), o2gVar, m2gVar, null, null, null, null, zx8.l);
                        hhx.a(ghxVar, jq40.a(c2d.k.class), o2gVar, m2gVar, null, null, null, null, zx8.m);
                        hhx.a(ghxVar, jq40.a(c2d.d.class), o2gVar, m2gVar, null, null, null, null, zx8.n);
                        hhx.a(ghxVar, jq40.a(c2d.n.class), o2gVar, m2gVar, null, null, null, null, zx8.o);
                        hhx.a(ghxVar, jq40.a(c2d.j.class), o2gVar, m2gVar, null, null, null, null, zx8.p);
                        hhx.a(ghxVar, jq40.a(c2d.b.class), o2gVar, m2gVar, null, null, null, null, zx8.q);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            int i3 = ((i2 >> 3) & 14) | 56 | ((i2 << 6) & 896);
            c2d c2dVar4 = c2dVar3;
            uix.b(hjxVar, c2dVar4, dVar, null, null, null, null, null, null, (Function1) objY, bVarI, i3, 2040);
            c2dVar2 = c2dVar4;
        } else {
            function2 = function1;
            bVarI.G();
            c2dVar2 = c2dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1 function3 = function2;
            eVarZ.d = new Function2(hjxVar, c2dVar2, function3, i) { // from class: d1d
                public final /* synthetic */ hjx b;
                public final /* synthetic */ c2d c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3137);
                    y1d.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
