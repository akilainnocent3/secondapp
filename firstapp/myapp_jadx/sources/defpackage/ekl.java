package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class ekl {
    public static final fkl.a a(Context context, String str, List<? extends Event> list, String str2, boolean z) {
        String strA;
        context.getClass();
        str.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(iu2.d());
        iu2.b();
        LinkedHashMap linkedHashMapA = apg.a(list);
        for (Event event : list) {
            if (event.markets != null && !event.isBetBuilderChild()) {
                for (Market market : event.markets) {
                    List<Outcome> list2 = market.outcomes;
                    if (list2 != null && market.status != 3) {
                        Iterator<Outcome> it = list2.iterator();
                        while (it.hasNext()) {
                            iu2.t(event, market, it.next(), true, false, (List) linkedHashMapA.get(market.id), 16336);
                        }
                    }
                }
            }
        }
        lw2 lw2Var = lw2.d;
        lw2Var.y();
        int i = 0;
        int size = lw2Var.s() != null ? lw2Var.s().keySet().size() : 0;
        long jQ = lw2Var.Q(lw2Var.s().size());
        String strH1 = iu2.a.j().h1(size, qz3.g());
        String strB = sn5.b(context, R.string.app_common__variable_x, String.valueOf(jQ));
        boolean zP = lw2Var.P();
        if (size == 1 || qz3.g()) {
            List<BigDecimal> listC = lw2Var.c();
            listC.getClass();
            strA = gky.a.a(bjb0.L(((BigDecimal) Collections.max(listC)).setScale(2, RoundingMode.HALF_UP), Locale.US), false);
        } else if (size > 1) {
            BigDecimal bigDecimalM = lw2Var.M();
            bigDecimalM.getClass();
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal scale = bigDecimalM.setScale(2, roundingMode);
            if (zP) {
                BigDecimal bigDecimalJ = lw2Var.j();
                bigDecimalJ.getClass();
                BigDecimal scale2 = bigDecimalJ.setScale(2, roundingMode);
                if (scale2.compareTo(scale) == 0) {
                    strA = gky.a.a(bjb0.L(scale2, Locale.US), false);
                } else {
                    Locale locale = Locale.US;
                    strA = oxc.a(gky.a.a(bjb0.L(scale2, locale), false), " ~ ", gky.a.a(bjb0.L(scale, locale), false));
                }
            } else {
                strA = gky.a.a(bjb0.L(scale, Locale.US), false);
            }
        } else {
            strA = "";
        }
        String str3 = strH1 + " " + strB + " " + strA;
        iu2.b();
        lw2Var.clear();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            iu2.t(selection.a, selection.b, selection.c, true, false, selection.d, 16336);
        }
        return new fkl.a(str, str3, str2, z, list);
    }

    public static final void b(Activity activity, String str, List<? extends Event> list, String str2, boolean z, boolean z2) {
        activity.getClass();
        str.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        fkl.a aVarA = a(activity, str, list, str2, z2);
        Intent intent = new Intent(activity, (Class<?>) HighLiabilityCodeActivity.class);
        intent.putExtra("share_code", aVarA.a);
        intent.putExtra("summary", aVarA.b);
        List<Event> list2 = aVarA.c;
        list2.getClass();
        intent.putParcelableArrayListExtra("booking_code_event", (ArrayList) list2);
        String str3 = aVarA.d;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("action_load_booking_code_from", str3);
        intent.putExtra("is_smart_remix_available", aVarA.e);
        activity.startActivity(intent);
        if (z) {
            activity.finish();
        }
    }
}
