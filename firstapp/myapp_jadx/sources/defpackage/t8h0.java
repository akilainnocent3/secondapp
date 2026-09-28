package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t8h0 {
    public final ArrayList a;
    public final ArrayList b;

    public static final class a {
        public static t8h0 a(CountryCodeName countryCodeName) {
            List<p8h0> list = p8h0.d;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (p8h0 p8h0Var : list) {
                arrayList.add(new u8h0(p8h0Var.b, p8h0Var.a));
            }
            List<i0h0> list2 = i0h0.c;
            List<i0h0> listA = i0h0.a.a(countryCodeName);
            ArrayList arrayList2 = new ArrayList(l48.r(listA, 10));
            for (i0h0 i0h0Var : listA) {
                arrayList2.add(new u8h0(i0h0Var.b, String.valueOf(i0h0Var.a)));
            }
            return new t8h0(arrayList, arrayList2);
        }
    }

    public t8h0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final UiText a(Integer num, String str, String str2, String str3) {
        Object next;
        Object obj;
        Object obj2;
        Iterator<T> it = p8h0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((p8h0) next).a, str));
        p8h0 p8h0Var = (p8h0) next;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!Intrinsics.g(((u8h0) obj).a, str));
        u8h0 u8h0Var = (u8h0) obj;
        UiText uiText = u8h0Var != null ? u8h0Var.b : null;
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        int i2 = 0;
        do {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList2.get(i2);
            i2++;
        } while (!Intrinsics.g(((u8h0) obj2).a, String.valueOf(num)));
        u8h0 u8h0Var2 = (u8h0) obj2;
        UiText stringUiText = u8h0Var2 != null ? u8h0Var2.b : null;
        if (stringUiText == null || stringUiText.equals(vch0.a)) {
            itf0.a aVar = itf0.a;
            aVar.q("TxTypeUiTextMaps");
            aVar.a("cannot find text for bizTypeCode:" + num + " in bizTypeUiTextMap", new Object[0]);
            stringUiText = str2 != null ? new StringUiText(str2) : null;
        }
        if (uiText == null) {
            return new ResourceUiText(R.string.app_common__no_cash);
        }
        if (p8h0Var == null || !p8h0Var.c || stringUiText == null) {
            return uiText;
        }
        StringUiText stringUiText2 = new StringUiText(" - ");
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                stringUiText = new StringUiText(str3);
            }
        }
        return new ConcatUiText(new UiText[]{uiText, stringUiText2, stringUiText});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8h0)) {
            return false;
        }
        t8h0 t8h0Var = (t8h0) obj;
        return this.a.equals(t8h0Var.a) && this.b.equals(t8h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TxTypeUiTextMaps(tradeCodeUiTextMap=" + this.a + ", bizTypeUiTextMap=" + this.b + ")";
    }
}
