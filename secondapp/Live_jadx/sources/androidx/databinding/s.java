package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class s extends i<y.a, y, b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9516i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9517j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9518k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9519l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9520m = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e2.w.c<b> f9515h = new e2.w.c<>(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.a<y.a, y, b> f9521n = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends i.a<y.a, y, b> {
        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(y.a aVar, y yVar, int i10, b bVar) {
            if (i10 == 1) {
                aVar.e(yVar, bVar.f9522a, bVar.f9523b);
                return;
            }
            if (i10 == 2) {
                aVar.f(yVar, bVar.f9522a, bVar.f9523b);
                return;
            }
            if (i10 == 3) {
                aVar.g(yVar, bVar.f9522a, bVar.f9524c, bVar.f9523b);
            } else if (i10 != 4) {
                aVar.a(yVar);
            } else {
                aVar.h(yVar, bVar.f9522a, bVar.f9523b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9524c;
    }

    public s() {
        super(f9521n);
    }

    public static b r(int i10, int i11, int i12) {
        b bVarA = f9515h.a();
        if (bVarA == null) {
            bVarA = new b();
        }
        bVarA.f9522a = i10;
        bVarA.f9524c = i11;
        bVarA.f9523b = i12;
        return bVarA;
    }

    @Override // androidx.databinding.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public synchronized void j(@NonNull y yVar, int i10, b bVar) {
        super.j(yVar, i10, bVar);
        if (bVar != null) {
            f9515h.b(bVar);
        }
    }

    public void t(@NonNull y yVar) {
        j(yVar, 0, null);
    }

    public void u(@NonNull y yVar, int i10, int i11) {
        j(yVar, 1, r(i10, 0, i11));
    }

    public void v(@NonNull y yVar, int i10, int i11) {
        j(yVar, 2, r(i10, 0, i11));
    }

    public void w(@NonNull y yVar, int i10, int i11, int i12) {
        j(yVar, 3, r(i10, i11, i12));
    }

    public void x(@NonNull y yVar, int i10, int i11) {
        j(yVar, 4, r(i10, 0, i11));
    }
}
