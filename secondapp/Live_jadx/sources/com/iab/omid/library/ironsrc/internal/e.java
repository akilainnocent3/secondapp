package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f53437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53440d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f53437a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f53438b = view.getClass().getCanonicalName();
        this.f53439c = friendlyObstructionPurpose;
        this.f53440d = str;
    }

    public String a() {
        return this.f53440d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53439c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f53437a;
    }

    public String d() {
        return this.f53438b;
    }
}
