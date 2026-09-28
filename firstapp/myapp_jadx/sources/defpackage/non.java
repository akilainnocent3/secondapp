package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class non {
    public final rl9 a;
    public final pon b;

    public non(rl9 rl9Var, pon ponVar, rqf0 rqf0Var) {
        this.a = rl9Var;
        this.b = ponVar;
    }

    public final voo a(String str, boolean z, List<uon> list, List<won> list2, List<xon> list3, String str2, gon gonVar, int i, boolean z2, String str3) {
        Object next;
        Object next2;
        ResourceUiText resourceUiText;
        UiText uiText;
        Object next3;
        vmo vmoVarA;
        Object obj;
        int i2;
        Integer numValueOf = Integer.valueOf(R.color.text_secondary);
        Integer numValueOf2 = Integer.valueOf(R.color.text_tertiary);
        list.getClass();
        list2.getClass();
        list3.getClass();
        gonVar.getClass();
        String str4 = gonVar.a;
        String str5 = gonVar.b;
        String str6 = gonVar.c;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((uon) next).a.equals(str4));
        uon uonVar = (uon) next;
        Iterator<T> it2 = list3.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((xon) next2).a.equals(str6));
        xon xonVar = (xon) next2;
        boolean z3 = xonVar != null && xonVar.e;
        String strA = uf80.a(ux5.a(str2, "_", str4, "_", str5), "_", str6);
        uoo uooVarN = rqf0.n(z, null, z3, R.drawable.ic__feature__match_status_won);
        if (Intrinsics.g(str3, strA)) {
            if (z) {
                jrn.a aVar = jrn.b;
                i2 = z3 ? R.string.bet_history__won : R.string.bet_history__lost;
            } else {
                i2 = R.string.bet_history__waiting_to_start_game;
            }
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i2);
        } else {
            resourceUiText = null;
        }
        String strValueOf = z2 ? String.valueOf(i + 1) : null;
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
        Iterator it3 = b.k(stringUiText3, resourceUiText2, resourceUiText3, resourceUiText4, new StringUiText(str8)).iterator();
        if (!it3.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next4 = it3.next();
        while (it3.hasNext()) {
            next4 = ((UiText) next4).h((UiText) it3.next());
        }
        UiText uiText2 = (UiText) next4;
        if (z) {
            String strA2 = cqg.a(uonVar != null ? uonVar.g : null);
            ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(R.string.bet_history__final_score), numValueOf2, null);
            ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.app_common__blank_space), numValueOf2, null);
            String str9 = uonVar != null ? uonVar.d : null;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = uonVar != null ? uonVar.f : null;
            Iterator it4 = b.k(coloredUiText, coloredUiText2, new ColoredUiText(new ResourceUiText(R.string.app_common__colon_placeholder, ay0.S(new Object[]{str9, str10 != null ? str10 : ""})), numValueOf2, null), new ColoredUiText(new StringUiText(" | "), numValueOf, null), new ColoredUiText(new StringUiText(strA2), numValueOf, null)).iterator();
            if (!it4.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next5 = it4.next();
            while (it4.hasNext()) {
                next5 = ((UiText) next5).h((UiText) it4.next());
            }
            uiText = (UiText) next5;
        } else {
            uiText = null;
        }
        Iterator<T> it5 = list3.iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!((xon) next3).a.equals(str6));
        xon xonVar2 = (xon) next3;
        if (xonVar2 != null) {
            Iterator<T> it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                Object next6 = it6.next();
                if (((won) next6).a.equals(xonVar2.d)) {
                    obj = next6;
                    break;
                }
            }
            vmoVarA = this.b.a(str, z, list3, (won) obj, xonVar2);
        } else {
            vmoVarA = null;
        }
        return new voo(strA, uooVarN, resourceUiText, strValueOf, uiText2, uiText, null, null, null, vmoVarA);
    }
}
