package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w48 extends y48 {
    public final List<List<Float>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public w48(List<? extends List<Float>> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w48) && Intrinsics.g(this.a, ((w48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o8i.a(new StringBuilder("CollectionsMultiplier(multipliers="), this.a, ')');
    }
}
