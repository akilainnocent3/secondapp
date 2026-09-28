package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mlr {
    public final String a;
    public final String b;

    static {
        jrh0.J(0);
        jrh0.J(1);
    }

    public mlr(String str, String str2) {
        this.a = jrh0.P(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mlr.class == obj.getClass()) {
            mlr mlrVar = (mlr) obj;
            if (Objects.equals(this.a, mlrVar.a) && Objects.equals(this.b, mlrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
