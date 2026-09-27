package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzibh implements Iterator {
    zzibi zza;
    zzibi zzb;
    int zzc;
    final /* synthetic */ zzibj zzd;

    public zzibh(zzibj zzibjVar) {
        Objects.requireNonNull(zzibjVar);
        this.zzd = zzibjVar;
        this.zza = zzibjVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzibjVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzibi zzibiVar = this.zzb;
        if (zzibiVar == null) {
            throw new IllegalStateException();
        }
        zzibj zzibjVar = this.zzd;
        zzibjVar.zzd(zzibiVar, true);
        this.zzb = null;
        this.zzc = zzibjVar.zzc;
    }

    public final zzibi zza() {
        zzibj zzibjVar = this.zzd;
        zzibi zzibiVar = this.zza;
        if (zzibiVar == zzibjVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzibjVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzibiVar.zzd;
        this.zzb = zzibiVar;
        return zzibiVar;
    }
}
