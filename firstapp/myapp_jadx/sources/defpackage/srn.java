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
public final class srn {
    public final lrn a;
    public final vrn b;

    public srn(lrn lrnVar, vrn vrnVar, reo reoVar, rqf0 rqf0Var) {
        this.a = lrnVar;
        this.b = vrnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1, types: [koo] */
    public final voo a(String str, boolean z, List<asn> list, List<csn> list2, List<dsn> list3, List<grn> list4, String str2, irn irnVar, int i, boolean z2, String str3) {
        Object objA;
        Object next;
        Object next2;
        Object next3;
        Boolean boolValueOf;
        ResourceUiText resourceUiText;
        UiText uiText;
        Object next4;
        Object next5;
        int i2;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        irnVar.getClass();
        String str4 = irnVar.a;
        String str5 = irnVar.b;
        String str6 = irnVar.c;
        jrn jrnVar = irnVar.d;
        Iterator it = list.iterator();
        do {
            objA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((asn) next).a.equals(str4));
        asn asnVar = (asn) next;
        Iterator it2 = list3.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((dsn) next2).a.equals(str6));
        dsn dsnVar = (dsn) next2;
        if (dsnVar != null) {
            boolValueOf = Boolean.valueOf(dsnVar.e);
        } else {
            Iterator it3 = list4.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!((grn) next3).a.equals(str6));
            grn grnVar = (grn) next3;
            boolValueOf = grnVar != null ? Boolean.valueOf(grnVar.c) : null;
        }
        boolean zG = Intrinsics.g(boolValueOf, Boolean.TRUE);
        String strA = uf80.a(ux5.a(str2, "_", str4, "_", str5), "_", str6);
        uoo uooVarN = rqf0.n(z, jrnVar, zG, R.drawable.ic__feature__match_status_won);
        if (Intrinsics.g(str3, strA)) {
            if (!z) {
                i2 = R.string.bet_history__waiting_to_kick_off;
            } else if (jrnVar == jrn.ONE_X_TWO_ONE_UP) {
                i2 = R.string.bet_history__1up_early_payout;
            } else if (jrnVar == jrn.ONE_X_TWO_TWO_UP) {
                i2 = R.string.bet_history__2up_early_payout;
            } else {
                i2 = zG ? R.string.bet_history__won : R.string.bet_history__lost;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i2);
        } else {
            resourceUiText = null;
        }
        String strValueOf = z2 ? String.valueOf(i + 1) : null;
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
        Iterator it4 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8 != null ? str8 : "")).iterator();
        if (!it4.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next6 = it4.next();
        while (it4.hasNext()) {
            next6 = ((UiText) next6).h((UiText) it4.next());
        }
        UiText uiText2 = (UiText) next6;
        qeo qeoVarB = z ? reo.b(asnVar != null ? asnVar.g : null) : null;
        if (asnVar != null) {
            Iterator it5 = b.k(new ResourceUiText(R.string.common_functions__league), new StringUiText(": "), new StringUiText(asnVar.b.b)).iterator();
            if (!it5.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next7 = it5.next();
            while (it5.hasNext()) {
                next7 = ((UiText) next7).h((UiText) it5.next());
            }
            uiText = (UiText) next7;
        } else {
            uiText = null;
        }
        Iterator it6 = list3.iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!((dsn) next4).a.equals(str6));
        dsn dsnVar2 = (dsn) next4;
        if (dsnVar2 != null) {
            for (Object obj : list2) {
                if (((csn) obj).a.equals(dsnVar2.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = this.b.b(str, z, jrnVar, list3, (csn) objA, dsnVar2);
        } else {
            Iterator it7 = list4.iterator();
            do {
                if (!it7.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it7.next();
            } while (!((grn) next5).a.equals(str6));
            grn grnVar2 = (grn) next5;
            if (grnVar2 != null) {
                objA = vrn.a(z, list2, list3, grnVar2);
            }
        }
        return new voo(strA, uooVarN, resourceUiText, strValueOf, uiText2, null, uiText, null, qeoVarB, objA);
    }
}
