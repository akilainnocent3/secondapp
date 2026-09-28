package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class omh0 {
    public static final LinkedHashMap a(String str, List list) {
        list.getClass();
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
            return linkedHashMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
