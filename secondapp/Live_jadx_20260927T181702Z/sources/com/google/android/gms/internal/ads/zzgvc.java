package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzgvc implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgvg zze;

    public /* synthetic */ zzgvc(zzgvg zzgvgVar, byte[] bArr) {
        Objects.requireNonNull(zzgvgVar);
        this.zze = zzgvgVar;
        this.zzb = zzgvgVar.zzs();
        this.zzc = zzgvgVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object objZza = zza(i10);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzgsw.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzgvg zzgvgVar = this.zze;
        zzgvgVar.remove(zzgvgVar.zzo(i10));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
