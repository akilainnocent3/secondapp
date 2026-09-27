package com.bytedance.sdk.component.vgm.tq;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.tq.hww.hu;
import com.bytedance.sdk.component.tq.hww.khx;
import com.bytedance.sdk.component.tq.hww.ny;
import com.bytedance.sdk.component.tq.hww.vhb;
import com.inmobi.unification.sdk.InitializationStatus;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import kj.d;
import u4.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends sd {
    public File hww;
    private volatile boolean nod;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public File f35126tq;

    public hww(vhb vhbVar) {
        super(vhbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long hu(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hv(Map<String, String> map) {
        if (TextUtils.equals(map.get(d.Q), q.d.f138878c) || TextUtils.equals(map.get("accept-ranges"), q.d.f138878c)) {
            return true;
        }
        String str = map.get(d.f102466f0);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith(q.d.f138878c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean vgm(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public void hww(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.hww = new File(str, str2);
        this.f35126tq = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.vgm.tq.sd
    public void tq() {
        this.nod = true;
        super.tq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hv() {
        try {
            this.hww.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f35126tq.delete();
        } catch (Throwable unused2) {
        }
    }

    public void hww(final com.bytedance.sdk.component.vgm.hww.hww hwwVar) {
        File file = this.hww;
        if (file == null || this.f35126tq == null) {
            if (hwwVar != null) {
                hwwVar.hww(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.hww.length() != 0 && hwwVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.vgm.tq tqVar = new com.bytedance.sdk.component.vgm.tq(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            tqVar.hww(this.hww);
            hwwVar.hww(this, tqVar);
            return;
        }
        long length = this.f35126tq.length();
        final long j10 = length >= 0 ? length : 0L;
        ny.hww hwwVar2 = new ny.hww();
        hwwVar2.hww((Object) sd());
        tq("Range", "bytes=" + j10 + TokenBuilder.TOKEN_DELIMITER);
        if (TextUtils.isEmpty(this.f35131ok)) {
            hwwVar.hww(this, new IOException("Url is Empty"));
            return;
        }
        try {
            hwwVar2.tq(this.f35131ok);
            if (!TextUtils.isEmpty(this.f35130hv)) {
                hwwVar2.hww(this.f35130hv);
            }
            int i10 = this.f35129hu;
            if (i10 > 0) {
                hwwVar2.hww(i10);
            }
            hww(hwwVar2);
            com.bytedance.sdk.component.tq.hww.tq tqVarHww = this.f35133sd.hww(hwwVar2.hww().tq());
            if (tqVarHww == null) {
                hwwVar.hww(this, new IOException("new call error"));
            } else {
                tqVarHww.hww(new com.bytedance.sdk.component.tq.hww.sd() { // from class: com.bytedance.sdk.component.vgm.tq.hww.1
                    @Override // com.bytedance.sdk.component.tq.hww.sd
                    public void hww(com.bytedance.sdk.component.tq.hww.tq tqVar2, IOException iOException) {
                        com.bytedance.sdk.component.vgm.hww.hww hwwVar3 = hwwVar;
                        if (hwwVar3 != null) {
                            hwwVar3.hww(hww.this, iOException);
                        }
                        hww.this.hv();
                    }

                    @Override // com.bytedance.sdk.component.tq.hww.sd
                    public void hww(com.bytedance.sdk.component.tq.hww.tq tqVar2, khx khxVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j11;
                        InputStream inputStreamSd;
                        byte[] bArr;
                        long j12;
                        int i11;
                        if (hwwVar == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        if (khxVar == null) {
                            return;
                        }
                        hu huVarVgm = khxVar.vgm();
                        if (huVarVgm != null) {
                            for (int i12 = 0; i12 < huVarVgm.hww(); i12++) {
                                map.put(huVarVgm.hww(i12), huVarVgm.tq(i12));
                            }
                        }
                        com.bytedance.sdk.component.vgm.tq tqVar3 = new com.bytedance.sdk.component.vgm.tq(khxVar.vy(), khxVar.sd(), khxVar.hv(), map, null, khxVar.tq(), khxVar.hww());
                        if (khxVar.vy()) {
                            long jHww = khxVar.hu().hww();
                            long j13 = 0;
                            if (jHww <= 0) {
                                jHww = hww.hu(map);
                            }
                            boolean zHv = hww.hv(map);
                            if (zHv) {
                                jHww += j10;
                                String str = (String) map.get(d.f102466f0);
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j10 + TokenBuilder.TOKEN_DELIMITER + (jHww - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        hww.this.hv();
                                        hwwVar.hww(hww.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + hww.this.f35126tq + "]."));
                                        return;
                                    }
                                }
                            }
                            if (jHww > 0 && hww.this.f35126tq.exists() && hww.this.f35126tq.length() == jHww) {
                                hww hwwVar3 = hww.this;
                                if (!hwwVar3.f35126tq.renameTo(hwwVar3.hww)) {
                                    hwwVar.hww(hww.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    tqVar3.hww(hww.this.hww);
                                    hwwVar.hww(hww.this, tqVar3);
                                    return;
                                }
                            }
                            InputStream inputStream = null;
                            try {
                                try {
                                    randomAccessFile = new RandomAccessFile(hww.this.f35126tq, "rw");
                                    try {
                                        if (zHv) {
                                            randomAccessFile.seek(j10);
                                            j11 = j10;
                                        } else {
                                            randomAccessFile.setLength(0L);
                                            j11 = 0;
                                        }
                                        while (true) {
                                            long j14 = j13;
                                            int i13 = inputStreamSd.read(bArr, i11, 16384 - i11);
                                            if (i13 != -1) {
                                                i11 += i13;
                                                j12 += (long) i13;
                                                if (j12 % 16384 == j14 || j12 == jHww - j10) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                    j11 += (long) i11;
                                                    i11 = 0;
                                                }
                                                if (hww.this.nod) {
                                                    throw new IOException("net is cancel");
                                                }
                                                j13 = j14;
                                            } else {
                                                if (i11 != 0) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                }
                                                if (!zHv) {
                                                    jHww = hww.this.f35126tq.length();
                                                }
                                                if (jHww > j14 && hww.this.f35126tq.exists() && hww.this.f35126tq.length() == jHww) {
                                                    hww hwwVar4 = hww.this;
                                                    if (!hwwVar4.f35126tq.renameTo(hwwVar4.hww)) {
                                                        hwwVar.hww(hww.this, new IOException("Rename fail"));
                                                    } else {
                                                        tqVar3.hww(hww.this.hww);
                                                        hwwVar.hww(hww.this, tqVar3);
                                                    }
                                                } else {
                                                    com.bytedance.sdk.component.vgm.hww.hww hwwVar5 = hwwVar;
                                                    hww hwwVar6 = hww.this;
                                                    StringBuilder sb2 = new StringBuilder(" tempFile.length() == fileSize is");
                                                    sb2.append(hww.this.f35126tq.length() == jHww);
                                                    hwwVar5.hww(hwwVar6, new IOException(sb2.toString()));
                                                }
                                                try {
                                                    inputStreamSd.close();
                                                } catch (Throwable unused) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused2) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } catch (Throwable unused4) {
                                    randomAccessFile = null;
                                }
                                inputStreamSd = khxVar.hu().sd();
                                if (hww.vgm(map) && !(inputStreamSd instanceof GZIPInputStream)) {
                                    inputStreamSd = new GZIPInputStream(inputStreamSd);
                                }
                                bArr = new byte[16384];
                                j12 = 0;
                                i11 = 0;
                            } catch (Throwable th2) {
                                try {
                                    hwwVar.hww(hww.this, new IOException(th2.getMessage()));
                                    if (!zHv) {
                                        hww.this.hv();
                                    }
                                } finally {
                                    if (0 != 0) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused6) {
                                    }
                                }
                            }
                        } else {
                            hwwVar.hww(hww.this, tqVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            hwwVar.hww(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0133 A[PHI: r10
      0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    public com.bytedance.sdk.component.vgm.tq hww() {
        com.bytedance.sdk.component.vgm.tq tqVar;
        RandomAccessFile randomAccessFile;
        long j10;
        InputStream inputStream;
        InputStream inputStreamSd;
        byte[] bArr;
        int i10;
        long j11;
        hww hwwVar = this;
        File file = hwwVar.hww;
        if (file == null || hwwVar.f35126tq == null) {
            return null;
        }
        if (file.exists() && hwwVar.hww.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.vgm.tq tqVar2 = new com.bytedance.sdk.component.vgm.tq(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            tqVar2.hww(hwwVar.hww);
            return tqVar2;
        }
        long length = hwwVar.f35126tq.length();
        if (length < 0) {
            length = 0;
        }
        ny.hww hwwVar2 = new ny.hww();
        hwwVar2.hww((Object) hwwVar.sd());
        hwwVar.tq("Range", "bytes=" + length + TokenBuilder.TOKEN_DELIMITER);
        if (TextUtils.isEmpty(hwwVar.f35131ok)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            hwwVar2.tq(hwwVar.f35131ok);
            hwwVar.hww(hwwVar2);
            try {
                com.bytedance.sdk.component.tq.hww.tq tqVarHww = hwwVar.f35133sd.hww(hwwVar2.hww().tq());
                if (tqVarHww == null) {
                    return null;
                }
                khx khxVarTq = tqVarHww.tq();
                if (khxVarTq == null || !khxVarTq.vy()) {
                    return null;
                }
                HashMap map = new HashMap();
                hu huVarVgm = khxVarTq.vgm();
                if (huVarVgm != null) {
                    for (int i11 = 0; i11 < huVarVgm.hww(); i11++) {
                        map.put(huVarVgm.hww(i11), huVarVgm.tq(i11));
                    }
                }
                com.bytedance.sdk.component.vgm.tq tqVar3 = new com.bytedance.sdk.component.vgm.tq(khxVarTq.vy(), khxVarTq.sd(), khxVarTq.hv(), map, null, khxVarTq.tq(), khxVarTq.hww());
                long jHww = khxVarTq.hu().hww();
                if (jHww <= 0) {
                    jHww = hu(map);
                }
                long length2 = hwwVar.f35126tq.length();
                boolean zHv = hv(map);
                tqVar = null;
                if (zHv) {
                    jHww += length2;
                    try {
                        String str = (String) map.get(d.f102466f0);
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + TokenBuilder.TOKEN_DELIMITER + (jHww - 1)) == -1) {
                                Objects.toString(hwwVar.f35126tq);
                                hwwVar.hv();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jHww > r3 && hwwVar.f35126tq.exists() && hwwVar.f35126tq.length() == jHww) {
                    if (!hwwVar.f35126tq.renameTo(hwwVar.hww)) {
                        return null;
                    }
                    tqVar3.hww(hwwVar.hww);
                    return tqVar3;
                }
                try {
                    try {
                        try {
                            randomAccessFile = new RandomAccessFile(hwwVar.f35126tq, "rw");
                            try {
                                if (zHv) {
                                    randomAccessFile.seek(length);
                                    j10 = length;
                                } else {
                                    randomAccessFile.setLength(0L);
                                    j10 = 0;
                                }
                                while (true) {
                                    int i12 = inputStreamSd.read(bArr, i10, 16384 - i10);
                                    inputStream = inputStreamSd;
                                    if (i12 != -1) {
                                        i10 += i12;
                                        j11 += (long) i12;
                                        try {
                                            if (j11 % 16384 == 0 || j11 == jHww - length) {
                                                randomAccessFile.seek(j10);
                                                randomAccessFile.write(bArr, 0, i10);
                                                j10 += (long) i10;
                                                i10 = 0;
                                            }
                                            hwwVar = this;
                                            try {
                                                if (hwwVar.nod) {
                                                    throw new IOException("net is cancel");
                                                }
                                                inputStreamSd = inputStream;
                                            } catch (Throwable unused2) {
                                                if (!zHv) {
                                                    try {
                                                        hwwVar.hv();
                                                    } finally {
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                            } catch (Throwable unused3) {
                                                            }
                                                        }
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Throwable unused4) {
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                        } catch (Throwable unused5) {
                                            hwwVar = this;
                                        }
                                    } else {
                                        if (i12 != 0) {
                                            randomAccessFile.seek(j10);
                                            randomAccessFile.write(bArr, 0, i10);
                                        }
                                        if (!zHv || length == 0) {
                                            jHww = hwwVar.f35126tq.length();
                                        }
                                        if (jHww > 0 && hwwVar.f35126tq.exists() && hwwVar.f35126tq.length() == jHww) {
                                            if (hwwVar.f35126tq.renameTo(hwwVar.hww)) {
                                                tqVar3.hww(hwwVar.hww);
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused6) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused7) {
                                                }
                                                return tqVar3;
                                            }
                                            try {
                                                inputStream.close();
                                            } catch (Throwable unused8) {
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused9) {
                                            }
                                            return null;
                                        }
                                        hwwVar.f35126tq.length();
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused10) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused11) {
                                        }
                                        return null;
                                    }
                                }
                            } catch (Throwable unused12) {
                            }
                        } catch (Throwable unused13) {
                            randomAccessFile = null;
                        }
                        if (vgm(map) && !(inputStreamSd instanceof GZIPInputStream)) {
                            inputStreamSd = new GZIPInputStream(inputStreamSd);
                        }
                        bArr = new byte[16384];
                        i10 = 0;
                        j11 = 0;
                    } catch (Throwable unused14) {
                        inputStream = inputStreamSd;
                    }
                    inputStreamSd = khxVarTq.hu().sd();
                } catch (Throwable unused15) {
                    inputStream = null;
                }
            } catch (IOException unused16) {
                tqVar = null;
            }
            hwwVar.hv();
            return tqVar;
        } catch (IllegalArgumentException unused17) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }
}
