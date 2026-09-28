package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.ComposeCashOutModel;
import com.sportygames.commons.models.ComposeCoeffModel;
import com.sportygames.commons.models.UserPlayInfo;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.tournament.model.LeaderboardRecord;
import com.sportygames.commons.tournament.model.TopRankPoint;
import com.sportygames.commons.tournament.model.TournamentRankListResponse;
import com.sportygames.commons.tournament.model.TournamentRankResponse;
import com.sportygames.commons.tournament.model.TournamentStatsData;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class hfg0 {

    @c0d(c = "com.sportygames.commons.tournament.compose.TournamentStatsUiKt$ScoreText$1$1", f = "TournamentStatsUi.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ytw<Double> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ytw ytwVar, String str) {
            super(2, v1bVar);
            this.a = str;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ytw<Double> ytwVar;
            Double value;
            String string;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Double dH = null;
            String str = this.a;
            if (str != null && (string = StringsKt.t0(str).toString()) != null) {
                if (string.length() <= 0 || string.equals("null") || string.equals("--")) {
                    string = null;
                }
                if (string != null) {
                    dH = kotlin.text.b.h(c.p(string, ",", "", false));
                }
            }
            if (dH != null && ((value = (ytwVar = this.b).getValue()) == null || dH.doubleValue() >= value.doubleValue())) {
                ytwVar.setValue(dH);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final d dVar, final zzr zzrVar, final boolean z, final boolean z2, final TournamentStatsData tournamentStatsData, final LoadingState loadingState, final String str, final String str2, final String str3, final String str4, final boolean z3, final wdg0 wdg0Var, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        float f;
        float f2;
        androidx.compose.runtime.b bVar2;
        zzrVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-736177466);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(zzrVar) ? 32 : 16) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.A(tournamentStatsData) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(loadingState) ? 131072 : 65536) | (bVarI.M(str) ? 1048576 : 524288) | (bVarI.M(str2) ? 8388608 : 4194304) | (bVarI.M(str3) ? 67108864 : 33554432) | (bVarI.M(str4) ? 536870912 : 268435456);
        int i3 = (bVarI.b(z3) ? (char) 4 : (char) 2) | (bVarI.A(wdg0Var) ? ' ' : (char) 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, ((i2 & 306783251) == 306783250 && (i3 & 147) == 146) ? false : true)) {
            d dVarG = j.g(dVar, 1.0f);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z2) {
                bVarI.N(1203080250);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.46f;
            } else {
                bVarI.N(1203078394);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.42f;
            }
            float f3 = f * f2;
            bVarI.X(false);
            d dVarI = j.i(dVarG, f3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), a6g0.b, zk40.a), 4.0f, 4.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String endDate = tournamentStatsData.getEndDate();
            String upperCase = pm5.ENDS_IN.a().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            vv60.a(endDate, upperCase, j58.c(0.8f, j58.f), d2l.g(fw20.a(R.dimen._9ssp, bVarI), 4294967296L), bVarI, 384);
            bVarI.X(true);
            d dVarA = zqu.a(1.0f, h.h(j.g(aVar3, 1.0f), fw20.a(R.dimen._9sdp, bVarI), 0.0f, 2), true);
            umz umzVarB = h.b(0.0f, 0.0f, 0.0f, fw20.a(R.dimen._6sdp, bVarI), 7);
            boolean zA = bVarI.A(loadingState) | ((i3 & 14) == 4) | ((i2 & 3670016) == 1048576) | bVarI.A(tournamentStatsData) | ((i2 & 29360128) == 8388608) | ((i2 & 234881024) == 67108864) | ((i2 & 1879048192) == 536870912) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                bVar2 = bVarI;
                Function1 function1 = new Function1() { // from class: veg0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List<LeaderboardRecord> leaderboardRecords;
                        HTTPResponse hTTPResponse;
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        LoadingState loadingState2 = loadingState;
                        Status status = loadingState2 != null ? loadingState2.getStatus() : null;
                        int i4 = status == null ? -1 : hfg0.b.a[status.ordinal()];
                        if (i4 == 1) {
                            szr.h(szrVar, null, cy9.b, 3);
                        } else if (i4 == 2) {
                            final TournamentRankListResponse tournamentRankListResponse = (loadingState2 == null || (hTTPResponse = (HTTPResponse) loadingState2.getData()) == null) ? null : (TournamentRankListResponse) hTTPResponse.getData();
                            List<LeaderboardRecord> leaderboardRecords2 = tournamentRankListResponse != null ? tournamentRankListResponse.getLeaderboardRecords() : null;
                            if (leaderboardRecords2 != null && !leaderboardRecords2.isEmpty()) {
                                final String str5 = str;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final String str6 = str2;
                                final String str7 = str3;
                                final String str8 = str4;
                                szr.h(szrVar, null, new op8(-1921712522, new gaj() { // from class: hdg0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        d.a aVar4;
                                        a aVar5 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((gwr) obj2).getClass();
                                        if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            d.a aVar6 = d.a.b;
                                            by9.a(R.dimen._9sdp, aVar5, aVar6, aVar5);
                                            TournamentRankListResponse tournamentRankListResponse2 = tournamentRankListResponse;
                                            List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse2 != null ? tournamentRankListResponse2.getLeaderboardRecords() : null;
                                            boolean z4 = leaderboardRecords3 == null || leaderboardRecords3.isEmpty();
                                            String str9 = str5;
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            if (str9 == null || str9.length() == 0 || str9.equals("--") || str9.equals("0")) {
                                                aVar5.N(2126007468);
                                            } else {
                                                aVar5.N(-2118363922);
                                                String string = str8;
                                                if (!Intrinsics.g(string, "--") && !Intrinsics.g(string, "")) {
                                                    TreeMap treeMap = pw.a;
                                                    string = pw.c(string).toString();
                                                }
                                                hfg0.h(tournamentStatsData3, str9, str6, str7, string, aVar5, 0);
                                                ty0.a(aVar5, j.i(aVar6, fw20.a(R.dimen._9sdp, aVar5)));
                                            }
                                            aVar5.H();
                                            if (z4) {
                                                aVar4 = aVar6;
                                                aVar5.N(2126007468);
                                            } else {
                                                aVar5.N(-2117689145);
                                                d dVarG3 = h.g(j.g(aVar6, 1.0f), fw20.a(R.dimen._9sdp, aVar5), 4.0f);
                                                d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, 6);
                                                int iHashCode3 = Long.hashCode(aVar5.m());
                                                ne00 ne00VarO = aVar5.o();
                                                d dVarC3 = androidx.compose.ui.c.c(aVar5, dVarG3);
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
                                                yka.a.b bVar4 = yka.a.f;
                                                hlh0.a(aVar5, d160VarA, bVar4);
                                                yka.a.d dVar3 = yka.a.e;
                                                hlh0.a(aVar5, ne00VarO, dVar3);
                                                yka.a.C1350a c1350a2 = yka.a.g;
                                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                                    j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar5, dVarC3, cVar2);
                                                String strA = pm5.RANK.a();
                                                Locale locale = Locale.ROOT;
                                                String upperCase2 = strA.toUpperCase(locale);
                                                upperCase2.getClass();
                                                long j = a6g0.e;
                                                qyd0 qyd0Var = ni60.b;
                                                lkf0.b(upperCase2, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                ty0.a(aVar5, j.w(aVar6, fw20.a(R.dimen._36sdp, aVar5)));
                                                String upperCase3 = pm5.PLAYER_OR_POINTS.a().toUpperCase(locale);
                                                upperCase3.getClass();
                                                lkf0.b(upperCase3, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                                d160 d160VarA2 = b160.a(kw0.b, ht.a.k, aVar5, 54);
                                                int iHashCode4 = Long.hashCode(aVar5.m());
                                                ne00 ne00VarO2 = aVar5.o();
                                                d dVarC4 = androidx.compose.ui.c.c(aVar5, layoutWeightElement);
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
                                                hlh0.a(aVar5, d160VarA2, bVar4);
                                                hlh0.a(aVar5, ne00VarO2, dVar3);
                                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                                                }
                                                hlh0.a(aVar5, dVarC4, cVar2);
                                                String upperCase4 = pm5.PRIZE.a().toUpperCase(locale);
                                                upperCase4.getClass();
                                                lkf0.b(upperCase4, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                ty0.a(aVar5, j.w(aVar6, 2.0f));
                                                String upperCase5 = tournamentStatsData3.getCurrency().toUpperCase(locale);
                                                upperCase5.getClass();
                                                aVar4 = aVar6;
                                                lkf0.b(tug.a("(IN ", upperCase5, ")"), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).h, R.dimen._7ssp, aVar5), aVar5, 384, 0, 65530);
                                                aVar5 = aVar5;
                                                aVar5.s();
                                                aVar5.s();
                                            }
                                            aVar5.H();
                                            by9.a(R.dimen._1sdp, aVar5, aVar4, aVar5);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 3);
                                if (tournamentRankListResponse != null && (leaderboardRecords = tournamentRankListResponse.getLeaderboardRecords()) != null && !leaderboardRecords.isEmpty()) {
                                    int size = tournamentRankListResponse.getLeaderboardRecords().size();
                                    for (final int i5 = 0; i5 < size; i5++) {
                                        szr.h(szrVar, null, new op8(-1054941180, new gaj() { // from class: jdg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                String str9;
                                                Double prize;
                                                Double score;
                                                Integer rank;
                                                a aVar4 = (a) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((gwr) obj2).getClass();
                                                if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    TournamentRankListResponse tournamentRankListResponse2 = tournamentRankListResponse;
                                                    List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse2.getLeaderboardRecords();
                                                    int i6 = i5;
                                                    LeaderboardRecord leaderboardRecord = leaderboardRecords3.get(i6);
                                                    String strValueOf = (leaderboardRecord == null || (rank = leaderboardRecord.getRank()) == null) ? null : String.valueOf(rank.intValue());
                                                    if (strValueOf == null) {
                                                        strValueOf = "";
                                                    }
                                                    LeaderboardRecord leaderboardRecord2 = tournamentRankListResponse2.getLeaderboardRecords().get(i6);
                                                    String nickName = leaderboardRecord2 != null ? leaderboardRecord2.getNickName() : null;
                                                    if (nickName == null) {
                                                        nickName = "";
                                                    }
                                                    LeaderboardRecord leaderboardRecord3 = tournamentRankListResponse2.getLeaderboardRecords().get(i6);
                                                    String avatarURL = leaderboardRecord3 != null ? leaderboardRecord3.getAvatarURL() : null;
                                                    if (avatarURL == null) {
                                                        avatarURL = "";
                                                    }
                                                    TreeMap treeMap = pw.a;
                                                    LeaderboardRecord leaderboardRecord4 = tournamentRankListResponse2.getLeaderboardRecords().get(i6);
                                                    String str10 = siPCzPFw.bDhSsU;
                                                    if (leaderboardRecord4 == null || (score = leaderboardRecord4.getScore()) == null) {
                                                        str9 = null;
                                                    } else {
                                                        try {
                                                            str9 = new DecimalFormat(str10, SportyGamesManager.decimalFormatSymbols).format(score.doubleValue());
                                                            str9.getClass();
                                                        } catch (Exception unused) {
                                                            str9 = str10;
                                                        }
                                                    }
                                                    String strC = pw.c(String.valueOf(str9));
                                                    LeaderboardRecord leaderboardRecord5 = tournamentRankListResponse2.getLeaderboardRecords().get(i6);
                                                    if (leaderboardRecord5 != null && (prize = leaderboardRecord5.getPrize()) != null) {
                                                        try {
                                                            String str11 = new DecimalFormat(str10, SportyGamesManager.decimalFormatSymbols).format(prize.doubleValue());
                                                            str11.getClass();
                                                            str10 = str11;
                                                        } catch (Exception unused2) {
                                                        }
                                                    }
                                                    LeaderboardRecord leaderboardRecord6 = tournamentRankListResponse2.getLeaderboardRecords().get(i6);
                                                    String patronId = leaderboardRecord6 != null ? leaderboardRecord6.getPatronId() : null;
                                                    hfg0.b(strValueOf, nickName, avatarURL, strC, str10, patronId == null ? "" : patronId, aVar4, 0);
                                                    by9.a(R.dimen._4sdp, aVar4, d.a.b, aVar4);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 3);
                                    }
                                    List<TopRankPoint> topRankPoints = tournamentRankListResponse.getTopRankPoints();
                                    if (topRankPoints != null && !topRankPoints.isEmpty()) {
                                        final bq40 bq40Var = new bq40();
                                        final bq40 bq40Var2 = new bq40();
                                        Pair<Integer, Integer> pairL = hfg0.l(11, tournamentRankListResponse.getTopRankPoints());
                                        Integer num = pairL.a;
                                        bq40Var.a = num != null ? num.intValue() : 0;
                                        int iIntValue = pairL.b.intValue();
                                        bq40Var2.a = iIntValue;
                                        int i6 = bq40Var.a;
                                        if (i6 > -1 && iIntValue >= i6) {
                                            szr.h(szrVar, null, cy9.e, 3);
                                            szr.h(szrVar, null, cy9.f, 3);
                                            szr.h(szrVar, null, cy9.g, 3);
                                            szr.h(szrVar, null, new op8(-1386721405, new gaj() { // from class: ldg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    tsr.a aVar4;
                                                    yka.a.C1350a c1350a2;
                                                    a aVar5 = (a) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    ((gwr) obj2).getClass();
                                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        d.a aVar6 = d.a.b;
                                                        d dVarJ = h.j(j.g(aVar6, 1.0f), fw20.a(R.dimen._9sdp, aVar5), 0.0f, 0.0f, 0.0f, 14);
                                                        d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar5, 6);
                                                        int iHashCode3 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO = aVar5.o();
                                                        d dVarC3 = androidx.compose.ui.c.c(aVar5, dVarJ);
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
                                                        yka.a.b bVar4 = yka.a.f;
                                                        hlh0.a(aVar5, d160VarA, bVar4);
                                                        yka.a.d dVar3 = yka.a.e;
                                                        hlh0.a(aVar5, ne00VarO, dVar3);
                                                        yka.a.C1350a c1350a3 = yka.a.g;
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                                            j3c.a(iHashCode3, aVar5, iHashCode3, c1350a3);
                                                        }
                                                        yka.a.c cVar2 = yka.a.d;
                                                        hlh0.a(aVar5, dVarC3, cVar2);
                                                        String strA = pm5.RANK.a();
                                                        Locale locale = Locale.ROOT;
                                                        String upperCase2 = strA.toUpperCase(locale);
                                                        upperCase2.getClass();
                                                        long j = a6g0.e;
                                                        qyd0 qyd0Var = ni60.b;
                                                        lkf0.b(upperCase2, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        kw0.j jVar = kw0.a;
                                                        n54.b bVar5 = ht.a.k;
                                                        d160 d160VarA2 = b160.a(jVar, bVar5, aVar5, 48);
                                                        int iHashCode4 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO2 = aVar5.o();
                                                        d dVarC4 = androidx.compose.ui.c.c(aVar5, aVar6);
                                                        if (aVar5.k() == null) {
                                                            l2a.b();
                                                            throw null;
                                                        }
                                                        aVar5.D();
                                                        if (aVar5.g()) {
                                                            aVar4 = aVar7;
                                                            aVar5.F(aVar4);
                                                        } else {
                                                            aVar4 = aVar7;
                                                            aVar5.p();
                                                        }
                                                        hlh0.a(aVar5, d160VarA2, bVar4);
                                                        hlh0.a(aVar5, ne00VarO2, dVar3);
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                                            c1350a2 = c1350a3;
                                                            j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                                                        } else {
                                                            c1350a2 = c1350a3;
                                                        }
                                                        hlh0.a(aVar5, dVarC4, cVar2);
                                                        String upperCase3 = pm5.POINTS.a().toUpperCase(locale);
                                                        upperCase3.getClass();
                                                        yka.a.C1350a c1350a4 = c1350a2;
                                                        tsr.a aVar8 = aVar4;
                                                        lkf0.b("    ".concat(upperCase3), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        aVar5.s();
                                                        d dVarJ2 = h.j(aVar6, 0.0f, 0.0f, fw20.a(R.dimen._9sdp, aVar5), 0.0f, 11);
                                                        d160 d160VarA3 = b160.a(jVar, bVar5, aVar5, 48);
                                                        int iHashCode5 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO3 = aVar5.o();
                                                        d dVarC5 = androidx.compose.ui.c.c(aVar5, dVarJ2);
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
                                                        hlh0.a(aVar5, d160VarA3, bVar4);
                                                        hlh0.a(aVar5, ne00VarO3, dVar3);
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                                                            j3c.a(iHashCode5, aVar5, iHashCode5, c1350a4);
                                                        }
                                                        hlh0.a(aVar5, dVarC5, cVar2);
                                                        String upperCase4 = pm5.PRIZE.a().toUpperCase(locale);
                                                        upperCase4.getClass();
                                                        lkf0.b(upperCase4, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        ty0.a(aVar5, j.w(aVar6, 2.0f));
                                                        String upperCase5 = tournamentStatsData2.getCurrency().toUpperCase(locale);
                                                        upperCase5.getClass();
                                                        lkf0.b(tug.a("(IN ", upperCase5, ")"), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar5.O(qyd0Var)).h, R.dimen._7ssp, aVar5), aVar5, 384, 0, 65530);
                                                        aVar5.s();
                                                        aVar5.s();
                                                        ty0.a(aVar5, j.i(aVar6, 5.0f));
                                                    } else {
                                                        aVar5.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 3);
                                            final List<TopRankPoint> topRankPoints2 = tournamentRankListResponse.getTopRankPoints();
                                            int size2 = tournamentRankListResponse.getTopRankPoints().size();
                                            final int i7 = 0;
                                            while (i7 < size2) {
                                                final TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                                szr.h(szrVar, null, new op8(1231337031, new gaj() { // from class: ndg0
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        Object next;
                                                        String str9;
                                                        a aVar4 = (a) obj3;
                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                        ((gwr) obj2).getClass();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            int i8 = bq40Var.a;
                                                            int i9 = i7;
                                                            if (i8 > i9 || i9 > bq40Var2.a) {
                                                                aVar4.N(-614888069);
                                                            } else {
                                                                aVar4.N(-554023289);
                                                                TopRankPoint topRankPoint = (TopRankPoint) topRankPoints2.get(i9);
                                                                if (topRankPoint != null) {
                                                                    aVar4.N(-553847550);
                                                                    if (topRankPoint.getStartRank() == null || topRankPoint.getEndRank() == null || topRankPoint.getStartPoints() == null || topRankPoint.getEndPoints() == null) {
                                                                        aVar4.N(-614888069);
                                                                    } else {
                                                                        aVar4.N(-553525615);
                                                                        Integer startRank = topRankPoint.getStartRank();
                                                                        Integer endRank = topRankPoint.getEndRank();
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append(startRank);
                                                                        String str10 = xOgHBQVl.GoHZ;
                                                                        sb.append(str10);
                                                                        sb.append(endRank);
                                                                        String string = sb.toString();
                                                                        TreeMap treeMap = pw.a;
                                                                        String strF = pw.f(krh0.l(topRankPoint.getStartPoints().doubleValue()));
                                                                        String strF2 = pw.f(krh0.l(topRankPoint.getEndPoints().doubleValue()));
                                                                        int iIntValue3 = topRankPoint.getStartRank().intValue();
                                                                        int iIntValue4 = topRankPoint.getEndRank().intValue();
                                                                        List<Pair<String, String>> prizeListMap = tournamentStatsData3.getPrizeListMap();
                                                                        prizeListMap.getClass();
                                                                        IntRange intRange = new IntRange(iIntValue3, iIntValue4, 1);
                                                                        Iterator<T> it = prizeListMap.iterator();
                                                                        while (true) {
                                                                            if (!it.hasNext()) {
                                                                                next = null;
                                                                                break;
                                                                            }
                                                                            next = it.next();
                                                                            String str11 = (String) ((Pair) next).a;
                                                                            List listSplit$default = StringsKt__StringsKt.split$default(str11, new String[]{str10}, false, 0, 6, null);
                                                                            int size3 = listSplit$default.size();
                                                                            int i10 = intRange.b;
                                                                            if (size3 != 2) {
                                                                                Integer intOrNull = StringsKt.toIntOrNull(str11);
                                                                                int iIntValue5 = intOrNull != null ? intOrNull.intValue() : 0;
                                                                                if (iIntValue5 <= i10 && iIntValue3 <= iIntValue5) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                Integer intOrNull2 = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                                                                                int iIntValue6 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                                                                Integer intOrNull3 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
                                                                                int iIntValue7 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                                                                                if (iIntValue6 <= i10 && iIntValue3 <= iIntValue6 && iIntValue7 <= i10 && iIntValue3 <= iIntValue7) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        Pair pair = (Pair) next;
                                                                        if (pair == null || (str9 = (String) pair.b) == null) {
                                                                            str9 = "--";
                                                                        }
                                                                        hfg0.c(string, strF, strF2, str9, aVar4, 0);
                                                                    }
                                                                    aVar4.H();
                                                                } else {
                                                                    aVar4.N(-614888069);
                                                                }
                                                                aVar4.H();
                                                                ty0.a(aVar4, j.i(d.a.b, 6.0f));
                                                            }
                                                            aVar4.H();
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true), 3);
                                                i7++;
                                                tournamentStatsData2 = tournamentStatsData3;
                                            }
                                        }
                                    }
                                    wdg0Var.invoke(tournamentRankListResponse);
                                }
                            } else if (z3) {
                                szr.h(szrVar, null, cy9.d, 3);
                            } else {
                                szr.h(szrVar, null, cy9.c, 3);
                            }
                        } else if (i4 == 3) {
                            final Function0 function2 = function0;
                            szr.h(szrVar, null, new op8(508044699, new gaj() { // from class: pdg0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar4 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        d.a aVar5 = d.a.b;
                                        d dVarJ = h.j(j.e(aVar5, 1.0f), fw20.a(R.dimen._13sdp, aVar4), 70.0f, fw20.a(R.dimen._13sdp, aVar4), 0.0f, 8);
                                        kw0.c cVar2 = kw0.e;
                                        n54.a aVar6 = ht.a.n;
                                        i78 i78VarA2 = g78.a(cVar2, aVar6, aVar4, 54);
                                        int iHashCode3 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO = aVar4.o();
                                        d dVarC3 = androidx.compose.ui.c.c(aVar4, dVarJ);
                                        yka.k.getClass();
                                        tsr.a aVar7 = yka.a.b;
                                        if (aVar4.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar4.D();
                                        if (aVar4.g()) {
                                            aVar4.F(aVar7);
                                        } else {
                                            aVar4.p();
                                        }
                                        yka.a.b bVar4 = yka.a.f;
                                        hlh0.a(aVar4, i78VarA2, bVar4);
                                        yka.a.d dVar3 = yka.a.e;
                                        hlh0.a(aVar4, ne00VarO, dVar3);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                        }
                                        yka.a.c cVar3 = yka.a.d;
                                        hlh0.a(aVar4, dVarC3, cVar3);
                                        h9n.a(erz.a(R.drawable.broken_chip, 0, aVar4), "chip", dw.a(j.t(aVar5, 90.0f, 86.0f), 0.5f), null, null, 0.0f, null, aVar4, 432, 120);
                                        by9.a(R.dimen._5sdp, aVar4, aVar5, aVar4);
                                        String strP = c.p(pm5.SOMETHING_WENT_WRONG.a(), "!", ".\n", false);
                                        long j = a6g0.e;
                                        qyd0 qyd0Var = ni60.b;
                                        lkf0.b(strP, h.h(aVar5, fw20.a(R.dimen._11sdp, aVar4), 0.0f, 2), j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar4.O(qyd0Var)).b, R.dimen._11ssp, aVar4), aVar4, 384, 0, 65016);
                                        d dVarJ2 = h.j(j.A(j.D(aVar5, null, 3), null, 3), 0.0f, fw20.a(R.dimen._10sdp, aVar4), 0.0f, 0.0f, 13);
                                        List listK = b.k(new j58(r58.d(4278880817L)), new j58(r58.d(4278479652L)));
                                        float f4 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                                        d dVarA2 = androidx.compose.foundation.a.a(dVarJ2, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), j060.c(fw20.a(R.dimen._4sdp, aVar4)), 0.0f, 4);
                                        Function0 function3 = function2;
                                        boolean zM = aVar4.M(function3);
                                        Object objY2 = aVar4.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new kk80(1, function3);
                                            aVar4.r(objY2);
                                        }
                                        d dVarA3 = k78.a(aVar6, h.g(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY2, 15), 14.0f, 6.0f));
                                        aiv aivVarC2 = g75.c(ht.a.e, false);
                                        int iHashCode4 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO2 = aVar4.o();
                                        d dVarC4 = androidx.compose.ui.c.c(aVar4, dVarA3);
                                        if (aVar4.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar4.D();
                                        if (aVar4.g()) {
                                            aVar4.F(aVar7);
                                        } else {
                                            aVar4.p();
                                        }
                                        hlh0.a(aVar4, aivVarC2, bVar4);
                                        hlh0.a(aVar4, ne00VarO2, dVar3);
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar4, iHashCode4, c1350a2);
                                        }
                                        hlh0.a(aVar4, dVarC4, cVar3);
                                        lkf0.b(pm5.TRY_AGAIN.a(), null, j58.f, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar4.O(qyd0Var)).b, R.dimen._11ssp, aVar4), aVar4, 384, 0, 65018);
                                        aVar4.s();
                                        aVar4.s();
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(function1);
                objY = function1;
            } else {
                bVar2 = bVarI;
            }
            androidx.compose.runtime.b bVar4 = bVar2;
            aur.a(dVarA, zzrVar, umzVarB, false, null, null, null, false, null, (Function1) objY, bVar4, i2 & 112, 504);
            bVar = bVar4;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(zzrVar, z, z2, tournamentStatsData, loadingState, str, str2, str3, str4, z3, wdg0Var, function0, i) { // from class: xeg0
                public final /* synthetic */ wdg0 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ zzr b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ TournamentStatsData e;
                public final /* synthetic */ LoadingState f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final String str4, String str5, final String str6, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        final String str7 = str5;
        androidx.compose.runtime.b bVarI = aVar.i(1889704819);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.M(str4) ? 2048 : 1024) | (bVarI.M(str7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str6) ? 131072 : 65536);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            List listK = kotlin.collections.b.k(new j58(r58.d(4280953898L)), new j58(r58.d(4279901475L)));
            if (str6.length() <= 0 || !str6.equals(SportyGamesManager.getInstance().getPatronId())) {
                i2 = R.drawable.ic_rank_polygon;
                z = false;
            } else {
                listK = kotlin.collections.b.k(new j58(r58.d(4284370982L)), new j58(r58.d(4281478431L)));
                i2 = R.drawable.ic_rank_polygon_gold;
                z = true;
            }
            d.a aVar2 = d.a.b;
            boolean z2 = z;
            d dVarG = j.g(aVar2, 1.0f);
            List listK2 = kotlin.collections.b.k(new j58(r58.d(4294954815L)), new j58(r58.d(4293647277L)), new j58(r58.d(4294954815L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            List list = listK;
            d dVarJ = h.j(androidx.compose.foundation.a.a(dVarG, new hfs(listK2, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), z2 ? j060.c(10.0f) : j060.d(6.0f, 7.0f, 7.0f, 6.0f), 0.0f, 4), z2 ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = h.g(androidx.compose.foundation.a.a(j.g(aVar2, 1.0f), ya5.a.a(0.0f, 0.0f, 14, list), z2 ? j060.c(10.0f) : j060.c(6.0f), 0.0f, 4).n(z2 ? d35.a(aVar2, 0.5f, r58.d(4293117765L), j060.c(10.0f)) : aVar2), fw20.a(R.dimen._9sdp, bVarI), fw20.a(R.dimen._5sdp, bVarI));
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarR = j.r(aVar2, fw20.a(R.dimen._28sdp, bVarI));
            aiv aivVarC2 = g75.c(ht.a.e, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarR);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h9n.a(erz.a(i2, 0, bVarI), "polygon", j.r(aVar2, fw20.a(R.dimen._24sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            long j = j58.f;
            t9i t9iVar = t9i.E;
            lkf0.b(str, null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i3 & 14) | 196992, 0, 131034);
            bVarI.X(true);
            ty0.a(bVarI, j.w(aVar2, fw20.a(R.dimen._30sdp, bVarI)));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            fn80.a(str3, "Player", ls7.a(j.r(aVar2, fw20.a(R.dimen._12sdp, bVarI)), j060.c(7.0f)), d0b.a.a, null, 0.0f, erz.a(2131232710, 0, bVarI), erz.a(2131232710, 0, bVarI), null, bVarI, ((i3 >> 6) & 14) | 3120, 1648);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            lkf0.b(str6.equals(SportyGamesManager.getInstance().getPatronId()) ? pm5.YOU.a() : str2, null, a6g0.i, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).b, R.dimen._11ssp, bVarI), bVarI, 384, 0, 65530);
            szg.a(bVarI, true, aVar2, 4.0f, bVarI);
            d160 d160VarA3 = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            h9n.a(erz.a(R.drawable.ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar2, fw20.a(R.dimen._11sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            TreeMap treeMap = pw.a;
            String strB = pw.b(c.p(str4, ",", "", false));
            if (strB == null) {
                strB = "--";
            }
            lkf0.b(strB, null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131034);
            bVarI.X(true);
            bVarI.X(true);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            d160 d160VarA4 = b160.a(kw0.b, bVar2, bVarI, 54);
            int iHashCode7 = Long.hashCode(bVarI.T);
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar);
            hlh0.a(bVarI, ne00VarS7, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            }
            hlh0.a(bVarI, dVarC7, cVar);
            str7 = str5;
            lkf0.b(str7.equals("--") ? "--" : pw.c(str7), null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131034);
            bVarI = bVarI;
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            h9n.a(erz.a(R.drawable.ic_leaderboard_money, 0, bVarI), "Money", j.r(aVar2, fw20.a(R.dimen._11sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            f30.a(bVarI, true, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, str4, str7, str6, i) { // from class: udg0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x027f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0498  */
    /* JADX WARN: Code duplicated, block: B:94:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x04be  */
    public static final void c(final String str, final String str2, String str3, String str4, androidx.compose.runtime.a aVar, final int i) {
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        String str5;
        String str6;
        qyd0 qyd0Var;
        String strB;
        String strB2;
        androidx.compose.runtime.b bVar;
        int iHashCode;
        String strC;
        String strC2;
        String str7 = str3;
        String str8 = str4;
        androidx.compose.runtime.b bVarI = aVar.i(1950372860);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str7) ? 256 : 128) | (bVarI.M(str8) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            List listK = kotlin.collections.b.k(new j58(r58.d(4280953898L)), new j58(r58.d(4279901475L)));
            d.a aVar3 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), a6g0.a, j060.d(6.0f, 7.0f, 7.0f, 6.0f)), 1.0f, 0.0f, 0.0f, 0.0f, 14);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = h.g(androidx.compose.foundation.a.a(j.g(aVar3, 1.0f), ya5.a.a(0.0f, 0.0f, 14, listK), j060.c(6.0f), 0.0f, 4), fw20.a(R.dimen._9sdp, bVarI), fw20.a(R.dimen._8sdp, bVarI));
            kw0.g gVar = kw0.g;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar3, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            aiv aivVarC2 = g75.c(ht.a.d, false);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            long j = j58.f;
            qyd0 qyd0Var2 = ni60.b;
            lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, k(str, ((sfd0) bVarI.O(qyd0Var2)).b, bVarI), bVarI, (i2 & 14) | 384, 0, 65530);
            long j2 = j;
            bVarI.X(true);
            d160 d160VarA2 = b160.a(kw0.a, bVar3, bVarI, 48);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                c1350a = c1350a2;
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC4, cVar);
            if (str2.equals("0")) {
                str5 = str3;
                if (str5.equals("0")) {
                    bVarI.N(576547621);
                    str6 = "--";
                    qyd0Var = qyd0Var2;
                    str7 = str3;
                    lkf0.b("--", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var2)).b, R.dimen._11sdp, bVarI), bVarI, 390, 0, 65530);
                    bVar = bVarI;
                    bVar.X(false);
                }
                bVar.X(true);
                d160 d160VarA3 = b160.a(kw0.b, ht.a.j, bVar, 6);
                iHashCode = Long.hashCode(bVar.T);
                ne00 ne00VarS5 = bVar.S();
                d dVarC5 = androidx.compose.ui.c.c(bVar, aVar3);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar2);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, d160VarA3, bVar2);
                hlh0.a(bVar, ne00VarS5, dVar);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar, iHashCode, c1350a);
                }
                hlh0.a(bVar, dVarC5, cVar);
                str8 = str4;
                strC = str6;
                if (str8.equals(strC)) {
                    strC2 = strC;
                } else {
                    TreeMap treeMap = pw.a;
                    strC2 = pw.c(str8);
                }
                if (!str8.equals(strC)) {
                    TreeMap treeMap2 = pw.a;
                    strC = pw.c(str8);
                }
                imf0 imf0VarK = k(strC, ((sfd0) bVar.O(qyd0Var)).b, bVar);
                mjm mjmVar = mt.b;
                androidx.compose.runtime.b bVar4 = bVar;
                lkf0.b(strC2, new WithAlignmentLineElement(mjmVar), j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, imf0VarK, bVar4, 384, 0, 65016);
                ty0.a(bVar4, j.w(aVar3, 1.0f));
                String upperCase = pm5.EACH.a().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                lkf0.b("/".concat(upperCase), new WithAlignmentLineElement(mjmVar), a6g0.h, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVar4.O(qyd0Var)).h, R.dimen._7sdp, bVar4), bVar4, 384, 0, 65528);
                bVarI = bVar4;
                f30.a(bVarI, true, true, true);
            } else {
                str5 = str3;
            }
            if (str2.equals("0.00") && str5.equals("0.00")) {
                bVarI.N(576547621);
                str6 = "--";
                qyd0Var = qyd0Var2;
                str7 = str3;
                lkf0.b("--", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var2)).b, R.dimen._11sdp, bVarI), bVarI, 390, 0, 65530);
                bVar = bVarI;
                bVar.X(false);
            } else {
                str7 = str5;
                str6 = "--";
                qyd0Var = qyd0Var2;
                bVarI.N(576848848);
                h9n.a(erz.a(R.drawable.ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar3, fw20.a(R.dimen._11sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
                ty0.a(bVarI, j.w(aVar3, 4.0f));
                TreeMap treeMap3 = pw.a;
                if (Intrinsics.g(pw.b(c.p(str2, ",", "", false)), "0") || (strB = pw.b(c.p(str2, ",", "", false))) == null) {
                    strB = str6;
                }
                lkf0.b(strB, null, j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str2, ((sfd0) bVarI.O(qyd0Var)).b, bVarI), bVarI, 384, 0, 65018);
                ty0.a(bVarI, j.w(aVar3, 6.0f));
                lkf0.b("-", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).b, R.dimen._11sdp, bVarI), bVarI, 390, 0, 65530);
                ty0.a(bVarI, j.w(aVar3, 6.0f));
                h9n.a(erz.a(R.drawable.ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar3, fw20.a(R.dimen._11sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
                ty0.a(bVarI, j.w(aVar3, 4.0f));
                j2 = j2;
                lkf0.b((Intrinsics.g(pw.b(c.p(str7, ",", "", false)), "0") || (strB2 = pw.b(c.p(str7, ",", "", false))) == null) ? str6 : strB2, null, j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str7, ((sfd0) bVarI.O(qyd0Var)).b, bVarI), bVarI, 384, 0, 65018);
                bVar = bVarI;
                bVar.X(false);
            }
            bVar.X(true);
            d160 d160VarA4 = b160.a(kw0.b, ht.a.j, bVar, 6);
            iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS6 = bVar.S();
            d dVarC6 = androidx.compose.ui.c.c(bVar, aVar3);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar2);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA4, bVar2);
            hlh0.a(bVar, ne00VarS6, dVar);
            if (bVar.S) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC6, cVar);
            str8 = str4;
            strC = str6;
            if (str8.equals(strC)) {
                strC2 = strC;
            } else {
                TreeMap treeMap4 = pw.a;
                strC2 = pw.c(str8);
            }
            if (!str8.equals(strC)) {
                TreeMap treeMap5 = pw.a;
                strC = pw.c(str8);
            }
            imf0 imf0VarK2 = k(strC, ((sfd0) bVar.O(qyd0Var)).b, bVar);
            mjm mjmVar2 = mt.b;
            androidx.compose.runtime.b bVar5 = bVar;
            lkf0.b(strC2, new WithAlignmentLineElement(mjmVar2), j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, imf0VarK2, bVar5, 384, 0, 65016);
            ty0.a(bVar5, j.w(aVar3, 1.0f));
            String upperCase2 = pm5.EACH.a().toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            lkf0.b("/".concat(upperCase2), new WithAlignmentLineElement(mjmVar2), a6g0.h, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVar5.O(qyd0Var)).h, R.dimen._7sdp, bVar5), bVar5, 384, 0, 65528);
            bVarI = bVar5;
            f30.a(bVarI, true, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str9 = str8;
            final String str10 = str7;
            eVarZ.d = new Function2(str, str2, str10, str9, i) { // from class: beg0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Pair<String, String> pair, final int i, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1458243533);
        int i3 = (bVarI.M(pair) ? 4 : 2) | i2 | (bVarI.d(i) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarG = h.g(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), i % 2 == 0 ? j58.c(0.04f, j58.f) : a6g0.d, zk40.a), fw20.a(R.dimen._19sdp, bVarI), 4.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String str = pair.a;
            long j = j58.f;
            qyd0 qyd0Var = ni60.b;
            lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).d, R.dimen._10ssp, bVarI), bVarI, 384, 0, 65530);
            lkf0.b(pair.b, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).d, R.dimen._10ssp, bVarI), bVarI, 384, 0, 65530);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: rdg0
                public final /* synthetic */ int b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final zzr zzrVar, final TournamentStatsData tournamentStatsData, final String str, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        float f;
        float f2;
        zzrVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1841480445);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(zzrVar) ? 32 : 16) | (bVarI.A(tournamentStatsData) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.b(z2) ? 131072 : 65536);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (66707 & i2) != 66706)) {
            d dVarG = j.g(dVar, 1.0f);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z2) {
                bVarI.N(-136168265);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.46f;
            } else {
                bVarI.N(-136170121);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.42f;
            }
            float f3 = f * f2;
            bVarI.X(false);
            d dVarH = h.h(j.i(dVarG, f3), fw20.a(R.dimen._9sdp, bVarI), 0.0f, 2);
            boolean zA = bVarI.A(tournamentStatsData) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new f8c0(i3, tournamentStatsData, str);
                bVarI.r(objY);
            }
            bVar = bVarI;
            aur.a(dVarH, zzrVar, null, false, null, null, null, false, null, (Function1) objY, bVar, i2 & 112, 508);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(zzrVar, tournamentStatsData, str, z, z2, i) { // from class: teg0
                public final /* synthetic */ zzr b;
                public final /* synthetic */ TournamentStatsData c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.e(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        String strB;
        androidx.compose.runtime.b bVarI = aVar.i(-1154208820);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new a(null, ytwVar, str);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, str, (Function2) objY2);
            Double d = (Double) ytwVar.getValue();
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                TreeMap treeMap = pw.a;
                strB = pw.b(String.valueOf(dDoubleValue));
                if (strB == null) {
                    strB = "";
                }
            } else {
                strB = "--";
            }
            bVar = bVarI;
            lkf0.b(strB, null, j58.f, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(strB, ((sfd0) bVarI.O(ni60.b)).d, bVarI), bVar, 384, 0, 65018);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ceg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    hfg0.f(str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x026d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0286  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:212:0x0512  */
    /* JADX WARN: Code duplicated, block: B:213:0x0516  */
    /* JADX WARN: Code duplicated, block: B:216:0x052b  */
    /* JADX WARN: Code duplicated, block: B:219:0x053c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0568  */
    /* JADX WARN: Code duplicated, block: B:226:0x058c  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:233:0x05af  */
    /* JADX WARN: Code duplicated, block: B:235:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:238:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:242:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:250:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:253:0x05f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:257:0x0606  */
    /* JADX WARN: Code duplicated, block: B:262:0x0618  */
    /* JADX WARN: Code duplicated, block: B:264:0x061d  */
    /* JADX WARN: Code duplicated, block: B:269:0x062c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x062e A[PHI: r0 r67
      0x062e: PHI (r0v5 boolean) = (r0v19 boolean), (r0v19 boolean), (r0v21 boolean) binds: [B:269:0x062c, B:267:0x0629, B:260:0x0615] A[DONT_GENERATE, DONT_INLINE]
      0x062e: PHI (r67v2 androidx.compose.runtime.b) = (r67v5 androidx.compose.runtime.b), (r67v5 androidx.compose.runtime.b), (r67v6 androidx.compose.runtime.b) binds: [B:269:0x062c, B:267:0x0629, B:260:0x0615] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x063d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0640  */
    /* JADX WARN: Code duplicated, block: B:278:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:280:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:283:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:285:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:288:0x0704  */
    /* JADX WARN: Code duplicated, block: B:290:0x0712  */
    /* JADX WARN: Code duplicated, block: B:296:0x0742  */
    /* JADX WARN: Code duplicated, block: B:297:0x0746  */
    /* JADX WARN: Code duplicated, block: B:300:0x0753  */
    /* JADX WARN: Code duplicated, block: B:302:0x0761  */
    /* JADX WARN: Code duplicated, block: B:305:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:307:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:308:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:310:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0802  */
    /* JADX WARN: Code duplicated, block: B:314:0x0806  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v68, types: [T, com.sportygames.commons.tournament.model.TournamentRankResponse] */
    public static final void g(final TournamentStatsData tournamentStatsData, final Function0 function0, final zhg0 zhg0Var, final twd0 twd0Var, final twd0 twd0Var2, final Function0 function1, final Function0 function2, final HashMap map, final HashMap map2, final boolean z, final float f, final int i, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function3;
        zzr zzrVar;
        zzr zzrVar2;
        TournamentRankListResponse tournamentRankListResponse;
        String strValueOf;
        String strValueOf2;
        Double pointsScore;
        Integer rank;
        boolean z3;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        ytw ytwVar;
        final float fC1;
        Object objY2;
        final isw iswVar;
        Object objY3;
        final ytw ytwVar2;
        String coefficientText;
        j58 j58VarM53getTextColorQN2ZGVo;
        boolean z4;
        Object objY4;
        boolean z5;
        Object objY5;
        androidx.compose.runtime.b bVar2;
        boolean z6;
        float f2;
        androidx.compose.runtime.b bVar3;
        final boolean z7;
        boolean zM;
        Object objY6;
        int iHashCode2;
        tsr.a aVar3;
        yka.a.C1350a c1350a2;
        int iHashCode3;
        float fA;
        boolean z8;
        float f3;
        ComposeCashOutModel composeCashOutModel;
        ComposeCashOutModel composeCashOutModel2;
        ComposeCoeffModel composeCoeffModel;
        ComposeCoeffModel composeCoeffModel2;
        ComposeCashOutModel composeCashOutModel3;
        ComposeCashOutModel composeCashOutModel4;
        String str;
        String strValueOf3;
        String strValueOf4;
        Double pointsScore2;
        Integer rank2;
        String strValueOf5;
        String strValueOf6;
        boolean zA;
        Object objY7;
        final zhg0 zhg0Var2 = zhg0Var;
        final HashMap map3 = map;
        final HashMap map4 = map2;
        function0.getClass();
        map4.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-789727644);
        Function0 function4 = function0;
        int i3 = i2 | (bVarI.A(tournamentStatsData) ? 4 : 2) | (bVarI.A(function4) ? 32 : 16) | (bVarI.A(zhg0Var2) ? 256 : 128) | (bVarI.M(twd0Var) ? 2048 : 1024) | (bVarI.M(twd0Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288) | (bVarI.A(map3) ? 8388608 : 4194304) | (bVarI.A(map4) ? 67108864 : 33554432) | (bVarI.b(z) ? 536870912 : 268435456);
        float f4 = f;
        boolean z9 = z2;
        int i4 = (bVarI.c(f4) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.b(z9) ? 256 : 128);
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Object objY8 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY8 == c0042a) {
                objY8 = m.b("--");
                bVarI.r(objY8);
            }
            final ytw ytwVar3 = (ytw) objY8;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a) {
                objY9 = m.b("--");
                bVarI.r(objY9);
            }
            final ytw ytwVar4 = (ytw) objY9;
            Object objY10 = bVarI.y();
            if (objY10 == c0042a) {
                objY10 = m.b("--");
                bVarI.r(objY10);
            }
            ytw ytwVar5 = (ytw) objY10;
            Object objY11 = bVarI.y();
            if (objY11 == c0042a) {
                objY11 = m.b("0");
                bVarI.r(objY11);
            }
            final ytw ytwVar6 = (ytw) objY11;
            Object objY12 = bVarI.y();
            if (objY12 == c0042a) {
                objY12 = k.a(0);
                bVarI.r(objY12);
            }
            final osw oswVar = (osw) objY12;
            final List listK = kotlin.collections.b.k(pm5.LEADERBOARD.a(), pm5.V.a());
            final ytw ytwVarA = ts9.a(zhg0Var2.c, bVarI);
            long tournamentId = tournamentStatsData.getTournamentId();
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            zzr zzrVarA2 = e0s.a(0, 3, bVarI);
            Object objY13 = bVarI.y();
            if (objY13 == c0042a) {
                objY13 = k.a(oswVar.D());
                bVarI.r(objY13);
            }
            osw oswVar2 = (osw) objY13;
            Integer numValueOf = Integer.valueOf(oswVar.D());
            boolean zM2 = bVarI.M(zzrVarA) | bVarI.M(zzrVarA2);
            Object objY14 = bVarI.y();
            if (zM2 || objY14 == c0042a) {
                zzrVar = zzrVarA;
                zzrVar2 = zzrVarA2;
                objY14 = new kfg0(zzrVar, zzrVar2, oswVar2, oswVar, null);
                bVarI.r(objY14);
            } else {
                zzrVar = zzrVarA;
                zzrVar2 = zzrVarA2;
            }
            xvf.e(bVarI, numValueOf, (Function2) objY14);
            if (map3 != null && map3.isEmpty()) {
                bVarI.N(1056347410);
                Unit unit = Unit.a;
                zA = bVarI.A(zhg0Var2) | bVarI.e(tournamentId);
                objY7 = bVarI.y();
                if (zA) {
                    objY7 = new nfg0(zhg0Var2, tournamentId, null);
                    bVarI.r(objY7);
                } else {
                    objY7 = new nfg0(zhg0Var2, tournamentId, null);
                    bVarI.r(objY7);
                }
                xvf.e(bVarI, unit, (Function2) objY7);
                bVarI.X(false);
            } else if ((map3 != null ? (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId)) : null) == null) {
                bVarI.N(1056347410);
                Unit unit2 = Unit.a;
                zA = bVarI.A(zhg0Var2) | bVarI.e(tournamentId);
                objY7 = bVarI.y();
                if (zA || objY7 == c0042a) {
                    objY7 = new nfg0(zhg0Var2, tournamentId, null);
                    bVarI.r(objY7);
                }
                xvf.e(bVarI, unit2, (Function2) objY7);
                bVarI.X(false);
            } else {
                TournamentRankListResponse tournamentRankListResponse2 = (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId));
                List<LeaderboardRecord> leaderboardRecords = tournamentRankListResponse2 != null ? tournamentRankListResponse2.getLeaderboardRecords() : null;
                if (leaderboardRecords == null || leaderboardRecords.isEmpty()) {
                    bVarI.N(1056347410);
                    Unit unit3 = Unit.a;
                    zA = bVarI.A(zhg0Var2) | bVarI.e(tournamentId);
                    objY7 = bVarI.y();
                    if (zA) {
                        objY7 = new nfg0(zhg0Var2, tournamentId, null);
                        bVarI.r(objY7);
                    } else {
                        objY7 = new nfg0(zhg0Var2, tournamentId, null);
                        bVarI.r(objY7);
                    }
                    xvf.e(bVarI, unit3, (Function2) objY7);
                    bVarI.X(false);
                } else {
                    bVarI.N(1056467814);
                    bVarI.X(false);
                    if (map3.get(Long.valueOf(tournamentId)) != null) {
                        TournamentRankListResponse tournamentRankListResponse3 = (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId));
                        if (tournamentRankListResponse3 == null) {
                            m2g m2gVar = m2g.a;
                            tournamentRankListResponse = new TournamentRankListResponse(m2gVar, m2gVar, null, 4, null);
                        } else {
                            tournamentRankListResponse = tournamentRankListResponse3;
                        }
                        zhg0Var2.b.j(new LoadingState<>(Status.SUCCESS, new HTTPResponse(10000, "Success", 0, tournamentRankListResponse, null, null, null, 64, null), null, null, null, 16, null));
                    }
                }
            }
            ((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getClass();
            HashMap map5 = new HashMap();
            map5.put("{currency}", tournamentStatsData.getCurrency());
            map5.put("{minimumBet}", tournamentStatsData.getMinBetAmount());
            map5.put("{startDate}", k94.e(tournamentStatsData.getStartDate()));
            map5.put("{endDate}", k94.e(tournamentStatsData.getEndDate()));
            map5.put("{minimumCashoutCoefficient}", tournamentStatsData.getMinimumCashoutCoefficient());
            map5.put("{amount}", tournamentStatsData.getOnlyAmount());
            map5.put("{totalPrize}", tournamentStatsData.getOnlyAmount());
            map5.put("{firstPrize}", tournamentStatsData.getFirstPrize());
            Unit unit4 = Unit.a;
            final String strC = qae0.c("\n        <html>\n        <head>\n            <style>\n                body {\n                    color: white;\n                    background-color: transparent;\n                    font-size: 15px;\n                    line-height: 1.5;\n                }\n                ul {\n                    list-style-type: none;\n                    padding-left: 1em;\n                    margin: 0;\n                }\n                ul li {\n                    position: relative;\n                    padding-left: 1.5em;\n                    margin-bottom: 0.5em;\n                }\n                ul li::before {\n                    content: \"♦\";\n                    display: inline-block;\n                    width: 1em;\n                    margin-left: -0.5em;\n                    margin-right: 1.2em;\n                    font-size: 0.9em;\n                    text-shadow: 0 0 0 white;\n                    color: transparent;  \n                    position: absolute;\n                    left: 0;\n                    top: 0.1em;\n                }\n            </style>\n        </head>\n        <body>\n            " + op5.d(mn5.e("tournament_rules_01") + ":sg_tournament", "Terms & Conditions", map5) + "\n        </body>\n        </html>\n    ");
            final dq40 dq40Var = new dq40();
            if (map4.isEmpty() || !map4.containsKey(Long.valueOf(tournamentStatsData.getTournamentId())) || map4.get(Long.valueOf(tournamentStatsData.getTournamentId())) == null || (str = (String) map4.get(Long.valueOf(tournamentStatsData.getTournamentId()))) == null || str.length() <= 0) {
                UserPlayInfo rankData = tournamentStatsData.getRankData();
                if (rankData == null || (rank = rankData.getRank()) == null || (strValueOf = String.valueOf(rank.intValue())) == null) {
                    strValueOf = "--";
                }
                ytwVar6.setValue(strValueOf);
                UserPlayInfo rankData2 = tournamentStatsData.getRankData();
                if (rankData2 == null || (pointsScore = rankData2.getPointsScore()) == null || (strValueOf2 = String.valueOf(pointsScore.doubleValue())) == null) {
                    strValueOf2 = "--";
                }
                ytwVar5.setValue(strValueOf2);
            } else {
                Set setEntrySet = map4.entrySet();
                setEntrySet.getClass();
                for (Object obj : setEntrySet) {
                    obj.getClass();
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null) {
                        Object value = entry.getValue();
                        value.getClass();
                        if (((CharSequence) value).length() > 0) {
                            Long l = (Long) entry.getKey();
                            long tournamentId2 = tournamentStatsData.getTournamentId();
                            if (l != null && l.longValue() == tournamentId2) {
                                ?? r5 = (TournamentRankResponse) new eal().e((String) entry.getValue(), TournamentRankResponse.class);
                                if (r5 != 0) {
                                    dq40Var.a = r5;
                                    Integer rank3 = r5.getRank();
                                    if (rank3 == null || (strValueOf5 = String.valueOf(rank3.intValue())) == null) {
                                        strValueOf5 = "--";
                                    }
                                    ytwVar6.setValue(strValueOf5);
                                    Double score = ((TournamentRankResponse) dq40Var.a).getScore();
                                    if (score == null || (strValueOf6 = String.valueOf(score.doubleValue())) == null) {
                                        strValueOf6 = "--";
                                    }
                                    ytwVar5.setValue(strValueOf6);
                                    break;
                                }
                                e eVarZ2 = bVarI.Z();
                                if (eVarZ2 == null) {
                                    return;
                                }
                                final Function0 function5 = function4;
                                final float f5 = f4;
                                final boolean z10 = z9;
                                eVarZ = eVarZ2;
                                function3 = new Function2(function5, zhg0Var2, twd0Var, twd0Var2, function1, function2, map3, map4, z, f5, i, z10, i2) { // from class: eeg0
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ boolean B;
                                    public final /* synthetic */ Function0 b;
                                    public final /* synthetic */ zhg0 c;
                                    public final /* synthetic */ twd0 d;
                                    public final /* synthetic */ twd0 e;
                                    public final /* synthetic */ Function0 f;
                                    public final /* synthetic */ Function0 i;
                                    public final /* synthetic */ HashMap v;
                                    public final /* synthetic */ HashMap w;
                                    public final /* synthetic */ boolean y;
                                    public final /* synthetic */ float z;

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        int iA = qj40.a(1);
                                        hfg0.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj2, iA);
                                        return Unit.a;
                                    }
                                };
                                eVarZ.d = function3;
                            }
                        }
                    }
                    UserPlayInfo rankData3 = tournamentStatsData.getRankData();
                    if (rankData3 == null || (rank2 = rankData3.getRank()) == null || (strValueOf3 = String.valueOf(rank2.intValue())) == null) {
                        strValueOf3 = "--";
                    }
                    ytwVar6.setValue(strValueOf3);
                    UserPlayInfo rankData4 = tournamentStatsData.getRankData();
                    if (rankData4 == null || (pointsScore2 = rankData4.getPointsScore()) == null || (strValueOf4 = String.valueOf(pointsScore2.doubleValue())) == null) {
                        strValueOf4 = "--";
                    }
                    ytwVar5.setValue(strValueOf4);
                    function4 = function0;
                    zhg0Var2 = zhg0Var;
                    map3 = map;
                    map4 = map2;
                    f4 = f;
                    z9 = z2;
                }
            }
            if (twd0Var2 == null || (composeCashOutModel4 = (ComposeCashOutModel) twd0Var2.getValue()) == null) {
                z3 = true;
            } else {
                z3 = true;
                boolean z11 = composeCashOutModel4.getShowCashout2();
                d.a aVar4 = d.a.b;
                d dVarB = androidx.compose.foundation.a.b(j.e(aVar4, 1.0f), a6g0.p, zk40.a);
                Unit unit5 = Unit.a;
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = ofg0.a;
                    bVarI.r(objY);
                }
                d dVarA = wje0.a(dVarB, unit5, (PointerInputEventHandler) objY);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.m());
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
                yka.a.b bVar4 = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar4);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    ytwVar = ytwVar5;
                } else {
                    ytwVar = ytwVar5;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
                    fC1 = ((mmd) bVarI.O(kna.h)).C1(configuration.screenHeightDp);
                    Object[] objArr = new Object[0];
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new feg0();
                        bVarI.r(objY2);
                    }
                    iswVar = (isw) o350.e(objArr, (Function0) objY2, bVarI, 48);
                    Object[] objArr2 = {Integer.valueOf(configuration.orientation)};
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new z0r(1);
                        bVarI.r(objY3);
                    }
                    ytwVar2 = (ytw) o350.e(objArr2, (Function0) objY3, bVarI, 48);
                    if (twd0Var != null || (composeCoeffModel2 = (ComposeCoeffModel) twd0Var.getValue()) == null || (coefficientText = composeCoeffModel2.getCoefficientText()) == null) {
                        coefficientText = "";
                    }
                    if (twd0Var != null || (composeCoeffModel = (ComposeCoeffModel) twd0Var.getValue()) == null) {
                        j58VarM53getTextColorQN2ZGVo = null;
                    } else {
                        j58VarM53getTextColorQN2ZGVo = composeCoeffModel.m53getTextColorQN2ZGVo();
                    }
                    if ((i3 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY4 = bVarI.y();
                    if (z4 || objY4 == c0042a) {
                        objY4 = new nm3(function1, 3);
                        bVarI.r(objY4);
                    }
                    Function0 function6 = (Function0) objY4;
                    if ((i3 & 3670016) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objY5 = bVarI.y();
                    if (z5 || objY5 == c0042a) {
                        objY5 = new sm3(2, function2);
                        bVarI.r(objY5);
                    }
                    Function0 function7 = (Function0) objY5;
                    if (twd0Var2 != null || (composeCashOutModel2 = (ComposeCashOutModel) twd0Var2.getValue()) == null) {
                        bVar2 = bVarI;
                        z6 = true;
                    } else {
                        bVar2 = bVarI;
                        z6 = true;
                        boolean z12 = composeCashOutModel2.getShowCashout2() ? z6 : false;
                        if (z) {
                            f2 = f;
                        } else {
                            f2 = 0.0f;
                        }
                        bVar3 = bVar2;
                        z7 = z11;
                        h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function6, function7, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                        d dVarB2 = androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.h);
                        zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                        objY6 = bVar3.y();
                        if (zM || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: jeg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    urr urrVar = (urr) obj2;
                                    urrVar.getClass();
                                    ytw ytwVar7 = ytwVar2;
                                    if (!((Boolean) ytwVar7.getValue()).booleanValue()) {
                                        float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                        isw iswVar2 = iswVar;
                                        if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                            iswVar2.A(fD);
                                        }
                                        ytwVar7.setValue(Boolean.TRUE);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVar3.r(objY6);
                        }
                        d dVarA2 = v.a(dVarB2, (Function1) objY6);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, bVar3, 0);
                        iHashCode2 = Long.hashCode(bVar3.m());
                        ne00 ne00VarS2 = bVar3.S();
                        d dVarC2 = androidx.compose.ui.c.c(bVar3, dVarA2);
                        bVar3.D();
                        if (bVar3.S) {
                            aVar3 = aVar2;
                            bVar3.F(aVar3);
                        } else {
                            aVar3 = aVar2;
                            bVar3.p();
                        }
                        hlh0.a(bVar3, i78VarA, bVar4);
                        hlh0.a(bVar3, ne00VarS2, dVar);
                        if (bVar3.S && Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode2))) {
                            c1350a2 = c1350a;
                        } else {
                            c1350a2 = c1350a;
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC2, cVar);
                        d dVarG = j.g(aVar4, 1.0f);
                        aiv aivVarC2 = g75.c(ht.a.b, false);
                        iHashCode3 = Long.hashCode(bVar3.m());
                        ne00 ne00VarS3 = bVar3.S();
                        d dVarC3 = androidx.compose.ui.c.c(bVar3, dVarG);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar3);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC2, bVar4);
                        hlh0.a(bVar3, ne00VarS3, dVar);
                        if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode3))) {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC3, cVar);
                        final zzr zzrVar3 = zzrVar;
                        final zzr zzrVar4 = zzrVar2;
                        final ytw ytwVar7 = ytwVar;
                        Function2 function8 = new Function2() { // from class: leg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                a aVar5 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final Function0 function9 = function0;
                                    final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                    final osw oswVar3 = oswVar;
                                    final List list = listK;
                                    final zzr zzrVar5 = zzrVar3;
                                    final boolean z13 = z7;
                                    final boolean z14 = z;
                                    final boolean z15 = z2;
                                    final zhg0 zhg0Var3 = zhg0Var;
                                    final zzr zzrVar6 = zzrVar4;
                                    final String str2 = strC;
                                    final twd0 twd0Var3 = ytwVarA;
                                    final ytw ytwVar8 = ytwVar6;
                                    final ytw ytwVar9 = ytwVar7;
                                    final ytw ytwVar10 = ytwVar3;
                                    final ytw ytwVar11 = ytwVar4;
                                    final dq40 dq40Var2 = dq40Var;
                                    s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar6;
                                            float f6;
                                            a aVar7 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                d.a aVar8 = d.a.b;
                                                d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar7), 0.0f, 0.0f, 13);
                                                i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                                int iHashCode4 = Long.hashCode(aVar7.m());
                                                ne00 ne00VarO = aVar7.o();
                                                d dVarC4 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                                yka.k.getClass();
                                                tsr.a aVar9 = yka.a.b;
                                                if (aVar7.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar7.D();
                                                if (aVar7.g()) {
                                                    aVar7.F(aVar9);
                                                } else {
                                                    aVar7.p();
                                                }
                                                yka.a.b bVar5 = yka.a.f;
                                                hlh0.a(aVar7, i78VarA2, bVar5);
                                                yka.a.d dVar2 = yka.a.e;
                                                hlh0.a(aVar7, ne00VarO, dVar2);
                                                yka.a.C1350a c1350a3 = yka.a.g;
                                                if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar7, dVarC4, cVar2);
                                                TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                                TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                                lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar7.O(ni60.b)).f, R.dimen._16sdp, aVar7), aVar7, 384, 0, 65530);
                                                char c = 709;
                                                ty0.a(aVar7, j.i(aVar8, fw20.a(R.dimen._9sdp, aVar7)));
                                                neg0 neg0Var = this;
                                                final osw oswVar4 = oswVar3;
                                                int iD = oswVar4.D();
                                                long j = j58.l;
                                                op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        List list2 = (List) obj6;
                                                        ((Integer) obj8).getClass();
                                                        list2.getClass();
                                                        d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                        long j2 = a6g0.a;
                                                        i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                        return Unit.a;
                                                    }
                                                }, aVar7);
                                                final List list2 = list;
                                                j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj6, Object obj7) {
                                                        a aVar10 = (a) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            final int i5 = 0;
                                                            for (Object obj8 : list2) {
                                                                int i6 = i5 + 1;
                                                                if (i5 < 0) {
                                                                    b.q();
                                                                    throw null;
                                                                }
                                                                final String str3 = (String) obj8;
                                                                final osw oswVar5 = oswVar4;
                                                                final boolean z16 = oswVar5.D() == i5;
                                                                boolean zD = aVar10.d(i5);
                                                                Object objY15 = aVar10.y();
                                                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                                if (zD || objY15 == c0042a2) {
                                                                    objY15 = new Function0() { // from class: zeg0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            oswVar5.k(i5);
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    aVar10.r(objY15);
                                                                }
                                                                Function0 function10 = (Function0) objY15;
                                                                boolean zB = aVar10.b(z16);
                                                                Object objY16 = aVar10.y();
                                                                if (zB || objY16 == c0042a2) {
                                                                    objY16 = new Function1() { // from class: bfg0
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj9) {
                                                                            tcf tcfVar = (tcf) obj9;
                                                                            tcfVar.getClass();
                                                                            if (!z16) {
                                                                                float fC2 = tcfVar.C1(1.5f);
                                                                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                                tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    aVar10.r(objY16);
                                                                }
                                                                w1f0.b(z16, function10, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj9, Object obj10) {
                                                                        imf0 imf0VarG;
                                                                        a aVar11 = (a) obj9;
                                                                        int iIntValue4 = ((Integer) obj10).intValue();
                                                                        if (aVar11.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                            boolean z17 = z16;
                                                                            if (z17) {
                                                                                aVar11.N(-1289914155);
                                                                                imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).d, R.dimen._11ssp, aVar11);
                                                                                aVar11.H();
                                                                            } else {
                                                                                aVar11.N(-1289908779);
                                                                                imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).b, R.dimen._11ssp, aVar11);
                                                                                aVar11.H();
                                                                            }
                                                                            lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar11, 0, 0, 65530);
                                                                        } else {
                                                                            aVar11.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, aVar10), 0L, 0L, aVar10, 24576, 488);
                                                                i5 = i6;
                                                            }
                                                        } else {
                                                            aVar10.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar7), aVar7, 1597824, 42);
                                                a aVar10 = aVar7;
                                                float f7 = 1.0f;
                                                d dVarG2 = j.g(aVar8, 1.0f);
                                                aiv aivVarC3 = g75.c(ht.a.a, false);
                                                int iHashCode5 = Long.hashCode(aVar10.m());
                                                ne00 ne00VarO2 = aVar10.o();
                                                d dVarC5 = androidx.compose.ui.c.c(aVar10, dVarG2);
                                                if (aVar10.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar10.D();
                                                if (aVar10.g()) {
                                                    aVar10.F(aVar9);
                                                } else {
                                                    aVar10.p();
                                                }
                                                hlh0.a(aVar10, aivVarC3, bVar5);
                                                hlh0.a(aVar10, ne00VarO2, dVar2);
                                                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode5))) {
                                                    j3c.a(iHashCode5, aVar10, iHashCode5, c1350a3);
                                                }
                                                hlh0.a(aVar10, dVarC5, cVar2);
                                                aVar10.N(-1625593485);
                                                int i5 = 0;
                                                for (Object obj6 : list2) {
                                                    int i6 = i5 + 1;
                                                    if (i5 < 0) {
                                                        b.q();
                                                        throw null;
                                                    }
                                                    boolean z16 = z13;
                                                    boolean z17 = z14;
                                                    if (i5 != 0) {
                                                        if (i5 != 1) {
                                                            aVar10.N(-1025411112);
                                                            aVar10.H();
                                                            Unit unit6 = Unit.a;
                                                            aVar6 = aVar10;
                                                        } else {
                                                            aVar10.N(-171017816);
                                                            a aVar11 = aVar10;
                                                            hfg0.e(dw.a(abk0.a(aVar8, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar6, tournamentStatsData4, str2, z16, z17, aVar11, 0);
                                                            aVar6 = aVar11;
                                                            aVar6.H();
                                                            Unit unit7 = Unit.a;
                                                        }
                                                        f6 = f7;
                                                    } else {
                                                        aVar6 = aVar10;
                                                        aVar6.N(-1011218041);
                                                        d dVarA3 = dw.a(abk0.a(aVar8, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                        LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                        ytw ytwVar12 = ytwVar8;
                                                        String str3 = (String) ytwVar12.getValue();
                                                        ytw ytwVar13 = ytwVar9;
                                                        String str4 = (String) ytwVar13.getValue();
                                                        ytw ytwVar14 = ytwVar10;
                                                        String str5 = (String) ytwVar14.getValue();
                                                        ytw ytwVar15 = ytwVar11;
                                                        String str6 = (String) ytwVar15.getValue();
                                                        neg0 neg0Var2 = neg0Var;
                                                        final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                        wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar12, ytwVar14, ytwVar13, ytwVar15);
                                                        final zhg0 zhg0Var4 = zhg0Var3;
                                                        boolean zA2 = aVar6.A(zhg0Var4) | aVar6.A(tournamentStatsData5);
                                                        Object objY15 = aVar6.y();
                                                        if (zA2 || objY15 == a.C0041a.a) {
                                                            objY15 = new Function0() { // from class: qeg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                    zhg0 zhg0Var5 = zhg0Var4;
                                                                    ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar6.r(objY15);
                                                        }
                                                        f6 = 1.0f;
                                                        hfg0.a(dVarA3, zzrVar5, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar6, 0);
                                                        tournamentStatsData4 = tournamentStatsData5;
                                                        aVar6.H();
                                                        Unit unit8 = Unit.a;
                                                    }
                                                    neg0Var = this;
                                                    aVar10 = aVar6;
                                                    i5 = i6;
                                                    f7 = f6;
                                                    c = 709;
                                                }
                                                a aVar12 = aVar10;
                                                aVar12.H();
                                                aVar12.s();
                                                aVar12.s();
                                                c6n.b(function9, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), fw20.a(R.dimen._9sdp, aVar12)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar10, 196608, 28);
                                            } else {
                                                aVar7.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar5), aVar5);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        };
                        bVar = bVar3;
                        lig0.a(6, pp8.b(-1677248696, function8, bVar), bVar);
                        float fA2 = fw20.a(R.dimen._105sdp, bVar);
                        float fA3 = fw20.a(R.dimen._100sdp, bVar);
                        fA = fw20.a(R.dimen._minus60sdp, bVar);
                        if (z7) {
                            bVar.N(1969574340);
                            if (z) {
                                bVar.N(1969619445);
                                fA = fw20.a(R.dimen._minus35sdp, bVar);
                                z8 = false;
                                bVar.X(false);
                            } else {
                                z8 = false;
                                bVar.N(1969695829);
                                fA = fw20.a(R.dimen._minus50sdp, bVar);
                                bVar.X(false);
                            }
                        } else {
                            z8 = false;
                            bVar.N(1949021340);
                        }
                        bVar.X(z8);
                        String strA = pm5.TROPHY_IMAGE.a();
                        d dVarD = g.d(j.t(aVar4, fA2, fA3), 0.0f, fA, 1);
                        if (z7) {
                            f3 = 0.6f;
                        } else {
                            f3 = 1.0f;
                        }
                        fn80.a(strA, "Trophy", bz60.a(dVarD, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                        f30.a(bVar, true, true, true);
                    }
                    if ((twd0Var2 != null || (composeCashOutModel = (ComposeCashOutModel) twd0Var2.getValue()) == null || composeCashOutModel.getShowCashout1() != z6) && !z) {
                    }
                    if (z) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    bVar3 = bVar2;
                    z7 = z11;
                    h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function6, function7, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                    d dVarB3 = androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.h);
                    zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                    objY6 = bVar3.y();
                    if (zM) {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar8 = ytwVar2;
                                if (!((Boolean) ytwVar8.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar8.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar8 = ytwVar2;
                                if (!((Boolean) ytwVar8.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar8.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    }
                    d dVarA3 = v.a(dVarB3, (Function1) objY6);
                    i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                    iHashCode2 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS4 = bVar3.S();
                    d dVarC4 = androidx.compose.ui.c.c(bVar3, dVarA3);
                    bVar3.D();
                    if (bVar3.S) {
                        aVar3 = aVar2;
                        bVar3.F(aVar3);
                    } else {
                        aVar3 = aVar2;
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA2, bVar4);
                    hlh0.a(bVar3, ne00VarS4, dVar);
                    if (bVar3.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC4, cVar);
                    d dVarG2 = j.g(aVar4, 1.0f);
                    aiv aivVarC3 = g75.c(ht.a.b, false);
                    iHashCode3 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS5 = bVar3.S();
                    d dVarC5 = androidx.compose.ui.c.c(bVar3, dVarG2);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC3, bVar4);
                    hlh0.a(bVar3, ne00VarS5, dVar);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC5, cVar);
                    final zzr zzrVar5 = zzrVar;
                    final zzr zzrVar6 = zzrVar2;
                    final ytw ytwVar8 = ytwVar;
                    Function2 function9 = new Function2() { // from class: leg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar5 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Function0 function10 = function0;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final osw oswVar3 = oswVar;
                                final List list = listK;
                                final zzr zzrVar7 = zzrVar5;
                                final boolean z13 = z7;
                                final boolean z14 = z;
                                final boolean z15 = z2;
                                final zhg0 zhg0Var3 = zhg0Var;
                                final zzr zzrVar8 = zzrVar6;
                                final String str2 = strC;
                                final twd0 twd0Var3 = ytwVarA;
                                final ytw ytwVar9 = ytwVar6;
                                final ytw ytwVar10 = ytwVar8;
                                final ytw ytwVar11 = ytwVar3;
                                final ytw ytwVar12 = ytwVar4;
                                final dq40 dq40Var2 = dq40Var;
                                s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar6;
                                        float f6;
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d.a aVar8 = d.a.b;
                                            d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar7), 0.0f, 0.0f, 13);
                                            i78 i78VarA3 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                            int iHashCode4 = Long.hashCode(aVar7.m());
                                            ne00 ne00VarO = aVar7.o();
                                            d dVarC6 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                            yka.k.getClass();
                                            tsr.a aVar9 = yka.a.b;
                                            if (aVar7.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar7.D();
                                            if (aVar7.g()) {
                                                aVar7.F(aVar9);
                                            } else {
                                                aVar7.p();
                                            }
                                            yka.a.b bVar5 = yka.a.f;
                                            hlh0.a(aVar7, i78VarA3, bVar5);
                                            yka.a.d dVar2 = yka.a.e;
                                            hlh0.a(aVar7, ne00VarO, dVar2);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                            }
                                            yka.a.c cVar2 = yka.a.d;
                                            hlh0.a(aVar7, dVarC6, cVar2);
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                            lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar7.O(ni60.b)).f, R.dimen._16sdp, aVar7), aVar7, 384, 0, 65530);
                                            char c = 709;
                                            ty0.a(aVar7, j.i(aVar8, fw20.a(R.dimen._9sdp, aVar7)));
                                            neg0 neg0Var = this;
                                            final osw oswVar4 = oswVar3;
                                            int iD = oswVar4.D();
                                            long j = j58.l;
                                            op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    List list2 = (List) obj6;
                                                    ((Integer) obj8).getClass();
                                                    list2.getClass();
                                                    d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                    long j2 = a6g0.a;
                                                    i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                    return Unit.a;
                                                }
                                            }, aVar7);
                                            final List list2 = list;
                                            j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar10 = (a) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        final int i5 = 0;
                                                        for (Object obj8 : list2) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                b.q();
                                                                throw null;
                                                            }
                                                            final String str3 = (String) obj8;
                                                            final osw oswVar5 = oswVar4;
                                                            final boolean z16 = oswVar5.D() == i5;
                                                            boolean zD = aVar10.d(i5);
                                                            Object objY15 = aVar10.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zD || objY15 == c0042a2) {
                                                                objY15 = new Function0() { // from class: zeg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        oswVar5.k(i5);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY15);
                                                            }
                                                            Function0 function11 = (Function0) objY15;
                                                            boolean zB = aVar10.b(z16);
                                                            Object objY16 = aVar10.y();
                                                            if (zB || objY16 == c0042a2) {
                                                                objY16 = new Function1() { // from class: bfg0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj9) {
                                                                        tcf tcfVar = (tcf) obj9;
                                                                        tcfVar.getClass();
                                                                        if (!z16) {
                                                                            float fC2 = tcfVar.C1(1.5f);
                                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                            tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY16);
                                                            }
                                                            w1f0.b(z16, function11, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj9, Object obj10) {
                                                                    imf0 imf0VarG;
                                                                    a aVar11 = (a) obj9;
                                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                                    if (aVar11.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                        boolean z17 = z16;
                                                                        if (z17) {
                                                                            aVar11.N(-1289914155);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).d, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        } else {
                                                                            aVar11.N(-1289908779);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).b, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        }
                                                                        lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar11, 0, 0, 65530);
                                                                    } else {
                                                                        aVar11.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, aVar10), 0L, 0L, aVar10, 24576, 488);
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        aVar10.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar7), aVar7, 1597824, 42);
                                            a aVar10 = aVar7;
                                            float f7 = 1.0f;
                                            d dVarG3 = j.g(aVar8, 1.0f);
                                            aiv aivVarC4 = g75.c(ht.a.a, false);
                                            int iHashCode5 = Long.hashCode(aVar10.m());
                                            ne00 ne00VarO2 = aVar10.o();
                                            d dVarC7 = androidx.compose.ui.c.c(aVar10, dVarG3);
                                            if (aVar10.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar10.D();
                                            if (aVar10.g()) {
                                                aVar10.F(aVar9);
                                            } else {
                                                aVar10.p();
                                            }
                                            hlh0.a(aVar10, aivVarC4, bVar5);
                                            hlh0.a(aVar10, ne00VarO2, dVar2);
                                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar10, iHashCode5, c1350a3);
                                            }
                                            hlh0.a(aVar10, dVarC7, cVar2);
                                            aVar10.N(-1625593485);
                                            int i5 = 0;
                                            for (Object obj6 : list2) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z16 = z13;
                                                boolean z17 = z14;
                                                if (i5 != 0) {
                                                    if (i5 != 1) {
                                                        aVar10.N(-1025411112);
                                                        aVar10.H();
                                                        Unit unit6 = Unit.a;
                                                        aVar6 = aVar10;
                                                    } else {
                                                        aVar10.N(-171017816);
                                                        a aVar11 = aVar10;
                                                        hfg0.e(dw.a(abk0.a(aVar8, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar8, tournamentStatsData4, str2, z16, z17, aVar11, 0);
                                                        aVar6 = aVar11;
                                                        aVar6.H();
                                                        Unit unit7 = Unit.a;
                                                    }
                                                    f6 = f7;
                                                } else {
                                                    aVar6 = aVar10;
                                                    aVar6.N(-1011218041);
                                                    d dVarA4 = dw.a(abk0.a(aVar8, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                    LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                    ytw ytwVar13 = ytwVar9;
                                                    String str3 = (String) ytwVar13.getValue();
                                                    ytw ytwVar14 = ytwVar10;
                                                    String str4 = (String) ytwVar14.getValue();
                                                    ytw ytwVar15 = ytwVar11;
                                                    String str5 = (String) ytwVar15.getValue();
                                                    ytw ytwVar16 = ytwVar12;
                                                    String str6 = (String) ytwVar16.getValue();
                                                    neg0 neg0Var2 = neg0Var;
                                                    final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar13, ytwVar15, ytwVar14, ytwVar16);
                                                    final zhg0 zhg0Var4 = zhg0Var3;
                                                    boolean zA2 = aVar6.A(zhg0Var4) | aVar6.A(tournamentStatsData5);
                                                    Object objY15 = aVar6.y();
                                                    if (zA2 || objY15 == a.C0041a.a) {
                                                        objY15 = new Function0() { // from class: qeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                zhg0 zhg0Var5 = zhg0Var4;
                                                                ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar6.r(objY15);
                                                    }
                                                    f6 = 1.0f;
                                                    hfg0.a(dVarA4, zzrVar7, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar6, 0);
                                                    tournamentStatsData4 = tournamentStatsData5;
                                                    aVar6.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                neg0Var = this;
                                                aVar10 = aVar6;
                                                i5 = i6;
                                                f7 = f6;
                                                c = 709;
                                            }
                                            a aVar12 = aVar10;
                                            aVar12.H();
                                            aVar12.s();
                                            aVar12.s();
                                            c6n.b(function10, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), fw20.a(R.dimen._9sdp, aVar12)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar10, 196608, 28);
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar5), aVar5);
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    };
                    bVar = bVar3;
                    lig0.a(6, pp8.b(-1677248696, function9, bVar), bVar);
                    float fA4 = fw20.a(R.dimen._105sdp, bVar);
                    float fA5 = fw20.a(R.dimen._100sdp, bVar);
                    fA = fw20.a(R.dimen._minus60sdp, bVar);
                    if (z7) {
                        bVar.N(1969574340);
                        if (z) {
                            bVar.N(1969619445);
                            fA = fw20.a(R.dimen._minus35sdp, bVar);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(1969695829);
                            fA = fw20.a(R.dimen._minus50sdp, bVar);
                            bVar.X(false);
                        }
                    } else {
                        z8 = false;
                        bVar.N(1949021340);
                    }
                    bVar.X(z8);
                    String strA2 = pm5.TROPHY_IMAGE.a();
                    d dVarD2 = g.d(j.t(aVar4, fA4, fA5), 0.0f, fA, 1);
                    if (z7) {
                        f3 = 0.6f;
                    } else {
                        f3 = 1.0f;
                    }
                    fn80.a(strA2, "Trophy", bz60.a(dVarD2, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                    f30.a(bVar, true, true, true);
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                Configuration configuration2 = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
                fC1 = ((mmd) bVarI.O(kna.h)).C1(configuration2.screenHeightDp);
                Object[] objArr3 = new Object[0];
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new feg0();
                    bVarI.r(objY2);
                }
                iswVar = (isw) o350.e(objArr3, (Function0) objY2, bVarI, 48);
                Object[] objArr4 = {Integer.valueOf(configuration2.orientation)};
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new z0r(1);
                    bVarI.r(objY3);
                }
                ytwVar2 = (ytw) o350.e(objArr4, (Function0) objY3, bVarI, 48);
                if (twd0Var != null) {
                    coefficientText = "";
                } else {
                    coefficientText = "";
                }
                if (twd0Var != null) {
                    j58VarM53getTextColorQN2ZGVo = null;
                } else {
                    j58VarM53getTextColorQN2ZGVo = null;
                }
                if ((i3 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY4 = bVarI.y();
                if (z4) {
                    objY4 = new nm3(function1, 3);
                    bVarI.r(objY4);
                } else {
                    objY4 = new nm3(function1, 3);
                    bVarI.r(objY4);
                }
                Function0 function10 = (Function0) objY4;
                if ((i3 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objY5 = bVarI.y();
                if (z5) {
                    objY5 = new sm3(2, function2);
                    bVarI.r(objY5);
                } else {
                    objY5 = new sm3(2, function2);
                    bVarI.r(objY5);
                }
                Function0 function11 = (Function0) objY5;
                if (twd0Var2 != null) {
                    bVar2 = bVarI;
                    z6 = true;
                    if (twd0Var2 != null) {
                    }
                    if (z) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    bVar3 = bVar2;
                    z7 = z11;
                    h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function10, function11, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                    d dVarB4 = androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.h);
                    zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                    objY6 = bVar3.y();
                    if (zM) {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar9 = ytwVar2;
                                if (!((Boolean) ytwVar9.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar9.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar9 = ytwVar2;
                                if (!((Boolean) ytwVar9.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar9.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    }
                    d dVarA4 = v.a(dVarB4, (Function1) objY6);
                    i78 i78VarA3 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                    iHashCode2 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS6 = bVar3.S();
                    d dVarC6 = androidx.compose.ui.c.c(bVar3, dVarA4);
                    bVar3.D();
                    if (bVar3.S) {
                        aVar3 = aVar2;
                        bVar3.F(aVar3);
                    } else {
                        aVar3 = aVar2;
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA3, bVar4);
                    hlh0.a(bVar3, ne00VarS6, dVar);
                    if (bVar3.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC6, cVar2);
                    d dVarG3 = j.g(aVar4, 1.0f);
                    aiv aivVarC4 = g75.c(ht.a.b, false);
                    iHashCode3 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS7 = bVar3.S();
                    d dVarC7 = androidx.compose.ui.c.c(bVar3, dVarG3);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC4, bVar4);
                    hlh0.a(bVar3, ne00VarS7, dVar);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC7, cVar2);
                    final zzr zzrVar7 = zzrVar;
                    final zzr zzrVar8 = zzrVar2;
                    final ytw ytwVar9 = ytwVar;
                    Function2 function12 = new Function2() { // from class: leg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar5 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Function0 function13 = function0;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final osw oswVar3 = oswVar;
                                final List list = listK;
                                final zzr zzrVar9 = zzrVar7;
                                final boolean z13 = z7;
                                final boolean z14 = z;
                                final boolean z15 = z2;
                                final zhg0 zhg0Var3 = zhg0Var;
                                final zzr zzrVar10 = zzrVar8;
                                final String str2 = strC;
                                final twd0 twd0Var3 = ytwVarA;
                                final ytw ytwVar10 = ytwVar6;
                                final ytw ytwVar11 = ytwVar9;
                                final ytw ytwVar12 = ytwVar3;
                                final ytw ytwVar13 = ytwVar4;
                                final dq40 dq40Var2 = dq40Var;
                                s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar6;
                                        float f6;
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d.a aVar8 = d.a.b;
                                            d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar7), 0.0f, 0.0f, 13);
                                            i78 i78VarA4 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                            int iHashCode4 = Long.hashCode(aVar7.m());
                                            ne00 ne00VarO = aVar7.o();
                                            d dVarC8 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                            yka.k.getClass();
                                            tsr.a aVar9 = yka.a.b;
                                            if (aVar7.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar7.D();
                                            if (aVar7.g()) {
                                                aVar7.F(aVar9);
                                            } else {
                                                aVar7.p();
                                            }
                                            yka.a.b bVar5 = yka.a.f;
                                            hlh0.a(aVar7, i78VarA4, bVar5);
                                            yka.a.d dVar2 = yka.a.e;
                                            hlh0.a(aVar7, ne00VarO, dVar2);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                            }
                                            yka.a.c cVar3 = yka.a.d;
                                            hlh0.a(aVar7, dVarC8, cVar3);
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                            lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar7.O(ni60.b)).f, R.dimen._16sdp, aVar7), aVar7, 384, 0, 65530);
                                            char c = 709;
                                            ty0.a(aVar7, j.i(aVar8, fw20.a(R.dimen._9sdp, aVar7)));
                                            neg0 neg0Var = this;
                                            final osw oswVar4 = oswVar3;
                                            int iD = oswVar4.D();
                                            long j = j58.l;
                                            op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    List list2 = (List) obj6;
                                                    ((Integer) obj8).getClass();
                                                    list2.getClass();
                                                    d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                    long j2 = a6g0.a;
                                                    i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                    return Unit.a;
                                                }
                                            }, aVar7);
                                            final List list2 = list;
                                            j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar10 = (a) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        final int i5 = 0;
                                                        for (Object obj8 : list2) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                b.q();
                                                                throw null;
                                                            }
                                                            final String str3 = (String) obj8;
                                                            final osw oswVar5 = oswVar4;
                                                            final boolean z16 = oswVar5.D() == i5;
                                                            boolean zD = aVar10.d(i5);
                                                            Object objY15 = aVar10.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zD || objY15 == c0042a2) {
                                                                objY15 = new Function0() { // from class: zeg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        oswVar5.k(i5);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY15);
                                                            }
                                                            Function0 function14 = (Function0) objY15;
                                                            boolean zB = aVar10.b(z16);
                                                            Object objY16 = aVar10.y();
                                                            if (zB || objY16 == c0042a2) {
                                                                objY16 = new Function1() { // from class: bfg0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj9) {
                                                                        tcf tcfVar = (tcf) obj9;
                                                                        tcfVar.getClass();
                                                                        if (!z16) {
                                                                            float fC2 = tcfVar.C1(1.5f);
                                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                            tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY16);
                                                            }
                                                            w1f0.b(z16, function14, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj9, Object obj10) {
                                                                    imf0 imf0VarG;
                                                                    a aVar11 = (a) obj9;
                                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                                    if (aVar11.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                        boolean z17 = z16;
                                                                        if (z17) {
                                                                            aVar11.N(-1289914155);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).d, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        } else {
                                                                            aVar11.N(-1289908779);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).b, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        }
                                                                        lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar11, 0, 0, 65530);
                                                                    } else {
                                                                        aVar11.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, aVar10), 0L, 0L, aVar10, 24576, 488);
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        aVar10.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar7), aVar7, 1597824, 42);
                                            a aVar10 = aVar7;
                                            float f7 = 1.0f;
                                            d dVarG4 = j.g(aVar8, 1.0f);
                                            aiv aivVarC5 = g75.c(ht.a.a, false);
                                            int iHashCode5 = Long.hashCode(aVar10.m());
                                            ne00 ne00VarO2 = aVar10.o();
                                            d dVarC9 = androidx.compose.ui.c.c(aVar10, dVarG4);
                                            if (aVar10.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar10.D();
                                            if (aVar10.g()) {
                                                aVar10.F(aVar9);
                                            } else {
                                                aVar10.p();
                                            }
                                            hlh0.a(aVar10, aivVarC5, bVar5);
                                            hlh0.a(aVar10, ne00VarO2, dVar2);
                                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar10, iHashCode5, c1350a3);
                                            }
                                            hlh0.a(aVar10, dVarC9, cVar3);
                                            aVar10.N(-1625593485);
                                            int i5 = 0;
                                            for (Object obj6 : list2) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z16 = z13;
                                                boolean z17 = z14;
                                                if (i5 != 0) {
                                                    if (i5 != 1) {
                                                        aVar10.N(-1025411112);
                                                        aVar10.H();
                                                        Unit unit6 = Unit.a;
                                                        aVar6 = aVar10;
                                                    } else {
                                                        aVar10.N(-171017816);
                                                        a aVar11 = aVar10;
                                                        hfg0.e(dw.a(abk0.a(aVar8, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar10, tournamentStatsData4, str2, z16, z17, aVar11, 0);
                                                        aVar6 = aVar11;
                                                        aVar6.H();
                                                        Unit unit7 = Unit.a;
                                                    }
                                                    f6 = f7;
                                                } else {
                                                    aVar6 = aVar10;
                                                    aVar6.N(-1011218041);
                                                    d dVarA5 = dw.a(abk0.a(aVar8, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                    LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                    ytw ytwVar14 = ytwVar10;
                                                    String str3 = (String) ytwVar14.getValue();
                                                    ytw ytwVar15 = ytwVar11;
                                                    String str4 = (String) ytwVar15.getValue();
                                                    ytw ytwVar16 = ytwVar12;
                                                    String str5 = (String) ytwVar16.getValue();
                                                    ytw ytwVar17 = ytwVar13;
                                                    String str6 = (String) ytwVar17.getValue();
                                                    neg0 neg0Var2 = neg0Var;
                                                    final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar14, ytwVar16, ytwVar15, ytwVar17);
                                                    final zhg0 zhg0Var4 = zhg0Var3;
                                                    boolean zA2 = aVar6.A(zhg0Var4) | aVar6.A(tournamentStatsData5);
                                                    Object objY15 = aVar6.y();
                                                    if (zA2 || objY15 == a.C0041a.a) {
                                                        objY15 = new Function0() { // from class: qeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                zhg0 zhg0Var5 = zhg0Var4;
                                                                ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar6.r(objY15);
                                                    }
                                                    f6 = 1.0f;
                                                    hfg0.a(dVarA5, zzrVar9, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar6, 0);
                                                    tournamentStatsData4 = tournamentStatsData5;
                                                    aVar6.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                neg0Var = this;
                                                aVar10 = aVar6;
                                                i5 = i6;
                                                f7 = f6;
                                                c = 709;
                                            }
                                            a aVar12 = aVar10;
                                            aVar12.H();
                                            aVar12.s();
                                            aVar12.s();
                                            c6n.b(function13, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), fw20.a(R.dimen._9sdp, aVar12)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar10, 196608, 28);
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar5), aVar5);
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    };
                    bVar = bVar3;
                    lig0.a(6, pp8.b(-1677248696, function12, bVar), bVar);
                    float fA6 = fw20.a(R.dimen._105sdp, bVar);
                    float fA7 = fw20.a(R.dimen._100sdp, bVar);
                    fA = fw20.a(R.dimen._minus60sdp, bVar);
                    if (z7) {
                        bVar.N(1969574340);
                        if (z) {
                            bVar.N(1969619445);
                            fA = fw20.a(R.dimen._minus35sdp, bVar);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(1969695829);
                            fA = fw20.a(R.dimen._minus50sdp, bVar);
                            bVar.X(false);
                        }
                    } else {
                        z8 = false;
                        bVar.N(1949021340);
                    }
                    bVar.X(z8);
                    String strA3 = pm5.TROPHY_IMAGE.a();
                    d dVarD3 = g.d(j.t(aVar4, fA6, fA7), 0.0f, fA, 1);
                    if (z7) {
                        f3 = 0.6f;
                    } else {
                        f3 = 1.0f;
                    }
                    fn80.a(strA3, "Trophy", bz60.a(dVarD3, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                    f30.a(bVar, true, true, true);
                } else {
                    bVar2 = bVarI;
                    z6 = true;
                    if (twd0Var2 != null) {
                    }
                    if (z) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    bVar3 = bVar2;
                    z7 = z11;
                    h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function10, function11, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                    d dVarB5 = androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.h);
                    zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                    objY6 = bVar3.y();
                    if (zM) {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar10 = ytwVar2;
                                if (!((Boolean) ytwVar10.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar10.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar10 = ytwVar2;
                                if (!((Boolean) ytwVar10.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar10.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    }
                    d dVarA5 = v.a(dVarB5, (Function1) objY6);
                    i78 i78VarA4 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                    iHashCode2 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS8 = bVar3.S();
                    d dVarC8 = androidx.compose.ui.c.c(bVar3, dVarA5);
                    bVar3.D();
                    if (bVar3.S) {
                        aVar3 = aVar2;
                        bVar3.F(aVar3);
                    } else {
                        aVar3 = aVar2;
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA4, bVar4);
                    hlh0.a(bVar3, ne00VarS8, dVar);
                    if (bVar3.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC8, cVar2);
                    d dVarG4 = j.g(aVar4, 1.0f);
                    aiv aivVarC5 = g75.c(ht.a.b, false);
                    iHashCode3 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS9 = bVar3.S();
                    d dVarC9 = androidx.compose.ui.c.c(bVar3, dVarG4);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC5, bVar4);
                    hlh0.a(bVar3, ne00VarS9, dVar);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC9, cVar2);
                    final zzr zzrVar9 = zzrVar;
                    final zzr zzrVar10 = zzrVar2;
                    final ytw ytwVar10 = ytwVar;
                    Function2 function13 = new Function2() { // from class: leg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar5 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Function0 function14 = function0;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final osw oswVar3 = oswVar;
                                final List list = listK;
                                final zzr zzrVar11 = zzrVar9;
                                final boolean z13 = z7;
                                final boolean z14 = z;
                                final boolean z15 = z2;
                                final zhg0 zhg0Var3 = zhg0Var;
                                final zzr zzrVar12 = zzrVar10;
                                final String str2 = strC;
                                final twd0 twd0Var3 = ytwVarA;
                                final ytw ytwVar11 = ytwVar6;
                                final ytw ytwVar12 = ytwVar10;
                                final ytw ytwVar13 = ytwVar3;
                                final ytw ytwVar14 = ytwVar4;
                                final dq40 dq40Var2 = dq40Var;
                                s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar6;
                                        float f6;
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d.a aVar8 = d.a.b;
                                            d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar7), 0.0f, 0.0f, 13);
                                            i78 i78VarA5 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                            int iHashCode4 = Long.hashCode(aVar7.m());
                                            ne00 ne00VarO = aVar7.o();
                                            d dVarC10 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                            yka.k.getClass();
                                            tsr.a aVar9 = yka.a.b;
                                            if (aVar7.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar7.D();
                                            if (aVar7.g()) {
                                                aVar7.F(aVar9);
                                            } else {
                                                aVar7.p();
                                            }
                                            yka.a.b bVar5 = yka.a.f;
                                            hlh0.a(aVar7, i78VarA5, bVar5);
                                            yka.a.d dVar2 = yka.a.e;
                                            hlh0.a(aVar7, ne00VarO, dVar2);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                            }
                                            yka.a.c cVar3 = yka.a.d;
                                            hlh0.a(aVar7, dVarC10, cVar3);
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                            lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar7.O(ni60.b)).f, R.dimen._16sdp, aVar7), aVar7, 384, 0, 65530);
                                            char c = 709;
                                            ty0.a(aVar7, j.i(aVar8, fw20.a(R.dimen._9sdp, aVar7)));
                                            neg0 neg0Var = this;
                                            final osw oswVar4 = oswVar3;
                                            int iD = oswVar4.D();
                                            long j = j58.l;
                                            op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    List list2 = (List) obj6;
                                                    ((Integer) obj8).getClass();
                                                    list2.getClass();
                                                    d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                    long j2 = a6g0.a;
                                                    i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                    return Unit.a;
                                                }
                                            }, aVar7);
                                            final List list2 = list;
                                            j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar10 = (a) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        final int i5 = 0;
                                                        for (Object obj8 : list2) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                b.q();
                                                                throw null;
                                                            }
                                                            final String str3 = (String) obj8;
                                                            final osw oswVar5 = oswVar4;
                                                            final boolean z16 = oswVar5.D() == i5;
                                                            boolean zD = aVar10.d(i5);
                                                            Object objY15 = aVar10.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zD || objY15 == c0042a2) {
                                                                objY15 = new Function0() { // from class: zeg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        oswVar5.k(i5);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY15);
                                                            }
                                                            Function0 function15 = (Function0) objY15;
                                                            boolean zB = aVar10.b(z16);
                                                            Object objY16 = aVar10.y();
                                                            if (zB || objY16 == c0042a2) {
                                                                objY16 = new Function1() { // from class: bfg0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj9) {
                                                                        tcf tcfVar = (tcf) obj9;
                                                                        tcfVar.getClass();
                                                                        if (!z16) {
                                                                            float fC2 = tcfVar.C1(1.5f);
                                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                            tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar10.r(objY16);
                                                            }
                                                            w1f0.b(z16, function15, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj9, Object obj10) {
                                                                    imf0 imf0VarG;
                                                                    a aVar11 = (a) obj9;
                                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                                    if (aVar11.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                        boolean z17 = z16;
                                                                        if (z17) {
                                                                            aVar11.N(-1289914155);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).d, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        } else {
                                                                            aVar11.N(-1289908779);
                                                                            imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).b, R.dimen._11ssp, aVar11);
                                                                            aVar11.H();
                                                                        }
                                                                        lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar11, 0, 0, 65530);
                                                                    } else {
                                                                        aVar11.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, aVar10), 0L, 0L, aVar10, 24576, 488);
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        aVar10.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar7), aVar7, 1597824, 42);
                                            a aVar10 = aVar7;
                                            float f7 = 1.0f;
                                            d dVarG5 = j.g(aVar8, 1.0f);
                                            aiv aivVarC6 = g75.c(ht.a.a, false);
                                            int iHashCode5 = Long.hashCode(aVar10.m());
                                            ne00 ne00VarO2 = aVar10.o();
                                            d dVarC11 = androidx.compose.ui.c.c(aVar10, dVarG5);
                                            if (aVar10.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar10.D();
                                            if (aVar10.g()) {
                                                aVar10.F(aVar9);
                                            } else {
                                                aVar10.p();
                                            }
                                            hlh0.a(aVar10, aivVarC6, bVar5);
                                            hlh0.a(aVar10, ne00VarO2, dVar2);
                                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar10, iHashCode5, c1350a3);
                                            }
                                            hlh0.a(aVar10, dVarC11, cVar3);
                                            aVar10.N(-1625593485);
                                            int i5 = 0;
                                            for (Object obj6 : list2) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z16 = z13;
                                                boolean z17 = z14;
                                                if (i5 != 0) {
                                                    if (i5 != 1) {
                                                        aVar10.N(-1025411112);
                                                        aVar10.H();
                                                        Unit unit6 = Unit.a;
                                                        aVar6 = aVar10;
                                                    } else {
                                                        aVar10.N(-171017816);
                                                        a aVar11 = aVar10;
                                                        hfg0.e(dw.a(abk0.a(aVar8, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar12, tournamentStatsData4, str2, z16, z17, aVar11, 0);
                                                        aVar6 = aVar11;
                                                        aVar6.H();
                                                        Unit unit7 = Unit.a;
                                                    }
                                                    f6 = f7;
                                                } else {
                                                    aVar6 = aVar10;
                                                    aVar6.N(-1011218041);
                                                    d dVarA6 = dw.a(abk0.a(aVar8, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                    LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                    ytw ytwVar15 = ytwVar11;
                                                    String str3 = (String) ytwVar15.getValue();
                                                    ytw ytwVar16 = ytwVar12;
                                                    String str4 = (String) ytwVar16.getValue();
                                                    ytw ytwVar17 = ytwVar13;
                                                    String str5 = (String) ytwVar17.getValue();
                                                    ytw ytwVar18 = ytwVar14;
                                                    String str6 = (String) ytwVar18.getValue();
                                                    neg0 neg0Var2 = neg0Var;
                                                    final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar15, ytwVar17, ytwVar16, ytwVar18);
                                                    final zhg0 zhg0Var4 = zhg0Var3;
                                                    boolean zA2 = aVar6.A(zhg0Var4) | aVar6.A(tournamentStatsData5);
                                                    Object objY15 = aVar6.y();
                                                    if (zA2 || objY15 == a.C0041a.a) {
                                                        objY15 = new Function0() { // from class: qeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                zhg0 zhg0Var5 = zhg0Var4;
                                                                ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar6.r(objY15);
                                                    }
                                                    f6 = 1.0f;
                                                    hfg0.a(dVarA6, zzrVar11, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar6, 0);
                                                    tournamentStatsData4 = tournamentStatsData5;
                                                    aVar6.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                neg0Var = this;
                                                aVar10 = aVar6;
                                                i5 = i6;
                                                f7 = f6;
                                                c = 709;
                                            }
                                            a aVar12 = aVar10;
                                            aVar12.H();
                                            aVar12.s();
                                            aVar12.s();
                                            c6n.b(function14, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), fw20.a(R.dimen._9sdp, aVar12)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar10, 196608, 28);
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar5), aVar5);
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    };
                    bVar = bVar3;
                    lig0.a(6, pp8.b(-1677248696, function13, bVar), bVar);
                    float fA8 = fw20.a(R.dimen._105sdp, bVar);
                    float fA9 = fw20.a(R.dimen._100sdp, bVar);
                    fA = fw20.a(R.dimen._minus60sdp, bVar);
                    if (z7) {
                        bVar.N(1969574340);
                        if (z) {
                            bVar.N(1969619445);
                            fA = fw20.a(R.dimen._minus35sdp, bVar);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(1969695829);
                            fA = fw20.a(R.dimen._minus50sdp, bVar);
                            bVar.X(false);
                        }
                    } else {
                        z8 = false;
                        bVar.N(1949021340);
                    }
                    bVar.X(z8);
                    String strA4 = pm5.TROPHY_IMAGE.a();
                    d dVarD4 = g.d(j.t(aVar4, fA8, fA9), 0.0f, fA, 1);
                    if (z7) {
                        f3 = 0.6f;
                    } else {
                        f3 = 1.0f;
                    }
                    fn80.a(strA4, "Trophy", bz60.a(dVarD4, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                    f30.a(bVar, true, true, true);
                }
                if (z) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                bVar3 = bVar2;
                z7 = z11;
                h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function10, function11, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                d dVarB6 = androidx.compose.foundation.layout.d.a.b(j.g(aVar4, 1.0f), ht.a.h);
                zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                objY6 = bVar3.y();
                if (zM) {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar11 = ytwVar2;
                            if (!((Boolean) ytwVar11.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar11.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar11 = ytwVar2;
                            if (!((Boolean) ytwVar11.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar11.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                }
                d dVarA6 = v.a(dVarB6, (Function1) objY6);
                i78 i78VarA5 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                iHashCode2 = Long.hashCode(bVar3.m());
                ne00 ne00VarS10 = bVar3.S();
                d dVarC10 = androidx.compose.ui.c.c(bVar3, dVarA6);
                bVar3.D();
                if (bVar3.S) {
                    aVar3 = aVar2;
                    bVar3.F(aVar3);
                } else {
                    aVar3 = aVar2;
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA5, bVar4);
                hlh0.a(bVar3, ne00VarS10, dVar);
                if (bVar3.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                }
                hlh0.a(bVar3, dVarC10, cVar2);
                d dVarG5 = j.g(aVar4, 1.0f);
                aiv aivVarC6 = g75.c(ht.a.b, false);
                iHashCode3 = Long.hashCode(bVar3.m());
                ne00 ne00VarS11 = bVar3.S();
                d dVarC11 = androidx.compose.ui.c.c(bVar3, dVarG5);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC6, bVar4);
                hlh0.a(bVar3, ne00VarS11, dVar);
                if (bVar3.S) {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                }
                hlh0.a(bVar3, dVarC11, cVar2);
                final zzr zzrVar11 = zzrVar;
                final zzr zzrVar12 = zzrVar2;
                final ytw ytwVar11 = ytwVar;
                Function2 function14 = new Function2() { // from class: leg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar5 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Function0 function15 = function0;
                            final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                            final osw oswVar3 = oswVar;
                            final List list = listK;
                            final zzr zzrVar13 = zzrVar11;
                            final boolean z13 = z7;
                            final boolean z14 = z;
                            final boolean z15 = z2;
                            final zhg0 zhg0Var3 = zhg0Var;
                            final zzr zzrVar14 = zzrVar12;
                            final String str2 = strC;
                            final twd0 twd0Var3 = ytwVarA;
                            final ytw ytwVar12 = ytwVar6;
                            final ytw ytwVar13 = ytwVar11;
                            final ytw ytwVar14 = ytwVar3;
                            final ytw ytwVar15 = ytwVar4;
                            final dq40 dq40Var2 = dq40Var;
                            s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar6;
                                    float f6;
                                    a aVar7 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar8 = d.a.b;
                                        d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar7), 0.0f, 0.0f, 13);
                                        i78 i78VarA6 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                        int iHashCode4 = Long.hashCode(aVar7.m());
                                        ne00 ne00VarO = aVar7.o();
                                        d dVarC12 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                        yka.k.getClass();
                                        tsr.a aVar9 = yka.a.b;
                                        if (aVar7.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar7.D();
                                        if (aVar7.g()) {
                                            aVar7.F(aVar9);
                                        } else {
                                            aVar7.p();
                                        }
                                        yka.a.b bVar5 = yka.a.f;
                                        hlh0.a(aVar7, i78VarA6, bVar5);
                                        yka.a.d dVar2 = yka.a.e;
                                        hlh0.a(aVar7, ne00VarO, dVar2);
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                        }
                                        yka.a.c cVar3 = yka.a.d;
                                        hlh0.a(aVar7, dVarC12, cVar3);
                                        TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                        TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                        lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar7.O(ni60.b)).f, R.dimen._16sdp, aVar7), aVar7, 384, 0, 65530);
                                        char c = 709;
                                        ty0.a(aVar7, j.i(aVar8, fw20.a(R.dimen._9sdp, aVar7)));
                                        neg0 neg0Var = this;
                                        final osw oswVar4 = oswVar3;
                                        int iD = oswVar4.D();
                                        long j = j58.l;
                                        op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                List list2 = (List) obj6;
                                                ((Integer) obj8).getClass();
                                                list2.getClass();
                                                d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                long j2 = a6g0.a;
                                                i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                return Unit.a;
                                            }
                                        }, aVar7);
                                        final List list2 = list;
                                        j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                a aVar10 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    final int i5 = 0;
                                                    for (Object obj8 : list2) {
                                                        int i6 = i5 + 1;
                                                        if (i5 < 0) {
                                                            b.q();
                                                            throw null;
                                                        }
                                                        final String str3 = (String) obj8;
                                                        final osw oswVar5 = oswVar4;
                                                        final boolean z16 = oswVar5.D() == i5;
                                                        boolean zD = aVar10.d(i5);
                                                        Object objY15 = aVar10.y();
                                                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                        if (zD || objY15 == c0042a2) {
                                                            objY15 = new Function0() { // from class: zeg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    oswVar5.k(i5);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar10.r(objY15);
                                                        }
                                                        Function0 function16 = (Function0) objY15;
                                                        boolean zB = aVar10.b(z16);
                                                        Object objY16 = aVar10.y();
                                                        if (zB || objY16 == c0042a2) {
                                                            objY16 = new Function1() { // from class: bfg0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj9) {
                                                                    tcf tcfVar = (tcf) obj9;
                                                                    tcfVar.getClass();
                                                                    if (!z16) {
                                                                        float fC2 = tcfVar.C1(1.5f);
                                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                        tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar10.r(objY16);
                                                        }
                                                        w1f0.b(z16, function16, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                imf0 imf0VarG;
                                                                a aVar11 = (a) obj9;
                                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                                if (aVar11.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                    boolean z17 = z16;
                                                                    if (z17) {
                                                                        aVar11.N(-1289914155);
                                                                        imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).d, R.dimen._11ssp, aVar11);
                                                                        aVar11.H();
                                                                    } else {
                                                                        aVar11.N(-1289908779);
                                                                        imf0VarG = ni60.g(((sfd0) aVar11.O(ni60.b)).b, R.dimen._11ssp, aVar11);
                                                                        aVar11.H();
                                                                    }
                                                                    lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar11, 0, 0, 65530);
                                                                } else {
                                                                    aVar11.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, aVar10), 0L, 0L, aVar10, 24576, 488);
                                                        i5 = i6;
                                                    }
                                                } else {
                                                    aVar10.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar7), aVar7, 1597824, 42);
                                        a aVar10 = aVar7;
                                        float f7 = 1.0f;
                                        d dVarG6 = j.g(aVar8, 1.0f);
                                        aiv aivVarC7 = g75.c(ht.a.a, false);
                                        int iHashCode5 = Long.hashCode(aVar10.m());
                                        ne00 ne00VarO2 = aVar10.o();
                                        d dVarC13 = androidx.compose.ui.c.c(aVar10, dVarG6);
                                        if (aVar10.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar10.D();
                                        if (aVar10.g()) {
                                            aVar10.F(aVar9);
                                        } else {
                                            aVar10.p();
                                        }
                                        hlh0.a(aVar10, aivVarC7, bVar5);
                                        hlh0.a(aVar10, ne00VarO2, dVar2);
                                        if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar10, iHashCode5, c1350a3);
                                        }
                                        hlh0.a(aVar10, dVarC13, cVar3);
                                        aVar10.N(-1625593485);
                                        int i5 = 0;
                                        for (Object obj6 : list2) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            boolean z16 = z13;
                                            boolean z17 = z14;
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    aVar10.N(-1025411112);
                                                    aVar10.H();
                                                    Unit unit6 = Unit.a;
                                                    aVar6 = aVar10;
                                                } else {
                                                    aVar10.N(-171017816);
                                                    a aVar11 = aVar10;
                                                    hfg0.e(dw.a(abk0.a(aVar8, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar14, tournamentStatsData4, str2, z16, z17, aVar11, 0);
                                                    aVar6 = aVar11;
                                                    aVar6.H();
                                                    Unit unit7 = Unit.a;
                                                }
                                                f6 = f7;
                                            } else {
                                                aVar6 = aVar10;
                                                aVar6.N(-1011218041);
                                                d dVarA7 = dw.a(abk0.a(aVar8, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                ytw ytwVar16 = ytwVar12;
                                                String str3 = (String) ytwVar16.getValue();
                                                ytw ytwVar17 = ytwVar13;
                                                String str4 = (String) ytwVar17.getValue();
                                                ytw ytwVar18 = ytwVar14;
                                                String str5 = (String) ytwVar18.getValue();
                                                ytw ytwVar19 = ytwVar15;
                                                String str6 = (String) ytwVar19.getValue();
                                                neg0 neg0Var2 = neg0Var;
                                                final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar16, ytwVar18, ytwVar17, ytwVar19);
                                                final zhg0 zhg0Var4 = zhg0Var3;
                                                boolean zA2 = aVar6.A(zhg0Var4) | aVar6.A(tournamentStatsData5);
                                                Object objY15 = aVar6.y();
                                                if (zA2 || objY15 == a.C0041a.a) {
                                                    objY15 = new Function0() { // from class: qeg0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                            zhg0 zhg0Var5 = zhg0Var4;
                                                            ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar6.r(objY15);
                                                }
                                                f6 = 1.0f;
                                                hfg0.a(dVarA7, zzrVar13, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar6, 0);
                                                tournamentStatsData4 = tournamentStatsData5;
                                                aVar6.H();
                                                Unit unit8 = Unit.a;
                                            }
                                            neg0Var = this;
                                            aVar10 = aVar6;
                                            i5 = i6;
                                            f7 = f6;
                                            c = 709;
                                        }
                                        a aVar12 = aVar10;
                                        aVar12.H();
                                        aVar12.s();
                                        aVar12.s();
                                        c6n.b(function15, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), fw20.a(R.dimen._9sdp, aVar12)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar10, 196608, 28);
                                    } else {
                                        aVar7.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), aVar5);
                        } else {
                            aVar5.G();
                        }
                        return Unit.a;
                    }
                };
                bVar = bVar3;
                lig0.a(6, pp8.b(-1677248696, function14, bVar), bVar);
                float fA10 = fw20.a(R.dimen._105sdp, bVar);
                float fA11 = fw20.a(R.dimen._100sdp, bVar);
                fA = fw20.a(R.dimen._minus60sdp, bVar);
                if (z7) {
                    bVar.N(1969574340);
                    if (z) {
                        bVar.N(1969619445);
                        fA = fw20.a(R.dimen._minus35sdp, bVar);
                        z8 = false;
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(1969695829);
                        fA = fw20.a(R.dimen._minus50sdp, bVar);
                        bVar.X(false);
                    }
                } else {
                    z8 = false;
                    bVar.N(1949021340);
                }
                bVar.X(z8);
                String strA5 = pm5.TROPHY_IMAGE.a();
                d dVarD5 = g.d(j.t(aVar4, fA10, fA11), 0.0f, fA, 1);
                if (z7) {
                    f3 = 0.6f;
                } else {
                    f3 = 1.0f;
                }
                fn80.a(strA5, "Trophy", bz60.a(dVarD5, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                f30.a(bVar, true, true, true);
            }
            if (twd0Var2 == null || (composeCashOutModel3 = (ComposeCashOutModel) twd0Var2.getValue()) == null || composeCashOutModel3.getShowCashout1() != z3) {
            }
            d.a aVar5 = d.a.b;
            d dVarB7 = androidx.compose.foundation.a.b(j.e(aVar5, 1.0f), a6g0.p, zk40.a);
            Unit unit6 = Unit.a;
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = ofg0.a;
                bVarI.r(objY);
            }
            d dVarA7 = wje0.a(dVarB7, unit6, (PointerInputEventHandler) objY);
            aiv aivVarC7 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS12 = bVarI.S();
            d dVarC12 = androidx.compose.ui.c.c(bVarI, dVarA7);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar5 = yka.a.f;
            hlh0.a(bVarI, aivVarC7, bVar5);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS12, dVar2);
            c1350a = yka.a.g;
            if (bVarI.S) {
                ytwVar = ytwVar5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar3 = yka.a.d;
                hlh0.a(bVarI, dVarC12, cVar3);
                Configuration configuration3 = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
                fC1 = ((mmd) bVarI.O(kna.h)).C1(configuration3.screenHeightDp);
                Object[] objArr5 = new Object[0];
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new feg0();
                    bVarI.r(objY2);
                }
                iswVar = (isw) o350.e(objArr5, (Function0) objY2, bVarI, 48);
                Object[] objArr6 = {Integer.valueOf(configuration3.orientation)};
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new z0r(1);
                    bVarI.r(objY3);
                }
                ytwVar2 = (ytw) o350.e(objArr6, (Function0) objY3, bVarI, 48);
                if (twd0Var != null) {
                    coefficientText = "";
                } else {
                    coefficientText = "";
                }
                if (twd0Var != null) {
                    j58VarM53getTextColorQN2ZGVo = null;
                } else {
                    j58VarM53getTextColorQN2ZGVo = null;
                }
                if ((i3 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY4 = bVarI.y();
                if (z4) {
                    objY4 = new nm3(function1, 3);
                    bVarI.r(objY4);
                } else {
                    objY4 = new nm3(function1, 3);
                    bVarI.r(objY4);
                }
                Function0 function15 = (Function0) objY4;
                if ((i3 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objY5 = bVarI.y();
                if (z5) {
                    objY5 = new sm3(2, function2);
                    bVarI.r(objY5);
                } else {
                    objY5 = new sm3(2, function2);
                    bVarI.r(objY5);
                }
                Function0 function16 = (Function0) objY5;
                if (twd0Var2 != null) {
                    bVar2 = bVarI;
                    z6 = true;
                    if (twd0Var2 != null) {
                    }
                    if (z) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    bVar3 = bVar2;
                    z7 = z11;
                    h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function15, function16, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                    d dVarB8 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
                    zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                    objY6 = bVar3.y();
                    if (zM) {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar12 = ytwVar2;
                                if (!((Boolean) ytwVar12.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar12.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar12 = ytwVar2;
                                if (!((Boolean) ytwVar12.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar12.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    }
                    d dVarA8 = v.a(dVarB8, (Function1) objY6);
                    i78 i78VarA6 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                    iHashCode2 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS13 = bVar3.S();
                    d dVarC13 = androidx.compose.ui.c.c(bVar3, dVarA8);
                    bVar3.D();
                    if (bVar3.S) {
                        aVar3 = aVar2;
                        bVar3.F(aVar3);
                    } else {
                        aVar3 = aVar2;
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA6, bVar5);
                    hlh0.a(bVar3, ne00VarS13, dVar2);
                    if (bVar3.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC13, cVar3);
                    d dVarG6 = j.g(aVar5, 1.0f);
                    aiv aivVarC8 = g75.c(ht.a.b, false);
                    iHashCode3 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS14 = bVar3.S();
                    d dVarC14 = androidx.compose.ui.c.c(bVar3, dVarG6);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC8, bVar5);
                    hlh0.a(bVar3, ne00VarS14, dVar2);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC14, cVar3);
                    final zzr zzrVar13 = zzrVar;
                    final zzr zzrVar14 = zzrVar2;
                    final ytw ytwVar12 = ytwVar;
                    Function2 function17 = new Function2() { // from class: leg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar6 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Function0 function18 = function0;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final osw oswVar3 = oswVar;
                                final List list = listK;
                                final zzr zzrVar15 = zzrVar13;
                                final boolean z13 = z7;
                                final boolean z14 = z;
                                final boolean z15 = z2;
                                final zhg0 zhg0Var3 = zhg0Var;
                                final zzr zzrVar16 = zzrVar14;
                                final String str2 = strC;
                                final twd0 twd0Var3 = ytwVarA;
                                final ytw ytwVar13 = ytwVar6;
                                final ytw ytwVar14 = ytwVar12;
                                final ytw ytwVar15 = ytwVar3;
                                final ytw ytwVar16 = ytwVar4;
                                final dq40 dq40Var2 = dq40Var;
                                s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar7;
                                        float f6;
                                        a aVar8 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d.a aVar9 = d.a.b;
                                            d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                            i78 i78VarA7 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                            int iHashCode4 = Long.hashCode(aVar8.m());
                                            ne00 ne00VarO = aVar8.o();
                                            d dVarC15 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                            yka.k.getClass();
                                            tsr.a aVar10 = yka.a.b;
                                            if (aVar8.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar8.D();
                                            if (aVar8.g()) {
                                                aVar8.F(aVar10);
                                            } else {
                                                aVar8.p();
                                            }
                                            yka.a.b bVar6 = yka.a.f;
                                            hlh0.a(aVar8, i78VarA7, bVar6);
                                            yka.a.d dVar3 = yka.a.e;
                                            hlh0.a(aVar8, ne00VarO, dVar3);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                            }
                                            yka.a.c cVar4 = yka.a.d;
                                            hlh0.a(aVar8, dVarC15, cVar4);
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                            lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                            char c = 709;
                                            ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                            neg0 neg0Var = this;
                                            final osw oswVar4 = oswVar3;
                                            int iD = oswVar4.D();
                                            long j = j58.l;
                                            op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    List list2 = (List) obj6;
                                                    ((Integer) obj8).getClass();
                                                    list2.getClass();
                                                    d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                    long j2 = a6g0.a;
                                                    i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                    return Unit.a;
                                                }
                                            }, aVar8);
                                            final List list2 = list;
                                            j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar11 = (a) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        final int i5 = 0;
                                                        for (Object obj8 : list2) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                b.q();
                                                                throw null;
                                                            }
                                                            final String str3 = (String) obj8;
                                                            final osw oswVar5 = oswVar4;
                                                            final boolean z16 = oswVar5.D() == i5;
                                                            boolean zD = aVar11.d(i5);
                                                            Object objY15 = aVar11.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zD || objY15 == c0042a2) {
                                                                objY15 = new Function0() { // from class: zeg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        oswVar5.k(i5);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar11.r(objY15);
                                                            }
                                                            Function0 function19 = (Function0) objY15;
                                                            boolean zB = aVar11.b(z16);
                                                            Object objY16 = aVar11.y();
                                                            if (zB || objY16 == c0042a2) {
                                                                objY16 = new Function1() { // from class: bfg0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj9) {
                                                                        tcf tcfVar = (tcf) obj9;
                                                                        tcfVar.getClass();
                                                                        if (!z16) {
                                                                            float fC2 = tcfVar.C1(1.5f);
                                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                            tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar11.r(objY16);
                                                            }
                                                            w1f0.b(z16, function19, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj9, Object obj10) {
                                                                    imf0 imf0VarG;
                                                                    a aVar12 = (a) obj9;
                                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                                    if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                        boolean z17 = z16;
                                                                        if (z17) {
                                                                            aVar12.N(-1289914155);
                                                                            imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                            aVar12.H();
                                                                        } else {
                                                                            aVar12.N(-1289908779);
                                                                            imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                            aVar12.H();
                                                                        }
                                                                        lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                                    } else {
                                                                        aVar12.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        aVar11.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar8), aVar8, 1597824, 42);
                                            a aVar11 = aVar8;
                                            float f7 = 1.0f;
                                            d dVarG7 = j.g(aVar9, 1.0f);
                                            aiv aivVarC9 = g75.c(ht.a.a, false);
                                            int iHashCode5 = Long.hashCode(aVar11.m());
                                            ne00 ne00VarO2 = aVar11.o();
                                            d dVarC16 = androidx.compose.ui.c.c(aVar11, dVarG7);
                                            if (aVar11.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar11.D();
                                            if (aVar11.g()) {
                                                aVar11.F(aVar10);
                                            } else {
                                                aVar11.p();
                                            }
                                            hlh0.a(aVar11, aivVarC9, bVar6);
                                            hlh0.a(aVar11, ne00VarO2, dVar3);
                                            if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                            }
                                            hlh0.a(aVar11, dVarC16, cVar4);
                                            aVar11.N(-1625593485);
                                            int i5 = 0;
                                            for (Object obj6 : list2) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z16 = z13;
                                                boolean z17 = z14;
                                                if (i5 != 0) {
                                                    if (i5 != 1) {
                                                        aVar11.N(-1025411112);
                                                        aVar11.H();
                                                        Unit unit7 = Unit.a;
                                                        aVar7 = aVar11;
                                                    } else {
                                                        aVar11.N(-171017816);
                                                        a aVar12 = aVar11;
                                                        hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar16, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                        aVar7 = aVar12;
                                                        aVar7.H();
                                                        Unit unit8 = Unit.a;
                                                    }
                                                    f6 = f7;
                                                } else {
                                                    aVar7 = aVar11;
                                                    aVar7.N(-1011218041);
                                                    d dVarA9 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                    LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                    ytw ytwVar17 = ytwVar13;
                                                    String str3 = (String) ytwVar17.getValue();
                                                    ytw ytwVar18 = ytwVar14;
                                                    String str4 = (String) ytwVar18.getValue();
                                                    ytw ytwVar19 = ytwVar15;
                                                    String str5 = (String) ytwVar19.getValue();
                                                    ytw ytwVar110 = ytwVar16;
                                                    String str6 = (String) ytwVar110.getValue();
                                                    neg0 neg0Var2 = neg0Var;
                                                    final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar17, ytwVar19, ytwVar18, ytwVar110);
                                                    final zhg0 zhg0Var4 = zhg0Var3;
                                                    boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                                    Object objY15 = aVar7.y();
                                                    if (zA2 || objY15 == a.C0041a.a) {
                                                        objY15 = new Function0() { // from class: qeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                zhg0 zhg0Var5 = zhg0Var4;
                                                                ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar7.r(objY15);
                                                    }
                                                    f6 = 1.0f;
                                                    hfg0.a(dVarA9, zzrVar15, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                                    tournamentStatsData4 = tournamentStatsData5;
                                                    aVar7.H();
                                                    Unit unit9 = Unit.a;
                                                }
                                                neg0Var = this;
                                                aVar11 = aVar7;
                                                i5 = i6;
                                                f7 = f6;
                                                c = 709;
                                            }
                                            a aVar13 = aVar11;
                                            aVar13.H();
                                            aVar13.s();
                                            aVar13.s();
                                            c6n.b(function18, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                        } else {
                                            aVar8.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar6), aVar6);
                            } else {
                                aVar6.G();
                            }
                            return Unit.a;
                        }
                    };
                    bVar = bVar3;
                    lig0.a(6, pp8.b(-1677248696, function17, bVar), bVar);
                    float fA12 = fw20.a(R.dimen._105sdp, bVar);
                    float fA13 = fw20.a(R.dimen._100sdp, bVar);
                    fA = fw20.a(R.dimen._minus60sdp, bVar);
                    if (z7) {
                        bVar.N(1969574340);
                        if (z) {
                            bVar.N(1969619445);
                            fA = fw20.a(R.dimen._minus35sdp, bVar);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(1969695829);
                            fA = fw20.a(R.dimen._minus50sdp, bVar);
                            bVar.X(false);
                        }
                    } else {
                        z8 = false;
                        bVar.N(1949021340);
                    }
                    bVar.X(z8);
                    String strA6 = pm5.TROPHY_IMAGE.a();
                    d dVarD6 = g.d(j.t(aVar5, fA12, fA13), 0.0f, fA, 1);
                    if (z7) {
                        f3 = 0.6f;
                    } else {
                        f3 = 1.0f;
                    }
                    fn80.a(strA6, "Trophy", bz60.a(dVarD6, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                    f30.a(bVar, true, true, true);
                } else {
                    bVar2 = bVarI;
                    z6 = true;
                    if (twd0Var2 != null) {
                    }
                    if (z) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    bVar3 = bVar2;
                    z7 = z11;
                    h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function15, function16, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                    d dVarB9 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
                    zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                    objY6 = bVar3.y();
                    if (zM) {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar13 = ytwVar2;
                                if (!((Boolean) ytwVar13.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar13.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jeg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                urr urrVar = (urr) obj2;
                                urrVar.getClass();
                                ytw ytwVar13 = ytwVar2;
                                if (!((Boolean) ytwVar13.getValue()).booleanValue()) {
                                    float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                    isw iswVar2 = iswVar;
                                    if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                        iswVar2.A(fD);
                                    }
                                    ytwVar13.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY6);
                    }
                    d dVarA9 = v.a(dVarB9, (Function1) objY6);
                    i78 i78VarA7 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                    iHashCode2 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS15 = bVar3.S();
                    d dVarC15 = androidx.compose.ui.c.c(bVar3, dVarA9);
                    bVar3.D();
                    if (bVar3.S) {
                        aVar3 = aVar2;
                        bVar3.F(aVar3);
                    } else {
                        aVar3 = aVar2;
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA7, bVar5);
                    hlh0.a(bVar3, ne00VarS15, dVar2);
                    if (bVar3.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC15, cVar3);
                    d dVarG7 = j.g(aVar5, 1.0f);
                    aiv aivVarC9 = g75.c(ht.a.b, false);
                    iHashCode3 = Long.hashCode(bVar3.m());
                    ne00 ne00VarS16 = bVar3.S();
                    d dVarC16 = androidx.compose.ui.c.c(bVar3, dVarG7);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC9, bVar5);
                    hlh0.a(bVar3, ne00VarS16, dVar2);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC16, cVar3);
                    final zzr zzrVar15 = zzrVar;
                    final zzr zzrVar16 = zzrVar2;
                    final ytw ytwVar13 = ytwVar;
                    Function2 function18 = new Function2() { // from class: leg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar6 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Function0 function19 = function0;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final osw oswVar3 = oswVar;
                                final List list = listK;
                                final zzr zzrVar17 = zzrVar15;
                                final boolean z13 = z7;
                                final boolean z14 = z;
                                final boolean z15 = z2;
                                final zhg0 zhg0Var3 = zhg0Var;
                                final zzr zzrVar18 = zzrVar16;
                                final String str2 = strC;
                                final twd0 twd0Var3 = ytwVarA;
                                final ytw ytwVar14 = ytwVar6;
                                final ytw ytwVar15 = ytwVar13;
                                final ytw ytwVar16 = ytwVar3;
                                final ytw ytwVar17 = ytwVar4;
                                final dq40 dq40Var2 = dq40Var;
                                s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar7;
                                        float f6;
                                        a aVar8 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d.a aVar9 = d.a.b;
                                            d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                            i78 i78VarA8 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                            int iHashCode4 = Long.hashCode(aVar8.m());
                                            ne00 ne00VarO = aVar8.o();
                                            d dVarC17 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                            yka.k.getClass();
                                            tsr.a aVar10 = yka.a.b;
                                            if (aVar8.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar8.D();
                                            if (aVar8.g()) {
                                                aVar8.F(aVar10);
                                            } else {
                                                aVar8.p();
                                            }
                                            yka.a.b bVar6 = yka.a.f;
                                            hlh0.a(aVar8, i78VarA8, bVar6);
                                            yka.a.d dVar3 = yka.a.e;
                                            hlh0.a(aVar8, ne00VarO, dVar3);
                                            yka.a.C1350a c1350a3 = yka.a.g;
                                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                                j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                            }
                                            yka.a.c cVar4 = yka.a.d;
                                            hlh0.a(aVar8, dVarC17, cVar4);
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                            lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                            char c = 709;
                                            ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                            neg0 neg0Var = this;
                                            final osw oswVar4 = oswVar3;
                                            int iD = oswVar4.D();
                                            long j = j58.l;
                                            op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    List list2 = (List) obj6;
                                                    ((Integer) obj8).getClass();
                                                    list2.getClass();
                                                    d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                    long j2 = a6g0.a;
                                                    i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                    return Unit.a;
                                                }
                                            }, aVar8);
                                            final List list2 = list;
                                            j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar11 = (a) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        final int i5 = 0;
                                                        for (Object obj8 : list2) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                b.q();
                                                                throw null;
                                                            }
                                                            final String str3 = (String) obj8;
                                                            final osw oswVar5 = oswVar4;
                                                            final boolean z16 = oswVar5.D() == i5;
                                                            boolean zD = aVar11.d(i5);
                                                            Object objY15 = aVar11.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zD || objY15 == c0042a2) {
                                                                objY15 = new Function0() { // from class: zeg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        oswVar5.k(i5);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar11.r(objY15);
                                                            }
                                                            Function0 function110 = (Function0) objY15;
                                                            boolean zB = aVar11.b(z16);
                                                            Object objY16 = aVar11.y();
                                                            if (zB || objY16 == c0042a2) {
                                                                objY16 = new Function1() { // from class: bfg0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj9) {
                                                                        tcf tcfVar = (tcf) obj9;
                                                                        tcfVar.getClass();
                                                                        if (!z16) {
                                                                            float fC2 = tcfVar.C1(1.5f);
                                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                            tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar11.r(objY16);
                                                            }
                                                            w1f0.b(z16, function110, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj9, Object obj10) {
                                                                    imf0 imf0VarG;
                                                                    a aVar12 = (a) obj9;
                                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                                    if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                        boolean z17 = z16;
                                                                        if (z17) {
                                                                            aVar12.N(-1289914155);
                                                                            imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                            aVar12.H();
                                                                        } else {
                                                                            aVar12.N(-1289908779);
                                                                            imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                            aVar12.H();
                                                                        }
                                                                        lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                                    } else {
                                                                        aVar12.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                            i5 = i6;
                                                        }
                                                    } else {
                                                        aVar11.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar8), aVar8, 1597824, 42);
                                            a aVar11 = aVar8;
                                            float f7 = 1.0f;
                                            d dVarG8 = j.g(aVar9, 1.0f);
                                            aiv aivVarC10 = g75.c(ht.a.a, false);
                                            int iHashCode5 = Long.hashCode(aVar11.m());
                                            ne00 ne00VarO2 = aVar11.o();
                                            d dVarC18 = androidx.compose.ui.c.c(aVar11, dVarG8);
                                            if (aVar11.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar11.D();
                                            if (aVar11.g()) {
                                                aVar11.F(aVar10);
                                            } else {
                                                aVar11.p();
                                            }
                                            hlh0.a(aVar11, aivVarC10, bVar6);
                                            hlh0.a(aVar11, ne00VarO2, dVar3);
                                            if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                                j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                            }
                                            hlh0.a(aVar11, dVarC18, cVar4);
                                            aVar11.N(-1625593485);
                                            int i5 = 0;
                                            for (Object obj6 : list2) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z16 = z13;
                                                boolean z17 = z14;
                                                if (i5 != 0) {
                                                    if (i5 != 1) {
                                                        aVar11.N(-1025411112);
                                                        aVar11.H();
                                                        Unit unit7 = Unit.a;
                                                        aVar7 = aVar11;
                                                    } else {
                                                        aVar11.N(-171017816);
                                                        a aVar12 = aVar11;
                                                        hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar18, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                        aVar7 = aVar12;
                                                        aVar7.H();
                                                        Unit unit8 = Unit.a;
                                                    }
                                                    f6 = f7;
                                                } else {
                                                    aVar7 = aVar11;
                                                    aVar7.N(-1011218041);
                                                    d dVarA10 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                    LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                    ytw ytwVar18 = ytwVar14;
                                                    String str3 = (String) ytwVar18.getValue();
                                                    ytw ytwVar19 = ytwVar15;
                                                    String str4 = (String) ytwVar19.getValue();
                                                    ytw ytwVar110 = ytwVar16;
                                                    String str5 = (String) ytwVar110.getValue();
                                                    ytw ytwVar111 = ytwVar17;
                                                    String str6 = (String) ytwVar111.getValue();
                                                    neg0 neg0Var2 = neg0Var;
                                                    final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar18, ytwVar110, ytwVar19, ytwVar111);
                                                    final zhg0 zhg0Var4 = zhg0Var3;
                                                    boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                                    Object objY15 = aVar7.y();
                                                    if (zA2 || objY15 == a.C0041a.a) {
                                                        objY15 = new Function0() { // from class: qeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                                zhg0 zhg0Var5 = zhg0Var4;
                                                                ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar7.r(objY15);
                                                    }
                                                    f6 = 1.0f;
                                                    hfg0.a(dVarA10, zzrVar17, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                                    tournamentStatsData4 = tournamentStatsData5;
                                                    aVar7.H();
                                                    Unit unit9 = Unit.a;
                                                }
                                                neg0Var = this;
                                                aVar11 = aVar7;
                                                i5 = i6;
                                                f7 = f6;
                                                c = 709;
                                            }
                                            a aVar13 = aVar11;
                                            aVar13.H();
                                            aVar13.s();
                                            aVar13.s();
                                            c6n.b(function19, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                        } else {
                                            aVar8.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar6), aVar6);
                            } else {
                                aVar6.G();
                            }
                            return Unit.a;
                        }
                    };
                    bVar = bVar3;
                    lig0.a(6, pp8.b(-1677248696, function18, bVar), bVar);
                    float fA14 = fw20.a(R.dimen._105sdp, bVar);
                    float fA15 = fw20.a(R.dimen._100sdp, bVar);
                    fA = fw20.a(R.dimen._minus60sdp, bVar);
                    if (z7) {
                        bVar.N(1969574340);
                        if (z) {
                            bVar.N(1969619445);
                            fA = fw20.a(R.dimen._minus35sdp, bVar);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(1969695829);
                            fA = fw20.a(R.dimen._minus50sdp, bVar);
                            bVar.X(false);
                        }
                    } else {
                        z8 = false;
                        bVar.N(1949021340);
                    }
                    bVar.X(z8);
                    String strA7 = pm5.TROPHY_IMAGE.a();
                    d dVarD7 = g.d(j.t(aVar5, fA14, fA15), 0.0f, fA, 1);
                    if (z7) {
                        f3 = 0.6f;
                    } else {
                        f3 = 1.0f;
                    }
                    fn80.a(strA7, "Trophy", bz60.a(dVarD7, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                    f30.a(bVar, true, true, true);
                }
                if (z) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                bVar3 = bVar2;
                z7 = z11;
                h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function15, function16, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                d dVarB10 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
                zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                objY6 = bVar3.y();
                if (zM) {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar14 = ytwVar2;
                            if (!((Boolean) ytwVar14.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar14.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar14 = ytwVar2;
                            if (!((Boolean) ytwVar14.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar14.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                }
                d dVarA10 = v.a(dVarB10, (Function1) objY6);
                i78 i78VarA8 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                iHashCode2 = Long.hashCode(bVar3.m());
                ne00 ne00VarS17 = bVar3.S();
                d dVarC17 = androidx.compose.ui.c.c(bVar3, dVarA10);
                bVar3.D();
                if (bVar3.S) {
                    aVar3 = aVar2;
                    bVar3.F(aVar3);
                } else {
                    aVar3 = aVar2;
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA8, bVar5);
                hlh0.a(bVar3, ne00VarS17, dVar2);
                if (bVar3.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                }
                hlh0.a(bVar3, dVarC17, cVar3);
                d dVarG8 = j.g(aVar5, 1.0f);
                aiv aivVarC10 = g75.c(ht.a.b, false);
                iHashCode3 = Long.hashCode(bVar3.m());
                ne00 ne00VarS18 = bVar3.S();
                d dVarC18 = androidx.compose.ui.c.c(bVar3, dVarG8);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC10, bVar5);
                hlh0.a(bVar3, ne00VarS18, dVar2);
                if (bVar3.S) {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                }
                hlh0.a(bVar3, dVarC18, cVar3);
                final zzr zzrVar17 = zzrVar;
                final zzr zzrVar18 = zzrVar2;
                final ytw ytwVar14 = ytwVar;
                Function2 function19 = new Function2() { // from class: leg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Function0 function110 = function0;
                            final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                            final osw oswVar3 = oswVar;
                            final List list = listK;
                            final zzr zzrVar19 = zzrVar17;
                            final boolean z13 = z7;
                            final boolean z14 = z;
                            final boolean z15 = z2;
                            final zhg0 zhg0Var3 = zhg0Var;
                            final zzr zzrVar110 = zzrVar18;
                            final String str2 = strC;
                            final twd0 twd0Var3 = ytwVarA;
                            final ytw ytwVar15 = ytwVar6;
                            final ytw ytwVar16 = ytwVar14;
                            final ytw ytwVar17 = ytwVar3;
                            final ytw ytwVar18 = ytwVar4;
                            final dq40 dq40Var2 = dq40Var;
                            s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar7;
                                    float f6;
                                    a aVar8 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar9 = d.a.b;
                                        d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                        i78 i78VarA9 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                        int iHashCode4 = Long.hashCode(aVar8.m());
                                        ne00 ne00VarO = aVar8.o();
                                        d dVarC19 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                        yka.k.getClass();
                                        tsr.a aVar10 = yka.a.b;
                                        if (aVar8.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar8.D();
                                        if (aVar8.g()) {
                                            aVar8.F(aVar10);
                                        } else {
                                            aVar8.p();
                                        }
                                        yka.a.b bVar6 = yka.a.f;
                                        hlh0.a(aVar8, i78VarA9, bVar6);
                                        yka.a.d dVar3 = yka.a.e;
                                        hlh0.a(aVar8, ne00VarO, dVar3);
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                        }
                                        yka.a.c cVar4 = yka.a.d;
                                        hlh0.a(aVar8, dVarC19, cVar4);
                                        TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                        TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                        lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                        char c = 709;
                                        ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                        neg0 neg0Var = this;
                                        final osw oswVar4 = oswVar3;
                                        int iD = oswVar4.D();
                                        long j = j58.l;
                                        op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                List list2 = (List) obj6;
                                                ((Integer) obj8).getClass();
                                                list2.getClass();
                                                d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                long j2 = a6g0.a;
                                                i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                return Unit.a;
                                            }
                                        }, aVar8);
                                        final List list2 = list;
                                        j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                a aVar11 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    final int i5 = 0;
                                                    for (Object obj8 : list2) {
                                                        int i6 = i5 + 1;
                                                        if (i5 < 0) {
                                                            b.q();
                                                            throw null;
                                                        }
                                                        final String str3 = (String) obj8;
                                                        final osw oswVar5 = oswVar4;
                                                        final boolean z16 = oswVar5.D() == i5;
                                                        boolean zD = aVar11.d(i5);
                                                        Object objY15 = aVar11.y();
                                                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                        if (zD || objY15 == c0042a2) {
                                                            objY15 = new Function0() { // from class: zeg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    oswVar5.k(i5);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY15);
                                                        }
                                                        Function0 function111 = (Function0) objY15;
                                                        boolean zB = aVar11.b(z16);
                                                        Object objY16 = aVar11.y();
                                                        if (zB || objY16 == c0042a2) {
                                                            objY16 = new Function1() { // from class: bfg0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj9) {
                                                                    tcf tcfVar = (tcf) obj9;
                                                                    tcfVar.getClass();
                                                                    if (!z16) {
                                                                        float fC2 = tcfVar.C1(1.5f);
                                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                        tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY16);
                                                        }
                                                        w1f0.b(z16, function111, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                imf0 imf0VarG;
                                                                a aVar12 = (a) obj9;
                                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                                if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                    boolean z17 = z16;
                                                                    if (z17) {
                                                                        aVar12.N(-1289914155);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    } else {
                                                                        aVar12.N(-1289908779);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    }
                                                                    lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                                } else {
                                                                    aVar12.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                        i5 = i6;
                                                    }
                                                } else {
                                                    aVar11.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8), aVar8, 1597824, 42);
                                        a aVar11 = aVar8;
                                        float f7 = 1.0f;
                                        d dVarG9 = j.g(aVar9, 1.0f);
                                        aiv aivVarC11 = g75.c(ht.a.a, false);
                                        int iHashCode5 = Long.hashCode(aVar11.m());
                                        ne00 ne00VarO2 = aVar11.o();
                                        d dVarC110 = androidx.compose.ui.c.c(aVar11, dVarG9);
                                        if (aVar11.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar11.D();
                                        if (aVar11.g()) {
                                            aVar11.F(aVar10);
                                        } else {
                                            aVar11.p();
                                        }
                                        hlh0.a(aVar11, aivVarC11, bVar6);
                                        hlh0.a(aVar11, ne00VarO2, dVar3);
                                        if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                        }
                                        hlh0.a(aVar11, dVarC110, cVar4);
                                        aVar11.N(-1625593485);
                                        int i5 = 0;
                                        for (Object obj6 : list2) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            boolean z16 = z13;
                                            boolean z17 = z14;
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    aVar11.N(-1025411112);
                                                    aVar11.H();
                                                    Unit unit7 = Unit.a;
                                                    aVar7 = aVar11;
                                                } else {
                                                    aVar11.N(-171017816);
                                                    a aVar12 = aVar11;
                                                    hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar110, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                    aVar7 = aVar12;
                                                    aVar7.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                f6 = f7;
                                            } else {
                                                aVar7 = aVar11;
                                                aVar7.N(-1011218041);
                                                d dVarA11 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                ytw ytwVar19 = ytwVar15;
                                                String str3 = (String) ytwVar19.getValue();
                                                ytw ytwVar110 = ytwVar16;
                                                String str4 = (String) ytwVar110.getValue();
                                                ytw ytwVar111 = ytwVar17;
                                                String str5 = (String) ytwVar111.getValue();
                                                ytw ytwVar112 = ytwVar18;
                                                String str6 = (String) ytwVar112.getValue();
                                                neg0 neg0Var2 = neg0Var;
                                                final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar19, ytwVar111, ytwVar110, ytwVar112);
                                                final zhg0 zhg0Var4 = zhg0Var3;
                                                boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                                Object objY15 = aVar7.y();
                                                if (zA2 || objY15 == a.C0041a.a) {
                                                    objY15 = new Function0() { // from class: qeg0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                            zhg0 zhg0Var5 = zhg0Var4;
                                                            ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar7.r(objY15);
                                                }
                                                f6 = 1.0f;
                                                hfg0.a(dVarA11, zzrVar19, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                                tournamentStatsData4 = tournamentStatsData5;
                                                aVar7.H();
                                                Unit unit9 = Unit.a;
                                            }
                                            neg0Var = this;
                                            aVar11 = aVar7;
                                            i5 = i6;
                                            f7 = f6;
                                            c = 709;
                                        }
                                        a aVar13 = aVar11;
                                        aVar13.H();
                                        aVar13.s();
                                        aVar13.s();
                                        c6n.b(function110, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar6), aVar6);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                };
                bVar = bVar3;
                lig0.a(6, pp8.b(-1677248696, function19, bVar), bVar);
                float fA16 = fw20.a(R.dimen._105sdp, bVar);
                float fA17 = fw20.a(R.dimen._100sdp, bVar);
                fA = fw20.a(R.dimen._minus60sdp, bVar);
                if (z7) {
                    bVar.N(1969574340);
                    if (z) {
                        bVar.N(1969619445);
                        fA = fw20.a(R.dimen._minus35sdp, bVar);
                        z8 = false;
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(1969695829);
                        fA = fw20.a(R.dimen._minus50sdp, bVar);
                        bVar.X(false);
                    }
                } else {
                    z8 = false;
                    bVar.N(1949021340);
                }
                bVar.X(z8);
                String strA8 = pm5.TROPHY_IMAGE.a();
                d dVarD8 = g.d(j.t(aVar5, fA16, fA17), 0.0f, fA, 1);
                if (z7) {
                    f3 = 0.6f;
                } else {
                    f3 = 1.0f;
                }
                fn80.a(strA8, "Trophy", bz60.a(dVarD8, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                f30.a(bVar, true, true, true);
            } else {
                ytwVar = ytwVar5;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar4 = yka.a.d;
            hlh0.a(bVarI, dVarC12, cVar4);
            Configuration configuration4 = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            fC1 = ((mmd) bVarI.O(kna.h)).C1(configuration4.screenHeightDp);
            Object[] objArr7 = new Object[0];
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new feg0();
                bVarI.r(objY2);
            }
            iswVar = (isw) o350.e(objArr7, (Function0) objY2, bVarI, 48);
            Object[] objArr8 = {Integer.valueOf(configuration4.orientation)};
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new z0r(1);
                bVarI.r(objY3);
            }
            ytwVar2 = (ytw) o350.e(objArr8, (Function0) objY3, bVarI, 48);
            if (twd0Var != null) {
                coefficientText = "";
            } else {
                coefficientText = "";
            }
            if (twd0Var != null) {
                j58VarM53getTextColorQN2ZGVo = null;
            } else {
                j58VarM53getTextColorQN2ZGVo = null;
            }
            if ((i3 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            objY4 = bVarI.y();
            if (z4) {
                objY4 = new nm3(function1, 3);
                bVarI.r(objY4);
            } else {
                objY4 = new nm3(function1, 3);
                bVarI.r(objY4);
            }
            Function0 function110 = (Function0) objY4;
            if ((i3 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            objY5 = bVarI.y();
            if (z5) {
                objY5 = new sm3(2, function2);
                bVarI.r(objY5);
            } else {
                objY5 = new sm3(2, function2);
                bVarI.r(objY5);
            }
            Function0 function111 = (Function0) objY5;
            if (twd0Var2 != null) {
                bVar2 = bVarI;
                z6 = true;
                if (twd0Var2 != null) {
                }
                if (z) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                bVar3 = bVar2;
                z7 = z11;
                h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function110, function111, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                d dVarB11 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
                zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                objY6 = bVar3.y();
                if (zM) {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar15 = ytwVar2;
                            if (!((Boolean) ytwVar15.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar15.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar15 = ytwVar2;
                            if (!((Boolean) ytwVar15.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar15.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                }
                d dVarA11 = v.a(dVarB11, (Function1) objY6);
                i78 i78VarA9 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                iHashCode2 = Long.hashCode(bVar3.m());
                ne00 ne00VarS19 = bVar3.S();
                d dVarC19 = androidx.compose.ui.c.c(bVar3, dVarA11);
                bVar3.D();
                if (bVar3.S) {
                    aVar3 = aVar2;
                    bVar3.F(aVar3);
                } else {
                    aVar3 = aVar2;
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA9, bVar5);
                hlh0.a(bVar3, ne00VarS19, dVar2);
                if (bVar3.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                }
                hlh0.a(bVar3, dVarC19, cVar4);
                d dVarG9 = j.g(aVar5, 1.0f);
                aiv aivVarC11 = g75.c(ht.a.b, false);
                iHashCode3 = Long.hashCode(bVar3.m());
                ne00 ne00VarS110 = bVar3.S();
                d dVarC110 = androidx.compose.ui.c.c(bVar3, dVarG9);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC11, bVar5);
                hlh0.a(bVar3, ne00VarS110, dVar2);
                if (bVar3.S) {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                }
                hlh0.a(bVar3, dVarC110, cVar4);
                final zzr zzrVar19 = zzrVar;
                final zzr zzrVar110 = zzrVar2;
                final ytw ytwVar15 = ytwVar;
                Function2 function112 = new Function2() { // from class: leg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Function0 function113 = function0;
                            final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                            final osw oswVar3 = oswVar;
                            final List list = listK;
                            final zzr zzrVar111 = zzrVar19;
                            final boolean z13 = z7;
                            final boolean z14 = z;
                            final boolean z15 = z2;
                            final zhg0 zhg0Var3 = zhg0Var;
                            final zzr zzrVar112 = zzrVar110;
                            final String str2 = strC;
                            final twd0 twd0Var3 = ytwVarA;
                            final ytw ytwVar16 = ytwVar6;
                            final ytw ytwVar17 = ytwVar15;
                            final ytw ytwVar18 = ytwVar3;
                            final ytw ytwVar19 = ytwVar4;
                            final dq40 dq40Var2 = dq40Var;
                            s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar7;
                                    float f6;
                                    a aVar8 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar9 = d.a.b;
                                        d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                        i78 i78VarA10 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                        int iHashCode4 = Long.hashCode(aVar8.m());
                                        ne00 ne00VarO = aVar8.o();
                                        d dVarC111 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                        yka.k.getClass();
                                        tsr.a aVar10 = yka.a.b;
                                        if (aVar8.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar8.D();
                                        if (aVar8.g()) {
                                            aVar8.F(aVar10);
                                        } else {
                                            aVar8.p();
                                        }
                                        yka.a.b bVar6 = yka.a.f;
                                        hlh0.a(aVar8, i78VarA10, bVar6);
                                        yka.a.d dVar3 = yka.a.e;
                                        hlh0.a(aVar8, ne00VarO, dVar3);
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                        }
                                        yka.a.c cVar5 = yka.a.d;
                                        hlh0.a(aVar8, dVarC111, cVar5);
                                        TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                        TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                        lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                        char c = 709;
                                        ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                        neg0 neg0Var = this;
                                        final osw oswVar4 = oswVar3;
                                        int iD = oswVar4.D();
                                        long j = j58.l;
                                        op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                List list2 = (List) obj6;
                                                ((Integer) obj8).getClass();
                                                list2.getClass();
                                                d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                long j2 = a6g0.a;
                                                i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                return Unit.a;
                                            }
                                        }, aVar8);
                                        final List list2 = list;
                                        j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                a aVar11 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    final int i5 = 0;
                                                    for (Object obj8 : list2) {
                                                        int i6 = i5 + 1;
                                                        if (i5 < 0) {
                                                            b.q();
                                                            throw null;
                                                        }
                                                        final String str3 = (String) obj8;
                                                        final osw oswVar5 = oswVar4;
                                                        final boolean z16 = oswVar5.D() == i5;
                                                        boolean zD = aVar11.d(i5);
                                                        Object objY15 = aVar11.y();
                                                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                        if (zD || objY15 == c0042a2) {
                                                            objY15 = new Function0() { // from class: zeg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    oswVar5.k(i5);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY15);
                                                        }
                                                        Function0 function114 = (Function0) objY15;
                                                        boolean zB = aVar11.b(z16);
                                                        Object objY16 = aVar11.y();
                                                        if (zB || objY16 == c0042a2) {
                                                            objY16 = new Function1() { // from class: bfg0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj9) {
                                                                    tcf tcfVar = (tcf) obj9;
                                                                    tcfVar.getClass();
                                                                    if (!z16) {
                                                                        float fC2 = tcfVar.C1(1.5f);
                                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                        tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY16);
                                                        }
                                                        w1f0.b(z16, function114, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                imf0 imf0VarG;
                                                                a aVar12 = (a) obj9;
                                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                                if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                    boolean z17 = z16;
                                                                    if (z17) {
                                                                        aVar12.N(-1289914155);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    } else {
                                                                        aVar12.N(-1289908779);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    }
                                                                    lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                                } else {
                                                                    aVar12.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                        i5 = i6;
                                                    }
                                                } else {
                                                    aVar11.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8), aVar8, 1597824, 42);
                                        a aVar11 = aVar8;
                                        float f7 = 1.0f;
                                        d dVarG10 = j.g(aVar9, 1.0f);
                                        aiv aivVarC12 = g75.c(ht.a.a, false);
                                        int iHashCode5 = Long.hashCode(aVar11.m());
                                        ne00 ne00VarO2 = aVar11.o();
                                        d dVarC112 = androidx.compose.ui.c.c(aVar11, dVarG10);
                                        if (aVar11.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar11.D();
                                        if (aVar11.g()) {
                                            aVar11.F(aVar10);
                                        } else {
                                            aVar11.p();
                                        }
                                        hlh0.a(aVar11, aivVarC12, bVar6);
                                        hlh0.a(aVar11, ne00VarO2, dVar3);
                                        if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                        }
                                        hlh0.a(aVar11, dVarC112, cVar5);
                                        aVar11.N(-1625593485);
                                        int i5 = 0;
                                        for (Object obj6 : list2) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            boolean z16 = z13;
                                            boolean z17 = z14;
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    aVar11.N(-1025411112);
                                                    aVar11.H();
                                                    Unit unit7 = Unit.a;
                                                    aVar7 = aVar11;
                                                } else {
                                                    aVar11.N(-171017816);
                                                    a aVar12 = aVar11;
                                                    hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar112, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                    aVar7 = aVar12;
                                                    aVar7.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                f6 = f7;
                                            } else {
                                                aVar7 = aVar11;
                                                aVar7.N(-1011218041);
                                                d dVarA12 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                ytw ytwVar110 = ytwVar16;
                                                String str3 = (String) ytwVar110.getValue();
                                                ytw ytwVar111 = ytwVar17;
                                                String str4 = (String) ytwVar111.getValue();
                                                ytw ytwVar112 = ytwVar18;
                                                String str5 = (String) ytwVar112.getValue();
                                                ytw ytwVar113 = ytwVar19;
                                                String str6 = (String) ytwVar113.getValue();
                                                neg0 neg0Var2 = neg0Var;
                                                final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar110, ytwVar112, ytwVar111, ytwVar113);
                                                final zhg0 zhg0Var4 = zhg0Var3;
                                                boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                                Object objY15 = aVar7.y();
                                                if (zA2 || objY15 == a.C0041a.a) {
                                                    objY15 = new Function0() { // from class: qeg0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                            zhg0 zhg0Var5 = zhg0Var4;
                                                            ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar7.r(objY15);
                                                }
                                                f6 = 1.0f;
                                                hfg0.a(dVarA12, zzrVar111, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                                tournamentStatsData4 = tournamentStatsData5;
                                                aVar7.H();
                                                Unit unit9 = Unit.a;
                                            }
                                            neg0Var = this;
                                            aVar11 = aVar7;
                                            i5 = i6;
                                            f7 = f6;
                                            c = 709;
                                        }
                                        a aVar13 = aVar11;
                                        aVar13.H();
                                        aVar13.s();
                                        aVar13.s();
                                        c6n.b(function113, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar6), aVar6);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                };
                bVar = bVar3;
                lig0.a(6, pp8.b(-1677248696, function112, bVar), bVar);
                float fA18 = fw20.a(R.dimen._105sdp, bVar);
                float fA19 = fw20.a(R.dimen._100sdp, bVar);
                fA = fw20.a(R.dimen._minus60sdp, bVar);
                if (z7) {
                    bVar.N(1969574340);
                    if (z) {
                        bVar.N(1969619445);
                        fA = fw20.a(R.dimen._minus35sdp, bVar);
                        z8 = false;
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(1969695829);
                        fA = fw20.a(R.dimen._minus50sdp, bVar);
                        bVar.X(false);
                    }
                } else {
                    z8 = false;
                    bVar.N(1949021340);
                }
                bVar.X(z8);
                String strA9 = pm5.TROPHY_IMAGE.a();
                d dVarD9 = g.d(j.t(aVar5, fA18, fA19), 0.0f, fA, 1);
                if (z7) {
                    f3 = 0.6f;
                } else {
                    f3 = 1.0f;
                }
                fn80.a(strA9, "Trophy", bz60.a(dVarD9, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                f30.a(bVar, true, true, true);
            } else {
                bVar2 = bVarI;
                z6 = true;
                if (twd0Var2 != null) {
                }
                if (z) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                bVar3 = bVar2;
                z7 = z11;
                h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function110, function111, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
                d dVarB12 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
                zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
                objY6 = bVar3.y();
                if (zM) {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar16 = ytwVar2;
                            if (!((Boolean) ytwVar16.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar16.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: jeg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            urr urrVar = (urr) obj2;
                            urrVar.getClass();
                            ytw ytwVar16 = ytwVar2;
                            if (!((Boolean) ytwVar16.getValue()).booleanValue()) {
                                float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                isw iswVar2 = iswVar;
                                if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                    iswVar2.A(fD);
                                }
                                ytwVar16.setValue(Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY6);
                }
                d dVarA12 = v.a(dVarB12, (Function1) objY6);
                i78 i78VarA10 = g78.a(kw0.c, ht.a.m, bVar3, 0);
                iHashCode2 = Long.hashCode(bVar3.m());
                ne00 ne00VarS111 = bVar3.S();
                d dVarC111 = androidx.compose.ui.c.c(bVar3, dVarA12);
                bVar3.D();
                if (bVar3.S) {
                    aVar3 = aVar2;
                    bVar3.F(aVar3);
                } else {
                    aVar3 = aVar2;
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA10, bVar5);
                hlh0.a(bVar3, ne00VarS111, dVar2);
                if (bVar3.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
                }
                hlh0.a(bVar3, dVarC111, cVar4);
                d dVarG10 = j.g(aVar5, 1.0f);
                aiv aivVarC12 = g75.c(ht.a.b, false);
                iHashCode3 = Long.hashCode(bVar3.m());
                ne00 ne00VarS112 = bVar3.S();
                d dVarC112 = androidx.compose.ui.c.c(bVar3, dVarG10);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC12, bVar5);
                hlh0.a(bVar3, ne00VarS112, dVar2);
                if (bVar3.S) {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                }
                hlh0.a(bVar3, dVarC112, cVar4);
                final zzr zzrVar111 = zzrVar;
                final zzr zzrVar112 = zzrVar2;
                final ytw ytwVar16 = ytwVar;
                Function2 function113 = new Function2() { // from class: leg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Function0 function114 = function0;
                            final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                            final osw oswVar3 = oswVar;
                            final List list = listK;
                            final zzr zzrVar113 = zzrVar111;
                            final boolean z13 = z7;
                            final boolean z14 = z;
                            final boolean z15 = z2;
                            final zhg0 zhg0Var3 = zhg0Var;
                            final zzr zzrVar114 = zzrVar112;
                            final String str2 = strC;
                            final twd0 twd0Var3 = ytwVarA;
                            final ytw ytwVar17 = ytwVar6;
                            final ytw ytwVar18 = ytwVar16;
                            final ytw ytwVar19 = ytwVar3;
                            final ytw ytwVar110 = ytwVar4;
                            final dq40 dq40Var2 = dq40Var;
                            s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar7;
                                    float f6;
                                    a aVar8 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar9 = d.a.b;
                                        d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                        i78 i78VarA11 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                        int iHashCode4 = Long.hashCode(aVar8.m());
                                        ne00 ne00VarO = aVar8.o();
                                        d dVarC113 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                        yka.k.getClass();
                                        tsr.a aVar10 = yka.a.b;
                                        if (aVar8.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar8.D();
                                        if (aVar8.g()) {
                                            aVar8.F(aVar10);
                                        } else {
                                            aVar8.p();
                                        }
                                        yka.a.b bVar6 = yka.a.f;
                                        hlh0.a(aVar8, i78VarA11, bVar6);
                                        yka.a.d dVar3 = yka.a.e;
                                        hlh0.a(aVar8, ne00VarO, dVar3);
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                        }
                                        yka.a.c cVar5 = yka.a.d;
                                        hlh0.a(aVar8, dVarC113, cVar5);
                                        TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                        TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                        lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                        char c = 709;
                                        ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                        neg0 neg0Var = this;
                                        final osw oswVar4 = oswVar3;
                                        int iD = oswVar4.D();
                                        long j = j58.l;
                                        op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                List list2 = (List) obj6;
                                                ((Integer) obj8).getClass();
                                                list2.getClass();
                                                d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                                long j2 = a6g0.a;
                                                i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                                return Unit.a;
                                            }
                                        }, aVar8);
                                        final List list2 = list;
                                        j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                a aVar11 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    final int i5 = 0;
                                                    for (Object obj8 : list2) {
                                                        int i6 = i5 + 1;
                                                        if (i5 < 0) {
                                                            b.q();
                                                            throw null;
                                                        }
                                                        final String str3 = (String) obj8;
                                                        final osw oswVar5 = oswVar4;
                                                        final boolean z16 = oswVar5.D() == i5;
                                                        boolean zD = aVar11.d(i5);
                                                        Object objY15 = aVar11.y();
                                                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                        if (zD || objY15 == c0042a2) {
                                                            objY15 = new Function0() { // from class: zeg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    oswVar5.k(i5);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY15);
                                                        }
                                                        Function0 function115 = (Function0) objY15;
                                                        boolean zB = aVar11.b(z16);
                                                        Object objY16 = aVar11.y();
                                                        if (zB || objY16 == c0042a2) {
                                                            objY16 = new Function1() { // from class: bfg0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj9) {
                                                                    tcf tcfVar = (tcf) obj9;
                                                                    tcfVar.getClass();
                                                                    if (!z16) {
                                                                        float fC2 = tcfVar.C1(1.5f);
                                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                        tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar11.r(objY16);
                                                        }
                                                        w1f0.b(z16, function115, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                imf0 imf0VarG;
                                                                a aVar12 = (a) obj9;
                                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                                if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                    boolean z17 = z16;
                                                                    if (z17) {
                                                                        aVar12.N(-1289914155);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    } else {
                                                                        aVar12.N(-1289908779);
                                                                        imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                        aVar12.H();
                                                                    }
                                                                    lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                                } else {
                                                                    aVar12.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                        i5 = i6;
                                                    }
                                                } else {
                                                    aVar11.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8), aVar8, 1597824, 42);
                                        a aVar11 = aVar8;
                                        float f7 = 1.0f;
                                        d dVarG11 = j.g(aVar9, 1.0f);
                                        aiv aivVarC13 = g75.c(ht.a.a, false);
                                        int iHashCode5 = Long.hashCode(aVar11.m());
                                        ne00 ne00VarO2 = aVar11.o();
                                        d dVarC114 = androidx.compose.ui.c.c(aVar11, dVarG11);
                                        if (aVar11.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar11.D();
                                        if (aVar11.g()) {
                                            aVar11.F(aVar10);
                                        } else {
                                            aVar11.p();
                                        }
                                        hlh0.a(aVar11, aivVarC13, bVar6);
                                        hlh0.a(aVar11, ne00VarO2, dVar3);
                                        if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                            j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                        }
                                        hlh0.a(aVar11, dVarC114, cVar5);
                                        aVar11.N(-1625593485);
                                        int i5 = 0;
                                        for (Object obj6 : list2) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            boolean z16 = z13;
                                            boolean z17 = z14;
                                            if (i5 != 0) {
                                                if (i5 != 1) {
                                                    aVar11.N(-1025411112);
                                                    aVar11.H();
                                                    Unit unit7 = Unit.a;
                                                    aVar7 = aVar11;
                                                } else {
                                                    aVar11.N(-171017816);
                                                    a aVar12 = aVar11;
                                                    hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar114, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                    aVar7 = aVar12;
                                                    aVar7.H();
                                                    Unit unit8 = Unit.a;
                                                }
                                                f6 = f7;
                                            } else {
                                                aVar7 = aVar11;
                                                aVar7.N(-1011218041);
                                                d dVarA13 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                                LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                                ytw ytwVar111 = ytwVar17;
                                                String str3 = (String) ytwVar111.getValue();
                                                ytw ytwVar112 = ytwVar18;
                                                String str4 = (String) ytwVar112.getValue();
                                                ytw ytwVar113 = ytwVar19;
                                                String str5 = (String) ytwVar113.getValue();
                                                ytw ytwVar114 = ytwVar110;
                                                String str6 = (String) ytwVar114.getValue();
                                                neg0 neg0Var2 = neg0Var;
                                                final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar111, ytwVar113, ytwVar112, ytwVar114);
                                                final zhg0 zhg0Var4 = zhg0Var3;
                                                boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                                Object objY15 = aVar7.y();
                                                if (zA2 || objY15 == a.C0041a.a) {
                                                    objY15 = new Function0() { // from class: qeg0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                            zhg0 zhg0Var5 = zhg0Var4;
                                                            ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar7.r(objY15);
                                                }
                                                f6 = 1.0f;
                                                hfg0.a(dVarA13, zzrVar113, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                                tournamentStatsData4 = tournamentStatsData5;
                                                aVar7.H();
                                                Unit unit9 = Unit.a;
                                            }
                                            neg0Var = this;
                                            aVar11 = aVar7;
                                            i5 = i6;
                                            f7 = f6;
                                            c = 709;
                                        }
                                        a aVar13 = aVar11;
                                        aVar13.H();
                                        aVar13.s();
                                        aVar13.s();
                                        c6n.b(function114, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar6), aVar6);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                };
                bVar = bVar3;
                lig0.a(6, pp8.b(-1677248696, function113, bVar), bVar);
                float fA110 = fw20.a(R.dimen._105sdp, bVar);
                float fA111 = fw20.a(R.dimen._100sdp, bVar);
                fA = fw20.a(R.dimen._minus60sdp, bVar);
                if (z7) {
                    bVar.N(1969574340);
                    if (z) {
                        bVar.N(1969619445);
                        fA = fw20.a(R.dimen._minus35sdp, bVar);
                        z8 = false;
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(1969695829);
                        fA = fw20.a(R.dimen._minus50sdp, bVar);
                        bVar.X(false);
                    }
                } else {
                    z8 = false;
                    bVar.N(1949021340);
                }
                bVar.X(z8);
                String strA10 = pm5.TROPHY_IMAGE.a();
                d dVarD10 = g.d(j.t(aVar5, fA110, fA111), 0.0f, fA, 1);
                if (z7) {
                    f3 = 0.6f;
                } else {
                    f3 = 1.0f;
                }
                fn80.a(strA10, "Trophy", bz60.a(dVarD10, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
                f30.a(bVar, true, true, true);
            }
            if (z) {
                f2 = f;
            } else {
                f2 = 0.0f;
            }
            bVar3 = bVar2;
            z7 = z11;
            h18.b(coefficientText, j58VarM53getTextColorQN2ZGVo, twd0Var2, function110, function111, z12, f2, i, f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f), null, bVar3, ((i3 >> 6) & 896) | ((i4 << 18) & 29360128), 512);
            d dVarB13 = androidx.compose.foundation.layout.d.a.b(j.g(aVar5, 1.0f), ht.a.h);
            zM = bVar3.M(ytwVar2) | bVar3.c(fC1) | bVar3.M(iswVar);
            objY6 = bVar3.y();
            if (zM) {
                objY6 = new Function1() { // from class: jeg0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        urr urrVar = (urr) obj2;
                        urrVar.getClass();
                        ytw ytwVar17 = ytwVar2;
                        if (!((Boolean) ytwVar17.getValue()).booleanValue()) {
                            float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                            isw iswVar2 = iswVar;
                            if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                iswVar2.A(fD);
                            }
                            ytwVar17.setValue(Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVar3.r(objY6);
            } else {
                objY6 = new Function1() { // from class: jeg0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        urr urrVar = (urr) obj2;
                        urrVar.getClass();
                        ytw ytwVar17 = ytwVar2;
                        if (!((Boolean) ytwVar17.getValue()).booleanValue()) {
                            float fD = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                            isw iswVar2 = iswVar;
                            if (Math.abs(fD - iswVar2.j()) > 0.001f) {
                                iswVar2.A(fD);
                            }
                            ytwVar17.setValue(Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVar3.r(objY6);
            }
            d dVarA13 = v.a(dVarB13, (Function1) objY6);
            i78 i78VarA11 = g78.a(kw0.c, ht.a.m, bVar3, 0);
            iHashCode2 = Long.hashCode(bVar3.m());
            ne00 ne00VarS113 = bVar3.S();
            d dVarC113 = androidx.compose.ui.c.c(bVar3, dVarA13);
            bVar3.D();
            if (bVar3.S) {
                aVar3 = aVar2;
                bVar3.F(aVar3);
            } else {
                aVar3 = aVar2;
                bVar3.p();
            }
            hlh0.a(bVar3, i78VarA11, bVar5);
            hlh0.a(bVar3, ne00VarS113, dVar2);
            if (bVar3.S) {
                c1350a2 = c1350a;
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
            } else {
                c1350a2 = c1350a;
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a2);
            }
            hlh0.a(bVar3, dVarC113, cVar4);
            d dVarG11 = j.g(aVar5, 1.0f);
            aiv aivVarC13 = g75.c(ht.a.b, false);
            iHashCode3 = Long.hashCode(bVar3.m());
            ne00 ne00VarS114 = bVar3.S();
            d dVarC114 = androidx.compose.ui.c.c(bVar3, dVarG11);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar3);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, aivVarC13, bVar5);
            hlh0.a(bVar3, ne00VarS114, dVar2);
            if (bVar3.S) {
                n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
            }
            hlh0.a(bVar3, dVarC114, cVar4);
            final zzr zzrVar113 = zzrVar;
            final zzr zzrVar114 = zzrVar2;
            final ytw ytwVar17 = ytwVar;
            Function2 function114 = new Function2() { // from class: leg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    a aVar6 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Function0 function115 = function0;
                        final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                        final osw oswVar3 = oswVar;
                        final List list = listK;
                        final zzr zzrVar115 = zzrVar113;
                        final boolean z13 = z7;
                        final boolean z14 = z;
                        final boolean z15 = z2;
                        final zhg0 zhg0Var3 = zhg0Var;
                        final zzr zzrVar116 = zzrVar114;
                        final String str2 = strC;
                        final twd0 twd0Var3 = ytwVarA;
                        final ytw ytwVar18 = ytwVar6;
                        final ytw ytwVar19 = ytwVar17;
                        final ytw ytwVar110 = ytwVar3;
                        final ytw ytwVar111 = ytwVar4;
                        final dq40 dq40Var2 = dq40Var;
                        s4g0.a(54, pp8.b(133483948, new Function2() { // from class: neg0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar7;
                                float f6;
                                a aVar8 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d.a aVar9 = d.a.b;
                                    d dVarJ = h.j(j.g(aVar9, 1.0f), 0.0f, fw20.a(R.dimen._35sdp, aVar8), 0.0f, 0.0f, 13);
                                    i78 i78VarA12 = g78.a(kw0.c, ht.a.n, aVar8, 48);
                                    int iHashCode4 = Long.hashCode(aVar8.m());
                                    ne00 ne00VarO = aVar8.o();
                                    d dVarC115 = androidx.compose.ui.c.c(aVar8, dVarJ);
                                    yka.k.getClass();
                                    tsr.a aVar10 = yka.a.b;
                                    if (aVar8.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar8.D();
                                    if (aVar8.g()) {
                                        aVar8.F(aVar10);
                                    } else {
                                        aVar8.p();
                                    }
                                    yka.a.b bVar6 = yka.a.f;
                                    hlh0.a(aVar8, i78VarA12, bVar6);
                                    yka.a.d dVar3 = yka.a.e;
                                    hlh0.a(aVar8, ne00VarO, dVar3);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                                        j3c.a(iHashCode4, aVar8, iHashCode4, c1350a3);
                                    }
                                    yka.a.c cVar5 = yka.a.d;
                                    hlh0.a(aVar8, dVarC115, cVar5);
                                    TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                    TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                    lkf0.b(yk10.a(tournamentStatsData3.getTournamentName(), "! "), null, a6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar8.O(ni60.b)).f, R.dimen._16sdp, aVar8), aVar8, 384, 0, 65530);
                                    char c = 709;
                                    ty0.a(aVar8, j.i(aVar9, fw20.a(R.dimen._9sdp, aVar8)));
                                    neg0 neg0Var = this;
                                    final osw oswVar4 = oswVar3;
                                    int iD = oswVar4.D();
                                    long j = j58.l;
                                    op8 op8VarB = pp8.b(-511517474, new gaj() { // from class: zcg0
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            List list2 = (List) obj6;
                                            ((Integer) obj8).getClass();
                                            list2.getClass();
                                            d dVarI = j.i(i2f0.d((z1f0) list2.get(oswVar4.D())), 1.5f);
                                            long j2 = a6g0.a;
                                            i2f0.a.c(dVarI, 0.0f, j2, (a) obj7, 384, 2);
                                            return Unit.a;
                                        }
                                    }, aVar8);
                                    final List list2 = list;
                                    j3f0.g(iD, null, j, 0L, op8VarB, null, pp8.b(948005598, new Function2() { // from class: ddg0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            a aVar11 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar11.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                final int i5 = 0;
                                                for (Object obj8 : list2) {
                                                    int i6 = i5 + 1;
                                                    if (i5 < 0) {
                                                        b.q();
                                                        throw null;
                                                    }
                                                    final String str3 = (String) obj8;
                                                    final osw oswVar5 = oswVar4;
                                                    final boolean z16 = oswVar5.D() == i5;
                                                    boolean zD = aVar11.d(i5);
                                                    Object objY15 = aVar11.y();
                                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                    if (zD || objY15 == c0042a2) {
                                                        objY15 = new Function0() { // from class: zeg0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                oswVar5.k(i5);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar11.r(objY15);
                                                    }
                                                    Function0 function116 = (Function0) objY15;
                                                    boolean zB = aVar11.b(z16);
                                                    Object objY16 = aVar11.y();
                                                    if (zB || objY16 == c0042a2) {
                                                        objY16 = new Function1() { // from class: bfg0
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj9) {
                                                                tcf tcfVar = (tcf) obj9;
                                                                tcfVar.getClass();
                                                                if (!z16) {
                                                                    float fC2 = tcfVar.C1(1.5f);
                                                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                                                    tcf.Z1(tcfVar, j58.c(0.2f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC2, 0, null, 496);
                                                                }
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar11.r(objY16);
                                                    }
                                                    w1f0.b(z16, function116, androidx.compose.ui.draw.a.a(d.a.b, (Function1) objY16), false, pp8.b(731617810, new Function2() { // from class: bdg0
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj9, Object obj10) {
                                                            imf0 imf0VarG;
                                                            a aVar12 = (a) obj9;
                                                            int iIntValue4 = ((Integer) obj10).intValue();
                                                            if (aVar12.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                boolean z17 = z16;
                                                                if (z17) {
                                                                    aVar12.N(-1289914155);
                                                                    imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).d, R.dimen._11ssp, aVar12);
                                                                    aVar12.H();
                                                                } else {
                                                                    aVar12.N(-1289908779);
                                                                    imf0VarG = ni60.g(((sfd0) aVar12.O(ni60.b)).b, R.dimen._11ssp, aVar12);
                                                                    aVar12.H();
                                                                }
                                                                lkf0.b(str3, null, z17 ? a6g0.a : j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar12, 0, 0, 65530);
                                                            } else {
                                                                aVar12.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, aVar11), 0L, 0L, aVar11, 24576, 488);
                                                    i5 = i6;
                                                }
                                            } else {
                                                aVar11.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar8), aVar8, 1597824, 42);
                                    a aVar11 = aVar8;
                                    float f7 = 1.0f;
                                    d dVarG12 = j.g(aVar9, 1.0f);
                                    aiv aivVarC14 = g75.c(ht.a.a, false);
                                    int iHashCode5 = Long.hashCode(aVar11.m());
                                    ne00 ne00VarO2 = aVar11.o();
                                    d dVarC116 = androidx.compose.ui.c.c(aVar11, dVarG12);
                                    if (aVar11.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar11.D();
                                    if (aVar11.g()) {
                                        aVar11.F(aVar10);
                                    } else {
                                        aVar11.p();
                                    }
                                    hlh0.a(aVar11, aivVarC14, bVar6);
                                    hlh0.a(aVar11, ne00VarO2, dVar3);
                                    if (aVar11.g() || !Intrinsics.g(aVar11.y(), Integer.valueOf(iHashCode5))) {
                                        j3c.a(iHashCode5, aVar11, iHashCode5, c1350a3);
                                    }
                                    hlh0.a(aVar11, dVarC116, cVar5);
                                    aVar11.N(-1625593485);
                                    int i5 = 0;
                                    for (Object obj6 : list2) {
                                        int i6 = i5 + 1;
                                        if (i5 < 0) {
                                            b.q();
                                            throw null;
                                        }
                                        boolean z16 = z13;
                                        boolean z17 = z14;
                                        if (i5 != 0) {
                                            if (i5 != 1) {
                                                aVar11.N(-1025411112);
                                                aVar11.H();
                                                Unit unit7 = Unit.a;
                                                aVar7 = aVar11;
                                            } else {
                                                aVar11.N(-171017816);
                                                a aVar12 = aVar11;
                                                hfg0.e(dw.a(abk0.a(aVar9, oswVar4.D() == 1 ? f7 : 0.0f), oswVar4.D() == 1 ? f7 : 0.0f), zzrVar116, tournamentStatsData4, str2, z16, z17, aVar12, 0);
                                                aVar7 = aVar12;
                                                aVar7.H();
                                                Unit unit8 = Unit.a;
                                            }
                                            f6 = f7;
                                        } else {
                                            aVar7 = aVar11;
                                            aVar7.N(-1011218041);
                                            d dVarA14 = dw.a(abk0.a(aVar9, oswVar4.D() == 0 ? f7 : 0.0f), oswVar4.D() == 0 ? f7 : 0.0f);
                                            LoadingState loadingState = (LoadingState) twd0Var3.getValue();
                                            ytw ytwVar112 = ytwVar18;
                                            String str3 = (String) ytwVar112.getValue();
                                            ytw ytwVar113 = ytwVar19;
                                            String str4 = (String) ytwVar113.getValue();
                                            ytw ytwVar114 = ytwVar110;
                                            String str5 = (String) ytwVar114.getValue();
                                            ytw ytwVar115 = ytwVar111;
                                            String str6 = (String) ytwVar115.getValue();
                                            neg0 neg0Var2 = neg0Var;
                                            final TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                            wdg0 wdg0Var = new wdg0(tournamentStatsData5, dq40Var2, ytwVar112, ytwVar114, ytwVar113, ytwVar115);
                                            final zhg0 zhg0Var4 = zhg0Var3;
                                            boolean zA2 = aVar7.A(zhg0Var4) | aVar7.A(tournamentStatsData5);
                                            Object objY15 = aVar7.y();
                                            if (zA2 || objY15 == a.C0041a.a) {
                                                objY15 = new Function0() { // from class: qeg0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        long tournamentId3 = tournamentStatsData5.getTournamentId();
                                                        zhg0 zhg0Var5 = zhg0Var4;
                                                        ej5.c(o8i0.d(zhg0Var5), null, null, new vhg0(zhg0Var5, tournamentId3, null), 3);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar7.r(objY15);
                                            }
                                            f6 = 1.0f;
                                            hfg0.a(dVarA14, zzrVar115, z16, z17, tournamentStatsData5, loadingState, str3, str4, str5, str6, z15, wdg0Var, (Function0) objY15, aVar7, 0);
                                            tournamentStatsData4 = tournamentStatsData5;
                                            aVar7.H();
                                            Unit unit9 = Unit.a;
                                        }
                                        neg0Var = this;
                                        aVar11 = aVar7;
                                        i5 = i6;
                                        f7 = f6;
                                        c = 709;
                                    }
                                    a aVar13 = aVar11;
                                    aVar13.H();
                                    aVar13.s();
                                    aVar13.s();
                                    c6n.b(function115, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar9, ht.a.c), fw20.a(R.dimen._9sdp, aVar13)), -2.0f, 4.0f), 24.0f), false, null, cy9.a, aVar11, 196608, 28);
                                } else {
                                    aVar8.G();
                                }
                                return Unit.a;
                            }
                        }, aVar6), aVar6);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            };
            bVar = bVar3;
            lig0.a(6, pp8.b(-1677248696, function114, bVar), bVar);
            float fA112 = fw20.a(R.dimen._105sdp, bVar);
            float fA113 = fw20.a(R.dimen._100sdp, bVar);
            fA = fw20.a(R.dimen._minus60sdp, bVar);
            if (z7) {
                bVar.N(1969574340);
                if (z) {
                    bVar.N(1969619445);
                    fA = fw20.a(R.dimen._minus35sdp, bVar);
                    z8 = false;
                    bVar.X(false);
                } else {
                    z8 = false;
                    bVar.N(1969695829);
                    fA = fw20.a(R.dimen._minus50sdp, bVar);
                    bVar.X(false);
                }
            } else {
                z8 = false;
                bVar.N(1949021340);
            }
            bVar.X(z8);
            String strA11 = pm5.TROPHY_IMAGE.a();
            d dVarD11 = g.d(j.t(aVar5, fA112, fA113), 0.0f, fA, 1);
            if (z7) {
                f3 = 0.6f;
            } else {
                f3 = 1.0f;
            }
            fn80.a(strA11, "Trophy", bz60.a(dVarD11, f3, f3), d0b.a.g, null, 0.0f, null, null, null, bVar, 3120, 2032);
            f30.a(bVar, true, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function3 = new Function2(function0, zhg0Var, twd0Var, twd0Var2, function1, function2, map, map2, z, f, i, z2, i2) { // from class: meg0
                public final /* synthetic */ int A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ zhg0 c;
                public final /* synthetic */ twd0 d;
                public final /* synthetic */ twd0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ HashMap v;
                public final /* synthetic */ HashMap w;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ float z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    hfg0.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj2, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public static final void h(final TournamentStatsData tournamentStatsData, final String str, final String str2, final String str3, final String str4, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        yka.a.c cVar;
        yka.a.b bVar2;
        n54 n54Var;
        yka.a.d dVar;
        yka.a.C1350a c1350a;
        ?? r0;
        yka.a.C1350a c1350a2;
        String strA;
        String str5;
        String str6;
        androidx.compose.runtime.b bVar3;
        wd7.a(str, str2, str3, str4);
        androidx.compose.runtime.b bVarI = aVar.i(-1399728139);
        int i2 = i | (bVarI.A(tournamentStatsData) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.M(str4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            List listK = kotlin.collections.b.k(new j58(r58.d(4284370982L)), new j58(r58.d(4282727714L)));
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if ((intOrNull != null ? intOrNull.intValue() : 0) == 0) {
                listK = kotlin.collections.b.k(new j58(r58.d(4280689693L)), new j58(r58.d(4279440666L)));
            } else {
                Integer intOrNull2 = StringsKt.toIntOrNull(str);
                if (!j(intOrNull2 != null ? intOrNull2.intValue() : 0, tournamentStatsData.getPrizeListMap())) {
                    listK = kotlin.collections.b.k(new j58(r58.d(4280689693L)), new j58(r58.d(4279440666L)));
                }
            }
            d.a aVar2 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.a(j.g(aVar2, 1.0f), ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4293117765L)), new j58(r58.d(4286337536L)), new j58(r58.d(4293184584L)), new j58(r58.d(4286337536L)), new j58(r58.d(4293117765L)))), j060.c(10.0f), 0.0f, 4), 1.0f);
            n54 n54Var2 = ht.a.a;
            aiv aivVarC = g75.c(n54Var2, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar4);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarG = h.g(androidx.compose.foundation.a.a(ls7.a(j.g(aVar2, 1.0f), j060.c(10.0f)), ya5.a.a(0.0f, 0.0f, 14, listK), null, 0.0f, 6), fw20.a(R.dimen._9sdp, bVarI), 8.0f);
            aiv aivVarC2 = g75.c(n54Var2, false);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar4);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a3);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            if (Build.VERSION.SDK_INT > 26) {
                bVarI.N(183816655);
                c1350a = c1350a3;
                cVar = cVar2;
                dVar = dVar2;
                bVar2 = bVar4;
                n54Var = n54Var2;
                r0 = 0;
                h9n.a(erz.a(R.drawable.ic_bg_trophy_half, 0, bVarI), "trophy", h.j(bz60.a(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.f), 3.0f, 3.0f), 0.0f, 0.0f, 6.0f, 0.0f, 11), null, null, 0.0f, null, bVarI, 48, 120);
            } else {
                cVar = cVar2;
                bVar2 = bVar4;
                n54Var = n54Var2;
                dVar = dVar2;
                c1350a = c1350a3;
                r0 = 0;
                bVarI.N(154775545);
            }
            bVarI.X(r0);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, r0);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            yka.a.c cVar3 = cVar;
            hlh0.a(bVarI, dVarC3, cVar3);
            d dVarG2 = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar3);
            f160 f160Var = f160.a;
            d dVarA = f160Var.a(1.0f, aVar2, true);
            n54 n54Var3 = n54Var;
            aiv aivVarC3 = g75.c(n54Var3, r0);
            int iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar3);
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar3);
            String strA2 = pm5.YOUR_RANK.a();
            Locale locale = Locale.ROOT;
            String upperCase = strA2.toUpperCase(locale);
            upperCase.getClass();
            long j = j58.f;
            long jC = j58.c(0.6f, j);
            qyd0 qyd0Var = ni60.b;
            yka.a.d dVar3 = dVar;
            yka.a.C1350a c1350a4 = c1350a;
            lkf0.b(upperCase, null, jC, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            lkf0.b(str.equals("0") ? "--" : str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).d, R.dimen._12ssp, bVarI), bVarI, 384, 0, 65530);
            bVarI.X(true);
            bVarI.X(true);
            d dVarA2 = f160Var.a(1.0f, aVar2, true);
            aiv aivVarC4 = g75.c(n54Var3, false);
            int iHashCode7 = Long.hashCode(bVarI.m());
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS7, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                c1350a2 = c1350a4;
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a2);
            } else {
                c1350a2 = c1350a4;
            }
            hlh0.a(bVarI, dVarC7, cVar3);
            i78 i78VarA3 = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode8 = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS8, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a2);
            }
            hlh0.a(bVarI, dVarC8, cVar3);
            String upperCase2 = pm5.POINTS.a().toUpperCase(locale);
            upperCase2.getClass();
            yka.a.C1350a c1350a5 = c1350a2;
            lkf0.b(upperCase2, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            d dVarG3 = j.g(aVar2, 1.0f);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode9 = Long.hashCode(bVarI.m());
            ne00 ne00VarS9 = bVarI.S();
            d dVarC9 = androidx.compose.ui.c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS9, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVarI, iHashCode9, c1350a5);
            }
            hlh0.a(bVarI, dVarC9, cVar3);
            h9n.a(erz.a(R.drawable.ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar2, fw20.a(R.dimen._10sdp, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            f(str2, bVarI, (i2 >> 6) & 14);
            bVarI.X(true);
            bVarI.X(true);
            bVarI.X(true);
            d dVarA3 = f160Var.a(1.0f, aVar2, true);
            aiv aivVarC5 = g75.c(n54Var3, false);
            int iHashCode10 = Long.hashCode(bVarI.m());
            ne00 ne00VarS10 = bVarI.S();
            d dVarC10 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS10, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode10))) {
                n30.a(iHashCode10, bVarI, iHashCode10, c1350a5);
            }
            hlh0.a(bVarI, dVarC10, cVar3);
            i78 i78VarA4 = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode11 = Long.hashCode(bVarI.m());
            ne00 ne00VarS11 = bVarI.S();
            d dVarC11 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS11, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode11))) {
                n30.a(iHashCode11, bVarI, iHashCode11, c1350a5);
            }
            hlh0.a(bVarI, dVarC11, cVar3);
            String upperCase3 = pm5.PRIZE.a().toUpperCase(locale);
            upperCase3.getClass();
            lkf0.b(upperCase3, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            lkf0.b(str3, null, j, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str3, ((sfd0) bVarI.O(qyd0Var)).d, bVarI), bVarI, ((i2 >> 9) & 14) | 384, 0, 65018);
            f30.a(bVarI, true, true, true);
            ty0.a(bVarI, j.i(aVar2, fw20.a(R.dimen._9sdp, bVarI)));
            if (str.equals("1")) {
                bVarI.N(-1464509428);
                lkf0.b(pm5.LEADERBOARD_WINNER.a(), null, j58.c(0.9f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).a, R.dimen._9sdp, bVarI), bVarI, 384, 0, 65530);
                androidx.compose.runtime.b bVar5 = bVarI;
                bVar5.X(false);
                bVar3 = bVar5;
            } else {
                bVarI.N(-1464190314);
                Integer intOrNull3 = StringsKt.toIntOrNull(str);
                if ((intOrNull3 != null ? intOrNull3.intValue() : 0) == 0) {
                    strA = pm5.LEADERBOARD_PLAYER.a();
                } else {
                    Integer intOrNull4 = StringsKt.toIntOrNull(str);
                    if (j(intOrNull4 != null ? intOrNull4.intValue() : 0, tournamentStatsData.getPrizeListMap())) {
                        strA = pm5.LEADERBOARD_RANK_HOLDER.a();
                    } else {
                        strA = pm5.LEADERBOARD_PLAYER.a();
                    }
                }
                nk0.b bVar6 = new nk0.b((Object) null);
                List listSplit$default = StringsKt__StringsKt.split$default(strA, new String[]{"{points}"}, false, 0, 6, null);
                if (listSplit$default == null || (str5 = (String) listSplit$default.get(0)) == null) {
                    str5 = null;
                }
                bVar6.f(str5);
                int iL = bVar6.l(new ora0(0L, 0L, t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
                try {
                    bVar6.g(str4);
                    Unit unit = Unit.a;
                    bVar6.i(iL);
                    List listSplit$default2 = StringsKt__StringsKt.split$default(strA, new String[]{"{points}"}, false, 0, 6, null);
                    if (listSplit$default2 == null || (str6 = (String) listSplit$default2.get(1)) == null) {
                        str6 = null;
                    }
                    bVar6.f(str6);
                    lkf0.c(bVar6.m(), null, j58.c(0.9f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).a, R.dimen._9sdp, bVarI), bVarI, 384, 0, 131066);
                    androidx.compose.runtime.b bVar7 = bVarI;
                    bVar7.X(false);
                    bVar3 = bVar7;
                } catch (Throwable th) {
                    bVar6.i(iL);
                    throw th;
                }
            }
            f30.a(bVar3, true, true, true);
            bVar = bVar3;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, str4, i) { // from class: zdg0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hfg0.h(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, androidx.compose.runtime.a aVar, d dVar, final String str) {
        final d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(1444136752);
        int i2 = (bVarI.M(str) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            try {
                zi50.a aVar2 = zi50.b;
                boolean z = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new r6h(str, 2);
                    bVarI.r(objY);
                }
                dVar2 = dVar;
                try {
                    androidx.compose.ui.viewinterop.b.a((Function1) objY, dVar2, null, bVarI, 48, 4);
                    Unit unit = Unit.a;
                } catch (Throwable unused) {
                    zi50.a aVar3 = zi50.b;
                }
            } catch (Throwable unused2) {
                dVar2 = dVar;
            }
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, str) { // from class: ydg0
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar2;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hfg0.i(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean j(int i, List<Pair<String, String>> list) {
        Pair<String, String> pair;
        Integer intOrNull;
        int iIndexOf = list.indexOf(CollectionsKt.d0(list));
        if (iIndexOf != -1 && (pair = list.get(iIndexOf)) != null) {
            String str = pair.a;
            String str2 = str;
            if (str2.length() > 0) {
                boolean zM = StringsKt.M(str2, "-", false);
                int iIntValue = Reader.READ_DONE;
                if (zM) {
                    String str3 = (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str2, new String[]{"-"}, false, 0, 6, null));
                    if (str3 != null && (intOrNull = StringsKt.toIntOrNull(str3)) != null) {
                        iIntValue = intOrNull.intValue();
                    }
                    if (i <= iIntValue) {
                        return true;
                    }
                } else {
                    Integer intOrNull2 = StringsKt.toIntOrNull(str);
                    if (intOrNull2 != null) {
                        iIntValue = intOrNull2.intValue();
                    }
                    if (i <= iIntValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final imf0 k(String str, imf0 imf0Var, androidx.compose.runtime.a aVar) {
        str.getClass();
        imf0Var.getClass();
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        float dimension = context.getResources().getDimension(R.dimen._11ssp);
        float dimension2 = context.getResources().getDimension(R.dimen._8ssp);
        if (str.length() > 10) {
            dimension -= (str.length() - 10) * 1.5f;
            if (dimension < dimension2) {
                dimension = dimension2;
            }
        }
        return imf0.b(imf0Var, 0L, mmdVar.g0(dimension), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
    }

    public static final Pair<Integer, Integer> l(int i, List<TopRankPoint> list) {
        Integer numValueOf;
        Integer endRank;
        Integer startRank;
        if (list != null) {
            Iterator<TopRankPoint> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                TopRankPoint next = it.next();
                int iIntValue = (next == null || (startRank = next.getStartRank()) == null) ? 0 : startRank.intValue();
                if (i <= ((next == null || (endRank = next.getEndRank()) == null) ? 0 : endRank.intValue()) && iIntValue <= i) {
                    break;
                }
                i2++;
            }
            numValueOf = Integer.valueOf(i2);
        } else {
            numValueOf = null;
        }
        return new Pair<>(numValueOf, Integer.valueOf(list != null ? list.size() - 1 : 0));
    }
}
