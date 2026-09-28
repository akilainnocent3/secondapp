package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes5.dex */
public final class oq6 extends a implements l5b {
    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.e(th);
    }
}
