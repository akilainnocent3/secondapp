package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kzh {
    public static final Object a(lyh<?> lyhVar, v1b<? super Unit> v1bVar) {
        Object objCollect = lyhVar.collect(gyx.a, v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }

    public static final <T> Object b(lyh<? extends T> lyhVar, Function2<? super T, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        Object objA = a(ozh.b(r0i.d(lyhVar, function2), 0, 2), v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    public static final <T> Object c(myh<? super T> myhVar, lyh<? extends T> lyhVar, v1b<? super Unit> v1bVar) {
        h99.a(myhVar);
        Object objCollect = lyhVar.collect(myhVar, v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }

    public static final jvd0 d(lyh lyhVar, v5b v5bVar) {
        return ej5.c(v5bVar, null, null, new jzh(lyhVar, null), 3);
    }
}
