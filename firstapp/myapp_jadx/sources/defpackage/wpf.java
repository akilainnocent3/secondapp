package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wpf {
    public final int a;
    public final String b;
    public final String c;

    public wpf(int i, String str, String str2) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpf)) {
            return false;
        }
        wpf wpfVar = (wpf) obj;
        return this.a == wpfVar.a && this.b.equals(wpfVar.b) && Intrinsics.g(this.c, wpfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(uqe0.a(this.a, "EditHistoryInfo(editType=", ", time=", this.b, ", editBetId="), this.c, ")");
    }
}
