package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f70413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.tracker.network.b.a f70414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f70415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70416d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(b0 b0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        this.f70416d = false;
        this.f70413a = t10;
        this.f70414b = aVar;
        this.f70415c = null;
    }

    public static <T> v<T> a(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f70415c == null;
    }

    private v(b0 b0Var) {
        this.f70416d = false;
        this.f70413a = null;
        this.f70414b = null;
        this.f70415c = b0Var;
    }
}
