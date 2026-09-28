package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ufk0 extends gjk0 {
    public final tx0 e;
    public final y4l f;

    public ufk0(dbs dbsVar, y4l y4lVar, v4l v4lVar) {
        super(dbsVar, v4lVar);
        this.e = new tx0(0);
        this.f = y4lVar;
        this.mLifecycleFragment.l("ConnectionlessLifecycleHelper", this);
    }

    @Override // defpackage.x9s
    public final void onResume() {
        super.onResume();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // defpackage.gjk0, defpackage.x9s
    public final void onStart() {
        super.onStart();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // defpackage.gjk0, defpackage.x9s
    public final void onStop() {
        super.onStop();
        y4l y4lVar = this.f;
        y4lVar.getClass();
        synchronized (y4l.G) {
            try {
                if (y4lVar.z == this) {
                    y4lVar.z = null;
                    y4lVar.A.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
