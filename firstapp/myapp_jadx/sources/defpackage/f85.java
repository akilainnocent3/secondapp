package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f85 {
    public final String a;
    public final Float b;
    public final String c;

    public f85(String str, Float f, String str2) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f85)) {
            return false;
        }
        f85 f85Var = (f85) obj;
        return Intrinsics.g(this.a, f85Var.a) && Intrinsics.g(this.b, f85Var.b) && Intrinsics.g(this.c, f85Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrRegistrationMissionTaskUiModel(description=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", progressLabel=");
        return uf80.a(sb, this.c, ")");
    }
}
