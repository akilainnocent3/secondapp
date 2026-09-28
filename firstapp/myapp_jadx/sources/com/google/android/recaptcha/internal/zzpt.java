package com.google.android.recaptcha.internal;

import com.appsflyer.internal.x;
import defpackage.zug;

/* JADX INFO: loaded from: classes4.dex */
final class zzpt {
    public static void zza(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new ArithmeticException(zug.a(j2, ", ", ")", x.a(j, "overflow: ", str, "(")));
        }
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
