package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4458pa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C4458pa f63317c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f63318a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f63319b = new ConcurrentHashMap<>();

    public static synchronized C4458pa b() {
        try {
            if (f63317c == null) {
                f63317c = new C4458pa();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63317c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f63318a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f63319b;
    }

    public void d() {
        synchronized (this) {
            this.f63318a.clear();
        }
    }

    public void a(@oy.l ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f63318a.add(impressionDataListener);
        }
    }

    public void b(@oy.l ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f63318a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f63319b.put(str, list);
    }
}
