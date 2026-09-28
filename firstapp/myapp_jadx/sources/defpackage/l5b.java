package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public interface l5b extends CoroutineContext.Element {

    public static final class a implements CoroutineContext.a<l5b> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
