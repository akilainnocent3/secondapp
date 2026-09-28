package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface ao8 {
    default <T> T a(Class<T> cls) {
        return (T) d(bb30.a(cls));
    }

    <T> n730<Set<T>> b(bb30<T> bb30Var);

    <T> n730<T> c(bb30<T> bb30Var);

    default <T> T d(bb30<T> bb30Var) {
        n730<T> n730VarC = c(bb30Var);
        if (n730VarC == null) {
            return null;
        }
        return n730VarC.get();
    }

    default <T> Set<T> e(bb30<T> bb30Var) {
        return b(bb30Var).get();
    }

    default <T> n730<T> f(Class<T> cls) {
        return c(bb30.a(cls));
    }

    <T> njd<T> g(bb30<T> bb30Var);
}
