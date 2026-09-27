package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70299b;

    public g(String str, String str2) {
        this.f70298a = str;
        this.f70299b = str2;
    }

    public final String a() {
        return this.f70298a;
    }

    public final String b() {
        return this.f70299b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f70298a, gVar.f70298a) && TextUtils.equals(this.f70299b, gVar.f70299b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f70298a.hashCode() * 31) + this.f70299b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f70298a + ",value=" + this.f70299b + C4235d4.j.f61462e;
    }
}
