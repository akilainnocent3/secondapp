package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tmw implements pdd0 {
    public final String a = "mfa__multifactor_auth__click";

    public tmw(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmw) && Intrinsics.g(this.a, ((tmw) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("MultipleFactorAuthClickEvent(name=", this.a, ")");
    }
}
