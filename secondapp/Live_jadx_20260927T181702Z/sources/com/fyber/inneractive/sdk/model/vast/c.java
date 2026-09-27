package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f45174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f45181i = new HashMap();

    public c(i iVar, int i10, int i11, String str, int i12) {
        this.f45173a = iVar;
        this.f45175c = i10;
        this.f45176d = i11;
        this.f45177e = str;
        this.f45180h = i12;
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f45181i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f45181i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f45175c);
        sb2.append(" h:");
        sb2.append(this.f45176d);
        sb2.append(" type:");
        sb2.append(this.f45173a.toString());
        sb2.append(" creativeType: ");
        k kVar = this.f45174b;
        sb2.append(kVar != null ? kVar.mimeType : "none");
        sb2.append(" ctr:");
        sb2.append(this.f45179g);
        sb2.append(" events:");
        sb2.append(this.f45181i);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f45181i.isEmpty()) {
            return null;
        }
        return (List) this.f45181i.get(xVar);
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f45175c);
            jSONObject.put("h", this.f45176d);
            jSONObject.put("type", this.f45173a.toString());
            k kVar = this.f45174b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put("content", this.f45178f);
            return jSONObject;
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
            return jSONObject;
        }
    }
}
