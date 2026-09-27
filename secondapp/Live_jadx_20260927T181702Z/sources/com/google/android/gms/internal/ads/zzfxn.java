package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxn {
    public static boolean zza(zzbdh zzbdhVar) {
        int iOrdinal = zzbdhVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbdh zzb(Context context, zzfwq zzfwqVar) {
        zzbdh zzbdhVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), wd.f.f142832g);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgzh(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfwqVar != null) {
                    zzfwqVar.zze(5017, "No .so");
                } else {
                    zzfwqVar = null;
                }
                zzbdhVar = zzbdh.UNKNOWN;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzc(bArr, null, context, zzfwqVar);
                                zzbdhVar = zzbdh.UNSUPPORTED;
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s10 = ByteBuffer.wrap(bArr2).getShort();
                                if (s10 == 3) {
                                    zzbdhVar = zzbdh.X86;
                                } else if (s10 == 40) {
                                    zzbdhVar = zzbdh.ARM7;
                                } else if (s10 == 62) {
                                    zzbdhVar = zzbdh.X86_64;
                                } else if (s10 == 183) {
                                    zzbdhVar = zzbdh.ARM64;
                                } else if (s10 != 243) {
                                    zzc(bArr, null, context, zzfwqVar);
                                    zzbdhVar = zzbdh.UNSUPPORTED;
                                } else {
                                    zzbdhVar = zzbdh.RISCV64;
                                }
                            }
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                            zzbdhVar = zzbdh.UNSUPPORTED;
                        }
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    zzc(null, e10.toString(), context, zzfwqVar);
                }
            }
        } else {
            if (zzfwqVar != null) {
                zzfwqVar.zze(5017, "No lib/");
            } else {
                zzfwqVar = null;
            }
            zzbdhVar = zzbdh.UNKNOWN;
        }
        if (zzbdhVar == zzbdh.UNKNOWN) {
            String strZzd = zzd(context, zzfwqVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfwqVar);
                zzbdhVar = zzbdh.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbdhVar = zzbdh.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbdhVar = zzbdh.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbdhVar = zzbdh.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbdhVar = zzbdh.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbdhVar = zzbdh.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfwqVar);
                zzbdhVar = zzbdh.UNSUPPORTED;
            }
        }
        if (zzfwqVar != null) {
            zzfwqVar.zze(5018, zzbdhVar.name());
        }
        return zzbdhVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfwq zzfwqVar) {
        if (zzfwqVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("os.arch:");
        sb2.append(zzgtm.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzfwqVar.zze(androidx.media3.session.d0.b.f14880q0, sb2.toString());
    }

    private static final String zzd(Context context, zzfwq zzfwqVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzgtm.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            if (zzfwqVar != null) {
                zzfwqVar.zzc(2024, 0L, e10);
            }
        } catch (NoSuchFieldException e11) {
            if (zzfwqVar != null) {
                zzfwqVar.zzc(2024, 0L, e11);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
