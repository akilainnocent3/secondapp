package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class bs0 implements rdd {
    public final str<iwf0> a;
    public final str<wtf0> b;
    public final str<wp6> c;

    public bs0(str<iwf0> strVar, str<wtf0> strVar2, str<wp6> strVar3) {
        this.a = strVar;
        this.b = strVar2;
        this.c = strVar3;
    }

    @Override // defpackage.rdd
    public final void onPause(ibs ibsVar) {
        iwf0 iwf0Var = this.a.get();
        if (iwf0Var.c()) {
            iwf0Var.a();
        }
        wtf0 wtf0Var = this.b.get();
        if (wtf0Var.c()) {
            wtf0Var.a();
        }
        wp6 wp6Var = this.c.get();
        wp6Var.getClass();
        wp6Var.d(false);
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        iwf0 iwf0Var = this.a.get();
        if (iwf0Var.c()) {
            iwf0Var.b();
        }
        wtf0 wtf0Var = this.b.get();
        if (wtf0Var.c()) {
            wtf0Var.b();
        }
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        this.c.get().a();
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        this.c.get().d(true);
    }
}
