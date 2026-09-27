package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class rf implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f75462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f75463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b5 f75464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75465d;

    public rf(SharedPreferences.Editor editor, Map map, b5 b5Var) {
        this.f75462a = editor;
        this.f75463b = map;
        this.f75464c = b5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f75464c == null || si.a(this.f75463b.get(str), obj)) {
            return;
        }
        this.f75465d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f75462a.apply();
        b5 b5Var = this.f75464c;
        if (b5Var == null || !this.f75465d) {
            return;
        }
        this.f75465d = false;
        mg.f75201d.a(b5Var.f74583a.f74629a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f75463b.isEmpty()) {
            this.f75465d = true;
        }
        this.f75462a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f75462a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        this.f75462a.putBoolean(str, z10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        this.f75462a.putFloat(str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        this.f75462a.putInt(str, i10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        this.f75462a.putLong(str, j10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f75462a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f75462a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f75463b.containsKey(str)) {
            this.f75465d = true;
        }
        this.f75462a.remove(str);
        return this;
    }
}
