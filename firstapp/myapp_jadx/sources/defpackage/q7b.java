package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q7b extends jpc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public q7b(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    @Override // defpackage.jpc
    public final int a() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7b)) {
            return false;
        }
        q7b q7bVar = (q7b) obj;
        return Intrinsics.g(this.a, q7bVar.a) && Intrinsics.g(this.b, q7bVar.b) && Intrinsics.g(this.c, q7bVar.c) && this.d == q7bVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return ijg0.a(this.d, this.c, ", eventSize=", ")", ux5.a("CountriesTournamentDataItem(name=", this.a, ", id=", this.b, ", categoryId="));
    }
}
