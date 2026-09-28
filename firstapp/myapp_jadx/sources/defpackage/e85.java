package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class e85 implements fjt {
    public final AtomicLong a;

    public e85(uqm uqmVar) {
        uqmVar.getClass();
        this.a = new AtomicLong(Long.MIN_VALUE);
        uqmVar.addLogoutEventListener(this);
    }

    @Override // defpackage.fjt
    public final void p() {
        this.a.set(Long.MIN_VALUE);
    }
}
