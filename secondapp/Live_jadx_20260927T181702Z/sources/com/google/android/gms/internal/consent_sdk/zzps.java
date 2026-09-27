package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.b0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzps extends IOException {
    public zzps() {
        super(b0.f.f9586c);
    }

    public zzps(long j10, long j11, int i10, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th2);
    }

    public zzps(Throwable th2) {
        super(b0.f.f9586c, th2);
    }
}
