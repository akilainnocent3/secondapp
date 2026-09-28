package com.google.android.recaptcha.internal;

import defpackage.whs;

/* JADX INFO: loaded from: classes4.dex */
final class zzve extends IllegalArgumentException {
    public zzve(int i, int i2) {
        super(whs.b(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
