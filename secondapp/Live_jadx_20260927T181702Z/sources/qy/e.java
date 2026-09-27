package qy;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface e<R, T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {
        public static Type b(int i10, ParameterizedType parameterizedType) {
            return n0.g(i10, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return n0.h(type);
        }

        @zq.h
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, j0 j0Var);
    }

    T a(d<R> dVar);

    Type b();
}
