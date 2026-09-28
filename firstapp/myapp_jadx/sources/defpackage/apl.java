package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class apl implements aoy {
    public final /* synthetic */ bpl a;

    public apl(bpl bplVar) {
        this.a = bplVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
