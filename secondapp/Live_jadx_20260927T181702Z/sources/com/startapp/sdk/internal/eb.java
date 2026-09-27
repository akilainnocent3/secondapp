package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class eb extends se {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f74736b;

    public eb(Set set) {
        super(set);
        this.f74736b = new JSONObject();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        Object string;
        if (this.f75508a.contains(str)) {
            return;
        }
        try {
            if (obj instanceof re) {
                string = ((re) obj).a();
            } else {
                string = obj != null ? obj.toString() : null;
            }
            if (string != null) {
                this.f74736b.put(str, string);
            } else if (z10) {
                throw new SDKException(str);
            }
        } catch (JSONException e10) {
            if (z10) {
                throw new SDKException(str, e10);
            }
        }
    }

    public final String toString() {
        return this.f74736b.toString();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Set set) {
        if (this.f75508a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.f74736b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
