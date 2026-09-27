package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface m extends d3 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final ds.l<Throwable, dr.w2> f100838b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@oy.l ds.l<? super Throwable, dr.w2> lVar) {
            this.f100838b = lVar;
        }

        @Override // jv.m
        public void a(@oy.m Throwable th2) {
            this.f100838b.invoke(th2);
        }

        @oy.l
        public String toString() {
            return "CancelHandler.UserSupplied[" + x0.a(this.f100838b) + '@' + x0.b(this) + fw.b.f85385l;
        }
    }

    void a(@oy.m Throwable th2);
}
