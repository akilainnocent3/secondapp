package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamc {
    public final boolean zza;

    @Nullable
    public final String zzb;
    public final zzaha zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzamc(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        int i13 = 1;
        zzgsw.zza((bArr2 == null) ^ (i10 == 0));
        this.zza = z10;
        this.zzb = str;
        this.zzd = i10;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Unsupported protection scheme type '");
                        sb2.append(str);
                        sb2.append("'. Assuming AES-CTR crypto mode.");
                        zzef.zzc("TrackEncryptionBox", sb2.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 68);
                        sb3.append("Unsupported protection scheme type '");
                        sb3.append(str);
                        sb3.append("'. Assuming AES-CTR crypto mode.");
                        zzef.zzc("TrackEncryptionBox", sb3.toString());
                    } else {
                        i13 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 68);
                        sb4.append("Unsupported protection scheme type '");
                        sb4.append(str);
                        sb4.append("'. Assuming AES-CTR crypto mode.");
                        zzef.zzc("TrackEncryptionBox", sb4.toString());
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        StringBuilder sb5 = new StringBuilder(str.length() + 68);
                        sb5.append("Unsupported protection scheme type '");
                        sb5.append(str);
                        sb5.append("'. Assuming AES-CTR crypto mode.");
                        zzef.zzc("TrackEncryptionBox", sb5.toString());
                    }
                    break;
                default:
                    StringBuilder sb6 = new StringBuilder(str.length() + 68);
                    sb6.append("Unsupported protection scheme type '");
                    sb6.append(str);
                    sb6.append("'. Assuming AES-CTR crypto mode.");
                    zzef.zzc("TrackEncryptionBox", sb6.toString());
                    break;
            }
        }
        this.zzc = new zzaha(i13, bArr, i11, i12);
    }
}
