package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wie0 {
    public final String a;
    public final String b;

    public wie0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wie0)) {
            return false;
        }
        wie0 wie0Var = (wie0) obj;
        return Intrinsics.g(this.a, wie0Var.a) && Intrinsics.g(this.b, wie0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SurveyRequestData(url=", this.a, ", id=", this.b, ")");
    }
}
