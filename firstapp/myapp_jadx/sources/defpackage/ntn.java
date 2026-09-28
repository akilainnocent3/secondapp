package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ntn {
    public final Set<Integer> a;

    public ntn(Set set) {
        set.getClass();
        this.a = set;
    }

    public static ntn a(ntn ntnVar, Set set) {
        ntnVar.getClass();
        ntnVar.getClass();
        set.getClass();
        return new ntn(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntn) && Intrinsics.g(this.a, ((ntn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(2) * 31);
    }

    public final String toString() {
        return "InstantRacingCombinationPick(requiredPickCount=2, picks=" + this.a + ")";
    }
}
