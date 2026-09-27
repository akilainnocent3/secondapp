package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.WebImage;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzn {

    @Nullable
    public final Uri zza;
    public Bitmap zzb;

    public zzn(@Nullable WebImage webImage) {
        this.zza = webImage == null ? null : webImage.getUrl();
    }
}
