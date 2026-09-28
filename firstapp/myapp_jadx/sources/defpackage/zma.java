package defpackage;

import androidx.compose.runtime.d;

/* JADX INFO: loaded from: classes.dex */
public final class zma {
    public static final <T> T a(yma ymaVar, d dVar) {
        if (!ymaVar.i().C) {
            wkn.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) pkd.f(ymaVar).Q.b(dVar);
    }
}
