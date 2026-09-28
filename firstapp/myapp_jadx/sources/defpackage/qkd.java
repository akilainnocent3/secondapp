package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qkd {
    public static final View a(okd okdVar) {
        if (!okdVar.i().C) {
            wkn.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) xsr.a(pkd.f(okdVar));
    }
}
