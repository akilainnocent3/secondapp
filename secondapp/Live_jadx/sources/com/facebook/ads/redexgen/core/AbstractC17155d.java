package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC17155d {
    public static void A00(InterfaceC3396pF interfaceC3396pF) {
        if (interfaceC3396pF != null) {
            try {
                interfaceC3396pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
