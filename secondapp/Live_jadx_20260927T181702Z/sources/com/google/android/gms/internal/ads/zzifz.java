package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzifz implements Iterator {
    final /* synthetic */ zzigb zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzifz(zzigb zzigbVar, byte[] bArr) {
        Objects.requireNonNull(zzigbVar);
        this.zza = zzigbVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzigb zzigbVar = this.zza;
        if (i10 >= zzigbVar.zzj()) {
            return !zzigbVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzigb zzigbVar = this.zza;
        return i10 < zzigbVar.zzj() ? (zzify) zzigbVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzigb zzigbVar = this.zza;
        zzigbVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzigbVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzigbVar.zzg(i10);
        }
    }
}
