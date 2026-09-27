package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f44382a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44383b;

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f44382a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f44383b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f44382a.isEmpty() || eVar.f44369b == null) {
            return false;
        }
        Iterator it = this.f44382a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f44369b)) {
                return !this.f44383b;
            }
        }
        return this.f44383b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f44382a, Boolean.valueOf(this.f44383b));
    }
}
