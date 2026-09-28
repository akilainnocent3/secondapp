package com.sporty.android.common.base;

import android.content.Context;
import defpackage.aoy;
import defpackage.py1;
import defpackage.r1k;
import defpackage.vy1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends r1k {
    private boolean injected = false;

    /* JADX INFO: renamed from: com.sporty.android.common.base.a$a, reason: collision with other inner class name */
    public class C0202a implements aoy {
        public C0202a() {
        }

        @Override // defpackage.aoy
        public final void onContextAvailable(Context context) {
            a.this.inject();
        }
    }

    public a() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new C0202a());
    }

    @Override // defpackage.hrl
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((vy1) generatedComponent()).F2((py1) this);
    }
}
