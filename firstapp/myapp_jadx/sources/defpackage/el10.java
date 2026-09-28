package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class el10 {
    public final List<fl10> a;
    public final List<fl10> b;

    public el10(List<fl10> list, List<fl10> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el10)) {
            return false;
        }
        el10 el10Var = (el10) obj;
        return Intrinsics.g(this.a, el10Var.a) && Intrinsics.g(this.b, el10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return w9d.a("PlayPauseMorphShape(play=", ", pause=", ")", this.a, this.b);
    }
}
