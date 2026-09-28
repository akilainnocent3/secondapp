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
public final class er {
    public final dr a;

    public er(dr drVar, reo reoVar, rqf0 rqf0Var) {
        this.a = drVar;
    }

    public final nno a(boolean z, List<nr> list, List<pq> list2, oq oqVar, boolean z2, Set<String> set) {
        Object next;
        Object next2;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        oqVar.getClass();
        boolean z3 = oqVar.g;
        String str = oqVar.b;
        sq sqVar = (sq) CollectionsKt.firstOrNull(oqVar.h);
        String str2 = sqVar != null ? sqVar.c : null;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((nr) next).a.equals(str2));
        nr nrVar = (nr) next;
        if (nrVar != null) {
            bigDecimal = nrVar.b;
        } else {
            Iterator<T> it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((pq) next2).a.equals(str2));
            pq pqVar = (pq) next2;
            bigDecimal = pqVar != null ? pqVar.b : BigDecimal.ZERO;
        }
        String strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
        boolean zContains = set.contains(str);
        StringUiText stringUiText = vch0.a;
        Integer numValueOf = null;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__single);
        if (z3) {
            numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        }
        return new nno(str, zContains, resourceUiText, numValueOf, rqf0.c(z, z3), rqf0.m(oqVar.d, z, z3), rqf0.p(oqVar.c), strA, null, rqf0.v(oqVar.e), z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [koo] */
    public final voo b(String str, boolean z, List<ir> list, List<lr> list2, List<nr> list3, List<pq> list4, oq oqVar, String str2) {
        Object next;
        ResourceUiText resourceUiText;
        Object next2;
        Object next3;
        int i;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        oqVar.getClass();
        sq sqVar = (sq) CollectionsKt.firstOrNull(oqVar.h);
        Object objA = null;
        String str3 = sqVar != null ? sqVar.a : null;
        String str4 = sqVar != null ? sqVar.b : null;
        String str5 = sqVar != null ? sqVar.c : null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ir) next).a.equals(str3));
        ir irVar = (ir) next;
        boolean z2 = oqVar.g;
        String str6 = oqVar.b;
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
        String str7 = irVar != null ? irVar.c.a : null;
        if (str7 == null) {
            str7 = "";
        }
        StringUiText stringUiText2 = vch0.a;
        StringUiText stringUiText3 = new StringUiText(str7);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
        ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
        String str8 = irVar != null ? irVar.e.a : null;
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
        qeo qeoVarB = z ? reo.b(irVar != null ? irVar.g : null) : null;
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!((nr) next2).a.equals(str5));
        nr nrVar = (nr) next2;
        if (nrVar != null) {
            for (Object obj : list2) {
                if (((lr) obj).a.equals(nrVar.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = this.a.b(str, z, list3, (lr) objA, nrVar);
        } else {
            Iterator it4 = list4.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!((pq) next3).a.equals(str5));
            pq pqVar = (pq) next3;
            if (pqVar != null) {
                objA = dr.a(z, list2, list3, pqVar);
            }
        }
        return new voo(strA, uooVarN, resourceUiText, null, uiText, null, null, null, qeoVarB, objA);
    }
}
