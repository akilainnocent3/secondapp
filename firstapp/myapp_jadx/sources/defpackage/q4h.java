package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q4h {
    public static final <T> T a(nan nanVar, p4h.b<T> bVar) {
        T t = (T) nanVar.t.a.get(bVar);
        if (t != null) {
            return t;
        }
        T t2 = (T) nanVar.v.n.a.get(bVar);
        return t2 == null ? bVar.a : t2;
    }

    public static final <T> T b(u2z u2zVar, p4h.b<T> bVar) {
        T t = (T) u2zVar.j.a.get(bVar);
        return t == null ? bVar.a : t;
    }
}
