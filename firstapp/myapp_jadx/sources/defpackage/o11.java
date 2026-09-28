package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class o11 implements v630 {
    public final int a;

    public o11(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return v630.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v630)) {
            return false;
        }
        v630 v630Var = (v630) obj;
        return this.a == v630Var.tag() && v630.a.a.equals(v630Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (v630.a.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.v630
    public final v630.a intEncoding() {
        return v630.a.a;
    }

    @Override // defpackage.v630
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + v630.a.a + ')';
    }
}
