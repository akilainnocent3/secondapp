package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class xb implements re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f75821a;

    public xb(LinkedHashSet linkedHashSet) {
        this.f75821a = linkedHashSet;
    }

    @Override // com.startapp.sdk.internal.re
    public final JSONArray a() {
        LinkedHashSet<Locale> linkedHashSet = this.f75821a;
        JSONArray jSONArray = new JSONArray();
        for (Locale locale : linkedHashSet) {
            if (locale != null) {
                jSONArray.put(locale.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.startapp.sdk.internal.re
    public final String b() {
        return yb.a(null, this.f75821a, ';');
    }
}
