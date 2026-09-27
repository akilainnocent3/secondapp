package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f47620b = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f47621a;

    public x1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = f47620b;
        }
        w1 w1Var = new w1(r0.f47552a, b2Var);
        Charset charset = l1.f47517a;
        this.f47621a = w1Var;
    }
}
