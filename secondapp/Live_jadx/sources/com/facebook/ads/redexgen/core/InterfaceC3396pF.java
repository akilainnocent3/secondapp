package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC3396pF extends InterfaceC16402c {
    void A43(InterfaceC17315t interfaceC17315t);

    Map<String, List<String>> A8t();

    Uri A9P();

    long AGi(C17205i c17205i) throws IOException;

    void close() throws IOException;
}
