package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f54021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f54023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54024d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f54021a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f54022b = view.getClass().getCanonicalName();
        this.f54023c = friendlyObstructionPurpose;
        this.f54024d = str;
    }

    public String a() {
        return this.f54024d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f54023c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f54021a;
    }

    public String d() {
        return this.f54022b;
    }
}
