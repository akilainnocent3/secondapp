package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zuq {
    public final String a;
    public final List<String> b;

    public zuq(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuq)) {
            return false;
        }
        zuq zuqVar = (zuq) obj;
        return Intrinsics.g(this.a, zuqVar.a) && Intrinsics.g(this.b, zuqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("LNModuleColor(id=", this.a, ", schemas=", ")", this.b);
    }
}
