package bt;

import ct.p;
import kotlin.jvm.internal.m0;
import ws.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l implements mt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final l f21962a = new l();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements mt.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final p f21963b;

        public a(@oy.l p javaElement) {
            m0.p(javaElement, "javaElement");
            this.f21963b = javaElement;
        }

        @Override // ws.b1
        @oy.l
        public c1 b() {
            c1 NO_SOURCE_FILE = c1.f143738a;
            m0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // mt.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p c() {
            return this.f21963b;
        }

        @oy.l
        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    @Override // mt.b
    @oy.l
    public mt.a a(@oy.l nt.l javaElement) {
        m0.p(javaElement, "javaElement");
        return new a((p) javaElement);
    }
}
