package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f66591a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f66592b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f66592b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f66592b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f66592b.clear();
    }
}
