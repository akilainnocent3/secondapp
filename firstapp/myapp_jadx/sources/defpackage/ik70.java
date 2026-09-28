package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class ik70 {
    public static String a(yk70 yk70Var) {
        int iOrdinal = yk70Var.b.ordinal();
        if (iOrdinal == 0) {
            return "--";
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return bjb0.L(BigDecimal.ZERO, Locale.US);
            }
            if (iOrdinal != 3) {
                uhc.a();
                return null;
            }
        }
        return bjb0.L(p54.b(yk70Var.d), Locale.US);
    }

    public static UiText b(tk70 tk70Var) {
        String str = tk70Var != null ? tk70Var.d : null;
        if (str == null) {
            str = "";
        }
        StringUiText stringUiText = vch0.a;
        StringUiText stringUiText2 = new StringUiText(str);
        ResourceUiText resourceUiText = new ResourceUiText(R.string.app_common__blank_space);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.bet_history__vs);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.app_common__blank_space);
        String str2 = tk70Var != null ? tk70Var.g : null;
        Iterator it = b.k(stringUiText2, resourceUiText, resourceUiText2, resourceUiText3, new StringUiText(str2 != null ? str2 : "")).iterator();
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

    public static UiText c(tk70 tk70Var) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__league);
        StringUiText stringUiText2 = new StringUiText(": ");
        String str = tk70Var != null ? tk70Var.c : null;
        if (str == null) {
            str = "";
        }
        Iterator it = b.k(resourceUiText, stringUiText2, new StringUiText(str)).iterator();
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

    public static ResourceUiText e(xk70 xk70Var, String str) {
        int i;
        if (!xk70Var.a.equals(str)) {
            return null;
        }
        int iOrdinal = xk70Var.b.ordinal();
        if (iOrdinal == 0) {
            i = R.string.bet_history__waiting_for_result;
        } else if (iOrdinal == 1) {
            i = R.string.bet_history__won;
        } else if (iOrdinal == 2) {
            i = R.string.bet_history__lost;
        } else {
            if (iOrdinal != 3) {
                uhc.a();
                return null;
            }
            i = R.string.bet_history__void;
        }
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(i);
    }

    public static UiText f(tk70 tk70Var) {
        String strValueOf = tk70Var != null ? String.valueOf(tk70Var.l) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{strValueOf}));
        StringUiText stringUiText2 = new StringUiText(" | ");
        String strValueOf2 = tk70Var != null ? String.valueOf(tk70Var.k) : null;
        Iterator it = b.k(resourceUiText, stringUiText2, new ResourceUiText(R.string.page_instant_virtual__season_id_vnum, ay0.S(new Object[]{strValueOf2 != null ? strValueOf2 : ""}))).iterator();
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

    public static uoo d(xk70 xk70Var) {
        int iOrdinal = xk70Var.b.ordinal();
        if (iOrdinal == 0) {
            return new uoo(new gno.a(R.drawable.ic__feature__match_status_not_started, R.color.icon_primary), "bet_cell_selection_result_unsettled_icon");
        }
        if (iOrdinal == 1) {
            return new uoo(new gno.b(R.drawable.ic__feature__match_status_won), oLsIjJCWb.zgnptPoONDw);
        }
        if (iOrdinal == 2) {
            return new uoo(new gno.b(R.drawable.ic__feature__match_status_lost), "bet_cell_selection_result_miss_icon");
        }
        if (iOrdinal == 3) {
            return new uoo(new gno.b(R.drawable.ic__feature__match_status_void), "bet_cell_selection_result_void_icon");
        }
        uhc.a();
        return null;
    }
}
