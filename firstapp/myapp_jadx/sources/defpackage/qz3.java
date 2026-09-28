package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sportybet.android.bookingcode.presentation.activity.NonUILoadCodeActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.activities.CommonDialogActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qz3 {

    public static class a {
        public boolean a;
        public BigDecimal b;
        public BigDecimal c;
    }

    @Deprecated(since = "Anti-pattern: accessing global activity context.")
    public static boolean a() {
        if (oti.c().e() != null) {
            return TextUtils.equals(oti.c().e().getLocalClassName(), EventActivity.class.getName());
        }
        return false;
    }

    public static boolean b(Selection selection) {
        int i;
        List<Selection> list = selection.d;
        if (list != null && !list.isEmpty()) {
            Iterator<Selection> it = selection.d.iterator();
            while (it.hasNext()) {
                if (!b(it.next())) {
                    return false;
                }
            }
        }
        if (selection.w || (i = selection.b.status) == 1 || i == 2 || i == 3) {
            return false;
        }
        return (i == 0 && selection.c.isActive == 0) ? false : true;
    }

    @Deprecated(since = "Anti-pattern: accessing global activity context.")
    public static String c(mr4 mr4Var, boolean z) {
        iu2 iu2Var = iu2.a;
        if (z) {
            Context contextJ = yrh0.j();
            contextJ.getClass();
            return iu2Var.j().H(contextJ);
        }
        Context contextJ2 = yrh0.j();
        boolean z2 = mr4Var.a;
        int i = mr4Var.b;
        contextJ2.getClass();
        return iu2Var.j().F(i, contextJ2, z2);
    }

    public static a d(TaxConfig taxConfig, AssetsInfo assetsInfo, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        a aVar = new a();
        if (taxConfig.getExciseTaxRateToCharge() > 0.0d && assetsInfo != null) {
            BigDecimal bigDecimalAdd = new BigDecimal(assetsInfo.balance).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP).add(bigDecimal2);
            BigDecimal bigDecimalSubtract = bigDecimal.add(taxConfig.getChargeExciseTax(bigDecimal)).subtract(taxConfig.getBonusExciseTax(bigDecimal));
            if (bigDecimalSubtract.compareTo(bigDecimalAdd) > 0) {
                aVar.a = true;
                aVar.b = bigDecimalSubtract;
                aVar.c = bigDecimalSubtract.subtract(bigDecimalAdd);
            }
        }
        return aVar;
    }

    public static UiText e(int i) {
        if (i == 1) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_functions__cash_gift);
        }
        if (i == 2) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.common_functions__discount_gift);
        }
        if (i != 3) {
            return vch0.a;
        }
        StringUiText stringUiText3 = vch0.a;
        return new ResourceUiText(R.string.common_functions__free_bet_gift);
    }

    public static boolean f(Selection selection) {
        if (selection.b.status == 0 && selection.c.isActive == 1 && !selection.w) {
            return (selection.q() && selection.b.product == 1) ? false : true;
        }
        return false;
    }

    @Deprecated(since = "Anti-pattern: Accessing singleton BetMutexData directly.")
    public static boolean g() {
        Category category;
        Tournament tournament;
        lw2 lw2Var = lw2.d;
        if (lw2Var.E().values().size() != 1) {
            Set<Event> setKeySet = lw2Var.E().keySet();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<Event> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Event next = it.next();
                next.getClass();
                Sport sport = next.sport;
                String str = (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.id;
                String str2 = str != null ? str : "";
                if (!TextUtils.isEmpty(str2)) {
                    if (b3.T(next.eventId)) {
                        hashSet.add(str2);
                    } else if (b3.U(next.eventId)) {
                        hashSet3.add(str2);
                    } else {
                        hashSet2.add(str2);
                    }
                }
            }
            if (Collections.disjoint(hashSet, hashSet2) && Collections.disjoint(hashSet, hashSet3) && Collections.disjoint(hashSet2, hashSet3)) {
                if (iu2.a.j().V()) {
                    try {
                        String[] strArrSplit = yrh0.j().getSharedPreferences("sportybet", 0).getString("bet_builder_supported_bet_types", "").split(",");
                        if (strArrSplit.length != 1 || Integer.parseInt(strArrSplit[0]) != 1) {
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean h(lw2 lw2Var, List<Selection> list) {
        Category category;
        Tournament tournament;
        if (lw2Var.E().size() != 1) {
            Set<Event> setKeySet = lw2Var.E().keySet();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<Event> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Event next = it.next();
                next.getClass();
                Sport sport = next.sport;
                String str = (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.id;
                String str2 = str != null ? str : "";
                if (!TextUtils.isEmpty(str2)) {
                    if (b3.T(next.eventId)) {
                        hashSet.add(str2);
                    } else if (b3.U(next.eventId)) {
                        hashSet3.add(str2);
                    } else {
                        hashSet2.add(str2);
                    }
                }
            }
            if (Collections.disjoint(hashSet, hashSet2) && Collections.disjoint(hashSet, hashSet3) && Collections.disjoint(hashSet2, hashSet3)) {
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Selection) it2.next()).p()) {
                            try {
                                String[] strArrSplit = yrh0.j().getSharedPreferences("sportybet", 0).getString("bet_builder_supported_bet_types", "").split(",");
                                if (strArrSplit.length != 1 || Integer.parseInt(strArrSplit[0]) != 1) {
                                    break;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean i(Selection selection) {
        int i;
        List<Selection> list = selection.d;
        if (list != null && !list.isEmpty()) {
            Iterator<Selection> it = selection.d.iterator();
            while (it.hasNext()) {
                if (i(it.next())) {
                }
            }
            if (selection.w) {
            }
        } else if (selection.w && (i = selection.b.status) != 1 && i != 2 && (i != 0 || selection.c.isActive != 0)) {
            return false;
        }
        return true;
    }

    public static boolean j(Selection selection) {
        return selection.b.status == 3 || (selection.q() && selection.b.product == 1);
    }

    public static void k(String str, String str2) {
        Intent intent = new Intent(hp0.A, (Class<?>) NonUILoadCodeActivity.class);
        intent.putExtra("extra_data_booking_code", str);
        intent.putExtra("action_load_booking_code_from", str2);
        yrh0.s(hp0.A, intent, true);
    }

    public static boolean l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    @Deprecated(since = "Anti-pattern: access singleton StakeConfigAgent directly.")
    public static void m(Context context) {
        b.a aVar = new b.a(context);
        aVar.a.f = sn5.b(context, R.string.component_betslip__same_event_selection_error, new Object[0]);
        aVar.c(sn5.b(context, R.string.common_functions__ok, new Object[0]), null);
        b bVarCreate = aVar.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    @Deprecated(since = "Anti-pattern: accessing singleton CountryManager, UiRouterManager directly.")
    public static boolean n(Activity activity, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        try {
            Locale locale = Locale.US;
            String strB = sn5.b(activity, R.string.component_betslip__excise_tax_dialog_msg, a8b.a(bjb0.L(bigDecimal, locale)), a8b.a(bjb0.L(bigDecimal2, locale)));
            b.a aVar = new b.a(activity);
            aVar.d(R.string.common_functions__balance_insufficient);
            aVar.a.f = strB;
            aVar.setPositiveButton(R.string.component_betslip__top_up, new pz3()).setNegativeButton(R.string.common_functions__later, new oz3()).create().show();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void o(Context context) {
        b.a title = new b.a(context).setTitle(sn5.b(context, R.string.common_functions__note, new Object[0]));
        title.a.f = sn5.b(context, R.string.common_functions__joker_same_market_conflict, new Object[0]);
        title.c(sn5.b(context, R.string.common_functions__ok, new Object[0]), null);
        b bVarCreate = title.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public static void p(Context context) {
        if (!(context instanceof Activity)) {
            yrh0.t(context, CommonDialogActivity.class, true);
            return;
        }
        b.a aVar = new b.a(context);
        aVar.a.f = sn5.b(context, R.string.component_betslip__there_cannot_be_over_vthreshold_selections_betslip_tip, String.valueOf(ird0.a().o()));
        aVar.c(sn5.b(context, R.string.common_functions__ok, new Object[0]), null);
        b bVarCreate = aVar.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }
}
