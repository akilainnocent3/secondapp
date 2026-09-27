package com.ironsource;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class X6 {
    @oy.l
    public static final W6.a a(@oy.l Handler handler) {
        kotlin.jvm.internal.m0.p(handler, "<this>");
        return new a(handler);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements W6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f60307a;

        public a(Handler handler) {
            this.f60307a = handler;
        }

        @Override // com.ironsource.W6.a
        @oy.l
        public W6.a.InterfaceC0543a a(@oy.l final Runnable runnable, long j10) {
            kotlin.jvm.internal.m0.p(runnable, "runnable");
            this.f60307a.postDelayed(runnable, j10);
            final Handler handler = this.f60307a;
            return new W6.a.InterfaceC0543a() { // from class: com.ironsource.dk
                @Override // com.ironsource.W6.a.InterfaceC0543a
                public final void cancel() {
                    X6.a.a(handler, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Handler this_asScheduler, Runnable runnable) {
            kotlin.jvm.internal.m0.p(this_asScheduler, "$this_asScheduler");
            kotlin.jvm.internal.m0.p(runnable, "$runnable");
            this_asScheduler.removeCallbacks(runnable);
        }
    }

    @oy.l
    public static final <T> InterfaceC4564vf.b a(T t10, @oy.l ds.l<? super T, dr.w2> block) {
        kotlin.jvm.internal.m0.p(block, "block");
        return InterfaceC4564vf.b.f64339b.a(t10, block);
    }
}
