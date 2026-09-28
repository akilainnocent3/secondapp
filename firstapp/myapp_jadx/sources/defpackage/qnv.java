package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class qnv<T> {

    public static final class a<T> extends qnv<T> {
        public final Function2<T, v1b<? super T>, Object> a;
        public final dm8 b;
        public final swd0<T> c;
        public final CoroutineContext d;

        public a(Function2 function2, dm8 dm8Var, swd0 swd0Var, CoroutineContext coroutineContext) {
            coroutineContext.getClass();
            this.a = function2;
            this.b = dm8Var;
            this.c = swd0Var;
            this.d = coroutineContext;
        }
    }
}
