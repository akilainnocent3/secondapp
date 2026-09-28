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
public final class wrn {
    public final Object a;

    public wrn(rld rldVar) {
        this.a = rldVar;
    }

    public nno a(boolean z, List list, List list2, frn frnVar, boolean z2, Set set) {
        Object next;
        Object next2;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        frnVar.getClass();
        boolean z3 = frnVar.g;
        String str = frnVar.b;
        irn irnVar = (irn) CollectionsKt.firstOrNull(frnVar.h);
        String str2 = irnVar != null ? irnVar.c : null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((dsn) next).a.equals(str2));
        dsn dsnVar = (dsn) next;
        if (dsnVar != null) {
            bigDecimal = dsnVar.b;
        } else {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((grn) next2).a.equals(str2));
            grn grnVar = (grn) next2;
            bigDecimal = grnVar != null ? grnVar.b : BigDecimal.ZERO;
        }
        String strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
        boolean zContains = set.contains(str);
        StringUiText stringUiText = vch0.a;
        Integer numValueOf = null;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__single);
        if (z3) {
            numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        }
        return new nno(str, zContains, resourceUiText, numValueOf, rqf0.c(z, z3), rqf0.m(frnVar.d, z, z3), rqf0.p(frnVar.c), strA, null, rqf0.v(frnVar.e), z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [koo] */
    public voo b(String str, boolean z, List list, List list2, List list3, List list4, frn frnVar, String str2) {
        Object next;
        ResourceUiText resourceUiText;
        UiText uiText;
        Object next2;
        Object next3;
        int i;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        frnVar.getClass();
        irn irnVar = (irn) CollectionsKt.firstOrNull(frnVar.h);
        Object objA = null;
        String str3 = irnVar != null ? irnVar.a : null;
        String str4 = irnVar != null ? irnVar.b : null;
        String str5 = irnVar != null ? irnVar.c : null;
        jrn jrnVar = irnVar != null ? irnVar.d : null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((asn) next).a.equals(str3));
        asn asnVar = (asn) next;
        boolean z2 = frnVar.g;
        String str6 = frnVar.b;
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        String strA = uf80.a(ux5.a(str6, "_", str3, "_", str4), "_", str5 == null ? "" : str5);
        uoo uooVarN = rqf0.n(z, jrnVar, z2, R.drawable.ic__feature__match_status_won);
        if (Intrinsics.g(str2, strA)) {
            if (!z) {
                i = R.string.bet_history__waiting_to_kick_off;
            } else if (jrnVar == jrn.ONE_X_TWO_ONE_UP) {
                i = R.string.bet_history__1up_early_payout;
            } else if (jrnVar == jrn.ONE_X_TWO_TWO_UP) {
                i = R.string.bet_history__2up_early_payout;
            } else {
                i = z2 ? R.string.bet_history__won : R.string.bet_history__lost;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i);
        } else {
            resourceUiText = null;
        }
        String str7 = asnVar != null ? asnVar.c.a : null;
        if (str7 == null) {
            str7 = "";
        }
        StringUiText stringUiText2 = vch0.a;
        StringUiText stringUiText3 = new StringUiText(str7);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
        ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
        String str8 = asnVar != null ? asnVar.e.a : null;
        Iterator it2 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8 != null ? str8 : "")).iterator();
        if (!it2.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next4 = it2.next();
        while (it2.hasNext()) {
            next4 = ((UiText) next4).h((UiText) it2.next());
        }
        UiText uiText2 = (UiText) next4;
        qeo qeoVarB = z ? reo.b(asnVar != null ? asnVar.g : null) : null;
        if (asnVar != null) {
            Iterator it3 = b.k(new ResourceUiText(R.string.common_functions__league), new StringUiText(": "), new StringUiText(asnVar.b.b)).iterator();
            if (!it3.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next5 = it3.next();
            while (it3.hasNext()) {
                next5 = ((UiText) next5).h((UiText) it3.next());
            }
            uiText = (UiText) next5;
        } else {
            uiText = null;
        }
        Iterator it4 = list3.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((dsn) next2).a.equals(str5));
        dsn dsnVar = (dsn) next2;
        if (dsnVar != null) {
            vrn vrnVar = (vrn) this.a;
            for (Object obj : list2) {
                if (((csn) obj).a.equals(dsnVar.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = vrnVar.b(str, z, jrnVar, list3, (csn) objA, dsnVar);
        } else {
            Iterator it5 = list4.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (!((grn) next3).a.equals(str5));
            grn grnVar = (grn) next3;
            if (grnVar != null) {
                objA = vrn.a(z, list2, list3, grnVar);
            }
        }
        return new voo(strA, uooVarN, resourceUiText, null, uiText2, null, uiText, null, qeoVarB, objA);
    }

    public wrn(vrn vrnVar, reo reoVar, rqf0 rqf0Var) {
        this.a = vrnVar;
    }
}
