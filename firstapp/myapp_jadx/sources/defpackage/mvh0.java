package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mvh0 {
    public final String a;
    public final String b;

    public mvh0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvh0)) {
            return false;
        }
        mvh0 mvh0Var = (mvh0) obj;
        return Intrinsics.g(this.a, mvh0Var.a) && Intrinsics.g(this.b, mvh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("VariantOverrideEntity(campaignCode=", this.a, ", variantValue=", this.b, ")");
    }
}
