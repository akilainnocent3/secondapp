package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f153002b;

    public nd(od odVar) {
        this.f153002b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f153002b.f153446c;
        if (pdVar != null) {
            ((vc) pdVar).f156900a.f157775d.removeCallbacksAndMessages(null);
        }
    }
}
