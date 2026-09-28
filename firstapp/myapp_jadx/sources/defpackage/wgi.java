package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wgi {

    @c0d(c = "com.sportybet.android.instantwin.presentation.compose.dialog.footballfamilyskiptoresult.FootballFamilySkipToResultDialogKt$Content$1$1$1", f = "FootballFamilySkipToResultDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.compose.dialog.footballfamilyskiptoresult.FootballFamilySkipToResultDialogKt$Content$1$4$1", f = "FootballFamilySkipToResultDialog.kt", l = {122, 129}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ ytw<Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, Function0<Unit> function0, osw oswVar, ytw<Boolean> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = function0;
            this.d = oswVar;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            if (defpackage.hkd.c(r11, r9) == r0) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1d
                if (r1 == r2) goto L18
                if (r1 != r3) goto L11
                defpackage.uj50.b(r12)
                r9 = r11
                goto L74
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L18:
                defpackage.uj50.b(r12)
                r9 = r11
                goto L61
            L1d:
                defpackage.uj50.b(r12)
                osw r12 = r11.d
                int r12 = r12.D()
                if (r12 == 0) goto L7c
                ytw<java.lang.Boolean> r12 = r11.e
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto L37
                goto L7c
            L37:
                java.lang.Float r5 = new java.lang.Float
                r12 = 1065353216(0x3f800000, float:1.0)
                r5.<init>(r12)
                f4c r1 = new f4c
                r4 = 0
                r6 = 1059565076(0x3f27ae14, float:0.655)
                r7 = 1052434760(0x3ebae148, float:0.365)
                r1.<init>(r7, r4, r6, r12)
                r12 = 1000(0x3e8, float:1.401E-42)
                r4 = 0
                gzg0 r6 = defpackage.yi0.e(r12, r4, r1, r3)
                r11.a = r2
                wd0<java.lang.Float, ij0> r4 = r11.b
                r7 = 0
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto L61
                goto L73
            L61:
                kotlin.time.b$a r11 = kotlin.time.b.b
                r11 = 300(0x12c, double:1.48E-321)
                rgf r1 = defpackage.rgf.MILLISECONDS
                long r11 = kotlin.time.c.i(r11, r1)
                r9.a = r3
                java.lang.Object r11 = defpackage.hkd.c(r11, r9)
                if (r11 != r0) goto L74
            L73:
                return r0
            L74:
                kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r9.c
                r11.invoke()
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            L7c:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: wgi.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(877875200);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            q75.a(j.e(d.a.b, 1.0f), null, false, pp8.b(-1288923434, new gaj() { // from class: rgi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d();
                        final float fB = mla.b(fD, aVar2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(Boolean.FALSE);
                            aVar2.r(objY);
                        }
                        ytw ytwVar = (ytw) objY;
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(Boolean.FALSE);
                            aVar2.r(objY2);
                        }
                        ytw ytwVar2 = (ytw) objY2;
                        Unit unit = Unit.a;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = new wgi.a(ytwVar, null);
                            aVar2.r(objY3);
                        }
                        xvf.e(aVar2, unit, (Function2) objY3);
                        float f = ((Boolean) ytwVar.getValue()).booleanValue() ? 1.0f : 0.5f;
                        gzg0 gzg0VarE = yi0.e(1500, 0, null, 6);
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = new tgi(ytwVar2, 0);
                            aVar2.r(objY4);
                        }
                        float fFloatValue = ((Number) xe0.b(f, gzg0VarE, "Button width fraction", (Function1) objY4, aVar2, 27696, 4).getValue()).floatValue() * fD;
                        d.a aVar3 = d.a.b;
                        d dVarB = r75Var.b(j.i(j.w(aVar3, fFloatValue), 48.0f), ht.a.i);
                        qyd0 qyd0Var = oib0.a;
                        d dVarB2 = androidx.compose.foundation.a.b(dVarB, ((lib0) aVar2.O(qyd0Var)).x0, zk40.a);
                        Object objY5 = aVar2.y();
                        if (objY5 == c0042a) {
                            objY5 = new ugi();
                            aVar2.r(objY5);
                        }
                        d dVarD = androidx.compose.foundation.d.d(dVarB2, false, null, null, (Function0) objY5, 15);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarD);
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
                        lkf0.d(cb40.a(R.string.page_instant_virtual__kick_off, new Object[0], aVar2), null, ((lib0) aVar2.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).g, aVar2, 0, 0, 131066);
                        aVar2.s();
                        Object objY6 = aVar2.y();
                        if (objY6 == c0042a) {
                            objY6 = k.a(0);
                            aVar2.r(objY6);
                        }
                        final osw oswVar = (osw) objY6;
                        Object objY7 = aVar2.y();
                        if (objY7 == c0042a) {
                            objY7 = ee0.a(0.0f);
                            aVar2.r(objY7);
                        }
                        final wd0 wd0Var = (wd0) objY7;
                        Integer numValueOf = Integer.valueOf(oswVar.D());
                        Boolean bool = (Boolean) ytwVar2.getValue();
                        bool.getClass();
                        boolean zA = aVar2.A(wd0Var);
                        Function0 function1 = function0;
                        boolean zM = zA | aVar2.M(function1);
                        Object objY8 = aVar2.y();
                        if (zM || objY8 == c0042a) {
                            wgi.b bVar2 = new wgi.b(wd0Var, function1, oswVar, ytwVar2, null);
                            aVar2.r(bVar2);
                            objY8 = bVar2;
                        }
                        xvf.g(numValueOf, bool, (Function2) objY8, aVar2);
                        d dVarA = dw.a(r75Var.b(j.i(aVar3, 48.0f), ht.a.g), oswVar.D() > 0 ? 1.0f : 0.0f);
                        Object objY9 = aVar2.y();
                        if (objY9 == c0042a) {
                            objY9 = new Function1() { // from class: vgi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    oswVar.k((int) (((jxo) obj4).a >> 32));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY9);
                        }
                        d dVarJ = h.j(w.a(dVarA, (Function1) objY9), 0.0f, 0.0f, 24.0f, 0.0f, 11);
                        boolean zC = aVar2.c(fB) | aVar2.A(wd0Var);
                        Object objY10 = aVar2.y();
                        if (zC || objY10 == c0042a) {
                            objY10 = new Function1() { // from class: lgi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    a7l a7lVar = (a7l) obj4;
                                    a7lVar.getClass();
                                    osw oswVar2 = oswVar;
                                    a7lVar.B((((Number) wd0Var.d()).floatValue() * (fB + oswVar2.D())) + (-oswVar2.D()));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY10);
                        }
                        d dVarA2 = androidx.compose.ui.graphics.a.a(dVarJ, (Function1) objY10);
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarA2);
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
                        h9n.a(erz.a(R.drawable.ic_football_light, 0, aVar2), null, null, null, null, 0.0f, null, aVar2, 48, 124);
                        crz crzVarA = erz.a(R.drawable.ic_football, 0, aVar2);
                        d dVarD2 = g.d(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.f), 24.0f, 0.0f, 2);
                        boolean zA2 = aVar2.A(wd0Var);
                        Object objY11 = aVar2.y();
                        if (zA2 || objY11 == c0042a) {
                            objY11 = new mgi(wd0Var, 0);
                            aVar2.r(objY11);
                        }
                        h9n.a(crzVarA, null, androidx.compose.ui.graphics.a.a(dVarD2, (Function1) objY11), null, null, 0.0f, null, aVar2, 48, 120);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: sgi
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wgi.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(440760691);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new ogi();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(-1973872516, new pgi(function0, i3), bVarI), bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: qgi
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wgi.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ComposeView composeView, uwd0<? extends lni0> uwd0Var, Function0<Unit> function0) {
        composeView.getClass();
        uwd0Var.getClass();
        composeView.setContent(new op8(404829497, new rk(1, uwd0Var, function0), true));
    }
}
