package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1886Ck implements InterfaceC2867gB {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, c.f161638p, 48, 28, c.G, 7, c.f161648z, c.G, 7, 73, 83, 42, c.G, c.E, c.G, 17, c.f161638p, c.G, 88, 13, 10, c.f161646x, 66, 88, c.H, 57, 44, 57, 56, 62, 119, 109};
    }

    public C1886Ck(boolean z10) {
        this.A00 = z10;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2867gB
    public final boolean AAZ() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2867gB
    public final void ABt(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2867gB
    public final void ABu(InterfaceC2850fu interfaceC2850fu) {
        if (interfaceC2850fu != null) {
            String str = A00(11, 13, 6) + interfaceC2850fu.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC2850fu.A9C();
            A02(interfaceC2850fu.A8E());
        }
    }
}
