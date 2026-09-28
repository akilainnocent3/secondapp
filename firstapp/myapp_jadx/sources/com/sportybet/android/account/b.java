package com.sportybet.android.account;

import android.content.Context;
import defpackage.aoy;
import defpackage.pw40;
import defpackage.py1;
import defpackage.qw40;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends py1 {
    private boolean injected = false;

    public class a implements aoy {
        public a() {
        }

        @Override // defpackage.aoy
        public final void onContextAvailable(Context context) {
            b.this.inject();
        }
    }

    public b() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((qw40) generatedComponent()).r2((pw40) this);
    }
}
