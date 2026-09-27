package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f44380a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44381b;

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f44380a.add(strOptString);
                }
            }
        }
        this.f44381b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f44380a.isEmpty() || eVar.f44370c == null) {
            return false;
        }
        Iterator it = this.f44380a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f44370c.value())) {
                return !this.f44381b;
            }
        }
        return this.f44381b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f44380a, Boolean.valueOf(this.f44381b));
    }
}
