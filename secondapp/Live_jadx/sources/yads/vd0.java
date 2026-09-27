package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r91 f156910a;

    public vd0(pf2 pf2Var) {
        float volume = pf2Var.getVolume();
        this.f156910a = volume == 0.0f ? new r91(true, 1.0f) : new r91(false, volume);
    }
}
