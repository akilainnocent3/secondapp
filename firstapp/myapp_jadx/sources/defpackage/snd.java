package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class snd implements pdd0 {
    public final String a = "deposit__pending_dialog__view";

    public snd(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snd) && Intrinsics.g(this.a, ((snd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("DepositPendingDialogViewEvent(name=", this.a, ")");
    }
}
