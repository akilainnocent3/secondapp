package com.startapp.sdk.omsdk;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class VerificationDetails implements Serializable {
    private static final long serialVersionUID = -710990475280833437L;
    private String javascriptResourceUrl;
    private String vendorKey;
    private String verificationParameters;

    public VerificationDetails() {
    }

    public final String a() {
        return this.vendorKey;
    }

    public final String b() {
        return this.verificationParameters;
    }

    public final String c() {
        return this.javascriptResourceUrl;
    }

    public VerificationDetails(String str, String str2, String str3) {
        this.vendorKey = str;
        this.javascriptResourceUrl = str2;
        this.verificationParameters = str3;
    }
}
