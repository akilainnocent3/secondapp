package com.bytedance.sdk.component.hv.sd.hww.hww;

import android.util.Log;
import com.bytedance.sdk.component.utils.nod;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements com.bytedance.sdk.component.hv.sd {
    private long hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f34707tq;

    public tq(File file, long j10, ExecutorService executorService) {
        this.hww = j10;
        try {
            this.f34707tq = hww.hww(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.hv.hww
    /* JADX INFO: renamed from: sd, reason: merged with bridge method [inline-methods] */
    public boolean tq(String str) {
        try {
            try {
                hww.sd sdVarHww = this.f34707tq.hww(str);
                boolean z10 = sdVarHww != null;
                nod.hww(sdVarHww);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                nod.hww(null);
                return false;
            }
        } catch (Throwable th2) {
            nod.hww(null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.bytedance.sdk.component.hv.hww
    /* JADX INFO: renamed from: tq, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] hww(String str) throws Throwable {
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        hww hwwVar = this.f34707tq;
        ?? r11 = 0;
        if (hwwVar != null) {
            try {
                if (str != 0) {
                    try {
                        hww.sd sdVarHww = hwwVar.hww((String) str);
                        if (sdVarHww == null) {
                            nod.hww(null);
                            nod.hww(null);
                            return null;
                        }
                        str = sdVarHww.hww(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i10 = str.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r10 = str;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                byteArrayOutputStream = null;
                                r10 = str;
                            } catch (Throwable th2) {
                                th = th2;
                                r11 = str;
                                nod.hww(r11);
                                nod.hww(0);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        nod.hww(str);
                        nod.hww(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        r10 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        nod.hww(r11);
                        nod.hww(0);
                        throw th;
                    }
                    Log.w("LruCountDiskCache", e.toString());
                    nod.hww(r10);
                    nod.hww(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.hv.sd
    public InputStream hww(String str) throws Throwable {
        hww hwwVar = this.f34707tq;
        if (hwwVar == null) {
            return null;
        }
        try {
            hww.sd sdVarHww = hwwVar.hww(str);
            if (sdVarHww != null) {
                return sdVarHww.hww(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, byte[] bArr) throws Throwable {
        hww hwwVar = this.f34707tq;
        if (hwwVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable = null;
        hww.C0323hww c0323hww = null;
        try {
            try {
                hww.C0323hww c0323hwwTq = hwwVar.tq(str);
                try {
                    if (c0323hwwTq == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        nod.hww(null);
                        return false;
                    }
                    OutputStream outputStreamHww = c0323hwwTq.hww(0);
                    if (outputStreamHww == hww.f34685sd) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        nod.hww(outputStreamHww);
                        return false;
                    }
                    outputStreamHww.write(bArr);
                    c0323hwwTq.hww();
                    this.f34707tq.hww();
                    nod.hww(outputStreamHww);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    c0323hww = c0323hwwTq;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0323hww != null) {
                            try {
                                c0323hww.tq();
                            } catch (IOException unused) {
                            }
                        }
                        nod.hww(0);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = closeable;
                        nod.hww(closeable);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            nod.hww(closeable);
            throw th;
        }
    }
}
