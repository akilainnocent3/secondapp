package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f54559b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f54560a;

    public Ea(Context context, String str) {
        this.f54560a = context.getSharedPreferences(str, 0);
    }

    public static void a(Ea ea2, String key, boolean z10) {
        kotlin.jvm.internal.m0.p(key, "key");
        SharedPreferences.Editor editorEdit = ea2.f54560a.edit();
        editorEdit.putBoolean(key, z10);
        editorEdit.apply();
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(key, "key");
        if (!this.f54560a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f54560a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public final void a(String key, String str, boolean z10) {
        kotlin.jvm.internal.m0.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f54560a.edit();
        editorEdit.putString(key, str);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, int i10, boolean z10) {
        kotlin.jvm.internal.m0.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f54560a.edit();
        editorEdit.putInt(key, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, long j10, boolean z10) {
        kotlin.jvm.internal.m0.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f54560a.edit();
        editorEdit.putLong(key, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
