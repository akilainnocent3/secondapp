package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jx2 {

    @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetPanelViewKt$BetPanelView$1$1$1", f = "BetPanelView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ga60 a;
        public final /* synthetic */ fa60 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ga60 ga60Var, fa60 fa60Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ga60Var;
            this.b = fa60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ga60 ga60Var = this.a;
            wwd0 wwd0Var = ga60Var.a;
            wwd0Var.getClass();
            fa60 fa60Var = this.b;
            wwd0Var.k(null, fa60Var);
            ej5.c(o8i0.d(ga60Var), null, null, new ha60(ga60Var, fa60Var, null), 3);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetPanelViewKt$BetPanelView$1$2$1", f = "BetPanelView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ga60 b;
        public final /* synthetic */ Function1<d860, Unit> c;

        @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetPanelViewKt$BetPanelView$1$2$1$1", f = "BetPanelView.kt", l = {80}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ga60 b;
            public final /* synthetic */ Function1<d860, Unit> c;

            /* JADX INFO: renamed from: jx2$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.betpanel.BetPanelViewKt$BetPanelView$1$2$1$1$1", f = "BetPanelView.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0741a extends tje0 implements Function2<ea60, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ Function1<d860, Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0741a(Function1<? super d860, Unit> function1, v1b<? super C0741a> v1bVar) {
                    super(2, v1bVar);
                    this.b = function1;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0741a c0741a = new C0741a(this.b, v1bVar);
                    c0741a.a = obj;
                    return c0741a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ea60 ea60Var, v1b<? super Unit> v1bVar) {
                    return ((C0741a) create(ea60Var, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    ea60 ea60Var = (ea60) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    if (!(ea60Var instanceof ea60.a)) {
                        uhc.a();
                        return null;
                    }
                    this.b.invoke(((ea60.a) ea60Var).a);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ga60 ga60Var, Function1<? super d860, Unit> function1, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = ga60Var;
                this.c = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to jx2$b$a for r5v7 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 != r3) goto Le
                    defpackage.uj50.b(r6)
                    goto L3e
                Le:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r2
                L14:
                    defpackage.uj50.b(r6)
                    ga60 r6 = r5.b
                    t340 r6 = r6.e
                    jx2$b$a$a r1 = new jx2$b$a$a
                    kotlin.jvm.functions.Function1<d860, kotlin.Unit> r4 = r5.c
                    r1.<init>(r4, r2)
                    r5.a = r3
                    g1i$a r2 = new g1i$a
                    gyx r3 = defpackage.gyx.a
                    r2.<init>(r3, r1)
                    a390<T> r6 = r6.a
                    java.lang.Object r5 = r6.collect(r2, r5)
                    if (r5 != r0) goto L34
                    goto L36
                L34:
                    kotlin.Unit r5 = kotlin.Unit.a
                L36:
                    if (r5 != r0) goto L39
                    goto L3b
                L39:
                    kotlin.Unit r5 = kotlin.Unit.a
                L3b:
                    if (r5 != r0) goto L3e
                    return r0
                L3e:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: jx2.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ga60 ga60Var, Function1<? super d860, Unit> function1, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = ga60Var;
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new a(this.b, this.c, null), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<yw2, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(yw2 yw2Var) {
            yw2 yw2Var2 = yw2Var;
            yw2Var2.getClass();
            ((ga60) this.receiver).x1(yw2Var2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<yw2, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(yw2 yw2Var) {
            yw2 yw2Var2 = yw2Var;
            yw2Var2.getClass();
            ((ga60) this.receiver).x1(yw2Var2);
            return Unit.a;
        }
    }

    public static final class e implements tse {
        public final /* synthetic */ ga60 a;

        public e(ga60 ga60Var) {
            this.a = ga60Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.x1(yw2.g.a);
        }
    }

    public static final void a(final zw2 zw2Var, Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        final Function1 function2 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(1529368062);
        int i2 = (bVarI.M(zw2Var) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            long jD = r58.d(4280102273L);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            zk40.a aVar3 = zk40.a;
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(aVar2, jD, aVar3), 16.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            jz2.b(h.j(aVar2, 0.0f, 0.0f, 0.0f, 16.0f, 7), zw2Var.a, function2, bVarI, ((i2 << 3) & 896) | 6);
            hf2.d(zw2Var.b, zw2Var.c, zw2Var.d, function2, bVarI, (i2 << 6) & 7168);
            androidx.compose.ui.d dVarG = j.g(h.j(aVar2, 0.0f, 9.0f, 0.0f, 0.0f, 13), 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (zw2Var.e) {
                bVarI.N(298850330);
                function2 = function1;
                c(zw2Var.f, function2, bVarI, i2 & 112);
                z = false;
            } else {
                function2 = function1;
                z = false;
                bVarI.N(294103486);
            }
            bVarI.X(z);
            androidx.compose.ui.d dVarA = ls7.a(new LayoutWeightElement(1.0f, true), j060.c(4.0f));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            xt50 xt50VarB = ut50.b(0.0f, 3, j58.f, false);
            boolean z2 = (i2 & 112) == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new ax2(function2, 0);
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarF2 = h.f(androidx.compose.foundation.a.b(oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, pswVar, xt50VarB, false, null, (Function0) objY2, 28), "confirm_bet_amount_button"), r58.d(4294945859L), aVar3), 14.0f);
            lkf0.b(com.sportygames.newcms.c.c(ma60.B0.y, new String[0], bVarI), dVarF2, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) bVarI.O(vob0.a)).d, r58.d(4283315737L), i7f.b(16.0f, bVarI), t9i.v, null, null, 0L, null, null, null, 3, i7f.b(16.0f, bVarI), null, null, 16613368), bVarI, 0, 0, 65532);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, i) { // from class: bx2
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jx2.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final androidx.compose.ui.d dVar, final rc60 rc60Var, final Function1<? super d860, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        ga60 ga60Var;
        dVar.getClass();
        rc60Var.getClass();
        function1.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1887857929);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(rc60Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(ga60.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            final ga60 ga60Var2 = (ga60) j8i0VarA;
            final ytw ytwVarC = wyh.c(ga60Var2.f, bVarI, 0, 7);
            qc60.b(ls7.a(dVar, zk40.a), rc60Var instanceof fa60 ? (fa60) rc60Var : null, com.sportygames.newcms.c.c(ma60.B0.A, new String[0], bVarI), function0, pp8.b(1236733737, new gaj() { // from class: fx2
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fa60 fa60Var = (fa60) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    fa60Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(fa60Var) ? 4 : 2;
                    }
                    int i3 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ga60 ga60Var3 = ga60Var2;
                        boolean zA = aVar2.A(ga60Var3) | ((iIntValue & 14) == 4);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new jx2.a(ga60Var3, fa60Var, null);
                            aVar2.r(objY);
                        }
                        xvf.e(aVar2, fa60Var, (Function2) objY);
                        Unit unit = Unit.a;
                        boolean zA2 = aVar2.A(ga60Var3);
                        Function1 function2 = function1;
                        boolean zM = zA2 | aVar2.M(function2);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new jx2.b(ga60Var3, function2, null);
                            aVar2.r(objY2);
                        }
                        xvf.e(aVar2, unit, (Function2) objY2);
                        boolean zA3 = aVar2.A(ga60Var3);
                        Object objY3 = aVar2.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new ix2(ga60Var3, i3);
                            aVar2.r(objY3);
                        }
                        xvf.c(unit, (Function1) objY3, aVar2);
                        zw2 zw2Var = (zw2) ytwVarC.getValue();
                        boolean zA4 = aVar2.A(ga60Var3);
                        Object objY4 = aVar2.y();
                        if (zA4 || objY4 == c0042a) {
                            jx2.c cVar = new jx2.c(1, ga60Var3, ga60.class, "handelEvent", "handelEvent(Lcom/sportygames/speedybingo/presentation/betpanel/BetPanelEvent;)V", 0);
                            aVar2.r(cVar);
                            objY4 = cVar;
                        }
                        jx2.a(zw2Var, (Function1) ((chp) objY4), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 7168) | 24576, 0);
            xw2 xw2Var = ((zw2) ytwVarC.getValue()).g;
            boolean z = xw2Var instanceof xw2.a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z) {
                bVarI.N(1755309166);
                xw2.a aVar2 = (xw2.a) xw2Var;
                boolean zA = bVarI.A(ga60Var2);
                Object objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new d(1, ga60Var2, ga60.class, "handelEvent", "handelEvent(Lcom/sportygames/speedybingo/presentation/betpanel/BetPanelEvent;)V", 0);
                    ga60Var = ga60Var2;
                    bVarI.r(objY);
                } else {
                    ga60Var = ga60Var2;
                }
                he60.a(aVar2, (Function1) ((chp) objY), bVarI, 0);
                bVarI.X(false);
            } else {
                ga60Var = ga60Var2;
                if (Intrinsics.g(xw2Var, xw2.b.a)) {
                    bVarI.N(-1419856873);
                    bVarI.X(false);
                } else {
                    if (!Intrinsics.g(xw2Var, xw2.c.a)) {
                        throw igf0.a(bVarI, 1755306769, false);
                    }
                    bVarI.N(-1419819177);
                    bVarI.X(false);
                }
            }
            xw2 xw2Var2 = ((zw2) ytwVarC.getValue()).g;
            boolean zA2 = bVarI.A(ga60Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new gx2(ga60Var, 0);
                bVarI.r(objY2);
            }
            nnk.b(xw2Var2, (Function0) objY2, bVarI, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(rc60Var, function1, function0, i) { // from class: hx2
                public final /* synthetic */ rc60 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jx2.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-295525252);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarI = j.i(aVar2, 44.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d dVarA = ls7.a(j.r(aVar2, 20.0f), j060.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            long j = j58.f;
            xt50 xt50VarB = ut50.b(0.0f, 3, j, false);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: cx2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(yw2.d.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            h9n.a(erz.a(R.drawable.sg_outline_info, 0, bVarI), "info", androidx.compose.foundation.d.b(dVarA, pswVar, xt50VarB, false, null, (Function0) objY2, 28), null, null, 0.0f, new gf4(j, 5), bVarI, 1572912, 56);
            androidx.compose.ui.d dVarA2 = ls7.a(j.r(dw.a(h.j(aVar2, 10.0f, 0.0f, 16.0f, 0.0f, 10), z ? 1.0f : 0.5f), 44.0f), j060.c(4.0f));
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            psw pswVar2 = (psw) objY3;
            xt50 xt50VarB2 = ut50.b(0.0f, 3, j, false);
            boolean z3 = i3 == 32;
            Object objY4 = bVarI.y();
            if (z3 || objY4 == c0042a) {
                objY4 = new Function0() { // from class: dx2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(yw2.c.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            h9n.a(erz.a(2131233729, 0, bVarI), "gift", h.f(androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA2, pswVar2, xt50VarB2, z, null, (Function0) objY4, 24), r58.d(4280831680L), zk40.a), 8.0f), null, null, 0.0f, null, bVarI, 48, 120);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ex2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jx2.c(z, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
