package com.chartboost.sdk.impl;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f38554a;

    public dg(Resources resources) {
        kotlin.jvm.internal.m0.p(resources, "resources");
        this.f38554a = resources;
    }

    public final String a(int i10) {
        try {
            InputStream inputStreamOpenRawResource = this.f38554a.openRawResource(i10);
            try {
                kotlin.jvm.internal.m0.m(inputStreamOpenRawResource);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, cv.g.f77202b), 8192);
                try {
                    String strM = xr.b0.m(bufferedReader);
                    xr.c.a(bufferedReader, null);
                    xr.c.a(inputStreamOpenRawResource, null);
                    return strM;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        xr.c.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    xr.c.a(inputStreamOpenRawResource, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            sb.b("Raw resource file exception", e10);
            return null;
        }
    }
}
