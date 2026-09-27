package wl;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<d> f143424a;

    public c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f143424a = set;
    }

    @Override // wl.e
    @NonNull
    public Set<d> b() {
        return this.f143424a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f143424a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f143424a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f143424a + "}";
    }
}
