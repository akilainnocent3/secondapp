package defpackage;

import com.appsflyer.internal.v;

/* JADX INFO: loaded from: classes.dex */
public final class ji1 extends g4h {
    public final Integer a;

    public ji1(Integer num) {
        this.a = num;
    }

    @Override // defpackage.g4h
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g4h)) {
            return false;
        }
        g4h g4hVar = (g4h) obj;
        Integer num = this.a;
        if (num == null) {
            return g4hVar.a() == null;
        }
        return num.equals(g4hVar.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return v.a(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.a, "}");
    }
}
