package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.weakreference.a f53161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53164d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f53161a = new com.iab.omid.library.fyber.weakreference.a(view);
        this.f53162b = view.getClass().getCanonicalName();
        this.f53163c = friendlyObstructionPurpose;
        this.f53164d = str;
    }

    public String a() {
        return this.f53164d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53163c;
    }

    public com.iab.omid.library.fyber.weakreference.a c() {
        return this.f53161a;
    }

    public String d() {
        return this.f53162b;
    }
}
