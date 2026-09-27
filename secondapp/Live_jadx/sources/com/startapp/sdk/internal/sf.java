package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class sf implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f75509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5 f75510b;

    public sf(SharedPreferences sharedPreferences) {
        this.f75509a = sharedPreferences;
        this.f75510b = null;
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf edit() {
        return new rf(this.f75509a.edit(), this.f75509a.getAll(), this.f75510b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f75509a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f75509a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        try {
            return this.f75509a.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        try {
            return this.f75509a.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        try {
            return this.f75509a.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        try {
            return this.f75509a.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f75509a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f75509a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f75509a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f75509a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public sf(SharedPreferences sharedPreferences, b5 b5Var) {
        this.f75509a = sharedPreferences;
        this.f75510b = b5Var;
    }
}
