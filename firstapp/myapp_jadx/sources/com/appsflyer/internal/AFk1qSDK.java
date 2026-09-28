package com.appsflyer.internal;

import com.google.protobuf.Reader;
import defpackage.ib5;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1qSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private short component1;
    private int component2;
    private byte[] component3;
    private long[] component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private int getMediationNetwork;
    private long[] getMonetizationNetwork;
    private final int getRevenue;

    private AFk1qSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMediationNetwork = 1;
        this.component2 = Reader.READ_DONE;
        int iMin = Math.min(Math.max((int) s, 4), 8);
        this.AFAdRevenueData = iMin;
        this.component3 = new byte[iMin];
        this.getMonetizationNetwork = new long[4];
        this.component4 = new long[4];
        this.areAllFieldsValid = iMin;
        this.equals = iMin;
        this.getMonetizationNetwork = AFk1rSDK.AFAdRevenueData(i ^ i4, iMin ^ i4);
        this.component4 = AFk1rSDK.AFAdRevenueData(i2 ^ i4, i3 ^ i4);
        this.getRevenue = 100;
        this.getCurrencyIso4217Code = 100;
    }

    private int getMediationNetwork() throws IOException {
        int i = this.component2;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.component2 = i;
        }
        if (this.areAllFieldsValid == this.AFAdRevenueData) {
            this.component3[0] = (byte) i;
            if (i < 0) {
                ib5.a("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.component3, i2, this.AFAdRevenueData - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < this.AFAdRevenueData);
            if (i2 < this.AFAdRevenueData) {
                ib5.a("unexpected block size");
                return 0;
            }
            int i4 = this.getRevenue;
            if (i4 == this.getCurrencyIso4217Code) {
                getMonetizationNetwork();
            } else {
                if (this.getMediationNetwork <= i4) {
                    getMonetizationNetwork();
                }
                int i5 = this.getMediationNetwork;
                if (i5 < this.getCurrencyIso4217Code) {
                    this.getMediationNetwork = i5 + 1;
                } else {
                    this.getMediationNetwork = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.component2 = i6;
            this.areAllFieldsValid = 0;
            int i7 = this.AFAdRevenueData;
            if (i6 < 0) {
                i7 -= this.component3[i7 - 1] & 255;
            }
            this.equals = i7;
        }
        return this.equals;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getMonetizationNetwork;
        long[] jArr2 = this.component4;
        short s = this.component1;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.AFAdRevenueData; i2++) {
            byte[] bArr = this.component3;
            bArr[i2] = (byte) (((long) bArr[i2]) ^ ((this.getMonetizationNetwork[this.component1] >> (i2 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.equals - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMediationNetwork();
            int i5 = this.areAllFieldsValid;
            if (i5 >= this.equals) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component3;
            this.areAllFieldsValid = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i = this.areAllFieldsValid;
        if (i >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component3;
        this.areAllFieldsValid = i + 1;
        return bArr[i] & 255;
    }

    public AFk1qSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }
}
