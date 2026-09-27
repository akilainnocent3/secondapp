package com.bytedance.sdk.component.hv.vy.sd.hww.hww;

import com.bytedance.sdk.component.hv.sd;
import com.bytedance.sdk.component.utils.nod;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements sd {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f34788tq;

    public tq(File file, long j10) {
        int i10 = (int) j10;
        this.hww = i10;
        this.f34788tq = hww.hww(i10, file);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    /* JADX INFO: renamed from: sd, reason: merged with bridge method [inline-methods] */
    public boolean tq(String str) {
        try {
            InputStream inputStreamHww = this.f34788tq.hww(str);
            boolean z10 = inputStreamHww != null;
            nod.hww(inputStreamHww);
            return z10;
        } catch (Throwable th2) {
            try {
                th2.getMessage();
                return false;
            } finally {
                nod.hww(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.hv.hww
    /* JADX INFO: renamed from: tq, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] hww(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStreamHww;
        hww hwwVar = this.f34788tq;
        if (hwwVar != null && str != null) {
            try {
                inputStreamHww = hwwVar.hww(str);
                if (inputStreamHww != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStreamHww.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            nod.hww(inputStreamHww);
                            nod.hww(byteArrayOutputStream);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        byteArrayOutputStream = null;
                        nod.hww(inputStreamHww);
                        nod.hww(byteArrayOutputStream);
                        throw th2;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    nod.hww(inputStreamHww);
                    nod.hww(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamHww = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                byteArrayOutputStream = null;
                th2 = th5;
                inputStreamHww = null;
            }
            nod.hww(inputStreamHww);
            nod.hww(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.hv.sd
    public InputStream hww(String str) {
        hww hwwVar = this.f34788tq;
        if (hwwVar == null) {
            return null;
        }
        return hwwVar.hww(str);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, byte[] bArr) {
        hww hwwVar = this.f34788tq;
        if (hwwVar == null || bArr == null || str == null) {
            return false;
        }
        return hwwVar.hww(str, bArr);
    }
}
