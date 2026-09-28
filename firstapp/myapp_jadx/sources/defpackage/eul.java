package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class eul implements aoy {
    public final /* synthetic */ ful a;

    public eul(ful fulVar) {
        this.a = fulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
