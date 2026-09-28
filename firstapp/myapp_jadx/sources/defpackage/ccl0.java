package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class ccl0 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        pdl0.h.incrementAndGet();
    }
}
