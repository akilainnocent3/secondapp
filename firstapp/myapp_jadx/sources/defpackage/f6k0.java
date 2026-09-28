package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f6k0 {
    public final e6k0 a;

    public f6k0(e6k0 e6k0Var, reo reoVar, rqf0 rqf0Var) {
        this.a = e6k0Var;
    }

    public final nno a(boolean z, List<n6k0> list, List<r5k0> list2, q5k0 q5k0Var, boolean z2, Set<String> set) {
        Object next;
        Object next2;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        q5k0Var.getClass();
        boolean z3 = q5k0Var.g;
        String str = q5k0Var.b;
        u5k0 u5k0Var = (u5k0) CollectionsKt.firstOrNull(q5k0Var.h);
        String str2 = u5k0Var != null ? u5k0Var.c : null;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n6k0) next).a.equals(str2));
        n6k0 n6k0Var = (n6k0) next;
        if (n6k0Var != null) {
            bigDecimal = n6k0Var.b;
        } else {
            Iterator<T> it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((r5k0) next2).a.equals(str2));
            r5k0 r5k0Var = (r5k0) next2;
            bigDecimal = r5k0Var != null ? r5k0Var.b : BigDecimal.ZERO;
        }
        String strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
        boolean zContains = set.contains(str);
        StringUiText stringUiText = vch0.a;
        Integer numValueOf = null;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__single);
        if (z3) {
            numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        }
        return new nno(str, zContains, resourceUiText, numValueOf, rqf0.c(z, z3), rqf0.m(q5k0Var.d, z, z3), rqf0.p(q5k0Var.c), strA, null, rqf0.v(q5k0Var.e), z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [koo] */
    public final voo b(String str, boolean z, List<j6k0> list, List<l6k0> list2, List<n6k0> list3, List<r5k0> list4, q5k0 q5k0Var, String str2) {
        Object next;
        ResourceUiText resourceUiText;
        Object next2;
        Object next3;
        int i;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        q5k0Var.getClass();
        u5k0 u5k0Var = (u5k0) CollectionsKt.firstOrNull(q5k0Var.h);
        Object objA = null;
        String str3 = u5k0Var != null ? u5k0Var.a : null;
        String str4 = u5k0Var != null ? u5k0Var.b : null;
        String str5 = u5k0Var != null ? u5k0Var.c : null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j6k0) next).a.equals(str3));
        j6k0 j6k0Var = (j6k0) next;
        boolean z2 = q5k0Var.g;
        String str6 = q5k0Var.b;
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        String strA = uf80.a(ux5.a(str6, "_", str3, "_", str4), "_", str5 == null ? "" : str5);
        uoo uooVarN = rqf0.n(z, null, z2, R.drawable.ic__feature__match_status_won);
        if (Intrinsics.g(str2, strA)) {
            if (z) {
                jrn.a aVar = jrn.b;
                i = z2 ? R.string.bet_history__won : R.string.bet_history__lost;
            } else {
                i = R.string.bet_history__waiting_to_kick_off;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i);
        } else {
            resourceUiText = null;
        }
        String str7 = j6k0Var != null ? j6k0Var.c.a : null;
        if (str7 == null) {
            str7 = "";
        }
        StringUiText stringUiText2 = vch0.a;
        StringUiText stringUiText3 = new StringUiText(str7);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
        ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
        String str8 = j6k0Var != null ? j6k0Var.e.a : null;
        Iterator it2 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8 != null ? str8 : "")).iterator();
        if (!it2.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next4 = it2.next();
        while (it2.hasNext()) {
            next4 = ((UiText) next4).h((UiText) it2.next());
        }
        UiText uiText = (UiText) next4;
        qeo qeoVarB = z ? reo.b(j6k0Var != null ? j6k0Var.g : null) : null;
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!((n6k0) next2).a.equals(str5));
        n6k0 n6k0Var = (n6k0) next2;
        if (n6k0Var != null) {
            for (Object obj : list2) {
                if (((l6k0) obj).a.equals(n6k0Var.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = this.a.b(str, z, list3, (l6k0) objA, n6k0Var);
        } else {
            Iterator it4 = list4.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!((r5k0) next3).a.equals(str5));
            r5k0 r5k0Var = (r5k0) next3;
            if (r5k0Var != null) {
                objA = e6k0.a(z, list2, list3, r5k0Var);
            }
        }
        return new voo(strA, uooVarN, resourceUiText, null, uiText, null, null, null, qeoVarB, objA);
    }
}
