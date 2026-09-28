package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface r4w extends CoroutineContext.Element {

    public static final class a implements CoroutineContext.a<r4w> {
        public static final /* synthetic */ a a = new a();
    }

    <R> Object P(Function1<? super Long, ? extends R> function1, v1b<? super R> v1bVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.a<?> getKey() {
        return a.a;
    }
}
