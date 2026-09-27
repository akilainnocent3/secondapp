package vb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f140732a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f140733b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f140734c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f140735d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f140736e = new e();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends j {
        @Override // vb.j
        public boolean a() {
            return true;
        }

        @Override // vb.j
        public boolean b() {
            return true;
        }

        @Override // vb.j
        public boolean c(tb.a aVar) {
            return aVar == tb.a.REMOTE;
        }

        @Override // vb.j
        public boolean d(boolean z10, tb.a aVar, tb.c cVar) {
            return (aVar == tb.a.RESOURCE_DISK_CACHE || aVar == tb.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends j {
        @Override // vb.j
        public boolean a() {
            return false;
        }

        @Override // vb.j
        public boolean b() {
            return false;
        }

        @Override // vb.j
        public boolean c(tb.a aVar) {
            return false;
        }

        @Override // vb.j
        public boolean d(boolean z10, tb.a aVar, tb.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends j {
        @Override // vb.j
        public boolean a() {
            return true;
        }

        @Override // vb.j
        public boolean b() {
            return false;
        }

        @Override // vb.j
        public boolean c(tb.a aVar) {
            return (aVar == tb.a.DATA_DISK_CACHE || aVar == tb.a.MEMORY_CACHE) ? false : true;
        }

        @Override // vb.j
        public boolean d(boolean z10, tb.a aVar, tb.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends j {
        @Override // vb.j
        public boolean a() {
            return false;
        }

        @Override // vb.j
        public boolean b() {
            return true;
        }

        @Override // vb.j
        public boolean c(tb.a aVar) {
            return false;
        }

        @Override // vb.j
        public boolean d(boolean z10, tb.a aVar, tb.c cVar) {
            return (aVar == tb.a.RESOURCE_DISK_CACHE || aVar == tb.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends j {
        @Override // vb.j
        public boolean a() {
            return true;
        }

        @Override // vb.j
        public boolean b() {
            return true;
        }

        @Override // vb.j
        public boolean c(tb.a aVar) {
            return aVar == tb.a.REMOTE;
        }

        @Override // vb.j
        public boolean d(boolean z10, tb.a aVar, tb.c cVar) {
            return ((z10 && aVar == tb.a.DATA_DISK_CACHE) || aVar == tb.a.LOCAL) && cVar == tb.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(tb.a aVar);

    public abstract boolean d(boolean z10, tb.a aVar, tb.c cVar);
}
