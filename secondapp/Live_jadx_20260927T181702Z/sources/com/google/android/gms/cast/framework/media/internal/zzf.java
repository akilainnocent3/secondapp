package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.internal.cast.zzag;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends AsyncTask {
    private static final Logger zza = new Logger("FetchBitmapTask");

    @Nullable
    private final zzi zzb;
    private final zzb zzc;

    public zzf(Context context, int i10, int i11, boolean z10, long j10, int i12, int i13, int i14, zzb zzbVar) {
        this.zzc = zzbVar;
        this.zzb = zzag.zze(context.getApplicationContext(), this, new zze(this, null), i10, i11, false, 2097152L, 5, 333, 10000);
    }

    @Override // android.os.AsyncTask
    @Nullable
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        zzi zziVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (zziVar = this.zzb) == null) {
            return null;
        }
        try {
            return zziVar.zze(uri);
        } catch (RemoteException e10) {
            zza.d(e10, "Unable to call %s on %s.", "doFetch", zzi.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzb zzbVar = this.zzc;
        Bitmap bitmap = (Bitmap) obj;
        if (zzbVar != null) {
            zzbVar.zzb(bitmap);
        }
    }
}
