package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC4335ie implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f62029a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.ie$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ie$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0578a extends AbstractRunnableC4335ie {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ds.a<dr.w2> f62030b;

            public C0578a(ds.a<dr.w2> aVar) {
                this.f62030b = aVar;
            }

            @Override // com.ironsource.AbstractRunnableC4335ie
            public void a() {
                this.f62030b.invoke();
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final AbstractRunnableC4335ie a(@oy.l ds.a<dr.w2> block) {
            kotlin.jvm.internal.m0.p(block, "block");
            return new C0578a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(@oy.l Throwable t10) {
        kotlin.jvm.internal.m0.p(t10, "t");
        C4581wf.a(t10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C4485r4.d().a(th3);
            }
        }
    }
}
