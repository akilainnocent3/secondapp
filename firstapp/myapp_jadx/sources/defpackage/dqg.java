package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class dqg implements v5b {
    public final CoroutineContext a;

    public static final class a implements cbs {
        public final /* synthetic */ s9s.a a;
        public final /* synthetic */ dqg b;

        public a(s9s.a aVar, dqg dqgVar) {
            this.a = aVar;
            this.b = dqgVar;
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            if (this.a == aVar) {
                w5b.c(this.b, null);
            }
        }
    }

    public dqg() {
        pfd pfdVar = fse.a;
        this.a = gku.a.h0().plus(lfe0.a());
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dqg(ibs ibsVar, s9s.a aVar) {
        this();
        aVar.getClass();
        ibsVar.getLifecycle().a(new a(aVar, this));
    }
}
