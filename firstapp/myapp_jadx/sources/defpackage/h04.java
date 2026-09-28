package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h04 {
    public final t6e0 a;
    public final List<a7e0> b;

    public h04(t6e0 t6e0Var, List<a7e0> list) {
        list.getClass();
        this.a = t6e0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h04)) {
            return false;
        }
        h04 h04Var = (h04) obj;
        return this.a == h04Var.a && Intrinsics.g(this.b, h04Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BettingStreakAchievement(currentLevel=" + this.a + ", allLevels=" + this.b + ")";
    }
}
