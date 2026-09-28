package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tnd implements pdd0 {
    public final String a = "deposit__stp_details_page__view";

    public tnd(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnd) && Intrinsics.g(this.a, ((tnd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("DepositStpDetailsPageViewEvent(name=", this.a, ")");
    }
}
