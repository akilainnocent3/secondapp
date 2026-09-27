package q4;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f121496b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f121497c = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f121498d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f121499e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f121500a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(c cVar);

        Context getContext();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        int a();

        String getPackageName();

        int getUid();
    }

    public j(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f121500a = new p(context);
        } else {
            this.f121500a = new k(context);
        }
    }

    @NonNull
    public static j b(@NonNull Context context) {
        j jVar;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f121498d) {
            try {
                if (f121499e == null) {
                    f121499e = new j(context.getApplicationContext());
                }
                jVar = f121499e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public Context a() {
        return this.f121500a.getContext();
    }

    public boolean c(@NonNull b bVar) {
        if (bVar != null) {
            return this.f121500a.a(bVar.f121504a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f121501b = "android.media.session.MediaController";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final int f121502c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final int f121503d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f121504a;

        public b(@NonNull String str, int i10, int i11) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f121504a = new p.a(str, i10, i11);
            } else {
                this.f121504a = new q.a(str, i10, i11);
            }
        }

        @NonNull
        public String a() {
            return this.f121504a.getPackageName();
        }

        public int b() {
            return this.f121504a.a();
        }

        public int c() {
            return this.f121504a.getUid();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f121504a.equals(((b) obj).f121504a);
            }
            return false;
        }

        public int hashCode() {
            return this.f121504a.hashCode();
        }

        @t0(28)
        @y0({y0.a.LIBRARY})
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strB = p.a.b(remoteUserInfo);
            if (strB != null) {
                if (!TextUtils.isEmpty(strB)) {
                    this.f121504a = new p.a(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
