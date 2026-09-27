package yads;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zi3 implements uj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta f158859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg2 f158860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jh3 f158861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf2 f158862d;

    public zi3(ta taVar, kg2 kg2Var, jh3 jh3Var, kf2 kf2Var) {
        this.f158859a = taVar;
        this.f158860b = kg2Var;
        this.f158861c = jh3Var;
        this.f158862d = kf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // yads.uj2
    public final fe2 a() {
        long jA;
        kg2 kg2Var = this.f158860b;
        ig2 ig2Var = kg2Var.f151535a;
        cf2 cf2Var = kg2Var.f151536b;
        if (ig2Var != null) {
            jA = ig2Var.a();
        } else if (cf2Var != null) {
            Collection collectionValues = this.f158859a.f155794b.values();
            if (collectionValues.contains(t81.f155759d) || collectionValues.contains(t81.f155760e) || this.f158862d.f151524c) {
                jA = -1;
            } else {
                jA = cf2Var.a();
            }
        } else {
            jA = -1;
        }
        long j10 = this.f158861c.f151104a;
        return new fe2(jA, j10 != -9223372036854775807L ? j10 : -1L);
    }
}
