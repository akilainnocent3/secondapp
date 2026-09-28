package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class oak0 implements fjt {
    public final AtomicBoolean a;

    public oak0(uqm uqmVar) {
        uqmVar.getClass();
        this.a = new AtomicBoolean(false);
        uqmVar.addLogoutEventListener(this);
    }

    @Override // defpackage.fjt
    public final void p() {
        this.a.set(false);
    }
}
