package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4 implements F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f58513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f58514b;

    public C4(@oy.l Context context, @oy.l String fileName) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f58513a = sharedPreferences;
        this.f58514b = sharedPreferences.edit();
    }

    @Override // com.ironsource.F4
    @oy.m
    public String a(@oy.l String key, @oy.m String str) {
        kotlin.jvm.internal.m0.p(key, "key");
        try {
            return this.f58513a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.F4
    @oy.l
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f58513a.getAll();
        kotlin.jvm.internal.m0.o(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.F4
    public void b(@oy.l String key, @oy.l String value) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        this.f58514b.putString(key, value).apply();
    }

    @Override // com.ironsource.F4
    public void a(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        this.f58514b.remove(key).apply();
    }
}
