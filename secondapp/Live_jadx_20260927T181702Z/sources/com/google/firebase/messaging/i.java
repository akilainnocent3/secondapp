package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52319b = "|T|";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52320c = "*";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52321d = "com.google.android.gms.appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52322e = "com.google.android.gms.appid-no-backup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f52323a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f52324d = "token";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f52325e = "appVersion";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f52326f = "timestamp";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f52327g = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52330c;

        public a(String str, String str2, long j10) {
            this.f52328a = str;
            this.f52329b = str2;
            this.f52330c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.f52330c + f52327g || !str.equals(this.f52329b);
        }
    }

    public i(Context context) {
        this.f52323a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, f52322e);
    }

    public final void a(Context context, String str) {
        File file = new File(f1.d.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public final String b(String str, String str2) {
        return str + "|T|" + str2 + il.b.f94863g + "*";
    }

    public synchronized void c() {
        this.f52323a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String strB = b(str, str2);
        SharedPreferences.Editor editorEdit = this.f52323a.edit();
        editorEdit.remove(strB);
        editorEdit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f52323a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f52323a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f52323a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
