package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcp implements zzco {
    protected zzcl zzb;
    protected zzcl zzc;
    private zzcl zzd;
    private zzcl zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzcp() {
        ByteBuffer byteBuffer = zzco.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcl zzclVar = zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public /* synthetic */ long zza(long j10) {
        return i0.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzb(zzcl zzclVar) throws zzcn {
        this.zzd = zzclVar;
        this.zze = zzm(zzclVar);
        return zzc() ? this.zze : zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    @k.i
    public boolean zzc() {
        return this.zze != zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        this.zzh = true;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    @k.i
    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzco.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    @k.i
    public boolean zzg() {
        return this.zzh && this.zzg == zzco.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    @Deprecated
    public final void zzh() {
        zzcm zzcmVar = zzcm.zza;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(zzcm zzcmVar) {
        this.zzg = zzco.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzo(zzcmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        ByteBuffer byteBuffer = zzco.zza;
        this.zzg = byteBuffer;
        this.zzh = false;
        this.zzf = byteBuffer;
        zzcl zzclVar = zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
        zzp();
    }

    public final ByteBuffer zzk(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public final boolean zzl() {
        return this.zzg.hasRemaining();
    }

    public zzcl zzm(zzcl zzclVar) throws zzcn {
        throw null;
    }

    public void zzn() {
    }

    public void zzp() {
    }

    public void zzo(zzcm zzcmVar) {
    }
}
