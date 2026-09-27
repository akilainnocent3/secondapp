package androidx.media3.session.legacy;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import e2.s;
import k.t0;
import k.y0;
import x4.d0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16081b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16082c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile j f16083d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f16084a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f16085c = "MediaSessionManager";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f16086d = "android.permission.STATUS_BAR_SERVICE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f16087e = "android.permission.MEDIA_CONTENT_CONTROL";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f16088f = "enabled_notification_listeners";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f16089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ContentResolver f16090b;

        public a(Context context) {
            this.f16089a = context;
            this.f16090b = context.getContentResolver();
        }

        public final boolean a(c cVar) {
            return this.f16089a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.a(), cVar.getUid()) == 0;
        }

        public boolean b(c cVar) {
            String string = Settings.Secure.getString(this.f16090b, "enabled_notification_listeners");
            if (string != null) {
                for (String str : string.split(":")) {
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                    if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(cVar.getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean c(c cVar, String str) {
            if (cVar.a() < 0) {
                return this.f16089a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0;
            }
            return this.f16089a.checkPermission(str, cVar.a(), cVar.getUid()) == 0;
        }

        public boolean d(c cVar) {
            if (a(cVar)) {
                return true;
            }
            try {
                if (this.f16089a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0) == null) {
                    return false;
                }
                return c(cVar, "android.permission.STATUS_BAR_SERVICE") || c(cVar, "android.permission.MEDIA_CONTENT_CONTROL") || cVar.getUid() == 1000 || cVar.getUid() == Process.myUid() || b(cVar);
            } catch (PackageManager.NameNotFoundException unused) {
                d0.b("MediaSessionManager", "Package " + cVar.getPackageName() + " doesn't exist");
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        int a();

        String getPackageName();

        int getUid();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static final class d extends e {
        public d(String str, int i10, int i11) {
            super(str, i10, i11);
        }

        public static String b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16097c;

        public e(String str, int i10, int i11) {
            this.f16095a = str;
            this.f16096b = i10;
            this.f16097c = i11;
        }

        @Override // androidx.media3.session.legacy.j.c
        public int a() {
            return this.f16096b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f16096b < 0 || eVar.f16096b < 0) {
                return TextUtils.equals(this.f16095a, eVar.f16095a) && this.f16097c == eVar.f16097c;
            }
            return TextUtils.equals(this.f16095a, eVar.f16095a) && this.f16096b == eVar.f16096b && this.f16097c == eVar.f16097c;
        }

        @Override // androidx.media3.session.legacy.j.c
        public String getPackageName() {
            return this.f16095a;
        }

        @Override // androidx.media3.session.legacy.j.c
        public int getUid() {
            return this.f16097c;
        }

        public int hashCode() {
            return s.b(this.f16095a, Integer.valueOf(this.f16097c));
        }
    }

    public j(Context context) {
        this.f16084a = new a(context);
    }

    public static j a(Context context) {
        j jVar;
        synchronized (f16082c) {
            try {
                if (f16083d == null) {
                    f16083d = new j(context.getApplicationContext());
                }
                jVar = f16083d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public boolean b(b bVar) {
        return this.f16084a.d(bVar.f16094a);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f16091b = "android.media.session.MediaController";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16092c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f16093d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f16094a;

        public b(@Nullable String str, int i10, int i11) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f16094a = new d(str, i10, i11);
            } else {
                this.f16094a = new e(str, i10, i11);
            }
        }

        public String a() {
            return this.f16094a.getPackageName();
        }

        public int b() {
            return this.f16094a.a();
        }

        public int c() {
            return this.f16094a.getUid();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f16094a.equals(((b) obj).f16094a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16094a.hashCode();
        }

        @t0(28)
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strB = d.b(remoteUserInfo);
            if (strB != null) {
                if (!TextUtils.isEmpty(strB)) {
                    this.f16094a = new d(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
