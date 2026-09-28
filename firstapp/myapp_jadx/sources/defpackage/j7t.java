package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.WalletInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class j7t {
    public static final void a(final int i, final op8 op8Var, a aVar, final boolean z) {
        b bVarI = aVar.i(-1262211949);
        int i2 = (bVarI.b(z) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                bVarI.N(-117329676);
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new u6t();
                    bVarI.r(objY);
                }
                u60.a((Function0) objY, new yle(false, false, 3), pp8.b(-1815100603, new Function2() { // from class: v6t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar3 = d.a.b;
                            d dVarE = j.e(aVar3, 1.0f);
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
                            hlh0.a(aVar2, aivVarC, yka.a.f);
                            hlh0.a(aVar2, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, yka.a.d);
                            g75.a(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.4f, j58.b), zk40.a), aVar2, 6);
                            gzg0 gzg0VarE = yi0.e(300, 0, xkf.a, 2);
                            Object objY2 = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY2 == c0042a) {
                                objY2 = new qoz();
                                aVar2.r(objY2);
                            }
                            t9g t9gVarP = f.p(gzg0VarE, (Function1) objY2);
                            gzg0 gzg0VarE2 = yi0.e(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 0, xkf.c, 2);
                            Object objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = new qoz();
                                aVar2.r(objY3);
                            }
                            owg owgVarT = f.t(gzg0VarE2, (Function1) objY3);
                            d dVarB = androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h);
                            final op8 op8Var2 = op8Var;
                            hh0.e(z, dVarB, t9gVarP, owgVarT, null, pp8.b(93993251, new gaj() { // from class: x6t
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar5 = (a) obj4;
                                    ((Integer) obj5).getClass();
                                    ((jh0) obj3).getClass();
                                    d.a aVar6 = d.a.b;
                                    d dVarB2 = androidx.compose.foundation.a.b(j.c(j.g(aVar6, 1.0f), 0.85f), j58.l, j060.e(fw20.a(R.dimen._10sdp, aVar5), fw20.a(R.dimen._10sdp, aVar5), 0.0f, 0.0f, 12));
                                    aiv aivVarC2 = g75.c(ht.a.a, false);
                                    int iHashCode2 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO2 = aVar5.o();
                                    d dVarC2 = c.c(aVar5, dVarB2);
                                    yka.k.getClass();
                                    tsr.a aVar7 = yka.a.b;
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar7);
                                    } else {
                                        aVar5.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar5, aivVarC2, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar5, ne00VarO2, dVar);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar5, dVarC2, cVar);
                                    d dVarE2 = j.e(aVar6, 1.0f);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar5, 0);
                                    int iHashCode3 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO3 = aVar5.o();
                                    d dVarC3 = c.c(aVar5, dVarE2);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar7);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, i78VarA, bVar);
                                    hlh0.a(aVar5, ne00VarO3, dVar);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                                    }
                                    hlh0.a(aVar5, dVarC3, cVar);
                                    op8Var2.invoke(l78.a, aVar5, 6);
                                    aVar5.s();
                                    aVar5.s();
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 196608, 16);
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 438, 0);
            } else {
                bVarI.N(-139962001);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var, z) { // from class: w6t
                public final /* synthetic */ boolean a;
                public final /* synthetic */ op8 b;

                {
                    this.a = z;
                    this.b = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j7t.a(qj40.a(49), this.b, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final phx phxVar, final xw4 xw4Var, final LobbyV2ViewModel lobbyV2ViewModel, final fuj fujVar, final db6 db6Var, final ywj.d dVar, final Function0 function0, final Function1 function1, final rwj rwjVar, final swj swjVar, final Function1 function2, final Function2 function3, final Function0 function4, final Function0 function5, final boolean z, final Function0 function6, final Function0 function7, a aVar, final int i) {
        b bVar;
        Function2<? super a, ? super Integer, Unit> function8;
        e eVar;
        xw4Var.getClass();
        lobbyV2ViewModel.getClass();
        db6Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(1804656980);
        int i2 = i | (bVarI.A(phxVar) ? 4 : 2) | (bVarI.A(xw4Var) ? 32 : 16) | (bVarI.A(lobbyV2ViewModel) ? 256 : 128) | (bVarI.A(fujVar) ? 2048 : 1024) | (bVarI.A(db6Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(dVar) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function1) ? 8388608 : 4194304) | (bVarI.A(rwjVar) ? 67108864 : 33554432) | (bVarI.A(swjVar) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && (((((3072 | (bVarI.A(function2) ? (char) 4 : (char) 2)) | (bVarI.A(function3) ? 32 : 16)) | (bVarI.A(function4) ? 256 : 128)) | (bVarI.b(z) ? (char) 16384 : (char) 8192)) & 599187) == 599186) ? false : true)) {
            if (phxVar == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                }
                function8 = new Function2(xw4Var, lobbyV2ViewModel, fujVar, db6Var, dVar, function0, function1, rwjVar, swjVar, function2, function3, function4, function5, z, function6, function7, i) { // from class: t6t
                    public final /* synthetic */ Function2 A;
                    public final /* synthetic */ Function0 B;
                    public final /* synthetic */ Function0 C;
                    public final /* synthetic */ boolean D;
                    public final /* synthetic */ Function0 E;
                    public final /* synthetic */ Function0 F;
                    public final /* synthetic */ xw4 b;
                    public final /* synthetic */ LobbyV2ViewModel c;
                    public final /* synthetic */ fuj d;
                    public final /* synthetic */ db6 e;
                    public final /* synthetic */ ywj.d f;
                    public final /* synthetic */ Function0 i;
                    public final /* synthetic */ Function1 v;
                    public final /* synthetic */ rwj w;
                    public final /* synthetic */ swj y;
                    public final /* synthetic */ Function1 z;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1);
                        j7t.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (a) obj, iA);
                        return Unit.a;
                    }
                };
                eVar = eVarZ;
            } else {
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                boolean zA = ((i2 & 458752) == 131072) | bVarI.A(phxVar);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: a7t
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [p6t, yfx$b] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((use) obj).getClass();
                            final ywj.d dVar2 = dVar;
                            final ytw ytwVar2 = ytwVar;
                            ?? r3 = new yfx.b() { // from class: p6t
                                @Override // yfx.b
                                public final void a(yfx yfxVar, ygx ygxVar, Bundle bundle) {
                                    String string;
                                    String string2;
                                    String string3;
                                    ygxVar.getClass();
                                    String str = ygxVar.b.f;
                                    if (str != null) {
                                        boolean zM = StringsKt.M(str, "lobby", false);
                                        ywj.d dVar3 = dVar2;
                                        ytw ytwVar3 = ytwVar2;
                                        if (zM) {
                                            dVar3.b();
                                            ytwVar3.setValue(Boolean.FALSE);
                                            return;
                                        }
                                        if (StringsKt.M(str, AnalyticsParam.SEARCH_KEYWORD, false)) {
                                            ytwVar3.setValue(Boolean.TRUE);
                                            return;
                                        }
                                        if (StringsKt.M(str, "section", false)) {
                                            ytwVar3.setValue(Boolean.FALSE);
                                            String strDecode = null;
                                            Integer intOrNull = (bundle == null || (string3 = bundle.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string3);
                                            String strDecode2 = (bundle == null || (string2 = bundle.getString("name")) == null) ? null : Uri.decode(string2);
                                            if (bundle != null && (string = bundle.getString("key")) != null) {
                                                strDecode = Uri.decode(string);
                                            }
                                            dVar3.a(intOrNull, strDecode2, strDecode);
                                        }
                                    }
                                }
                            };
                            phx phxVar2 = phxVar;
                            phxVar2.a(r3);
                            return new i7t(phxVar2, r3);
                        }
                    };
                    bVarI.r(objY2);
                }
                xvf.c(phxVar, (Function1) objY2, bVarI);
                bVar = bVarI;
                lqu.a(48, pp8.b(-2111036163, new Function2() { // from class: b7t
                    /* JADX WARN: Code duplicated, block: B:159:0x04f5  */
                    /* JADX WARN: Code duplicated, block: B:164:0x053b  */
                    /* JADX WARN: Code duplicated, block: B:168:0x0559  */
                    /* JADX WARN: Code duplicated, block: B:172:0x05a2  */
                    /* JADX WARN: Code duplicated, block: B:176:0x05b9  */
                    /* JADX WARN: Code duplicated, block: B:180:0x05d1  */
                    /* JADX WARN: Code duplicated, block: B:51:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:56:0x01e3  */
                    /* JADX WARN: Code duplicated, block: B:57:0x01f4  */
                    /* JADX WARN: Code duplicated, block: B:62:0x0212  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
                    /* JADX WARN: Code duplicated, block: B:73:0x023a  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ytw ytwVarB;
                        yka.a.b bVar2;
                        phx phxVar2;
                        final rwj rwjVar2;
                        final swj swjVar2;
                        final Function1 function9;
                        final Function0 function10;
                        final boolean z2;
                        final Function0 function11;
                        final Function0 function12;
                        boolean zM;
                        yka.a.C1350a c1350a;
                        Object obj3;
                        final phx phxVar3;
                        char c;
                        final xw4 xw4Var2;
                        LoadingState loadingState;
                        WalletInfo walletInfo;
                        boolean zG;
                        boolean z3;
                        boolean z4;
                        CampaignTopicResponse campaignTopicResponse;
                        final ytw ytwVar2;
                        a.C0041a.C0042a c0042a2;
                        int i3;
                        HTTPResponse hTTPResponse;
                        boolean zA2;
                        Object objY3;
                        final Function1 function13;
                        boolean zM2;
                        Object objY4;
                        boolean zA3;
                        Object objY5;
                        boolean zM3;
                        Object objY6;
                        boolean zA4;
                        Object objY7;
                        HTTPResponse hTTPResponse2;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final LobbyV2ViewModel lobbyV2ViewModel2 = lobbyV2ViewModel;
                            ytw ytwVarA = ts9.a(lobbyV2ViewModel2.d, aVar2);
                            LoadingState loadingState2 = (LoadingState) ytwVarA.getValue();
                            WalletInfo walletInfo2 = (loadingState2 == null || (hTTPResponse2 = (HTTPResponse) loadingState2.getData()) == null) ? null : (WalletInfo) hTTPResponse2.getData();
                            boolean zM4 = aVar2.M(walletInfo2);
                            Function2 function14 = function3;
                            boolean zM5 = zM4 | aVar2.M(function14);
                            Object objY8 = aVar2.y();
                            a.C0041a.C0042a c0042a3 = a.C0041a.a;
                            if (zM5 || objY8 == c0042a3) {
                                objY8 = walletInfo2 != null ? new fbh(new d7t(function14)) : null;
                                aVar2.r(objY8);
                            }
                            final fbh fbhVar = (fbh) objY8;
                            fuj fujVar2 = fujVar;
                            ssw<CampaignTopicResponse> sswVar = fujVar2 != null ? fujVar2.d : null;
                            if (sswVar == null) {
                                aVar2.N(1328452500);
                                aVar2.H();
                                ytwVarB = null;
                            } else {
                                aVar2.N(-1481167347);
                                ytwVarB = ts9.b(sswVar, sswVar.d(), aVar2, 0);
                                aVar2.H();
                            }
                            CampaignTopicResponse campaignTopicResponse2 = ytwVarB != null ? (CampaignTopicResponse) ytwVarB.getValue() : null;
                            final db6 db6Var2 = db6Var;
                            Campaign campaign = (Campaign) wyh.b(db6Var2.w, null, aVar2, 48, 14).getValue();
                            Object objY9 = aVar2.y();
                            if (objY9 == c0042a3) {
                                objY9 = m.b(Boolean.FALSE);
                                aVar2.r(objY9);
                            }
                            ytw ytwVar3 = (ytw) objY9;
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
                            yka.a.b bVar3 = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar3);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar2);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            final CampaignTopicResponse campaignTopicResponse3 = campaignTopicResponse2;
                            if (aVar2.g()) {
                                bVar2 = bVar3;
                            } else {
                                bVar2 = bVar3;
                                if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                phxVar2 = phxVar;
                                boolean zA5 = aVar2.A(phxVar2) | aVar2.A(lobbyV2ViewModel2) | aVar2.M(fbhVar);
                                rwjVar2 = rwjVar;
                                boolean zM6 = zA5 | aVar2.M(rwjVar2);
                                swjVar2 = swjVar;
                                boolean zM7 = zM6 | aVar2.M(swjVar2);
                                function9 = function2;
                                boolean zM8 = zM7 | aVar2.M(function9);
                                function10 = function4;
                                boolean zM9 = zM8 | aVar2.M(function10);
                                z2 = z;
                                boolean zB = zM9 | aVar2.b(z2);
                                function11 = function6;
                                boolean zM10 = zB | aVar2.M(function11);
                                function12 = function7;
                                zM = zM10 | aVar2.M(function12);
                                Object objY10 = aVar2.y();
                                if (!zM || objY10 == c0042a3) {
                                    c1350a = c1350a2;
                                    phxVar3 = phxVar2;
                                    c = 0;
                                    obj3 = new Function1() { // from class: f7t
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            ghx ghxVar = (ghx) obj4;
                                            ghxVar.getClass();
                                            final phx phxVar4 = phxVar3;
                                            final LobbyV2ViewModel lobbyV2ViewModel3 = lobbyV2ViewModel2;
                                            final fbh fbhVar2 = fbhVar;
                                            final rwj rwjVar3 = rwjVar2;
                                            final swj swjVar3 = swjVar2;
                                            final Function1 function15 = function9;
                                            final Function0 function16 = function10;
                                            final boolean z5 = z2;
                                            final Function0 function17 = function11;
                                            final Function0 function18 = function12;
                                            hhx.b(ghxVar, "lobby?id={id}", null, new op8(1418118452, new iaj() { // from class: q6t
                                                @Override // defpackage.iaj
                                                public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    String string;
                                                    ifx ifxVar = (ifx) obj6;
                                                    a aVar5 = (a) obj7;
                                                    ((Integer) obj8).getClass();
                                                    ((pf0) obj5).getClass();
                                                    ifxVar.getClass();
                                                    Bundle bundleA = ifxVar.v.a();
                                                    if (bundleA != null && (string = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) != null) {
                                                        StringsKt.toIntOrNull(string);
                                                    }
                                                    k6t.a(phxVar4, lobbyV2ViewModel3, fbhVar2, rwjVar3, swjVar3, function15, function16, z5, function17, function18, aVar5, 0);
                                                    return Unit.a;
                                                }
                                            }, true), 254);
                                            hhx.b(ghxVar, "search?id={id}&section={section}&favourite={favourite}&provider={provider}", null, new op8(1230771677, new iaj() { // from class: r6t
                                                @Override // defpackage.iaj
                                                public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    String string;
                                                    Integer intOrNull;
                                                    String string2;
                                                    Integer intOrNull2;
                                                    String string3;
                                                    Integer intOrNull3;
                                                    String string4;
                                                    ifx ifxVar = (ifx) obj6;
                                                    a aVar5 = (a) obj7;
                                                    ((Integer) obj8).getClass();
                                                    ((pf0) obj5).getClass();
                                                    ifxVar.getClass();
                                                    lfx lfxVar = ifxVar.v;
                                                    Bundle bundleA = lfxVar.a();
                                                    Integer intOrNull4 = (bundleA == null || (string4 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string4);
                                                    Bundle bundleA2 = lfxVar.a();
                                                    int iIntValue2 = (bundleA2 == null || (string3 = bundleA2.getString("section")) == null || (intOrNull3 = StringsKt.toIntOrNull(string3)) == null) ? 0 : intOrNull3.intValue();
                                                    Bundle bundleA3 = lfxVar.a();
                                                    int iIntValue3 = (bundleA3 == null || (string2 = bundleA3.getString("favourite")) == null || (intOrNull2 = StringsKt.toIntOrNull(string2)) == null) ? 0 : intOrNull2.intValue();
                                                    Bundle bundleA4 = lfxVar.a();
                                                    int iIntValue4 = (bundleA4 == null || (string = bundleA4.getString(AnalyticsParam.EVENT_STREAM_PROVIDER)) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
                                                    LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                    lobbyV2ViewModel4.getClass();
                                                    lobbyV2ViewModel4.C = new ssw<>();
                                                    p9t.c(phxVar4, lobbyV2ViewModel4, intOrNull4, iIntValue2 == 1, iIntValue3 == 1, fbhVar2, iIntValue4 == 1, rwjVar3, aVar5, 0);
                                                    return Unit.a;
                                                }
                                            }, true), 254);
                                            hhx.b(ghxVar, "section?id={id}&name={name}&key={key}&catId={catId}", null, new op8(1016093884, new iaj() { // from class: s6t
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                 */
                                                @Override // defpackage.iaj
                                                public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                    int iIntValue2;
                                                    lyh lyhVarA1;
                                                    Function1 jozVar;
                                                    r650 r650Var;
                                                    a aVar5;
                                                    String string;
                                                    String string2;
                                                    ifx ifxVar = (ifx) obj6;
                                                    a aVar6 = (a) obj7;
                                                    ((Integer) obj8).getClass();
                                                    ((pf0) obj5).getClass();
                                                    ifxVar.getClass();
                                                    lfx lfxVar = ifxVar.v;
                                                    Bundle bundleA = lfxVar.a();
                                                    Integer intOrNull = (bundleA == null || (string2 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string2);
                                                    Bundle bundleA2 = lfxVar.a();
                                                    Integer intOrNull2 = (bundleA2 == null || (string = bundleA2.getString("catId")) == null) ? null : StringsKt.toIntOrNull(string);
                                                    Bundle bundleA3 = lfxVar.a();
                                                    String string3 = bundleA3 != null ? bundleA3.getString("key") : null;
                                                    String strDecode = string3 != null ? Uri.decode(string3) : null;
                                                    Bundle bundleA4 = lfxVar.a();
                                                    String string4 = bundleA4 != null ? bundleA4.getString("name") : null;
                                                    String strDecode2 = string4 != null ? Uri.decode(string4) : null;
                                                    final LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                    Context context = (Context) aVar6.O(AndroidCompositionLocals_androidKt.b);
                                                    if (intOrNull == null) {
                                                        aVar6.N(-475342728);
                                                        aVar6.H();
                                                    } else {
                                                        aVar6.N(-475342727);
                                                        if (strDecode == null) {
                                                            aVar6.N(-744870206);
                                                            aVar6.H();
                                                            aVar5 = aVar6;
                                                        } else {
                                                            aVar6.N(-744870205);
                                                            String str = strDecode.equals("game_providers") ? "provider_list" : "section_list";
                                                            if (strDecode.equals("game_providers")) {
                                                                iIntValue2 = intOrNull.intValue();
                                                            } else {
                                                                iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                                            }
                                                            boolean zEquals = strDecode.equals("my_favourites");
                                                            boolean zEquals2 = strDecode.equals("game_providers");
                                                            gnj gnjVar = gnj.c;
                                                            if (strDecode.equals("my_favourites")) {
                                                                aVar6.N(-1367714031);
                                                                aVar6.H();
                                                                lyhVarA1 = lobbyV2ViewModel4.W;
                                                            } else if (strDecode.equals("recommended_games")) {
                                                                aVar6.N(-1367559248);
                                                                aVar6.H();
                                                                lyhVarA1 = lobbyV2ViewModel4.X;
                                                            } else {
                                                                if (strDecode.equals("recently_played")) {
                                                                    aVar6.N(-1367399164);
                                                                    aVar6.H();
                                                                    lyhVarA1 = lobbyV2ViewModel4.H1(context);
                                                                } else if (strDecode.equals("game_providers")) {
                                                                    aVar6.N(-1367233965);
                                                                    final int iIntValue3 = intOrNull.intValue();
                                                                    aVar6.N(-1287797651);
                                                                    LinkedHashMap linkedHashMap = lobbyV2ViewModel4.F;
                                                                    Object objA = linkedHashMap.get(intOrNull);
                                                                    if (objA == null) {
                                                                        iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
                                                                        boolean zD = aVar6.d(iIntValue3) | aVar6.A(lobbyV2ViewModel4);
                                                                        Object objY11 = aVar6.y();
                                                                        if (zD || objY11 == a.C0041a.a) {
                                                                            objY11 = new Function0() { // from class: rbt
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.v, Integer.valueOf(iIntValue3), null, 4), lobbyV2ViewModel4.a);
                                                                                }
                                                                            };
                                                                            aVar6.r(objY11);
                                                                        }
                                                                        Function0 function19 = (Function0) objY11;
                                                                        function19.getClass();
                                                                        if (function19 instanceof vje0) {
                                                                            jozVar = new ioz(function19);
                                                                            r650Var = null;
                                                                        } else {
                                                                            r650Var = null;
                                                                            jozVar = new joz(function19, null);
                                                                        }
                                                                        objA = rs5.a(new ymz(jozVar, iqzVar, r650Var).e, o8i0.d(lobbyV2ViewModel4));
                                                                        linkedHashMap.put(intOrNull, objA);
                                                                    } else {
                                                                        iIntValue2 = iIntValue2;
                                                                    }
                                                                    lyhVarA1 = (lyh) objA;
                                                                    aVar6.H();
                                                                    aVar6.H();
                                                                } else {
                                                                    iIntValue2 = iIntValue2;
                                                                    if (strDecode.equals("trending_for_players_like_you")) {
                                                                        aVar6.N(-1367045268);
                                                                        aVar6.H();
                                                                        lyhVarA1 = lobbyV2ViewModel4.b0;
                                                                    } else if (lobbyV2ViewModel4.d0.containsKey(intOrNull)) {
                                                                        aVar6.N(-1366877682);
                                                                        aVar6.H();
                                                                        final int iIntValue4 = intOrNull.intValue();
                                                                        LinkedHashMap linkedHashMap2 = lobbyV2ViewModel4.e0;
                                                                        Object objA2 = linkedHashMap2.get(intOrNull);
                                                                        if (objA2 == null) {
                                                                            objA2 = rs5.a(new ymz(new joz(new Function0() { // from class: jbt
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                                                                                    List list = (List) lobbyV2ViewModel5.d0.get(Integer.valueOf(iIntValue4));
                                                                                    if (list == null) {
                                                                                        list = m2g.a;
                                                                                    }
                                                                                    list.getClass();
                                                                                    return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.i, null, list, 2), lobbyV2ViewModel5.a);
                                                                                }
                                                                            }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel4));
                                                                            linkedHashMap2.put(intOrNull, objA2);
                                                                        }
                                                                        lyhVarA1 = (lyh) objA2;
                                                                    } else {
                                                                        aVar6.N(-1366736725);
                                                                        lyhVarA1 = lobbyV2ViewModel4.A1(intOrNull.intValue(), 48, 0, aVar6);
                                                                        aVar6.H();
                                                                    }
                                                                }
                                                                a aVar7 = aVar6;
                                                                q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str, lyhVarA1, aVar7, 196608, 6, 0);
                                                                aVar7.H();
                                                                aVar5 = aVar7;
                                                            }
                                                            iIntValue2 = iIntValue2;
                                                            a aVar8 = aVar6;
                                                            q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str, lyhVarA1, aVar8, 196608, 6, 0);
                                                            aVar8.H();
                                                            aVar5 = aVar8;
                                                        }
                                                        aVar5.H();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 254);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(obj3);
                                } else {
                                    obj3 = objY10;
                                    c1350a = c1350a2;
                                    phxVar3 = phxVar2;
                                    c = 0;
                                }
                                yka.a.C1350a c1350a3 = c1350a;
                                uix.c(phxVar3, "lobby?id={id}", null, null, null, null, null, null, (Function1) obj3, aVar2, 0, 1020);
                                xw4Var2 = xw4Var;
                                if (campaignTopicResponse3 == null) {
                                    aVar2.N(1245138514);
                                    aVar2.H();
                                    campaignTopicResponse = campaignTopicResponse3;
                                    ytwVar2 = ytwVar3;
                                    c0042a2 = c0042a3;
                                } else {
                                    aVar2.N(1245138515);
                                    loadingState = (LoadingState) ytwVarA.getValue();
                                    if (loadingState != null || (hTTPResponse = (HTTPResponse) loadingState.getData()) == null) {
                                        walletInfo = null;
                                    } else {
                                        walletInfo = (WalletInfo) hTTPResponse.getData();
                                    }
                                    zG = Intrinsics.g(campaignTopicResponse3.getCampaignStatus(), "ENDED");
                                    if (campaignTopicResponse3.isLastCampaignTier() || !Intrinsics.g(campaignTopicResponse3.getUserActivityStatus(), "ACTIVE")) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!zG || z3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (walletInfo != null || ((Boolean) ytwVar.getValue()).booleanValue()) {
                                        campaignTopicResponse = campaignTopicResponse3;
                                        ytwVar2 = ytwVar3;
                                        c0042a2 = c0042a3;
                                        aVar2.N(-1707251386);
                                    } else {
                                        aVar2.N(1469454484);
                                        String str = db6Var2.i;
                                        if (str == null) {
                                            aVar2.N(-1691551251);
                                            aVar2.H();
                                            campaignTopicResponse = campaignTopicResponse3;
                                            ytwVar2 = ytwVar3;
                                            c0042a2 = c0042a3;
                                        } else {
                                            aVar2.N(-1691551250);
                                            int iHashCode2 = str.hashCode();
                                            n54 n54Var2 = ht.a.i;
                                            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
                                            if (iHashCode2 != 69387) {
                                                if (iHashCode2 == 1037699538) {
                                                    yka.a.b bVar4 = bVar2;
                                                    if (str.equals("BONUS_VAULT")) {
                                                        aVar2.N(-768055157);
                                                        if (ra6.d(campaign, campaignTopicResponse3)) {
                                                            campaignTopicResponse = campaignTopicResponse3;
                                                            c0042a2 = c0042a3;
                                                            aVar2.N(-784870301);
                                                        } else {
                                                            aVar2.N(-767746645);
                                                            d dVarJ = h.j(dVar3.b(aVar3, n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
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
                                                            hlh0.a(aVar2, aivVarC2, bVar4);
                                                            hlh0.a(aVar2, ne00VarO2, dVar2);
                                                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                                                                j3c.a(iHashCode3, aVar2, iHashCode3, c1350a3);
                                                            }
                                                            hlh0.a(aVar2, dVarC2, cVar);
                                                            boolean zG2 = Intrinsics.g(campaignTopicResponse3.getUserActivityStatus(), "READY_TO_CLAIM");
                                                            String strA = jn5.LOTTIE_TREASURE.a();
                                                            String strA2 = jn5.ICON_TREASURE.a();
                                                            boolean zA6 = aVar2.A(xw4Var2) | aVar2.A(db6Var2) | aVar2.A(campaignTopicResponse3);
                                                            Object objY11 = aVar2.y();
                                                            c0042a2 = c0042a3;
                                                            if (zA6 || objY11 == c0042a2) {
                                                                objY11 = new Function0() { // from class: h7t
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        xw4Var2.A1();
                                                                        db6Var2.A1(campaignTopicResponse3.getCampaignId(), true);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar2.r(objY11);
                                                            }
                                                            campaignTopicResponse = campaignTopicResponse3;
                                                            i38.a(true, zG2, strA, strA2, null, null, (Function0) objY11, aVar2, 6, 48);
                                                            aVar2.s();
                                                        }
                                                        aVar2.H();
                                                        aVar2.H();
                                                        Unit unit = Unit.a;
                                                    } else {
                                                        campaignTopicResponse = campaignTopicResponse3;
                                                        c0042a2 = c0042a3;
                                                        i3 = -784870301;
                                                    }
                                                } else if (iHashCode2 == 1887537372 && str.equals("STACKER_GAME")) {
                                                    aVar2.N(-163357476);
                                                    if (vw4.a((Context) aVar2.O(AndroidCompositionLocals_androidKt.b))) {
                                                        aVar2.N(-769051993);
                                                        d dVarJ2 = h.j(dVar3.b(aVar3, n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
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
                                                        hlh0.a(aVar2, aivVarC3, bVar2);
                                                        hlh0.a(aVar2, ne00VarO3, dVar2);
                                                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode4))) {
                                                            j3c.a(iHashCode4, aVar2, iHashCode4, c1350a3);
                                                        }
                                                        hlh0.a(aVar2, dVarC3, cVar);
                                                        boolean zG3 = Intrinsics.g(campaignTopicResponse3.getUserActivityStatus(), "READY_TO_CLAIM");
                                                        String strA3 = jn5.LOTTIE_TREASURE.a();
                                                        String strA4 = jn5.ICON_TREASURE.a();
                                                        Function0 function15 = function0;
                                                        boolean zM11 = aVar2.M(function15);
                                                        Object objY12 = aVar2.y();
                                                        c0042a2 = c0042a3;
                                                        if (zM11 || objY12 == c0042a2) {
                                                            objY12 = new g7t(function15, 0);
                                                            aVar2.r(objY12);
                                                        }
                                                        i38.a(true, zG3, strA3, strA4, null, null, (Function0) objY12, aVar2, 6, 48);
                                                        aVar2.s();
                                                    } else {
                                                        c0042a2 = c0042a3;
                                                        aVar2.N(-784870301);
                                                    }
                                                    aVar2.H();
                                                    aVar2.H();
                                                    Unit unit2 = Unit.a;
                                                    campaignTopicResponse = campaignTopicResponse3;
                                                } else {
                                                    i3 = -784870301;
                                                    campaignTopicResponse = campaignTopicResponse3;
                                                    c0042a2 = c0042a3;
                                                }
                                                ytwVar2 = ytwVar3;
                                                aVar2.H();
                                            } else {
                                                i3 = -784870301;
                                                campaignTopicResponse = campaignTopicResponse3;
                                                c0042a2 = c0042a3;
                                                if (str.equals("FBG")) {
                                                    aVar2.N(-163267499);
                                                    if (z4) {
                                                        ytwVar2 = ytwVar3;
                                                        aVar2.N(-784870301);
                                                    } else {
                                                        aVar2.N(-766306912);
                                                        d dVarJ3 = h.j(dVar3.b(androidx.compose.foundation.layout.c.a(j.g(aVar3, 0.127f), 1.0f), n54Var2), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._80sdp, aVar2), 7);
                                                        boolean zA7 = aVar2.A(db6Var2);
                                                        final Function0 function16 = function5;
                                                        boolean zM12 = zA7 | aVar2.M(function16);
                                                        Object objY13 = aVar2.y();
                                                        if (zM12 || objY13 == c0042a2) {
                                                            ytwVar2 = ytwVar3;
                                                            objY13 = new Function0() { // from class: l6t
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    db6Var2.y1("Lobby", null, new cb6());
                                                                    ytwVar2.setValue(Boolean.TRUE);
                                                                    function16.invoke();
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar2.r(objY13);
                                                        } else {
                                                            ytwVar2 = ytwVar3;
                                                        }
                                                        e56.b(dVarJ3, campaignTopicResponse, (Function0) objY13, aVar2, 0);
                                                    }
                                                    aVar2.H();
                                                    aVar2.H();
                                                    Unit unit3 = Unit.a;
                                                }
                                                aVar2.H();
                                            }
                                            aVar2.N(i3);
                                            aVar2.H();
                                            Unit unit4 = Unit.a;
                                            ytwVar2 = ytwVar3;
                                            aVar2.H();
                                        }
                                    }
                                    aVar2.H();
                                    Unit unit5 = Unit.a;
                                    aVar2.H();
                                }
                                aVar2.s();
                                boolean zBooleanValue = ((Boolean) wyh.c(xw4Var2.d, aVar2, 0, 7).getValue()).booleanValue();
                                Campaign campaign2 = (Campaign) wyh.b(db6Var2.w, null, aVar2, 48, 14).getValue();
                                zA2 = aVar2.A(xw4Var2);
                                objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a2) {
                                    objY3 = new bca(xw4Var2, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function17 = (Function0) objY3;
                                function13 = function1;
                                zM2 = aVar2.M(function13) | aVar2.A(xw4Var2);
                                objY4 = aVar2.y();
                                if (zM2 || objY4 == c0042a2) {
                                    objY4 = new gaj() { // from class: m6t
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            nt4 nt4Var = (nt4) obj4;
                                            Integer num = (Integer) obj5;
                                            num.intValue();
                                            Integer num2 = (Integer) obj6;
                                            num2.intValue();
                                            nt4Var.getClass();
                                            if (nt4Var.c == vt4.d) {
                                                function13.invoke(nt4Var);
                                            } else {
                                                xw4 xw4Var3 = xw4Var2;
                                                xw4Var3.z = nt4Var;
                                                xw4Var3.i = num;
                                                xw4Var3.v = num2;
                                                wwd0 wwd0Var = xw4Var3.e;
                                                Boolean bool = Boolean.TRUE;
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, bool);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                mt4.a(false, zBooleanValue, campaignTopicResponse, campaign2, function17, (gaj) objY4, null, aVar2, 0, 65);
                                boolean zBooleanValue2 = ((Boolean) wyh.c(xw4Var2.e, aVar2, 0, 7).getValue()).booleanValue();
                                nt4 nt4Var = xw4Var2.z;
                                cnj cnjVar = (cnj) wyh.c(xw4Var2.w, aVar2, 0, 7).getValue();
                                zA3 = aVar2.A(xw4Var2);
                                objY5 = aVar2.y();
                                if (zA3 || objY5 == c0042a2) {
                                    objY5 = new Function1() { // from class: n6t
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            ((nt4) obj4).getClass();
                                            xw4Var2.z1();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY5);
                                }
                                Function1 function18 = (Function1) objY5;
                                zM3 = aVar2.M(function13);
                                objY6 = aVar2.y();
                                if (zM3 || objY6 == c0042a2) {
                                    objY6 = new o6t(function13, 0);
                                    aVar2.r(objY6);
                                }
                                Function1 function19 = (Function1) objY6;
                                zA4 = aVar2.A(xw4Var2);
                                objY7 = aVar2.y();
                                if (zA4 || objY7 == c0042a2) {
                                    objY7 = new tfj(xw4Var2, 1);
                                    aVar2.r(objY7);
                                }
                                ss4.a(zBooleanValue2, cnjVar, nt4Var, function18, function19, (Function0) objY7, aVar2, 0);
                                j7t.a(48, pp8.b(-1655140805, new e7t(0, db6Var2, ytwVar2), aVar2), aVar2, ((Boolean) ytwVar2.getValue()).booleanValue());
                            }
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                            yka.a.c cVar2 = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar2);
                            phxVar2 = phxVar;
                            boolean zA8 = aVar2.A(phxVar2) | aVar2.A(lobbyV2ViewModel2) | aVar2.M(fbhVar);
                            rwjVar2 = rwjVar;
                            boolean zM13 = zA8 | aVar2.M(rwjVar2);
                            swjVar2 = swjVar;
                            boolean zM14 = zM13 | aVar2.M(swjVar2);
                            function9 = function2;
                            boolean zM15 = zM14 | aVar2.M(function9);
                            function10 = function4;
                            boolean zM16 = zM15 | aVar2.M(function10);
                            z2 = z;
                            boolean zB2 = zM16 | aVar2.b(z2);
                            function11 = function6;
                            boolean zM17 = zB2 | aVar2.M(function11);
                            function12 = function7;
                            zM = zM17 | aVar2.M(function12);
                            Object objY14 = aVar2.y();
                            if (zM) {
                                c1350a = c1350a2;
                                phxVar3 = phxVar2;
                                c = 0;
                                obj3 = new Function1() { // from class: f7t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ghx ghxVar = (ghx) obj4;
                                        ghxVar.getClass();
                                        final phx phxVar4 = phxVar3;
                                        final LobbyV2ViewModel lobbyV2ViewModel3 = lobbyV2ViewModel2;
                                        final fbh fbhVar2 = fbhVar;
                                        final rwj rwjVar3 = rwjVar2;
                                        final swj swjVar3 = swjVar2;
                                        final Function1 function110 = function9;
                                        final Function0 function111 = function10;
                                        final boolean z5 = z2;
                                        final Function0 function112 = function11;
                                        final Function0 function113 = function12;
                                        hhx.b(ghxVar, "lobby?id={id}", null, new op8(1418118452, new iaj() { // from class: q6t
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                String string;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar5 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                Bundle bundleA = ifxVar.v.a();
                                                if (bundleA != null && (string = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) != null) {
                                                    StringsKt.toIntOrNull(string);
                                                }
                                                k6t.a(phxVar4, lobbyV2ViewModel3, fbhVar2, rwjVar3, swjVar3, function110, function111, z5, function112, function113, aVar5, 0);
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        hhx.b(ghxVar, "search?id={id}&section={section}&favourite={favourite}&provider={provider}", null, new op8(1230771677, new iaj() { // from class: r6t
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                String string;
                                                Integer intOrNull;
                                                String string2;
                                                Integer intOrNull2;
                                                String string3;
                                                Integer intOrNull3;
                                                String string4;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar5 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                lfx lfxVar = ifxVar.v;
                                                Bundle bundleA = lfxVar.a();
                                                Integer intOrNull4 = (bundleA == null || (string4 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string4);
                                                Bundle bundleA2 = lfxVar.a();
                                                int iIntValue2 = (bundleA2 == null || (string3 = bundleA2.getString("section")) == null || (intOrNull3 = StringsKt.toIntOrNull(string3)) == null) ? 0 : intOrNull3.intValue();
                                                Bundle bundleA3 = lfxVar.a();
                                                int iIntValue3 = (bundleA3 == null || (string2 = bundleA3.getString("favourite")) == null || (intOrNull2 = StringsKt.toIntOrNull(string2)) == null) ? 0 : intOrNull2.intValue();
                                                Bundle bundleA4 = lfxVar.a();
                                                int iIntValue4 = (bundleA4 == null || (string = bundleA4.getString(AnalyticsParam.EVENT_STREAM_PROVIDER)) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
                                                LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                lobbyV2ViewModel4.getClass();
                                                lobbyV2ViewModel4.C = new ssw<>();
                                                p9t.c(phxVar4, lobbyV2ViewModel4, intOrNull4, iIntValue2 == 1, iIntValue3 == 1, fbhVar2, iIntValue4 == 1, rwjVar3, aVar5, 0);
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        hhx.b(ghxVar, "section?id={id}&name={name}&key={key}&catId={catId}", null, new op8(1016093884, new iaj() { // from class: s6t
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                int iIntValue2;
                                                lyh lyhVarA1;
                                                Function1 jozVar;
                                                r650 r650Var;
                                                a aVar5;
                                                String string;
                                                String string2;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar6 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                lfx lfxVar = ifxVar.v;
                                                Bundle bundleA = lfxVar.a();
                                                Integer intOrNull = (bundleA == null || (string2 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string2);
                                                Bundle bundleA2 = lfxVar.a();
                                                Integer intOrNull2 = (bundleA2 == null || (string = bundleA2.getString("catId")) == null) ? null : StringsKt.toIntOrNull(string);
                                                Bundle bundleA3 = lfxVar.a();
                                                String string3 = bundleA3 != null ? bundleA3.getString("key") : null;
                                                String strDecode = string3 != null ? Uri.decode(string3) : null;
                                                Bundle bundleA4 = lfxVar.a();
                                                String string4 = bundleA4 != null ? bundleA4.getString("name") : null;
                                                String strDecode2 = string4 != null ? Uri.decode(string4) : null;
                                                final LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                Context context = (Context) aVar6.O(AndroidCompositionLocals_androidKt.b);
                                                if (intOrNull == null) {
                                                    aVar6.N(-475342728);
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(-475342727);
                                                    if (strDecode == null) {
                                                        aVar6.N(-744870206);
                                                        aVar6.H();
                                                        aVar5 = aVar6;
                                                    } else {
                                                        aVar6.N(-744870205);
                                                        String str2 = strDecode.equals("game_providers") ? "provider_list" : "section_list";
                                                        if (strDecode.equals("game_providers")) {
                                                            iIntValue2 = intOrNull.intValue();
                                                        } else {
                                                            iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                                        }
                                                        boolean zEquals = strDecode.equals("my_favourites");
                                                        boolean zEquals2 = strDecode.equals("game_providers");
                                                        gnj gnjVar = gnj.c;
                                                        if (strDecode.equals("my_favourites")) {
                                                            aVar6.N(-1367714031);
                                                            aVar6.H();
                                                            lyhVarA1 = lobbyV2ViewModel4.W;
                                                        } else if (strDecode.equals("recommended_games")) {
                                                            aVar6.N(-1367559248);
                                                            aVar6.H();
                                                            lyhVarA1 = lobbyV2ViewModel4.X;
                                                        } else {
                                                            if (strDecode.equals("recently_played")) {
                                                                aVar6.N(-1367399164);
                                                                aVar6.H();
                                                                lyhVarA1 = lobbyV2ViewModel4.H1(context);
                                                            } else if (strDecode.equals("game_providers")) {
                                                                aVar6.N(-1367233965);
                                                                final int iIntValue3 = intOrNull.intValue();
                                                                aVar6.N(-1287797651);
                                                                LinkedHashMap linkedHashMap = lobbyV2ViewModel4.F;
                                                                Object objA = linkedHashMap.get(intOrNull);
                                                                if (objA == null) {
                                                                    iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
                                                                    boolean zD = aVar6.d(iIntValue3) | aVar6.A(lobbyV2ViewModel4);
                                                                    Object objY15 = aVar6.y();
                                                                    if (zD || objY15 == a.C0041a.a) {
                                                                        objY15 = new Function0() { // from class: rbt
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.v, Integer.valueOf(iIntValue3), null, 4), lobbyV2ViewModel4.a);
                                                                            }
                                                                        };
                                                                        aVar6.r(objY15);
                                                                    }
                                                                    Function0 function114 = (Function0) objY15;
                                                                    function114.getClass();
                                                                    if (function114 instanceof vje0) {
                                                                        jozVar = new ioz(function114);
                                                                        r650Var = null;
                                                                    } else {
                                                                        r650Var = null;
                                                                        jozVar = new joz(function114, null);
                                                                    }
                                                                    objA = rs5.a(new ymz(jozVar, iqzVar, r650Var).e, o8i0.d(lobbyV2ViewModel4));
                                                                    linkedHashMap.put(intOrNull, objA);
                                                                } else {
                                                                    iIntValue2 = iIntValue2;
                                                                }
                                                                lyhVarA1 = (lyh) objA;
                                                                aVar6.H();
                                                                aVar6.H();
                                                            } else {
                                                                iIntValue2 = iIntValue2;
                                                                if (strDecode.equals("trending_for_players_like_you")) {
                                                                    aVar6.N(-1367045268);
                                                                    aVar6.H();
                                                                    lyhVarA1 = lobbyV2ViewModel4.b0;
                                                                } else if (lobbyV2ViewModel4.d0.containsKey(intOrNull)) {
                                                                    aVar6.N(-1366877682);
                                                                    aVar6.H();
                                                                    final int iIntValue4 = intOrNull.intValue();
                                                                    LinkedHashMap linkedHashMap2 = lobbyV2ViewModel4.e0;
                                                                    Object objA2 = linkedHashMap2.get(intOrNull);
                                                                    if (objA2 == null) {
                                                                        objA2 = rs5.a(new ymz(new joz(new Function0() { // from class: jbt
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                                                                                List list = (List) lobbyV2ViewModel5.d0.get(Integer.valueOf(iIntValue4));
                                                                                if (list == null) {
                                                                                    list = m2g.a;
                                                                                }
                                                                                list.getClass();
                                                                                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.i, null, list, 2), lobbyV2ViewModel5.a);
                                                                            }
                                                                        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel4));
                                                                        linkedHashMap2.put(intOrNull, objA2);
                                                                    }
                                                                    lyhVarA1 = (lyh) objA2;
                                                                } else {
                                                                    aVar6.N(-1366736725);
                                                                    lyhVarA1 = lobbyV2ViewModel4.A1(intOrNull.intValue(), 48, 0, aVar6);
                                                                    aVar6.H();
                                                                }
                                                            }
                                                            a aVar8 = aVar6;
                                                            q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str2, lyhVarA1, aVar8, 196608, 6, 0);
                                                            aVar8.H();
                                                            aVar5 = aVar8;
                                                        }
                                                        iIntValue2 = iIntValue2;
                                                        a aVar9 = aVar6;
                                                        q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str2, lyhVarA1, aVar9, 196608, 6, 0);
                                                        aVar9.H();
                                                        aVar5 = aVar9;
                                                    }
                                                    aVar5.H();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(obj3);
                            } else {
                                c1350a = c1350a2;
                                phxVar3 = phxVar2;
                                c = 0;
                                obj3 = new Function1() { // from class: f7t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ghx ghxVar = (ghx) obj4;
                                        ghxVar.getClass();
                                        final phx phxVar4 = phxVar3;
                                        final LobbyV2ViewModel lobbyV2ViewModel3 = lobbyV2ViewModel2;
                                        final fbh fbhVar2 = fbhVar;
                                        final rwj rwjVar3 = rwjVar2;
                                        final swj swjVar3 = swjVar2;
                                        final Function1 function110 = function9;
                                        final Function0 function111 = function10;
                                        final boolean z5 = z2;
                                        final Function0 function112 = function11;
                                        final Function0 function113 = function12;
                                        hhx.b(ghxVar, "lobby?id={id}", null, new op8(1418118452, new iaj() { // from class: q6t
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                String string;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar5 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                Bundle bundleA = ifxVar.v.a();
                                                if (bundleA != null && (string = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) != null) {
                                                    StringsKt.toIntOrNull(string);
                                                }
                                                k6t.a(phxVar4, lobbyV2ViewModel3, fbhVar2, rwjVar3, swjVar3, function110, function111, z5, function112, function113, aVar5, 0);
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        hhx.b(ghxVar, "search?id={id}&section={section}&favourite={favourite}&provider={provider}", null, new op8(1230771677, new iaj() { // from class: r6t
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                String string;
                                                Integer intOrNull;
                                                String string2;
                                                Integer intOrNull2;
                                                String string3;
                                                Integer intOrNull3;
                                                String string4;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar5 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                lfx lfxVar = ifxVar.v;
                                                Bundle bundleA = lfxVar.a();
                                                Integer intOrNull4 = (bundleA == null || (string4 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string4);
                                                Bundle bundleA2 = lfxVar.a();
                                                int iIntValue2 = (bundleA2 == null || (string3 = bundleA2.getString("section")) == null || (intOrNull3 = StringsKt.toIntOrNull(string3)) == null) ? 0 : intOrNull3.intValue();
                                                Bundle bundleA3 = lfxVar.a();
                                                int iIntValue3 = (bundleA3 == null || (string2 = bundleA3.getString("favourite")) == null || (intOrNull2 = StringsKt.toIntOrNull(string2)) == null) ? 0 : intOrNull2.intValue();
                                                Bundle bundleA4 = lfxVar.a();
                                                int iIntValue4 = (bundleA4 == null || (string = bundleA4.getString(AnalyticsParam.EVENT_STREAM_PROVIDER)) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
                                                LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                lobbyV2ViewModel4.getClass();
                                                lobbyV2ViewModel4.C = new ssw<>();
                                                p9t.c(phxVar4, lobbyV2ViewModel4, intOrNull4, iIntValue2 == 1, iIntValue3 == 1, fbhVar2, iIntValue4 == 1, rwjVar3, aVar5, 0);
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        hhx.b(ghxVar, "section?id={id}&name={name}&key={key}&catId={catId}", null, new op8(1016093884, new iaj() { // from class: s6t
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                int iIntValue2;
                                                lyh lyhVarA1;
                                                Function1 jozVar;
                                                r650 r650Var;
                                                a aVar5;
                                                String string;
                                                String string2;
                                                ifx ifxVar = (ifx) obj6;
                                                a aVar6 = (a) obj7;
                                                ((Integer) obj8).getClass();
                                                ((pf0) obj5).getClass();
                                                ifxVar.getClass();
                                                lfx lfxVar = ifxVar.v;
                                                Bundle bundleA = lfxVar.a();
                                                Integer intOrNull = (bundleA == null || (string2 = bundleA.getString(AnalyticsParam.EVENT_PARAM_ID)) == null) ? null : StringsKt.toIntOrNull(string2);
                                                Bundle bundleA2 = lfxVar.a();
                                                Integer intOrNull2 = (bundleA2 == null || (string = bundleA2.getString("catId")) == null) ? null : StringsKt.toIntOrNull(string);
                                                Bundle bundleA3 = lfxVar.a();
                                                String string3 = bundleA3 != null ? bundleA3.getString("key") : null;
                                                String strDecode = string3 != null ? Uri.decode(string3) : null;
                                                Bundle bundleA4 = lfxVar.a();
                                                String string4 = bundleA4 != null ? bundleA4.getString("name") : null;
                                                String strDecode2 = string4 != null ? Uri.decode(string4) : null;
                                                final LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                Context context = (Context) aVar6.O(AndroidCompositionLocals_androidKt.b);
                                                if (intOrNull == null) {
                                                    aVar6.N(-475342728);
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(-475342727);
                                                    if (strDecode == null) {
                                                        aVar6.N(-744870206);
                                                        aVar6.H();
                                                        aVar5 = aVar6;
                                                    } else {
                                                        aVar6.N(-744870205);
                                                        String str2 = strDecode.equals("game_providers") ? "provider_list" : "section_list";
                                                        if (strDecode.equals("game_providers")) {
                                                            iIntValue2 = intOrNull.intValue();
                                                        } else {
                                                            iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                                        }
                                                        boolean zEquals = strDecode.equals("my_favourites");
                                                        boolean zEquals2 = strDecode.equals("game_providers");
                                                        gnj gnjVar = gnj.c;
                                                        if (strDecode.equals("my_favourites")) {
                                                            aVar6.N(-1367714031);
                                                            aVar6.H();
                                                            lyhVarA1 = lobbyV2ViewModel4.W;
                                                        } else if (strDecode.equals("recommended_games")) {
                                                            aVar6.N(-1367559248);
                                                            aVar6.H();
                                                            lyhVarA1 = lobbyV2ViewModel4.X;
                                                        } else {
                                                            if (strDecode.equals("recently_played")) {
                                                                aVar6.N(-1367399164);
                                                                aVar6.H();
                                                                lyhVarA1 = lobbyV2ViewModel4.H1(context);
                                                            } else if (strDecode.equals("game_providers")) {
                                                                aVar6.N(-1367233965);
                                                                final int iIntValue3 = intOrNull.intValue();
                                                                aVar6.N(-1287797651);
                                                                LinkedHashMap linkedHashMap = lobbyV2ViewModel4.F;
                                                                Object objA = linkedHashMap.get(intOrNull);
                                                                if (objA == null) {
                                                                    iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
                                                                    boolean zD = aVar6.d(iIntValue3) | aVar6.A(lobbyV2ViewModel4);
                                                                    Object objY15 = aVar6.y();
                                                                    if (zD || objY15 == a.C0041a.a) {
                                                                        objY15 = new Function0() { // from class: rbt
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.v, Integer.valueOf(iIntValue3), null, 4), lobbyV2ViewModel4.a);
                                                                            }
                                                                        };
                                                                        aVar6.r(objY15);
                                                                    }
                                                                    Function0 function114 = (Function0) objY15;
                                                                    function114.getClass();
                                                                    if (function114 instanceof vje0) {
                                                                        jozVar = new ioz(function114);
                                                                        r650Var = null;
                                                                    } else {
                                                                        r650Var = null;
                                                                        jozVar = new joz(function114, null);
                                                                    }
                                                                    objA = rs5.a(new ymz(jozVar, iqzVar, r650Var).e, o8i0.d(lobbyV2ViewModel4));
                                                                    linkedHashMap.put(intOrNull, objA);
                                                                } else {
                                                                    iIntValue2 = iIntValue2;
                                                                }
                                                                lyhVarA1 = (lyh) objA;
                                                                aVar6.H();
                                                                aVar6.H();
                                                            } else {
                                                                iIntValue2 = iIntValue2;
                                                                if (strDecode.equals("trending_for_players_like_you")) {
                                                                    aVar6.N(-1367045268);
                                                                    aVar6.H();
                                                                    lyhVarA1 = lobbyV2ViewModel4.b0;
                                                                } else if (lobbyV2ViewModel4.d0.containsKey(intOrNull)) {
                                                                    aVar6.N(-1366877682);
                                                                    aVar6.H();
                                                                    final int iIntValue4 = intOrNull.intValue();
                                                                    LinkedHashMap linkedHashMap2 = lobbyV2ViewModel4.e0;
                                                                    Object objA2 = linkedHashMap2.get(intOrNull);
                                                                    if (objA2 == null) {
                                                                        objA2 = rs5.a(new ymz(new joz(new Function0() { // from class: jbt
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                                                                                List list = (List) lobbyV2ViewModel5.d0.get(Integer.valueOf(iIntValue4));
                                                                                if (list == null) {
                                                                                    list = m2g.a;
                                                                                }
                                                                                list.getClass();
                                                                                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.i, null, list, 2), lobbyV2ViewModel5.a);
                                                                            }
                                                                        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel4));
                                                                        linkedHashMap2.put(intOrNull, objA2);
                                                                    }
                                                                    lyhVarA1 = (lyh) objA2;
                                                                } else {
                                                                    aVar6.N(-1366736725);
                                                                    lyhVarA1 = lobbyV2ViewModel4.A1(intOrNull.intValue(), 48, 0, aVar6);
                                                                    aVar6.H();
                                                                }
                                                            }
                                                            a aVar9 = aVar6;
                                                            q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str2, lyhVarA1, aVar9, 196608, 6, 0);
                                                            aVar9.H();
                                                            aVar5 = aVar9;
                                                        }
                                                        iIntValue2 = iIntValue2;
                                                        a aVar10 = aVar6;
                                                        q4t.c(phxVar4, lobbyV2ViewModel4, iIntValue2, strDecode, strDecode2, true, zEquals, fbhVar2, zEquals2, rwjVar3, gnjVar, str2, lyhVarA1, aVar10, 196608, 6, 0);
                                                        aVar10.H();
                                                        aVar5 = aVar10;
                                                    }
                                                    aVar5.H();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 254);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(obj3);
                            }
                            yka.a.C1350a c1350a4 = c1350a;
                            uix.c(phxVar3, "lobby?id={id}", null, null, null, null, null, null, (Function1) obj3, aVar2, 0, 1020);
                            xw4Var2 = xw4Var;
                            if (campaignTopicResponse3 == null) {
                                aVar2.N(1245138514);
                                aVar2.H();
                                campaignTopicResponse = campaignTopicResponse3;
                                ytwVar2 = ytwVar3;
                                c0042a2 = c0042a3;
                            } else {
                                aVar2.N(1245138515);
                                loadingState = (LoadingState) ytwVarA.getValue();
                                if (loadingState != null) {
                                    walletInfo = null;
                                } else {
                                    walletInfo = null;
                                }
                                zG = Intrinsics.g(campaignTopicResponse3.getCampaignStatus(), "ENDED");
                                if (campaignTopicResponse3.isLastCampaignTier()) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (zG) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (walletInfo != null) {
                                    campaignTopicResponse = campaignTopicResponse3;
                                    ytwVar2 = ytwVar3;
                                    c0042a2 = c0042a3;
                                    aVar2.N(-1707251386);
                                } else {
                                    campaignTopicResponse = campaignTopicResponse3;
                                    ytwVar2 = ytwVar3;
                                    c0042a2 = c0042a3;
                                    aVar2.N(-1707251386);
                                }
                                aVar2.H();
                                Unit unit6 = Unit.a;
                                aVar2.H();
                            }
                            aVar2.s();
                            boolean zBooleanValue3 = ((Boolean) wyh.c(xw4Var2.d, aVar2, 0, 7).getValue()).booleanValue();
                            Campaign campaign3 = (Campaign) wyh.b(db6Var2.w, null, aVar2, 48, 14).getValue();
                            zA2 = aVar2.A(xw4Var2);
                            objY3 = aVar2.y();
                            if (zA2) {
                                objY3 = new bca(xw4Var2, 1);
                                aVar2.r(objY3);
                            } else {
                                objY3 = new bca(xw4Var2, 1);
                                aVar2.r(objY3);
                            }
                            Function0 function110 = (Function0) objY3;
                            function13 = function1;
                            zM2 = aVar2.M(function13) | aVar2.A(xw4Var2);
                            objY4 = aVar2.y();
                            if (zM2) {
                                objY4 = new gaj() { // from class: m6t
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        nt4 nt4Var2 = (nt4) obj4;
                                        Integer num = (Integer) obj5;
                                        num.intValue();
                                        Integer num2 = (Integer) obj6;
                                        num2.intValue();
                                        nt4Var2.getClass();
                                        if (nt4Var2.c == vt4.d) {
                                            function13.invoke(nt4Var2);
                                        } else {
                                            xw4 xw4Var3 = xw4Var2;
                                            xw4Var3.z = nt4Var2;
                                            xw4Var3.i = num;
                                            xw4Var3.v = num2;
                                            wwd0 wwd0Var = xw4Var3.e;
                                            Boolean bool = Boolean.TRUE;
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, bool);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY4);
                            } else {
                                objY4 = new gaj() { // from class: m6t
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        nt4 nt4Var2 = (nt4) obj4;
                                        Integer num = (Integer) obj5;
                                        num.intValue();
                                        Integer num2 = (Integer) obj6;
                                        num2.intValue();
                                        nt4Var2.getClass();
                                        if (nt4Var2.c == vt4.d) {
                                            function13.invoke(nt4Var2);
                                        } else {
                                            xw4 xw4Var3 = xw4Var2;
                                            xw4Var3.z = nt4Var2;
                                            xw4Var3.i = num;
                                            xw4Var3.v = num2;
                                            wwd0 wwd0Var = xw4Var3.e;
                                            Boolean bool = Boolean.TRUE;
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, bool);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY4);
                            }
                            mt4.a(false, zBooleanValue3, campaignTopicResponse, campaign3, function110, (gaj) objY4, null, aVar2, 0, 65);
                            boolean zBooleanValue4 = ((Boolean) wyh.c(xw4Var2.e, aVar2, 0, 7).getValue()).booleanValue();
                            nt4 nt4Var2 = xw4Var2.z;
                            cnj cnjVar2 = (cnj) wyh.c(xw4Var2.w, aVar2, 0, 7).getValue();
                            zA3 = aVar2.A(xw4Var2);
                            objY5 = aVar2.y();
                            if (zA3) {
                                objY5 = new Function1() { // from class: n6t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ((nt4) obj4).getClass();
                                        xw4Var2.z1();
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY5);
                            } else {
                                objY5 = new Function1() { // from class: n6t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ((nt4) obj4).getClass();
                                        xw4Var2.z1();
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY5);
                            }
                            Function1 function111 = (Function1) objY5;
                            zM3 = aVar2.M(function13);
                            objY6 = aVar2.y();
                            if (zM3) {
                                objY6 = new o6t(function13, 0);
                                aVar2.r(objY6);
                            } else {
                                objY6 = new o6t(function13, 0);
                                aVar2.r(objY6);
                            }
                            Function1 function112 = (Function1) objY6;
                            zA4 = aVar2.A(xw4Var2);
                            objY7 = aVar2.y();
                            if (zA4) {
                                objY7 = new tfj(xw4Var2, 1);
                                aVar2.r(objY7);
                            } else {
                                objY7 = new tfj(xw4Var2, 1);
                                aVar2.r(objY7);
                            }
                            ss4.a(zBooleanValue4, cnjVar2, nt4Var2, function111, function112, (Function0) objY7, aVar2, 0);
                            j7t.a(48, pp8.b(-1655140805, new e7t(0, db6Var2, ytwVar2), aVar2), aVar2, ((Boolean) ytwVar2.getValue()).booleanValue());
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar), bVar, false);
            }
            eVar.d = function8;
        }
        bVar = bVarI;
        bVar.G();
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            function8 = new Function2(xw4Var, lobbyV2ViewModel, fujVar, db6Var, dVar, function0, function1, rwjVar, swjVar, function2, function3, function4, function5, z, function6, function7, i) { // from class: c7t
                public final /* synthetic */ Function2 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ Function0 E;
                public final /* synthetic */ Function0 F;
                public final /* synthetic */ xw4 b;
                public final /* synthetic */ LobbyV2ViewModel c;
                public final /* synthetic */ fuj d;
                public final /* synthetic */ db6 e;
                public final /* synthetic */ ywj.d f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ rwj w;
                public final /* synthetic */ swj y;
                public final /* synthetic */ Function1 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j7t.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVar = eVarZ2;
            eVar.d = function8;
        }
    }
}
