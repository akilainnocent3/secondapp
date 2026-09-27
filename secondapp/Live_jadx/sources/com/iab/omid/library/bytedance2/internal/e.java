package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f52891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f52893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f52894d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f52891a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f52892b = view.getClass().getCanonicalName();
        this.f52893c = friendlyObstructionPurpose;
        this.f52894d = str;
    }

    public String a() {
        return this.f52894d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f52893c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f52891a;
    }

    public String d() {
        return this.f52892b;
    }
}
