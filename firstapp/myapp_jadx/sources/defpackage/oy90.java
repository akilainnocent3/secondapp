package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes8.dex */
public final class oy90 implements ny90 {
    public static final oy90 a = new oy90();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return ny90.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof ny90;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + ny90.class.getName() + "()";
    }
}
