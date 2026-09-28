package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public final class r8i {
    public static final a c = new a(l5b.a.a);
    public final z01 a;
    public final j1b b;

    public r8i(z01 z01Var) {
        e eVar = e.a;
        this.a = z01Var;
        CoroutineContext coroutineContextPlus = c.plus(ese.a).plus(eVar);
        eVar.getClass();
        this.b = w5b.a(coroutineContextPlus.plus(new kfe0(null)));
    }

    public static final class a extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }
}
