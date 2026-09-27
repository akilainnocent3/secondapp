package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f54154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f54156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54157d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f54154a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f54155b = view.getClass().getCanonicalName();
        this.f54156c = friendlyObstructionPurpose;
        this.f54157d = str;
    }

    public String a() {
        return this.f54157d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f54156c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f54154a;
    }

    public String d() {
        return this.f54155b;
    }
}
