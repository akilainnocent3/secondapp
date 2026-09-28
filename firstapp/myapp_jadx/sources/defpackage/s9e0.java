package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class s9e0 {
    public static final s9e0 a = new s9e0();

    public static String a(String str) {
        if (str == null || !(!StringsKt.U(str))) {
            return null;
        }
        return str;
    }

    public static nk0 b(String str) {
        str.getClass();
        int i = nk0.e;
        return jnm.a(c.p(c.p(str, "<p>", "", false), "</p>", "", false));
    }

    public static String[] c(String str) {
        Collection collectionT0;
        str.getClass();
        List listH = new Regex("\\^").h(str);
        if (listH.isEmpty()) {
            collectionT0 = m2g.a;
        } else {
            ListIterator listIterator = listH.listIterator(listH.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                }
            }
            collectionT0 = m2g.a;
        }
        return (String[]) collectionT0.toArray(new String[0]);
    }
}
