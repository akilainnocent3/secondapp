package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class s8a {
    public static final void a(final xw4 xw4Var, final LobbyV2ViewModel lobbyV2ViewModel, final fuj fujVar, final db6 db6Var, final boolean z, final Function0 function0, final Function1 function1, final Function0 function2, a aVar, final int i) {
        xw4Var.getClass();
        lobbyV2ViewModel.getClass();
        db6Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(2048876162);
        int i2 = i | (bVarI.A(xw4Var) ? 4 : 2) | (bVarI.A(lobbyV2ViewModel) ? 32 : 16) | (bVarI.A(fujVar) ? 256 : 128) | (bVarI.A(db6Var) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function1) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            lqu.a(48, pp8.b(-238956423, new Function2() { // from class: j8a
                /* JADX WARN: Code duplicated, block: B:135:0x040d  */
                /* JADX WARN: Code duplicated, block: B:142:0x0444  */
                /* JADX WARN: Code duplicated, block: B:146:0x0462  */
                /* JADX WARN: Code duplicated, block: B:150:0x0480  */
                /* JADX WARN: Code duplicated, block: B:154:0x04c3  */
                /* JADX WARN: Code duplicated, block: B:158:0x04da  */
                /* JADX WARN: Code duplicated, block: B:162:0x04f2  */
                /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
                /* JADX WARN: Code duplicated, block: B:38:0x0108  */
                /* JADX WARN: Code duplicated, block: B:43:0x0125  */
                /* JADX WARN: Code duplicated, block: B:46:0x0139  */
                /* JADX WARN: Code duplicated, block: B:48:0x0147  */
                /* JADX WARN: Code duplicated, block: B:49:0x0149  */
                /* JADX WARN: Code duplicated, block: B:52:0x014e A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:55:0x0153  */
                /* JADX WARN: Code duplicated, block: B:57:0x0156  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ytw ytwVarB;
                    ytw ytwVar;
                    fuj fujVar2;
                    xw4 xw4Var2;
                    LoadingState loadingState;
                    WalletInfo walletInfo;
                    WalletInfo walletInfo2;
                    boolean zG;
                    boolean z2;
                    boolean z3;
                    a.C0041a.C0042a c0042a;
                    final xw4 xw4Var3;
                    final db6 db6Var2;
                    final ytw ytwVar2;
                    int i3;
                    int i4;
                    int i5;
                    a.C0041a.C0042a c0042a2;
                    int i6;
                    HTTPResponse hTTPResponse;
                    CampaignTopicResponse campaignTopicResponseD;
                    boolean zA;
                    Object objY;
                    final Function1 function3;
                    boolean zM;
                    Object objY2;
                    boolean zA2;
                    Object objY3;
                    boolean zM2;
                    Object objY4;
                    boolean zA3;
                    Object objY5;
                    ssw<CampaignTopicResponse> sswVar;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ytw ytwVarA = ts9.a(lobbyV2ViewModel.d, aVar2);
                        fuj fujVar3 = fujVar;
                        ssw<CampaignTopicResponse> sswVar2 = fujVar3 != null ? fujVar3.d : null;
                        if (sswVar2 == null) {
                            aVar2.N(-1989804104);
                            aVar2.H();
                            ytwVarB = null;
                        } else {
                            aVar2.N(-2003849879);
                            ytwVarB = ts9.b(sswVar2, sswVar2.d(), aVar2, 0);
                            aVar2.H();
                        }
                        CampaignTopicResponse campaignTopicResponse = ytwVarB != null ? (CampaignTopicResponse) ytwVarB.getValue() : null;
                        db6 db6Var3 = db6Var;
                        Campaign campaign = (Campaign) wyh.b(db6Var3.w, null, aVar2, 48, 14).getValue();
                        Object objY6 = aVar2.y();
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (objY6 == c0042a3) {
                            objY6 = m.b(Boolean.FALSE);
                            aVar2.r(objY6);
                        }
                        ytw ytwVar3 = (ytw) objY6;
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(j.c(aVar3, 1.0f), 1.0f);
                        n54 n54Var = ht.a.a;
                        aiv aivVarC = g75.c(n54Var, false);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g()) {
                            ytwVar = ytwVar3;
                            fujVar2 = fujVar3;
                        } else {
                            ytwVar = ytwVar3;
                            fujVar2 = fujVar3;
                            if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            xw4Var2 = xw4Var;
                            if (campaignTopicResponse == null) {
                                aVar2.N(-1904647411);
                                aVar2.H();
                                c0042a = c0042a3;
                                xw4Var3 = xw4Var2;
                                db6Var2 = db6Var3;
                                ytwVar2 = ytwVar;
                                i3 = 14;
                            } else {
                                aVar2.N(-1904647410);
                                loadingState = (LoadingState) ytwVarA.getValue();
                                if (loadingState != null || (hTTPResponse = (HTTPResponse) loadingState.getData()) == null) {
                                    walletInfo = null;
                                } else {
                                    walletInfo = (WalletInfo) hTTPResponse.getData();
                                }
                                walletInfo2 = walletInfo;
                                zG = Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED");
                                if (campaignTopicResponse.isLastCampaignTier()) {
                                    z2 = zG;
                                    boolean z4 = Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "ACTIVE");
                                    if (!z2 || z4) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (walletInfo2 != null || z) {
                                        c0042a = c0042a3;
                                        xw4Var3 = xw4Var2;
                                        db6Var2 = db6Var3;
                                        ytwVar2 = ytwVar;
                                        i3 = 14;
                                        aVar2.N(1797443912);
                                    } else {
                                        aVar2.N(473758575);
                                        String str = db6Var3.i;
                                        if (str == null) {
                                            aVar2.N(1801613938);
                                            aVar2.H();
                                            c0042a = c0042a3;
                                            xw4Var3 = xw4Var2;
                                            db6Var2 = db6Var3;
                                            ytwVar2 = ytwVar;
                                            i3 = 14;
                                        } else {
                                            boolean z5 = z3;
                                            aVar2.N(1801613939);
                                            int iHashCode2 = str.hashCode();
                                            n54 n54Var2 = ht.a.i;
                                            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                                            final CampaignTopicResponse campaignTopicResponse2 = campaignTopicResponse;
                                            if (iHashCode2 != 69387) {
                                                if (iHashCode2 == 1037699538) {
                                                    i3 = 14;
                                                    if (str.equals("BONUS_VAULT")) {
                                                        aVar2.N(642210038);
                                                        if (ra6.d(campaign, campaignTopicResponse2)) {
                                                            i5 = 14;
                                                            db6Var2 = db6Var3;
                                                            xw4Var3 = xw4Var2;
                                                            aVar2.N(636925003);
                                                        } else {
                                                            aVar2.N(642518550);
                                                            d dVarJ = h.j(dVar2.b(aVar3, n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
                                                            aiv aivVarC2 = g75.c(n54Var, false);
                                                            int iHashCode3 = Long.hashCode(aVar2.m());
                                                            ne00 ne00VarO2 = aVar2.o();
                                                            d dVarC2 = c.c(aVar2, dVarJ);
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
                                                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                                                                j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                                                            }
                                                            hlh0.a(aVar2, dVarC2, cVar);
                                                            boolean zG2 = Intrinsics.g(campaignTopicResponse2.getUserActivityStatus(), "READY_TO_CLAIM");
                                                            String strA = jn5.LOTTIE_TREASURE.a();
                                                            String strA2 = jn5.ICON_TREASURE.a();
                                                            xw4Var3 = xw4Var2;
                                                            db6Var2 = db6Var3;
                                                            boolean zA4 = aVar2.A(xw4Var3) | aVar2.A(db6Var2) | aVar2.A(campaignTopicResponse2);
                                                            Object objY7 = aVar2.y();
                                                            if (zA4 || objY7 == c0042a3) {
                                                                objY7 = new Function0() { // from class: m8a
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        xw4Var3.A1();
                                                                        db6Var2.A1(campaignTopicResponse2.getCampaignId(), false);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar2.r(objY7);
                                                            }
                                                            i5 = 14;
                                                            i38.a(true, zG2, strA, strA2, null, null, (Function0) objY7, aVar2, 6, 48);
                                                            aVar2.s();
                                                        }
                                                        aVar2.H();
                                                        aVar2.H();
                                                        Unit unit = Unit.a;
                                                        c0042a = c0042a3;
                                                        i3 = i5;
                                                        ytwVar2 = ytwVar;
                                                    } else {
                                                        c0042a = c0042a3;
                                                        db6Var2 = db6Var3;
                                                        ytwVar2 = ytwVar;
                                                        xw4Var3 = xw4Var2;
                                                        i4 = 636925003;
                                                    }
                                                } else if (iHashCode2 == 1887537372 && str.equals("STACKER_GAME")) {
                                                    aVar2.N(-810601516);
                                                    if (vw4.a((Context) aVar2.O(AndroidCompositionLocals_androidKt.b))) {
                                                        aVar2.N(641219247);
                                                        d dVarJ2 = h.j(dVar2.b(aVar3, n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
                                                        aiv aivVarC3 = g75.c(n54Var, false);
                                                        int iHashCode4 = Long.hashCode(aVar2.m());
                                                        ne00 ne00VarO3 = aVar2.o();
                                                        d dVarC3 = c.c(aVar2, dVarJ2);
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
                                                        hlh0.a(aVar2, aivVarC3, bVar);
                                                        hlh0.a(aVar2, ne00VarO3, dVar);
                                                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode4))) {
                                                            j3c.a(iHashCode4, aVar2, iHashCode4, c1350a);
                                                        }
                                                        hlh0.a(aVar2, dVarC3, cVar);
                                                        boolean zG3 = Intrinsics.g(campaignTopicResponse2.getUserActivityStatus(), "READY_TO_CLAIM");
                                                        String strA3 = jn5.LOTTIE_TREASURE.a();
                                                        String strA4 = jn5.ICON_TREASURE.a();
                                                        Function0 function4 = function0;
                                                        boolean zM3 = aVar2.M(function4);
                                                        Object objY8 = aVar2.y();
                                                        if (zM3 || objY8 == c0042a3) {
                                                            objY8 = new l8a(function4, 0);
                                                            aVar2.r(objY8);
                                                        }
                                                        c0042a2 = c0042a3;
                                                        i6 = 14;
                                                        i38.a(true, zG3, strA3, strA4, null, null, (Function0) objY8, aVar2, 6, 48);
                                                        aVar2.s();
                                                    } else {
                                                        c0042a2 = c0042a3;
                                                        i6 = 14;
                                                        aVar2.N(636925003);
                                                    }
                                                    aVar2.H();
                                                    aVar2.H();
                                                    Unit unit2 = Unit.a;
                                                    i3 = i6;
                                                    c0042a = c0042a2;
                                                    db6Var2 = db6Var3;
                                                    ytwVar2 = ytwVar;
                                                    xw4Var3 = xw4Var2;
                                                } else {
                                                    c0042a = c0042a3;
                                                    db6Var2 = db6Var3;
                                                    ytwVar2 = ytwVar;
                                                    xw4Var3 = xw4Var2;
                                                    i4 = 636925003;
                                                    i3 = 14;
                                                }
                                                aVar2.H();
                                            } else {
                                                c0042a = c0042a3;
                                                db6Var2 = db6Var3;
                                                ytwVar2 = ytwVar;
                                                xw4Var3 = xw4Var2;
                                                i4 = 636925003;
                                                i3 = 14;
                                                if (str.equals("FBG")) {
                                                    aVar2.N(-810517779);
                                                    if (z5) {
                                                        aVar2.N(636925003);
                                                    } else {
                                                        aVar2.N(643770888);
                                                        d dVarJ3 = h.j(dVar2.b(androidx.compose.foundation.layout.c.a(j.g(aVar3, 0.127f), 1.0f), n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
                                                        boolean zA5 = aVar2.A(db6Var2);
                                                        final Function0 function5 = function2;
                                                        boolean zM4 = zA5 | aVar2.M(function5);
                                                        Object objY9 = aVar2.y();
                                                        if (zM4 || objY9 == c0042a) {
                                                            objY9 = new Function0() { // from class: n8a
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    db6Var2.y1("Lobby", null, new cb6());
                                                                    ytwVar2.setValue(Boolean.TRUE);
                                                                    function5.invoke();
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar2.r(objY9);
                                                        }
                                                        e56.b(dVarJ3, campaignTopicResponse2, (Function0) objY9, aVar2, 0);
                                                    }
                                                    aVar2.H();
                                                }
                                                aVar2.H();
                                                Unit unit3 = Unit.a;
                                                aVar2.H();
                                            }
                                            aVar2.N(i4);
                                            aVar2.H();
                                            Unit unit4 = Unit.a;
                                            aVar2.H();
                                        }
                                    }
                                    aVar2.H();
                                    Unit unit5 = Unit.a;
                                    aVar2.H();
                                } else {
                                    z2 = zG;
                                }
                                if (z2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (walletInfo2 != null) {
                                    c0042a = c0042a3;
                                    xw4Var3 = xw4Var2;
                                    db6Var2 = db6Var3;
                                    ytwVar2 = ytwVar;
                                    i3 = 14;
                                    aVar2.N(1797443912);
                                } else {
                                    c0042a = c0042a3;
                                    xw4Var3 = xw4Var2;
                                    db6Var2 = db6Var3;
                                    ytwVar2 = ytwVar;
                                    i3 = 14;
                                    aVar2.N(1797443912);
                                }
                                aVar2.H();
                                Unit unit6 = Unit.a;
                                aVar2.H();
                            }
                            aVar2.s();
                            boolean zBooleanValue = ((Boolean) wyh.c(xw4Var3.d, aVar2, 0, 7).getValue()).booleanValue();
                            if (fujVar2 != null || (sswVar = fujVar2.d) == null) {
                                campaignTopicResponseD = null;
                            } else {
                                campaignTopicResponseD = sswVar.d();
                            }
                            Campaign campaign2 = (Campaign) wyh.b(db6Var2.w, null, aVar2, 48, i3).getValue();
                            zA = aVar2.A(xw4Var3);
                            objY = aVar2.y();
                            if (zA || objY == c0042a) {
                                objY = new o8a(xw4Var3, 0);
                                aVar2.r(objY);
                            }
                            Function0 function6 = (Function0) objY;
                            function3 = function1;
                            zM = aVar2.M(function3) | aVar2.A(xw4Var3);
                            objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new gaj() { // from class: p8a
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        nt4 nt4Var = (nt4) obj3;
                                        Integer num = (Integer) obj4;
                                        num.intValue();
                                        Integer num2 = (Integer) obj5;
                                        num2.intValue();
                                        nt4Var.getClass();
                                        if (nt4Var.c == vt4.d) {
                                            function3.invoke(nt4Var);
                                        } else {
                                            xw4 xw4Var4 = xw4Var3;
                                            xw4Var4.z = nt4Var;
                                            xw4Var4.i = num;
                                            xw4Var4.v = num2;
                                            wwd0 wwd0Var = xw4Var4.e;
                                            Boolean bool = Boolean.TRUE;
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, bool);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            a.C0041a.C0042a c0042a4 = c0042a;
                            mt4.a(false, zBooleanValue, campaignTopicResponseD, campaign2, function6, (gaj) objY2, null, aVar2, 0, 65);
                            boolean zBooleanValue2 = ((Boolean) wyh.c(xw4Var3.e, aVar2, 0, 7).getValue()).booleanValue();
                            nt4 nt4Var = xw4Var3.z;
                            cnj cnjVar = (cnj) wyh.c(xw4Var3.w, aVar2, 0, 7).getValue();
                            zA2 = aVar2.A(xw4Var3);
                            objY3 = aVar2.y();
                            if (zA2 || objY3 == c0042a4) {
                                objY3 = new q8a(xw4Var3, 0);
                                aVar2.r(objY3);
                            }
                            Function1 function7 = (Function1) objY3;
                            zM2 = aVar2.M(function3);
                            objY4 = aVar2.y();
                            if (zM2 || objY4 == c0042a4) {
                                objY4 = new r8a(0, function3);
                                aVar2.r(objY4);
                            }
                            Function1 function8 = (Function1) objY4;
                            zA3 = aVar2.A(xw4Var3);
                            objY5 = aVar2.y();
                            if (zA3 || objY5 == c0042a4) {
                                objY5 = new Function0() { // from class: b8a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        xw4Var3.y1();
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY5);
                            }
                            ss4.a(zBooleanValue2, cnjVar, nt4Var, function7, function8, (Function0) objY5, aVar2, 0);
                            j7t.a(48, pp8.b(-928049669, new gaj() { // from class: c8a
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar5 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((j78) obj3).getClass();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        kof0.a(48, pp8.b(314420834, new d8a(0, db6Var2, ytwVar2), aVar5), aVar5, false);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, ((Boolean) ytwVar2.getValue()).booleanValue());
                        }
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar2);
                        xw4Var2 = xw4Var;
                        if (campaignTopicResponse == null) {
                            aVar2.N(-1904647411);
                            aVar2.H();
                            c0042a = c0042a3;
                            xw4Var3 = xw4Var2;
                            db6Var2 = db6Var3;
                            ytwVar2 = ytwVar;
                            i3 = 14;
                        } else {
                            aVar2.N(-1904647410);
                            loadingState = (LoadingState) ytwVarA.getValue();
                            if (loadingState != null) {
                                walletInfo = null;
                            } else {
                                walletInfo = null;
                            }
                            walletInfo2 = walletInfo;
                            zG = Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED");
                            if (campaignTopicResponse.isLastCampaignTier()) {
                                z2 = zG;
                                if (Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "ACTIVE")) {
                                }
                                if (z2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (walletInfo2 != null) {
                                    c0042a = c0042a3;
                                    xw4Var3 = xw4Var2;
                                    db6Var2 = db6Var3;
                                    ytwVar2 = ytwVar;
                                    i3 = 14;
                                    aVar2.N(1797443912);
                                } else {
                                    c0042a = c0042a3;
                                    xw4Var3 = xw4Var2;
                                    db6Var2 = db6Var3;
                                    ytwVar2 = ytwVar;
                                    i3 = 14;
                                    aVar2.N(1797443912);
                                }
                                aVar2.H();
                                Unit unit7 = Unit.a;
                                aVar2.H();
                            } else {
                                z2 = zG;
                            }
                            if (z2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (walletInfo2 != null) {
                                c0042a = c0042a3;
                                xw4Var3 = xw4Var2;
                                db6Var2 = db6Var3;
                                ytwVar2 = ytwVar;
                                i3 = 14;
                                aVar2.N(1797443912);
                            } else {
                                c0042a = c0042a3;
                                xw4Var3 = xw4Var2;
                                db6Var2 = db6Var3;
                                ytwVar2 = ytwVar;
                                i3 = 14;
                                aVar2.N(1797443912);
                            }
                            aVar2.H();
                            Unit unit8 = Unit.a;
                            aVar2.H();
                        }
                        aVar2.s();
                        boolean zBooleanValue3 = ((Boolean) wyh.c(xw4Var3.d, aVar2, 0, 7).getValue()).booleanValue();
                        if (fujVar2 != null) {
                            campaignTopicResponseD = null;
                        } else {
                            campaignTopicResponseD = null;
                        }
                        Campaign campaign3 = (Campaign) wyh.b(db6Var2.w, null, aVar2, 48, i3).getValue();
                        zA = aVar2.A(xw4Var3);
                        objY = aVar2.y();
                        if (zA) {
                            objY = new o8a(xw4Var3, 0);
                            aVar2.r(objY);
                        } else {
                            objY = new o8a(xw4Var3, 0);
                            aVar2.r(objY);
                        }
                        Function0 function9 = (Function0) objY;
                        function3 = function1;
                        zM = aVar2.M(function3) | aVar2.A(xw4Var3);
                        objY2 = aVar2.y();
                        if (zM) {
                            objY2 = new gaj() { // from class: p8a
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    nt4 nt4Var2 = (nt4) obj3;
                                    Integer num = (Integer) obj4;
                                    num.intValue();
                                    Integer num2 = (Integer) obj5;
                                    num2.intValue();
                                    nt4Var2.getClass();
                                    if (nt4Var2.c == vt4.d) {
                                        function3.invoke(nt4Var2);
                                    } else {
                                        xw4 xw4Var4 = xw4Var3;
                                        xw4Var4.z = nt4Var2;
                                        xw4Var4.i = num;
                                        xw4Var4.v = num2;
                                        wwd0 wwd0Var = xw4Var4.e;
                                        Boolean bool = Boolean.TRUE;
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, bool);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        } else {
                            objY2 = new gaj() { // from class: p8a
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    nt4 nt4Var2 = (nt4) obj3;
                                    Integer num = (Integer) obj4;
                                    num.intValue();
                                    Integer num2 = (Integer) obj5;
                                    num2.intValue();
                                    nt4Var2.getClass();
                                    if (nt4Var2.c == vt4.d) {
                                        function3.invoke(nt4Var2);
                                    } else {
                                        xw4 xw4Var4 = xw4Var3;
                                        xw4Var4.z = nt4Var2;
                                        xw4Var4.i = num;
                                        xw4Var4.v = num2;
                                        wwd0 wwd0Var = xw4Var4.e;
                                        Boolean bool = Boolean.TRUE;
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, bool);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        a.C0041a.C0042a c0042a5 = c0042a;
                        mt4.a(false, zBooleanValue3, campaignTopicResponseD, campaign3, function9, (gaj) objY2, null, aVar2, 0, 65);
                        boolean zBooleanValue4 = ((Boolean) wyh.c(xw4Var3.e, aVar2, 0, 7).getValue()).booleanValue();
                        nt4 nt4Var2 = xw4Var3.z;
                        cnj cnjVar2 = (cnj) wyh.c(xw4Var3.w, aVar2, 0, 7).getValue();
                        zA2 = aVar2.A(xw4Var3);
                        objY3 = aVar2.y();
                        if (zA2) {
                            objY3 = new q8a(xw4Var3, 0);
                            aVar2.r(objY3);
                        } else {
                            objY3 = new q8a(xw4Var3, 0);
                            aVar2.r(objY3);
                        }
                        Function1 function10 = (Function1) objY3;
                        zM2 = aVar2.M(function3);
                        objY4 = aVar2.y();
                        if (zM2) {
                            objY4 = new r8a(0, function3);
                            aVar2.r(objY4);
                        } else {
                            objY4 = new r8a(0, function3);
                            aVar2.r(objY4);
                        }
                        Function1 function11 = (Function1) objY4;
                        zA3 = aVar2.A(xw4Var3);
                        objY5 = aVar2.y();
                        if (zA3) {
                            objY5 = new Function0() { // from class: b8a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    xw4Var3.y1();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        } else {
                            objY5 = new Function0() { // from class: b8a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    xw4Var3.y1();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        }
                        ss4.a(zBooleanValue4, cnjVar2, nt4Var2, function10, function11, (Function0) objY5, aVar2, 0);
                        j7t.a(48, pp8.b(-928049669, new gaj() { // from class: c8a
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    kof0.a(48, pp8.b(314420834, new d8a(0, db6Var2, ytwVar2), aVar5), aVar5, false);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, ((Boolean) ytwVar2.getValue()).booleanValue());
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lobbyV2ViewModel, fujVar, db6Var, z, function0, function1, function2, i) { // from class: k8a
                public final /* synthetic */ LobbyV2ViewModel b;
                public final /* synthetic */ fuj c;
                public final /* synthetic */ db6 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(12582913);
                    s8a.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
