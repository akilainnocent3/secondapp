package mj;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@d
public abstract class m<T> {
    public final Type d() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        l0.u(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
