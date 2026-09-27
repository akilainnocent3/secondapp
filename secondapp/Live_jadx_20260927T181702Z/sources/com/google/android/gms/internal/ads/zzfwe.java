package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfwe extends AsyncTask {
    private zzfwf zza;
    protected final zzfvw zzd;

    public zzfwe(zzfvw zzfvwVar) {
        this.zzd = zzfvwVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfwf zzfwfVar = this.zza;
        if (zzfwfVar != null) {
            zzfwfVar.zzb(this);
        }
    }

    public final void zzb(zzfwf zzfwfVar) {
        this.zza = zzfwfVar;
    }
}
