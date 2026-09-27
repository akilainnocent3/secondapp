package com.iab.omid.library.startio.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f53829d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f53830e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f53831a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f53832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List f53833c;

    private c(Context context) {
        this.f53832b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (f53830e == null) {
            synchronized (c.class) {
                try {
                    if (f53830e == null) {
                        f53830e = new c(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f53830e;
    }

    private void c() {
        f53829d.put("FireTVFOSDAT", j.a(this.f53832b));
    }

    public final boolean b() {
        return a().size() > 0;
    }

    public final List a() {
        b bVarA;
        if (this.f53833c != null) {
            return this.f53833c;
        }
        synchronized (this) {
            try {
                if (this.f53833c != null) {
                    return this.f53833c;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : f53829d.entrySet()) {
                        if (((k) entry.getValue()).a() && (bVarA = this.f53831a.a((String) entry.getKey(), this.f53832b)) != null) {
                            arrayList.add(bVarA);
                        }
                    }
                    this.f53833c = arrayList;
                    return this.f53833c;
                } catch (Exception e10) {
                    com.iab.omid.library.startio.utils.d.a("Error getting supported attestation mechanisms", e10);
                    this.f53833c = new ArrayList();
                    return this.f53833c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str) {
        k kVar = (k) f53829d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }
}
