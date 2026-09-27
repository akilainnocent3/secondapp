package jw;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f101410a = b.f101412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final s0 f101411b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements s0 {
        @Override // jw.s0
        public a0 get() {
            return a0.f100984d;
        }

        @Override // jw.s0
        public a0 peek() {
            return a0.f100984d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f101412a = new b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        @Deprecated
        @oy.m
        public static a0 a(@oy.l s0 s0Var) throws IOException {
            return r0.a(s0Var);
        }
    }

    @oy.l
    a0 get() throws IOException;

    @oy.m
    a0 peek() throws IOException;
}
