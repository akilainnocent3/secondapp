package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f70300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f70301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f70302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f70303z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f70300w = j10;
        } else {
            this.f70300w = 60000L;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f70301x == null) {
            this.f70301x = new HashMap();
        }
        try {
            this.f70301x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f70302y == null) {
            this.f70302y = new HashMap();
        }
        try {
            this.f70302y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f70302y == null) {
            this.f70302y = new HashMap();
        }
        this.f70302y.put("Charset", "UTF-8");
        return this.f70302y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f70301x == null) {
            this.f70301x = new HashMap();
        }
        return this.f70301x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f70303z == null) {
            this.f70303z = new e(30000, this.f70300w, 3);
        }
        return this.f70303z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
