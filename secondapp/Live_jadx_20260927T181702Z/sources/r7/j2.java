package r7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(17)
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123976a = "MediaRouterJellybeanMr1";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f123977f = 15000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayManager f123978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f123979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f123980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f123981e;

        public a(@NonNull Context context, @NonNull Handler handler) {
            throw new UnsupportedOperationException();
        }

        public void a(int i10) {
            if ((i10 & 2) == 0) {
                if (this.f123981e) {
                    this.f123981e = false;
                    this.f123979c.removeCallbacks(this);
                    return;
                }
                return;
            }
            if (this.f123981e) {
                return;
            }
            if (this.f123980d == null) {
                Log.w(j2.f123976a, "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            } else {
                this.f123981e = true;
                this.f123979c.post(this);
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"BanUncheckedReflection"})
        public void run() {
            if (this.f123981e) {
                try {
                    this.f123980d.invoke(this.f123978b, null);
                } catch (IllegalAccessException e10) {
                    Log.w(j2.f123976a, "Cannot scan for wifi displays.", e10);
                } catch (InvocationTargetException e11) {
                    Log.w(j2.f123976a, "Cannot scan for wifi displays.", e11);
                }
                this.f123979c.postDelayed(this, 15000L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b extends i2.a {
        void g(@NonNull MediaRouter.RouteInfo routeInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<T extends b> extends i2.b<T> {
        public c(T t10) {
            super(t10);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((b) this.f123971a).g(routeInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f123982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f123983b;

        public d() {
            throw new UnsupportedOperationException();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public boolean a(@NonNull MediaRouter.RouteInfo routeInfo) {
            Method method = this.f123982a;
            if (method != null) {
                try {
                    if (((Integer) method.invoke(routeInfo, null)).intValue() == this.f123983b) {
                        return true;
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {
        @Nullable
        public static Display a(@NonNull MediaRouter.RouteInfo routeInfo) {
            try {
                return routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError e10) {
                Log.w(j2.f123976a, "Cannot get presentation display for the route.", e10);
                return null;
            }
        }

        public static boolean b(@NonNull MediaRouter.RouteInfo routeInfo) {
            return routeInfo.isEnabled();
        }
    }

    public static c<b> a(b bVar) {
        return new c<>(bVar);
    }
}
