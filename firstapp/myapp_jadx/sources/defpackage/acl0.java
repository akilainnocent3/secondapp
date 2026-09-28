package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class acl0 implements Executor {
    public final /* synthetic */ nfl0 a;

    public acl0(nfl0 nfl0Var) {
        this.a = nfl0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p7l0 p7l0Var = this.a.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(runnable);
    }
}
