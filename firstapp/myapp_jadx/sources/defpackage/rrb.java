package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class rrb implements zde0<f1e0> {
    public final /* synthetic */ qrb a;
    public final /* synthetic */ brb b;

    public rrb(qrb qrbVar, brb brbVar) {
        this.a = qrbVar;
        this.b = brbVar;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (bee0Var != null) {
            bee0Var.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        this.a.b.a(new arb(this.b, null, 2));
    }

    @Override // defpackage.zde0
    public final void onNext(f1e0 f1e0Var) {
        f1e0 f1e0Var2 = f1e0Var;
        if (f1e0Var2 != null) {
            b390 b390Var = this.a.b;
            String str = f1e0Var2.c;
            str.getClass();
            b390Var.a(new arb(this.b, str, 4));
        }
    }

    @Override // defpackage.zde0
    public final void onComplete() {
    }
}
