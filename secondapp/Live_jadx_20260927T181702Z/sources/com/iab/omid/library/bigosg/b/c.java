package com.iab.omid.library.bigosg.b;

import android.support.annotation.Nullable;
import android.view.View;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f52765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f52767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f52768d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f52765a = new com.iab.omid.library.bigosg.e.a(view);
        this.f52766b = view.getClass().getCanonicalName();
        this.f52767c = friendlyObstructionPurpose;
        this.f52768d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f52765a;
    }

    public String b() {
        return this.f52766b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f52767c;
    }

    public String d() {
        return this.f52768d;
    }
}
