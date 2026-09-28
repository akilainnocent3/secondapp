package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lkk0 implements sl0.d {
    public static final lkk0 c;
    public final boolean a;
    public final String b;

    static {
        jkk0 jkk0Var = new jkk0();
        jkk0Var.a = Boolean.FALSE;
        c = new lkk0(jkk0Var);
    }

    public lkk0(jkk0 jkk0Var) {
        this.a = jkk0Var.a.booleanValue();
        this.b = jkk0Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lkk0)) {
            return false;
        }
        lkk0 lkk0Var = (lkk0) obj;
        return scy.a(null, null) && this.a == lkk0Var.a && scy.a(this.b, lkk0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
