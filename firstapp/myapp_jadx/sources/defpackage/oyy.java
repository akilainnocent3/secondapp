package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oyy implements pdd0 {
    public final String a = "open_bets_quick_check__view";

    public oyy(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyy) && Intrinsics.g(this.a, ((oyy) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OpenBetsQuickCheckViewEvent(name=", this.a, ")");
    }
}
