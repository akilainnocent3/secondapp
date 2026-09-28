package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class vg1 {
    public final HashSet a;

    public vg1(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vg1) {
            return this.a.equals(((vg1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
