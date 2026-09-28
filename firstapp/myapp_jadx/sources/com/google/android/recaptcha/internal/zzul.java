package com.google.android.recaptcha.internal;

import defpackage.ib5;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzul implements Iterator {
    final /* synthetic */ zzuo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzul(zzuo zzuoVar, zzun zzunVar) {
        this.zza = zzuoVar;
    }

    private final Iterator zza() {
        Iterator it = this.zzd;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.zza.zzc.entrySet().iterator();
        this.zzd = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzuo zzuoVar = this.zza;
        if (i >= zzuoVar.zzb) {
            return !zzuoVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzuo zzuoVar = this.zza;
        return i < zzuoVar.zzb ? (zzuk) zzuoVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            ib5.a("remove() was called before next()");
            return;
        }
        this.zzc = false;
        zzuo zzuoVar = this.zza;
        zzuoVar.zzo();
        int i = this.zzb;
        if (i >= zzuoVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzuoVar.zzm(i);
        }
    }
}
