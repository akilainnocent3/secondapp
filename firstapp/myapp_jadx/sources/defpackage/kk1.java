package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class kk1 {
    public final HashSet a;

    public kk1(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kk1) {
            return this.a.equals(((kk1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
