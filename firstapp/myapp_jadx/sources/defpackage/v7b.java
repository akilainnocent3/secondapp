package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v7b {
    public static final CountryCodeName[] b;
    public final cbg a;

    static {
        List listSplit$default = StringsKt__StringsKt.split$default("tz", new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(CountryCodeName.INSTANCE.fromCode(StringsKt.t0((String) obj2).toString()));
        }
        b = (CountryCodeName[]) arrayList2.toArray(new CountryCodeName[0]);
    }

    public v7b(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
    }

    public final boolean a(String str) {
        str.getClass();
        this.a.b();
        CountryCodeName countryCodeNameFromCodeNullable = CountryCodeName.INSTANCE.fromCodeNullable(str);
        if (countryCodeNameFromCodeNullable == null) {
            return false;
        }
        return ay0.s(countryCodeNameFromCodeNullable, b);
    }
}
