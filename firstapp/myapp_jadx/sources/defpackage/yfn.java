package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public interface yfn extends CoroutineContext.Element {

    public static final class a implements CoroutineContext.a<yfn> {
        public static final /* synthetic */ a a = new a();
    }

    Object b0();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.a<?> getKey() {
        return a.a;
    }
}
