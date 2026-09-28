package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class sqo {
    public static final BigDecimal a = new BigDecimal(10000);

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class b implements gd8.a {
        public final /* synthetic */ DialogInterface.OnClickListener a;

        public b(DialogInterface.OnClickListener onClickListener) {
            this.a = onClickListener;
        }

        @Override // gd8.a
        public final androidx.appcompat.app.b a(final e eVar) {
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar);
            aVar.setTitle(sn5.b(eVar, R.string.page_instant_virtual__this_round_is_over, new Object[0]));
            aVar.a.f = sn5.b(eVar, R.string.page_instant_virtual__please_play_a_new_round, new Object[0]);
            aVar.c(sn5.b(eVar, R.string.common_functions__play, new Object[0]).toUpperCase(Locale.ENGLISH), this.a);
            final androidx.appcompat.app.b bVarCreate = aVar.create();
            bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: zqo
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar.getColor(R.color.background_type1_secondary)));
                }
            });
            return bVarCreate;
        }
    }

    public class c implements gd8.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DialogInterface.OnClickListener d;

        public c(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = onClickListener;
        }

        @Override // gd8.a
        public final androidx.appcompat.app.b a(final e eVar) {
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar);
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                aVar.setTitle(str);
            }
            aVar.a.f = this.b;
            aVar.c(this.c, this.d);
            final androidx.appcompat.app.b bVarCreate = aVar.create();
            bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: aro
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar.getColor(R.color.background_type1_secondary)));
                }
            });
            return bVarCreate;
        }
    }

    public static o4p a(String str, String str2, BigDecimal bigDecimal, Collection<BetSlipData> collection, tlo tloVar) {
        ypf0 aqf0Var;
        switch (String.valueOf(str)) {
            case "single":
                aqf0Var = new aqf0();
                break;
            case "system":
                aqf0Var = new bqf0();
                break;
            case "multiple":
                aqf0Var = new zpf0();
                break;
            default:
                hb5.a(inm.a("unknown BetSlipType: ", str));
                return null;
        }
        o4p o4pVarA = aqf0Var.a(str2, collection, tloVar);
        if (o4pVarA != null) {
            o4pVarA.g(bigDecimal);
        }
        return o4pVarA;
    }

    public static String b(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public static spu c(String str, Market market, tlo tloVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Outcome outcome : market.outcomes) {
            String strB = b(str, market.marketId, outcome.outcomeId);
            linkedHashMap.put(strB, new h8z(outcome.outcomeId, outcome.odds, outcome.desc, false, outcome.enable, tloVar.q(strB) != null, outcome.probability));
        }
        return new spu(market.marketId, market.type, market.attributes, market.title, market.subTitle, linkedHashMap, market.guide);
    }

    public static Market d(Event event, String str) {
        List<Market> list;
        if (event == null || (list = event.markets) == null) {
            return null;
        }
        for (Market market : list) {
            if (TextUtils.equals(market.marketId, str)) {
                return market;
            }
        }
        return null;
    }

    public static Market e(Event event, MarketType marketType) {
        List<Market> list;
        if (event == null || (list = event.markets) == null) {
            return null;
        }
        for (Market market : list) {
            if (TextUtils.equals(market.type, marketType.type)) {
                return market;
            }
        }
        return null;
    }

    public static List<String> f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Arrays.asList(str.split(";"));
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("e =%s", e.getMessage());
            return null;
        }
    }

    public static String g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal.compareTo(bigDecimal2) == 0 || bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return gky.a(bjb0.L(bigDecimal2, Locale.US));
        }
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(gky.a(bjb0.L(bigDecimal, locale)));
        sb.append(" ~ ");
        sb.append(gky.a(bjb0.L(bigDecimal2, locale)));
        return sb.toString();
    }

    public static Outcome h(Market market, String str) {
        if (market == null) {
            return null;
        }
        for (Outcome outcome : market.outcomes) {
            if (TextUtils.equals(outcome.outcomeId, str)) {
                return outcome;
            }
        }
        return null;
    }

    public static void i(e eVar, int i, boolean z) {
        k(eVar, sn5.b(eVar, R.string.page_instant_virtual__bet_limit_reached_title, new Object[0]), sn5.b(eVar, z ? R.string.page_instant_virtual__bet_limit_reach_vbets_per_round_popup_content_ib : R.string.page_instant_virtual__bet_limit_reach_vbets_per_round_popup_content, Integer.valueOf(i)), null);
    }

    public static void j(e eVar, DialogInterface.OnClickListener onClickListener) {
        k(eVar, sn5.b(eVar, R.string.common_feedback__connection_error, new Object[0]), sn5.b(eVar, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]), onClickListener);
    }

    public static void k(e eVar, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        l(eVar, str, str2, eVar != null ? sn5.b(eVar, R.string.common_functions__ok, new Object[0]).toUpperCase(Locale.ENGLISH) : "", onClickListener);
    }

    public static void l(e eVar, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        gd8 gd8VarJ0 = gd8.j0(new c(str, str2, str3, onClickListener));
        try {
            gd8VarJ0.setCancelable(false);
            gd8VarJ0.showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }

    public static boolean m(Context context, tlo tloVar) {
        int iM = tloVar.m();
        try {
            if (tloVar.h() + 1 > iM) {
                androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(context);
                aVar.a.f = sn5.b(context, R.string.component_betslip__there_cannot_be_over_vthreshold_selections_betslip_tip, String.valueOf(iM));
                aVar.c(sn5.b(context, R.string.common_functions__ok, new Object[0]), new a());
                aVar.create().show();
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void n(e eVar) {
        try {
            gd8.j0(new oqo()).showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }

    public static void o(e eVar, tlo tloVar, jpk jpkVar, yon yonVar) {
        try {
            gd8.j0(new yqo(jpkVar, tloVar, yonVar, eVar)).showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }

    public static void p(e eVar, DialogInterface.OnClickListener onClickListener) {
        gd8 gd8VarJ0 = gd8.j0(new b(onClickListener));
        try {
            gd8VarJ0.setCancelable(true);
            gd8VarJ0.showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }

    public static void q(e eVar, final DialogInterface.OnClickListener onClickListener) {
        gd8 gd8VarJ0 = gd8.j0(new gd8.a() { // from class: nqo
            @Override // gd8.a
            public final b a(final e eVar2) {
                b.a aVar = new b.a(eVar2);
                aVar.a.f = sn5.b(eVar2, R.string.page_instant_virtual__this_game_round_has_been_settled_tip, new Object[0]);
                aVar.c(sn5.b(eVar2, R.string.common_functions__ok, new Object[0]), onClickListener);
                final b bVarCreate = aVar.create();
                bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: pqo
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar2.getColor(R.color.background_type1_secondary)));
                    }
                });
                return bVarCreate;
            }
        });
        try {
            gd8VarJ0.setCancelable(true);
            gd8VarJ0.showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }
}
