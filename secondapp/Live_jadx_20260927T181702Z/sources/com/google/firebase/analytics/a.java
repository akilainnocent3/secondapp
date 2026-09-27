package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public FirebaseAnalytics.a f52122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public FirebaseAnalytics.a f52123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public FirebaseAnalytics.a f52124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public FirebaseAnalytics.a f52125d;

    @l
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.a aVar = this.f52122a;
        if (aVar != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_STORAGE, aVar);
        }
        FirebaseAnalytics.a aVar2 = this.f52123b;
        if (aVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, aVar2);
        }
        FirebaseAnalytics.a aVar3 = this.f52124c;
        if (aVar3 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_USER_DATA, aVar3);
        }
        FirebaseAnalytics.a aVar4 = this.f52125d;
        if (aVar4 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, aVar4);
        }
        return linkedHashMap;
    }

    @Nullable
    public final FirebaseAnalytics.a b() {
        return this.f52125d;
    }

    @Nullable
    public final FirebaseAnalytics.a c() {
        return this.f52122a;
    }

    @Nullable
    public final FirebaseAnalytics.a d() {
        return this.f52124c;
    }

    @Nullable
    public final FirebaseAnalytics.a e() {
        return this.f52123b;
    }

    public final void f(@m FirebaseAnalytics.a aVar) {
        this.f52125d = aVar;
    }

    public final void g(@m FirebaseAnalytics.a aVar) {
        this.f52122a = aVar;
    }

    public final void h(@m FirebaseAnalytics.a aVar) {
        this.f52124c = aVar;
    }

    public final void i(@m FirebaseAnalytics.a aVar) {
        this.f52123b = aVar;
    }
}
