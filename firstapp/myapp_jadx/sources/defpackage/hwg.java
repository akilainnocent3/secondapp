package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class hwg {
    public static final void a(final iwg iwgVar, final String str, final zi40 zi40Var, final Function0 function0, final Function0 function1, a aVar, final int i) {
        b bVar;
        iwgVar.getClass();
        zi40Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1037507291);
        int i2 = i | (bVarI.M(iwgVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | 3072 | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new xvg();
                bVarI.r(objY);
            }
            bVar = bVarI;
            v1w.b(function1, androidx.compose.ui.input.nestedscroll.a.a(d.a.b, cre.a, null), v1w.g(true, (Function1) objY, bVarI, 54, 0), 0.0f, zk40.a, r58.d(3204448256L), 0L, j58.c(0.5f, j58.b), null, null, null, pp8.b(-546814680, new gaj() { // from class: yvg
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    zk40.a aVar2;
                    yka.a.d dVar;
                    yka.a.c cVar;
                    yka.a.C1350a c1350a;
                    yka.a.b bVar2;
                    iwg iwgVar2;
                    zi40 zi40Var2;
                    d.a aVar3;
                    yka.a.b bVar3;
                    yka.a.d dVar2;
                    tsr.a aVar4;
                    String str2;
                    Function0 function2;
                    int i3;
                    a aVar5;
                    int i4;
                    tsr.a aVar6;
                    yka.a.C1350a c1350a2;
                    a aVar7 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    int i5 = 0;
                    if (aVar7.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j = j58.f;
                        d.a aVar8 = d.a.b;
                        zk40.a aVar9 = zk40.a;
                        d dVarF = h.f(androidx.compose.foundation.a.b(aVar8, j, aVar9), 8.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar7, 0);
                        int iHashCode = Long.hashCode(aVar7.m());
                        ne00 ne00VarO = aVar7.o();
                        d dVarC = c.c(aVar7, dVarF);
                        yka.k.getClass();
                        tsr.a aVar10 = yka.a.b;
                        if (aVar7.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar7.D();
                        if (aVar7.g()) {
                            aVar7.F(aVar10);
                        } else {
                            aVar7.p();
                        }
                        yka.a.b bVar4 = yka.a.f;
                        hlh0.a(aVar7, i78VarA, bVar4);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar7, ne00VarO, dVar3);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar7, iHashCode, c1350a3);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar7, dVarC, cVar2);
                        String str3 = str;
                        iwg iwgVar3 = iwgVar;
                        if (str3 == null || !(iwgVar3 instanceof iwg.b)) {
                            f = 8.0f;
                            aVar2 = aVar9;
                            dVar = dVar3;
                            cVar = cVar2;
                            c1350a = c1350a3;
                            bVar2 = bVar4;
                            iwgVar2 = iwgVar3;
                            aVar7.N(1937318372);
                        } else {
                            aVar7.N(1940813622);
                            i060 i060VarC = j060.c(8.0f);
                            long jA = c68.a(R.color.exit_dialog_background_color, aVar7);
                            op8 op8VarB = pp8.b(515458260, new awg(str3, i5), aVar7);
                            iwgVar2 = iwgVar3;
                            bVar2 = bVar4;
                            dVar = dVar3;
                            aVar2 = aVar9;
                            cVar = cVar2;
                            c1350a = c1350a3;
                            f = 8.0f;
                            ihe0.a(null, i060VarC, jA, 0L, 0.0f, 0.0f, null, op8VarB, aVar7, 12582912, 121);
                        }
                        aVar7.H();
                        ty0.a(aVar7, j.i(aVar8, f));
                        boolean zG = Intrinsics.g(iwgVar2, iwg.a.a);
                        zi40 zi40Var3 = zi40Var;
                        Function0 function3 = function0;
                        if (zG) {
                            aVar7.N(1941977300);
                            d dVarI = j.i(j.g(aVar8, 1.0f), 150.0f);
                            aiv aivVarC = g75.c(ht.a.e, false);
                            int iHashCode2 = Long.hashCode(aVar7.m());
                            ne00 ne00VarO2 = aVar7.o();
                            d dVarC2 = c.c(aVar7, dVarI);
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar6 = aVar10;
                                aVar7.F(aVar6);
                            } else {
                                aVar6 = aVar10;
                                aVar7.p();
                            }
                            yka.a.b bVar5 = bVar2;
                            hlh0.a(aVar7, aivVarC, bVar5);
                            yka.a.d dVar4 = dVar;
                            hlh0.a(aVar7, ne00VarO2, dVar4);
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode2))) {
                                c1350a2 = c1350a;
                                j3c.a(iHashCode2, aVar7, iHashCode2, c1350a2);
                            } else {
                                c1350a2 = c1350a;
                            }
                            yka.a.c cVar3 = cVar;
                            hlh0.a(aVar7, dVarC2, cVar3);
                            q330.b(null, 0L, 0.0f, 0L, 0, aVar7, 0, 31);
                            aVar7.s();
                            aVar7.H();
                            function2 = function3;
                            dVar2 = dVar4;
                            zi40Var2 = zi40Var3;
                            aVar3 = aVar8;
                            i3 = 0;
                            bVar3 = bVar5;
                            aVar4 = aVar6;
                            c1350a = c1350a2;
                            cVar = cVar3;
                            aVar5 = aVar7;
                        } else {
                            yka.a.b bVar6 = bVar2;
                            yka.a.d dVar5 = dVar;
                            if (!(iwgVar2 instanceof iwg.b)) {
                                throw rg.a(1171023187, aVar7);
                            }
                            aVar7.N(1942409564);
                            List<CommonGameDetails> list = ((iwg.b) iwgVar2).a;
                            if (list == null || !(!list.isEmpty())) {
                                zi40Var2 = zi40Var3;
                                aVar3 = aVar8;
                                bVar3 = bVar6;
                                dVar2 = dVar5;
                                aVar4 = aVar10;
                                aVar7.N(1943455535);
                                ty0.a(aVar7, j.i(aVar3, f));
                                if (str3 == 0) {
                                    aVar7.N(1171075885);
                                    String strD = com.sportygames.newcms.c.d(zi40Var2.o(), pwo.e(R.string.exit_text, aVar7), aVar7);
                                    aVar7.H();
                                    str2 = strD;
                                } else {
                                    aVar7.N(1171074522);
                                    aVar7.H();
                                    str2 = str3;
                                }
                                function2 = function3;
                                i3 = 0;
                                lkf0.b(str2, j.g(aVar3, 1.0f), 0L, d2l.f(20), null, t9i.E, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar7, 199728, 0, 130516);
                                aVar5 = aVar7;
                                ty0.a(aVar5, j.i(aVar3, 16.0f));
                                aVar5.H();
                            } else {
                                aVar7.N(1942478601);
                                zi40Var2 = zi40Var3;
                                aVar3 = aVar8;
                                bVar3 = bVar6;
                                dVar2 = dVar5;
                                aVar4 = aVar10;
                                lkf0.b(com.sportygames.newcms.c.d(zi40Var3.c(), "You may also like these games", aVar7), null, c68.a(R.color.sb_black, aVar7), d2l.f(16), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar7, 199680, 0, 131026);
                                ty0.a(aVar7, j.i(aVar3, f));
                                boolean zA = aVar7.A(list) | aVar7.M(function3);
                                Object objY2 = aVar7.y();
                                if (zA || objY2 == a.C0041a.a) {
                                    i4 = 0;
                                    objY2 = new bwg(i4, function3, list);
                                    aVar7.r(objY2);
                                } else {
                                    i4 = 0;
                                }
                                aur.b(null, null, null, null, null, null, false, null, (Function1) objY2, aVar7, 0, 511);
                                aVar5 = aVar7;
                                aVar5.H();
                                function2 = function3;
                                i3 = i4;
                            }
                            aVar5.H();
                        }
                        aVar5.s();
                        long jA2 = c68.a(R.color.redblack_confirm_dialog_right_button, aVar5);
                        long jA3 = c68.a(R.color.redblack_confirm_dialog_left_button, aVar5);
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, i3);
                        int iHashCode3 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO3 = aVar5.o();
                        d dVarC3 = c.c(aVar5, aVar3);
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar4);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, d160VarA, bVar3);
                        hlh0.a(aVar5, ne00VarO3, dVar2);
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar5, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar5, dVarC3, cVar);
                        int i6 = str3 != null ? i3 : 1;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarA = oka.a(48, aVar5, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "exit_game_button");
                        umz umzVar = ek5.a;
                        if (i6 == 0) {
                            jA3 = jA2;
                        }
                        final zi40 zi40Var4 = zi40Var2;
                        int i7 = i6;
                        nk5.a(function2, dVarA, false, aVar2, ek5.a(jA3, 0L, 0L, 0L, aVar5, 14), null, null, null, null, pp8.b(1356609148, new gaj() { // from class: cwg
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                e160 e160Var = (e160) obj4;
                                a aVar11 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                e160Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar11.M(e160Var) ? 4 : 2;
                                }
                                if (aVar11.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    lkf0.b(com.sportygames.newcms.c.d(zi40Var4.a(), "Exit", aVar11), h.h(e160Var.b(d.a.b, ht.a.k), 0.0f, 8.0f, 1), j58.f, d2l.f(18), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar11, 200064, 0, 131024);
                                } else {
                                    aVar11.G();
                                }
                                return Unit.a;
                            }
                        }, aVar5), aVar5, 805309440, 484);
                        if (i7 != 0) {
                            aVar5.N(127888338);
                            if (2.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            nk5.a(function1, oka.a(48, aVar5, new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "stay_button"), false, aVar2, ek5.a(jA2, 0L, 0L, 0L, aVar5, 14), null, null, null, null, pp8.b(2008474839, new dwg(zi40Var4, 0), aVar5), aVar5, 805309440, 484);
                        } else {
                            aVar5.N(119877814);
                        }
                        aVar5.H();
                        aVar5.s();
                    } else {
                        aVar7.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 15) & 14) | 906190848);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, zi40Var, function0, function1, i) { // from class: zvg
                public final /* synthetic */ String b;
                public final /* synthetic */ zi40 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    hwg.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final CommonGameDetails commonGameDetails, final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(1311017797);
        int i2 = (bVarI.A(commonGameDetails) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zA = bVarI.A(commonGameDetails) | bVarI.A(context) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: tvg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ((f3) sjj.b().c.d.a(jq40.a(f3.class), null, null)).a(commonGameDetails, context, "All");
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rg6.b((Function0) objY, j.r(d.a.b, 122.0f), false, j060.c(8.0f), null, null, null, null, pp8.b(920732720, new gaj() { // from class: vvg
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
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
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        CommonGameDetails commonGameDetails2 = commonGameDetails;
                        mw90.b(commonGameDetails2.getImageUrl(), null, j.e(aVar3, 1.0f), erz.a(R.drawable.placeholder, 0, aVar2), erz.a(R.drawable.placeholder, 0, aVar2), null, null, null, null, 0.0f, null, aVar2, 432, 0, 32736);
                        String name = commonGameDetails2.getName();
                        if (name == null) {
                            name = "";
                        }
                        lkf0.b(name, h.f(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), 4.0f), j58.f, d2l.f(14), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar2, 200064, 0, 131024);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 100663344, 244);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: wvg
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hwg.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
