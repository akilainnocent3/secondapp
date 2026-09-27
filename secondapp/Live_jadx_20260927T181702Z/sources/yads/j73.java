package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f150955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c83 f150956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb3 f150957c;

    public j73(WeakReference weakReference, c83 c83Var, rb3 rb3Var) {
        this.f150955a = weakReference;
        this.f150956b = c83Var;
        this.f150957c = rb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return kotlin.jvm.internal.m0.g(this.f150955a, j73Var.f150955a) && kotlin.jvm.internal.m0.g(this.f150956b, j73Var.f150956b) && kotlin.jvm.internal.m0.g(this.f150957c, j73Var.f150957c);
    }

    public final int hashCode() {
        return this.f150957c.f154859a.hashCode() + ((this.f150956b.hashCode() + (this.f150955a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.f150955a + ", notice=" + this.f150956b + ", validationResult=" + this.f150957c + gi.j.f86771d;
    }
}
