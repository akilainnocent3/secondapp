package yads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ey extends sa2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f148876b;

    public ey(Comparator comparator) {
        this.f148876b = (Comparator) ng2.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f148876b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            return this.f148876b.equals(((ey) obj).f148876b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f148876b.hashCode();
    }

    public final String toString() {
        return this.f148876b.toString();
    }
}
