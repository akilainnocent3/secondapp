package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f18373a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f18374b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f18375c = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f18376d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final String f18377e = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final String f18378f = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final String f18379g = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f18380h = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final String f18381i = "DROP_SHADER_CACHE";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements c.d {
        public a() {
        }

        @Override // androidx.profileinstaller.c.d
        public void a(int i10, @Nullable Object obj) {
            c.f18402h.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i10, @Nullable Object obj) {
            c.f18402h.b(i10, obj);
        }
    }

    public static void a(@NonNull c.d dVar) {
        if (Build.VERSION.SDK_INT < 24) {
            dVar.a(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            dVar.a(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f18373a.equals(action)) {
            c.l(context, new i5.b(), new a(), true);
            return;
        }
        if (f18375c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f18377e);
                if (f18378f.equals(string)) {
                    c.m(context, new i5.b(), new a());
                    return;
                } else {
                    if (f18379g.equals(string)) {
                        c.d(context, new i5.b(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f18374b.equals(action)) {
            a(new a());
            return;
        }
        if (!f18376d.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(f18380h);
        a aVar = new a();
        if (f18381i.equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
