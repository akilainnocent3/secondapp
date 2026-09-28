package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fpg {
    public final String a;
    public final ArrayList b;

    public fpg(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpg)) {
            return false;
        }
        fpg fpgVar = (fpg) obj;
        return Intrinsics.g(this.a, fpgVar.a) && this.b.equals(fpgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventGroup(monthLabel=" + this.a + ", events=" + this.b + ")";
    }
}
