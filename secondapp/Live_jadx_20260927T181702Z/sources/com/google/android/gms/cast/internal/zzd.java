package com.google.android.gms.cast.internal;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zzd extends zzp {
    private final List zzb;

    public zzd(String str, String str2, @Nullable String str3) {
        super(str, "MediaControlChannel", null);
        this.zzb = Collections.synchronizedList(new ArrayList());
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzb.iterator();
                while (it.hasNext()) {
                    ((zzau) it.next()).zzc(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzau zzauVar) {
        this.zzb.add(zzauVar);
    }
}
