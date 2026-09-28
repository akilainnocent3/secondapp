package defpackage;

import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import com.sportygames.common.network.campaign.CampaignTierCriteriaCondition;
import com.sportygames.compose.lobbyv2.models.UIState;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class fa6 {

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.compose.campaign.components.CampaignTierCardComponentKt$IconWithTick$1$1", f = "CampaignTierCardComponent.kt", l = {656}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0 wd0Var, v1b v1bVar, boolean z) {
            super(2, v1bVar);
            this.b = z;
            this.c = wd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (this.b) {
                    Float f = new Float(0.95f);
                    fkd0 fkd0VarD = yi0.d(0.5f, 200.0f, null, 4);
                    this.a = 1;
                    if (wd0.a(this.c, f, fkd0VarD, null, null, this, 12) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final d dVar, final boolean z) {
        int i3;
        b bVar;
        int i4;
        boolean z2;
        long j;
        yka.a.C1350a c1350a;
        dVar.getClass();
        b bVarI = aVar.i(-390303984);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                i4 = 2131231252;
            } else if (i == 1) {
                i4 = 2131231258;
            } else if (i == 2) {
                i4 = 2131231262;
            } else if (i != 3) {
                i4 = i != 4 ? 2131231257 : 2131231260;
            } else {
                i4 = 2131231261;
            }
            crz crzVarA = erz.a(i4, 0, bVarI);
            d dVarA = c.a(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            bVar = bVarI;
            boolean z3 = true;
            h9n.a(crzVarA, "Badge", j.e(aVar3, 1.0f), null, null, 0.0f, null, bVar, 432, 120);
            if (z) {
                z2 = false;
                bVar.N(-1237349576);
            } else {
                bVar.N(-1213302659);
                if (i == 1) {
                    bVar.N(515051713);
                    j = sh60.a(bVar).e;
                    bVar.X(false);
                } else if (i == 2) {
                    bVar.N(515054337);
                    j = sh60.a(bVar).f;
                    bVar.X(false);
                } else if (i == 3) {
                    bVar.N(515056959);
                    j = sh60.a(bVar).g;
                    bVar.X(false);
                } else if (i == 4) {
                    bVar.N(515059522);
                    j = sh60.a(bVar).h;
                    bVar.X(false);
                } else if (i != 5) {
                    bVar.N(515064962);
                    j = sh60.a(bVar).j;
                    bVar.X(false);
                } else {
                    bVar.N(515062179);
                    j = sh60.a(bVar).i;
                    bVar.X(false);
                }
                long j2 = j;
                kw0.k kVar = kw0.c;
                n54.a aVar4 = ht.a.n;
                i78 i78VarA = g78.a(kVar, aVar4, bVar, 48);
                int iHashCode2 = Long.hashCode(bVar.T);
                ne00 ne00VarS2 = bVar.S();
                d dVarC2 = androidx.compose.ui.c.c(bVar, aVar3);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar2);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, i78VarA, bVar2);
                hlh0.a(bVar, ne00VarS2, dVar2);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                    c1350a = c1350a2;
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                } else {
                    c1350a = c1350a2;
                }
                hlh0.a(bVar, dVarC2, cVar);
                l78 l78Var = l78.a;
                ty0.a(bVar, l78Var.a(0.508f, aVar3, true));
                yka.a.C1350a c1350a3 = c1350a;
                qb2.b(jn5.TIER.a(), l78Var.a(0.11f, aVar3, true), new imf0(j2, 0L, t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777210), null, 0, false, 0, 0, new if1(d2l.g(fw20.a(R.dimen._4ssp, bVar), 4294967296L), d2l.g(fw20.a(R.dimen._32ssp, bVar), 4294967296L), d2l.f(1)), bVar, 0, 504);
                ty0.a(bVar, l78Var.a(0.4f, aVar3, true));
                bVar.X(true);
                i78 i78VarA2 = g78.a(kVar, aVar4, bVar, 48);
                int iHashCode3 = Long.hashCode(bVar.T);
                ne00 ne00VarS3 = bVar.S();
                d dVarC3 = androidx.compose.ui.c.c(bVar, aVar3);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar2);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, i78VarA2, bVar2);
                hlh0.a(bVar, ne00VarS3, dVar2);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a3);
                }
                hlh0.a(bVar, dVarC3, cVar);
                ty0.a(bVar, l78Var.a(0.2f, aVar3, true));
                qb2.b(String.valueOf(i), l78Var.a(0.325f, aVar3, true), new imf0(sh60.a(bVar).j, 0L, t9i.G, null, null, 0L, null, null, 0, 0L, null, null, 16777210), null, 0, false, 0, 0, new if1(d2l.g(fw20.a(R.dimen._6ssp, bVar), 4294967296L), d2l.g(fw20.a(R.dimen._32ssp, bVar), 4294967296L), d2l.f(1)), bVar, 0, 504);
                bVar = bVar;
                z3 = true;
                ty0.a(bVar, l78Var.a(0.43f, aVar3, true));
                bVar.X(true);
                z2 = false;
            }
            bVar.X(z2);
            bVar.X(z3);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    fa6.a(i, iA, (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    public static final void b(final db6 db6Var, d dVar, final CampaignTier campaignTier, final boolean z, final boolean z2, final boolean z3, final Integer num, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        final d dVar2;
        vsf0 vsf0Var;
        db6Var.getClass();
        b bVarI = aVar.i(-763371139);
        int i2 = i | (bVarI.A(db6Var) ? 4 : 2) | 48 | (bVarI.A(campaignTier) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z3) ? 131072 : 65536) | (bVarI.A(function0) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4269203 & i2) != 4269202)) {
            String status = campaignTier.getStatus();
            if (status != null) {
                int iHashCode = status.hashCode();
                if (iHashCode != -1384838526) {
                    if (iHashCode != 620914836) {
                        if (iHashCode == 1383663147 && status.equals("COMPLETED")) {
                            vsf0Var = vsf0.d;
                        } else {
                            vsf0Var = vsf0.c;
                        }
                    } else if (status.equals("READY_TO_CLAIM")) {
                        vsf0Var = vsf0.b;
                    } else {
                        vsf0Var = vsf0.c;
                    }
                } else if (status.equals("REGISTERED")) {
                    vsf0Var = vsf0.a;
                } else {
                    vsf0Var = vsf0.c;
                }
            } else {
                vsf0Var = vsf0.e;
            }
            final vsf0 vsf0Var2 = vsf0Var;
            final boolean z4 = vsf0Var2 == vsf0.d || (z2 && vsf0Var2 == vsf0.c);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(!z4, bVarI);
            }
            final ytw ytwVar = (ytw) objY;
            final ytw ytwVarA = ts9.a(db6Var.e, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            d.a aVar2 = d.a.b;
            bVar = bVarI;
            rg6.a(j.A(j.g(aVar2, 1.0f), null, 3), j060.c(fw20.a(R.dimen._8sdp, bVarI)), null, gg6.c(62, fw20.a(R.dimen._10sdp, bVarI)), null, pp8.b(600385099, new gaj() { // from class: o96
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
                    long j2;
                    yka.a.C1350a c1350a;
                    String strB;
                    long jB;
                    n54.a aVar3;
                    tsr.a aVar4;
                    yka.a.b bVar2;
                    vsf0 vsf0Var3;
                    int i3;
                    tsr.a aVar5;
                    yka.a.C1350a c1350a2;
                    a aVar6 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z5 = z4;
                        vsf0 vsf0Var4 = vsf0Var2;
                        boolean z6 = z5 || vsf0Var4 == vsf0.e;
                        d.a aVar7 = d.a.b;
                        d dVarB = ls7.b(j.A(j.g(aVar7, 1.0f), null, 3));
                        if (z6) {
                            aVar6.N(1829056909);
                            j = sh60.a(aVar6).n;
                            aVar6.H();
                        } else {
                            aVar6.N(1829199509);
                            j = sh60.a(aVar6).m;
                            aVar6.H();
                        }
                        j58 j58Var = new j58(j);
                        if (z6) {
                            aVar6.N(1829374349);
                            j2 = sh60.a(aVar6).p;
                            aVar6.H();
                        } else {
                            aVar6.N(1829516949);
                            j2 = sh60.a(aVar6).o;
                            aVar6.H();
                        }
                        d dVarA = d35.a(androidx.compose.foundation.a.a(dVarB, new hfs(kotlin.collections.b.k(j58Var, new j58(j2)), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), z6 ? 1.0f : 0.0f, sh60.a(aVar6).q, j060.c(fw20.a(R.dimen._8sdp, aVar6)));
                        n54 n54Var = ht.a.a;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode2 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO = aVar6.o();
                        d dVarC = androidx.compose.ui.c.c(aVar6, dVarA);
                        yka.k.getClass();
                        tsr.a aVar8 = yka.a.b;
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar8);
                        } else {
                            aVar6.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar6, aivVarC, bVar3);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar6, ne00VarO, dVar3);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar6, iHashCode2, c1350a3);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar6, dVarC, cVar);
                        androidx.compose.foundation.layout.d dVar4 = androidx.compose.foundation.layout.d.a;
                        d dVarB2 = ls7.b(dVar4.f(aVar7));
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode3 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO2 = aVar6.o();
                        d dVarC2 = androidx.compose.ui.c.c(aVar6, dVarB2);
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar8);
                        } else {
                            aVar6.p();
                        }
                        hlh0.a(aVar6, aivVarC2, bVar3);
                        hlh0.a(aVar6, ne00VarO2, dVar3);
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar6, iHashCode3, c1350a3);
                        }
                        hlh0.a(aVar6, dVarC2, cVar);
                        h9n.a(erz.a(2131231246, 0, aVar6), "Card Background", dw.a(dVar4.b(j.g(aVar7, 0.55f), n54Var), 0.8f), n54Var, d0b.a.d, 0.0f, null, aVar6, 27696, 96);
                        aVar6.s();
                        d dVarA2 = j.A(j.g(h.f(aVar7, fw20.a(R.dimen._10sdp, aVar6)), 1.0f), null, 3);
                        kw0.g gVar = kw0.g;
                        n54.a aVar9 = ht.a.m;
                        i78 i78VarA = g78.a(gVar, aVar9, aVar6, 6);
                        int iHashCode4 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO3 = aVar6.o();
                        d dVarC3 = androidx.compose.ui.c.c(aVar6, dVarA2);
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar8);
                        } else {
                            aVar6.p();
                        }
                        hlh0.a(aVar6, i78VarA, bVar3);
                        hlh0.a(aVar6, ne00VarO3, dVar3);
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                            c1350a = c1350a3;
                            j3c.a(iHashCode4, aVar6, iHashCode4, c1350a);
                        } else {
                            c1350a = c1350a3;
                        }
                        hlh0.a(aVar6, dVarC3, cVar);
                        d dVarA3 = c.a(j.g(aVar7, 1.0f), 5.0f);
                        CampaignTier campaignTier2 = campaignTier;
                        yka.a.d dVar5 = dVar3;
                        int tierLevel = campaignTier2.getTierLevel();
                        twd0 twd0Var = ytwVarA;
                        UIState uIState = (UIState) twd0Var.getValue();
                        ytw ytwVar3 = ytwVar2;
                        boolean z7 = ((Boolean) ytwVar3.getValue()).booleanValue() && vsf0Var4 == vsf0.b;
                        yka.a.c cVar2 = cVar;
                        boolean z8 = z;
                        yka.a.C1350a c1350a4 = c1350a;
                        boolean z9 = z2;
                        fa6.d(dVarA3, tierLevel, vsf0Var4, z8, z9, uIState, z7, aVar6, 0);
                        by9.a(R.dimen._6sdp, aVar6, aVar7, aVar6);
                        if (z5 || vsf0Var4 == vsf0.e) {
                            aVar6.N(269010010);
                            if (z5) {
                                Integer tierGiftCount = campaignTier2.getTierGiftCount();
                                int iIntValue2 = tierGiftCount != null ? tierGiftCount.intValue() : campaignTier2.getUserGiftCount();
                                strB = kn5.b(iIntValue2 == 1 ? new eo5("x_free_bet_gift_won", "1 Free Bet Gift won", kpu.d(new Pair("{giftCount}", String.valueOf(iIntValue2)))) : new eo5("x_free_bet_gifts_won", m58.a(iIntValue2, " Free Bet Gifts won"), kpu.d(new Pair("{giftCount}", String.valueOf(iIntValue2)))));
                            } else {
                                int tierLevel2 = campaignTier2.getTierLevel();
                                int i4 = tierLevel2 - 1;
                                strB = i4 <= 0 ? null : kn5.b(new eo5("complete_tier_x_to_unlock_tier_y", whs.b(i4, tierLevel2, "Complete Tier ", " to unlock Tier "), kpu.d(new Pair("{prevTier}", String.valueOf(i4)), new Pair("{nextTier}", String.valueOf(tierLevel2)))));
                            }
                            if (z5) {
                                aVar6.N(269593585);
                                jB = ash0.b(R.dimen._13ssp, 48, aVar6);
                                aVar6.H();
                            } else {
                                aVar6.N(269665009);
                                jB = ash0.b(R.dimen._10ssp, 48, aVar6);
                                aVar6.H();
                            }
                            long j3 = jB;
                            if (strB == null) {
                                aVar6.N(269778251);
                                aVar6.H();
                                aVar3 = aVar9;
                                bVar2 = bVar3;
                                aVar4 = aVar8;
                                vsf0Var3 = vsf0Var4;
                            } else {
                                aVar6.N(269778252);
                                aVar3 = aVar9;
                                aVar4 = aVar8;
                                bVar2 = bVar3;
                                vsf0Var3 = vsf0Var4;
                                lkf0.b(strB, null, sh60.a(aVar6).D, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, j3, t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777209), aVar6, 0, 0, 65530);
                                aVar6 = aVar6;
                                by9.a(R.dimen._3sdp, aVar6, aVar7, aVar6);
                                Unit unit = Unit.a;
                                aVar6.H();
                            }
                            aVar6.H();
                        } else {
                            aVar6.N(259532659);
                            aVar6.H();
                            aVar3 = aVar9;
                            bVar2 = bVar3;
                            aVar4 = aVar8;
                            c1350a4 = c1350a4;
                            dVar5 = dVar5;
                            cVar2 = cVar2;
                            ytwVar3 = ytwVar3;
                            vsf0Var3 = vsf0Var4;
                        }
                        vsf0 vsf0Var5 = vsf0.b;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (vsf0Var3 == vsf0Var5) {
                            aVar6.N(270602883);
                            UIState uIState2 = (UIState) twd0Var.getValue();
                            Integer tierGiftCount2 = campaignTier2.getTierGiftCount();
                            int iIntValue3 = tierGiftCount2 != null ? tierGiftCount2.intValue() : 0;
                            Function0 function1 = function0;
                            boolean zM = aVar6.M(function1);
                            Object objY3 = aVar6.y();
                            if (zM || objY3 == c0042a2) {
                                objY3 = new q96(ytwVar3, function1);
                                aVar6.r(objY3);
                            }
                            h66.a(uIState2, iIntValue3, null, (Function0) objY3, aVar6, 0);
                            aVar6.H();
                        } else {
                            aVar6.N(271189806);
                            if (z9 || vsf0Var3 != vsf0.c) {
                                aVar6.N(274047262);
                                final ytw ytwVar4 = ytwVar;
                                if (((Boolean) ytwVar4.getValue()).booleanValue() || !z5) {
                                    i3 = 259532659;
                                    aVar6.N(259532660);
                                    List<CampaignTierCriteria> criteria = campaignTier2.getCriteria();
                                    if (criteria == null) {
                                        criteria = m2g.a;
                                    }
                                    int i5 = 0;
                                    for (CampaignTierCriteria campaignTierCriteria : criteria) {
                                        int i6 = i5 + 1;
                                        d dVarA4 = j.A(j.g(aVar7, 1.0f), null, 3);
                                        List<CampaignTierCriteria> criteria2 = campaignTier2.getCriteria();
                                        if (criteria2 == null) {
                                            criteria2 = m2g.a;
                                        }
                                        fa6.c(dVarA4, campaignTierCriteria, i6, criteria2.size() == 1, z5, aVar6, 6);
                                        by9.a(R.dimen._5sdp, aVar6, aVar7, aVar6);
                                        i5 = i6;
                                    }
                                    aVar6.H();
                                } else {
                                    i3 = 259532659;
                                    aVar6.N(259532659);
                                    aVar6.H();
                                }
                                if (z5) {
                                    aVar6.N(275103680);
                                    d dVarA5 = j.A(j.g(aVar7, 1.0f), null, 3);
                                    d160 d160VarA = b160.a(kw0.b, ht.a.k, aVar6, 54);
                                    int iHashCode5 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO4 = aVar6.o();
                                    d dVarC4 = androidx.compose.ui.c.c(aVar6, dVarA5);
                                    yka.k.getClass();
                                    tsr.a aVar10 = yka.a.b;
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar10);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, d160VarA, yka.a.f);
                                    hlh0.a(aVar6, ne00VarO4, yka.a.e);
                                    yka.a.C1350a c1350a5 = yka.a.g;
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode5))) {
                                        j3c.a(iHashCode5, aVar6, iHashCode5, c1350a5);
                                    }
                                    hlh0.a(aVar6, dVarC4, yka.a.d);
                                    d dVarC5 = j.C(aVar7, null, 3);
                                    Object objY4 = aVar6.y();
                                    if (objY4 == c0042a2) {
                                        objY4 = new r96(ytwVar4, 0);
                                        aVar6.r(objY4);
                                    }
                                    d dVarD = androidx.compose.foundation.d.d(dVarC5, false, null, null, (Function0) objY4, 15);
                                    String strA = (((Boolean) ytwVar4.getValue()).booleanValue() ? jn5.HIDE_DETAILS : jn5.SHOW_DETAILS).a();
                                    long jG = d2l.g(fw20.a(R.dimen._8ssp, aVar6), 4294967296L);
                                    t9i t9iVar = t9i.E;
                                    qyd0 qyd0Var = sh60.a;
                                    a aVar11 = aVar6;
                                    lkf0.b(strA, dVarD, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(((qh60) aVar6.O(qyd0Var)).y, jG, t9iVar, null, null, 0L, null, null, 0, 0L, null, null, 16777208), aVar11, 0, 0, 65532);
                                    aVar6 = aVar11;
                                    ty0.a(aVar6, j.w(aVar7, fw20.a(R.dimen._2sdp, aVar6)));
                                    d dVarI = j.i(aVar7, fw20.a(R.dimen._5sdp, aVar6));
                                    Object objY5 = aVar6.y();
                                    if (objY5 == c0042a2) {
                                        objY5 = new Function1() { // from class: s96
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                a7l a7lVar = (a7l) obj4;
                                                a7lVar.getClass();
                                                a7lVar.v(((Boolean) ytwVar4.getValue()).booleanValue() ? 1.0f : -1.0f);
                                                return Unit.a;
                                            }
                                        };
                                        aVar6.r(objY5);
                                    }
                                    d dVarA6 = androidx.compose.ui.graphics.a.a(dVarI, (Function1) objY5);
                                    Object objY6 = aVar6.y();
                                    if (objY6 == c0042a2) {
                                        objY6 = new dz0(ytwVar4, 1);
                                        aVar6.r(objY6);
                                    }
                                    h9n.a(erz.a(R.drawable.campaign_arrow, 0, aVar6), "Arrow", androidx.compose.foundation.d.d(dVarA6, false, null, null, (Function0) objY6, 15), null, null, 0.0f, new gf4(((qh60) aVar6.O(qyd0Var)).y, 5), aVar6, 48, 56);
                                    aVar6.s();
                                } else {
                                    aVar6.N(i3);
                                }
                                aVar6.H();
                                aVar6.H();
                            } else {
                                aVar6.N(271163084);
                                d dVarA7 = j.A(j.g(aVar7, 1.0f), null, 3);
                                kw0.k kVar = kw0.c;
                                n54.a aVar12 = aVar3;
                                i78 i78VarA2 = g78.a(kVar, aVar12, aVar6, 0);
                                int iHashCode6 = Long.hashCode(aVar6.m());
                                ne00 ne00VarO5 = aVar6.o();
                                d dVarC6 = androidx.compose.ui.c.c(aVar6, dVarA7);
                                if (aVar6.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar6.D();
                                if (aVar6.g()) {
                                    aVar5 = aVar4;
                                    aVar6.F(aVar5);
                                } else {
                                    aVar5 = aVar4;
                                    aVar6.p();
                                }
                                yka.a.b bVar4 = bVar2;
                                hlh0.a(aVar6, i78VarA2, bVar4);
                                yka.a.d dVar6 = dVar5;
                                hlh0.a(aVar6, ne00VarO5, dVar6);
                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode6))) {
                                    c1350a2 = c1350a4;
                                    j3c.a(iHashCode6, aVar6, iHashCode6, c1350a2);
                                } else {
                                    c1350a2 = c1350a4;
                                }
                                yka.a.c cVar3 = cVar2;
                                hlh0.a(aVar6, dVarC6, cVar3);
                                int userGiftCount = campaignTier2.getUserGiftCount();
                                Integer tierGiftCount3 = campaignTier2.getTierGiftCount();
                                int iIntValue4 = tierGiftCount3 != null ? tierGiftCount3.intValue() : 0;
                                int tierLevel3 = campaignTier2.getTierLevel();
                                aVar6.N(-1874766761);
                                nk0.b bVar5 = new nk0.b((Object) null);
                                int i7 = iIntValue4;
                                bVar5.g(kn5.b(new eo5("x_gifts_used", userGiftCount + "/" + iIntValue4 + " gifts used", kpu.d(new Pair("{userGiftCount}", String.valueOf(userGiftCount)), new Pair("{tierGiftCount}", String.valueOf(i7))))));
                                long jB2 = ash0.b(R.dimen._10ssp, 48, aVar6);
                                long j4 = sh60.a(aVar6).E;
                                t9i t9iVar2 = t9i.E;
                                int iL = bVar5.l(new ora0(j4, jB2, t9iVar2, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
                                try {
                                    bVar5.g(" ".concat(jn5.OR_EXPIRED.a()));
                                    Unit unit2 = Unit.a;
                                    bVar5.i(iL);
                                    nk0 nk0VarM = bVar5.m();
                                    aVar6.H();
                                    i78 i78VarA3 = g78.a(kVar, aVar12, aVar6, 0);
                                    int iHashCode7 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO6 = aVar6.o();
                                    d dVarC7 = androidx.compose.ui.c.c(aVar6, aVar7);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar5);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, i78VarA3, bVar4);
                                    hlh0.a(aVar6, ne00VarO6, dVar6);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode7))) {
                                        j3c.a(iHashCode7, aVar6, iHashCode7, c1350a2);
                                    }
                                    hlh0.a(aVar6, dVarC7, cVar3);
                                    a aVar13 = aVar6;
                                    lkf0.c(nk0VarM, null, sh60.a(aVar6).D, ash0.b(R.dimen._14ssp, 48, aVar6), null, t9iVar2, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, aVar13, 196608, 0, 262098);
                                    by9.a(R.dimen._6sdp, aVar13, aVar7, aVar13);
                                    fa6.l(userGiftCount / i7, 0, aVar13, ls7.a(j.i(j.g(aVar7, 1.0f), fw20.a(R.dimen._6sdp, aVar13)), j060.c(fw20.a(R.dimen._10sdp, aVar13))));
                                    aVar13.s();
                                    ty0.a(aVar13, j.i(aVar7, fw20.a(R.dimen._6sdp, aVar13)));
                                    int i8 = tierLevel3 + 1;
                                    lkf0.b(kn5.b(new eo5("use_all_tier_gifts_to_unlock_tier_x", whs.b(tierLevel3, i8, "Use all TIER ", " gifts to unlock TIER "), kpu.d(new Pair("{currentTierLevel}", String.valueOf(tierLevel3)), new Pair("{nextTierLevel}", String.valueOf(i8))))), null, sh60.a(aVar13).x, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, ash0.b(R.dimen._9ssp, 48, aVar13), t9iVar2, null, null, 0L, null, null, 0, 0L, null, null, 16777209), aVar13, 0, 0, 65530);
                                    aVar6 = aVar13;
                                    aVar6.s();
                                    ty0.a(aVar6, j.i(aVar7, fw20.a(R.dimen._3sdp, aVar6)));
                                    aVar6.H();
                                } catch (Throwable th) {
                                    bVar5.i(iL);
                                    throw th;
                                }
                            }
                            aVar6.H();
                        }
                        aVar6.s();
                        if (z3 || z6) {
                            aVar6.N(264875502);
                            g75.a(androidx.compose.foundation.a.b(dVar4.f(aVar7), ((qh60) aVar6.O(sh60.a)).C, zk40.a), aVar6, 0);
                        } else {
                            aVar6.N(247061693);
                        }
                        aVar6.H();
                        aVar6.s();
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 196608, 20);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar2, campaignTier, z, z2, z3, num, function0, i) { // from class: p96
                public final /* synthetic */ d b;
                public final /* synthetic */ CampaignTier c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Integer i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fa6.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final int i, final vsf0 vsf0Var, final boolean z, final boolean z2, final UIState uIState, final boolean z3, androidx.compose.runtime.a aVar, final int i2) {
        boolean z4;
        boolean z5;
        boolean z6;
        b bVarI = aVar.i(-782351363);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.d(vsf0Var.ordinal()) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z3) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (533651 & i3) != 533650)) {
            d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            int i4 = (i3 & 112) | 6;
            int i5 = i3 >> 3;
            a(i, (i5 & 896) | i4, bVarI, j.g(aVar3, 0.24f), z);
            vsf0 vsf0Var2 = vsf0.d;
            if (vsf0Var == vsf0Var2 || vsf0Var == vsf0.e || (vsf0Var == vsf0.c && z2)) {
                bVarI.N(-792658902);
                d dVarC2 = j.c(j.g(aVar3, 0.8f), 1.0f);
                d160 d160VarA2 = b160.a(kw0.b, ht.a.j, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarC2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                vsf0 vsf0Var3 = vsf0.c;
                d0b.a.d dVar3 = d0b.a.d;
                if (vsf0Var == vsf0Var3) {
                    bVarI.N(-1989720210);
                    Object objY = bVarI.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (objY == c0042a) {
                        objY = ee0.a(0.2f);
                        bVarI.r(objY);
                    }
                    wd0 wd0Var = (wd0) objY;
                    Unit unit = Unit.a;
                    boolean zA = bVarI.A(wd0Var);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new ca6(wd0Var, null);
                        bVarI.r(objY2);
                    }
                    xvf.e(bVarI, unit, (Function2) objY2);
                    d dVarA = j.A(j.g(h.j(aVar3, 0.0f, fw20.a(R.dimen._2sdp, bVarI), 0.0f, 0.0f, 13), 0.218f), null, 3);
                    float fFloatValue = ((Number) wd0Var.d()).floatValue();
                    d dVarA2 = bz60.a(dVarA, fFloatValue, fFloatValue);
                    z4 = false;
                    h9n.a(erz.a(R.drawable.campaign_tier_completed, 0, bVarI), "Completed", dVarA2, null, dVar3, 0.0f, null, bVarI, 24624, 104);
                    bVarI.X(false);
                    z5 = true;
                } else {
                    z4 = false;
                    if (vsf0Var != vsf0Var2) {
                        bVarI.N(-1988662924);
                        z5 = true;
                        h9n.a(erz.a(R.drawable.campaign_locked, 0, bVarI), "Locked", j.A(j.g(h.j(aVar3, 0.0f, fw20.a(R.dimen._3sdp, bVarI), 0.0f, 0.0f, 13), 0.161f), null, 3), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                        bVarI.X(false);
                    } else {
                        z5 = true;
                        bVarI.N(-1988190391);
                        h9n.a(erz.a(R.drawable.campaign_tier_completed, 0, bVarI), "Completed", j.A(j.g(h.j(aVar3, 0.0f, fw20.a(R.dimen._2sdp, bVarI), 0.0f, 0.0f, 13), 0.218f), null, 3), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                        bVarI.X(false);
                    }
                }
                bVarI.X(z5);
                bVarI.X(z4);
            } else {
                bVarI.N(-790351634);
                d dVarG2 = j.g(j.c(aVar3, 1.0f), 0.7f);
                i78 i78VarA = g78.a(kw0.h, ht.a.m, bVarI, 6);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                if (z || z2) {
                    bVarI.N(1003190981);
                    e(j.g(aVar3, 1.0f), vsf0Var, z3, bVarI, (i5 & 112) | 6 | ((i3 >> 12) & 896));
                    z6 = false;
                    bVarI.X(false);
                } else {
                    bVarI.N(1003547977);
                    f(j.g(aVar3, 1.0f), vsf0Var, z3, bVarI, (i5 & 112) | 6 | ((i3 >> 12) & 896));
                    z6 = false;
                    bVarI.X(false);
                }
                ty0.a(bVarI, j.c(aVar3, 0.11f));
                bVarI.X(true);
                bVarI.X(z6);
                z5 = true;
            }
            bVarI.X(z5);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, vsf0Var, z, z2, uIState, z3, i2) { // from class: j96
                public final /* synthetic */ int b;
                public final /* synthetic */ vsf0 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ UIState f;
                public final /* synthetic */ boolean i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fa6.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, vsf0 vsf0Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final vsf0 vsf0Var2;
        long j;
        long j2;
        dVar.getClass();
        b bVarI = aVar.i(100814734);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(vsf0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarC = j.c(dVar, 0.8f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            f160 f160Var = f160.a;
            ty0.a(bVarI, f160Var.a(0.51199996f, aVar3, true));
            d dVarA = f160Var.a(0.15f, aVar3, true);
            crz crzVarA = erz.a(R.drawable.campaign_tier_stage_mission, 0, bVarI);
            vsf0 vsf0Var3 = vsf0.a;
            j(dVarA, crzVarA, vsf0Var == vsf0Var3, false, bVarI, 0, 8);
            i(0, bVarI, f160Var.a(0.332f, aVar3, true), vsf0Var == vsf0Var3 || vsf0Var == vsf0.b);
            ty0.a(bVarI, f160Var.a(0.03f, aVar3, true));
            j(dw.a(f160Var.a(0.15f, aVar3, true), vsf0Var == vsf0Var3 ? 0.302f : 1.0f), erz.a(2131231263, 0, bVarI), vsf0Var == vsf0Var3 || vsf0Var == vsf0.b, z, bVarI, (i2 << 3) & 7168, 0);
            bVarI.X(true);
            ty0.a(bVarI, j.i(aVar3, fw20.a(R.dimen._2sdp, bVarI)));
            d dVarG2 = j.g(aVar3, 1.0f);
            d160 d160VarA2 = b160.a(kw0.g, bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            g75.a(f160Var.a(0.425f, aVar3, true), bVarI, 0);
            d dVarA2 = f160Var.a(0.2875f, aVar3, true);
            String strN = n(jn5.COMPLETE_MISSION.a(), false);
            long jG = d2l.g(fw20.a(R.dimen._7ssp, bVarI), 4294967296L);
            t9i t9iVar = t9i.E;
            long jG2 = d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L);
            long jF = d2l.f(0);
            if (vsf0Var == vsf0Var3) {
                bVarI.N(1788974208);
                j = sh60.a(bVarI).A;
                bVarI.X(false);
            } else {
                bVarI.N(1789080383);
                j = sh60.a(bVarI).B;
                bVarI.X(false);
            }
            vsf0Var2 = vsf0Var;
            lkf0.b(strN, dVarA2, j, jG, null, t9iVar, null, jF, new gdf0(5), jG2, 0, false, 0, 2, null, null, bVarI, 12779520, 24576, 112976);
            d dVarA3 = f160Var.a(0.2875f, aVar3, true);
            String strN2 = n(jn5.COLLECT_GIFTS_TEXT.a(), false);
            long jG3 = d2l.g(fw20.a(R.dimen._7ssp, bVarI), 4294967296L);
            long jG4 = d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L);
            long jF2 = d2l.f(0);
            if (vsf0Var2 == vsf0.b) {
                bVarI.N(1789714240);
                j2 = sh60.a(bVarI).A;
                bVarI.X(false);
            } else {
                bVarI.N(1789820415);
                j2 = sh60.a(bVarI).B;
                bVarI.X(false);
            }
            lkf0.b(strN2, dVarA3, j2, jG3, null, t9iVar, null, jF2, new gdf0(6), jG4, 0, false, 2, 2, null, null, bVarI, 12779520, 27648, 104784);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            vsf0Var2 = vsf0Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ba6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fa6.e(dVar, vsf0Var2, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final d dVar, final vsf0 vsf0Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        dVar.getClass();
        b bVarI = aVar.i(-1081007912);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(vsf0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarC = j.c(dVar, 0.8f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            int i3 = i2;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            f160 f160Var = f160.a;
            d dVarA = f160Var.a(0.15f, aVar3, true);
            crz crzVarA = erz.a(R.drawable.campaign_tier_stage_mission, 0, bVarI);
            vsf0 vsf0Var2 = vsf0.a;
            j(dVarA, crzVarA, vsf0Var == vsf0Var2, false, bVarI, 0, 8);
            i(0, bVarI, f160Var.a(0.332f, aVar3, true), vsf0Var == vsf0Var2);
            ty0.a(bVarI, f160Var.a(0.03f, aVar3, true));
            j(dw.a(f160Var.a(0.15f, aVar3, true), vsf0Var == vsf0Var2 ? 0.472f : 1.0f), erz.a(2131231263, 0, bVarI), vsf0Var == vsf0Var2 || vsf0Var == vsf0.b, z, bVarI, (i3 << 3) & 7168, 0);
            i(0, bVarI, f160Var.a(0.332f, aVar3, true), vsf0Var == vsf0Var2 || vsf0Var == vsf0.b);
            ty0.a(bVarI, f160Var.a(0.03f, aVar3, true));
            j(dw.a(f160Var.a(0.15f, aVar3, true), (vsf0Var == vsf0Var2 || vsf0Var == vsf0.b) ? 0.472f : 1.0f), erz.a(2131231266, 0, bVarI), true, false, bVarI, 384, 8);
            bVarI.X(true);
            ty0.a(bVarI, j.i(aVar3, fw20.a(R.dimen._2sdp, bVarI)));
            d dVarG2 = j.g(aVar3, 1.0f);
            d160 d160VarA2 = b160.a(kw0.g, bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarA2 = f160Var.a(0.33f, aVar3, true);
            String strN = n(jn5.COMPLETE_MISSION.a(), false);
            long jB = ash0.b(R.dimen._7ssp, 48, bVarI);
            t9i t9iVar = t9i.E;
            long jB2 = ash0.b(R.dimen._8ssp, 48, bVarI);
            long jF = d2l.f(0);
            if (vsf0Var == vsf0Var2) {
                bVarI.N(-891482602);
                j = sh60.a(bVarI).A;
                bVarI.X(false);
            } else {
                bVarI.N(-891376427);
                j = sh60.a(bVarI).B;
                bVarI.X(false);
            }
            lkf0.b(strN, dVarA2, j, jB, null, t9iVar, null, jF, new gdf0(5), jB2, 0, false, 0, 2, null, null, bVarI, 12779520, 24576, 112976);
            d dVarA3 = f160Var.a(0.33f, aVar3, true);
            String strN2 = n(jn5.COLLECT_GIFTS_TEXT.a(), false);
            long jB3 = ash0.b(R.dimen._7ssp, 48, bVarI);
            long jB4 = ash0.b(R.dimen._8ssp, 48, bVarI);
            long jF2 = d2l.f(0);
            if (vsf0Var == vsf0.b) {
                bVarI.N(-890771338);
                j2 = sh60.a(bVarI).A;
                bVarI.X(false);
            } else {
                bVarI.N(-890665163);
                j2 = sh60.a(bVarI).B;
                bVarI.X(false);
            }
            lkf0.b(strN2, dVarA3, j2, jB3, null, t9iVar, null, jF2, new gdf0(3), jB4, 0, false, 0, 2, null, null, bVarI, 12779520, 24576, 112976);
            d dVarA4 = f160Var.a(0.33f, aVar3, true);
            String strN3 = n(jn5.USE_ALL_GIFTS.a(), true);
            long jB5 = ash0.b(R.dimen._7ssp, 48, bVarI);
            long jB6 = ash0.b(R.dimen._8ssp, 48, bVarI);
            long jF3 = d2l.f(0);
            if (vsf0Var == vsf0.c) {
                bVarI.N(-890066026);
                j3 = sh60.a(bVarI).A;
                bVarI.X(false);
            } else {
                bVarI.N(-889959851);
                j3 = sh60.a(bVarI).B;
                bVarI.X(false);
            }
            lkf0.b(strN3, dVarA4, j3, jB5, null, t9iVar, null, jF3, new gdf0(6), jB6, 0, false, 0, 2, null, null, bVarI, 12779520, 24576, 112976);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: aa6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fa6.f(dVar, vsf0Var, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final int i, androidx.compose.runtime.a aVar, d dVar, final List list, Function1 function1) {
        final d dVar2;
        final Function1 function2;
        String strA;
        boolean z;
        final ytw ytwVar;
        list.getClass();
        b bVarI = aVar.i(1292876865);
        int i2 = (bVarI.A(list) ? 4 : 2) | i | 432;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new w96();
                bVarI.r(objY);
            }
            Function1 function3 = (Function1) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(null);
                bVarI.r(objY3);
            }
            ytw ytwVar3 = (ytw) objY3;
            String strConcat = (list.size() == 1 ? jn5.GAME_LABEL : jn5.GAME_SET_LABEL).a().concat(" : ");
            List listT0 = (((Boolean) ytwVar2.getValue()).booleanValue() || list.size() <= 2) ? list : CollectionsKt.t0(list, 2);
            if (((Boolean) ytwVar2.getValue()).booleanValue() || list.size() <= 2) {
                strA = (!((Boolean) ytwVar2.getValue()).booleanValue() || list.size() <= 2) ? "" : jn5.VIEW_LESS.a();
            } else {
                strA = jn5.VIEW_MORE.a();
            }
            bVarI.N(1209144722);
            nk0.b bVar = new nk0.b((Object) null);
            qyd0 qyd0Var = sh60.a;
            int iL = bVar.l(new ora0(((qh60) bVarI.O(qyd0Var)).x, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar.g(strConcat);
                bVar.g(CollectionsKt.a0(listT0, ", ", null, null, null, 62));
                Unit unit = Unit.a;
                bVar.i(iL);
                if (strA.length() > 0) {
                    bVarI.N(-942739597);
                    bVar.g(" ");
                    bVar.k("TOGGLE", "TOGGLE");
                    int iL2 = bVar.l(new ora0(((qh60) bVarI.O(qyd0Var)).z, 0L, t9i.D, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.c, (ix80) null, 61434));
                    try {
                        bVar.g(strA);
                        bVar.i(iL2);
                        bVar.h();
                        z = false;
                    } catch (Throwable th) {
                        bVar.i(iL2);
                        throw th;
                    }
                } else {
                    z = false;
                    bVarI.N(-974172667);
                }
                bVarI.X(z);
                nk0 nk0VarM = bVar.m();
                bVarI.X(z);
                boolean zM = bVarI.M(nk0VarM);
                Object objY4 = bVarI.y();
                if (zM || objY4 == c0042a) {
                    ytwVar = ytwVar3;
                    objY4 = new ea6(ytwVar, nk0VarM, function3, ytwVar2);
                    bVarI.r(objY4);
                } else {
                    ytwVar = ytwVar3;
                }
                d.a aVar2 = d.a.b;
                d dVarA = wje0.a(aVar2, nk0VarM, (PointerInputEventHandler) objY4);
                imf0 imf0Var = new imf0(0L, d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L), t9i.E, null, null, d2l.f(0), null, null, 0, d2l.g(fw20.a(R.dimen._11ssp, bVarI), 4294967296L), null, null, 16646009);
                Object objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new Function1() { // from class: x96
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            ytwVar.setValue(ukf0Var);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                qb2.a(nk0VarM, dVarA, imf0Var, (Function1) objY5, 2, false, 3, 0, null, bVarI, 1600512, 0, 1952);
                function2 = function3;
                dVar2 = aVar2;
            } catch (Throwable th2) {
                bVar.i(iL);
                throw th2;
            }
        } else {
            bVarI.G();
            dVar2 = dVar;
            function2 = function1;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, list, function2) { // from class: y96
                public final /* synthetic */ List a;
                public final /* synthetic */ d b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = list;
                    this.b = dVar2;
                    this.c = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fa6.h(qj40.a(1), (a) obj, this.b, this.a, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, androidx.compose.runtime.a aVar, final d dVar, final boolean z) {
        dVar.getClass();
        b bVarI = aVar.i(-547891767);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            qyd0 qyd0Var = sh60.a;
            final long j = ((qh60) bVarI.O(qyd0Var)).A;
            final long j2 = ((qh60) bVarI.O(qyd0Var)).B;
            boolean zM = bVarI.M(mmdVar) | ((i2 & 112) == 32) | bVarI.e(j2) | bVarI.e(j);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                Function1 function1 = new Function1() { // from class: l96
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        char c = ' ';
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        long j3 = 4294967295L;
                        float f = 2.0f;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 2.0f;
                        mmd mmdVar2 = mmdVar;
                        float fC1 = mmdVar2.C1(4.0f);
                        float fC2 = mmdVar2.C1(2.0f);
                        float fC3 = mmdVar2.C1(4.0f);
                        float fC4 = mmdVar2.C1(1.0f);
                        int iE = f.e((int) Math.floor(fIntBitsToFloat / (fC1 + fC3)), 3, 20);
                        float f2 = iE > 1 ? (fIntBitsToFloat - (iE * fC1)) / (iE - 1) : 0.0f;
                        int i3 = 0;
                        while (i3 < iE) {
                            float f3 = (fC1 + f2) * i3;
                            float f4 = fIntBitsToFloat2 - (fC2 / f);
                            char c2 = c;
                            long j4 = j3;
                            tcf.d1(tcfVar, z ? j2 : j, (((long) Float.floatToRawIntBits(f4)) & j3) | (((long) Float.floatToRawIntBits(f3)) << c), (((long) Float.floatToRawIntBits(fC1)) << c) | (((long) Float.floatToRawIntBits(fC2)) & j3), (((long) Float.floatToRawIntBits(fC4)) << c2) | (((long) Float.floatToRawIntBits(fC4)) & j4), null, 0.0f, 240);
                            i3++;
                            iE = iE;
                            f = 2.0f;
                            c = c2;
                            j3 = j4;
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            }
            rxo.b(dVar, (Function1) objY, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, z) { // from class: m96
                public final /* synthetic */ d a;
                public final /* synthetic */ boolean b;

                {
                    this.a = dVar;
                    this.b = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fa6.i(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void j(final d dVar, final crz crzVar, final boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        crz crzVar2;
        boolean z3;
        boolean z4;
        final boolean z5;
        e eVarZ;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        wd0 wd0Var;
        boolean z6;
        boolean zA;
        Object objY2;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        d.a aVar3;
        androidx.compose.foundation.layout.d dVar2;
        d0b.a.d dVar3;
        n54 n54Var;
        float f;
        dVar.getClass();
        crzVar.getClass();
        b bVarI = aVar.i(-1391372312);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            crzVar2 = crzVar;
            i3 |= bVarI.A(crzVar2) ? 32 : 16;
        } else {
            crzVar2 = crzVar;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= bVarI.b(z3) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i3 & 1, z4)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = ee0.a(0.2f);
                    bVarI.r(objY);
                }
                wd0Var = (wd0) objY;
                Boolean boolValueOf = Boolean.valueOf(z5);
                if ((i3 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zA = z6 | bVarI.A(wd0Var);
                objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new a(wd0Var, null, z5);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, boolValueOf, (Function2) objY2);
                d dVarA = c.a(j.g(dVar, 1.0f), 0.85f);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                aVar3 = d.a.b;
                d dVarG = j.g(aVar3, 0.8f);
                n54 n54Var2 = ht.a.d;
                dVar2 = androidx.compose.foundation.layout.d.a;
                dVar3 = d0b.a.d;
                h9n.a(crzVar2, "Stage Icon", dVar2.b(dVarG, n54Var2), null, dVar3, 0.0f, null, bVarI, ((i3 >> 3) & 14) | 24624, 104);
                n54Var = ht.a.c;
                if (z5) {
                    bVarI.N(-688803086);
                    d dVarB = dVar2.b(j.g(aVar3, 0.68f), n54Var);
                    float fFloatValue = ((Number) wd0Var.d()).floatValue();
                    h9n.a(erz.a(R.drawable.campaign_tier_stage_tick, 0, bVarI), "Tick", bz60.a(dVarB, fFloatValue, fFloatValue), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                    bVarI.X(false);
                } else {
                    bVarI.N(-688408766);
                    d dVarG2 = j.g(aVar3, 0.68f);
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    h9n.a(erz.a(R.drawable.campaign_tier_stage_tick, 0, bVarI), "Tick", bz60.a(dVar2.b(dw.a(dVarG2, f), n54Var), 0.95f, 0.95f), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                    bVarI.X(false);
                }
                bVarI.X(true);
            } else {
                bVarI.G();
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: n96
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fa6.j(dVar, crzVar, z, z5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i3 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i3 & 1, z4)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.2f);
                bVarI.r(objY);
            }
            wd0Var = (wd0) objY;
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            if ((i3 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            zA = z6 | bVarI.A(wd0Var);
            objY2 = bVarI.y();
            if (zA) {
                objY2 = new a(wd0Var, null, z5);
                bVarI.r(objY2);
            } else {
                objY2 = new a(wd0Var, null, z5);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, boolValueOf2, (Function2) objY2);
            d dVarA2 = c.a(j.g(dVar, 1.0f), 0.85f);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            aVar3 = d.a.b;
            d dVarG3 = j.g(aVar3, 0.8f);
            n54 n54Var3 = ht.a.d;
            dVar2 = androidx.compose.foundation.layout.d.a;
            dVar3 = d0b.a.d;
            h9n.a(crzVar2, "Stage Icon", dVar2.b(dVarG3, n54Var3), null, dVar3, 0.0f, null, bVarI, ((i3 >> 3) & 14) | 24624, 104);
            n54Var = ht.a.c;
            if (z5) {
                bVarI.N(-688803086);
                d dVarB2 = dVar2.b(j.g(aVar3, 0.68f), n54Var);
                float fFloatValue2 = ((Number) wd0Var.d()).floatValue();
                h9n.a(erz.a(R.drawable.campaign_tier_stage_tick, 0, bVarI), "Tick", bz60.a(dVarB2, fFloatValue2, fFloatValue2), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                bVarI.X(false);
            } else {
                bVarI.N(-688408766);
                d dVarG4 = j.g(aVar3, 0.68f);
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                h9n.a(erz.a(R.drawable.campaign_tier_stage_tick, 0, bVarI), "Tick", bz60.a(dVar2.b(dw.a(dVarG4, f), n54Var), 0.95f, 0.95f), null, dVar3, 0.0f, null, bVarI, 24624, 104);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
            z5 = z3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fa6.j(dVar, crzVar, z, z5, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        int i3;
        b bVar;
        b bVarI = aVar.i(-190900235);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarG = h.g(androidx.compose.foundation.a.b(d.a.b, ((qh60) bVarI.O(sh60.a)).L, j060.c(fw20.a(R.dimen._3sdp, bVarI))), fw20.a(R.dimen._7sdp, bVarI), fw20.a(R.dimen._1sdp, bVarI));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = jn5.MISSION.a();
            if (!z) {
                strA = strA + " " + i;
            }
            lkf0.b(strA, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(j58.b, d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L), t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777208), bVarI, 0, 0, 65534);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    fa6.k(i, iA, (a) obj, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final float f, final int i, androidx.compose.runtime.a aVar, final d dVar) {
        b bVarI = aVar.i(20042700);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.c(f) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            float f2 = 0.0f;
            if (f >= 0.0f) {
                f2 = f > 100.0f ? 1.0f : f / 100.0f;
            }
            float fA = fw20.a(R.dimen._50sdp, bVarI);
            d dVarA = ls7.a(j.i(j.g(dVar, 1.0f), fw20.a(R.dimen._5sdp, bVarI)), j060.c(fA));
            qyd0 qyd0Var = sh60.a;
            long j = ((qh60) bVarI.O(qyd0Var)).l;
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarA, j, aVar2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.b(ls7.a(j.g(j.c(d.a.b, 1.0f), f2), j060.c(fA)), ((qh60) bVarI.O(qyd0Var)).k, aVar2), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, i, dVar) { // from class: u96
                public final /* synthetic */ d a;
                public final /* synthetic */ float b;

                {
                    this.a = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fa6.l(this.b, iA, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final String m(String str) throws ParseException {
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        if (date == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        String str2 = simpleDateFormat2.format(date);
        str2.getClass();
        return str2;
    }

    public static final String n(String str, boolean z) {
        str.getClass();
        return z ? new StringBuilder((CharSequence) kotlin.text.c.s(new StringBuilder((CharSequence) str).reverse().toString(), " ", "\n")).reverse().toString() : kotlin.text.c.p(str, " ", "\n", false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:102:0x030a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0315  */
    /* JADX WARN: Code duplicated, block: B:106:0x032f  */
    /* JADX WARN: Code duplicated, block: B:109:0x033a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0367  */
    /* JADX WARN: Code duplicated, block: B:113:0x0384  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x045d  */
    /* JADX WARN: Code duplicated, block: B:129:0x048d  */
    /* JADX WARN: Code duplicated, block: B:130:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:137:0x051e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0522  */
    /* JADX WARN: Code duplicated, block: B:143:0x0543  */
    /* JADX WARN: Code duplicated, block: B:146:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x05df  */
    /* JADX WARN: Code duplicated, block: B:150:0x0621  */
    /* JADX WARN: Code duplicated, block: B:158:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0171  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b A[Catch: Exception -> 0x01a8, TryCatch #1 {Exception -> 0x01a8, blocks: (B:58:0x0191, B:60:0x019b, B:61:0x01a5), top: B:160:0x0191 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5 A[Catch: Exception -> 0x01a8, TRY_LEAVE, TryCatch #1 {Exception -> 0x01a8, blocks: (B:58:0x0191, B:60:0x019b, B:61:0x01a5), top: B:160:0x0191 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x020f  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e A[Catch: Exception -> 0x023b, TryCatch #0 {Exception -> 0x023b, blocks: (B:79:0x0216, B:81:0x021e, B:83:0x023d), top: B:158:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x023d A[Catch: Exception -> 0x023b, TRY_LEAVE, TryCatch #0 {Exception -> 0x023b, blocks: (B:79:0x0216, B:81:0x021e, B:83:0x023d), top: B:158:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0284  */
    /* JADX WARN: Code duplicated, block: B:90:0x0287  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d3  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x02dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0315, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01f5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x021e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0292, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x02b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    public static final void c(final d dVar, final CampaignTierCriteria campaignTierCriteria, final int i, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        b bVar;
        int i3;
        d.a aVar2;
        boolean z3;
        boolean z4;
        int iHashCode;
        Iterator<CampaignTierCriteriaCondition> it;
        b bVar2;
        CampaignTierCriteriaCondition next;
        List list;
        String type;
        String strA;
        List list2;
        d0b.a.c cVar;
        n54.b bVar3;
        kw0.a.C0795a c0795a;
        n54.b bVar4;
        d.a aVar3;
        int iHashCode2;
        tsr.a aVar4;
        yka.a.C1350a c1350a;
        String str;
        int i4;
        d.a aVar5;
        kw0.a.C0795a c0795a2;
        ?? r3;
        n54.b bVar5;
        long j;
        b bVar6;
        boolean z5;
        b bVar7;
        int iHashCode3;
        tsr.a aVar6;
        yka.a.C1350a c1350a2;
        long j2;
        d dVar2 = dVar;
        String str2 = "GAME_SET";
        campaignTierCriteria.getClass();
        b bVarI = aVar.i(-1254427955);
        int i5 = i2 | (bVarI.A(campaignTierCriteria) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            kw0.k kVar = kw0.c;
            n54.a aVar7 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar7, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVar2);
            yka.k.getClass();
            tsr.a aVar8 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar8);
            } else {
                bVarI.p();
            }
            yka.a.b bVar8 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar8);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S) {
                i3 = i5;
            } else {
                i3 = i5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                aVar2 = d.a.b;
                if (z2) {
                    bVarI.N(819262137);
                    ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._8sdp, bVarI)));
                    k(i, (i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, z);
                    ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._2sdp, bVarI)));
                    z3 = false;
                } else {
                    z3 = false;
                    bVarI.N(778370347);
                }
                bVarI.X(z3);
                g(campaignTierCriteria, z2, bVarI, ((i3 >> 3) & 14) | ((i3 >> 9) & 112));
                if (z2) {
                    z4 = false;
                    bVarI.N(778370347);
                } else {
                    bVarI.N(819714272);
                    ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._8sdp, bVarI)));
                    z4 = false;
                }
                bVarI.X(z4);
                d dVarA = j.A(j.g(aVar2, 1.0f), null, 3);
                i78 i78VarA2 = g78.a(new kw0.i(fw20.a(R.dimen._3sdp, bVarI), true, new hw0()), aVar7, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar8);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar8);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a3);
                }
                hlh0.a(bVarI, dVarC2, cVar2);
                bVarI.N(-1846224777);
                it = campaignTierCriteria.getConditions().iterator();
                bVar2 = bVarI;
                while (it.hasNext()) {
                    next = it.next();
                    try {
                        if (Intrinsics.g(next.getType(), str2)) {
                            Object value = next.getValue();
                            value.getClass();
                            list = (List) value;
                        } else {
                            list = m2g.a;
                        }
                    } catch (Exception unused) {
                        list = m2g.a;
                    }
                    next.getClass();
                    type = next.getType();
                    switch (type.hashCode()) {
                        case -1759256277:
                            if (type.equals("TIME_RANGE")) {
                                strA = null;
                            } else {
                                strA = tx5.a(jn5.TIME_RANGE_LABEL.a(), " : ", m(next.getStartTime()), " to ", m(next.getEndTime()));
                            }
                            break;
                        case -1578396356:
                            if (type.equals(YAzniTbXHYQ.fZh)) {
                                strA = null;
                            } else {
                                strA = jn5.FREQUENCY_LABEL.a() + " : " + next.getValue();
                            }
                            break;
                        case -1510536568:
                            if (type.equals("MIN_COEFFICIENT")) {
                                strA = null;
                            } else {
                                strA = jn5.MIN_COEFFICIENT.a() + " : " + jn5.CRASH_OR_CASH_OUT.a() + " " + next.getValue() + "x";
                            }
                            break;
                        case -1374183912:
                            if (type.equals("TOTAL_STAKE_AMOUNT")) {
                                strA = null;
                            } else {
                                strA = jn5.TOTAL_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                            }
                            break;
                        case -1318601270:
                            if (type.equals("MIN_STAKE_AMOUNT")) {
                                strA = null;
                            } else {
                                strA = jn5.MIN_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                            }
                            break;
                        case -985240971:
                            if (!type.equals(str2)) {
                                try {
                                    if (next.getValue() instanceof String) {
                                        Object value2 = next.getValue();
                                        value2.getClass();
                                        list2 = (List) value2;
                                        if (list2.size() == 1) {
                                            try {
                                                jn5.GAME_LABEL.a();
                                                Objects.toString(list2.get(0));
                                            } catch (Exception unused2) {
                                                strA = null;
                                            }
                                        }
                                        strA = jn5.GAME_SET_LABEL.a() + " : " + CollectionsKt.a0(list2, ", ", null, null, null, 62);
                                    } else {
                                        strA = jn5.GAME_LABEL.a() + " : " + next.getValue();
                                    }
                                    break;
                                } catch (Exception unused3) {
                                }
                            }
                            strA = null;
                            break;
                        case -456925987:
                            if (type.equals("STAKE_AMOUNT")) {
                                strA = jn5.TOTAL_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                            }
                            strA = null;
                            break;
                        case 2088903750:
                            if (type.equals("TOTAL_BET_COUNT")) {
                                String strA2 = jn5.TOTAL_BET_COUNT_LABEL.a();
                                Object value3 = next.getValue();
                                value3.getClass();
                                strA = strA2 + " : " + ((int) ((Double) value3).doubleValue());
                            }
                            strA = null;
                            break;
                        default:
                            strA = null;
                            break;
                    }
                    cVar = d0b.a.c;
                    bVar3 = ht.a.j;
                    c0795a = kw0.a.a;
                    bVar4 = ht.a.k;
                    aVar3 = aVar2;
                    if (strA == null) {
                        bVar2.N(-1398051184);
                        r3 = 0;
                        bVar2.X(false);
                        bVar5 = bVar3;
                        c0795a2 = c0795a;
                        aVar5 = aVar3;
                        i4 = R.dimen._2sdp;
                        z5 = true;
                        bVar7 = bVar2;
                    } else {
                        bVar2.N(-1398051183);
                        d dVarG = j.g(dVar2, 1.0f);
                        d160 d160VarA = b160.a(c0795a, bVar4, bVar2, 54);
                        iHashCode2 = Long.hashCode(bVar2.T);
                        ne00 ne00VarS3 = bVar2.S();
                        d dVarC3 = androidx.compose.ui.c.c(bVar2, dVarG);
                        yka.k.getClass();
                        aVar4 = yka.a.b;
                        bVar2.D();
                        if (bVar2.S) {
                            bVar2.F(aVar4);
                        } else {
                            bVar2.p();
                        }
                        hlh0.a(bVar2, d160VarA, yka.a.f);
                        hlh0.a(bVar2, ne00VarS3, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar2, dVarC3, yka.a.d);
                        d dVarN = j.i(h.j(aVar3, 0.0f, fw20.a(R.dimen._3sdp, bVar2), fw20.a(R.dimen._2sdp, bVar2), 0.0f, 9), fw20.a(R.dimen._5sdp, bVar2)).n(new VerticalAlignElement(bVar3));
                        crz crzVarA = erz.a(R.drawable.campaign_criteria_conditions_arrow, 0, bVar2);
                        str = strA;
                        i4 = R.dimen._2sdp;
                        aVar5 = aVar3;
                        c0795a2 = c0795a;
                        r3 = 0;
                        bVar5 = bVar3;
                        h9n.a(crzVarA, "Arrow", dVarN, null, cVar, 0.0f, null, bVar2, 24624, 104);
                        ty0.a(bVar2, j.w(aVar5, fw20.a(i4, bVar2)));
                        if (!list.isEmpty() || z2) {
                            bVar2.N(194993491);
                            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(bVar5);
                            t9i t9iVar = t9i.E;
                            long jG = d2l.g(fw20.a(R.dimen._8ssp, bVar2), 4294967296L);
                            long jG2 = d2l.g(fw20.a(R.dimen._11ssp, bVar2), 4294967296L);
                            long jF = d2l.f(0);
                            if (z2) {
                                bVar2.N(195555707);
                                j = ((qh60) bVar2.O(sh60.a)).y;
                                bVar2.X(false);
                            } else {
                                bVar2.N(195424515);
                                j = ((qh60) bVar2.O(sh60.a)).x;
                                bVar2.X(false);
                            }
                            b bVar9 = bVar2;
                            lkf0.b(str, verticalAlignElement, j, jG, null, t9iVar, null, jF, null, jG2, 0, false, 0, 0, null, null, bVar9, 12779520, 0, 129872);
                            b bVar10 = bVar9;
                            bVar10.X(false);
                            bVar6 = bVar10;
                        } else {
                            bVar2.N(194782691);
                            h(0, bVar2, null, list, null);
                            bVar2.X(false);
                            bVar6 = bVar2;
                        }
                        z5 = true;
                        bVar6.X(true);
                        Unit unit = Unit.a;
                        bVar6.X(false);
                        bVar7 = bVar6;
                    }
                    if (Intrinsics.g(campaignTierCriteria.getType(), "BET_WIN_CONSECUTIVE")) {
                        bVar7.N(-1395965782);
                        d dVarG2 = j.g(dVar, 1.0f);
                        d160 d160VarA2 = b160.a(c0795a2, bVar4, bVar7, 54);
                        iHashCode3 = Long.hashCode(bVar7.T);
                        ne00 ne00VarS4 = bVar7.S();
                        d dVarC4 = androidx.compose.ui.c.c(bVar7, dVarG2);
                        yka.k.getClass();
                        aVar6 = yka.a.b;
                        bVar7.D();
                        if (bVar7.S) {
                            bVar7.F(aVar6);
                        } else {
                            bVar7.p();
                        }
                        hlh0.a(bVar7, d160VarA2, yka.a.f);
                        hlh0.a(bVar7, ne00VarS4, yka.a.e);
                        c1350a2 = yka.a.g;
                        if (bVar7.S || !Intrinsics.g(bVar7.y(), Integer.valueOf(iHashCode3))) {
                            n30.a(iHashCode3, bVar7, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar7, dVarC4, yka.a.d);
                        d.a aVar9 = aVar5;
                        aVar5 = aVar9;
                        h9n.a(erz.a(R.drawable.campaign_criteria_conditions_arrow, r3, bVar7), "Arrow", j.i(h.j(aVar9, 0.0f, fw20.a(R.dimen._3sdp, bVar7), fw20.a(i4, bVar7), 0.0f, 9), fw20.a(R.dimen._5sdp, bVar7)).n(new VerticalAlignElement(bVar5)), null, cVar, 0.0f, null, bVar7, 24624, 104);
                        ty0.a(bVar7, j.w(aVar5, fw20.a(i4, bVar7)));
                        VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement(bVar5);
                        String strA3 = jn5.CRASH_GAMES_DISCLAIMER.a();
                        t9i t9iVar2 = t9i.E;
                        long jG3 = d2l.g(fw20.a(R.dimen._8ssp, bVar7), 4294967296L);
                        long jG4 = d2l.g(fw20.a(R.dimen._11ssp, bVar7), 4294967296L);
                        long jF2 = d2l.f(r3);
                        if (z2) {
                            bVar7.N(-177381596);
                            j2 = ((qh60) bVar7.O(sh60.a)).y;
                            bVar7.X(r3);
                        } else {
                            bVar7.N(-177504852);
                            j2 = ((qh60) bVar7.O(sh60.a)).x;
                            bVar7.X(r3);
                        }
                        b bVar11 = bVar7;
                        lkf0.b(strA3, verticalAlignElement2, j2, jG3, null, t9iVar2, null, jF2, null, jG4, 0, false, 0, 0, null, null, bVar11, 12779520, 0, 129872);
                        bVar7 = bVar11;
                        bVar7.X(z5);
                    } else {
                        bVar7.N(-1440188863);
                    }
                    bVar7.X(r3);
                    dVar2 = dVar;
                    aVar2 = aVar5;
                    str2 = str2;
                    it = it;
                    bVar2 = bVar7;
                }
                f30.a(bVar2, false, true, true);
                bVar = bVar2;
            }
            n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            aVar2 = d.a.b;
            if (z2) {
                bVarI.N(819262137);
                ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._8sdp, bVarI)));
                k(i, (i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, z);
                ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._2sdp, bVarI)));
                z3 = false;
            } else {
                z3 = false;
                bVarI.N(778370347);
            }
            bVarI.X(z3);
            g(campaignTierCriteria, z2, bVarI, ((i3 >> 3) & 14) | ((i3 >> 9) & 112));
            if (z2) {
                bVarI.N(819714272);
                ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._8sdp, bVarI)));
                z4 = false;
            } else {
                z4 = false;
                bVarI.N(778370347);
            }
            bVarI.X(z4);
            d dVarA2 = j.A(j.g(aVar2, 1.0f), null, 3);
            i78 i78VarA3 = g78.a(new kw0.i(fw20.a(R.dimen._3sdp, bVarI), true, new hw0()), aVar7, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar8);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar8);
            hlh0.a(bVarI, ne00VarS5, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            hlh0.a(bVarI, dVarC5, cVar3);
            bVarI.N(-1846224777);
            it = campaignTierCriteria.getConditions().iterator();
            bVar2 = bVarI;
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.g(next.getType(), str2)) {
                    Object value4 = next.getValue();
                    value4.getClass();
                    list = (List) value4;
                } else {
                    list = m2g.a;
                }
                next.getClass();
                type = next.getType();
                switch (type.hashCode()) {
                    case -1759256277:
                        if (type.equals("TIME_RANGE")) {
                            strA = tx5.a(jn5.TIME_RANGE_LABEL.a(), " : ", m(next.getStartTime()), " to ", m(next.getEndTime()));
                        } else {
                            strA = null;
                        }
                        break;
                    case -1578396356:
                        if (type.equals(YAzniTbXHYQ.fZh)) {
                            strA = jn5.FREQUENCY_LABEL.a() + " : " + next.getValue();
                        } else {
                            strA = null;
                        }
                        break;
                    case -1510536568:
                        if (type.equals("MIN_COEFFICIENT")) {
                            strA = jn5.MIN_COEFFICIENT.a() + " : " + jn5.CRASH_OR_CASH_OUT.a() + " " + next.getValue() + "x";
                        } else {
                            strA = null;
                        }
                        break;
                    case -1374183912:
                        if (type.equals("TOTAL_STAKE_AMOUNT")) {
                            strA = jn5.TOTAL_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                        } else {
                            strA = null;
                        }
                        break;
                    case -1318601270:
                        if (type.equals("MIN_STAKE_AMOUNT")) {
                            strA = jn5.MIN_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                        } else {
                            strA = null;
                        }
                        break;
                    case -985240971:
                        if (!type.equals(str2)) {
                            if (next.getValue() instanceof String) {
                                Object value5 = next.getValue();
                                value5.getClass();
                                list2 = (List) value5;
                                if (list2.size() == 1) {
                                    jn5.GAME_LABEL.a();
                                    Objects.toString(list2.get(0));
                                }
                                strA = jn5.GAME_SET_LABEL.a() + " : " + CollectionsKt.a0(list2, ", ", null, null, null, 62);
                            } else {
                                strA = jn5.GAME_LABEL.a() + " : " + next.getValue();
                            }
                            break;
                        }
                        strA = null;
                        break;
                    case -456925987:
                        if (type.equals("STAKE_AMOUNT")) {
                            strA = jn5.TOTAL_STAKE_AMOUNT_LABEL.a() + " : " + next.getValue();
                        }
                        strA = null;
                        break;
                    case 2088903750:
                        if (type.equals("TOTAL_BET_COUNT")) {
                            String strA4 = jn5.TOTAL_BET_COUNT_LABEL.a();
                            Object value6 = next.getValue();
                            value6.getClass();
                            strA = strA4 + " : " + ((int) ((Double) value6).doubleValue());
                        }
                        strA = null;
                        break;
                    default:
                        strA = null;
                        break;
                }
                cVar = d0b.a.c;
                bVar3 = ht.a.j;
                c0795a = kw0.a.a;
                bVar4 = ht.a.k;
                aVar3 = aVar2;
                if (strA == null) {
                    bVar2.N(-1398051184);
                    r3 = 0;
                    bVar2.X(false);
                    bVar5 = bVar3;
                    c0795a2 = c0795a;
                    aVar5 = aVar3;
                    i4 = R.dimen._2sdp;
                    z5 = true;
                    bVar7 = bVar2;
                } else {
                    bVar2.N(-1398051183);
                    d dVarG3 = j.g(dVar2, 1.0f);
                    d160 d160VarA3 = b160.a(c0795a, bVar4, bVar2, 54);
                    iHashCode2 = Long.hashCode(bVar2.T);
                    ne00 ne00VarS6 = bVar2.S();
                    d dVarC6 = androidx.compose.ui.c.c(bVar2, dVarG3);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVar2.D();
                    if (bVar2.S) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, d160VarA3, yka.a.f);
                    hlh0.a(bVar2, ne00VarS6, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVar2.S) {
                        n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar2, dVarC6, yka.a.d);
                    d dVarN2 = j.i(h.j(aVar3, 0.0f, fw20.a(R.dimen._3sdp, bVar2), fw20.a(R.dimen._2sdp, bVar2), 0.0f, 9), fw20.a(R.dimen._5sdp, bVar2)).n(new VerticalAlignElement(bVar3));
                    crz crzVarA2 = erz.a(R.drawable.campaign_criteria_conditions_arrow, 0, bVar2);
                    str = strA;
                    i4 = R.dimen._2sdp;
                    aVar5 = aVar3;
                    c0795a2 = c0795a;
                    r3 = 0;
                    bVar5 = bVar3;
                    h9n.a(crzVarA2, "Arrow", dVarN2, null, cVar, 0.0f, null, bVar2, 24624, 104);
                    ty0.a(bVar2, j.w(aVar5, fw20.a(i4, bVar2)));
                    if (list.isEmpty()) {
                        bVar2.N(194993491);
                        VerticalAlignElement verticalAlignElement3 = new VerticalAlignElement(bVar5);
                        t9i t9iVar3 = t9i.E;
                        long jG5 = d2l.g(fw20.a(R.dimen._8ssp, bVar2), 4294967296L);
                        long jG6 = d2l.g(fw20.a(R.dimen._11ssp, bVar2), 4294967296L);
                        long jF3 = d2l.f(0);
                        if (z2) {
                            bVar2.N(195424515);
                            j = ((qh60) bVar2.O(sh60.a)).x;
                            bVar2.X(false);
                        } else {
                            bVar2.N(195555707);
                            j = ((qh60) bVar2.O(sh60.a)).y;
                            bVar2.X(false);
                        }
                        b bVar12 = bVar2;
                        lkf0.b(str, verticalAlignElement3, j, jG5, null, t9iVar3, null, jF3, null, jG6, 0, false, 0, 0, null, null, bVar12, 12779520, 0, 129872);
                        b bVar13 = bVar12;
                        bVar13.X(false);
                        bVar6 = bVar13;
                    } else {
                        bVar2.N(194993491);
                        VerticalAlignElement verticalAlignElement4 = new VerticalAlignElement(bVar5);
                        t9i t9iVar4 = t9i.E;
                        long jG7 = d2l.g(fw20.a(R.dimen._8ssp, bVar2), 4294967296L);
                        long jG8 = d2l.g(fw20.a(R.dimen._11ssp, bVar2), 4294967296L);
                        long jF4 = d2l.f(0);
                        if (z2) {
                            bVar2.N(195424515);
                            j = ((qh60) bVar2.O(sh60.a)).x;
                            bVar2.X(false);
                        } else {
                            bVar2.N(195555707);
                            j = ((qh60) bVar2.O(sh60.a)).y;
                            bVar2.X(false);
                        }
                        b bVar14 = bVar2;
                        lkf0.b(str, verticalAlignElement4, j, jG7, null, t9iVar4, null, jF4, null, jG8, 0, false, 0, 0, null, null, bVar14, 12779520, 0, 129872);
                        b bVar15 = bVar14;
                        bVar15.X(false);
                        bVar6 = bVar15;
                    }
                    z5 = true;
                    bVar6.X(true);
                    Unit unit2 = Unit.a;
                    bVar6.X(false);
                    bVar7 = bVar6;
                }
                if (Intrinsics.g(campaignTierCriteria.getType(), "BET_WIN_CONSECUTIVE")) {
                    bVar7.N(-1395965782);
                    d dVarG4 = j.g(dVar, 1.0f);
                    d160 d160VarA4 = b160.a(c0795a2, bVar4, bVar7, 54);
                    iHashCode3 = Long.hashCode(bVar7.T);
                    ne00 ne00VarS7 = bVar7.S();
                    d dVarC7 = androidx.compose.ui.c.c(bVar7, dVarG4);
                    yka.k.getClass();
                    aVar6 = yka.a.b;
                    bVar7.D();
                    if (bVar7.S) {
                        bVar7.F(aVar6);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, d160VarA4, yka.a.f);
                    hlh0.a(bVar7, ne00VarS7, yka.a.e);
                    c1350a2 = yka.a.g;
                    if (bVar7.S) {
                        n30.a(iHashCode3, bVar7, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar7, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar7, dVarC7, yka.a.d);
                    d.a aVar10 = aVar5;
                    aVar5 = aVar10;
                    h9n.a(erz.a(R.drawable.campaign_criteria_conditions_arrow, r3, bVar7), "Arrow", j.i(h.j(aVar10, 0.0f, fw20.a(R.dimen._3sdp, bVar7), fw20.a(i4, bVar7), 0.0f, 9), fw20.a(R.dimen._5sdp, bVar7)).n(new VerticalAlignElement(bVar5)), null, cVar, 0.0f, null, bVar7, 24624, 104);
                    ty0.a(bVar7, j.w(aVar5, fw20.a(i4, bVar7)));
                    VerticalAlignElement verticalAlignElement5 = new VerticalAlignElement(bVar5);
                    String strA5 = jn5.CRASH_GAMES_DISCLAIMER.a();
                    t9i t9iVar5 = t9i.E;
                    long jG9 = d2l.g(fw20.a(R.dimen._8ssp, bVar7), 4294967296L);
                    long jG10 = d2l.g(fw20.a(R.dimen._11ssp, bVar7), 4294967296L);
                    long jF5 = d2l.f(r3);
                    if (z2) {
                        bVar7.N(-177504852);
                        j2 = ((qh60) bVar7.O(sh60.a)).x;
                        bVar7.X(r3);
                    } else {
                        bVar7.N(-177381596);
                        j2 = ((qh60) bVar7.O(sh60.a)).y;
                        bVar7.X(r3);
                    }
                    b bVar16 = bVar7;
                    lkf0.b(strA5, verticalAlignElement5, j2, jG9, null, t9iVar5, null, jF5, null, jG10, 0, false, 0, 0, null, null, bVar16, 12779520, 0, 129872);
                    bVar7 = bVar16;
                    bVar7.X(z5);
                } else {
                    bVar7.N(-1440188863);
                }
                bVar7.X(r3);
                dVar2 = dVar;
                aVar2 = aVar5;
                str2 = str2;
                it = it;
                bVar2 = bVar7;
            }
            f30.a(bVar2, false, true, true);
            bVar = bVar2;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(campaignTierCriteria, i, z, z2, i2) { // from class: t96
                public final /* synthetic */ CampaignTierCriteria b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    fa6.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final CampaignTierCriteria campaignTierCriteria, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        jn5 jn5Var;
        int i3;
        campaignTierCriteria.getClass();
        b bVarI = aVar.i(-453955313);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(campaignTierCriteria) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = androidx.compose.ui.c.c(bVarI, aVar2);
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
            String title = campaignTierCriteria.getTitle();
            title.getClass();
            if (ogx.a("^[A-Z]{3}\\s\\d+(?:\\.\\d+)?/\\d+(?:\\.\\d+)?\\sstake placed$", title)) {
                jn5Var = jn5.STAKE_AMOUNT_TITLE;
            } else if (ogx.a("^\\d+/\\d+\\s.*in a row$", title)) {
                jn5Var = jn5.BET_WIN_CONSECUTIVE_TITLE;
            } else if (ogx.a("^\\d+(?:\\.\\d+)?/\\d+(?:\\.\\d+)?\\s.+\\scompleted$", title)) {
                jn5Var = jn5.STREAK_BET_COUNT_TITLE;
            } else if (ogx.a("^\\d+/\\d+\\s.*won$", title)) {
                jn5Var = jn5.BET_WIN_CUMULATIVE_TITLE;
            } else {
                jn5Var = ogx.a("^\\d+/\\d+\\s.*placed$", title) ? jn5.BET_COUNT_TITLE : null;
            }
            if (jn5Var != null) {
                String strA = jn5Var.a();
                try {
                    int iOrdinal = jn5Var.ordinal();
                    String str = qUnCRF.WoOGHRuQ;
                    switch (iOrdinal) {
                        case 58:
                        case 60:
                        case 63:
                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.split$default(title, new String[]{str}, false, 0, 6, null).get(0), new String[]{"/"}, false, 0, 6, null);
                            title = kotlin.text.c.p(kotlin.text.c.p(strA, "{currentBetCount}", (String) listSplit$default.get(0), false), "{totalBetCount}", (String) listSplit$default.get(1), false);
                            break;
                        case 59:
                            String str2 = (String) StringsKt__StringsKt.split$default(title, new String[]{str}, false, 0, 6, null).get(0);
                            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.split$default(title, new String[]{str}, false, 0, 6, null).get(1), new String[]{"/"}, false, 0, 6, null);
                            title = kotlin.text.c.p(kotlin.text.c.p(kotlin.text.c.p(strA, "{currency}", str2, false), "{currentStakeAmount}", (String) listSplit$default2.get(0), false), "{totalStakeAmount}", (String) listSplit$default2.get(1), false);
                            break;
                        case 61:
                        case 62:
                            List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.split$default(title, new String[]{str}, false, 0, 6, null).get(0), new String[]{"/"}, false, 0, 6, null);
                            String str3 = (String) listSplit$default3.get(0);
                            title = kotlin.text.c.p(kotlin.text.c.p(kotlin.text.c.p(strA, "{currentStreakCount}", str3, false), "{totalStreakCount}", (String) listSplit$default3.get(1), false), "{streakUnit}", (String) StringsKt__StringsKt.split$default(title, new String[]{str}, false, 0, 6, null).get(1), false);
                            break;
                    }
                } catch (Exception unused) {
                }
            }
            if (z) {
                bVarI.N(-1249642825);
                i3 = R.dimen._11ssp;
            } else {
                bVarI.N(-1249642057);
                i3 = R.dimen._13ssp;
            }
            long jB = ash0.b(i3, 48, bVarI);
            bVarI.X(false);
            lkf0.b(title, null, ((qh60) bVarI.O(sh60.a)).D, jB, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196608, 0, 131026);
            bVar = bVarI;
            if (z) {
                bVar.N(-132899907);
            } else {
                bVar.N(-84009776);
                ty0.a(bVar, j.i(aVar2, fw20.a(R.dimen._6sdp, bVar)));
                l(campaignTierCriteria.getProgress(), 0, bVar, ls7.a(j.i(j.g(aVar2, 1.0f), fw20.a(R.dimen._6sdp, bVar)), j060.c(fw20.a(R.dimen._10sdp, bVar))));
            }
            bVar.X(false);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    fa6.g(campaignTierCriteria, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
