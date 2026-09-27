package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Ye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f96837c = "Ye";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f96838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96839b;

    public Ye(Ia ia2, String str) {
        this.f96838a = ia2;
        this.f96839b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, float f10) {
        synchronized (this) {
            this.f96838a.a(str, f10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, String str2) {
        synchronized (this) {
            this.f96838a.a(str, str2);
        }
        return this;
    }

    public final Ze c(String str) {
        return new Ze(str, this.f96839b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T d(String str) {
        synchronized (this) {
            this.f96838a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.f96838a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f96838a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, long j10) {
        synchronized (this) {
            this.f96838a.a(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends Ye> T b(String str, int i10) {
        synchronized (this) {
            this.f96838a.a(i10, str);
        }
        return this;
    }

    public final <T extends Ye> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j10) {
        return this.f96838a.getLong(str, j10);
    }

    public final int a(@NonNull String str, int i10) {
        return this.f96838a.getInt(str, i10);
    }

    @Nullable
    public final String a(@NonNull String str, @Nullable String str2) {
        return this.f96838a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, boolean z10) {
        synchronized (this) {
            this.f96838a.a(str, z10);
        }
        return this;
    }

    public final boolean a(String str, boolean z10) {
        return this.f96838a.getBoolean(str, z10);
    }

    public final void b() {
        synchronized (this) {
            this.f96838a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f96838a.a(str);
    }
}
