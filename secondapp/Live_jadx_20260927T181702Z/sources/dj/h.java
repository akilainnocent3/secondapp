package dj;

import zi.t;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
@qj.f("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<String, String> f79357a = new t() { // from class: dj.g
        @Override // zi.t
        public final Object apply(Object obj) {
            return this.f79356b.b((String) obj);
        }
    };

    public final t<String, String> a() {
        return this.f79357a;
    }

    public abstract String b(String string);
}
