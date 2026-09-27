package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3138kq implements InterfaceC2118Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C3138kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2118Ll
    public final void AGj(int i10) throws C3135kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2118Ll
    public final void close() throws C3135kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2118Ll
    public final int length() throws C3135kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2118Ll
    public final int read(byte[] bArr) throws C3135kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
