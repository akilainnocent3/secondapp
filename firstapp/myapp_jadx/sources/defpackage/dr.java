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
public final class dr {
    public final cmo a;

    public dr(cmo cmoVar, rqf0 rqf0Var) {
        this.a = cmoVar;
    }

    public static jmo a(boolean z, List list, List list2, pq pqVar) {
        Object next;
        Object next2;
        list.getClass();
        list2.getClass();
        String strA = gky.a.a(bjb0.L(pqVar.b, Locale.US), false);
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
        List<rq> list3 = pqVar.d;
        ArrayList arrayList = new ArrayList(l48.r(list3, 10));
        for (rq rqVar : list3) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((nr) next).a.equals(rqVar.b));
            nr nrVar = (nr) next;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((lr) next2).a.equals(rqVar.a));
            lr lrVar = (lr) next2;
            String strA0 = "--";
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    nr nrVar2 = (nr) obj;
                    if (nrVar2.d.equals(lrVar != null ? lrVar.a : null) && nrVar2.e) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    if (!StringsKt.U(((nr) obj2).c)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
                if (arrayList4 != null) {
                    strA0 = CollectionsKt.a0(arrayList4, "\n", null, null, new br(0), 30);
                }
            }
            String str = nrVar != null ? nrVar.c : null;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = lrVar != null ? lrVar.b : null;
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new poo(str, str2, strA0));
        }
        return new jmo(a4h.b(arrayList), uiText);
    }

    public final vmo b(String str, boolean z, List list, lr lrVar, nr nrVar) {
        Integer numB;
        list.getClass();
        boolean z2 = nrVar.e;
        int iA = rqf0.a(null, z2);
        gno.a aVar = (!z2 || (numB = this.a.b(str)) == null) ? null : new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
        String strA = uf80.a(new StringBuilder(nrVar.c), " @", gky.a.a(bjb0.L(nrVar.b, Locale.US), false));
        String strA0 = "--";
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                nr nrVar2 = (nr) obj;
                if (nrVar2.d.equals(lrVar != null ? lrVar.a : null) && nrVar2.e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!StringsKt.U(((nr) obj2).c)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList3 != null) {
                strA0 = CollectionsKt.a0(arrayList3, "\n", null, null, new cr(0), 30);
            }
        }
        String str2 = lrVar != null ? lrVar.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return new vmo(iA, aVar, new poo(strA, str2, strA0), null);
    }
}
