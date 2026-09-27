package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nAndroidManifestIntPropertyReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidManifestIntPropertyReader.kt\ncom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class AndroidManifestIntPropertyReader {

    @l
    private final Context context;

    public AndroidManifestIntPropertyReader(@l Context context) {
        m0.p(context, "context");
        this.context = context;
    }

    @m
    public final Integer getPropertyByName(@l String propertyName) {
        m0.p(propertyName, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer numValueOf = Integer.valueOf(bundle.getInt(propertyName));
            if (bundle.containsKey(propertyName)) {
                return numValueOf;
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
