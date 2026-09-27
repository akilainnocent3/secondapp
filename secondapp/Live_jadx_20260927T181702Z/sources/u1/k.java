package u1;

import android.os.Handler;
import dr.w2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.a<w2> f137553b;

        public a(ds.a<w2> aVar) {
            this.f137553b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f137553b.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.a<w2> f137554b;

        public b(ds.a<w2> aVar) {
            this.f137554b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f137554b.invoke();
        }
    }

    @oy.l
    public static final Runnable a(@oy.l Handler handler, long j10, @oy.m Object obj, @oy.l ds.a<w2> aVar) {
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j10);
        return aVar2;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j10, Object obj, ds.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j10);
        return aVar2;
    }

    @oy.l
    public static final Runnable c(@oy.l Handler handler, long j10, @oy.m Object obj, @oy.l ds.a<w2> aVar) {
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        j.d(handler, bVar, obj, j10);
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j10, Object obj, ds.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        j.d(handler, bVar, obj, j10);
        return bVar;
    }
}
