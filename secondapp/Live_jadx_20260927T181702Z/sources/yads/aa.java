package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aa implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da f146708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ga f146709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ea f146710c;

    public aa(da daVar, ga gaVar, vd3 vd3Var) {
        this.f146708a = daVar;
        this.f146709b = gaVar;
        daVar.a(this);
        daVar.a(vd3Var);
    }

    @Override // yads.ea
    public final void a() {
        ga gaVar = this.f146709b;
        fa faVar = fa.f149031f;
        synchronized (gaVar) {
            gaVar.f149492a = faVar;
        }
        ea eaVar = this.f146710c;
        if (eaVar != null) {
            eaVar.a();
        }
    }

    @Override // yads.ea
    public final void b() {
        ga gaVar = this.f146709b;
        fa faVar = fa.f149028c;
        synchronized (gaVar) {
            gaVar.f149492a = faVar;
        }
        ea eaVar = this.f146710c;
        if (eaVar != null) {
            eaVar.b();
        }
    }

    @Override // yads.ea
    public final void c() {
        ga gaVar = this.f146709b;
        fa faVar = fa.f149030e;
        synchronized (gaVar) {
            gaVar.f149492a = faVar;
        }
        ea eaVar = this.f146710c;
        if (eaVar != null) {
            eaVar.c();
        }
    }

    public final void d() {
        fa faVar;
        ga gaVar = this.f146709b;
        synchronized (gaVar) {
            faVar = gaVar.f149492a;
        }
        int iOrdinal = faVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            this.f146708a.f();
        }
    }

    public final void e() {
        fa faVar;
        ea eaVar;
        ga gaVar = this.f146709b;
        synchronized (gaVar) {
            faVar = gaVar.f149492a;
        }
        int iOrdinal = faVar.ordinal();
        if (iOrdinal == 0) {
            this.f146708a.prepare();
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 4 && (eaVar = this.f146710c) != null) {
                eaVar.a();
                return;
            }
            return;
        }
        ea eaVar2 = this.f146710c;
        if (eaVar2 != null) {
            eaVar2.b();
        }
    }

    public final void f() {
        fa faVar;
        ea eaVar;
        ga gaVar = this.f146709b;
        synchronized (gaVar) {
            faVar = gaVar.f149492a;
        }
        int iOrdinal = faVar.ordinal();
        if (iOrdinal == 0) {
            this.f146708a.prepare();
            return;
        }
        if (iOrdinal == 2) {
            this.f146708a.resume();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4 && (eaVar = this.f146710c) != null) {
                eaVar.a();
                return;
            }
            return;
        }
        ea eaVar2 = this.f146710c;
        if (eaVar2 != null) {
            eaVar2.c();
        }
    }
}
