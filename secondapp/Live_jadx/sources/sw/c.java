package sw;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f135630a = new a();

        @Override // sw.c
        public void a(int i10, @oy.l tw.a windowCounter, long j10) {
            m0.p(windowCounter, "windowCounter");
        }

        @Override // sw.c
        public void b(@oy.l tw.a windowCounter) {
            m0.p(windowCounter, "windowCounter");
        }
    }

    void a(int i10, @oy.l tw.a aVar, long j10);

    void b(@oy.l tw.a aVar);
}
