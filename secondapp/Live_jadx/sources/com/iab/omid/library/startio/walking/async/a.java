package com.iab.omid.library.startio.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet f53962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53964e;

    public a(b.InterfaceC0530b interfaceC0530b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0530b);
        this.f53962c = new HashSet(hashSet);
        this.f53963d = jSONObject;
        this.f53964e = j10;
    }
}
