package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f28430b;

    private q4(String str, Map map) {
        this.f28429a = str;
        this.f28430b = map;
    }

    public static q4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f28429a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f28429a + "'params='" + this.f28430b + '\'' + fw.b.f85383j;
    }

    public static q4 a(String str, Map map) {
        return new q4(str, map);
    }

    public Map a() {
        return this.f28430b;
    }
}
