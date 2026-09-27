package q4;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q implements j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f121507c = "MediaSessionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f121508d = j.f121497c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f121509e = "android.permission.STATUS_BAR_SERVICE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f121510f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f121511g = "enabled_notification_listeners";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f121512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f121513b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f121514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f121515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f121516c;

        public a(String str, int i10, int i11) {
            this.f121514a = str;
            this.f121515b = i10;
            this.f121516c = i11;
        }

        @Override // q4.j.c
        public int a() {
            return this.f121515b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f121515b < 0 || aVar.f121515b < 0) {
                return TextUtils.equals(this.f121514a, aVar.f121514a) && this.f121516c == aVar.f121516c;
            }
            return TextUtils.equals(this.f121514a, aVar.f121514a) && this.f121515b == aVar.f121515b && this.f121516c == aVar.f121516c;
        }

        @Override // q4.j.c
        public String getPackageName() {
            return this.f121514a;
        }

        @Override // q4.j.c
        public int getUid() {
            return this.f121516c;
        }

        public int hashCode() {
            return e2.s.b(this.f121514a, Integer.valueOf(this.f121516c));
        }
    }

    public q(Context context) {
        this.f121512a = context;
        this.f121513b = context.getContentResolver();
    }

    @Override // q4.j.a
    public boolean a(@NonNull j.c cVar) {
        try {
            if (this.f121512a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0) == null) {
                return false;
            }
            return c(cVar, "android.permission.STATUS_BAR_SERVICE") || c(cVar, "android.permission.MEDIA_CONTENT_CONTROL") || cVar.getUid() == 1000 || b(cVar);
        } catch (PackageManager.NameNotFoundException unused) {
            if (f121508d) {
                Log.d("MediaSessionManager", "Package " + cVar.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    public boolean b(@NonNull j.c cVar) {
        String string = Settings.Secure.getString(this.f121513b, "enabled_notification_listeners");
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

    public final boolean c(j.c cVar, String str) {
        if (cVar.a() < 0) {
            return this.f121512a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0;
        }
        return this.f121512a.checkPermission(str, cVar.a(), cVar.getUid()) == 0;
    }

    @Override // q4.j.a
    public Context getContext() {
        return this.f121512a;
    }
}
