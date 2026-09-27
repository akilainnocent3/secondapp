package com.cleveradssolutions.internal.http;

import cv.g;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f43526c;

    public e(int i10, byte[] bArr, Throwable th2) {
        this.f43524a = i10;
        this.f43525b = bArr;
        this.f43526c = th2;
    }

    public final JSONObject a() {
        byte[] bArr = this.f43525b;
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length == 0) {
                return new JSONObject();
            }
            Object objNextValue = new JSONTokener(new String(bArr, g.f77202b)).nextValue();
            return objNextValue instanceof JSONObject ? (JSONObject) objNextValue : new JSONObject().put("data", objNextValue);
        } catch (Throwable unused) {
            return null;
        }
    }

    public /* synthetic */ e(int i10, byte[] bArr, Throwable th2, int i11) {
        this(i10, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : th2);
    }
}
