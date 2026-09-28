package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kbf0 implements pdd0 {
    public final String a = "otp__send_back__click";

    public kbf0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbf0) && Intrinsics.g(this.a, ((kbf0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OtpSendBackClickEvent(name=", this.a, ")");
    }
}
