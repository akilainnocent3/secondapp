package com.google.android.recaptcha.internal;

import defpackage.q6a0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqt extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzqt(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbA = q6a0.a(j, "Pos: ", ", limit: ");
        sbA.append(j2);
        sbA.append(", len: ");
        sbA.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbA.toString()), th);
    }

    public zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzqt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
