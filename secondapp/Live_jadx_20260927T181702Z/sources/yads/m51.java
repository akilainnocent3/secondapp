package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m51 extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p51 f152328d;

    public m51(int i10, p51 p51Var) {
        super(p51Var.size(), i10);
        this.f152328d = p51Var;
    }

    @Override // yads.f
    public final Object a(int i10) {
        return this.f152328d.get(i10);
    }
}
