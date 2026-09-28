package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sfi0 implements pdd0 {
    public final String a = "virtual_lobby__big_winner__click";

    public sfi0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfi0) && Intrinsics.g(this.a, ((sfi0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("BigWinnerClickEvent(name=", this.a, ")");
    }
}
