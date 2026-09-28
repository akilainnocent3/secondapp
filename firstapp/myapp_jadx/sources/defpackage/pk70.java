package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pk70 {
    public final cmo a;

    public pk70(cmo cmoVar) {
        this.a = cmoVar;
    }

    public final vmo a(String str, sj70 sj70Var, List list, vk70 vk70Var, wk70 wk70Var) {
        int i;
        gno.a aVar;
        list.getClass();
        int iOrdinal = sj70Var.ordinal();
        if (iOrdinal == 0) {
            i = R.color.bg_surface_primary;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                uhc.a();
                return null;
            }
            i = R.color.bg_surface_primary;
        } else {
            i = R.color.bg_brand_sub_secondary_d_darker;
        }
        int iOrdinal2 = sj70Var.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                Integer numB = this.a.b(str);
                aVar = numB != null ? new gno.a(numB.intValue(), R.color.icon_brand_sub_primary_d_base) : null;
            } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                uhc.a();
                return null;
            }
        }
        String strA = uf80.a(new StringBuilder(wk70Var.c), " @", gky.a.a(bjb0.L(wk70Var.b, Locale.US), false));
        int iOrdinal3 = sj70Var.ordinal();
        String strA0 = "--";
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1 || iOrdinal3 == 2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    wk70 wk70Var2 = (wk70) obj;
                    if (wk70Var2.d.equals(vk70Var != null ? vk70Var.a : null) && wk70Var2.e) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!StringsKt.U(((wk70) obj2).c)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                if (arrayList3 != null) {
                    strA0 = CollectionsKt.a0(arrayList3, "\n", null, null, new ok70(0), 30);
                }
            } else if (iOrdinal3 != 3) {
                uhc.a();
                return null;
            }
        }
        String str2 = vk70Var != null ? vk70Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return new vmo(i, aVar, new poo(strA, str2, strA0), null);
    }
}
