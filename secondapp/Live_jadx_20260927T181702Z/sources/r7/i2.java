package r7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(16)
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123966a = "MediaRouterJellybean";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f123967b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f123968c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123969d = 8388608;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123970e = 8388611;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void d(int i10, @NonNull MediaRouter.RouteInfo routeInfo);

        void e(@NonNull MediaRouter.RouteInfo routeInfo);

        void f(@NonNull MediaRouter.RouteInfo routeInfo);

        void h(@NonNull MediaRouter.RouteInfo routeInfo, @NonNull MediaRouter.RouteGroup routeGroup, int i10);

        void i(@NonNull MediaRouter.RouteInfo routeInfo, @NonNull MediaRouter.RouteGroup routeGroup);

        void j(@NonNull MediaRouter.RouteInfo routeInfo);

        void l(@NonNull MediaRouter.RouteInfo routeInfo);

        void n(int i10, @NonNull MediaRouter.RouteInfo routeInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<T extends a> extends MediaRouter.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f123971a;

        public b(T t10) {
            this.f123971a = t10;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.e(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.j(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
            this.f123971a.h(routeInfo, routeGroup, i10);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.f(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.d(i10, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f123971a.i(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.n(i10, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f123971a.l(routeInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f123972a;

        public c() {
            throw new UnsupportedOperationException();
        }

        @NonNull
        @SuppressLint({"BanUncheckedReflection"})
        public Object a(@NonNull MediaRouter mediaRouter) {
            Method method = this.f123972a;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, null);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {
        @NonNull
        public static CharSequence a(@NonNull MediaRouter.RouteInfo routeInfo, @NonNull Context context) {
            return routeInfo.getName(context);
        }

        public static int b(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getPlaybackStream();
        }

        public static int c(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getPlaybackType();
        }

        public static int d(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getSupportedTypes();
        }

        @Nullable
        public static Object e(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getTag();
        }

        public static int f(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getVolume();
        }

        public static int g(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getVolumeHandling();
        }

        public static int h(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.getVolumeMax();
        }

        public static void i(@NonNull MediaRouter.RouteInfo routeInfo, int i10) {
            routeInfo.requestSetVolume(i10);
        }

        public static void j(@NonNull MediaRouter.RouteInfo routeInfo, int i10) {
            routeInfo.requestUpdateVolume(i10);
        }

        public static void k(@NonNull MediaRouter.RouteInfo routeInfo, @Nullable Object obj) {
            routeInfo.setTag(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f123973a;

        public e() {
            throw new UnsupportedOperationException();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public void a(@NonNull MediaRouter mediaRouter, int i10, @NonNull MediaRouter.RouteInfo routeInfo) {
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                Method method = this.f123973a;
                if (method != null) {
                    try {
                        method.invoke(mediaRouter, Integer.valueOf(i10), routeInfo);
                        return;
                    } catch (IllegalAccessException e10) {
                        Log.w(i2.f123966a, "Cannot programmatically select non-user route.  Media routing may not work.", e10);
                    } catch (InvocationTargetException e11) {
                        Log.w(i2.f123966a, "Cannot programmatically select non-user route.  Media routing may not work.", e11);
                    }
                } else {
                    Log.w(i2.f123966a, "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i10, routeInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f {
        public static void a(@NonNull MediaRouter.UserRouteInfo userRouteInfo, @NonNull CharSequence charSequence) {
            userRouteInfo.setName(charSequence);
        }

        public static void b(@NonNull MediaRouter.UserRouteInfo userRouteInfo, int i10) {
            userRouteInfo.setPlaybackStream(i10);
        }

        public static void c(@NonNull MediaRouter.UserRouteInfo userRouteInfo, int i10) {
            userRouteInfo.setPlaybackType(i10);
        }

        public static void d(@NonNull MediaRouter.UserRouteInfo userRouteInfo, @Nullable Object obj) {
            userRouteInfo.setRemoteControlClient((RemoteControlClient) obj);
        }

        public static void e(@NonNull MediaRouter.UserRouteInfo userRouteInfo, int i10) {
            userRouteInfo.setVolume(i10);
        }

        public static void f(@NonNull MediaRouter.UserRouteInfo userRouteInfo, @NonNull MediaRouter.VolumeCallback volumeCallback) {
            userRouteInfo.setVolumeCallback(volumeCallback);
        }

        public static void g(@NonNull MediaRouter.UserRouteInfo userRouteInfo, int i10) {
            userRouteInfo.setVolumeHandling(i10);
        }

        public static void h(@NonNull MediaRouter.UserRouteInfo userRouteInfo, int i10) {
            userRouteInfo.setVolumeMax(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        void a(@NonNull MediaRouter.RouteInfo routeInfo, int i10);

        void b(@NonNull MediaRouter.RouteInfo routeInfo, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h<T extends g> extends MediaRouter.VolumeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f123974a;

        public h(T t10) {
            this.f123974a = t10;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
            this.f123974a.b(routeInfo, i10);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
            this.f123974a.a(routeInfo, i10);
        }
    }

    public static void a(MediaRouter mediaRouter, int i10, MediaRouter.Callback callback) {
        mediaRouter.addCallback(i10, callback);
    }

    public static void b(MediaRouter mediaRouter, MediaRouter.UserRouteInfo userRouteInfo) {
        mediaRouter.addUserRoute(userRouteInfo);
    }

    public static b<a> c(a aVar) {
        return new b<>(aVar);
    }

    public static MediaRouter.RouteCategory d(MediaRouter mediaRouter, String str, boolean z10) {
        return mediaRouter.createRouteCategory(str, z10);
    }

    public static MediaRouter.UserRouteInfo e(MediaRouter mediaRouter, MediaRouter.RouteCategory routeCategory) {
        return mediaRouter.createUserRoute(routeCategory);
    }

    public static h<g> f(g gVar) {
        return new h<>(gVar);
    }

    public static MediaRouter g(Context context) {
        return (MediaRouter) context.getSystemService("media_router");
    }

    public static List<MediaRouter.RouteInfo> h(MediaRouter mediaRouter) {
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        return arrayList;
    }

    public static MediaRouter.RouteInfo i(MediaRouter mediaRouter, int i10) {
        return mediaRouter.getSelectedRoute(i10);
    }

    public static void j(MediaRouter mediaRouter, MediaRouter.Callback callback) {
        mediaRouter.removeCallback(callback);
    }

    public static void k(MediaRouter mediaRouter, MediaRouter.UserRouteInfo userRouteInfo) {
        try {
            mediaRouter.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e10) {
            Log.w(f123966a, "Failed to remove user route", e10);
        }
    }

    public static void l(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        mediaRouter.selectRoute(i10, routeInfo);
    }
}
