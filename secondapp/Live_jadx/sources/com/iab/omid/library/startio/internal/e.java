package com.iab.omid.library.startio.internal;

import android.view.View;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.startio.weakreference.a f53879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53882d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f53879a = new com.iab.omid.library.startio.weakreference.a(view);
        this.f53880b = view.getClass().getCanonicalName();
        this.f53881c = friendlyObstructionPurpose;
        this.f53882d = str;
    }

    public String a() {
        return this.f53882d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53881c;
    }

    public com.iab.omid.library.startio.weakreference.a c() {
        return this.f53879a;
    }

    public String d() {
        return this.f53880b;
    }
}
