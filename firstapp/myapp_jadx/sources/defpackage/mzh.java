package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class mzh<T> implements myh {
    public final /* synthetic */ Object a;

    public mzh(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        this.a.add(t);
        return Unit.a;
    }
}
