package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class onf {
    public final String a;
    public final String b;

    public onf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onf)) {
            return false;
        }
        onf onfVar = (onf) obj;
        return Intrinsics.g(this.a, onfVar.a) && Intrinsics.g(this.b, onfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("EditBetTrackingData(betId=", this.a, ", orderType=", this.b, ")");
    }
}
