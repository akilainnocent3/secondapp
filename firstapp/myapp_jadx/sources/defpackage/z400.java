package defpackage;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.remote.models.PlaceOverUnderBetRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z400 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z400(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tu80 binding;
        w3c0 w3c0Var;
        tu80 binding2;
        w3c0 w3c0Var2;
        tu80 binding3;
        w3c0 w3c0Var3;
        w3c0 w3c0Var4;
        w3c0 w3c0Var5;
        rv80 binding4;
        rv80 binding5;
        rv80 binding6;
        rv80 binding7;
        tu80 binding8;
        rs80 binding9;
        tu80 binding10;
        tu80 binding11;
        tu80 binding12;
        GiftItem giftItem;
        tu80 binding13;
        tu80 binding14;
        GiftItem giftItem2;
        int i = this.a;
        boolean z = false;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(1 & iIntValue, (iIntValue & 17) != 16)) {
                    g500.c((i500) ytwVar.getValue(), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final q1c0 q1c0Var = (q1c0) obj4;
                String str = (String) obj;
                Double d = (Double) obj2;
                double dDoubleValue = d.doubleValue();
                String str2 = (String) obj3;
                str.getClass();
                str2.getClass();
                w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                if (w3c0Var6 != null && (binding = w3c0Var6.a0.getBinding()) != null && !binding.c.getBetPlaced() && (w3c0Var = (w3c0) q1c0Var.b) != null && (binding2 = w3c0Var.a0.getBinding()) != null && !binding2.c.getBetInProgress()) {
                    if (!q1c0Var.H.isEmpty()) {
                        int betIndex = q1c0Var.H.get(1).getBetIndex();
                        String currency = q1c0Var.H.get(1).getCurrency();
                        long j = q1c0Var.W;
                        w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                        String giftId = (w3c0Var7 == null || (binding14 = w3c0Var7.a0.getBinding()) == null || (giftItem2 = binding14.c.getGiftItem()) == null) ? null : giftItem2.getGiftId();
                        w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                        Double giftAmount = (w3c0Var8 == null || (binding13 = w3c0Var8.a0.getBinding()) == null) ? null : binding13.c.getGiftAmount();
                        boolean z2 = q1c0Var.T1;
                        GPSData gPSData = q1c0Var.J1;
                        w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                        final String strJ = new eal().j(new PlaceOverUnderBetRequest(str, str2, betIndex, currency, j, giftId, giftAmount, d, z2, gPSData, ((w3c0Var9 == null || (binding12 = w3c0Var9.a0.getBinding()) == null || (giftItem = binding12.c.getGiftItem()) == null) ? null : giftItem.getGiftId()) != null ? Boolean.TRUE : null));
                        foa0 foa0Var = (foa0) q1c0Var.a;
                        if (foa0Var != null) {
                            foa0Var.N1(strJ, "OVER_UNDER", q1c0Var.W, q1c0Var.H.get(1).getBetIndex(), new Function0() { // from class: yyb0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    q1c0 q1c0Var2 = q1c0Var;
                                    cgb.a(q1c0Var2.m1(), q1c0Var2.c1, "placeBet", strJ);
                                    return Unit.a;
                                }
                            });
                        }
                        w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                        if (w3c0Var10 != null && (binding11 = w3c0Var10.a0.getBinding()) != null) {
                            binding11.c.setBetInProgress(true);
                        }
                        w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                        if (w3c0Var11 != null && (binding9 = w3c0Var11.l0.getBinding()) != null) {
                            TextView textView = binding9.w;
                            w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                            if (w3c0Var12 != null && (binding10 = w3c0Var12.a0.getBinding()) != null && !binding10.b.getBetIsPlaced()) {
                                z = true;
                            }
                            textView.setEnabled(z);
                        }
                        SharedPreferences sharedPreferences = q1c0Var.j0;
                        if (sharedPreferences != null && sharedPreferences.getBoolean("SPORTY_HERO_SOUND", true)) {
                            ypa0 ypa0Var = q1c0Var.D;
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string = q1c0Var.getString(R.string.revamp_place_bet);
                            string.getClass();
                            ypa0Var.A1(0L, string);
                        }
                    }
                    GameDetails gameDetails = q1c0Var.W1;
                    wz.a("BetPlaced2", gameDetails != null ? gameDetails.getName() : null, "OVER_UNDER", str2, String.valueOf(dDoubleValue));
                    q1c0Var.N1("2", str2, "OVER_UNDER", true);
                    w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                    if ((w3c0Var13 != null && (binding8 = w3c0Var13.a0.getBinding()) != null && binding8.b.getBetIsWaiting()) || ((w3c0Var2 = (w3c0) q1c0Var.b) != null && (binding3 = w3c0Var2.a0.getBinding()) != null && binding3.b.getBetIsPlaced())) {
                        GameDetails gameDetails2 = q1c0Var.W1;
                        wz.a("MultipleBets", gameDetails2 != null ? gameDetails2.getName() : null, "OVER_UNDER");
                    }
                    w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                    if ((w3c0Var14 != null && (binding7 = w3c0Var14.j0.getBinding()) != null && binding7.c.getBetIsWaiting()) || (((w3c0Var3 = (w3c0) q1c0Var.b) != null && (binding6 = w3c0Var3.j0.getBinding()) != null && binding6.c.getBetIsPlaced()) || (((w3c0Var4 = (w3c0) q1c0Var.b) != null && (binding5 = w3c0Var4.j0.getBinding()) != null && binding5.d.getBetIsWaiting()) || ((w3c0Var5 = (w3c0) q1c0Var.b) != null && (binding4 = w3c0Var5.j0.getBinding()) != null && binding4.d.getBetIsPlaced())))) {
                        GameDetails gameDetails3 = q1c0Var.W1;
                        wz.a("MultipleCategoryBet", gameDetails3 != null ? gameDetails3.getName() : null, "OVER_UNDERRANGE");
                    }
                }
                return Unit.a;
        }
    }
}
