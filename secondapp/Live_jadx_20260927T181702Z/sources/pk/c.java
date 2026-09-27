package pk;

import b3.f;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final <T> T a(@l f fVar, @l f.a<T> key, T t10) {
        m0.p(fVar, "<this>");
        m0.p(key, "key");
        T t11 = (T) fVar.c(key);
        return t11 == null ? t10 : t11;
    }
}
