package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u6h {
    public final String a;
    public final q7h b;

    public u6h(String str, q7h q7hVar) {
        str.getClass();
        this.a = str;
        this.b = q7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6h)) {
            return false;
        }
        u6h u6hVar = (u6h) obj;
        return Intrinsics.g(this.a, u6hVar.a) && this.b == u6hVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FacialRecognitionData(cpf=" + this.a + ", usage=" + this.b + ")";
    }
}
