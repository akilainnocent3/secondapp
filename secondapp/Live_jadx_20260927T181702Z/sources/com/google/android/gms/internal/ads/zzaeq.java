package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaeq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzes zzesVar, String str, @Nullable String str2, @Nullable zzq zzqVar) {
        zzer zzerVar = new zzer();
        zzerVar.zza(zzesVar);
        int i10 = zzc[zzerVar.zzj(2)];
        zzerVar.zzh(8);
        int i11 = zze[zzerVar.zzj(3)];
        if (zzerVar.zzj(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzerVar.zzj(5)] * 1000;
        zzerVar.zzm();
        zzesVar.zzh(zzerVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo("audio/ac3");
        zztVar.zzG(i11);
        zztVar.zzH(i10);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i12);
        zztVar.zzj(i12);
        return zztVar.zzO();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzv zzb(zzes zzesVar, String str, @Nullable String str2, @Nullable zzq zzqVar) {
        String str3;
        zzer zzerVar = new zzer();
        zzerVar.zza(zzesVar);
        int iZzj = zzerVar.zzj(13) * 1000;
        zzerVar.zzh(3);
        int i10 = zzc[zzerVar.zzj(2)];
        zzerVar.zzh(10);
        int i11 = zze[zzerVar.zzj(3)];
        if (zzerVar.zzj(1) != 0) {
            i11++;
        }
        zzerVar.zzh(3);
        int iZzj2 = zzerVar.zzj(4);
        zzerVar.zzh(1);
        if (iZzj2 > 0) {
            zzerVar.zzh(6);
            if (zzerVar.zzj(1) != 0) {
                i11 += 2;
            }
            zzerVar.zzh(1);
        }
        if (zzerVar.zzc() > 7) {
            zzerVar.zzh(7);
            if (zzerVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzerVar.zzm();
        zzesVar.zzh(zzerVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo(str3);
        zztVar.zzG(i11);
        zztVar.zzH(i10);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzj(iZzj);
        return zztVar.zzO();
    }

    public static zzaep zzc(zzer zzerVar) {
        int iZzf;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzd = zzerVar.zzd();
        zzerVar.zzh(40);
        int iZzj = zzerVar.zzj(5);
        zzerVar.zzf(iZzd);
        int i18 = -1;
        if (iZzj > 10) {
            zzerVar.zzh(16);
            int iZzj2 = zzerVar.zzj(2);
            if (iZzj2 == 0) {
                i18 = 0;
            } else if (iZzj2 == 1) {
                i18 = 1;
            } else if (iZzj2 == 2) {
                i18 = 2;
            }
            zzerVar.zzh(3);
            int iZzj3 = zzerVar.zzj(11) + 1;
            int iZzj4 = zzerVar.zzj(2);
            if (iZzj4 == 3) {
                i10 = zzd[zzerVar.zzj(2)];
                i15 = 6;
                i14 = 3;
            } else {
                int iZzj5 = zzerVar.zzj(2);
                int i19 = zzb[iZzj5];
                i14 = iZzj5;
                i10 = zzc[iZzj4];
                i15 = i19;
            }
            iZzf = iZzj3 + iZzj3;
            int i20 = (iZzf * i10) / (i15 * 32);
            int iZzj6 = zzerVar.zzj(3);
            boolean zZzi = zzerVar.zzi();
            i11 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzerVar.zzh(10);
            if (zzerVar.zzi()) {
                zzerVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzerVar.zzh(5);
                if (zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                i16 = 0;
                iZzj6 = 0;
            } else {
                i16 = iZzj6;
            }
            if (i18 == 1) {
                if (zzerVar.zzi()) {
                    zzerVar.zzh(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (zzerVar.zzi()) {
                if (i16 > 2) {
                    zzerVar.zzh(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    zzerVar.zzh(6);
                }
                if ((i16 & 4) != 0) {
                    zzerVar.zzh(6);
                }
                if (zZzi && zzerVar.zzi()) {
                    zzerVar.zzh(5);
                }
                if (i17 == 0) {
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    if (i16 == 0 && zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(6);
                    }
                    int iZzj7 = zzerVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzerVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzerVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzerVar.zzj(5);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(5);
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(4);
                            }
                            if (zzerVar.zzi()) {
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(4);
                                }
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(4);
                                }
                            }
                        }
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(5);
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(7);
                                if (zzerVar.zzi()) {
                                    zzerVar.zzh(8);
                                }
                            }
                        }
                        zzerVar.zzh((iZzj8 + 2) * 8);
                        zzerVar.zzm();
                    }
                    if (i16 < 2) {
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzerVar.zzi()) {
                            zzerVar.zzh(14);
                        }
                    }
                    if (!zzerVar.zzi()) {
                        i17 = 0;
                    } else if (i14 == 0) {
                        zzerVar.zzh(5);
                        i17 = 0;
                        i14 = 0;
                    } else {
                        for (int i21 = 0; i21 < i15; i21++) {
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (zzerVar.zzi()) {
                zzerVar.zzh(5);
                if (i16 == 2) {
                    zzerVar.zzh(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    zzerVar.zzh(2);
                }
                if (zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                if (i16 == 0 && zzerVar.zzi()) {
                    zzerVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzerVar.zzg();
                }
            }
            if (i17 == 0 && i14 != 3) {
                zzerVar.zzg();
            }
            if (i17 == 2 && (i14 == 3 || zzerVar.zzi())) {
                zzerVar.zzh(6);
            }
            i12 = i15 * 256;
            str = (zzerVar.zzi() && zzerVar.zzj(6) == 1 && zzerVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i20;
        } else {
            zzerVar.zzh(32);
            int iZzj9 = zzerVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzerVar.zzj(6);
            int i22 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzerVar.zzh(8);
            int iZzj11 = zzerVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzerVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzerVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzerVar.zzh(2);
            }
            i10 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i11 = zze[iZzj11] + (zzerVar.zzi() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new zzaep(str, i18, i11, i10, iZzf, i12, i13, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & l3.a.f103436o7) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & l3.a.f103436o7) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
