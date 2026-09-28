package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class av7 {
    public static final a a = new a(l5b.a.a);
    public static final kfe0 b = lfe0.a();
    public static final pfd c = fse.a;
    public static final mpe0 d = hwr.b(new ru7());
    public static final mpe0 e = hwr.b(new tu7());
    public static final odd f = odd.b;
    public static final mpe0 g = hwr.b(new vu7());

    static {
        hwr.b(new xu7(0));
    }

    public static void a(k5b k5bVar, Function2 function2) {
        mpe0 mpe0Var = e;
        ej5.a(k5bVar == null ? (v5b) mpe0Var.getValue() : new j1b(((v5b) mpe0Var.getValue()).getCoroutineContext().plus(k5bVar)), null, function2, 3);
    }

    public static final class a extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }
}
