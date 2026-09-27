package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfyt extends zzfyz {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfyt(String str, boolean z10, int i10, zzfyr zzfyrVar, int i11, byte[] bArr) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyz) {
            zzfyz zzfyzVar = (zzfyz) obj;
            if (this.zzb.equals(zzfyzVar.zza())) {
                zzfyzVar.zzb();
                int i10 = this.zzc;
                int iZzd = zzfyzVar.zzd();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZzd) {
                    zzfyzVar.zzc();
                    int i11 = this.zzd;
                    int iZze = zzfyzVar.zze();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.zzc;
        String str2 = fw.b.f85379f;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? fw.b.f85379f : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zzd == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final zzfyr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final int zze() {
        return this.zzd;
    }
}
