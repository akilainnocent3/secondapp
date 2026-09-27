package t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f135915m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f135898e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f135898e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // t0.f
    public void e(int i10) {
        if (this.f135903j) {
            return;
        }
        this.f135903j = true;
        this.f135900g = i10;
        for (d dVar : this.f135904k) {
            dVar.a(dVar);
        }
    }
}
