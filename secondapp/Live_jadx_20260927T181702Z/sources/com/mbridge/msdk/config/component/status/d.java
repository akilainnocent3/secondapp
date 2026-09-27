package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f65679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f65680b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f65681c = new ArrayList<>(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f65682d = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f65679a == null || !d.this.f65679a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f65679a.getAll().get(str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("value"), obj);
            } catch (Exception unused) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("value"), d.this.f65679a.getString(str, ""));
            }
            if (d.this.f65680b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f65680b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f65679a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f65682d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f65681c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f65681c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f65680b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f65681c.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }
}
