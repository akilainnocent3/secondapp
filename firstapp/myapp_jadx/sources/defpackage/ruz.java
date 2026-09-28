package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ruz implements qua {
    public final xp60 a;
    public final String b;
    public final Function2<Function1<? super v1b<Object>, ? extends Object>, v1b<Object>, Object> c;
    public final mpe0 d = hwr.b(new quz(this, 0));

    public static final class a implements CoroutineContext.Element {
        public static final C1065a b = new C1065a();
        public final luz a;

        /* JADX INFO: renamed from: ruz$a$a, reason: collision with other inner class name */
        public static final class C1065a implements CoroutineContext.a<a> {
        }

        public a(luz luzVar) {
            this.a = luzVar;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return function2.invoke(r, this);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
            return (E) CoroutineContext.Element.a.b(this, aVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public final CoroutineContext.a<a> getKey() {
            return b;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
            return CoroutineContext.Element.a.c(this, aVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(this, coroutineContext);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ruz(xp60 xp60Var, String str, Function2<? super Function1<? super v1b<Object>, ? extends Object>, ? super v1b<Object>, ? extends Object> function2) {
        this.a = xp60Var;
        this.b = str;
        this.c = function2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        mpe0 mpe0Var = this.d;
        if (mpe0Var.a()) {
            ((vp60) mpe0Var.getValue()).close();
        }
    }

    @Override // defpackage.qua
    public final Object w0(boolean z, Function2 function2, x1b x1bVar) {
        a aVar = (a) x1bVar.getContext().get(a.b);
        luz luzVar = aVar != null ? aVar.a : null;
        if (luzVar != null) {
            return function2.invoke(luzVar, x1bVar);
        }
        luz luzVar2 = new luz(this.c, (vp60) this.d.getValue());
        return ej5.d(new a(luzVar2), new suz(function2, luzVar2, null), x1bVar);
    }
}
