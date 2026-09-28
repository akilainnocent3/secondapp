package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hbf0 implements pdd0 {
    public final String a = "otp__no_valid_tg_popup__view";

    public hbf0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbf0) && Intrinsics.g(this.a, ((hbf0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OtpNoValidTgPopupViewEvent(name=", this.a, ")");
    }
}
