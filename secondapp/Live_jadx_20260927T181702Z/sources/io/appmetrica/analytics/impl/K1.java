package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5322qa f96033a = new C5322qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f96034b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f96035c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(@oy.m Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f96033a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f96034b.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public final void d(@oy.m Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C5322qa c5322qa = this.f96033a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c5322qa.f98186a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c5322qa.f98187b) {
                        c5322qa.f98186a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f96035c.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public final void a(@oy.l Intent intent, int i10) {
    }

    public final void b(@oy.m Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f96033a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f96034b.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public final void a(@oy.l Intent intent, int i10, int i11) {
    }

    public final void a(@oy.l Configuration configuration) {
    }

    public final void a(@oy.l J1 j10) {
        this.f96035c.put(j10, new I1() { // from class: io.appmetrica.analytics.impl.gp
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.a(this.f97478a, intent);
            }
        });
    }

    public static final boolean a(K1 k10, Intent intent) {
        k10.getClass();
        if (!kotlin.jvm.internal.m0.g("io.appmetrica.analytics.IAppMetricaService", intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) k10.f96033a.f98186a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(@oy.l J1 j10) {
        this.f96034b.put(j10, new I1() { // from class: io.appmetrica.analytics.impl.ip
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.c(this.f97597a, intent);
            }
        });
    }

    public static final boolean c(K1 k10, Intent intent) {
        k10.getClass();
        return kotlin.jvm.internal.m0.g("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(@oy.l J1 j10) {
        this.f96034b.put(j10, new I1() { // from class: io.appmetrica.analytics.impl.hp
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.b(this.f97544a, intent);
            }
        });
    }

    public static final boolean b(K1 k10, Intent intent) {
        Collection collection;
        k10.getClass();
        return kotlin.jvm.internal.m0.g("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) k10.f96033a.f98186a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.m0.g(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            kotlin.jvm.internal.m0.m(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
