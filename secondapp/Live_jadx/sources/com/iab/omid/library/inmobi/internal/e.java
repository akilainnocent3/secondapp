package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f53302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53305d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f53302a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f53303b = view.getClass().getCanonicalName();
        this.f53304c = friendlyObstructionPurpose;
        this.f53305d = str;
    }

    public String a() {
        return this.f53305d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53304c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f53302a;
    }

    public String d() {
        return this.f53303b;
    }
}
