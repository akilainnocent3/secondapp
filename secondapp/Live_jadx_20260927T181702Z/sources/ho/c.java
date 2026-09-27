package ho;

import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f88488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f88489b;

        public a(c firstPredicate, c secondPredicate) {
            this.f88488a = firstPredicate;
            this.f88489b = secondPredicate;
        }

        @Override // ho.c
        public boolean a(Calendar date) {
            return this.f88488a.a(date) || this.f88489b.a(date);
        }

        @Override // ho.c
        public go.b b() {
            return this.f88488a.b();
        }
    }

    boolean a(Calendar date);

    go.b b();
}
