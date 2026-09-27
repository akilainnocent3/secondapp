package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f47941c;

    public d1(WebResourceRequest webResourceRequest) {
        this.f47939a = webResourceRequest.getUrl().toString();
        this.f47940b = webResourceRequest.getMethod();
        this.f47941c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f47939a.equals(d1Var.f47939a) && this.f47940b.equals(d1Var.f47940b)) {
            return this.f47941c.equals(d1Var.f47941c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47941c.hashCode() + ((this.f47940b.hashCode() + (this.f47939a.hashCode() * 31)) * 31);
    }
}
