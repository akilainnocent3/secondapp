package com.iab.omid.library.chartboost.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.weakreference.a f53026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f53028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53029d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f53026a = new com.iab.omid.library.chartboost.weakreference.a(view);
        this.f53027b = view.getClass().getCanonicalName();
        this.f53028c = friendlyObstructionPurpose;
        this.f53029d = str;
    }

    public String a() {
        return this.f53029d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f53028c;
    }

    public com.iab.omid.library.chartboost.weakreference.a c() {
        return this.f53026a;
    }

    public String d() {
        return this.f53027b;
    }
}
