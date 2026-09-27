package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f52635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f52637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f52638d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f52635a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f52636b = view.getClass().getCanonicalName();
        this.f52637c = friendlyObstructionPurpose;
        this.f52638d = str;
    }

    public String a() {
        return this.f52638d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f52637c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f52635a;
    }

    public String d() {
        return this.f52636b;
    }
}
