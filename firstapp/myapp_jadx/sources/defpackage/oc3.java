package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oc3 {
    public final String a;

    public /* synthetic */ oc3(int i) {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc3) && Intrinsics.g(this.a, ((oc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("BetSuccessfulUiState(loyaltyTierBadgeUrl=", this.a, ")");
    }

    public oc3() {
        this(0);
    }

    public oc3(String str) {
        this.a = str;
    }
}
