package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g5o implements pdd0 {
    public final String a = "bng_stake__change__click";

    public g5o(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5o) && Intrinsics.g(this.a, ((g5o) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("BngStakeChangeClickEvent(name=", this.a, ")");
    }
}
