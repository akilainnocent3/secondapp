package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pbf0 implements pdd0 {
    public final String a = "otp__tg_user_back__click";

    public pbf0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbf0) && Intrinsics.g(this.a, ((pbf0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OtpTgUserBackClickEvent(name=", this.a, ")");
    }
}
