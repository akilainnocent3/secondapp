package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzatt implements zzash {
    private final zzats zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzatt(zzats zzatsVar, int i10) {
        this.zzc = zzatsVar;
    }

    @k.h1
    public static byte[] zzg(zzatr zzatrVar, long j10) throws IOException {
        long jZza = zzatrVar.zza();
        if (j10 >= 0 && j10 <= jZza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzatrVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(jZza).length());
        sb2.append("streamToBytes length=");
        sb2.append(j10);
        sb2.append(", maxLength=");
        sb2.append(jZza);
        throw new IOException(sb2.toString());
    }

    public static void zzh(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzatr zzatrVar) throws IOException {
        return new String(zzg(zzatrVar, zzk(zzatrVar)), "UTF-8");
    }

    private final void zzn(String str, zzatq zzatqVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzatqVar.zza - ((zzatq) map.get(str)).zza;
        } else {
            this.zzb += zzatqVar.zza;
        }
        map.put(str, zzatqVar);
    }

    private final void zzo(String str) {
        zzatq zzatqVar = (zzatq) this.zza.remove(str);
        if (zzatqVar != null) {
            this.zzb -= zzatqVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized zzasg zza(String str) {
        zzatq zzatqVar = (zzatq) this.zza.get(str);
        if (zzatqVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzatr zzatrVar = new zzatr(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzatq.zza(zzatrVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzatj.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    zzatrVar.close();
                    return null;
                }
                byte[] bArrZzg = zzg(zzatrVar, zzatrVar.zza());
                zzasg zzasgVar = new zzasg();
                zzasgVar.zza = bArrZzg;
                zzasgVar.zzb = zzatqVar.zzc;
                zzasgVar.zzc = zzatqVar.zzd;
                zzasgVar.zzd = zzatqVar.zze;
                zzasgVar.zze = zzatqVar.zzf;
                zzasgVar.zzf = zzatqVar.zzg;
                List<zzasp> list = zzatqVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzasp zzaspVar : list) {
                    treeMap.put(zzaspVar.zza(), zzaspVar.zzb());
                }
                zzasgVar.zzg = treeMap;
                zzasgVar.zzh = Collections.unmodifiableList(list);
                zzatrVar.close();
                return zzasgVar;
            } catch (Throwable th2) {
                zzatrVar.close();
                throw th2;
            }
        } catch (IOException e10) {
            zzatj.zzb("%s: %s", fileZzf.getAbsolutePath(), e10.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzb(String str, zzasg zzasgVar) {
        int i10;
        int i11;
        char c10;
        try {
            long j10 = this.zzb;
            int length = zzasgVar.zza.length;
            long j11 = j10 + ((long) length);
            int i12 = this.zzd;
            float f10 = 0.9f;
            if (j11 <= i12 || length <= i12 * 0.9f) {
                File fileZzf = zzf(str);
                int i13 = 0;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzatq zzatqVar = new zzatq(str, zzasgVar);
                    try {
                        try {
                            zzh(bufferedOutputStream, 538247942);
                            zzl(bufferedOutputStream, zzatqVar.zzb);
                            String str2 = zzatqVar.zzc;
                            if (str2 == null) {
                                str2 = "";
                            }
                            zzl(bufferedOutputStream, str2);
                            zzj(bufferedOutputStream, zzatqVar.zzd);
                            zzj(bufferedOutputStream, zzatqVar.zze);
                            zzj(bufferedOutputStream, zzatqVar.zzf);
                            zzj(bufferedOutputStream, zzatqVar.zzg);
                            List<zzasp> list = zzatqVar.zzh;
                            if (list != null) {
                                zzh(bufferedOutputStream, list.size());
                                for (zzasp zzaspVar : list) {
                                    zzl(bufferedOutputStream, zzaspVar.zza());
                                    zzl(bufferedOutputStream, zzaspVar.zzb());
                                }
                            } else {
                                zzh(bufferedOutputStream, 0);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.write(zzasgVar.zza);
                            bufferedOutputStream.close();
                            zzatqVar.zza = fileZzf.length();
                            zzn(str, zzatqVar);
                            long j12 = this.zzb;
                            int i14 = this.zzd;
                            if (j12 >= i14) {
                                boolean z10 = zzatj.zzb;
                                if (z10) {
                                    zzatj.zza("Pruning old cache entries.", new Object[0]);
                                }
                                long j13 = this.zzb;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                Iterator it = this.zza.entrySet().iterator();
                                int i15 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i13;
                                        j13 = j13;
                                        c10 = 1;
                                        break;
                                    }
                                    zzatq zzatqVar2 = (zzatq) ((Map.Entry) it.next()).getValue();
                                    String str3 = zzatqVar2.zzb;
                                    if (zzf(str3).delete()) {
                                        i11 = i13;
                                        c10 = 1;
                                        this.zzb -= zzatqVar2.zza;
                                    } else {
                                        i11 = i13;
                                        c10 = 1;
                                        String strZzq = zzq(str3);
                                        Object[] objArr = new Object[2];
                                        objArr[i11] = str3;
                                        objArr[1] = strZzq;
                                        zzatj.zzb("Could not delete cache entry for key=%s, filename=%s", objArr);
                                    }
                                    it.remove();
                                    i15++;
                                    if (this.zzb < i14 * f10) {
                                        break;
                                    }
                                    j13 = j13;
                                    i13 = i11;
                                    f10 = f10;
                                }
                                if (z10) {
                                    Integer numValueOf = Integer.valueOf(i15);
                                    Long lValueOf = Long.valueOf(this.zzb - j13);
                                    Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    Object[] objArr2 = new Object[3];
                                    objArr2[i11] = numValueOf;
                                    objArr2[c10] = lValueOf;
                                    objArr2[2] = lValueOf2;
                                    zzatj.zza("pruned %d files, %d bytes, %d ms", objArr2);
                                }
                            }
                        } catch (IOException e10) {
                            zzatj.zzb("%s", e10.toString());
                            bufferedOutputStream.close();
                            zzatj.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                            throw new IOException();
                        }
                    } catch (IOException unused) {
                        if (!fileZzf.delete()) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i10] = fileZzf.getAbsolutePath();
                            zzatj.zzb("Could not clean up file %s", objArr3);
                        }
                        if (!this.zzc.zza().exists()) {
                            zzatj.zzb("Re-initializing cache after external clearing.", new Object[i10]);
                            this.zza.clear();
                            this.zzb = 0L;
                            zzc();
                        }
                    }
                } catch (IOException unused2) {
                    i10 = i13;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzatr zzatrVar = new zzatr(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzatq zzatqVarZza = zzatq.zza(zzatrVar);
                            zzatqVarZza.zza = length;
                            zzn(zzatqVarZza.zzb, zzatqVarZza);
                            zzatrVar.close();
                        } catch (Throwable th2) {
                            zzatrVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzatj.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzd(String str, boolean z10) {
        zzasg zzasgVarZza = zza(str);
        if (zzasgVarZza != null) {
            zzasgVarZza.zzf = 0L;
            zzasgVarZza.zze = 0L;
            zzb(str, zzasgVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzatj.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzatt(File file, int i10) {
        this.zzc = new zzatp(this, file);
    }
}
