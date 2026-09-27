package hk;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements vk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f88398a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vk.a f88399b = new a();

    /* JADX INFO: renamed from: hk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0885a implements tk.e<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0885a f88400a = new C0885a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final tk.d f88401b = tk.d.d(wl.d.f143425a);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tk.d f88402c = tk.d.d(wl.d.f143427c);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tk.d f88403d = tk.d.d(wl.d.f143428d);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final tk.d f88404e = tk.d.d(wl.d.f143426b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final tk.d f88405f = tk.d.d(wl.d.f143429e);

        @Override // tk.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, tk.f fVar) throws IOException {
            fVar.a(f88401b, jVar.e());
            fVar.a(f88402c, jVar.c());
            fVar.a(f88403d, jVar.d());
            fVar.a(f88404e, jVar.g());
            fVar.i(f88405f, jVar.f());
        }
    }

    @Override // vk.a
    public void a(vk.b<?> bVar) {
        C0885a c0885a = C0885a.f88400a;
        bVar.a(j.class, c0885a);
        bVar.a(b.class, c0885a);
    }
}
