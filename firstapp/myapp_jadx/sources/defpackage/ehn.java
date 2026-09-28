package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.PlaceBetRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ehn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ehn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ixi ixiVar;
        ixi ixiVar2;
        Double dValueOf;
        v720 binding;
        v720 binding2;
        PlaceBetRequest placeBetRequest;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        List<DetailResponse> gameDetailsResponseList2;
        DetailResponse detailResponse2;
        List<DetailResponse> gameDetailsResponseList3;
        DetailResponse detailResponse3;
        List<DetailResponse> gameDetailsResponseList4;
        DetailResponse detailResponse4;
        String currency;
        GiftItem giftItem;
        List<DetailResponse> gameDetailsResponseList5;
        v720 binding3;
        CharSequence text;
        String string;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cwb cwbVar = (cwb) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.B(((Number) ((x5a0) cwbVar.d).getValue()).floatValue() * cwbVar.v);
                return Unit.a;
            default:
                final m410 m410Var = (m410) obj2;
                String str = (String) obj;
                str.getClass();
                SharedPreferences sharedPreferences = m410Var.V;
                if (sharedPreferences == null || sharedPreferences.getBoolean("PING_PONG_ONE_TAP", false)) {
                    DetailResponseData detailResponseData = m410Var.w;
                    if ((detailResponseData != null ? detailResponseData.getGameDetailsResponseList() : null) != null && (ixiVar = (ixi) m410Var.b) != null && !ixiVar.c.getBetPlaced() && (ixiVar2 = (ixi) m410Var.b) != null && !ixiVar2.c.getBetInProgress()) {
                        if (m410Var.I) {
                            ixi ixiVar3 = (ixi) m410Var.b;
                            dValueOf = (ixiVar3 == null || (binding3 = ixiVar3.c.getBinding()) == null || (text = binding3.z.getText()) == null || (string = text.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
                        } else {
                            dValueOf = null;
                        }
                        DetailResponseData detailResponseData2 = m410Var.w;
                        if ((detailResponseData2 != null ? detailResponseData2.getGameDetailsResponseList() : null) != null) {
                            DetailResponseData detailResponseData3 = m410Var.w;
                            if (((detailResponseData3 == null || (gameDetailsResponseList5 = detailResponseData3.getGameDetailsResponseList()) == null) ? 0 : gameDetailsResponseList5.size()) > 1) {
                                DetailResponseData detailResponseData4 = m410Var.w;
                                if (detailResponseData4 == null || (gameDetailsResponseList2 = detailResponseData4.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList2.get(1)) == null) {
                                    placeBetRequest = null;
                                } else {
                                    int betCategoryType = detailResponse2.getBetCategoryType();
                                    DetailResponseData detailResponseData5 = m410Var.w;
                                    if (detailResponseData5 == null || (gameDetailsResponseList3 = detailResponseData5.getGameDetailsResponseList()) == null || (detailResponse3 = gameDetailsResponseList3.get(1)) == null) {
                                        placeBetRequest = null;
                                    } else {
                                        int betIndex = detailResponse3.getBetIndex();
                                        DetailResponseData detailResponseData6 = m410Var.w;
                                        if (detailResponseData6 == null || (gameDetailsResponseList4 = detailResponseData6.getGameDetailsResponseList()) == null || (detailResponse4 = gameDetailsResponseList4.get(1)) == null || (currency = detailResponse4.getCurrency()) == null) {
                                            placeBetRequest = null;
                                        } else {
                                            long j = m410Var.J;
                                            ixi ixiVar4 = (ixi) m410Var.b;
                                            String giftId = (ixiVar4 == null || (giftItem = ixiVar4.c.getGiftItem()) == null) ? null : giftItem.getGiftId();
                                            ixi ixiVar5 = (ixi) m410Var.b;
                                            placeBetRequest = new PlaceBetRequest(str, betCategoryType, betIndex, currency, j, giftId, ixiVar5 != null ? ixiVar5.c.getGiftAmount() : null, dValueOf, m410Var.d1);
                                        }
                                    }
                                }
                                final String strJ = new eal().j(placeBetRequest);
                                goa0 goa0Var = (goa0) m410Var.a;
                                if (goa0Var != null) {
                                    long j2 = m410Var.J;
                                    DetailResponseData detailResponseData7 = m410Var.w;
                                    goa0Var.I1(strJ, j2, (detailResponseData7 == null || (gameDetailsResponseList = detailResponseData7.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList.get(1)) == null) ? null : Integer.valueOf(detailResponse.getBetIndex()), new Function0() { // from class: m310
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            m410 m410Var2 = m410Var;
                                            cgb.a(m410Var2.P0(), m410Var2.F0, "placeBet", strJ);
                                            return Unit.a;
                                        }
                                    });
                                }
                                ixi ixiVar6 = (ixi) m410Var.b;
                                if (ixiVar6 != null) {
                                    ixiVar6.c.setBetPlacedV2(true);
                                }
                                ixi ixiVar7 = (ixi) m410Var.b;
                                if (ixiVar7 != null) {
                                    ixiVar7.c.setBetInProgress(true);
                                }
                                m410Var.I0();
                                SharedPreferences sharedPreferences2 = m410Var.V;
                                if (sharedPreferences2 != null && sharedPreferences2.getBoolean("PING_PONG_SOUND", true)) {
                                    ypa0 ypa0Var = m410Var.v;
                                    if (ypa0Var == null) {
                                        Intrinsics.n("soundViewModel");
                                        throw null;
                                    }
                                    String string2 = m410Var.getString(R.string.place_bet);
                                    string2.getClass();
                                    ypa0Var.A1(0L, string2);
                                }
                            }
                        }
                        ixi ixiVar8 = (ixi) m410Var.b;
                        if (ixiVar8 != null && (binding2 = ixiVar8.c.getBinding()) != null) {
                            binding2.v.setClickable(false);
                        }
                        ixi ixiVar9 = (ixi) m410Var.b;
                        if (ixiVar9 != null && (binding = ixiVar9.c.getBinding()) != null) {
                            binding.v.setAlpha(0.65f);
                        }
                        m410Var.I0();
                    }
                    GameDetails gameDetails = m410Var.r1;
                    wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "2", "On");
                    m410Var.c1("2", true);
                } else {
                    ixi ixiVar10 = (ixi) m410Var.b;
                    if (ixiVar10 != null && (binding8 = ixiVar10.c.getBinding()) != null) {
                        binding8.D.setVisibility(0);
                    }
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null && (binding7 = ixiVar11.c.getBinding()) != null) {
                        binding7.Y.setVisibility(0);
                    }
                    ixi ixiVar12 = (ixi) m410Var.b;
                    if (ixiVar12 != null && (binding6 = ixiVar12.c.getBinding()) != null) {
                        binding6.a0.setVisibility(0);
                    }
                    ixi ixiVar13 = (ixi) m410Var.b;
                    if (ixiVar13 != null && (binding5 = ixiVar13.c.getBinding()) != null) {
                        binding5.v.setVisibility(8);
                    }
                    ixi ixiVar14 = (ixi) m410Var.b;
                    if (ixiVar14 != null && (binding4 = ixiVar14.c.getBinding()) != null) {
                        binding4.q0.setVisibility(8);
                    }
                    m410Var.O = true;
                }
                m410Var.U0();
                m410Var.l1();
                return Unit.a;
        }
    }
}
