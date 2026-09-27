package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbxl zza;

    public zzbxk(zzbxl zzbxlVar) {
        Objects.requireNonNull(zzbxlVar);
        this.zza = zzbxlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
