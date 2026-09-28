package com.google.android.recaptcha.internal;

import defpackage.ay0;
import defpackage.m2g;
import defpackage.zkh;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzku {
    private List zza = m2g.a;

    public final long zza(long[] jArr) {
        Iterator it = CollectionsKt.i0(ay0.R(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = ay0.R(jArr);
    }
}
