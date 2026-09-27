package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AF implements InterfaceC3396pF {
    public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
    public long A00;
    public boolean A01;
    public final C5W A02;
    public final InterfaceC3396pF A03;

    public AF(InterfaceC3396pF interfaceC3396pF, C5W c5w) {
        this.A03 = (InterfaceC3396pF) AbstractC16843y.A01(interfaceC3396pF);
        this.A02 = (C5W) AbstractC16843y.A01(c5w);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final void A43(InterfaceC17315t interfaceC17315t) {
        AbstractC16843y.A01(interfaceC17315t);
        this.A03.A43(interfaceC17315t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final long AGi(C17205i c17205i) throws IOException {
        this.A00 = this.A03.AGi(c17205i);
        if (this.A00 == 0) {
            return 0L;
        }
        long j10 = c17205i.A03;
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
        strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
        if (j10 == -1 && this.A00 != -1) {
            c17205i = c17205i.A05(0L, this.A00);
        }
        this.A01 = true;
        this.A02.AGk(c17205i);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16402c
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 != 0) {
            int i12 = this.A03.read(bArr, i10, i11);
            if (i12 > 0) {
                this.A02.write(bArr, i10, i12);
                if (this.A00 != -1) {
                    this.A00 -= (long) i12;
                }
            }
            return i12;
        }
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
        strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
        return -1;
    }
}
