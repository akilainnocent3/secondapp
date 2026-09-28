package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
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
public final class qon {
    public final pon a;

    public qon(pon ponVar, rqf0 rqf0Var) {
        this.a = ponVar;
    }

    public final nno a(boolean z, List<xon> list, fon fonVar, boolean z2, Set<String> set) {
        Object next;
        list.getClass();
        fonVar.getClass();
        boolean z3 = fonVar.g;
        String str = fonVar.b;
        gon gonVar = (gon) CollectionsKt.firstOrNull(fonVar.h);
        String str2 = gonVar != null ? gonVar.c : null;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((xon) next).a.equals(str2));
        xon xonVar = (xon) next;
        String strA = gky.a.a(bjb0.L(xonVar != null ? xonVar.b : BigDecimal.ZERO, Locale.US), false);
        boolean zContains = set.contains(str);
        StringUiText stringUiText = vch0.a;
        Integer numValueOf = null;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__single);
        if (z3) {
            numValueOf = Integer.valueOf(R.drawable.ic__feature__won);
        }
        return new nno(str, zContains, resourceUiText, numValueOf, rqf0.c(z, z3), rqf0.m(fonVar.d, z, z3), rqf0.p(fonVar.c), strA, null, rqf0.v(fonVar.e), z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [koo] */
    public final voo b(String str, boolean z, List<uon> list, List<won> list2, List<xon> list3, fon fonVar, String str2) {
        Object next;
        ResourceUiText resourceUiText;
        UiText uiText;
        Object next2;
        int i;
        Integer numValueOf = Integer.valueOf(R.color.text_secondary);
        Integer numValueOf2 = Integer.valueOf(R.color.text_tertiary);
        list.getClass();
        list2.getClass();
        list3.getClass();
        fonVar.getClass();
        gon gonVar = (gon) CollectionsKt.firstOrNull(fonVar.h);
        Object objA = null;
        String str3 = gonVar != null ? gonVar.a : null;
        String str4 = gonVar != null ? gonVar.b : null;
        String str5 = gonVar != null ? gonVar.c : null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((uon) next).a.equals(str3));
        uon uonVar = (uon) next;
        boolean z2 = fonVar.g;
        String str6 = fonVar.b;
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
                i = R.string.bet_history__waiting_to_start_game;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i);
        } else {
            resourceUiText = null;
        }
        String str7 = uonVar != null ? uonVar.c.a : null;
        if (str7 == null) {
            str7 = "";
        }
        StringUiText stringUiText2 = vch0.a;
        StringUiText stringUiText3 = new StringUiText(str7);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.app_common__blank_space);
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.bet_history__vs);
        ResourceUiText resourceUiText4 = new ResourceUiText(R.string.app_common__blank_space);
        String str8 = uonVar != null ? uonVar.e.a : null;
        if (str8 == null) {
            str8 = "";
        }
        Iterator it2 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8)).iterator();
        if (!it2.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next3 = it2.next();
        while (it2.hasNext()) {
            next3 = ((UiText) next3).h((UiText) it2.next());
        }
        UiText uiText2 = (UiText) next3;
        if (z) {
            String strA2 = cqg.a(uonVar != null ? uonVar.g : null);
            ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(R.string.bet_history__final_score), numValueOf2, null);
            ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.app_common__blank_space), numValueOf2, null);
            String str9 = uonVar != null ? uonVar.d : null;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = uonVar != null ? uonVar.f : null;
            Iterator it3 = b.k(coloredUiText, coloredUiText2, new ColoredUiText(new ResourceUiText(R.string.app_common__colon_placeholder, ay0.S(new Object[]{str9, str10 != null ? str10 : ""})), numValueOf2, null), new ColoredUiText(new StringUiText(" | "), numValueOf, null), new ColoredUiText(new StringUiText(strA2), numValueOf, null)).iterator();
            if (!it3.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next4 = it3.next();
            while (it3.hasNext()) {
                next4 = ((UiText) next4).h((UiText) it3.next());
            }
            uiText = (UiText) next4;
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
        } while (!((xon) next2).a.equals(str5));
        xon xonVar = (xon) next2;
        if (xonVar != null) {
            for (Object obj : list2) {
                if (((won) obj).a.equals(xonVar.d)) {
                    objA = obj;
                    break;
                }
            }
            objA = this.a.a(str, z, list3, (won) objA, xonVar);
        }
        return new voo(strA, uooVarN, resourceUiText, null, uiText2, uiText, null, null, null, objA);
    }
}
