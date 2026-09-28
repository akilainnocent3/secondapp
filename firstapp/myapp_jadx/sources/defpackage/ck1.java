package defpackage;

import com.appsflyer.internal.v;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 {
    public final Integer a;

    public ck1(Integer num) {
        this.a = num;
    }

    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ck1)) {
            return false;
        }
        ck1 ck1Var = (ck1) obj;
        Integer num = this.a;
        if (num == null) {
            return ck1Var.a() == null;
        }
        return num.equals(ck1Var.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return v.a(new StringBuilder("ProductData{productId="), this.a, "}");
    }
}
