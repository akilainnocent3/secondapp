package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes8.dex */
public final class kj1 {
    public static final kj1 c = new kj1();
    public final int a = 128;
    public final int b = Reader.READ_DONE;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.a == kj1Var.b() && this.b == kj1Var.a();
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogLimits{maxNumberOfAttributes=");
        sb.append(this.a);
        sb.append(", maxAttributeValueLength=");
        return zk1.a(this.b, "}", sb);
    }
}
