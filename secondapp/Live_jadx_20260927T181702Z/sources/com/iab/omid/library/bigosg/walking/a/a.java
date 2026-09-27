package com.iab.omid.library.bigosg.walking.a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f52834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f52835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f52836c;

    public a(b.InterfaceC0494b interfaceC0494b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0494b);
        this.f52834a = new HashSet<>(hashSet);
        this.f52835b = jSONObject;
        this.f52836c = j10;
    }
}
