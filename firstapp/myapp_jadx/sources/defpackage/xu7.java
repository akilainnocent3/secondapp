package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xu7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ xu7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return w5b.a((CoroutineContext) av7.g.getValue());
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
