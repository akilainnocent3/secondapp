package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f31663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f31664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f31665c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f31666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f31667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f31668c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f31666a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f31667b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f31668c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f31664b;
    }

    public final Object[] b() {
        return this.f31665c;
    }

    private h(a aVar) {
        this.f31663a = aVar.f31666a;
        this.f31664b = aVar.f31667b;
        this.f31665c = aVar.f31668c;
        if (this.f31663a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
