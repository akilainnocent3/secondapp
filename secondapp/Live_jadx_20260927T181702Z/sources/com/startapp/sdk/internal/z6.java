package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei f75956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f75957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w6 f75958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f75959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f75960e;

    static {
        kotlin.jvm.internal.m0.o(z6.class.getSimpleName(), "getSimpleName(...)");
    }

    public z6(Object emitterObj, ei startEvent, e3 clock) {
        kotlin.jvm.internal.m0.p(emitterObj, "emitterObj");
        kotlin.jvm.internal.m0.p(startEvent, "startEvent");
        kotlin.jvm.internal.m0.p(clock, "clock");
        this.f75956a = startEvent;
        this.f75957b = clock;
        this.f75958c = new w6(emitterObj);
        this.f75959d = new ArrayList();
        this.f75960e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object obj) {
        kotlin.jvm.internal.m0.p(emitterObject, "emitterObject");
        kotlin.jvm.internal.m0.p(obj, "relativeEmitterObject");
        if (this.f75958c.a(emitterObject)) {
            w6 w6Var = this.f75958c;
            w6Var.getClass();
            kotlin.jvm.internal.m0.p(obj, "obj");
            if (w6Var.a(obj)) {
                return;
            }
            w6Var.f75773b.add(new w6(obj));
        }
    }

    public final void a(n8 emitterObject, HashMap keyValues) {
        kotlin.jvm.internal.m0.p(emitterObject, "emitterObject");
        kotlin.jvm.internal.m0.p(keyValues, "keyValues");
        if (this.f75958c.a(emitterObject)) {
            long jA = this.f75957b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                ei eiVar = (ei) entry.getKey();
                String str = (String) entry.getValue();
                List arrayList = (List) this.f75960e.get(eiVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f75960e.put(eiVar, arrayList);
                }
                arrayList.add(new dr.z0(str, Long.valueOf(jA)));
            }
        }
    }
}
