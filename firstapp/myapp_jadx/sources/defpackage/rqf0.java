package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rqf0 {
    public static int a(jrn jrnVar, boolean z) {
        return (z || jrnVar != null) ? R.color.bg_brand_sub_secondary_d_darker : R.color.bg_surface_primary;
    }

    public static ResourceUiText b(String str) {
        str.getClass();
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.bet_history__bet_id_vid, ay0.S(new Object[]{str}));
    }

    public static ColoredUiText c(boolean z, boolean z2) {
        int i;
        int i2;
        if (!z) {
            return null;
        }
        if (z2) {
            i = R.string.bet_history__won;
            i2 = R.color.bg_brand_sub_primary_d_lighter;
        } else {
            i = R.string.bet_history__lost;
            i2 = R.color.text_secondary;
        }
        StringUiText stringUiText = vch0.a;
        return new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i2), null);
    }

    public static UiText d(int i, String str) {
        Object next;
        str.getClass();
        uag uagVar = cd3.f;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (!((cd3) next).a.equalsIgnoreCase(str));
        cd3 cd3Var = (cd3) next;
        if (cd3Var == null) {
            return null;
        }
        return e(cd3Var, i);
    }

    public static UiText e(cd3 cd3Var, int i) {
        int iOrdinal = cd3Var.ordinal();
        if (iOrdinal == 0) {
            if (i <= 1) {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.bet_history__single);
            }
            StringUiText stringUiText2 = vch0.a;
            return jz4.a(new ResourceUiText(R.string.bet_history__single), " (x").h(vch0.d(String.valueOf(i))).h(new StringUiText(")"));
        }
        if (iOrdinal == 1) {
            if (i <= 1) {
                StringUiText stringUiText3 = vch0.a;
                return new ResourceUiText(R.string.bet_history__multiple);
            }
            StringUiText stringUiText4 = vch0.a;
            return jz4.a(new ResourceUiText(R.string.bet_history__multiple), " (x").h(vch0.d(String.valueOf(i))).h(new StringUiText(")"));
        }
        if (iOrdinal == 2) {
            StringUiText stringUiText5 = vch0.a;
            return new ResourceUiText(R.string.bet_history__system);
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            StringUiText stringUiText6 = vch0.a;
            return new ResourceUiText(R.string.bet_history__multiple);
        }
        uhc.a();
        return null;
    }

    public static String f(BigDecimal bigDecimal) {
        BigDecimal bigDecimalB;
        if (bigDecimal.compareTo(BigDecimal.ZERO) != 1) {
            bigDecimal = null;
        }
        if (bigDecimal == null || (bigDecimalB = p54.b(bigDecimal)) == null) {
            return null;
        }
        return bjb0.L(bigDecimalB, Locale.US);
    }

    public static int g(boolean z, boolean z2) {
        if (z) {
            return z2 ? R.color.bg_brand_sub_primary_d_base : R.color.border_secondary;
        }
        return R.color.text_tertiary;
    }

    public static ResourceUiText h(int i, int i2) {
        Object[] objArr = {String.valueOf(i), String.valueOf(i2)};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(objArr));
    }

    public static ResourceUiText i(BigDecimal bigDecimal, String str) {
        str.getClass();
        bigDecimal.getClass();
        if (StringsKt.U(str) || bigDecimal.compareTo(BigDecimal.ZERO) != 1) {
            return null;
        }
        Object[] objArr = {bjb0.L(p54.b(bigDecimal), Locale.US)};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.page_transaction__neg_amount, ay0.S(objArr));
    }

    public static ResourceUiText j(String str, BigDecimal bigDecimal, Function0 function0) {
        Integer num;
        str.getClass();
        bigDecimal.getClass();
        if (StringsKt.U(str) || bigDecimal.compareTo(BigDecimal.ZERO) != 1 || (num = (Integer) function0.invoke()) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UiText k(ArrayList arrayList) {
        ResourceUiText resourceUiText;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            if (!StringsKt.U(str) && !StringsKt.U(str2)) {
                arrayList2.add(obj);
            }
        }
        List<Pair> listT0 = CollectionsKt.t0(arrayList2, 3);
        ArrayList arrayList3 = new ArrayList(l48.r(listT0, 10));
        for (Pair pair2 : listT0) {
            Iterator it = b.k(vch0.d((String) pair2.a), new StringUiText(" "), new ResourceUiText(R.string.bet_history__vs), new StringUiText(" "), vch0.d((String) pair2.b)).iterator();
            if (!it.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((UiText) next).h((UiText) it.next());
            }
            arrayList3.add((UiText) next);
        }
        if (arrayList3.isEmpty()) {
            return vch0.a;
        }
        Iterator it2 = arrayList3.iterator();
        if (!it2.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next2 = it2.next();
        while (it2.hasNext()) {
            UiText uiText = (UiText) it2.next();
            StringUiText stringUiText = vch0.a;
            next2 = ((UiText) next2).h(new StringUiText("\n")).h(uiText);
        }
        UiText uiText2 = (UiText) next2;
        int size2 = arrayList.size() - 3;
        if (size2 <= 0) {
            return uiText2;
        }
        if (size2 == 1) {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.bet_history__and_1_other_match);
        } else {
            Object[] objArr = {Integer.valueOf(size2)};
            StringUiText stringUiText3 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.bet_history__and_vcount_other_matches, ay0.S(objArr));
        }
        return uiText2.h(new StringUiText("\n...(")).h(resourceUiText).h(new StringUiText(")"));
    }

    public static int l(hug0 hug0Var) {
        hug0Var.getClass();
        int iOrdinal = hug0Var.ordinal();
        if (iOrdinal == 1) {
            return R.drawable.ic_one_bet_cut_sw;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? R.drawable.ic_one_bet_cut : R.drawable.ic_one_bet_cut_pt_br;
        }
        return R.drawable.ic_one_bet_cut_es_mx;
    }

    public static String m(BigDecimal bigDecimal, boolean z, boolean z2) {
        bigDecimal.getClass();
        if (z) {
            return bjb0.L(z2 ? p54.b(bigDecimal) : BigDecimal.ZERO, Locale.US);
        }
        return "--";
    }

    public static uoo n(boolean z, jrn jrnVar, boolean z2, int i) {
        if (!z) {
            return new uoo(new gno.a(R.drawable.iwqk_ticket_status, R.color.icon_primary), "bet_cell_selection_result_unsettled_icon");
        }
        if (jrnVar == jrn.ONE_X_TWO_ONE_UP) {
            return new uoo(new gno.b(R.drawable.ic__feature__match_status_1up), "bet_cell_selection_result_hit_icon");
        }
        if (jrnVar == jrn.ONE_X_TWO_TWO_UP) {
            return new uoo(new gno.b(R.drawable.ic__feature__match_status_2up), "bet_cell_selection_result_hit_icon");
        }
        return z2 ? new uoo(new gno.b(i), "bet_cell_selection_result_hit_icon") : new uoo(new gno.b(R.drawable.ic__feature__match_status_lost), "bet_cell_selection_result_miss_icon");
    }

    public static UiText o(String str, String str2) {
        StringUiText stringUiText = vch0.a;
        Iterator it = b.k(new StringUiText(str), new StringUiText(" "), new ResourceUiText(R.string.bet_history__vs), new StringUiText(" "), new StringUiText(str2)).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((UiText) next).h((UiText) it.next());
        }
        return (UiText) next;
    }

    public static String p(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return bjb0.L(p54.b(bigDecimal), Locale.US);
    }

    public static ResourceUiText q(String str) {
        str.getClass();
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.bet_history__ticket_id_vid, ay0.S(new Object[]{str}));
    }

    public static int r(boolean z) {
        return z ? R.color.text_brand_sub_primary_d_lighter : R.color.text_secondary;
    }

    public static String s(boolean z, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return z ? bjb0.L(p54.b(bigDecimal), Locale.US) : "--";
    }

    public static ColoredUiText t(int i, BigDecimal bigDecimal, boolean z, boolean z2) {
        bigDecimal.getClass();
        if (!z2) {
            i = R.color.text_inverse_secondary;
        }
        String strS = s(z, bigDecimal);
        StringUiText stringUiText = vch0.a;
        return new ColoredUiText(new StringUiText(strS), Integer.valueOf(i), null);
    }

    public static ConcatUiText u(String str) {
        str.getClass();
        StringUiText stringUiText = vch0.a;
        return jz4.a(new ResourceUiText(R.string.bet_history__total_stake), "(").h(new StringUiText(str)).h(new StringUiText(")"));
    }

    public static ResourceUiText v(BigDecimal bigDecimal) {
        BigDecimal bigDecimalB;
        bigDecimal.getClass();
        if (bigDecimal.compareTo(BigDecimal.ZERO) != 1) {
            bigDecimal = null;
        }
        if (bigDecimal == null || (bigDecimalB = p54.b(bigDecimal)) == null) {
            return null;
        }
        Object[] objArr = {bjb0.L(bigDecimalB, Locale.US)};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.page_transaction__neg_amount, ay0.S(objArr));
    }
}
