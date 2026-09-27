package com.google.android.gms.internal.cast;

import androidx.datastore.preferences.protobuf.b0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzta extends IOException {
    public zzta() {
        super(b0.f.f9586c);
    }

    public zzta(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    public zzta(Throwable th2) {
        super(b0.f.f9586c, th2);
    }
}
