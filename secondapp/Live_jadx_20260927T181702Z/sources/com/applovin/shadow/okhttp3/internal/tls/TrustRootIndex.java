package com.applovin.shadow.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface TrustRootIndex {
    @m
    X509Certificate findByIssuerAndSignature(@l X509Certificate x509Certificate);
}
