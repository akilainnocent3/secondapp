package com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f42493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f42494b;

    public c(Context context) {
        this.f42493a = PreferenceManager.getDefaultSharedPreferences(context);
        this.f42494b = context.getFilesDir();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b
    public boolean a(File file, String str) {
        return file.exists() && this.f42493a.contains(str);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b
    public void b(String str) {
        this.f42493a.edit().remove(str).apply();
        e(new File(this.f42494b, str));
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b
    public void c(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || !parentFile.mkdirs()) {
            return;
        }
        com.cleveradssolutions.adapters.exchange.b.b("JsScriptsStorage", "Subfolders created");
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b
    public File d(String str) {
        return new File(this.f42494b, str);
    }

    public final void e(File file) {
        try {
            if (file.delete()) {
                com.cleveradssolutions.adapters.exchange.b.b("JsScriptsStorage", "Not fully downloaded file removed.");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b
    public void f(String str) {
        this.f42493a.edit().putBoolean(str, true).apply();
    }
}
