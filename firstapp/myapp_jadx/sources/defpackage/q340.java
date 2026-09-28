package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface q340 extends hoa {
    @Override // defpackage.hoa
    default Set<hoa.b> a(hoa.a<?> aVar) {
        return l().a(aVar);
    }

    @Override // defpackage.hoa
    default <ValueT> ValueT b(hoa.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) l().b(aVar, valuet);
    }

    @Override // defpackage.hoa
    default Set<hoa.a<?>> c() {
        return l().c();
    }

    @Override // defpackage.hoa
    default <ValueT> ValueT d(hoa.a<ValueT> aVar) {
        return (ValueT) l().d(aVar);
    }

    @Override // defpackage.hoa
    default boolean e(hoa.a<?> aVar) {
        return l().e(aVar);
    }

    @Override // defpackage.hoa
    default hoa.b f(hoa.a<?> aVar) {
        return l().f(aVar);
    }

    @Override // defpackage.hoa
    default <ValueT> ValueT g(hoa.a<ValueT> aVar, hoa.b bVar) {
        return (ValueT) l().g(aVar, bVar);
    }

    @Override // defpackage.hoa
    default void h(gf6 gf6Var) {
        l().h(gf6Var);
    }

    hoa l();
}
