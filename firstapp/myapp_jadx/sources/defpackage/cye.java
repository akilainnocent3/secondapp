package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class cye {

    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ Function1<ywe, Unit> a;

        /* JADX INFO: renamed from: cye$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.verification.DobVerificationScreenKt$DobVerificationScreen$4$1$1$1$1$1", f = "DobVerificationScreen.kt", l = {129, 131}, m = "invokeSuspend", v = 2)
        public static final class C0469a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ Function1<ywe, Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0469a(Function1<? super ywe, Unit> function1, v1b<? super C0469a> v1bVar) {
                super(2, v1bVar);
                this.d = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0469a c0469a = new C0469a(this.d, v1bVar);
                c0469a.c = obj;
                return c0469a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((C0469a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
            
                if (r7 == r1) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = r6.c
                    vp1 r0 = (defpackage.vp1) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r6.b
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L1f
                    if (r2 == r5) goto L1b
                    if (r2 != r4) goto L15
                    defpackage.uj50.b(r7)
                    goto L3c
                L15:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r3
                L1b:
                    defpackage.uj50.b(r7)
                    goto L2f
                L1f:
                    defpackage.uj50.b(r7)
                    c020 r7 = defpackage.c020.a
                    r6.c = r0
                    r6.b = r5
                    java.lang.Object r7 = defpackage.u4f0.b(r0, r6, r5)
                    if (r7 != r1) goto L2f
                    goto L3b
                L2f:
                    c020 r7 = defpackage.c020.a
                    r6.c = r3
                    r6.b = r4
                    java.lang.Object r7 = defpackage.u4f0.h(r0, r7, r6)
                    if (r7 != r1) goto L3c
                L3b:
                    return r1
                L3c:
                    m020 r7 = (defpackage.m020) r7
                    if (r7 == 0) goto L47
                    kotlin.jvm.functions.Function1<ywe, kotlin.Unit> r6 = r6.d
                    ywe$d r7 = ywe.d.a
                    r6.invoke(r7)
                L47:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: cye.a.C0469a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super ywe, Unit> function1) {
            this.a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            return dqi.b(u020Var, new C0469a(this.a, null), v1bVar);
        }
    }

    public static final void a(final dye dyeVar, final Function1<? super ywe, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        dyeVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1514357308);
        int i2 = (bVarI.A(dyeVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            b(dyeVar, function1, bVarI, (i2 & 112) | (i2 & 14) | 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: txe
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    cye.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final dye dyeVar, final Function1<? super ywe, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1045939079);
        int i2 = (bVarI.A(dyeVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            hxe.a(dyeVar.g, function1, bVarI, 8 | i3);
            if (dyeVar.h) {
                bVarI.N(416875451);
                Long l = dyeVar.a;
                boolean z = true;
                IntRange intRange = dyeVar.b;
                boolean z2 = i3 == 32;
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z2 || objY == c0042a) {
                    objY = new Function1() { // from class: uxe
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            function1.invoke(new ywe.k((Long) obj));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function1 function2 = (Function1) objY;
                if (i3 != 32) {
                    z = false;
                }
                Object objY2 = bVarI.y();
                if (z || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: vxe
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(ywe.g.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                cxc.a(l, null, intRange, function2, (Function0) objY2, bVarI, 0, 2);
                bVarI.X(false);
            } else {
                bVarI.N(417165673);
                bVarI.X(false);
            }
            x8d0.a(null, pp8.b(927230960, new Function2() { // from class: wxe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strA = cb40.a(R.string.common_functions__date_of_birth, new Object[0], aVar2);
                        final Function1 function3 = function1;
                        boolean zM = aVar2.M(function3);
                        Object objY3 = aVar2.y();
                        if (zM || objY3 == a.C0041a.a) {
                            objY3 = new Function0() { // from class: bye
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke(ywe.b.a);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        odd0.b(0, aVar2, null, strA, (Function0) objY3);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, pp8.b(270277866, new gaj() { // from class: xxe
                /* JADX WARN: Code duplicated, block: B:54:0x031e  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a.C0041a.C0042a c0042a2;
                    boolean zM;
                    Object objY3;
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarE = h.e(j.e(aVar3, 1.0f), tmzVar);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarE);
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
                        mw90.a("https://s.sporty.net/cms/bg_birthday_curtain_base_471de950ed.png", "Birthday Curtain", j.e(aVar3, 1.0f), null, null, d0b.a.g, null, aVar2, 1573302, 1976);
                        d dVarI = h.i(op70.c(j.e(aVar3, 1.0f), op70.a(aVar2), 14), 32.0f, 36.0f, 32.0f, 90.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarI);
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
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        mw90.a("https://s.sporty.net/cms/img_gift_box_closed_with_skew_81755a88ab.png", "Gift", j.t(aVar3, 160.0f, 175.0f), null, null, null, null, aVar2, 438, 2040);
                        lkf0.d(cb40.a(R.string.dob_verification__dob_verify_page_title, new Object[0], aVar2), h.h(aVar3, 0.0f, 16.0f, 1), c68.a(R.color.text_inverse_primary, aVar2), null, mla.m(32.0f, aVar2), null, new t9i(700), null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar2, 1572912, 0, 261032);
                        dye dyeVar2 = dyeVar;
                        lkf0.d(dyeVar2.i, null, c68.a(R.color.text_inverse_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 0, 0, 130042);
                        ty0.a(aVar2, j.i(aVar3, 24.0f));
                        long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                        zk40.a aVar5 = zk40.a;
                        d dVarH = g3w.h(androidx.compose.foundation.a.b(aVar3, jA, aVar5), "dob_text_field");
                        Long l2 = dyeVar2.a;
                        Function1 function3 = function1;
                        boolean zM2 = aVar2.M(function3);
                        Object objY4 = aVar2.y();
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (zM2 || objY4 == c0042a3) {
                            objY4 = new cye.a(function3);
                            aVar2.r(objY4);
                        }
                        tyx.c(wje0.a(dVarH, l2, (PointerInputEventHandler) objY4), dyeVar2.b(), rz8.a, null, false, null, dyeVar2.e, true, "DD/MM/YYYY", null, null, null, null, 0, null, null, null, aVar2, 113246592, 0, 130616);
                        ty0.a(aVar2, j.i(aVar3, 12.0f));
                        d dVarH2 = g3w.h(androidx.compose.foundation.a.b(aVar3, c68.a(R.color.bg_primary_d_base, aVar2), aVar5), "nin_text_field");
                        ijf0 ijf0Var = dyeVar2.c;
                        boolean z3 = dyeVar2.f;
                        gop gopVar = new gop(3, 0, 123);
                        v6x v6xVar = new v6x();
                        boolean zM3 = aVar2.M(function3);
                        Object objY5 = aVar2.y();
                        if (zM3) {
                            c0042a2 = c0042a3;
                        } else {
                            c0042a2 = c0042a3;
                            if (objY5 == c0042a2) {
                            }
                            a.C0041a.C0042a c0042a4 = c0042a2;
                            jr7.a(dVarH2, ijf0Var, rz8.b, false, null, z3, "123 456 789 00", null, null, gopVar, v6xVar, 0, null, null, (Function1) objY5, aVar2, 806879616, 0, 14744);
                            aVar2.s();
                            d dVarG = h.g(androidx.compose.foundation.layout.d.a.b(j.g(aVar3, 1.0f), ht.a.h), 32.0f, 24.0f);
                            String strA = cb40.a(R.string.wap_profile__verified_now, new Object[0], aVar2);
                            uxs uxsVar = dyeVar2.d;
                            zM = aVar2.M(function3);
                            objY3 = aVar2.y();
                            if (zM || objY3 == c0042a4) {
                                objY3 = new aye(function3, 0);
                                aVar2.r(objY3);
                            }
                            aza.a(dVarG, strA, uxsVar, null, null, null, null, null, (Function0) objY3, null, aVar2, 0, 760);
                            aVar2.s();
                        }
                        objY5 = new zxe(function3, 0);
                        aVar2.r(objY5);
                        a.C0041a.C0042a c0042a5 = c0042a2;
                        jr7.a(dVarH2, ijf0Var, rz8.b, false, null, z3, "123 456 789 00", null, null, gopVar, v6xVar, 0, null, null, (Function1) objY5, aVar2, 806879616, 0, 14744);
                        aVar2.s();
                        d dVarG2 = h.g(androidx.compose.foundation.layout.d.a.b(j.g(aVar3, 1.0f), ht.a.h), 32.0f, 24.0f);
                        String strA2 = cb40.a(R.string.wap_profile__verified_now, new Object[0], aVar2);
                        uxs uxsVar2 = dyeVar2.d;
                        zM = aVar2.M(function3);
                        objY3 = aVar2.y();
                        if (zM) {
                            objY3 = new aye(function3, 0);
                            aVar2.r(objY3);
                        } else {
                            objY3 = new aye(function3, 0);
                            aVar2.r(objY3);
                        }
                        aza.a(dVarG2, strA2, uxsVar2, null, null, null, null, null, (Function0) objY3, null, aVar2, 0, 760);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24624, 13);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: yxe
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    cye.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
