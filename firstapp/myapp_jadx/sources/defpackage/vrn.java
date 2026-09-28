package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vrn {
    public final cmo a;

    public vrn(cmo cmoVar, rqf0 rqf0Var) {
        this.a = cmoVar;
    }

    public static jmo a(boolean z, List list, List list2, grn grnVar) {
        Object next;
        Object next2;
        list.getClass();
        list2.getClass();
        String strA = gky.a.a(bjb0.L(grnVar.b, Locale.US), false);
        StringUiText stringUiText = vch0.a;
        Iterator it = b.k(new ResourceUiText(R.string.page_instant_virtual__bet_builder), new StringUiText(" @"), vch0.d(strA)).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next3 = it.next();
        while (it.hasNext()) {
            next3 = ((UiText) next3).h((UiText) it.next());
        }
        UiText uiText = (UiText) next3;
        List<hrn> list3 = grnVar.d;
        ArrayList arrayList = new ArrayList(l48.r(list3, 10));
        for (hrn hrnVar : list3) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((dsn) next).a.equals(hrnVar.b));
            dsn dsnVar = (dsn) next;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((csn) next2).a.equals(hrnVar.a));
            csn csnVar = (csn) next2;
            String strA0 = "--";
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    dsn dsnVar2 = (dsn) obj;
                    if (dsnVar2.d.equals(csnVar != null ? csnVar.a : null) && dsnVar2.e) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    if (!StringsKt.U(((dsn) obj2).c)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
                if (arrayList4 != null) {
                    strA0 = CollectionsKt.a0(arrayList4, "\n", null, null, new trn(0), 30);
                }
            }
            String str = dsnVar != null ? dsnVar.c : null;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = csnVar != null ? csnVar.b : null;
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new poo(str, str2, strA0));
        }
        return new jmo(a4h.b(arrayList), uiText);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    public final vmo b(String str, boolean z, jrn jrnVar, List list, csn csnVar, dsn dsnVar) {
        Integer numB;
        gno aVar;
        loo looVar;
        list.getClass();
        boolean z2 = dsnVar.e;
        int iA = rqf0.a(jrnVar, z2);
        loo looVar2 = null;
        if (!z) {
            aVar = null;
        } else if (jrnVar == jrn.ONE_X_TWO_ONE_UP) {
            aVar = new gno.b(R.drawable.ic__feature__match_status_1up);
        } else if (jrnVar == jrn.ONE_X_TWO_TWO_UP) {
            aVar = new gno.b(R.drawable.ic__feature__match_status_2up);
        } else if (!z2 || (numB = this.a.b(str)) == null) {
            aVar = null;
        } else {
            aVar = new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
        }
        String strA = uf80.a(new StringBuilder(dsnVar.c), " @", gky.a.a(bjb0.L(dsnVar.b, Locale.US), false));
        String strA0 = "--";
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                dsn dsnVar2 = (dsn) obj;
                if (dsnVar2.d.equals(csnVar != null ? csnVar.a : null) && dsnVar2.e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!StringsKt.U(((dsn) obj2).c)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList3 != null) {
                strA0 = CollectionsKt.a0(arrayList3, "\n", null, null, new urn(0), 30);
            }
        }
        String str2 = csnVar != null ? csnVar.b : null;
        if (str2 == null) {
            str2 = "";
        }
        poo pooVar = new poo(strA, str2, strA0);
        if (jrnVar != null) {
            int iOrdinal = jrnVar.ordinal();
            if (iOrdinal == 0) {
                moo mooVar = moo.a;
                StringUiText stringUiText = vch0.a;
                looVar = new loo(mooVar, new ResourceUiText(R.string.bet_history__1up_win_achieved));
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                moo mooVar2 = moo.b;
                StringUiText stringUiText2 = vch0.a;
                looVar = new loo(mooVar2, new ResourceUiText(R.string.bet_history__2up_win_achieved));
            }
            looVar2 = looVar;
        }
        return new vmo(iA, aVar, pooVar, looVar2);
    }
}
