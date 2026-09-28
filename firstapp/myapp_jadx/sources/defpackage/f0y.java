package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f0y implements pd80 {
    public static final f0y a = new f0y();
    public static final ebe0.d b = ebe0.d.a;
    public static final String c = "kotlin.Nothing";

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.pd80
    public final int d() {
        return 0;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return b;
    }

    @Override // defpackage.pd80
    public final String h() {
        return c;
    }

    public final int hashCode() {
        return (b.hashCode() * 31) + c.hashCode();
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
