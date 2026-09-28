package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bfk0;
import defpackage.pdk0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
abstract class br extends bfk0 {
    final /* synthetic */ bs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(bs bsVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(bsVar);
        this.f = bsVar;
    }

    @Override // defpackage.bfk0
    public final void a(Exception exc) {
        if (!(exc instanceof pdk0)) {
            super.a(exc);
        } else if (bs.m(this.f)) {
            super.a(new StandardIntegrityException(-2, false, exc));
        } else {
            super.a(new StandardIntegrityException(-9, false, exc));
        }
    }
}
