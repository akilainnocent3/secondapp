package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public interface o5w extends CoroutineContext.Element {

    public static final class a implements CoroutineContext.a<o5w> {
        public static final /* synthetic */ a a = new a();
    }

    float g();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.a<?> getKey() {
        return a.a;
    }
}
