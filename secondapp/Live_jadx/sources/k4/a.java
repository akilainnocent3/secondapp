package k4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final Map<b<?>, Object> f101782a = new LinkedHashMap();

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0960a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public static final C0960a f101783b = new C0960a();

        @Override // k4.a
        @m
        public <T> T a(@l b<T> key) {
            m0.p(key, "key");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
    }

    @m
    public abstract <T> T a(@l b<T> bVar);

    @l
    public final Map<b<?>, Object> b() {
        return this.f101782a;
    }
}
