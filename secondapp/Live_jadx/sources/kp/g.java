package kp;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f102863a;

    public g(Context ctx) {
        this.f102863a = null;
        try {
            this.f102863a = ctx.getApplicationContext().getSharedPreferences(e.f102837a, 0);
        } catch (Throwable unused) {
        }
    }

    public String a(String key) {
        SharedPreferences sharedPreferences = this.f102863a;
        return sharedPreferences == null ? "" : sharedPreferences.getString(key, null);
    }

    public int b(String key) {
        return this.f102863a.getInt(key, 0);
    }

    public void c(String key, Object value) {
        SharedPreferences sharedPreferences = this.f102863a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(key, value.toString()).apply();
    }

    public void d(HashMap<String, Object> data) {
        SharedPreferences sharedPreferences = this.f102863a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue().toString());
        }
        editorEdit.apply();
    }
}
