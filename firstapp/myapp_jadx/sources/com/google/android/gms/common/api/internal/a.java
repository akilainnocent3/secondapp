package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.bj50;
import defpackage.hm20;
import defpackage.sl0;
import sl0.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<R extends bj50, A extends sl0.b> extends BasePendingResult<R> {
    public abstract void h(A a);

    public final void i(Status status) {
        hm20.a("Failed result must not be success", !(status.a <= 0));
        e(b(status));
    }
}
