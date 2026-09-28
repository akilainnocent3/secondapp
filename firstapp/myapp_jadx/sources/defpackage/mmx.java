package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mmx extends uj4 {
    public final String a;

    public mmx(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmx) && Intrinsics.g(this.a, ((mmx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("NetworkError(gameName="), this.a, ')');
    }
}
