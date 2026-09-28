package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class frz<F, S> {
    public final F a;
    public final S b;

    public frz(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof frz)) {
            return false;
        }
        frz frzVar = (frz) obj;
        return Objects.equals(frzVar.a, this.a) && Objects.equals(frzVar.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
