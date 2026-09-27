package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaad extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaad() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzaad zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final zzaad zzy(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i10) == z10) {
            return this;
        }
        if (z10) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzaad(zzaae zzaaeVar, byte[] bArr) {
        super(zzaaeVar);
        this.zza = zzaaeVar.zzK;
        this.zzb = zzaaeVar.zzM;
        this.zzc = zzaaeVar.zzO;
        this.zzd = zzaaeVar.zzT;
        this.zze = zzaaeVar.zzU;
        this.zzf = zzaaeVar.zzV;
        this.zzg = zzaaeVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzaaeVar.zze();
            if (i10 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i10), new HashMap((Map) sparseArrayZze.valueAt(i10)));
                i10++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaaeVar.zzf().clone();
                return;
            }
        }
    }
}
