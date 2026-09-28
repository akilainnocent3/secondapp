package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class ab implements ba {
    private Context a;

    public /* synthetic */ ab(ad adVar) {
    }

    public final ab a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ac b() {
        Context context = this.a;
        if (context != null) {
            return new ac(context);
        }
        ib5.a(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private ab() {
        throw null;
    }
}
