package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class cmj extends kmd0 {
    public final String a;

    public cmj(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmj) && Intrinsics.g(this.a, ((cmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("GameOverNoRewards(gameName="), this.a, ')');
    }
}
