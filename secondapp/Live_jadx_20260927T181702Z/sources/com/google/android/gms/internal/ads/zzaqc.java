package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqc {
    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    public static boolean zza(zzer zzerVar, zzaqa zzaqaVar) throws zzat {
        long jZzk;
        zzerVar.zze();
        int iZzf = zzf(zzerVar, 3, 8, 8);
        zzaqaVar.zza = iZzf;
        if (iZzf == -1) {
            return false;
        }
        zzgsw.zza(Math.max(Math.max(2, 8), 32) <= 63);
        l.a(l.a(3L, 255L), 4294967296L);
        if (zzerVar.zzc() < 2) {
            jZzk = -1;
        } else {
            jZzk = zzerVar.zzk(2);
            if (jZzk == 3) {
                if (zzerVar.zzc() < 8) {
                    jZzk = -1;
                } else {
                    long jZzk2 = zzerVar.zzk(8);
                    long j10 = jZzk2 + 3;
                    if (jZzk2 != 255) {
                        jZzk = j10;
                    } else if (zzerVar.zzc() < 32) {
                        jZzk = -1;
                    } else {
                        jZzk = j10 + zzerVar.zzk(32);
                    }
                }
            }
        }
        zzaqaVar.zzb = jZzk;
        if (jZzk == -1) {
            return false;
        }
        if (jZzk > 16) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jZzk).length() + 49);
            sb2.append("Contains sub-stream with an invalid packet label ");
            sb2.append(jZzk);
            throw zzat.zzc(sb2.toString());
        }
        if (jZzk == 0) {
            int i10 = zzaqaVar.zza;
            if (i10 == 1) {
                throw zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzf2 = zzf(zzerVar, 11, 24, 24);
        zzaqaVar.zzc = iZzf2;
        return iZzf2 != -1;
    }

    public static zzaqb zzb(zzer zzerVar) throws zzat {
        int iZzj;
        int i10;
        char c10;
        int i11;
        int i12;
        int iZzj2;
        char c11;
        int iZzj3 = zzerVar.zzj(8);
        int i13 = 5;
        int iZzj4 = zzerVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzat.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzerVar.zzj(24);
        }
        int iZzj5 = zzerVar.zzj(3);
        int i14 = 1;
        if (iZzj5 == 0) {
            i10 = 768;
        } else if (iZzj5 == 1) {
            i10 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i10 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            i10 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c10 = 0;
        } else if (iZzj5 == 2) {
            c10 = 2;
        } else if (iZzj5 == 3) {
            c10 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzat.zzc(sb4.toString());
            }
            c10 = 1;
        }
        zzerVar.zzh(2);
        zzc(zzerVar);
        int iZzj6 = zzerVar.zzj(5);
        int i15 = 0;
        int iZzf = 0;
        while (true) {
            int i16 = 16;
            if (i15 < iZzj6 + 1) {
                int iZzj7 = zzerVar.zzj(3);
                iZzf += zzf(zzerVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzerVar.zzi()) {
                    zzc(zzerVar);
                }
                i15++;
            } else {
                int iZzf2 = zzf(zzerVar, 4, 8, 16) + 1;
                zzerVar.zzg();
                int i17 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i17 >= iZzf2) {
                        int i18 = iZzj3;
                        byte[] bArr = null;
                        if (zzerVar.zzi()) {
                            int iZzf3 = zzf(zzerVar, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < iZzf3; i19++) {
                                int iZzf4 = zzf(zzerVar, 4, 8, 16);
                                int iZzf5 = zzf(zzerVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzerVar.zzj(4) + 1;
                                    zzerVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i20 = 0; i20 < iZzj8; i20++) {
                                        bArr2[i20] = (byte) zzerVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzerVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzat.zzc(sb5.toString());
                        }
                        return new zzaqb(i18, (int) (((double) iZzj) * d10), (int) (((double) i10) * d10), bArr3, null);
                    }
                    int iZzj9 = zzerVar.zzj(2);
                    if (iZzj9 == 0) {
                        i11 = iZzj3;
                        i12 = i14;
                        zzd(zzerVar);
                        if (c10 > 0) {
                            zze(zzerVar);
                        }
                    } else if (iZzj9 == i14) {
                        i12 = i14;
                        if (zzd(zzerVar)) {
                            zzerVar.zzg();
                        }
                        if (c10 > 0) {
                            zze(zzerVar);
                            iZzj2 = zzerVar.zzj(2);
                            c11 = c10;
                        } else {
                            iZzj2 = 0;
                            c11 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzerVar.zzh(6);
                            int iZzj10 = zzerVar.zzj(2);
                            zzerVar.zzh(4);
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(i13);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzerVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzerVar.zzg();
                            }
                        }
                        i11 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzerVar.zzj(2);
                        if (iZzj11 > 0 && zzerVar.zzi()) {
                            zzerVar.zzh(iFloor);
                        }
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(iFloor);
                        }
                        if (c11 == 0 && iZzj11 == 0) {
                            zzerVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i11 = iZzj3;
                        i12 = i14;
                    } else {
                        zzf(zzerVar, 4, 8, i16);
                        int iZzf6 = zzf(zzerVar, 4, 8, i16);
                        i12 = i14;
                        if (zzerVar.zzi()) {
                            zzf(zzerVar, 8, i16, 0);
                        }
                        zzerVar.zzg();
                        if (iZzf6 > 0) {
                            zzerVar.zzh(iZzf6 * 8);
                        }
                        i11 = iZzj3;
                    }
                    i17++;
                    iZzj3 = i11;
                    i14 = i12;
                    i13 = 5;
                    i16 = 16;
                }
            }
        }
    }

    private static void zzc(zzer zzerVar) {
        int iZzj;
        int iZzj2 = zzerVar.zzj(2);
        if (iZzj2 == 0) {
            zzerVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzerVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzerVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzerVar.zzi();
            int i10 = true != zZzi ? 5 : 1;
            int i11 = true == zZzi ? 7 : 5;
            int i12 = true == zZzi ? 8 : 6;
            int i13 = 0;
            while (i13 < iZzf) {
                if (zzerVar.zzi()) {
                    zzerVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzerVar.zzj(2) == 3 && zzerVar.zzj(i11) * i10 != 0) {
                        zzerVar.zzg();
                    }
                    iZzj = zzerVar.zzj(i12) * i10;
                    if (iZzj != 0 && iZzj != 180) {
                        zzerVar.zzg();
                    }
                    zzerVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzerVar.zzi()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzd(zzer zzerVar) {
        zzerVar.zzh(3);
        boolean zZzi = zzerVar.zzi();
        if (zZzi) {
            zzerVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzer zzerVar) {
        zzerVar.zzh(3);
        zzerVar.zzh(8);
        boolean zZzi = zzerVar.zzi();
        boolean zZzi2 = zzerVar.zzi();
        if (zZzi) {
            zzerVar.zzh(5);
        }
        if (zZzi2) {
            zzerVar.zzh(6);
        }
    }

    private static int zzf(zzer zzerVar, int i10, int i11, int i12) {
        zzgsw.zza(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        k.a(k.a(i13, i14), 1 << i12);
        if (zzerVar.zzc() < i10) {
            return -1;
        }
        int iZzj = zzerVar.zzj(i10);
        if (iZzj != i13) {
            return iZzj;
        }
        if (zzerVar.zzc() < i11) {
            return -1;
        }
        int iZzj2 = zzerVar.zzj(i11);
        int i15 = iZzj + iZzj2;
        if (iZzj2 != i14) {
            return i15;
        }
        if (zzerVar.zzc() < i12) {
            return -1;
        }
        return i15 + zzerVar.zzj(i12);
    }
}
