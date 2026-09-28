package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vj30 {
    public final boolean a;
    public final Set<Class<? extends uj30>> b;
    public final Set<Class<? extends uj30>> c;

    public vj30(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.a = z;
        this.b = hashSet == null ? Collections.EMPTY_SET : new HashSet<>(hashSet);
        this.c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet<>(hashSet2);
    }

    public final boolean a(Class<? extends uj30> cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj30)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        vj30 vj30Var = (vj30) obj;
        return this.a == vj30Var.a && Objects.equals(this.b, vj30Var.b) && Objects.equals(this.c, vj30Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
