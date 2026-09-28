package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class lmx extends kmd0 {
    public final String a;

    public lmx(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmx) && Intrinsics.g(this.a, ((lmx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("NetworkError(gameName="), this.a, ')');
    }
}
