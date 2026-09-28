package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class zu7 {
    public static final a a = new a(l5b.a.a);
    public static final kfe0 b = lfe0.a();
    public static final pfd c = fse.a;
    public static final mpe0 d = hwr.b(new su7());
    public static final mpe0 e = hwr.b(new uu7());
    public static final odd f = odd.b;
    public static final mpe0 g = hwr.b(new wu7());
    public static final mpe0 h = hwr.b(new yu7());

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ASYNC);
            aVar.e(th);
        }
    }

    public static v5b a() {
        return (v5b) h.getValue();
    }

    public static v5b b(k5b k5bVar) {
        mpe0 mpe0Var = e;
        return k5bVar == null ? (v5b) mpe0Var.getValue() : new j1b(((v5b) mpe0Var.getValue()).getCoroutineContext().plus(k5bVar));
    }
}
