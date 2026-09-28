package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q6i0 extends r6i0.b<Boolean> {
    @Override // r6i0.b
    public final Boolean a(View view) {
        return Boolean.valueOf(r6i0.h.b(view));
    }

    @Override // r6i0.b
    public final void b(View view, Boolean bool) {
        r6i0.h.d(view, bool.booleanValue());
    }

    @Override // r6i0.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
