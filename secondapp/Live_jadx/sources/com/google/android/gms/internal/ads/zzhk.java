package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzhk extends IOException {
    public final int zza;

    public zzhk(int i10) {
        this.zza = i10;
    }

    public zzhk(@Nullable String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzhk(@Nullable String str, @Nullable Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzhk(@Nullable Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
