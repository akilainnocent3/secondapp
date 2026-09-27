package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1950Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C3415pY A01;
    public final Object A02;
    public final C17827s[] A03;
    public final InterfaceC3272nE[] A04;

    public C1950Ex(C17827s[] c17827sArr, InterfaceC3272nE[] interfaceC3272nEArr, C3415pY c3415pY, Object obj) {
        this.A03 = c17827sArr;
        this.A04 = (InterfaceC3272nE[]) interfaceC3272nEArr.clone();
        this.A01 = c3415pY;
        this.A02 = obj;
        this.A00 = c17827sArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C1950Ex c1950Ex, int i10) {
        if (c1950Ex == null) {
            return false;
        }
        C17827s[] c17827sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c17827sArr[i10], c1950Ex.A03[i10])) {
                return false;
            }
            InterfaceC3272nE interfaceC3272nE = this.A04[i10];
            InterfaceC3272nE interfaceC3272nE2 = c1950Ex.A04[i10];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC3272nE, interfaceC3272nE2);
            }
        }
        throw new RuntimeException();
    }
}
