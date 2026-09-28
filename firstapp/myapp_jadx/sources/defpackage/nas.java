package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class nas extends las implements cbs {
    public final s9s a;
    public final CoroutineContext b;

    public nas(s9s s9sVar, CoroutineContext coroutineContext) {
        s9sVar.getClass();
        coroutineContext.getClass();
        this.a = s9sVar;
        this.b = coroutineContext;
        if (s9sVar.b() == s9s.b.a) {
            i9p.b(coroutineContext, null);
        }
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        s9s s9sVar = this.a;
        if (s9sVar.b().compareTo(s9s.b.a) <= 0) {
            s9sVar.d(this);
            i9p.b(this.b, null);
        }
    }

    @Override // defpackage.las
    public final s9s a() {
        return this.a;
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
