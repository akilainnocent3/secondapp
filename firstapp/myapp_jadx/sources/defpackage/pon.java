package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pon {
    public final cmo a;

    public pon(cmo cmoVar, rqf0 rqf0Var) {
        this.a = cmoVar;
    }

    public final vmo a(String str, boolean z, List list, won wonVar, xon xonVar) {
        Integer numB;
        list.getClass();
        boolean z2 = xonVar.e;
        int iA = rqf0.a(null, z2);
        gno.a aVar = (!z2 || (numB = this.a.b(str)) == null) ? null : new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base);
        int i = 0;
        String strA = uf80.a(new StringBuilder(xonVar.c), " @", gky.a.a(bjb0.L(xonVar.b, Locale.US), false));
        String strA0 = "--";
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                xon xonVar2 = (xon) obj;
                if (xonVar2.d.equals(wonVar != null ? wonVar.a : null) && xonVar2.e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!StringsKt.U(((xon) obj2).c)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList3 != null) {
                strA0 = CollectionsKt.a0(arrayList3, "\n", null, null, new oon(), 30);
            }
        }
        String str2 = wonVar != null ? wonVar.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return new vmo(iA, aVar, new poo(strA, str2, strA0), null);
    }
}
