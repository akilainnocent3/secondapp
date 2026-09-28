package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public interface abj<T> extends lyh<T> {

    public static final class a {
        public static /* synthetic */ lyh a(abj abjVar, CoroutineContext coroutineContext, int i, pb5 pb5Var, int i2) {
            if ((i2 & 1) != 0) {
                coroutineContext = e.a;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                pb5Var = pb5.a;
            }
            return abjVar.d(coroutineContext, i, pb5Var);
        }
    }

    lyh<T> d(CoroutineContext coroutineContext, int i, pb5 pb5Var);
}
