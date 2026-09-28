package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class b4n {
    public static final Pair<String, String> a(List<? extends a4n> list) {
        Pair<String, String> pair;
        Iterator<T> it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            a4n a4nVar = (a4n) it.next();
            if (a4nVar instanceof a4n.b) {
                a4n.b bVar = (a4n.b) a4nVar;
                pair = new Pair<>(bVar.c, bVar.e);
            }
        } while (pair == null);
        return pair;
    }
}
