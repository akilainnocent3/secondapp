package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hxv {
    public static final void a(d dVar, final ftv.b bVar, Function0<Unit> function0, a aVar, final int i, final int i2) {
        final Function0<Unit> function1;
        int i3;
        b bVar2;
        final d dVar2;
        final Function0<Unit> function2;
        bVar.getClass();
        b bVarI = aVar.i(342052330);
        int i4 = i | 6 | ((i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            function1 = function0;
        } else {
            function1 = function0;
            i3 = i4 | (bVarI.A(function1) ? 256 : 128);
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new alm(1);
                    bVarI.r(objY);
                }
                function2 = (Function0) objY;
            } else {
                function2 = function1;
            }
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            h2f0.a.a(j.g(aVar2, 1.0f), 1.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 3126, 0);
            d dVarI = h.i(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_secondary_d_base, bVarI), zk40.a), 20.0f, 12.0f, 20.0f, 12.0f);
            i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            UiText uiText = bVar.d;
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var));
            UiText uiText2 = bVar.e;
            uiText2.getClass();
            dfc.a(strG, uiText2.g((Context) bVarI.O(qyd0Var)), bVarI, 0);
            bfc.a(bVar.f, 48, 0L, 0L, bVarI, j.g(aVar2, 1.0f));
            rg6.a(hib0.a(aVar2, 8.0f, bVarI, aVar2, 1.0f), j060.c(4.0f), gg6.b(c68.a(R.color.bg_warning_secondary, bVarI), 0L, bVarI, 24576, 14), gg6.c(62, 0.0f), null, pp8.b(1468352456, new gaj() { // from class: fxv
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar6 = d.a.b;
                        d dVarI2 = h.i(j.g(aVar6, 1.0f), 4.0f, 4.0f, 0.0f, 4.0f);
                        kw0.k kVar2 = kw0.c;
                        n54.a aVar7 = ht.a.m;
                        i78 i78VarA3 = g78.a(kVar2, aVar7, aVar5, 0);
                        int iHashCode3 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO = aVar5.o();
                        d dVarC3 = c.c(aVar5, dVarI2);
                        yka.k.getClass();
                        tsr.a aVar8 = yka.a.b;
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar8);
                        } else {
                            aVar5.p();
                        }
                        yka.a.b bVar4 = yka.a.f;
                        hlh0.a(aVar5, i78VarA3, bVar4);
                        yka.a.d dVar4 = yka.a.e;
                        hlh0.a(aVar5, ne00VarO, dVar4);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar5, dVarC3, cVar2);
                        d dVarG2 = j.g(aVar6, 1.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar5, 48);
                        int iHashCode4 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO2 = aVar5.o();
                        d dVarC4 = c.c(aVar5, dVarG2);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar8);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, d160VarA, bVar4);
                        hlh0.a(aVar5, ne00VarO2, dVar4);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                        }
                        hlh0.a(aVar5, dVarC4, cVar2);
                        h9n.a(erz.a(R.drawable.group_v2, 0, aVar5), null, j.r(aVar6, 36.0f), null, null, 0.0f, null, aVar5, 432, 120);
                        ty0.a(aVar5, j.w(aVar6, 4.0f));
                        i78 i78VarA4 = g78.a(kVar2, aVar7, aVar5, 0);
                        int iHashCode5 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO3 = aVar5.o();
                        d dVarC5 = c.c(aVar5, aVar6);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar8);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, i78VarA4, bVar4);
                        hlh0.a(aVar5, ne00VarO3, dVar4);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar5, iHashCode5, c1350a2);
                        }
                        hlh0.a(aVar5, dVarC5, cVar2);
                        ftv.b bVar5 = bVar;
                        UiText uiText3 = bVar5.a;
                        uiText3.getClass();
                        qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                        lkf0.d(uiText3.g((Context) aVar5.O(qyd0Var2)), null, c68.a(R.color.text_primary, aVar5), null, 0L, null, t9i.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar5), aVar5, 1572864, 0, 131002);
                        aVar5.N(624305410);
                        nk0.b bVar6 = new nk0.b((Object) null);
                        UiText uiText4 = bVar5.b;
                        uiText4.getClass();
                        bVar6.g("(" + uiText4.g((Context) aVar5.O(qyd0Var2)) + " ");
                        aVar5.N(624309241);
                        final Function0 function3 = function2;
                        boolean zM = aVar5.M(function3);
                        Object objY2 = aVar5.y();
                        if (zM || objY2 == a.C0041a.a) {
                            objY2 = new ufs() { // from class: ywv
                                @Override // defpackage.ufs
                                public final void a(rfs rfsVar) {
                                    rfsVar.getClass();
                                    function3.invoke();
                                }
                            };
                            aVar5.r(objY2);
                        }
                        int iJ = bVar6.j(new rfs.a("MORE_INFO", null, (ufs) objY2));
                        try {
                            aVar5.N(624322010);
                            int iL = bVar6.l(new ora0(c68.a(R.color.text_secondary, aVar5), 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.c, (ix80) null, 61438));
                            try {
                                UiText uiText5 = bVar5.c;
                                uiText5.getClass();
                                bVar6.g(uiText5.g((Context) aVar5.O(qyd0Var2)));
                                Unit unit = Unit.a;
                                bVar6.i(iL);
                                aVar5.H();
                                bVar6.i(iJ);
                                aVar5.H();
                                bVar6.g(")");
                                nk0 nk0VarM = bVar6.m();
                                aVar5.H();
                                lkf0.e(nk0VarM, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0.b(mla.l(R.style.B2_M, aVar5), c68.a(R.color.text_secondary, aVar5), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar5, 0, 0, 262142);
                                aVar5.s();
                                aVar5.s();
                                aVar5.s();
                            } catch (Throwable th) {
                                bVar6.i(iL);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            bVar6.i(iJ);
                            throw th2;
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608, 16);
            bVar2 = bVarI;
            bVar2.X(true);
            bVar2.X(true);
            function1 = function2;
            dVar2 = aVar2;
        } else {
            bVar2 = bVarI;
            bVar2.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gxv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hxv.a(dVar2, bVar, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final ftv.a aVar, a aVar2, final int i) {
        aVar.getClass();
        b bVarI = aVar2.i(-1605722511);
        int i2 = i | 6 | ((i & 64) == 0 ? bVarI.M(aVar) : bVarI.A(aVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar = d.a.b;
            d dVarI = h.i(j.g(dVar, 1.0f), 16.0f, 4.0f, 16.0f, 8.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            rg6.a(j.g(dVar, 1.0f), j060.c(4.0f), gg6.b(c68.a(R.color.background_general_primary, bVarI), 0L, bVarI, 24576, 14), gg6.c(62, 0.0f), m35.a(1.0f, c68.a(R.color.line_type1_primary, bVarI)), pp8.b(931104137, new gaj() { // from class: dxv
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar5 = d.a.b;
                        d dVarG = h.g(j.g(aVar5, 1.0f), 12.0f, 8.0f);
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarG);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar4, i78VarA2, bVar);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar2);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar4, dVarC2, cVar);
                        d dVarJ = h.j(j.g(aVar5, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar4, 48);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO2 = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarJ);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, d160VarA, bVar);
                        hlh0.a(aVar4, ne00VarO2, dVar2);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC3, cVar);
                        h6n.b(erz.a(R.drawable.ic_stopwatch, 0, aVar4), null, j.r(aVar5, 16.0f), c68.a(R.color.icon_primary, aVar4), aVar4, 432, 0);
                        ty0.a(aVar4, j.w(aVar5, 8.0f));
                        ftv.a aVar7 = aVar;
                        UiText uiText = aVar7.a;
                        uiText.getClass();
                        qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                        lkf0.d(uiText.g((Context) aVar4.O(qyd0Var)), null, c68.a(R.color.text_primary, aVar4), null, 0L, null, t9i.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 1572864, 0, 131002);
                        aVar4.s();
                        UiText uiText2 = aVar7.b;
                        uiText2.getClass();
                        String strG = uiText2.g((Context) aVar4.O(qyd0Var));
                        UiText uiText3 = aVar7.c;
                        uiText3.getClass();
                        dfc.a(strG, uiText3.g((Context) aVar4.O(qyd0Var)), aVar4, 0);
                        bfc.a(aVar7.d, 48, 0L, 0L, aVar4, j.g(aVar5, 1.0f));
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: exv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    hxv.b(dVar, aVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ComposeView composeView, boolean z, final ftv ftvVar, final Function0<Unit> function0) {
        if (!z || ftvVar == null) {
            composeView.setContent(xe9.b);
            return;
        }
        if (ftvVar instanceof ftv.a) {
            composeView.setContent(new op8(-1711113428, new Function2() { // from class: zwv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        scv.b(null, null, null, pp8.b(-1884270080, new bxv(ftvVar), aVar), aVar, 3072, 7);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        } else if (ftvVar instanceof ftv.b) {
            composeView.setContent(new op8(-829126123, new Function2() { // from class: axv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        scv.b(null, null, null, pp8.b(271055849, new cxv(ftvVar, function0), aVar), aVar, 3072, 7);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        } else {
            uhc.a();
        }
    }
}
