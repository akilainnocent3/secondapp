package yads;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aj3 implements vj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua f146831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg2 f146832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kh3 f146833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf2 f146834d;

    public aj3(ua uaVar, lg2 lg2Var, kh3 kh3Var, lf2 lf2Var) {
        this.f146831a = uaVar;
        this.f146832b = lg2Var;
        this.f146833c = kh3Var;
        this.f146834d = lf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // yads.vj2
    public final ge2 a() {
        long jA;
        lg2 lg2Var = this.f146832b;
        jg2 jg2Var = lg2Var.f151978a;
        df2 df2Var = lg2Var.f151979b;
        if (jg2Var != null) {
            jA = jg2Var.a();
        } else if (df2Var != null) {
            Collection collectionValues = this.f146831a.f156328b.values();
            if (collectionValues.contains(u81.f156314d) || collectionValues.contains(u81.f156315e) || this.f146834d.f151970c) {
                jA = -1;
            } else {
                jA = df2Var.a();
            }
        } else {
            jA = -1;
        }
        long j10 = this.f146833c.f151540a;
        return new ge2(jA, j10 != -9223372036854775807L ? j10 : -1L);
    }
}
