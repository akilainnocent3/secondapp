package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n7 extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152904b;

    public n7(String str) {
        super(str);
        this.f152904b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && kotlin.jvm.internal.m0.g(this.f152904b, ((n7) obj).f152904b);
    }

    public final int hashCode() {
        return this.f152904b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.f152904b + gi.j.f86771d;
    }
}
