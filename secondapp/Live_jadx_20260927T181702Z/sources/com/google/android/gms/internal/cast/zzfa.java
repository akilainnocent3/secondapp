package com.google.android.gms.internal.cast;

import gi.j;
import zq.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfa extends zzev {
    private final Object zza;

    public zzfa(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzfa) {
            return this.zza.equals(((zzfa) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + j.f86771d;
    }

    @Override // com.google.android.gms.internal.cast.zzev
    public final Object zza(Object obj) {
        zzez.zzc(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.zza;
    }
}
