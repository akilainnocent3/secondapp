package ck;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24828c = "Unity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24829d = "Flutter";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24830e = "com.google.firebase.crashlytics.unity_version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f24831f = "flutter_assets/NOTICES.Z";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f24833b = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f24834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f24835b;

        public b() {
            int iQ = fk.i.q(f.this.f24832a, f.f24830e, "string");
            if (iQ == 0) {
                if (!f.this.c(f.f24831f)) {
                    this.f24834a = null;
                    this.f24835b = null;
                    return;
                } else {
                    this.f24834a = f.f24829d;
                    this.f24835b = null;
                    g.f().k("Development platform is: Flutter");
                    return;
                }
            }
            this.f24834a = "Unity";
            String string = f.this.f24832a.getResources().getString(iQ);
            this.f24835b = string;
            g.f().k("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f24832a = context;
    }

    public static boolean g(Context context) {
        return fk.i.q(context, f24830e, "string") != 0;
    }

    public final boolean c(String str) {
        if (this.f24832a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f24832a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Nullable
    public String d() {
        return f().f24834a;
    }

    @Nullable
    public String e() {
        return f().f24835b;
    }

    public final b f() {
        if (this.f24833b == null) {
            this.f24833b = new b();
        }
        return this.f24833b;
    }
}
