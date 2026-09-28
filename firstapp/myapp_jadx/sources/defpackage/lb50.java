package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb50 {
    public final s4f0 a;
    public final m4f0 b;
    public final nv5.d c;
    public final nv5.d d;
    public final nv5.a<Void> e;
    public final nv5.a<Void> f;
    public boolean g = false;
    public boolean h = false;
    public pw6 i;

    public lb50(s4f0 s4f0Var, m4f0 m4f0Var) {
        this.a = s4f0Var;
        this.b = m4f0Var;
        nv5.a<Void> aVar = new nv5.a<>();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        try {
            this.e = aVar;
            aVar.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            dVar.a(e);
        }
        this.c = dVar;
        nv5.a<Void> aVar2 = new nv5.a<>();
        nv5.d<T> dVar2 = new nv5.d<>(aVar2);
        aVar2.b = dVar2;
        try {
            this.f = aVar2;
            aVar2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            dVar2.a(e2);
        }
        this.d = dVar2;
    }

    public final void a() {
        s4f0 s4f0Var = this.a;
        if (!s4f0Var.m() || s4f0Var.l()) {
            if (!s4f0Var.m()) {
                km20.g("The callback can only complete once.", !this.d.b.isDone());
            }
            this.f.b(null);
        }
    }

    public final void b() {
        kpf0.a();
        if (this.g || this.h) {
            return;
        }
        this.h = true;
    }
}
