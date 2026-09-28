package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ybp<T> {

    public interface a {
        ybp<?> a(Type type, Set<? extends Annotation> set, h5w h5wVar);
    }

    public abstract T a(jep jepVar);

    public final j5y b() {
        return this instanceof j5y ? (j5y) this : new j5y(this);
    }

    public abstract void c(rfp rfpVar, T t);
}
