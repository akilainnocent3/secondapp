package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f53572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53575d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f53572a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f53573b = view.getClass().getCanonicalName();
        this.f53574c = friendlyObstructionPurpose;
        this.f53575d = str;
    }

    public String a() {
        return this.f53575d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53574c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f53572a;
    }

    public String d() {
        return this.f53573b;
    }
}
