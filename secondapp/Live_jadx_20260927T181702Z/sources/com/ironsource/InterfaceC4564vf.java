package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4564vf {

    /* JADX INFO: renamed from: com.ironsource.vf$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final W6.a.InterfaceC0543a f64337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64338b;

        public a(@oy.l W6.a.InterfaceC0543a onCancel) {
            kotlin.jvm.internal.m0.p(onCancel, "onCancel");
            this.f64337a = onCancel;
        }

        public final void a() {
            this.f64337a.cancel();
            this.f64338b = true;
        }

        public final boolean b() {
            return this.f64338b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vf$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f64339b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final AbstractRunnableC4335ie f64340a;

        /* JADX INFO: renamed from: com.ironsource.vf$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.vf$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class C0599a extends AbstractRunnableC4335ie {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeakReference<T> f64341b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ds.l<T, dr.w2> f64342c;

                /* JADX WARN: Multi-variable type inference failed */
                public C0599a(WeakReference<T> weakReference, ds.l<? super T, dr.w2> lVar) {
                    this.f64341b = weakReference;
                    this.f64342c = lVar;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.AbstractRunnableC4335ie
                public void a() {
                    Object obj = this.f64341b.get();
                    if (obj != null) {
                        this.f64342c.invoke((T) obj);
                    }
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            public final <T> b a(T t10, @oy.l ds.l<? super T, dr.w2> block) {
                kotlin.jvm.internal.m0.p(block, "block");
                return new b(new C0599a(new WeakReference(t10), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC4335ie abstractRunnableC4335ie, kotlin.jvm.internal.x xVar) {
            this(abstractRunnableC4335ie);
        }

        @oy.l
        public final AbstractRunnableC4335ie a() {
            return this.f64340a;
        }

        private b(AbstractRunnableC4335ie abstractRunnableC4335ie) {
            this.f64340a = abstractRunnableC4335ie;
        }
    }

    @oy.l
    a a(@oy.l b bVar, long j10);

    @oy.l
    a a(@oy.l Runnable runnable, long j10);
}
