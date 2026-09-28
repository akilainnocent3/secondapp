package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q7t {
    public static final void a(final LobbyV2HomeItemModel lobbyV2HomeItemModel, final gaj gajVar, final boolean z, l1z l1zVar, a aVar, final int i) {
        b bVar;
        final l1z l1zVar2;
        int i2;
        final l1z l1zVar3;
        boolean z2;
        l1z l1zVar4;
        b bVarI = aVar.i(-1197911190);
        int i3 = i | (bVarI.A(lobbyV2HomeItemModel) ? 4 : 2) | (bVarI.A(gajVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | 1024;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            int i4 = i & 1;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (i4 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = qn70VarA.a(jq40.a(l1z.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                i2 = i3 & (-7169);
                l1zVar3 = (l1z) objY;
            } else {
                bVarI.G();
                i2 = i3 & (-7169);
                l1zVar3 = l1zVar;
            }
            int i5 = i2;
            bVarI.Y();
            final List<LobbyV2GameDetailsModel> gameListVO = lobbyV2HomeItemModel.getGameListVO();
            if (gameListVO == null || gameListVO.isEmpty()) {
                bVar = bVarI;
                z2 = false;
                l1zVar4 = l1zVar3;
                bVar.N(-90848904);
            } else {
                bVarI.N(-88485247);
                zzr zzrVarA = e0s.a(0, 3, bVarI);
                Pair pairA = sai0.a(bVarI);
                d dVar = (d) pairA.a;
                if (((Boolean) ((twd0) pairA.b).getValue()).booleanValue()) {
                    bVarI.N(-88427928);
                    boolean zA = bVarI.A(l1zVar3);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function2() { // from class: k7t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                l1z l1zVar5 = l1zVar3;
                                int iIntValue = ((Integer) obj).intValue();
                                LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj2;
                                lobbyV2GameDetailsModel.getClass();
                                try {
                                    if (lobbyV2GameDetailsModel.getCategoryId() != 0) {
                                        l1zVar5.l(lobbyV2GameDetailsModel.getCategoryId(), iIntValue);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    lft.a(zzrVarA, gameListVO, (Function2) objY2, bVarI, 0);
                } else {
                    bVarI.N(-90848904);
                }
                bVarI.X(false);
                String key = lobbyV2HomeItemModel.getKey();
                key.getClass();
                d dVarA = androidx.compose.ui.platform.d.a(dVar, "lobby_v2_promotion_".concat(key));
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
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
                g4t.a(lobbyV2HomeItemModel, lobbyV2HomeItemModel.getShowAll(), null, bVarI, i5 & 14, 4);
                d.a aVar3 = d.a.b;
                d dVarG = j.g(aVar3, 1.0f);
                kw0.i iVar = new kw0.i(fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), true, new hw0());
                boolean zA2 = bVarI.A(gameListVO) | bVarI.A(lobbyV2HomeItemModel) | bVarI.A(l1zVar3) | ((i5 & 112) == 32);
                Object objY3 = bVarI.y();
                if (zA2 || objY3 == c0042a) {
                    objY3 = new Function1() { // from class: l7t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            final List list = gameListVO;
                            final int size = list.size();
                            final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                            final l1z l1zVar5 = l1zVar3;
                            final gaj gajVar2 = gajVar;
                            szr.f(szrVar, size, null, new op8(-1425407579, new iaj() { // from class: n7t
                                @Override // defpackage.iaj
                                public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    final int iIntValue = ((Integer) obj3).intValue();
                                    a aVar4 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((gwr) obj2).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                    }
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        int i6 = size;
                                        if (iIntValue < i6) {
                                            aVar4.N(24610026);
                                            d dVarE = d.a.b;
                                            if (iIntValue == 0) {
                                                aVar4.N(24621992);
                                                dVarE = h.e(dVarE, h.b(fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar4), 0.0f, 0.0f, 0.0f, 14));
                                            } else {
                                                aVar4.N(20865629);
                                            }
                                            aVar4.H();
                                            if (iIntValue == i6 - 1) {
                                                aVar4.N(24817354);
                                                dVarE = h.e(dVarE, h.b(0.0f, 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar4), 0.0f, 11));
                                            } else {
                                                aVar4.N(20865629);
                                            }
                                            aVar4.H();
                                            d dVarA2 = androidx.compose.foundation.layout.c.a(j.w(dVarE, ((Configuration) aVar4.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.427f), 2.05f);
                                            LobbyV2HomeItemModel lobbyV2HomeItemModel3 = lobbyV2HomeItemModel2;
                                            final GameLogData gameLogData = new GameLogData("lobby_home", lobbyV2HomeItemModel3.getKey(), lobbyV2HomeItemModel3.getSectionName(), null, iIntValue, 8, null);
                                            final LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) list.get(iIntValue);
                                            d dVarA3 = androidx.compose.ui.platform.d.a(dVarA2, "lobby_v2_promotion_game_" + lobbyV2GameDetailsModel.getId());
                                            jg6 jg6VarC = gg6.c(62, fw20.a(R.dimen._8sdp, aVar4));
                                            fg6 fg6VarB = gg6.b(((th60) aVar4.O(vh60.a)).a0, 0L, aVar4, 0, 14);
                                            boolean zA3 = aVar4.A(lobbyV2GameDetailsModel);
                                            final l1z l1zVar6 = l1zVar5;
                                            boolean zA4 = zA3 | aVar4.A(l1zVar6) | ((iIntValue2 & 112) == 32);
                                            final gaj gajVar3 = gajVar2;
                                            boolean zM2 = aVar4.M(gajVar3) | zA4 | aVar4.A(gameLogData);
                                            Object objY4 = aVar4.y();
                                            if (zM2 || objY4 == a.C0041a.a) {
                                                Function0 function0 = new Function0() { // from class: o7t
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        LobbyV2GameDetailsModel lobbyV2GameDetailsModel2 = lobbyV2GameDetailsModel;
                                                        l1z l1zVar7 = l1zVar6;
                                                        int i7 = iIntValue;
                                                        try {
                                                            if (lobbyV2GameDetailsModel2.getCategoryId() != 0) {
                                                                l1zVar7.k(lobbyV2GameDetailsModel2.getCategoryId(), i7);
                                                            }
                                                        } catch (Exception e) {
                                                            e.printStackTrace();
                                                        }
                                                        gaj gajVar4 = gajVar3;
                                                        if (gajVar4 != null) {
                                                            gajVar4.invoke(lobbyV2GameDetailsModel2, gnj.c, gameLogData);
                                                        }
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar4.r(function0);
                                                objY4 = function0;
                                            }
                                            rg6.b((Function0) objY4, dVarA3, false, null, fg6VarB, jg6VarC, null, null, pp8.b(-667377611, new p7t(lobbyV2GameDetailsModel, 0), aVar4), aVar4, 100663296, 204);
                                            aVar4 = aVar4;
                                        } else {
                                            aVar4.N(20865629);
                                        }
                                        aVar4.H();
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                l1zVar4 = l1zVar3;
                z2 = false;
                aur.b(dVarG, zzrVarA, null, iVar, null, null, false, null, (Function1) objY3, bVarI, 6, 492);
                bVar = bVarI;
                bVar.X(true);
                if (z) {
                    bVar.N(-84186880);
                    ty0.a(bVar, j.i(aVar3, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVar)));
                } else {
                    bVar.N(-90848904);
                }
                bVar.X(false);
            }
            bVar.X(z2);
            l1zVar2 = l1zVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            l1zVar2 = l1zVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gajVar, z, l1zVar2, i) { // from class: m7t
                public final /* synthetic */ gaj b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ l1z d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    q7t.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
