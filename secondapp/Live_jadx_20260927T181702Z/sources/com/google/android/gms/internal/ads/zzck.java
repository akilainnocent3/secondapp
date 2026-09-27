package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzck {
    private final zzgvz zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgvz zzgvzVar) {
        this.zza = zzgvzVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzj(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i10);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i10] = zzcoVar.zzf();
                        boolean z11 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzj()) {
                        ((zzco) list.get(i10 + 1)).zze();
                    }
                }
            }
        } while (z10);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgvz zzgvzVar = this.zza;
        int size = zzgvzVar.size();
        zzgvz zzgvzVar2 = ((zzck) obj).zza;
        if (size != zzgvzVar2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < zzgvzVar.size(); i10++) {
            if (zzgvzVar.get(i10) != zzgvzVar2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        zzcl zzclVar2 = zzcl.zza;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i10 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i10);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgsw.zzi(!zzclVarZzb.equals(zzclVar2));
                zzclVar = zzclVarZzb;
            }
            i10++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i10 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i10);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgsw.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i10++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= zzj(); i11++) {
            this.zzc[i11] = ((zzco) list.get(i11)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i10 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzco zzcoVar = (zzco) zzgvzVar.get(i10);
            zzcoVar.zzi(zzcm.zza);
            zzcoVar.zzj();
            i10++;
        }
    }
}
