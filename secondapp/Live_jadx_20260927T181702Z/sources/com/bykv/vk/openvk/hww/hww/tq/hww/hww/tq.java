package com.bykv.vk.openvk.hww.hww.tq.hww.hww;

import com.bytedance.sdk.component.tq.hww.khx;
import com.bytedance.sdk.component.tq.hww.ny;
import com.bytedance.sdk.component.tq.hww.vhb;
import com.bytedance.sdk.component.tq.hww.weu;
import com.bytedance.sdk.component.utils.omn;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.vungle.ads.internal.protos.Sdk;
import f0.j3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import m5.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq implements sd {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private volatile long f31604ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f31605hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private File f31606hv;
    private boolean hww;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final com.bykv.vk.openvk.hww.hww.hww.sd.sd f31607ny;
    private RandomAccessFile vhb;
    private File vy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private volatile long f31611tq = j3.f81979h;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Object f31610sd = new Object();
    private volatile long vgm = -1;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private volatile int f31608ok = -100;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private volatile boolean f31609rs = false;
    private volatile boolean nod = false;

    public tq(com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar) {
        this.f31605hu = 0L;
        this.vhb = null;
        this.f31607ny = sdVar;
        try {
            String strHv = sdVar.hv();
            String strBs = sdVar.bs();
            this.vy = com.bykv.vk.openvk.hww.hww.tq.vy.tq.tq(strHv, strBs);
            this.f31606hv = com.bykv.vk.openvk.hww.hww.tq.vy.tq.sd(strHv, strBs);
            if (vy()) {
                this.vhb = new RandomAccessFile(this.f31606hv, "r");
            } else {
                this.vhb = new RandomAccessFile(this.vy, "rw");
            }
            if (!vy()) {
                this.f31605hu = this.vy.length();
                hww();
            }
            this.hww = com.bykv.vk.openvk.hww.hww.tq.hww.hu() == 2;
        } catch (Throwable unused) {
            sdVar.wgt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hu() throws IOException {
        synchronized (this.f31610sd) {
            if (vy()) {
                this.f31607ny.wgt();
                this.f31607ny.bs();
                return;
            }
            try {
                if (!this.vy.renameTo(this.f31606hv)) {
                    throw new IOException("Error renaming file " + this.vy + " to " + this.f31606hv + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.vhb;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.vhb = new RandomAccessFile(this.f31606hv, "rw");
                this.f31607ny.bs();
                this.f31607ny.wgt();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    private long hv() {
        return vy() ? this.f31606hv.length() : this.vy.length();
    }

    private boolean vy() {
        return this.f31606hv.exists();
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.hww.hww.sd
    public long sd() throws IOException {
        if (vy()) {
            this.f31611tq = this.f31606hv.length();
        } else {
            synchronized (this.f31610sd) {
                int i10 = 0;
                while (this.f31611tq == j3.f81979h && !this.f31609rs) {
                    try {
                        i10 += 15;
                        try {
                            this.f31610sd.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return this.f31611tq;
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.hww.hww.sd
    public void tq() {
        try {
            if (!this.f31609rs) {
                this.vhb.close();
            }
            File file = this.vy;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f31606hv;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f31609rs = true;
    }

    public void hww() {
        vhb.hww hwwVar;
        if (com.bykv.vk.openvk.hww.hww.hww.sd.vy() != null) {
            hwwVar = com.bykv.vk.openvk.hww.hww.hww.sd.vy().tq();
        } else {
            hwwVar = new vhb.hww("v_cache");
        }
        long jMrs = this.f31607ny.mrs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hwwVar.hww(jMrs, timeUnit).tq(this.f31607ny.omn(), timeUnit).sd(this.f31607ny.hnv(), timeUnit);
        vhb vhbVarHww = hwwVar.hww();
        this.f31607ny.bs();
        vhbVarHww.hww(new ny.hww().hww(f.c.C, "bytes=" + this.f31605hu + TokenBuilder.TOKEN_DELIMITER).tq(this.f31607ny.wgt()).hww().hww("videoLoadWhenPlaying").hww(9).tq()).hww(new com.bytedance.sdk.component.tq.hww.sd() { // from class: com.bykv.vk.openvk.hww.hww.tq.hww.hww.tq.1
            @Override // com.bytedance.sdk.component.tq.hww.sd
            public void hww(com.bytedance.sdk.component.tq.hww.tq tqVar, IOException iOException) {
                tq.this.hww(30000, iOException.getMessage());
            }

            /* JADX WARN: Code duplicated, block: B:85:0x01cc A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:83:0x01c7, B:85:0x01cc, B:86:0x01cf, B:88:0x01da, B:90:0x01ee), top: B:96:0x01c7 }] */
            @Override // com.bytedance.sdk.component.tq.hww.sd
            public void hww(com.bytedance.sdk.component.tq.hww.tq tqVar, khx khxVar) throws IOException {
                weu weuVarHu;
                if (khxVar == null) {
                    tq.this.hww(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamSd = null;
                try {
                    try {
                        tq.this.nod = khxVar.vy();
                        if (tq.this.nod) {
                            weuVarHu = khxVar.hu();
                            try {
                                if (tq.this.nod && weuVarHu != null) {
                                    tq.this.f31611tq = weuVarHu.hww() + tq.this.f31605hu;
                                    inputStreamSd = weuVarHu.sd();
                                }
                                if (inputStreamSd == null) {
                                    tq.this.hww(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamSd != null) {
                                        inputStreamSd.close();
                                    }
                                    if (weuVarHu != null) {
                                        weuVarHu.close();
                                    }
                                    khxVar.close();
                                    if (!tq.this.nod || tq.this.vy.length() != tq.this.f31611tq) {
                                        return;
                                    }
                                } else {
                                    int iVgm = com.bykv.vk.openvk.hww.hww.tq.hww.vgm();
                                    byte[] bArr = new byte[iVgm];
                                    long j10 = tq.this.f31605hu;
                                    long unused = tq.this.f31611tq;
                                    long unused2 = tq.this.f31605hu;
                                    tq.this.f31607ny.wgt();
                                    long j11 = 0;
                                    long j12 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = inputStreamSd.read(bArr, i10, iVgm - i10);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        i10 += i11;
                                        j12 += (long) i11;
                                        boolean z10 = j12 % ((long) iVgm) == j11 || j12 == tq.this.f31611tq - tq.this.f31605hu;
                                        long unused3 = tq.this.f31611tq;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(j12);
                                        sb2.append(", waitingAtPost=");
                                        long unused4 = tq.this.f31604ed;
                                        if (z10) {
                                            synchronized (tq.this.f31610sd) {
                                                try {
                                                    com.bykv.vk.openvk.hww.hww.tq.vy.tq.hww(tq.this.vhb, bArr, Long.valueOf(j10).intValue(), i10, tq.this.f31607ny.bs());
                                                    if (tq.this.hww && tq.this.f31604ed > -1 && tq.this.f31605hu + j12 >= tq.this.f31604ed) {
                                                        tq.this.f31610sd.notify();
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            j10 += (long) i10;
                                            i10 = 0;
                                        }
                                        j11 = 0;
                                    }
                                    long unused5 = tq.this.f31605hu;
                                    long unused6 = tq.this.f31611tq;
                                    long unused7 = tq.this.f31611tq;
                                    long unused8 = tq.this.f31605hu;
                                }
                                tq.this.hu();
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    tq.this.hww(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamSd != null) {
                                        inputStreamSd.close();
                                    }
                                    if (weuVarHu != null) {
                                        weuVarHu.close();
                                    }
                                    khxVar.close();
                                    if (tq.this.nod && tq.this.vy.length() == tq.this.f31611tq) {
                                        tq.this.hu();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th4) {
                                    if (inputStreamSd != null) {
                                        try {
                                            inputStreamSd.close();
                                            if (weuVarHu != null) {
                                                weuVarHu.close();
                                            }
                                            khxVar.close();
                                            if (tq.this.nod && tq.this.vy.length() == tq.this.f31611tq) {
                                                tq.this.hu();
                                            }
                                        } catch (Throwable unused9) {
                                            throw th4;
                                        }
                                    } else {
                                        if (weuVarHu != null) {
                                            weuVarHu.close();
                                        }
                                        khxVar.close();
                                        if (tq.this.nod) {
                                            tq.this.hu();
                                        }
                                    }
                                    throw th4;
                                }
                            }
                        }
                        tq.this.hww(khxVar.sd(), khxVar.hv());
                        weuVarHu = null;
                        if (inputStreamSd != null) {
                            inputStreamSd.close();
                        }
                        if (weuVarHu != null) {
                            weuVarHu.close();
                        }
                        khxVar.close();
                        if (!tq.this.nod || tq.this.vy.length() != tq.this.f31611tq) {
                            return;
                        }
                        tq.this.hu();
                    } catch (Throwable unused10) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    weuVarHu = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(int i10, String str) {
        JSONObject jSONObjectSd;
        this.nod = false;
        this.f31608ok = i10;
        this.f31611tq = this.vgm;
        omn.tq("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar = this.f31607ny;
        if (sdVar == null || !sdVar.hww() || (jSONObjectSd = this.f31607ny.sd()) == null) {
            return;
        }
        try {
            jSONObjectSd.put("error_real_code", i10);
            jSONObjectSd.put("error_real_msg", str);
        } catch (Throwable th2) {
            omn.hww("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }

    @Override // com.bykv.vk.openvk.hww.hww.tq.hww.hww.sd
    public int hww(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.f31611tq) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.f31609rs) {
                synchronized (this.f31610sd) {
                    try {
                        if (j10 < hv()) {
                            this.vhb.seek(j10);
                            i13 = this.vhb.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f31604ed = j10;
                            this.f31610sd.wait(33L);
                            this.f31604ed = -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                com.bykv.vk.openvk.hww.hww.hww.sd.sd sdVar = this.f31607ny;
                if (sdVar != null && sdVar.hww() && this.f31608ok != -100 && (!this.nod || this.f31611tq == this.vgm)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th3) {
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException();
        }
    }
}
