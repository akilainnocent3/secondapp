package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zziat {
    @Deprecated
    public zziat() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzibs zzibsVar = new zzibs(zzibn.zza(sb2));
            zzibsVar.zza(zziay.LENIENT);
            zzibo.zza.zza(zzibsVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zziav zze() {
        if (this instanceof zziav) {
            return (zziav) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzias zzf() {
        if (this instanceof zzias) {
            return (zzias) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zziax zzg() {
        if (this instanceof zziax) {
            return (zziax) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
