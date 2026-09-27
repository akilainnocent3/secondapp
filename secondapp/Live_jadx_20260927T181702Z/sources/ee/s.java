package ee;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements ae.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<ae.e> f80808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f80809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f80810c;

    public s(Set<ae.e> set, r rVar, v vVar) {
        this.f80808a = set;
        this.f80809b = rVar;
        this.f80810c = vVar;
    }

    @Override // ae.m
    public <T> ae.l<T> a(String str, Class<T> cls, ae.e eVar, ae.k<T, byte[]> kVar) {
        if (this.f80808a.contains(eVar)) {
            return new u(this.f80809b, str, eVar, kVar, this.f80810c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", eVar, this.f80808a));
    }

    @Override // ae.m
    public <T> ae.l<T> b(String str, Class<T> cls, ae.k<T, byte[]> kVar) {
        return a(str, cls, ae.e.b("proto"), kVar);
    }
}
