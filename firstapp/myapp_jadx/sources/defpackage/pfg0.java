package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportygames.campaign.data.model.LeaderboardRecord;
import com.sportygames.campaign.data.model.TopRankPoint;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.campaign.data.model.TournamentRankResponse;
import com.sportygames.campaign.data.model.TournamentStatsData;
import com.sportygames.campaign.data.model.UserPlayInfo;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class pfg0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wzd0.values().length];
            try {
                wzd0 wzd0Var = wzd0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                wzd0 wzd0Var2 = wzd0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                wzd0 wzd0Var3 = wzd0.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final d dVar, final zzr zzrVar, final boolean z, final boolean z2, final TournamentStatsData tournamentStatsData, final gzs gzsVar, final String str, final String str2, final String str3, final String str4, final boolean z3, final reg0 reg0Var, final Function0 function0, b5 b5Var, final boolean z4, androidx.compose.runtime.a aVar, final int i) {
        final b5 b5Var2;
        b5 b5Var3;
        int i2;
        float f;
        float f2;
        b bVar;
        zzrVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        b bVarI = aVar.i(2142387404);
        int i3 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(zzrVar) ? 32 : 16) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.A(tournamentStatsData) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(gzsVar) ? 131072 : 65536) | (bVarI.M(str) ? 1048576 : 524288) | (bVarI.M(str2) ? 8388608 : 4194304) | (bVarI.M(str3) ? 67108864 : 33554432) | (bVarI.M(str4) ? 536870912 : 268435456);
        int i4 = (bVarI.b(z3) ? (char) 4 : (char) 2) | (bVarI.A(reg0Var) ? ' ' : (char) 16) | (bVarI.A(function0) ? 256 : 128) | 1024 | (bVarI.b(z4) ? (char) 16384 : (char) 8192);
        if (bVarI.q(i3 & 1, ((306783251 & i3) == 306783250 && (i4 & 9363) == 9362) ? false : true)) {
            bVarI.A0();
            int i5 = i & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5Var3 = (b5) objY;
                i2 = i4 & (-7169);
            } else {
                bVarI.G();
                i2 = i4 & (-7169);
                b5Var3 = b5Var;
            }
            bVarI.Y();
            d dVarG = j.g(dVar, 1.0f);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z2) {
                bVarI.N(1544984736);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.46f;
            } else {
                bVarI.N(1544982880);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.42f;
            }
            float f3 = f * f2;
            bVarI.X(false);
            d dVarI = j.i(dVarG, f3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), b6g0.c, zk40.a), 4.0f, 4.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            int i6 = i2;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String endDate = tournamentStatsData.getEndDate();
            String upperCase = com.sportygames.newcms.c.d(v5g0.Z.p, "ENDS IN", bVarI).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            final b5 b5Var4 = b5Var3;
            r6b.a(endDate, upperCase, j58.c(0.8f, j58.f), pi60.b(R.dimen._9ssp, 6, bVarI), bVarI, 384);
            bVarI.X(true);
            d dVarA = zqu.a(1.0f, h.h(j.g(aVar3, 1.0f), pi60.a(R.dimen._9sdp, 6, bVarI), 0.0f, 2), true);
            umz umzVarB = h.b(0.0f, 0.0f, 0.0f, pi60.a(R.dimen._6sdp, 6, bVarI), 7);
            boolean zA = bVarI.A(gzsVar) | ((i6 & 14) == 4) | ((i3 & 3670016) == 1048576) | bVarI.A(tournamentStatsData) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | bVarI.A(b5Var4) | ((57344 & i6) == 16384) | ((i6 & 112) == 32) | ((i6 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                bVar = bVarI;
                objY2 = new Function1() { // from class: cfg0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List<LeaderboardRecord> leaderboardRecords;
                        HTTPResponse hTTPResponse;
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        gzs gzsVar2 = gzsVar;
                        wzd0 wzd0Var = gzsVar2 != null ? gzsVar2.a : null;
                        int i7 = wzd0Var == null ? -1 : pfg0.a.a[wzd0Var.ordinal()];
                        if (i7 == 1) {
                            szr.h(szrVar, null, dy9.c, 3);
                        } else if (i7 == 2) {
                            final TournamentRankListResponse tournamentRankListResponse = (gzsVar2 == null || (hTTPResponse = (HTTPResponse) gzsVar2.b) == null) ? null : (TournamentRankListResponse) hTTPResponse.getData();
                            List<LeaderboardRecord> leaderboardRecords2 = tournamentRankListResponse != null ? tournamentRankListResponse.getLeaderboardRecords() : null;
                            if (leaderboardRecords2 != null && !leaderboardRecords2.isEmpty()) {
                                final String str5 = str;
                                final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                                final String str6 = str2;
                                final String str7 = str3;
                                final String str8 = str4;
                                final b5 b5Var5 = b5Var4;
                                final boolean z5 = z4;
                                szr.h(szrVar, null, new op8(942986364, new gaj() { // from class: edg0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        d.a aVar4;
                                        a aVar5 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((gwr) obj2).getClass();
                                        if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            float fA = pi60.a(R.dimen._9sdp, 6, aVar5);
                                            d.a aVar6 = d.a.b;
                                            ty0.a(aVar5, j.i(aVar6, fA));
                                            TournamentRankListResponse tournamentRankListResponse2 = tournamentRankListResponse;
                                            List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse2 != null ? tournamentRankListResponse2.getLeaderboardRecords() : null;
                                            boolean z6 = leaderboardRecords3 == null || leaderboardRecords3.isEmpty();
                                            String str9 = str5;
                                            TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                            if (str9 == null || str9.length() == 0 || str9.equals("--") || str9.equals("0")) {
                                                aVar5.N(-932133914);
                                            } else {
                                                aVar5.N(-874014370);
                                                String string = str8;
                                                if (!Intrinsics.g(string, "--") && !Intrinsics.g(string, "")) {
                                                    string = rw.b(b5Var5, string).toString();
                                                }
                                                pfg0.h(tournamentStatsData3, str9, str6, str7, string, null, z5, aVar5, 0);
                                                ty0.a(aVar5, j.i(aVar6, pi60.a(R.dimen._9sdp, 6, aVar5)));
                                            }
                                            aVar5.H();
                                            if (z6) {
                                                aVar4 = aVar6;
                                                aVar5.N(-932133914);
                                            } else {
                                                aVar5.N(-873244888);
                                                d dVarG3 = h.g(j.g(aVar6, 1.0f), pi60.a(R.dimen._9sdp, 6, aVar5), 4.0f);
                                                d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, 6);
                                                int iHashCode3 = Long.hashCode(aVar5.m());
                                                ne00 ne00VarO = aVar5.o();
                                                d dVarC3 = c.c(aVar5, dVarG3);
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
                                                yka.a.b bVar3 = yka.a.f;
                                                hlh0.a(aVar5, d160VarA, bVar3);
                                                yka.a.d dVar3 = yka.a.e;
                                                hlh0.a(aVar5, ne00VarO, dVar3);
                                                yka.a.C1350a c1350a2 = yka.a.g;
                                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                                    j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar5, dVarC3, cVar2);
                                                v5g0 v5g0Var = v5g0.Z;
                                                String strD = com.sportygames.newcms.c.d(v5g0Var.r, "Rank", aVar5);
                                                Locale locale = Locale.ROOT;
                                                String upperCase2 = strD.toUpperCase(locale);
                                                upperCase2.getClass();
                                                long j = b6g0.f;
                                                qyd0 qyd0Var = pi60.a;
                                                lkf0.b(upperCase2, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                ty0.a(aVar5, j.w(aVar6, pi60.a(R.dimen._36sdp, 6, aVar5)));
                                                String upperCase3 = com.sportygames.newcms.c.d(v5g0Var.t, "Player/Points", aVar5).toUpperCase(locale);
                                                upperCase3.getClass();
                                                lkf0.b(upperCase3, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                                d160 d160VarA2 = b160.a(kw0.b, ht.a.k, aVar5, 54);
                                                int iHashCode4 = Long.hashCode(aVar5.m());
                                                ne00 ne00VarO2 = aVar5.o();
                                                d dVarC4 = c.c(aVar5, layoutWeightElement);
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
                                                hlh0.a(aVar5, d160VarA2, bVar3);
                                                hlh0.a(aVar5, ne00VarO2, dVar3);
                                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                                                }
                                                hlh0.a(aVar5, dVarC4, cVar2);
                                                String upperCase4 = com.sportygames.newcms.c.d(v5g0Var.j, "Prize", aVar5).toUpperCase(locale);
                                                upperCase4.getClass();
                                                lkf0.b(upperCase4, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                ty0.a(aVar5, j.w(aVar6, 2.0f));
                                                StringBuilder sb = new StringBuilder("(IN ");
                                                String upperCase5 = tournamentStatsData3.getCurrency().toUpperCase(locale);
                                                upperCase5.getClass();
                                                sb.append(upperCase5);
                                                sb.append(')');
                                                aVar4 = aVar6;
                                                lkf0.b(sb.toString(), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).h, R.dimen._7ssp, aVar5), aVar5, 384, 0, 65530);
                                                aVar5 = aVar5;
                                                aVar5.s();
                                                aVar5.s();
                                            }
                                            aVar5.H();
                                            ty0.a(aVar5, j.i(aVar4, pi60.a(R.dimen._1sdp, 6, aVar5)));
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 3);
                                if (tournamentRankListResponse != null && (leaderboardRecords = tournamentRankListResponse.getLeaderboardRecords()) != null && !leaderboardRecords.isEmpty()) {
                                    int size = tournamentRankListResponse.getLeaderboardRecords().size();
                                    for (final int i8 = 0; i8 < size; i8++) {
                                        szr.h(szrVar, null, new op8(-1891759734, new gaj() { // from class: gdg0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                Integer rank;
                                                a aVar4 = (a) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((gwr) obj2).getClass();
                                                if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    TournamentRankListResponse tournamentRankListResponse2 = tournamentRankListResponse;
                                                    List<LeaderboardRecord> leaderboardRecords3 = tournamentRankListResponse2.getLeaderboardRecords();
                                                    int i9 = i8;
                                                    LeaderboardRecord leaderboardRecord = leaderboardRecords3.get(i9);
                                                    String strValueOf = (leaderboardRecord == null || (rank = leaderboardRecord.getRank()) == null) ? null : String.valueOf(rank.intValue());
                                                    if (strValueOf == null) {
                                                        strValueOf = "";
                                                    }
                                                    LeaderboardRecord leaderboardRecord2 = tournamentRankListResponse2.getLeaderboardRecords().get(i9);
                                                    String nickName = leaderboardRecord2 != null ? leaderboardRecord2.getNickName() : null;
                                                    if (nickName == null) {
                                                        nickName = "";
                                                    }
                                                    LeaderboardRecord leaderboardRecord3 = tournamentRankListResponse2.getLeaderboardRecords().get(i9);
                                                    String avatarURL = leaderboardRecord3 != null ? leaderboardRecord3.getAvatarURL() : null;
                                                    if (avatarURL == null) {
                                                        avatarURL = "";
                                                    }
                                                    int i10 = rw.a;
                                                    LeaderboardRecord leaderboardRecord4 = tournamentRankListResponse2.getLeaderboardRecords().get(i9);
                                                    Double score = leaderboardRecord4 != null ? leaderboardRecord4.getScore() : null;
                                                    b5 b5Var6 = b5Var5;
                                                    String strB = rw.b(b5Var6, qhg0.a.a(b5Var6, score, 4));
                                                    LeaderboardRecord leaderboardRecord5 = tournamentRankListResponse2.getLeaderboardRecords().get(i9);
                                                    String strA = qhg0.a.a(b5Var6, leaderboardRecord5 != null ? leaderboardRecord5.getPrize() : null, 4);
                                                    LeaderboardRecord leaderboardRecord6 = tournamentRankListResponse2.getLeaderboardRecords().get(i9);
                                                    String patronId = leaderboardRecord6 != null ? leaderboardRecord6.getPatronId() : null;
                                                    pfg0.b(strValueOf, nickName, avatarURL, strB, strA, patronId != null ? patronId : "", null, z5, aVar4, 0);
                                                    ty0.a(aVar4, j.i(d.a.b, pi60.a(R.dimen._4sdp, 6, aVar4)));
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
                                        Pair<Integer, Integer> pairL = pfg0.l(11, tournamentRankListResponse.getTopRankPoints());
                                        Integer num = pairL.a;
                                        bq40Var.a = num != null ? num.intValue() : 0;
                                        int iIntValue = pairL.b.intValue();
                                        bq40Var2.a = iIntValue;
                                        int i9 = bq40Var.a;
                                        if (i9 > -1 && iIntValue >= i9) {
                                            szr.h(szrVar, null, dy9.f, 3);
                                            szr.h(szrVar, null, dy9.g, 3);
                                            szr.h(szrVar, null, dy9.h, 3);
                                            szr.h(szrVar, null, new op8(1611043017, new gaj() { // from class: idg0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    tsr.a aVar4;
                                                    yka.a.C1350a c1350a2;
                                                    a aVar5 = (a) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    ((gwr) obj2).getClass();
                                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        d.a aVar6 = d.a.b;
                                                        d dVarJ = h.j(j.g(aVar6, 1.0f), pi60.a(R.dimen._9sdp, 6, aVar5), 0.0f, 0.0f, 0.0f, 14);
                                                        d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar5, 6);
                                                        int iHashCode3 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO = aVar5.o();
                                                        d dVarC3 = c.c(aVar5, dVarJ);
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
                                                        yka.a.b bVar3 = yka.a.f;
                                                        hlh0.a(aVar5, d160VarA, bVar3);
                                                        yka.a.d dVar3 = yka.a.e;
                                                        hlh0.a(aVar5, ne00VarO, dVar3);
                                                        yka.a.C1350a c1350a3 = yka.a.g;
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                                            j3c.a(iHashCode3, aVar5, iHashCode3, c1350a3);
                                                        }
                                                        yka.a.c cVar2 = yka.a.d;
                                                        hlh0.a(aVar5, dVarC3, cVar2);
                                                        v5g0 v5g0Var = v5g0.Z;
                                                        String strD = com.sportygames.newcms.c.d(v5g0Var.r, "Rank", aVar5);
                                                        Locale locale = Locale.ROOT;
                                                        String upperCase2 = strD.toUpperCase(locale);
                                                        upperCase2.getClass();
                                                        long j = b6g0.f;
                                                        qyd0 qyd0Var = pi60.a;
                                                        lkf0.b(upperCase2, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        kw0.j jVar = kw0.a;
                                                        n54.b bVar4 = ht.a.k;
                                                        d160 d160VarA2 = b160.a(jVar, bVar4, aVar5, 48);
                                                        int iHashCode4 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO2 = aVar5.o();
                                                        d dVarC4 = c.c(aVar5, aVar6);
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
                                                        hlh0.a(aVar5, d160VarA2, bVar3);
                                                        hlh0.a(aVar5, ne00VarO2, dVar3);
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                                            c1350a2 = c1350a3;
                                                            j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                                                        } else {
                                                            c1350a2 = c1350a3;
                                                        }
                                                        hlh0.a(aVar5, dVarC4, cVar2);
                                                        String upperCase3 = com.sportygames.newcms.c.d(v5g0Var.i, "POINTS", aVar5).toUpperCase(locale);
                                                        upperCase3.getClass();
                                                        yka.a.C1350a c1350a4 = c1350a2;
                                                        tsr.a aVar8 = aVar4;
                                                        lkf0.b("    ".concat(upperCase3), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        aVar5.s();
                                                        d dVarJ2 = h.j(aVar6, 0.0f, 0.0f, pi60.a(R.dimen._9sdp, 6, aVar5), 0.0f, 11);
                                                        d160 d160VarA3 = b160.a(jVar, bVar4, aVar5, 48);
                                                        int iHashCode5 = Long.hashCode(aVar5.m());
                                                        ne00 ne00VarO3 = aVar5.o();
                                                        d dVarC5 = c.c(aVar5, dVarJ2);
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
                                                        hlh0.a(aVar5, d160VarA3, bVar3);
                                                        hlh0.a(aVar5, ne00VarO3, dVar3);
                                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                                                            j3c.a(iHashCode5, aVar5, iHashCode5, c1350a4);
                                                        }
                                                        hlh0.a(aVar5, dVarC5, cVar2);
                                                        String upperCase4 = com.sportygames.newcms.c.d(v5g0Var.j, "Prize", aVar5).toUpperCase(locale);
                                                        upperCase4.getClass();
                                                        lkf0.b(upperCase4, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).b, R.dimen._9ssp, aVar5), aVar5, 384, 0, 65530);
                                                        ty0.a(aVar5, j.w(aVar6, 2.0f));
                                                        StringBuilder sb = new StringBuilder("(IN ");
                                                        String upperCase5 = tournamentStatsData2.getCurrency().toUpperCase(locale);
                                                        upperCase5.getClass();
                                                        sb.append(upperCase5);
                                                        sb.append(')');
                                                        lkf0.b(sb.toString(), null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar5.O(qyd0Var)).h, R.dimen._7ssp, aVar5), aVar5, 384, 0, 65530);
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
                                            final int i10 = 0;
                                            while (i10 < size2) {
                                                final TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                                szr.h(szrVar, null, new op8(555075725, new gaj() { // from class: kdg0
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        Object next;
                                                        String str9;
                                                        a aVar4 = (a) obj3;
                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                        ((gwr) obj2).getClass();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            int i11 = bq40Var.a;
                                                            int i12 = i10;
                                                            if (i11 > i12 || i12 > bq40Var2.a) {
                                                                aVar4.N(566379061);
                                                            } else {
                                                                aVar4.N(637019877);
                                                                TopRankPoint topRankPoint = (TopRankPoint) topRankPoints2.get(i12);
                                                                if (topRankPoint != null) {
                                                                    aVar4.N(637195616);
                                                                    if (topRankPoint.getStartRank() == null || topRankPoint.getEndRank() == null || topRankPoint.getStartPoints() == null || topRankPoint.getEndPoints() == null) {
                                                                        aVar4.N(566379061);
                                                                    } else {
                                                                        aVar4.N(637517551);
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append(topRankPoint.getStartRank().intValue());
                                                                        sb.append('-');
                                                                        sb.append(topRankPoint.getEndRank().intValue());
                                                                        String string = sb.toString();
                                                                        int i13 = rw.a;
                                                                        Double startPoints = topRankPoint.getStartPoints();
                                                                        b5 b5Var6 = b5Var5;
                                                                        String strC = rw.c(b5Var6, qhg0.a.a(b5Var6, startPoints, 4));
                                                                        String strC2 = rw.c(b5Var6, qhg0.a.a(b5Var6, topRankPoint.getEndPoints(), 4));
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
                                                                            String str10 = (String) ((Pair) next).a;
                                                                            List listSplit$default = StringsKt__StringsKt.split$default(str10, new String[]{"-"}, false, 0, 6, null);
                                                                            int size3 = listSplit$default.size();
                                                                            int i14 = intRange.b;
                                                                            if (size3 != 2) {
                                                                                Integer intOrNull = StringsKt.toIntOrNull(str10);
                                                                                int iIntValue5 = intOrNull != null ? intOrNull.intValue() : 0;
                                                                                if (iIntValue5 <= i14 && iIntValue3 <= iIntValue5) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                Integer intOrNull2 = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                                                                                int iIntValue6 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                                                                Integer intOrNull3 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
                                                                                int iIntValue7 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                                                                                if (iIntValue6 <= i14 && iIntValue3 <= iIntValue6 && iIntValue7 <= i14 && iIntValue3 <= iIntValue7) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        Pair pair = (Pair) next;
                                                                        if (pair == null || (str9 = (String) pair.b) == null) {
                                                                            str9 = "--";
                                                                        }
                                                                        pfg0.c(string, strC, strC2, str9, null, aVar4, 0);
                                                                    }
                                                                    aVar4.H();
                                                                } else {
                                                                    aVar4.N(566379061);
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
                                                i10++;
                                                tournamentStatsData2 = tournamentStatsData3;
                                            }
                                        }
                                    }
                                    reg0Var.invoke(tournamentRankListResponse);
                                }
                            } else if (z3) {
                                szr.h(szrVar, null, dy9.e, 3);
                            } else {
                                szr.h(szrVar, null, dy9.d, 3);
                            }
                        } else if (i7 == 3) {
                            final Function0 function1 = function0;
                            szr.h(szrVar, null, new op8(1374596321, new gaj() { // from class: mdg0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar4 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        d.a aVar5 = d.a.b;
                                        d dVarJ = h.j(j.e(aVar5, 1.0f), pi60.a(R.dimen._13sdp, 6, aVar4), 70.0f, pi60.a(R.dimen._13sdp, 6, aVar4), 0.0f, 8);
                                        kw0.c cVar2 = kw0.e;
                                        n54.a aVar6 = ht.a.n;
                                        i78 i78VarA2 = g78.a(cVar2, aVar6, aVar4, 54);
                                        int iHashCode3 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO = aVar4.o();
                                        d dVarC3 = c.c(aVar4, dVarJ);
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
                                        yka.a.b bVar3 = yka.a.f;
                                        hlh0.a(aVar4, i78VarA2, bVar3);
                                        yka.a.d dVar3 = yka.a.e;
                                        hlh0.a(aVar4, ne00VarO, dVar3);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                        }
                                        yka.a.c cVar3 = yka.a.d;
                                        hlh0.a(aVar4, dVarC3, cVar3);
                                        h9n.a(erz.a(R.drawable.dlg_broken_chip, 0, aVar4), "chip", dw.a(j.t(aVar5, 90.0f, 86.0f), 0.5f), null, null, 0.0f, null, aVar4, 432, 120);
                                        ty0.a(aVar4, j.i(aVar5, pi60.a(R.dimen._5sdp, 6, aVar4)));
                                        v5g0 v5g0Var = v5g0.Z;
                                        String strP = kotlin.text.c.p(com.sportygames.newcms.c.d(v5g0Var.v, "Something went wrong! Please try again.", aVar4), "!", ".\n", false);
                                        long j = b6g0.f;
                                        qyd0 qyd0Var = pi60.a;
                                        lkf0.b(strP, h.h(aVar5, pi60.a(R.dimen._11sdp, 6, aVar4), 0.0f, 2), j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar4.O(qyd0Var)).b, R.dimen._11ssp, aVar4), aVar4, 384, 0, 65016);
                                        d dVarJ2 = h.j(j.A(j.D(aVar5, null, 3), null, 3), 0.0f, pi60.a(R.dimen._10sdp, 6, aVar4), 0.0f, 0.0f, 13);
                                        List listK = kotlin.collections.b.k(new j58(r58.d(4278880817L)), new j58(r58.d(4278479652L)));
                                        float f4 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                                        d dVarA2 = androidx.compose.foundation.a.a(dVarJ2, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), j060.c(pi60.a(R.dimen._4sdp, 6, aVar4)), 0.0f, 4);
                                        Function0 function2 = function1;
                                        boolean zM2 = aVar4.M(function2);
                                        Object objY3 = aVar4.y();
                                        if (zM2 || objY3 == a.C0041a.a) {
                                            objY3 = new t0r(function2, 1);
                                            aVar4.r(objY3);
                                        }
                                        d dVarA3 = k78.a(aVar6, h.g(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY3, 15), 14.0f, 6.0f));
                                        aiv aivVarC2 = g75.c(ht.a.e, false);
                                        int iHashCode4 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO2 = aVar4.o();
                                        d dVarC4 = c.c(aVar4, dVarA3);
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
                                        hlh0.a(aVar4, aivVarC2, bVar3);
                                        hlh0.a(aVar4, ne00VarO2, dVar3);
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                                            j3c.a(iHashCode4, aVar4, iHashCode4, c1350a2);
                                        }
                                        hlh0.a(aVar4, dVarC4, cVar3);
                                        lkf0.b(com.sportygames.newcms.c.d(v5g0Var.w, "Try Again", aVar4), null, j58.f, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar4.O(qyd0Var)).b, R.dimen._11ssp, aVar4), aVar4, 384, 0, 65018);
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
                bVar.r(objY2);
            } else {
                bVar = bVarI;
            }
            bVarI = bVar;
            aur.a(dVarA, zzrVar, umzVarB, false, null, null, null, false, null, (Function1) objY2, bVarI, i3 & 112, 504);
            bVarI.X(true);
            b5Var2 = b5Var4;
        } else {
            bVarI.G();
            b5Var2 = b5Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(zzrVar, z, z2, tournamentStatsData, gzsVar, str, str2, str3, str4, z3, reg0Var, function0, b5Var2, z4, i) { // from class: cdg0
                public final /* synthetic */ reg0 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ b5 C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ zzr b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ TournamentStatsData e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pfg0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, b5 b5Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        final b5 b5Var2;
        char c;
        b5 b5Var3;
        int i2;
        int i3;
        boolean z2;
        d dVarB;
        String strD;
        b bVarI = aVar.i(-1833477959);
        int i4 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.M(str4) ? 2048 : 1024) | (bVarI.M(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str6) ? 131072 : 65536) | 524288 | (bVarI.b(z) ? 8388608 : 4194304);
        if (bVarI.q(i4 & 1, (4793491 & i4) != 4793490)) {
            bVarI.A0();
            int i5 = i & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                c = ' ';
                Object objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5Var3 = (b5) objY;
                i2 = i4 & (-3670017);
            } else {
                bVarI.G();
                i2 = i4 & (-3670017);
                b5Var3 = b5Var;
                c = ' ';
            }
            bVarI.Y();
            List listK = z ? kotlin.collections.b.k(new j58(r58.d(4279309079L)), new j58(r58.d(4279309079L))) : kotlin.collections.b.k(new j58(r58.d(4280953898L)), new j58(r58.d(4279901475L)));
            if (str6.length() <= 0 || !str6.equals(b5Var3.fetchPatronId())) {
                i3 = R.drawable.dlg_ic_rank_polygon;
                z2 = false;
            } else {
                listK = kotlin.collections.b.k(new j58(r58.d(4284370982L)), new j58(r58.d(4281478431L)));
                i3 = R.drawable.dlg_ic_rank_polygon_gold;
                z2 = true;
            }
            d.a aVar2 = d.a.b;
            boolean z3 = z2;
            d dVarG = j.g(aVar2, 1.0f);
            int i6 = i2;
            List listK2 = kotlin.collections.b.k(new j58(r58.d(4294954815L)), new j58(r58.d(4293647277L)), new j58(r58.d(4294954815L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i7 = (14 & 8) != 0 ? 0 : 2;
            d dVarJ = h.j(androidx.compose.foundation.a.a(dVarG, new hfs(listK2, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << c), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << c), i7), z3 ? j060.c(10.0f) : j060.d(6.0f, 7.0f, 7.0f, 6.0f), 0.0f, 4), z3 ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            b5 b5Var4 = b5Var3;
            d dVarA = androidx.compose.foundation.a.a(j.g(aVar2, 1.0f), ya5.a.a(0.0f, 0.0f, 14, listK), z3 ? j060.c(10.0f) : j060.c(6.0f), 0.0f, 4);
            if (z) {
                bVarI.N(861701376);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new ql3(1);
                    bVarI.r(objY2);
                }
                dVarB = androidx.compose.ui.draw.a.b(aVar2, (Function1) objY2);
                bVarI.X(false);
            } else {
                bVarI.N(862369271);
                bVarI.X(false);
                dVarB = aVar2;
            }
            d dVarG2 = h.g(dVarA.n(dVarB).n(z3 ? d35.a(aVar2, 0.5f, r58.d(4293117765L), j060.c(10.0f)) : aVar2), pi60.a(R.dimen._9sdp, 6, bVarI), pi60.a(R.dimen._5sdp, 6, bVarI));
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarR = j.r(aVar2, pi60.a(R.dimen._28sdp, 6, bVarI));
            aiv aivVarC2 = g75.c(ht.a.e, false);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarR);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h9n.a(erz.a(i3, 0, bVarI), "polygon", j.r(aVar2, pi60.a(R.dimen._24sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            long j = j58.f;
            t9i t9iVar = t9i.E;
            lkf0.b(str, null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i6 & 14) | 196992, 0, 131034);
            bVarI.X(true);
            ty0.a(bVarI, j.w(aVar2, pi60.a(R.dimen._30sdp, 6, bVarI)));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d160 d160VarA2 = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            gcg0.a(str3, "Player", ls7.a(j.r(aVar2, pi60.a(R.dimen._12sdp, 6, bVarI)), j060.c(7.0f)), d0b.a.a, null, 0.0f, erz.a(2131231446, 0, bVarI), erz.a(2131231446, 0, bVarI), bVarI, ((i6 >> 6) & 14) | 3120, 112);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            if (str6.equals(b5Var4.fetchPatronId())) {
                bVarI.N(-1533353934);
                strD = com.sportygames.newcms.c.d(v5g0.Z.n, "You", bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1533104725);
                bVarI.X(false);
                strD = str2;
            }
            lkf0.b(strD, null, b6g0.j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(pi60.a)).b, R.dimen._11ssp, bVarI), bVarI, 384, 0, 65530);
            szg.a(bVarI, true, aVar2, 4.0f, bVarI);
            d160 d160VarA3 = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            h9n.a(erz.a(R.drawable.dlg_ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar2, pi60.a(R.dimen._11sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            int i8 = rw.a;
            String strA = rw.a(b5Var4, kotlin.text.c.p(str4, ",", "", false));
            if (strA == null) {
                strA = "--";
            }
            lkf0.b(strA, null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131034);
            bVarI.X(true);
            bVarI.X(true);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            d160 d160VarA4 = b160.a(kw0.b, bVar3, bVarI, 54);
            int iHashCode7 = Long.hashCode(bVarI.m());
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS7, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            }
            hlh0.a(bVarI, dVarC7, cVar);
            lkf0.b(str5.equals("--") ? "--" : rw.b(b5Var4, str5), null, j, 0L, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131034);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            h9n.a(erz.a(R.drawable.dlg_ic_leaderboard_money, 0, bVarI), "Money", j.r(aVar2, pi60.a(R.dimen._11sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            bVar = bVarI;
            f30.a(bVar, true, true, true);
            b5Var2 = b5Var4;
        } else {
            bVar = bVarI;
            bVar.G();
            b5Var2 = b5Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, str4, str5, str6, b5Var2, z, i) { // from class: deg0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ b5 i;
                public final /* synthetic */ boolean v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pfg0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x050b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0513  */
    /* JADX WARN: Code duplicated, block: B:111:0x0531  */
    /* JADX WARN: Code duplicated, block: B:116:0x0548  */
    /* JADX WARN: Code duplicated, block: B:117:0x054c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0559  */
    /* JADX WARN: Code duplicated, block: B:86:0x02dd  */
    public static final void c(final String str, final String str2, String str3, String str4, b5 b5Var, androidx.compose.runtime.a aVar, final int i) {
        final b5 b5Var2;
        b5 b5Var3;
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        String str5;
        tsr.a aVar3;
        String str6;
        qyd0 qyd0Var;
        String strA;
        int i3;
        String strA2;
        b5 b5Var4;
        b bVar;
        int iHashCode;
        String strB;
        b5 b5Var5;
        String strB2;
        String str7 = str3;
        String str8 = str4;
        b bVarI = aVar.i(-1998342306);
        int i4 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str7) ? 256 : 128) | (bVarI.M(str8) ? 2048 : 1024) | 8192;
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5Var3 = (b5) objY;
                i2 = i4 & (-57345);
            } else {
                bVarI.G();
                i2 = i4 & (-57345);
                b5Var3 = b5Var;
            }
            bVarI.Y();
            List listK = kotlin.collections.b.k(new j58(r58.d(4280953898L)), new j58(r58.d(4279901475L)));
            d.a aVar4 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), b6g0.a, j060.d(6.0f, 7.0f, 7.0f, 6.0f)), 1.0f, 0.0f, 0.0f, 0.0f, 14);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            d dVarG = h.g(androidx.compose.foundation.a.a(j.g(aVar4, 1.0f), ya5.a.a(0.0f, 0.0f, 14, listK), j060.c(6.0f), 0.0f, 4), pi60.a(R.dimen._9sdp, 6, bVarI), pi60.a(R.dimen._8sdp, 6, bVarI));
            kw0.g gVar = kw0.g;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar3, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            d dVarC3 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            qyd0 qyd0Var2 = pi60.a;
            b5 b5Var6 = b5Var3;
            lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, k(str, ((ufd0) bVarI.O(qyd0Var2)).b, bVarI), bVarI, (i2 & 14) | 384, 0, 65530);
            long j2 = j;
            bVarI.X(true);
            d160 d160VarA2 = b160.a(kw0.a, bVar3, bVarI, 48);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
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
                    bVarI.N(-988589123);
                    imf0 imf0VarC = pi60.c(((ufd0) bVarI.O(qyd0Var2)).b, R.dimen._11sdp, bVarI);
                    aVar3 = aVar2;
                    str6 = "--";
                    str7 = str3;
                    qyd0Var = qyd0Var2;
                    lkf0.b("--", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarC, bVarI, 390, 0, 65530);
                    bVar = bVarI;
                    bVar.X(false);
                    b5Var4 = b5Var6;
                    i3 = 6;
                }
                bVar.X(true);
                d160 d160VarA3 = b160.a(kw0.b, ht.a.j, bVar, i3);
                iHashCode = Long.hashCode(bVar.T);
                ne00 ne00VarS5 = bVar.S();
                d dVarC5 = c.c(bVar, aVar4);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
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
                strB = str6;
                if (str8.equals(strB)) {
                    strB2 = strB;
                    b5Var5 = b5Var4;
                } else {
                    b5Var5 = b5Var4;
                    strB2 = rw.b(b5Var5, str8);
                }
                if (!str8.equals(strB)) {
                    strB = rw.b(b5Var5, str8);
                }
                imf0 imf0VarK = k(strB, ((ufd0) bVar.O(qyd0Var)).b, bVar);
                mjm mjmVar = mt.b;
                b bVar4 = bVar;
                lkf0.b(strB2, new WithAlignmentLineElement(mjmVar), j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, imf0VarK, bVar4, 384, 0, 65016);
                ty0.a(bVar4, j.w(aVar4, 1.0f));
                String upperCase = com.sportygames.newcms.c.d(v5g0.Z.o, "EACH", bVar4).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                lkf0.b("/".concat(upperCase), new WithAlignmentLineElement(mjmVar), b6g0.i, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVar4.O(qyd0Var)).h, R.dimen._7sdp, bVar4), bVar4, 384, 0, 65528);
                bVarI = bVar4;
                f30.a(bVarI, true, true, true);
                b5Var2 = b5Var5;
            } else {
                str5 = str3;
            }
            if (str2.equals("0.00") && str5.equals("0.00")) {
                bVarI.N(-988589123);
                imf0 imf0VarC2 = pi60.c(((ufd0) bVarI.O(qyd0Var2)).b, R.dimen._11sdp, bVarI);
                aVar3 = aVar2;
                str6 = "--";
                str7 = str3;
                qyd0Var = qyd0Var2;
                lkf0.b("--", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarC2, bVarI, 390, 0, 65530);
                bVar = bVarI;
                bVar.X(false);
                b5Var4 = b5Var6;
                i3 = 6;
            } else {
                aVar3 = aVar2;
                str7 = str5;
                str6 = "--";
                qyd0Var = qyd0Var2;
                bVarI.N(-988278968);
                h9n.a(erz.a(R.drawable.dlg_ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar4, pi60.a(R.dimen._11sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
                ty0.a(bVarI, j.w(aVar4, 4.0f));
                int i5 = rw.a;
                if (Intrinsics.g(rw.a(b5Var6, kotlin.text.c.p(str2, ",", "", false)), "0") || (strA = rw.a(b5Var6, kotlin.text.c.p(str2, ",", "", false))) == null) {
                    strA = str6;
                }
                lkf0.b(strA, null, j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str2, ((ufd0) bVarI.O(qyd0Var)).b, bVarI), bVarI, 384, 0, 65018);
                ty0.a(bVarI, j.w(aVar4, 6.0f));
                lkf0.b("-", null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).b, R.dimen._11sdp, bVarI), bVarI, 390, 0, 65530);
                ty0.a(bVarI, j.w(aVar4, 6.0f));
                i3 = 6;
                h9n.a(erz.a(R.drawable.dlg_ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar4, pi60.a(R.dimen._11sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
                ty0.a(bVarI, j.w(aVar4, 4.0f));
                j2 = j2;
                b5Var4 = b5Var6;
                lkf0.b((Intrinsics.g(rw.a(b5Var6, kotlin.text.c.p(str7, ",", "", false)), "0") || (strA2 = rw.a(b5Var6, kotlin.text.c.p(str7, ",", "", false))) == null) ? str6 : strA2, null, j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str7, ((ufd0) bVarI.O(qyd0Var)).b, bVarI), bVarI, 384, 0, 65018);
                bVar = bVarI;
                bVar.X(false);
            }
            bVar.X(true);
            d160 d160VarA4 = b160.a(kw0.b, ht.a.j, bVar, i3);
            iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS6 = bVar.S();
            d dVarC6 = c.c(bVar, aVar4);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
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
            strB = str6;
            if (str8.equals(strB)) {
                strB2 = strB;
                b5Var5 = b5Var4;
            } else {
                b5Var5 = b5Var4;
                strB2 = rw.b(b5Var5, str8);
            }
            if (!str8.equals(strB)) {
                strB = rw.b(b5Var5, str8);
            }
            imf0 imf0VarK2 = k(strB, ((ufd0) bVar.O(qyd0Var)).b, bVar);
            mjm mjmVar2 = mt.b;
            b bVar5 = bVar;
            lkf0.b(strB2, new WithAlignmentLineElement(mjmVar2), j2, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, imf0VarK2, bVar5, 384, 0, 65016);
            ty0.a(bVar5, j.w(aVar4, 1.0f));
            String upperCase2 = com.sportygames.newcms.c.d(v5g0.Z.o, "EACH", bVar5).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            lkf0.b("/".concat(upperCase2), new WithAlignmentLineElement(mjmVar2), b6g0.i, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVar5.O(qyd0Var)).h, R.dimen._7sdp, bVar5), bVar5, 384, 0, 65528);
            bVarI = bVar5;
            f30.a(bVarI, true, true, true);
            b5Var2 = b5Var5;
        } else {
            bVarI.G();
            b5Var2 = b5Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str9 = str8;
            final String str10 = str7;
            eVarZ.d = new Function2(str, str2, str10, str9, b5Var2, i) { // from class: vdg0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ b5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pfg0.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Pair<String, String> pair, final int i, androidx.compose.runtime.a aVar, final int i2) {
        b bVar;
        b bVarI = aVar.i(609934550);
        int i3 = (bVarI.M(pair) ? 4 : 2) | i2 | (bVarI.d(i) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarG = h.g(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), i % 2 == 0 ? j58.c(0.04f, j58.f) : b6g0.e, zk40.a), pi60.a(R.dimen._19sdp, 6, bVarI), 4.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            qyd0 qyd0Var = pi60.a;
            lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).d, R.dimen._10ssp, bVarI), bVarI, 384, 0, 65530);
            lkf0.b(pair.b, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).d, R.dimen._10ssp, bVarI), bVarI, 384, 0, 65530);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: xdg0
                public final /* synthetic */ int b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pfg0.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final zzr zzrVar, final TournamentStatsData tournamentStatsData, final String str, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        float f;
        float f2;
        zzrVar.getClass();
        b bVarI = aVar.i(-1884367354);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(zzrVar) ? 32 : 16) | (bVarI.A(tournamentStatsData) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.b(z2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (66707 & i2) != 66706)) {
            d dVarG = j.g(dVar, 1.0f);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z2) {
                bVarI.N(1599185146);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.46f;
            } else {
                bVarI.N(1599183290);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                f2 = 0.42f;
            }
            float f3 = f * f2;
            bVarI.X(false);
            d dVarH = h.h(j.i(dVarG, f3), pi60.a(R.dimen._9sdp, 6, bVarI), 0.0f, 2);
            boolean zA = bVarI.A(tournamentStatsData) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: ueg0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final String str2 = str;
                        szr.h(szrVar, null, new op8(245472283, new gaj() { // from class: odg0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    pfg0.i(6, aVar2, j.g(d.a.b, 1.0f), str2);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                        szr.h(szrVar, null, new op8(386022418, new gaj() { // from class: qdg0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    float fA = pi60.a(R.dimen._9sdp, 6, aVar2);
                                    d.a aVar3 = d.a.b;
                                    ty0.a(aVar2, j.i(aVar3, fA));
                                    d dVarJ = h.j(j.g(aVar3, 1.0f), 24.0f, 0.0f, 0.0f, 0.0f, 14);
                                    d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar2, 6);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC = c.c(aVar2, dVarJ);
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
                                    yka.a.b bVar2 = yka.a.f;
                                    hlh0.a(aVar2, d160VarA, bVar2);
                                    yka.a.d dVar2 = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar2);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC, cVar);
                                    v5g0 v5g0Var = v5g0.Z;
                                    String strD = com.sportygames.newcms.c.d(v5g0Var.r, "Rank", aVar2);
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strD.toUpperCase(locale);
                                    upperCase.getClass();
                                    long j = j58.f;
                                    long jC = j58.c(0.6f, j);
                                    qyd0 qyd0Var = pi60.a;
                                    lkf0.b(upperCase, null, jC, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).d, R.dimen._9ssp, aVar2), aVar2, 384, 0, 65530);
                                    d dVarJ2 = h.j(aVar3, 0.0f, 0.0f, 24.0f, 0.0f, 11);
                                    d160 d160VarA2 = b160.a(kw0.a, ht.a.k, aVar2, 48);
                                    int iHashCode2 = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO2 = aVar2.o();
                                    d dVarC2 = c.c(aVar2, dVarJ2);
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
                                    hlh0.a(aVar2, d160VarA2, bVar2);
                                    hlh0.a(aVar2, ne00VarO2, dVar2);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    String upperCase2 = com.sportygames.newcms.c.d(v5g0Var.j, "Prize", aVar2).toUpperCase(locale);
                                    upperCase2.getClass();
                                    lkf0.b(upperCase2, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).d, R.dimen._9ssp, aVar2), aVar2, 384, 0, 65530);
                                    ty0.a(aVar2, j.w(aVar3, 4.0f));
                                    StringBuilder sb = new StringBuilder("(IN ");
                                    String upperCase3 = tournamentStatsData2.getCurrency().toUpperCase(locale);
                                    upperCase3.getClass();
                                    sb.append(upperCase3);
                                    sb.append(')');
                                    lkf0.b(sb.toString(), null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).h, R.dimen._7ssp, aVar2), aVar2, 384, 0, 65530);
                                    aVar2.s();
                                    aVar2.s();
                                    ty0.a(aVar2, j.i(aVar3, pi60.a(R.dimen._5sdp, 6, aVar2)));
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        List<Pair<String, String>> prizeListMap = tournamentStatsData2.getPrizeListMap();
                        szrVar.d(prizeListMap.size(), null, new efg0(prizeListMap), new op8(802480018, new gfg0(prizeListMap, tournamentStatsData2), true));
                        szr.h(szrVar, null, dy9.i, 3);
                        return Unit.a;
                    }
                };
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
            eVarZ.d = new Function2(zzrVar, tournamentStatsData, str, z, z2, i) { // from class: weg0
                public final /* synthetic */ zzr b;
                public final /* synthetic */ TournamentStatsData c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pfg0.e(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final String str, final b5 b5Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        String strA;
        b bVarI = aVar.i(-1214721234);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(b5Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
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
                objY2 = new ifg0(null, ytwVar, str);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, str, (Function2) objY2);
            Double d = (Double) ytwVar.getValue();
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                int i3 = rw.a;
                strA = rw.a(b5Var, String.valueOf(dDoubleValue));
                if (strA == null) {
                    strA = "";
                }
            } else {
                strA = "--";
            }
            bVar = bVarI;
            lkf0.b(strA, null, j58.f, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(strA, ((ufd0) bVarI.O(pi60.a)).d, bVarI), bVar, 384, 0, 65018);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: geg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    pfg0.f(str, b5Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final TournamentStatsData tournamentStatsData, final Function0 function0, final aig0 aig0Var, final String str, final j58 j58Var, final List list, final Function0 function1, final Function0 function2, final HashMap map, final HashMap map2, final boolean z, final float f, final int i, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        aig0Var.getClass();
        map2.getClass();
        b bVarI = aVar.i(1759862653);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(tournamentStatsData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(aig0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(j58Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(list) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.A(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(map) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(map2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (bVarI.b(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= bVarI.b(z3) ? 16384 : 8192;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
            boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = qn70VarA.a(jq40.a(b5.class), null, null);
                bVarI.r(objY);
            }
            bVarI.X(false);
            bVarI.X(false);
            final b5 b5Var = (b5) objY;
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) n95.a(aig0Var.w, new com.sportygames.newcms.b(0), null, bVarI, 0, 2).getValue();
            bVarI = bVarI;
            com.sportygames.newcms.c.a(bVar, pp8.b(-1226456284, new Function2() { // from class: ieg0
                /* JADX WARN: Code duplicated, block: B:151:0x0400  */
                /* JADX WARN: Code duplicated, block: B:152:0x040c  */
                /* JADX WARN: Code duplicated, block: B:155:0x0428  */
                /* JADX WARN: Code duplicated, block: B:159:0x0474  */
                /* JADX WARN: Code duplicated, block: B:162:0x04b7  */
                /* JADX WARN: Code duplicated, block: B:164:0x04c0  */
                /* JADX WARN: Code duplicated, block: B:165:0x04c4  */
                /* JADX WARN: Code duplicated, block: B:170:0x04e1  */
                /* JADX WARN: Code duplicated, block: B:173:0x050a  */
                /* JADX WARN: Code duplicated, block: B:175:0x0513  */
                /* JADX WARN: Code duplicated, block: B:176:0x0517  */
                /* JADX WARN: Code duplicated, block: B:181:0x0534  */
                /* JADX WARN: Code duplicated, block: B:184:0x057d  */
                /* JADX WARN: Code duplicated, block: B:186:0x0585  */
                /* JADX WARN: Code duplicated, block: B:187:0x0596  */
                /* JADX WARN: Code duplicated, block: B:189:0x05aa  */
                /* JADX WARN: Code duplicated, block: B:191:0x05b3  */
                /* JADX WARN: Code duplicated, block: B:192:0x05c7  */
                /* JADX WARN: Code duplicated, block: B:195:0x05e6  */
                /* JADX WARN: Code duplicated, block: B:196:0x05ea  */
                /* JADX WARN: Code duplicated, block: B:200:0x064f  */
                /* JADX WARN: Code duplicated, block: B:206:0x066a  */
                /* JADX WARN: Code duplicated, block: B:212:0x067d  */
                /* JADX WARN: Code duplicated, block: B:216:0x0686  */
                /* JADX WARN: Code duplicated, block: B:218:0x06a0  */
                /* JADX WARN: Code duplicated, block: B:220:0x06a4  */
                /* JADX WARN: Code duplicated, block: B:56:0x0190  */
                /* JADX WARN: Code duplicated, block: B:58:0x01a7 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v34, types: [T, com.sportygames.campaign.data.model.TournamentRankResponse] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zzr zzrVar;
                    zzr zzrVar2;
                    TournamentRankListResponse tournamentRankListResponse;
                    String strValueOf;
                    Double pointsScore;
                    String strValueOf2;
                    Integer rank;
                    final ytw ytwVar;
                    yka.a.c cVar;
                    float f2;
                    final float fC1;
                    Object objY2;
                    final isw iswVar;
                    Object objY3;
                    final ytw ytwVar2;
                    float fD;
                    androidx.compose.foundation.layout.d dVar;
                    n54 n54Var;
                    boolean zM2;
                    Object objY4;
                    i78 i78VarA;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    aiv aivVarC;
                    int iHashCode2;
                    ne00 ne00VarO2;
                    d dVarC2;
                    final boolean z4;
                    final boolean z5;
                    float fA;
                    String strD;
                    float f3;
                    Function0 function3;
                    boolean zM3;
                    Object objY5;
                    Function0 function4;
                    boolean zM4;
                    Object objY6;
                    int i6;
                    int i7;
                    float f4;
                    String str2;
                    String strValueOf3;
                    String strValueOf4;
                    Double pointsScore2;
                    Integer rank2;
                    String strValueOf5;
                    String strValueOf6;
                    boolean zA;
                    Object objY7;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objY8 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        String str3 = "--";
                        if (objY8 == c0042a) {
                            objY8 = m.b("--");
                            aVar2.r(objY8);
                        }
                        final ytw ytwVar3 = (ytw) objY8;
                        Object objY9 = aVar2.y();
                        if (objY9 == c0042a) {
                            objY9 = m.b("--");
                            aVar2.r(objY9);
                        }
                        final ytw ytwVar4 = (ytw) objY9;
                        Object objY10 = aVar2.y();
                        if (objY10 == c0042a) {
                            objY10 = m.b("--");
                            aVar2.r(objY10);
                        }
                        final ytw ytwVar5 = (ytw) objY10;
                        Object objY11 = aVar2.y();
                        if (objY11 == c0042a) {
                            objY11 = m.b("0");
                            aVar2.r(objY11);
                        }
                        ytw ytwVar6 = (ytw) objY11;
                        Object objY12 = aVar2.y();
                        if (objY12 == c0042a) {
                            objY12 = k.a(0);
                            aVar2.r(objY12);
                        }
                        final osw oswVar = (osw) objY12;
                        v5g0 v5g0Var = v5g0.Z;
                        final List listK = kotlin.collections.b.k(com.sportygames.newcms.c.d(v5g0Var.d, "Leaderboard", aVar2), com.sportygames.newcms.c.d(v5g0Var.e, "Prize & Rules", aVar2));
                        final aig0 aig0Var2 = aig0Var;
                        final ytw ytwVarA = ts9.a(aig0Var2.e, aVar2);
                        final TournamentStatsData tournamentStatsData2 = tournamentStatsData;
                        long tournamentId = tournamentStatsData2.getTournamentId();
                        zzr zzrVarA = e0s.a(0, 3, aVar2);
                        zzr zzrVarA2 = e0s.a(0, 3, aVar2);
                        Object objY13 = aVar2.y();
                        if (objY13 == c0042a) {
                            objY13 = k.a(oswVar.D());
                            aVar2.r(objY13);
                        }
                        osw oswVar2 = (osw) objY13;
                        Integer numValueOf = Integer.valueOf(oswVar.D());
                        boolean zM5 = aVar2.M(zzrVarA) | aVar2.M(zzrVarA2);
                        Object objY14 = aVar2.y();
                        if (zM5 || objY14 == c0042a) {
                            zzrVar = zzrVarA;
                            zzrVar2 = zzrVarA2;
                            jfg0 jfg0Var = new jfg0(zzrVar, zzrVar2, oswVar2, oswVar, null);
                            aVar2.r(jfg0Var);
                            objY14 = jfg0Var;
                        } else {
                            zzrVar2 = zzrVarA2;
                            zzrVar = zzrVarA;
                        }
                        xvf.e(aVar2, numValueOf, (Function2) objY14);
                        HashMap map3 = map;
                        if (map3 != null && map3.isEmpty()) {
                            aVar2.N(-70878222);
                            Unit unit = Unit.a;
                            zA = aVar2.A(aig0Var2) | aVar2.e(tournamentId);
                            objY7 = aVar2.y();
                            if (zA) {
                                objY7 = new lfg0(aig0Var2, tournamentId, null);
                                aVar2.r(objY7);
                            } else {
                                objY7 = new lfg0(aig0Var2, tournamentId, null);
                                aVar2.r(objY7);
                            }
                            xvf.e(aVar2, unit, (Function2) objY7);
                            aVar2.H();
                        } else if ((map3 != null ? (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId)) : null) == null) {
                            aVar2.N(-70878222);
                            Unit unit2 = Unit.a;
                            zA = aVar2.A(aig0Var2) | aVar2.e(tournamentId);
                            objY7 = aVar2.y();
                            if (zA || objY7 == c0042a) {
                                objY7 = new lfg0(aig0Var2, tournamentId, null);
                                aVar2.r(objY7);
                            }
                            xvf.e(aVar2, unit2, (Function2) objY7);
                            aVar2.H();
                        } else {
                            TournamentRankListResponse tournamentRankListResponse2 = (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId));
                            List<LeaderboardRecord> leaderboardRecords = tournamentRankListResponse2 != null ? tournamentRankListResponse2.getLeaderboardRecords() : null;
                            if (leaderboardRecords == null || leaderboardRecords.isEmpty()) {
                                aVar2.N(-70878222);
                                Unit unit3 = Unit.a;
                                zA = aVar2.A(aig0Var2) | aVar2.e(tournamentId);
                                objY7 = aVar2.y();
                                if (zA) {
                                    objY7 = new lfg0(aig0Var2, tournamentId, null);
                                    aVar2.r(objY7);
                                } else {
                                    objY7 = new lfg0(aig0Var2, tournamentId, null);
                                    aVar2.r(objY7);
                                }
                                xvf.e(aVar2, unit3, (Function2) objY7);
                                aVar2.H();
                            } else {
                                aVar2.N(-70757818);
                                aVar2.H();
                                if (map3.get(Long.valueOf(tournamentId)) != null) {
                                    TournamentRankListResponse tournamentRankListResponse3 = (TournamentRankListResponse) map3.get(Long.valueOf(tournamentId));
                                    if (tournamentRankListResponse3 == null) {
                                        m2g m2gVar = m2g.a;
                                        tournamentRankListResponse = new TournamentRankListResponse(m2gVar, m2gVar, null, 4, null);
                                    } else {
                                        tournamentRankListResponse = tournamentRankListResponse3;
                                    }
                                    aig0Var2.e.j(new gzs<>(wzd0.b, new HTTPResponse(10000, "Success", 0, tournamentRankListResponse, null, null, null, 64, null), null, null, 16));
                                }
                            }
                        }
                        String strD2 = com.sportygames.newcms.c.d(v5g0Var.x, "Terms & Conditions", aVar2);
                        y5g0 y5g0Var = y5g0.a;
                        String currency = tournamentStatsData2.getCurrency();
                        String minBetAmount = tournamentStatsData2.getMinBetAmount();
                        String strB = t69.b(tournamentStatsData2.getStartDate());
                        String strB2 = t69.b(tournamentStatsData2.getEndDate());
                        String minimumCashoutCoefficient = tournamentStatsData2.getMinimumCashoutCoefficient();
                        String onlyAmount = tournamentStatsData2.getOnlyAmount();
                        String firstPrize = tournamentStatsData2.getFirstPrize();
                        y5g0Var.getClass();
                        final String strC = qae0.c("\n        <html>\n        <head>\n            <style>\n                body {\n                    color: white;\n                    background-color: transparent;\n                    font-size: 15px;\n                    line-height: 1.5;\n                }\n                ul {\n                    list-style-type: none;\n                    padding-left: 1em;\n                    margin: 0;\n                }\n                ul li {\n                    position: relative;\n                    padding-left: 1.5em;\n                    margin-bottom: 0.5em;\n                }\n                ul li::before {\n                    content: \"♦\";\n                    display: inline-block;\n                    width: 1em;\n                    margin-left: -0.5em;\n                    margin-right: 1.2em;\n                    font-size: 0.9em;\n                    text-shadow: 0 0 0 white;\n                    color: transparent;  \n                    position: absolute;\n                    left: 0;\n                    top: 0.1em;\n                }\n            </style>\n        </head>\n        <body>\n            " + y5g0.a(strD2, currency, minBetAmount, strB, strB2, minimumCashoutCoefficient, onlyAmount, firstPrize) + "\n        </body>\n        </html>\n    ");
                        final dq40 dq40Var = new dq40();
                        HashMap map4 = map2;
                        if (map4 == null || map4.isEmpty() || !map4.containsKey(Long.valueOf(tournamentStatsData2.getTournamentId())) || map4.get(Long.valueOf(tournamentStatsData2.getTournamentId())) == null || (str2 = (String) map4.get(Long.valueOf(tournamentStatsData2.getTournamentId()))) == null || str2.length() <= 0) {
                            UserPlayInfo rankData = tournamentStatsData2.getRankData();
                            if (rankData == null || (rank = rankData.getRank()) == null || (strValueOf = String.valueOf(rank.intValue())) == null) {
                                strValueOf = "--";
                            }
                            ytwVar6.setValue(strValueOf);
                            UserPlayInfo rankData2 = tournamentStatsData2.getRankData();
                            if (rankData2 != null && (pointsScore = rankData2.getPointsScore()) != null && (strValueOf2 = String.valueOf(pointsScore.doubleValue())) != null) {
                                str3 = strValueOf2;
                            }
                            ytwVar5.setValue(str3);
                        } else {
                            Set setEntrySet = map4.entrySet();
                            setEntrySet.getClass();
                            for (Object obj3 : setEntrySet) {
                                obj3.getClass();
                                Map.Entry entry = (Map.Entry) obj3;
                                if (entry.getKey() != null) {
                                    Object value = entry.getValue();
                                    value.getClass();
                                    if (((CharSequence) value).length() > 0) {
                                        Long l = (Long) entry.getKey();
                                        long tournamentId2 = tournamentStatsData2.getTournamentId();
                                        if (l != null && l.longValue() == tournamentId2) {
                                            ?? r8 = (TournamentRankResponse) new eal().e((String) entry.getValue(), TournamentRankResponse.class);
                                            if (r8 != 0) {
                                                dq40Var.a = r8;
                                                Integer rank3 = r8.getRank();
                                                if (rank3 == null || (strValueOf5 = String.valueOf(rank3.intValue())) == null) {
                                                    strValueOf5 = "--";
                                                }
                                                ytwVar6.setValue(strValueOf5);
                                                Double score = ((TournamentRankResponse) dq40Var.a).getScore();
                                                if (score != null && (strValueOf6 = String.valueOf(score.doubleValue())) != null) {
                                                    str3 = strValueOf6;
                                                }
                                                ytwVar5.setValue(str3);
                                                break;
                                            }
                                            return Unit.a;
                                        }
                                    }
                                }
                                UserPlayInfo rankData3 = tournamentStatsData2.getRankData();
                                if (rankData3 == null || (rank2 = rankData3.getRank()) == null || (strValueOf3 = String.valueOf(rank2.intValue())) == null) {
                                    strValueOf3 = "--";
                                }
                                ytwVar6.setValue(strValueOf3);
                                UserPlayInfo rankData4 = tournamentStatsData2.getRankData();
                                if (rankData4 == null || (pointsScore2 = rankData4.getPointsScore()) == null || (strValueOf4 = String.valueOf(pointsScore2.doubleValue())) == null) {
                                    strValueOf4 = "--";
                                }
                                ytwVar5.setValue(strValueOf4);
                            }
                        }
                        List list2 = list;
                        boolean zIsEmpty = list2.isEmpty();
                        final boolean z6 = !zIsEmpty;
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.7f, b6g0.r), zk40.a);
                        Unit unit4 = Unit.a;
                        Object objY15 = aVar2.y();
                        if (objY15 == c0042a) {
                            objY15 = mfg0.a;
                            aVar2.r(objY15);
                        }
                        d dVarA = wje0.a(dVarB, unit4, (PointerInputEventHandler) objY15);
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = c.c(aVar2, dVarA);
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
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, aivVarC2, bVar2);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO3, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g()) {
                            ytwVar = ytwVar6;
                        } else {
                            ytwVar = ytwVar6;
                            if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            }
                            cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC3, cVar);
                            Configuration configuration = (Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a);
                            mmd mmdVar = (mmd) aVar2.O(kna.h);
                            f2 = configuration.screenHeightDp;
                            fC1 = mmdVar.C1(f2);
                            Object[] objArr = new Object[0];
                            objY2 = aVar2.y();
                            if (objY2 == c0042a) {
                                objY2 = new o1r(1);
                                aVar2.r(objY2);
                            }
                            iswVar = (isw) o350.e(objArr, (Function0) objY2, aVar2, 48);
                            Object[] objArr2 = {Integer.valueOf(configuration.orientation)};
                            objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = new f8h(1);
                                aVar2.r(objY3);
                            }
                            ytwVar2 = (ytw) o350.e(objArr2, (Function0) objY3, aVar2, 48);
                            fD = f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f);
                            d dVarG = j.g(aVar3, 1.0f);
                            dVar = androidx.compose.foundation.layout.d.a;
                            n54Var = ht.a.h;
                            d dVarB2 = dVar.b(dVarG, n54Var);
                            zM2 = aVar2.M(ytwVar2) | aVar2.c(fC1) | aVar2.M(iswVar);
                            objY4 = aVar2.y();
                            if (zM2 || objY4 == c0042a) {
                                objY4 = new Function1() { // from class: oeg0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        urr urrVar = (urr) obj4;
                                        urrVar.getClass();
                                        ytw ytwVar7 = ytwVar2;
                                        if (!((Boolean) ytwVar7.getValue()).booleanValue()) {
                                            float fD2 = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                            isw iswVar2 = iswVar;
                                            if (Math.abs(fD2 - iswVar2.j()) > 0.001f) {
                                                iswVar2.A(fD2);
                                            }
                                            ytwVar7.setValue(Boolean.TRUE);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY4);
                            }
                            d dVarA2 = v.a(dVarB2, (Function1) objY4);
                            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                            d dVarA3 = u8j0.a(u8j0.a(dVarA2, q8j0.a.a(aVar2).c), q8j0.a.a(aVar2).e);
                            i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            iHashCode = Long.hashCode(aVar2.m());
                            ne00VarO = aVar2.o();
                            dVarC = c.c(aVar2, dVarA3);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO, dVar2);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarG2 = j.g(aVar3, 1.0f);
                            aivVarC = g75.c(ht.a.b, false);
                            iHashCode2 = Long.hashCode(aVar2.m());
                            ne00VarO2 = aVar2.o();
                            dVarC2 = c.c(aVar2, dVarG2);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar2);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            z4 = z3;
                            final Function0 function5 = function0;
                            z5 = z;
                            final boolean z7 = z2;
                            final b5 b5Var2 = b5Var;
                            final zzr zzrVar3 = zzrVar2;
                            final zzr zzrVar4 = zzrVar;
                            mig0.a(48, pp8.b(-1391463521, new Function2() { // from class: peg0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar5 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final Function0 function6 = function5;
                                        final TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                        final boolean z8 = z4;
                                        final osw oswVar3 = oswVar;
                                        final List list3 = listK;
                                        final zzr zzrVar5 = zzrVar4;
                                        final boolean z9 = z6;
                                        final boolean z10 = z5;
                                        final boolean z11 = z7;
                                        final aig0 aig0Var3 = aig0Var2;
                                        final zzr zzrVar6 = zzrVar3;
                                        final String str4 = strC;
                                        final twd0 twd0Var = ytwVarA;
                                        final ytw ytwVar7 = ytwVar;
                                        final ytw ytwVar8 = ytwVar5;
                                        final ytw ytwVar9 = ytwVar3;
                                        final ytw ytwVar10 = ytwVar4;
                                        final dq40 dq40Var2 = dq40Var;
                                        final b5 b5Var3 = b5Var2;
                                        t4g0.a(54, pp8.b(521333435, new Function2() { // from class: adg0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                boolean z12;
                                                osw oswVar4;
                                                float f5;
                                                adg0 adg0Var = this;
                                                a aVar6 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    d.a aVar7 = d.a.b;
                                                    d dVarJ = h.j(j.g(aVar7, 1.0f), 0.0f, pi60.a(R.dimen._35sdp, 6, aVar6), 0.0f, 0.0f, 13);
                                                    i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar6, 48);
                                                    int iHashCode4 = Long.hashCode(aVar6.m());
                                                    ne00 ne00VarO4 = aVar6.o();
                                                    d dVarC4 = c.c(aVar6, dVarJ);
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
                                                    hlh0.a(aVar6, i78VarA2, bVar3);
                                                    yka.a.d dVar3 = yka.a.e;
                                                    hlh0.a(aVar6, ne00VarO4, dVar3);
                                                    yka.a.C1350a c1350a2 = yka.a.g;
                                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                                                        j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                                                    }
                                                    yka.a.c cVar2 = yka.a.d;
                                                    hlh0.a(aVar6, dVarC4, cVar2);
                                                    StringBuilder sb = new StringBuilder();
                                                    TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                                    sb.append(tournamentStatsData4.getTournamentName());
                                                    sb.append("! ");
                                                    String string = sb.toString();
                                                    boolean z13 = z8;
                                                    TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                    lkf0.b(string, null, z13 ? b6g0.b : b6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar6.O(pi60.a)).f, R.dimen._12sdp, aVar6), aVar6, 0, 0, 65530);
                                                    final osw oswVar5 = oswVar3;
                                                    int iD = oswVar5.D();
                                                    long j = j58.l;
                                                    final boolean z14 = z13;
                                                    op8 op8VarB = pp8.b(-333536695, new gaj() { // from class: tdg0
                                                        @Override // defpackage.gaj
                                                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                            List list4 = (List) obj8;
                                                            a aVar9 = (a) obj9;
                                                            ((Integer) obj10).getClass();
                                                            list4.getClass();
                                                            i2f0.a.c(j.i(i2f0.d((z1f0) list4.get(oswVar5.D())), 1.5f), 0.0f, z14 ? b6g0.b : b6g0.a, aVar9, 0, 2);
                                                            return Unit.a;
                                                        }
                                                    }, aVar6);
                                                    final List list4 = list3;
                                                    j3f0.g(iD, null, j, 0L, op8VarB, dy9.a, pp8.b(637621321, new Function2() { // from class: heg0
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj8, Object obj9) {
                                                            a aVar9 = (a) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            if (aVar9.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                final int i8 = 0;
                                                                for (Object obj10 : list4) {
                                                                    int i9 = i8 + 1;
                                                                    if (i8 < 0) {
                                                                        kotlin.collections.b.q();
                                                                        throw null;
                                                                    }
                                                                    final String str5 = (String) obj10;
                                                                    final osw oswVar6 = oswVar5;
                                                                    final boolean z15 = oswVar6.D() == i8;
                                                                    boolean zD = aVar9.d(i8);
                                                                    Object objY16 = aVar9.y();
                                                                    if (zD || objY16 == a.C0041a.a) {
                                                                        objY16 = new Function0() { // from class: yeg0
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                oswVar6.k(i8);
                                                                                return Unit.a;
                                                                            }
                                                                        };
                                                                        aVar9.r(objY16);
                                                                    }
                                                                    final boolean z16 = z14;
                                                                    w1f0.b(z15, (Function0) objY16, null, false, pp8.b(352198805, new Function2() { // from class: afg0
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj11, Object obj12) {
                                                                            imf0 imf0Var;
                                                                            long j2;
                                                                            a aVar10 = (a) obj11;
                                                                            int iIntValue5 = ((Integer) obj12).intValue();
                                                                            if (aVar10.q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                long jB = pi60.b(R.dimen._11ssp, 6, aVar10);
                                                                                boolean z17 = z15;
                                                                                if (z17) {
                                                                                    aVar10.N(-250152118);
                                                                                    imf0Var = ((ufd0) aVar10.O(pi60.a)).d;
                                                                                    aVar10.H();
                                                                                } else {
                                                                                    aVar10.N(-250016121);
                                                                                    imf0Var = ((ufd0) aVar10.O(pi60.a)).b;
                                                                                    aVar10.H();
                                                                                }
                                                                                imf0 imf0Var2 = imf0Var;
                                                                                if (z17 && z16) {
                                                                                    j2 = b6g0.b;
                                                                                } else {
                                                                                    j2 = z17 ? b6g0.a : j58.f;
                                                                                }
                                                                                lkf0.b(str5, null, j2, jB, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, aVar10, 0, 0, 65522);
                                                                            } else {
                                                                                aVar10.G();
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    }, aVar9), 0L, 0L, aVar9, 24576, 492);
                                                                    i8 = i9;
                                                                }
                                                            } else {
                                                                aVar9.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, aVar6), aVar6, 1794432, 10);
                                                    a aVar9 = aVar6;
                                                    d.a aVar10 = aVar7;
                                                    float f6 = 1.0f;
                                                    d dVarG3 = j.g(aVar10, 1.0f);
                                                    aiv aivVarC3 = g75.c(ht.a.a, false);
                                                    int iHashCode5 = Long.hashCode(aVar9.m());
                                                    ne00 ne00VarO5 = aVar9.o();
                                                    d dVarC5 = c.c(aVar9, dVarG3);
                                                    if (aVar9.k() == null) {
                                                        l2a.b();
                                                        throw null;
                                                    }
                                                    aVar9.D();
                                                    if (aVar9.g()) {
                                                        aVar9.F(aVar8);
                                                    } else {
                                                        aVar9.p();
                                                    }
                                                    hlh0.a(aVar9, aivVarC3, bVar3);
                                                    hlh0.a(aVar9, ne00VarO5, dVar3);
                                                    if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                                                        j3c.a(iHashCode5, aVar9, iHashCode5, c1350a2);
                                                    }
                                                    hlh0.a(aVar9, dVarC5, cVar2);
                                                    aVar9.N(-611257860);
                                                    int i8 = 0;
                                                    for (Object obj8 : list4) {
                                                        int i9 = i8 + 1;
                                                        if (i8 < 0) {
                                                            kotlin.collections.b.q();
                                                            throw null;
                                                        }
                                                        boolean z15 = z9;
                                                        boolean z16 = z10;
                                                        if (i8 != 0) {
                                                            if (i8 != 1) {
                                                                aVar9.N(-1293439515);
                                                            } else {
                                                                aVar9.N(374532283);
                                                                a aVar11 = aVar9;
                                                                pfg0.e(dw.a(abk0.a(aVar10, oswVar5.D() == 1 ? f6 : 0.0f), oswVar5.D() == 1 ? f6 : 0.0f), zzrVar6, tournamentStatsData5, str4, z15, z16, aVar11, 0);
                                                                aVar9 = aVar11;
                                                            }
                                                            aVar9.H();
                                                            Unit unit5 = Unit.a;
                                                            f5 = f6;
                                                            oswVar4 = oswVar5;
                                                            z12 = z14;
                                                        } else {
                                                            aVar9.N(-1279466606);
                                                            d dVarA4 = dw.a(abk0.a(aVar10, oswVar5.D() == 0 ? f6 : 0.0f), oswVar5.D() == 0 ? f6 : 0.0f);
                                                            gzs gzsVar = (gzs) twd0Var.getValue();
                                                            ytw ytwVar11 = ytwVar7;
                                                            String str5 = (String) ytwVar11.getValue();
                                                            ytw ytwVar12 = ytwVar8;
                                                            String str6 = (String) ytwVar12.getValue();
                                                            ytw ytwVar13 = ytwVar9;
                                                            String str7 = (String) ytwVar13.getValue();
                                                            ytw ytwVar14 = ytwVar10;
                                                            String str8 = (String) ytwVar14.getValue();
                                                            z12 = z14;
                                                            final TournamentStatsData tournamentStatsData6 = tournamentStatsData5;
                                                            reg0 reg0Var = new reg0(tournamentStatsData6, dq40Var2, b5Var3, ytwVar11, ytwVar13, ytwVar12, ytwVar14);
                                                            final aig0 aig0Var4 = aig0Var3;
                                                            boolean zA2 = aVar9.A(aig0Var4) | aVar9.A(tournamentStatsData6);
                                                            Object objY16 = aVar9.y();
                                                            if (zA2 || objY16 == a.C0041a.a) {
                                                                objY16 = new Function0() { // from class: seg0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        long tournamentId3 = tournamentStatsData6.getTournamentId();
                                                                        aig0 aig0Var5 = aig0Var4;
                                                                        aig0Var5.getClass();
                                                                        ej5.c(o8i0.d(aig0Var5), null, null, new whg0(aig0Var5, tournamentId3, null), 3);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar9.r(objY16);
                                                            }
                                                            oswVar4 = oswVar5;
                                                            a aVar12 = aVar9;
                                                            f5 = 1.0f;
                                                            pfg0.a(dVarA4, zzrVar5, z15, z16, tournamentStatsData6, gzsVar, str5, str6, str7, str8, z11, reg0Var, (Function0) objY16, null, z12, aVar12, 0);
                                                            tournamentStatsData5 = tournamentStatsData6;
                                                            aVar9 = aVar12;
                                                            aVar9.H();
                                                            Unit unit6 = Unit.a;
                                                        }
                                                        aVar10 = aVar10;
                                                        oswVar5 = oswVar4;
                                                        i8 = i9;
                                                        z14 = z12;
                                                        f6 = f5;
                                                        adg0Var = this;
                                                    }
                                                    aVar9.H();
                                                    aVar9.s();
                                                    aVar9.s();
                                                    c6n.b(function6, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar10, ht.a.c), pi60.a(R.dimen._9sdp, 6, aVar9)), -2.0f, 4.0f), 24.0f), false, null, dy9.b, aVar9, 196608, 28);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar5), aVar5, z8);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, z4);
                            float fA2 = pi60.a(R.dimen._105sdp, 6, aVar2);
                            float fA3 = pi60.a(R.dimen._100sdp, 6, aVar2);
                            fA = pi60.a(R.dimen._minus60sdp, 6, aVar2);
                            if (zIsEmpty) {
                                aVar2.N(-1738539776);
                            } else {
                                aVar2.N(-1717738404);
                                if (z5) {
                                    aVar2.N(-1717693485);
                                    fA = pi60.a(R.dimen._minus35sdp, 6, aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-1717611149);
                                    fA = pi60.a(R.dimen._minus50sdp, 6, aVar2);
                                    aVar2.H();
                                }
                            }
                            aVar2.H();
                            if (z4) {
                                aVar2.N(-1856510268);
                                strD = com.sportygames.newcms.c.d(v5g0.Z.g, "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp", aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-1856516420);
                                strD = com.sportygames.newcms.c.d(v5g0.Z.f, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png", aVar2);
                                aVar2.H();
                            }
                            d dVarD = g.d(j.t(aVar3, fA2, fA3), 0.0f, fA, 1);
                            if (zIsEmpty) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.6f;
                            }
                            gcg0.a(strD, "Trophy", bz60.a(dVarD, f3, f3), d0b.a.g, null, 0.0f, null, null, aVar2, 3120, 496);
                            aVar2.s();
                            aVar2.s();
                            d dVarD2 = g.d(h.j(abk0.a(dVar.b(aVar3, n54Var), 1.0f), 0.0f, 0.0f, 0.0f, iswVar.j() * f2, 7), 0.0f, pi60.a(R.dimen._minus25sdp, 6, aVar2), 1);
                            function3 = function1;
                            zM3 = aVar2.M(function3);
                            objY5 = aVar2.y();
                            if (zM3 || objY5 == c0042a) {
                                objY5 = new en3(function3, 1);
                                aVar2.r(objY5);
                            }
                            Function0 function6 = (Function0) objY5;
                            function4 = function2;
                            zM4 = aVar2.M(function4);
                            objY6 = aVar2.y();
                            if (!zM4 || objY6 == c0042a) {
                                i6 = 1;
                                objY6 = new d8c0(function4, i6);
                                aVar2.r(objY6);
                            } else {
                                i6 = 1;
                            }
                            Function0 function7 = (Function0) objY6;
                            if (zIsEmpty || z5) {
                                i7 = i6;
                            } else {
                                i7 = 0;
                            }
                            if (z5 || !zIsEmpty) {
                                f4 = 0.0f;
                            } else {
                                f4 = f;
                            }
                            j18.b(dVarD2, str, j58Var, list2, function6, function7, i7, f4, i, fD, aVar2, 0);
                            aVar2.s();
                        }
                        j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC3, cVar);
                        Configuration configuration2 = (Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a);
                        mmd mmdVar2 = (mmd) aVar2.O(kna.h);
                        f2 = configuration2.screenHeightDp;
                        fC1 = mmdVar2.C1(f2);
                        Object[] objArr3 = new Object[0];
                        objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new o1r(1);
                            aVar2.r(objY2);
                        }
                        iswVar = (isw) o350.e(objArr3, (Function0) objY2, aVar2, 48);
                        Object[] objArr4 = {Integer.valueOf(configuration2.orientation)};
                        objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = new f8h(1);
                            aVar2.r(objY3);
                        }
                        ytwVar2 = (ytw) o350.e(objArr4, (Function0) objY3, aVar2, 48);
                        fD = f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f);
                        d dVarG3 = j.g(aVar3, 1.0f);
                        dVar = androidx.compose.foundation.layout.d.a;
                        n54Var = ht.a.h;
                        d dVarB3 = dVar.b(dVarG3, n54Var);
                        zM2 = aVar2.M(ytwVar2) | aVar2.c(fC1) | aVar2.M(iswVar);
                        objY4 = aVar2.y();
                        if (zM2) {
                            objY4 = new Function1() { // from class: oeg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    urr urrVar = (urr) obj4;
                                    urrVar.getClass();
                                    ytw ytwVar7 = ytwVar2;
                                    if (!((Boolean) ytwVar7.getValue()).booleanValue()) {
                                        float fD2 = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                        isw iswVar2 = iswVar;
                                        if (Math.abs(fD2 - iswVar2.j()) > 0.001f) {
                                            iswVar2.A(fD2);
                                        }
                                        ytwVar7.setValue(Boolean.TRUE);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        } else {
                            objY4 = new Function1() { // from class: oeg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    urr urrVar = (urr) obj4;
                                    urrVar.getClass();
                                    ytw ytwVar7 = ytwVar2;
                                    if (!((Boolean) ytwVar7.getValue()).booleanValue()) {
                                        float fD2 = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                        isw iswVar2 = iswVar;
                                        if (Math.abs(fD2 - iswVar2.j()) > 0.001f) {
                                            iswVar2.A(fD2);
                                        }
                                        ytwVar7.setValue(Boolean.TRUE);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        d dVarA4 = v.a(dVarB3, (Function1) objY4);
                        WeakHashMap<View, q8j0> weakHashMap2 = q8j0.v;
                        d dVarA5 = u8j0.a(u8j0.a(dVarA4, q8j0.a.a(aVar2).c), q8j0.a.a(aVar2).e);
                        i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        iHashCode = Long.hashCode(aVar2.m());
                        ne00VarO = aVar2.o();
                        dVarC = c.c(aVar2, dVarA5);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        if (aVar2.g()) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        } else {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG4 = j.g(aVar3, 1.0f);
                        aivVarC = g75.c(ht.a.b, false);
                        iHashCode2 = Long.hashCode(aVar2.m());
                        ne00VarO2 = aVar2.o();
                        dVarC2 = c.c(aVar2, dVarG4);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g()) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        } else {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        z4 = z3;
                        final Function0 function8 = function0;
                        z5 = z;
                        final boolean z8 = z2;
                        final b5 b5Var3 = b5Var;
                        final zzr zzrVar5 = zzrVar2;
                        final zzr zzrVar6 = zzrVar;
                        mig0.a(48, pp8.b(-1391463521, new Function2() { // from class: peg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final Function0 function9 = function8;
                                    final TournamentStatsData tournamentStatsData3 = tournamentStatsData2;
                                    final boolean z9 = z4;
                                    final osw oswVar3 = oswVar;
                                    final List list3 = listK;
                                    final zzr zzrVar7 = zzrVar6;
                                    final boolean z10 = z6;
                                    final boolean z11 = z5;
                                    final boolean z12 = z8;
                                    final aig0 aig0Var3 = aig0Var2;
                                    final zzr zzrVar8 = zzrVar5;
                                    final String str4 = strC;
                                    final twd0 twd0Var = ytwVarA;
                                    final ytw ytwVar7 = ytwVar;
                                    final ytw ytwVar8 = ytwVar5;
                                    final ytw ytwVar9 = ytwVar3;
                                    final ytw ytwVar10 = ytwVar4;
                                    final dq40 dq40Var2 = dq40Var;
                                    final b5 b5Var4 = b5Var3;
                                    t4g0.a(54, pp8.b(521333435, new Function2() { // from class: adg0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            boolean z13;
                                            osw oswVar4;
                                            float f5;
                                            adg0 adg0Var = this;
                                            a aVar6 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                d.a aVar7 = d.a.b;
                                                d dVarJ = h.j(j.g(aVar7, 1.0f), 0.0f, pi60.a(R.dimen._35sdp, 6, aVar6), 0.0f, 0.0f, 13);
                                                i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar6, 48);
                                                int iHashCode4 = Long.hashCode(aVar6.m());
                                                ne00 ne00VarO4 = aVar6.o();
                                                d dVarC4 = c.c(aVar6, dVarJ);
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
                                                hlh0.a(aVar6, i78VarA2, bVar3);
                                                yka.a.d dVar3 = yka.a.e;
                                                hlh0.a(aVar6, ne00VarO4, dVar3);
                                                yka.a.C1350a c1350a2 = yka.a.g;
                                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar6, dVarC4, cVar2);
                                                StringBuilder sb = new StringBuilder();
                                                TournamentStatsData tournamentStatsData4 = tournamentStatsData3;
                                                sb.append(tournamentStatsData4.getTournamentName());
                                                sb.append("! ");
                                                String string = sb.toString();
                                                boolean z14 = z9;
                                                TournamentStatsData tournamentStatsData5 = tournamentStatsData4;
                                                lkf0.b(string, null, z14 ? b6g0.b : b6g0.a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar6.O(pi60.a)).f, R.dimen._12sdp, aVar6), aVar6, 0, 0, 65530);
                                                final osw oswVar5 = oswVar3;
                                                int iD = oswVar5.D();
                                                long j = j58.l;
                                                final boolean z15 = z14;
                                                op8 op8VarB = pp8.b(-333536695, new gaj() { // from class: tdg0
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        List list4 = (List) obj8;
                                                        a aVar9 = (a) obj9;
                                                        ((Integer) obj10).getClass();
                                                        list4.getClass();
                                                        i2f0.a.c(j.i(i2f0.d((z1f0) list4.get(oswVar5.D())), 1.5f), 0.0f, z15 ? b6g0.b : b6g0.a, aVar9, 0, 2);
                                                        return Unit.a;
                                                    }
                                                }, aVar6);
                                                final List list4 = list3;
                                                j3f0.g(iD, null, j, 0L, op8VarB, dy9.a, pp8.b(637621321, new Function2() { // from class: heg0
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj8, Object obj9) {
                                                        a aVar9 = (a) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        if (aVar9.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            final int i8 = 0;
                                                            for (Object obj10 : list4) {
                                                                int i9 = i8 + 1;
                                                                if (i8 < 0) {
                                                                    kotlin.collections.b.q();
                                                                    throw null;
                                                                }
                                                                final String str5 = (String) obj10;
                                                                final osw oswVar6 = oswVar5;
                                                                final boolean z16 = oswVar6.D() == i8;
                                                                boolean zD = aVar9.d(i8);
                                                                Object objY16 = aVar9.y();
                                                                if (zD || objY16 == a.C0041a.a) {
                                                                    objY16 = new Function0() { // from class: yeg0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            oswVar6.k(i8);
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    aVar9.r(objY16);
                                                                }
                                                                final boolean z17 = z15;
                                                                w1f0.b(z16, (Function0) objY16, null, false, pp8.b(352198805, new Function2() { // from class: afg0
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj11, Object obj12) {
                                                                        imf0 imf0Var;
                                                                        long j2;
                                                                        a aVar10 = (a) obj11;
                                                                        int iIntValue5 = ((Integer) obj12).intValue();
                                                                        if (aVar10.q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            long jB = pi60.b(R.dimen._11ssp, 6, aVar10);
                                                                            boolean z18 = z16;
                                                                            if (z18) {
                                                                                aVar10.N(-250152118);
                                                                                imf0Var = ((ufd0) aVar10.O(pi60.a)).d;
                                                                                aVar10.H();
                                                                            } else {
                                                                                aVar10.N(-250016121);
                                                                                imf0Var = ((ufd0) aVar10.O(pi60.a)).b;
                                                                                aVar10.H();
                                                                            }
                                                                            imf0 imf0Var2 = imf0Var;
                                                                            if (z18 && z17) {
                                                                                j2 = b6g0.b;
                                                                            } else {
                                                                                j2 = z18 ? b6g0.a : j58.f;
                                                                            }
                                                                            lkf0.b(str5, null, j2, jB, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, aVar10, 0, 0, 65522);
                                                                        } else {
                                                                            aVar10.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, aVar9), 0L, 0L, aVar9, 24576, 492);
                                                                i8 = i9;
                                                            }
                                                        } else {
                                                            aVar9.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar6), aVar6, 1794432, 10);
                                                a aVar9 = aVar6;
                                                d.a aVar10 = aVar7;
                                                float f6 = 1.0f;
                                                d dVarG5 = j.g(aVar10, 1.0f);
                                                aiv aivVarC3 = g75.c(ht.a.a, false);
                                                int iHashCode5 = Long.hashCode(aVar9.m());
                                                ne00 ne00VarO5 = aVar9.o();
                                                d dVarC5 = c.c(aVar9, dVarG5);
                                                if (aVar9.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar9.D();
                                                if (aVar9.g()) {
                                                    aVar9.F(aVar8);
                                                } else {
                                                    aVar9.p();
                                                }
                                                hlh0.a(aVar9, aivVarC3, bVar3);
                                                hlh0.a(aVar9, ne00VarO5, dVar3);
                                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                                                    j3c.a(iHashCode5, aVar9, iHashCode5, c1350a2);
                                                }
                                                hlh0.a(aVar9, dVarC5, cVar2);
                                                aVar9.N(-611257860);
                                                int i8 = 0;
                                                for (Object obj8 : list4) {
                                                    int i9 = i8 + 1;
                                                    if (i8 < 0) {
                                                        kotlin.collections.b.q();
                                                        throw null;
                                                    }
                                                    boolean z16 = z10;
                                                    boolean z17 = z11;
                                                    if (i8 != 0) {
                                                        if (i8 != 1) {
                                                            aVar9.N(-1293439515);
                                                        } else {
                                                            aVar9.N(374532283);
                                                            a aVar11 = aVar9;
                                                            pfg0.e(dw.a(abk0.a(aVar10, oswVar5.D() == 1 ? f6 : 0.0f), oswVar5.D() == 1 ? f6 : 0.0f), zzrVar8, tournamentStatsData5, str4, z16, z17, aVar11, 0);
                                                            aVar9 = aVar11;
                                                        }
                                                        aVar9.H();
                                                        Unit unit5 = Unit.a;
                                                        f5 = f6;
                                                        oswVar4 = oswVar5;
                                                        z13 = z15;
                                                    } else {
                                                        aVar9.N(-1279466606);
                                                        d dVarA6 = dw.a(abk0.a(aVar10, oswVar5.D() == 0 ? f6 : 0.0f), oswVar5.D() == 0 ? f6 : 0.0f);
                                                        gzs gzsVar = (gzs) twd0Var.getValue();
                                                        ytw ytwVar11 = ytwVar7;
                                                        String str5 = (String) ytwVar11.getValue();
                                                        ytw ytwVar12 = ytwVar8;
                                                        String str6 = (String) ytwVar12.getValue();
                                                        ytw ytwVar13 = ytwVar9;
                                                        String str7 = (String) ytwVar13.getValue();
                                                        ytw ytwVar14 = ytwVar10;
                                                        String str8 = (String) ytwVar14.getValue();
                                                        z13 = z15;
                                                        final TournamentStatsData tournamentStatsData6 = tournamentStatsData5;
                                                        reg0 reg0Var = new reg0(tournamentStatsData6, dq40Var2, b5Var4, ytwVar11, ytwVar13, ytwVar12, ytwVar14);
                                                        final aig0 aig0Var4 = aig0Var3;
                                                        boolean zA2 = aVar9.A(aig0Var4) | aVar9.A(tournamentStatsData6);
                                                        Object objY16 = aVar9.y();
                                                        if (zA2 || objY16 == a.C0041a.a) {
                                                            objY16 = new Function0() { // from class: seg0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    long tournamentId3 = tournamentStatsData6.getTournamentId();
                                                                    aig0 aig0Var5 = aig0Var4;
                                                                    aig0Var5.getClass();
                                                                    ej5.c(o8i0.d(aig0Var5), null, null, new whg0(aig0Var5, tournamentId3, null), 3);
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar9.r(objY16);
                                                        }
                                                        oswVar4 = oswVar5;
                                                        a aVar12 = aVar9;
                                                        f5 = 1.0f;
                                                        pfg0.a(dVarA6, zzrVar7, z16, z17, tournamentStatsData6, gzsVar, str5, str6, str7, str8, z12, reg0Var, (Function0) objY16, null, z13, aVar12, 0);
                                                        tournamentStatsData5 = tournamentStatsData6;
                                                        aVar9 = aVar12;
                                                        aVar9.H();
                                                        Unit unit6 = Unit.a;
                                                    }
                                                    aVar10 = aVar10;
                                                    oswVar5 = oswVar4;
                                                    i8 = i9;
                                                    z15 = z13;
                                                    f6 = f5;
                                                    adg0Var = this;
                                                }
                                                aVar9.H();
                                                aVar9.s();
                                                aVar9.s();
                                                c6n.b(function9, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar10, ht.a.c), pi60.a(R.dimen._9sdp, 6, aVar9)), -2.0f, 4.0f), 24.0f), false, null, dy9.b, aVar9, 196608, 28);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar5), aVar5, z9);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, z4);
                        float fA4 = pi60.a(R.dimen._105sdp, 6, aVar2);
                        float fA5 = pi60.a(R.dimen._100sdp, 6, aVar2);
                        fA = pi60.a(R.dimen._minus60sdp, 6, aVar2);
                        if (zIsEmpty) {
                            aVar2.N(-1717738404);
                            if (z5) {
                                aVar2.N(-1717693485);
                                fA = pi60.a(R.dimen._minus35sdp, 6, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-1717611149);
                                fA = pi60.a(R.dimen._minus50sdp, 6, aVar2);
                                aVar2.H();
                            }
                        } else {
                            aVar2.N(-1738539776);
                        }
                        aVar2.H();
                        if (z4) {
                            aVar2.N(-1856516420);
                            strD = com.sportygames.newcms.c.d(v5g0.Z.f, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png", aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(-1856510268);
                            strD = com.sportygames.newcms.c.d(v5g0.Z.g, "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp", aVar2);
                            aVar2.H();
                        }
                        d dVarD3 = g.d(j.t(aVar3, fA4, fA5), 0.0f, fA, 1);
                        if (zIsEmpty) {
                            f3 = 0.6f;
                        } else {
                            f3 = 1.0f;
                        }
                        gcg0.a(strD, "Trophy", bz60.a(dVarD3, f3, f3), d0b.a.g, null, 0.0f, null, null, aVar2, 3120, 496);
                        aVar2.s();
                        aVar2.s();
                        d dVarD4 = g.d(h.j(abk0.a(dVar.b(aVar3, n54Var), 1.0f), 0.0f, 0.0f, 0.0f, iswVar.j() * f2, 7), 0.0f, pi60.a(R.dimen._minus25sdp, 6, aVar2), 1);
                        function3 = function1;
                        zM3 = aVar2.M(function3);
                        objY5 = aVar2.y();
                        if (zM3) {
                            objY5 = new en3(function3, 1);
                            aVar2.r(objY5);
                        } else {
                            objY5 = new en3(function3, 1);
                            aVar2.r(objY5);
                        }
                        Function0 function9 = (Function0) objY5;
                        function4 = function2;
                        zM4 = aVar2.M(function4);
                        objY6 = aVar2.y();
                        if (zM4) {
                            i6 = 1;
                            objY6 = new d8c0(function4, i6);
                            aVar2.r(objY6);
                        } else {
                            i6 = 1;
                            objY6 = new d8c0(function4, i6);
                            aVar2.r(objY6);
                        }
                        Function0 function10 = (Function0) objY6;
                        if (zIsEmpty) {
                            i7 = i6;
                        } else {
                            i7 = i6;
                        }
                        if (z5) {
                            f4 = 0.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        j18.b(dVarD4, str, j58Var, list2, function9, function10, i7, f4, i, fD, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: keg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    pfg0.g(tournamentStatsData, function0, aig0Var, str, j58Var, list, function1, function2, map, map2, z, f, i, z2, z3, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0927  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
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
    public static final void h(final TournamentStatsData tournamentStatsData, final String str, final String str2, final String str3, final String str4, b5 b5Var, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        final b5 b5Var2;
        b bVar;
        b5 b5Var3;
        int i2;
        boolean z2;
        d dVarB;
        yka.a.d dVar;
        d.a aVar2;
        tsr.a aVar3;
        yka.a.b bVar2;
        ?? r4;
        yka.a.C1350a c1350a;
        String strD;
        String str5;
        Object bVar3;
        String strP;
        int iT;
        b bVar4;
        wd7.a(str, str2, str3, str4);
        b bVarI = aVar.i(-1349827141);
        int i3 = i | (bVarI.A(tournamentStatsData) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.M(str4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 65536 | (bVarI.b(z) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            bVarI.A0();
            int i4 = i & 1;
            Object obj = androidx.compose.runtime.a.C0041a.a;
            if (i4 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == obj) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5Var3 = (b5) objY;
                i2 = i3 & (-458753);
            } else {
                bVarI.G();
                i2 = i3 & (-458753);
                b5Var3 = b5Var;
            }
            bVarI.Y();
            List listK = kotlin.collections.b.k(new j58(r58.d(4284370982L)), new j58(r58.d(4282727714L)));
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if ((intOrNull != null ? intOrNull.intValue() : 0) != 0) {
                Integer intOrNull2 = StringsKt.toIntOrNull(str);
                if (!j(intOrNull2 != null ? intOrNull2.intValue() : 0, tournamentStatsData.getPrizeListMap())) {
                    if (z) {
                        listK = kotlin.collections.b.k(new j58(r58.d(4279045650L)), new j58(r58.d(4279045650L)));
                    } else {
                        listK = kotlin.collections.b.k(new j58(r58.d(4280689693L)), new j58(r58.d(4279440666L)));
                    }
                }
            } else if (z) {
                listK = kotlin.collections.b.k(new j58(r58.d(4279045650L)), new j58(r58.d(4279045650L)));
            } else {
                listK = kotlin.collections.b.k(new j58(r58.d(4280689693L)), new j58(r58.d(4279440666L)));
            }
            List listK2 = kotlin.collections.b.k(new j58(r58.b(351323233)), new j58(r58.b(0)));
            d.a aVar4 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.a(j.g(aVar4, 1.0f), !z ? ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4293117765L)), new j58(r58.d(4286337536L)), new j58(r58.d(4293184584L)), new j58(r58.d(4286337536L)), new j58(r58.d(4293117765L)))) : ya5.a.d(kotlin.collections.b.k(new j58(r58.d(4293515425L)), new j58(r58.d(4290218048L))), 0L, 0L, 14), j060.c(10.0f), 0.0f, 4), 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar5 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar5);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA = androidx.compose.foundation.a.a(ls7.a(j.g(aVar4, 1.0f), j060.c(10.0f)), ya5.a.a(0.0f, 0.0f, 14, listK), null, 0.0f, 6);
            if (z) {
                bVarI.N(145554093);
                Object objY2 = bVarI.y();
                if (objY2 == obj) {
                    objY2 = new ubm(listK2, 3);
                    bVarI.r(objY2);
                }
                dVarB = androidx.compose.ui.draw.a.b(aVar4, (Function1) objY2);
                z2 = false;
                bVarI.X(false);
            } else {
                z2 = false;
                bVarI.N(146146069);
                bVarI.X(false);
                dVarB = aVar4;
            }
            d dVarG = h.g(dVarA.n(dVarB), pi60.a(R.dimen._9sdp, 6, bVarI), 8.0f);
            aiv aivVarC2 = g75.c(n54Var, z2);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar5);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (Build.VERSION.SDK_INT > 26) {
                bVarI.N(-1424002164);
                d dVarC3 = g.c(androidx.compose.foundation.layout.d.a.b(aVar4, z ? ht.a.i : ht.a.f), z ? 8.0f : 0.0f, z ? 6.0f : 0.0f);
                float f = z ? 1.0f : 3.0f;
                d dVarJ = h.j(bz60.a(dVarC3, f, f), 0.0f, 0.0f, z ? 0.0f : 6.0f, 0.0f, 11);
                dVar = dVar2;
                r4 = 0;
                bVar2 = bVar5;
                aVar2 = aVar4;
                aVar3 = aVar5;
                h9n.a(erz.a(z ? R.drawable.dlg_tournament_bg_trophy_vip_rank : R.drawable.dlg_ic_bg_trophy_half, 0, bVarI), "trophy", dVarJ, null, null, 0.0f, null, bVarI, 48, 120);
            } else {
                dVar = dVar2;
                aVar2 = aVar4;
                aVar3 = aVar5;
                bVar2 = bVar5;
                r4 = 0;
                bVarI.N(-1456775085);
            }
            bVarI.X(r4);
            kw0.k kVar = kw0.c;
            n54.a aVar6 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar6, bVarI, r4);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarG2 = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            f160 f160Var = f160.a;
            d dVarA2 = f160Var.a(1.0f, aVar2, true);
            aiv aivVarC3 = g75.c(n54Var, r4);
            int iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS5 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a2);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            i78 i78VarA2 = g78.a(kVar, aVar6, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarS6 = bVarI.S();
            d dVarC7 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a2);
            }
            hlh0.a(bVarI, dVarC7, cVar);
            v5g0 v5g0Var = v5g0.Z;
            String strD2 = com.sportygames.newcms.c.d(v5g0Var.h, "Your Rank", bVarI);
            Locale locale = Locale.ROOT;
            String upperCase = strD2.toUpperCase(locale);
            upperCase.getClass();
            long j = j58.f;
            long jC = j58.c(0.6f, j);
            qyd0 qyd0Var = pi60.a;
            lkf0.b(upperCase, null, jC, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            lkf0.b(str.equals("0") ? "--" : str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).d, R.dimen._12ssp, bVarI), bVarI, 384, 0, 65530);
            bVarI.X(true);
            bVarI.X(true);
            d dVarA3 = f160Var.a(1.0f, aVar2, true);
            aiv aivVarC4 = g75.c(n54Var, false);
            int iHashCode7 = Long.hashCode(bVarI.m());
            ne00 ne00VarS7 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS7, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                c1350a = c1350a2;
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC8, cVar);
            i78 i78VarA3 = g78.a(kVar, aVar6, bVarI, 48);
            int iHashCode8 = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC9 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS8, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
            }
            hlh0.a(bVarI, dVarC9, cVar);
            String upperCase2 = com.sportygames.newcms.c.d(v5g0Var.i, "POINTS", bVarI).toUpperCase(locale);
            upperCase2.getClass();
            yka.a.C1350a c1350a3 = c1350a;
            lkf0.b(upperCase2, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            d dVarG3 = j.g(aVar2, 1.0f);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode9 = Long.hashCode(bVarI.m());
            ne00 ne00VarS9 = bVarI.S();
            d dVarC10 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS9, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVarI, iHashCode9, c1350a3);
            }
            hlh0.a(bVarI, dVarC10, cVar);
            h9n.a(erz.a(R.drawable.dlg_ic_leaderbosrd_star, 0, bVarI), "Star", j.r(aVar2, pi60.a(R.dimen._10sdp, 6, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            b5 b5Var4 = b5Var3;
            f(str2, b5Var4, bVarI, (i2 >> 6) & 14);
            f30.a(bVarI, true, true, true);
            d dVarA4 = f160Var.a(1.0f, aVar2, true);
            aiv aivVarC5 = g75.c(n54Var, false);
            int iHashCode10 = Long.hashCode(bVarI.m());
            ne00 ne00VarS10 = bVarI.S();
            d dVarC11 = c.c(bVarI, dVarA4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS10, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode10))) {
                n30.a(iHashCode10, bVarI, iHashCode10, c1350a3);
            }
            hlh0.a(bVarI, dVarC11, cVar);
            i78 i78VarA4 = g78.a(kVar, aVar6, bVarI, 48);
            int iHashCode11 = Long.hashCode(bVarI.m());
            ne00 ne00VarS11 = bVarI.S();
            d dVarC12 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS11, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode11))) {
                n30.a(iHashCode11, bVarI, iHashCode11, c1350a3);
            }
            hlh0.a(bVarI, dVarC12, cVar);
            String upperCase3 = com.sportygames.newcms.c.d(v5g0Var.j, "Prize", bVarI).toUpperCase(locale);
            upperCase3.getClass();
            lkf0.b(upperCase3, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).b, R.dimen._8ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            lkf0.b(str3, null, j, 0L, null, null, null, 0L, new gdf0(5), 0L, 0, false, 0, 0, null, k(str3, ((ufd0) bVarI.O(qyd0Var)).d, bVarI), bVarI, ((i2 >> 9) & 14) | 384, 0, 65018);
            f30.a(bVarI, true, true, true);
            ty0.a(bVarI, j.i(aVar2, pi60.a(R.dimen._9sdp, 6, bVarI)));
            if (str.equals("1")) {
                bVarI.N(-573578704);
                lkf0.b(com.sportygames.newcms.c.d(v5g0Var.k, "You're at the top! Keep playing to stay the best!", bVarI), null, j58.c(0.9f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).a, R.dimen._9sdp, bVarI), bVarI, 384, 0, 65530);
                b bVar6 = bVarI;
                bVar6.X(false);
                bVar4 = bVar6;
            } else {
                bVarI.N(-573083789);
                Integer intOrNull3 = StringsKt.toIntOrNull(str);
                if ((intOrNull3 != null ? intOrNull3.intValue() : 0) == 0) {
                    bVarI.N(-572586332);
                    strD = com.sportygames.newcms.c.d(v5g0Var.m, "You need more {points} points to be in the winning zone", bVarI);
                    bVarI.X(false);
                } else {
                    Integer intOrNull4 = StringsKt.toIntOrNull(str);
                    if (j(intOrNull4 != null ? intOrNull4.intValue() : 0, tournamentStatsData.getPrizeListMap())) {
                        bVarI.N(-572860806);
                        strD = com.sportygames.newcms.c.d(v5g0Var.l, "You need more {points} points to go to the next level", bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-572586332);
                        strD = com.sportygames.newcms.c.d(v5g0Var.m, "You need more {points} points to be in the winning zone", bVarI);
                        bVarI.X(false);
                    }
                }
                String str6 = strD;
                y5g0.a.getClass();
                if (StringsKt.M(str6, "{points}", false)) {
                    str5 = str4;
                    strP = kotlin.text.c.p(str6, "{points}", str5, false);
                } else {
                    str5 = str4;
                    if (y5g0.b.a(str6)) {
                        try {
                            strP = str6;
                            zi50.a aVar7 = zi50.b;
                            bVar3 = String.format(Locale.getDefault(), str6, Arrays.copyOf(new Object[]{str5}, 1));
                        } catch (Throwable th) {
                            zi50.a aVar8 = zi50.b;
                            bVar3 = new zi50.b(th);
                        }
                        Object obj2 = str6;
                        if (!(bVar3 instanceof zi50.b)) {
                            obj2 = bVar3;
                        }
                        strP = (String) obj2;
                    }
                }
                strP = str6;
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(strP);
                if (str5.length() > 0 && (iT = StringsKt.T(strP, str5, 0, false, 6)) >= 0) {
                    arrayList.add(new nk0.b.a(null, iT, str5.length() + iT, 8, new ora0(0L, 0L, t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531)));
                }
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((nk0.b.a) arrayList.get(i5)).a(sb.length()));
                }
                lkf0.c(new nk0(string, arrayList2), null, j58.c(0.9f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, pi60.c(((ufd0) bVarI.O(pi60.a)).a, R.dimen._9sdp, bVarI), bVarI, 384, 0, 131066);
                b bVar7 = bVarI;
                bVar7.X(false);
                bVar4 = bVar7;
            }
            f30.a(bVar4, true, true, true);
            b5Var2 = b5Var4;
            bVar = bVar4;
        } else {
            bVarI.G();
            b5Var2 = b5Var;
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, str4, b5Var2, z, i) { // from class: aeg0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ b5 f;
                public final /* synthetic */ boolean i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(1);
                    pfg0.h(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, androidx.compose.runtime.a aVar, d dVar, final String str) {
        final d dVar2;
        b bVarI = aVar.i(1517020089);
        int i2 = (bVarI.M(str) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            try {
                zi50.a aVar2 = zi50.b;
                boolean z = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new bl3(str, 1);
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
            eVarZ.d = new Function2(i, dVar2, str) { // from class: sdg0
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar2;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pfg0.i(qj40.a(7), (a) obj, this.a, this.b);
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
