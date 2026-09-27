package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SessionProvider {
    private final Context zza;
    private final String zzb;
    private final zzbl zzc = new zzbl(this, null);

    public SessionProvider(@NonNull Context context, @NonNull String str) {
        this.zza = ((Context) Preconditions.checkNotNull(context)).getApplicationContext();
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Nullable
    public abstract Session createSession(@Nullable String str);

    @NonNull
    public final String getCategory() {
        return this.zzb;
    }

    @NonNull
    public final Context getContext() {
        return this.zza;
    }

    public abstract boolean isSessionRecoverable();

    @NonNull
    public final IBinder zza() {
        return this.zzc;
    }
}
