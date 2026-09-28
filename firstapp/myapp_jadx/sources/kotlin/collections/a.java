package kotlin.collections;

import defpackage.ngs;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class a {
    public static ngs a(List list) {
        list.getClass();
        ngs ngsVar = (ngs) list;
        ngsVar.h();
        ngsVar.c = true;
        return ngsVar.b > 0 ? ngsVar : ngs.e;
    }

    public static ngs b() {
        return new ngs(0, 1, null);
    }

    public static <T> List<T> c(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static <T> List<T> d(Iterable<? extends T> iterable) {
        iterable.getClass();
        List<T> listJ = CollectionsKt___CollectionsKt.J(iterable);
        Collections.shuffle(listJ);
        return listJ;
    }

    public static List e(Iterable iterable, SecureRandom secureRandom) {
        iterable.getClass();
        secureRandom.getClass();
        List listJ = CollectionsKt___CollectionsKt.J(iterable);
        Collections.shuffle(listJ, secureRandom);
        return listJ;
    }
}
