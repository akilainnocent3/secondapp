package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.text.c;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class l480 {
    public static final boolean a(HttpUrl httpUrl, List list) {
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c.k(httpUrl.encodedPath(), (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
