package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e5o implements pdd0 {
    public final String a = "bng__shuffle_bet__click";

    public e5o(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5o) && Intrinsics.g(this.a, ((e5o) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("BngShuffleBetClickEvent(name=", this.a, ")");
    }
}
