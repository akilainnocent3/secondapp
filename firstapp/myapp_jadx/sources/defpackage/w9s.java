package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class w9s implements rdd {
    public final mco a;
    public final v9s b = new iu2.b() { // from class: v9s
        @Override // iu2.a
        public final void C() {
            this.a.a.invoke();
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [v9s] */
    public w9s(mco mcoVar) {
        this.a = mcoVar;
    }

    @Override // defpackage.rdd
    public final void o1(ibs ibsVar) {
        iu2.a(this.b);
    }

    @Override // defpackage.rdd
    public final void onDestroy(ibs ibsVar) {
        iu2.q(this.b);
    }
}
