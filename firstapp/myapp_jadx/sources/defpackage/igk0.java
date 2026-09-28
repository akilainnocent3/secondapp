package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class igk0 implements Runnable {
    public final /* synthetic */ jgk0 a;

    public igk0(jgk0 jgk0Var) {
        this.a = jgk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sl0.f fVar = this.a.a.b;
        fVar.b(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
