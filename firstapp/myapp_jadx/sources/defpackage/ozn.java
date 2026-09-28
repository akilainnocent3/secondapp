package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ozn {
    public final int a;
    public final List<Integer> b;

    public ozn(int i, List<Integer> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozn)) {
            return false;
        }
        ozn oznVar = (ozn) obj;
        return this.a == oznVar.a && this.b.equals(oznVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InstantRacingPermutationPick(requiredPickCount=" + this.a + ", picks=" + this.b + ")";
    }
}
