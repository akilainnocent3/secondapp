package wl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements vk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f143405a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vk.a f143406b = new a();

    /* JADX INFO: renamed from: wl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1506a implements tk.e<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1506a f143407a = new C1506a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final tk.d f143408b = tk.d.d(d.f143425a);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tk.d f143409c = tk.d.d(d.f143426b);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tk.d f143410d = tk.d.d(d.f143427c);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final tk.d f143411e = tk.d.d(d.f143428d);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final tk.d f143412f = tk.d.d(d.f143429e);

        @Override // tk.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, tk.f fVar) throws IOException {
            fVar.a(f143408b, dVar.f());
            fVar.a(f143409c, dVar.h());
            fVar.a(f143410d, dVar.d());
            fVar.a(f143411e, dVar.e());
            fVar.i(f143412f, dVar.g());
        }
    }

    @Override // vk.a
    public void a(vk.b<?> bVar) {
        C1506a c1506a = C1506a.f143407a;
        bVar.a(d.class, c1506a);
        bVar.a(b.class, c1506a);
    }
}
