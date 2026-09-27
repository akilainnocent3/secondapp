package r7;

import android.content.Context;
import android.media.MediaRouter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f124092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f124093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f124094c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(16)
    public static class a extends r2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaRouter f124095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaRouter.RouteCategory f124096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MediaRouter.UserRouteInfo f124097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f124098g;

        /* JADX INFO: renamed from: r7.r2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1211a implements i2.g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f124099b;

            public C1211a(a aVar) {
                this.f124099b = new WeakReference<>(aVar);
            }

            @Override // r7.i2.g
            public void a(@NonNull MediaRouter.RouteInfo routeInfo, int i10) {
                d dVar;
                a aVar = this.f124099b.get();
                if (aVar == null || (dVar = aVar.f124094c) == null) {
                    return;
                }
                dVar.b(i10);
            }

            @Override // r7.i2.g
            public void b(@NonNull MediaRouter.RouteInfo routeInfo, int i10) {
                d dVar;
                a aVar = this.f124099b.get();
                if (aVar == null || (dVar = aVar.f124094c) == null) {
                    return;
                }
                dVar.a(i10);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            MediaRouter mediaRouterG = i2.g(context);
            this.f124095d = mediaRouterG;
            MediaRouter.RouteCategory routeCategoryD = i2.d(mediaRouterG, "", false);
            this.f124096e = routeCategoryD;
            this.f124097f = i2.e(mediaRouterG, routeCategoryD);
        }

        @Override // r7.r2
        public void c(c cVar) {
            i2.f.e(this.f124097f, cVar.f124100a);
            i2.f.h(this.f124097f, cVar.f124101b);
            i2.f.g(this.f124097f, cVar.f124102c);
            i2.f.b(this.f124097f, cVar.f124103d);
            i2.f.c(this.f124097f, cVar.f124104e);
            if (this.f124098g) {
                return;
            }
            this.f124098g = true;
            i2.f.f(this.f124097f, i2.f(new C1211a(this)));
            i2.f.d(this.f124097f, this.f124093b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends r2 {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f124100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f124101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f124102c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f124103d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f124104e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f124105f;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(int i10);

        void b(int i10);
    }

    public r2(Context context, Object obj) {
        this.f124092a = context;
        this.f124093b = obj;
    }

    public static r2 b(Context context, Object obj) {
        return new a(context, obj);
    }

    public Object a() {
        return this.f124093b;
    }

    public void d(d dVar) {
        this.f124094c = dVar;
    }

    public void c(c cVar) {
    }
}
