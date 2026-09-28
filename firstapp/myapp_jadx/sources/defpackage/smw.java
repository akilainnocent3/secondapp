package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class smw implements pdd0 {
    public final String a = "2fa__email_2fa__click";

    public smw(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smw) && Intrinsics.g(this.a, ((smw) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("EmailTwoFAClickEvent(name=", this.a, ")");
    }
}
