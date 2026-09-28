package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class iav {
    public final String a;
    public final String b;
    public final ap20 c;

    public iav(String str, String str2, ap20 ap20Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ap20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iav)) {
            return false;
        }
        iav iavVar = (iav) obj;
        return Intrinsics.g(this.a, iavVar.a) && Intrinsics.g(this.b, iavVar.b) && this.c == iavVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MatchmakingBackgroundData(atlasFilePath=" + this.a + ", skeletonFilePath=" + this.b + ", pigType=" + this.c + ')';
    }
}
