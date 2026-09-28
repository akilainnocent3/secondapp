package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class azl implements aoy {
    public final /* synthetic */ bzl a;

    public azl(bzl bzlVar) {
        this.a = bzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
