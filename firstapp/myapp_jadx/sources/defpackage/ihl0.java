package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ihl0 implements Runnable {
    public final /* synthetic */ khl0 a;

    public ihl0(khl0 khl0Var) {
        Objects.requireNonNull(khl0Var);
        this.a = khl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j = null;
    }
}
