package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bp1 {
    public final ArrayList a;
    public final String b;

    public bp1(String str, ArrayList arrayList) {
        str.getClass();
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return this.a.equals(bp1Var.a) && Intrinsics.g(this.b, bp1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatars(avatars=" + this.a + ", current=" + this.b + ")";
    }
}
