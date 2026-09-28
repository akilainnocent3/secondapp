package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class y implements ae {
    private Context a;

    public /* synthetic */ y(aa aaVar) {
    }

    public final y a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ae
    public final z b() {
        Context context = this.a;
        if (context != null) {
            return new z(context);
        }
        ib5.a(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private y() {
        throw null;
    }
}
