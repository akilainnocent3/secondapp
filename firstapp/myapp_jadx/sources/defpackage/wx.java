package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class wx {
    public static final void a(yx yxVar, a aVar, int i) {
        final yx yxVar2;
        b bVarI = aVar.i(6144231);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yxVar2 = (yx) p8i0.a(jq40.a(yx.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                yxVar2 = yxVar;
            }
            bVarI.Y();
            final ytw ytwVarB = n95.b(yxVar2.w, bVarI);
            final ytw ytwVarB2 = n95.b(yxVar2.c, bVarI);
            final ytw ytwVarB3 = n95.b(yxVar2.e, bVarI);
            final ytw ytwVarB4 = n95.b(yxVar2.i, bVarI);
            d dVarE = j.e(d.a.b, 1.0f);
            kw0.i iVar = new kw0.i(16.0f, true, new hw0());
            umz umzVar = new umz(16.0f, 16.0f, 16.0f, 16.0f);
            boolean zA = bVarI.A(yxVar2) | bVarI.M(ytwVarB2) | bVarI.M(ytwVarB3) | bVarI.M(ytwVarB4) | bVarI.M(ytwVarB);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                Function1 function1 = new Function1() { // from class: ox
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final yx yxVar3 = yxVar2;
                        szr.h(szrVar, null, new op8(2028713906, new qx(yxVar3, 0), true), 3);
                        szr.h(szrVar, null, pq8.b, 3);
                        final twd0 twd0Var = ytwVarB2;
                        final twd0 twd0Var2 = ytwVarB3;
                        final twd0 twd0Var3 = ytwVarB4;
                        szr.h(szrVar, null, new op8(1805108090, new gaj() { // from class: hx
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String str = (String) twd0Var.getValue();
                                    yx yxVar4 = yxVar3;
                                    boolean zA2 = aVar2.A(yxVar4);
                                    Object objY2 = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zA2 || objY2 == c0042a) {
                                        rx rxVar = new rx(1, yxVar4, yx.class, "onCampaignCodeChange", "onCampaignCodeChange(Ljava/lang/String;)V", 0);
                                        aVar2.r(rxVar);
                                        objY2 = rxVar;
                                    }
                                    Function1 function2 = (Function1) ((chp) objY2);
                                    boolean zA3 = aVar2.A(yxVar4);
                                    Object objY3 = aVar2.y();
                                    if (zA3 || objY3 == c0042a) {
                                        sx sxVar = new sx(1, yxVar4, yx.class, "onEventNameChange", "onEventNameChange(Ljava/lang/String;)V", 0);
                                        aVar2.r(sxVar);
                                        objY3 = sxVar;
                                    }
                                    Function1 function3 = (Function1) ((chp) objY3);
                                    boolean zA4 = aVar2.A(yxVar4);
                                    Object objY4 = aVar2.y();
                                    if (zA4 || objY4 == c0042a) {
                                        tx txVar = new tx(0, yxVar4, yx.class, "testCampaign", "testCampaign()V", 0);
                                        aVar2.r(txVar);
                                        objY4 = txVar;
                                    }
                                    wx.b(str, function2, function3, (Function0) ((chp) objY4), (String) twd0Var2.getValue(), ((Boolean) twd0Var3.getValue()).booleanValue(), aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        szr.h(szrVar, null, pq8.c, 3);
                        szr.h(szrVar, null, pq8.d, 3);
                        twd0 twd0Var4 = ytwVarB;
                        if (((List) twd0Var4.getValue()).isEmpty()) {
                            szr.h(szrVar, null, pq8.e, 3);
                        } else {
                            List list = (List) twd0Var4.getValue();
                            szrVar.d(list.size(), null, new ux(list), new op8(802480018, new vx(list), true));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            }
            aur.a(dVarE, null, umzVar, false, iVar, null, null, false, null, (Function1) objY, bVarI, 24966, 490);
            bVarI = bVarI;
        } else {
            bVarI.G();
            yxVar2 = yxVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new px(yxVar2, i);
        }
    }

    public static final void b(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function0<Unit> function0, final String str2, final boolean z, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1981723825);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            rg6.c(j.g(d.a.b, 1.0f), null, null, gg6.d(62), pp8.b(934351702, new gaj() { // from class: kx
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarF = h.f(aVar3, 16.0f);
                        i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, aVar2, 6);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
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
                        lkf0.d("Manual Input", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar2.O(gah0.a)).h, aVar2, 6, 0, 131070);
                        d dVarG = j.g(aVar3, 1.0f);
                        String str3 = str;
                        gaz.b(str3, function1, dVarG, false, null, pq8.g, null, null, null, null, true, 0, 0, null, null, aVar2, 1573248, 8257464);
                        gaz.b(str2, function2, j.g(aVar3, 1.0f), false, null, pq8.h, null, null, null, null, true, 0, 0, null, null, aVar2, 1573248, 8257464);
                        boolean zU = StringsKt.U(str3);
                        final boolean z2 = z;
                        nk5.a(function0, new HorizontalAlignElement(ht.a.o), (zU || z2) ? false : true, null, null, null, null, null, null, pp8.b(-2012826320, new gaj() { // from class: mx
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar5 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((e160) obj4).getClass();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    lkf0.d(z2 ? "Testing…" : "Test APIs", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar5, 0, 0, 262142);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 805306368, 504);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24582, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wx.b(str, function1, function2, function0, str2, z, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVarI = aVar.i(843182415);
        if (bVarI.q(i & 1, i != 0)) {
            rg6.c(j.g(d.a.b, 1.0f), null, null, gg6.d(62), pq8.f, bVarI, 24582, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new nx(i);
        }
    }

    public static final void d(final g46 g46Var, a aVar, final int i) {
        b bVarI = aVar.i(1990309211);
        int i2 = (bVarI.A(g46Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            rg6.c(j.g(d.a.b, 1.0f), null, null, gg6.d(62), pp8.b(854437782, new gaj() { // from class: ix
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2;
                    long j;
                    long j2;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        d dVarF = h.f(aVar4, 16.0f);
                        i78 i78VarA = g78.a(new kw0.i(6.0f, true, new hw0()), ht.a.m, aVar3, 6);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarF);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar3, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        d dVarG = j.g(aVar4, 1.0f);
                        d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, aVar3, 54);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarG);
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
                        hlh0.a(aVar3, d160VarA, bVar);
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar3, dVarC2, cVar);
                        g46 g46Var2 = g46Var;
                        String str = g46Var2.a;
                        f0e0 f0e0Var = g46Var2.c;
                        lkf0.d(str, new LayoutWeightElement(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mcv.b(aVar3).h, aVar3, 0, 24960, 110588);
                        String str2 = new SimpleDateFormat("h:mm:ss a", Locale.getDefault()).format(new Date(g46Var2.b));
                        str2.getClass();
                        lkf0.d(str2, j.y(aVar4, 80.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mcv.b(aVar3).l, aVar3, 48, 0, 130044);
                        aVar3.s();
                        lkf0.d("1) Participate", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mcv.b(aVar3).m, aVar3, 6, 0, 131070);
                        if (f0e0Var.a) {
                            aVar3.N(2084416424);
                            String str3 = g46Var2.e;
                            if (str3 == null) {
                                str3 = "-";
                            }
                            aVar2 = aVar3;
                            lkf0.d("variantValue: " + str3 + " (" + g46Var2.f + ")", null, mcv.a(aVar3).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262138);
                            aVar2.H();
                        } else {
                            aVar3.N(2084625395);
                            aVar2 = aVar3;
                            lkf0.d(f0e0Var.b, null, mcv.a(aVar3).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262138);
                            aVar2.H();
                        }
                        lkf0.d("2) Visit", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mcv.b(aVar2).m, aVar2, 6, 0, 131070);
                        a aVar6 = aVar2;
                        f0e0 f0e0Var2 = g46Var2.g;
                        String str4 = f0e0Var2.b;
                        if (f0e0Var2.a) {
                            aVar6.N(-1456761357);
                            j = mcv.a(aVar6).a;
                            aVar6.H();
                        } else {
                            aVar6.N(-1456759599);
                            j = mcv.a(aVar6).w;
                            aVar6.H();
                        }
                        lkf0.d(str4, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar6, 0, 0, 262138);
                        lkf0.d("3) Convert", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mcv.b(aVar6).m, aVar6, 6, 0, 131070);
                        f0e0 f0e0Var3 = g46Var2.h;
                        String str5 = f0e0Var3.b;
                        if (f0e0Var3.a) {
                            aVar6.N(-1456750477);
                            j2 = mcv.a(aVar6).a;
                            aVar6.H();
                        } else {
                            aVar6.N(-1456748719);
                            j2 = mcv.a(aVar6).w;
                            aVar6.H();
                        }
                        lkf0.d(str5, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar6, 0, 0, 262138);
                        aVar6.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24582, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: jx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wx.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
