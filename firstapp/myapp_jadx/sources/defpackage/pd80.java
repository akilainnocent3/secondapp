package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface pd80 {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i);

    List<Annotation> f(int i);

    pd80 g(int i);

    default List<Annotation> getAnnotations() {
        return m2g.a;
    }

    yd80 getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
