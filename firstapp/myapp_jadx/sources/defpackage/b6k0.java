package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b6k0 {
    public final jeq a;
    public final e6k0 b;

    public b6k0(jeq jeqVar, e6k0 e6k0Var, reo reoVar, rqf0 rqf0Var) {
        this.a = jeqVar;
        this.b = e6k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1, types: [koo] */
    public final voo a(String str, boolean z, List<j6k0> list, List<l6k0> list2, List<n6k0> list3, List<r5k0> list4, String str2, u5k0 u5k0Var, int i, boolean z2, String str3) {
        Object objA;
        Object next;
        Object next2;
        Object next3;
        Boolean boolValueOf;
        ResourceUiText resourceUiText;
        Object next4;
        Object next5;
        int i2;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        u5k0Var.getClass();
        String str4 = u5k0Var.a;
        String str5 = u5k0Var.b;
        String str6 = u5k0Var.c;
        Iterator it = list.iterator();
        do {
            objA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j6k0) next).a.equals(str4));
        j6k0 j6k0Var = (j6k0) next;
        Iterator it2 = list3.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((n6k0) next2).a.equals(str6));
        n6k0 n6k0Var = (n6k0) next2;
        if (n6k0Var != null) {
            boolValueOf = Boolean.valueOf(n6k0Var.e);
        } else {
            Iterator it3 = list4.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!((r5k0) next3).a.equals(str6));
            r5k0 r5k0Var = (r5k0) next3;
            boolValueOf = r5k0Var != null ? Boolean.valueOf(r5k0Var.c) : null;
        }
        boolean zG = Intrinsics.g(boolValueOf, Boolean.TRUE);
        String strA = uf80.a(ux5.a(str2, "_", str4, "_", str5), "_", str6);
        uoo uooVarN = rqf0.n(z, null, zG, R.drawable.ic__feature__match_status_won);
        if (Intrinsics.g(str3, strA)) {
            if (z) {
                jrn.a aVar = jrn.b;
                i2 = zG ? R.string.bet_history__won : R.string.bet_history__lost;
            } else {
                i2 = R.string.bet_history__waiting_to_kick_off;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i2);
        } else {
            resourceUiText = null;
        }
        String strValueOf = z2 ? String.valueOf(i + 1) : null;
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
        Iterator it4 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8 != null ? str8 : "")).iterator();
        if (!it4.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next6 = it4.next();
        while (it4.hasNext()) {
            next6 = ((UiText) next6).h((UiText) it4.next());
        }
        UiText uiText = (UiText) next6;
        qeo qeoVarB = z ? reo.b(j6k0Var != null ? j6k0Var.g : null) : null;
        Iterator it5 = list3.iterator();
        do {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
        } while (!((n6k0) next4).a.equals(str6));
        n6k0 n6k0Var2 = (n6k0) next4;
        if (n6k0Var2 != null) {
            for (Object obj : list2) {
                if (((l6k0) obj).a.equals(n6k0Var2.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = this.b.b(str, z, list3, (l6k0) objA, n6k0Var2);
        } else {
            Iterator it6 = list4.iterator();
            do {
                if (!it6.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it6.next();
            } while (!((r5k0) next5).a.equals(str6));
            r5k0 r5k0Var2 = (r5k0) next5;
            if (r5k0Var2 != null) {
                objA = e6k0.a(z, list2, list3, r5k0Var2);
            }
        }
        return new voo(strA, uooVarN, resourceUiText, strValueOf, uiText, null, null, null, qeoVarB, objA);
    }
}
