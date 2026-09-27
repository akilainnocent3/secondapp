package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f39055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, ContentResolver contentResolver) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(contentResolver, "contentResolver");
        this.f39055b = contentResolver;
    }

    public f1 b() {
        mi miVar = mi.TRACKING_UNKNOWN;
        String str = null;
        try {
            boolean z10 = Settings.Secure.getInt(this.f39055b, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            String string = Settings.Secure.getString(this.f39055b, "advertising_id");
            if (z10 || kotlin.jvm.internal.m0.g(string, "00000000-0000-0000-0000-000000000000") || a()) {
                miVar = mi.TRACKING_LIMITED;
            } else {
                miVar = mi.TRACKING_ENABLED;
                str = string;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return new f1(miVar, str);
    }
}
