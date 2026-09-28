package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class y6i0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [hbs, w6i0] */
    public static final x6i0 a(final AbstractComposeView abstractComposeView, s9s s9sVar) {
        if (s9sVar.b().compareTo(s9s.b.a) <= 0) {
            ruw.b(abstractComposeView, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", s9sVar, "is already destroyed");
            return null;
        }
        ?? r0 = new cbs() { // from class: w6i0
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                if (aVar == s9s.a.ON_DESTROY) {
                    abstractComposeView.e();
                }
            }
        };
        s9sVar.a(r0);
        return new x6i0(s9sVar, r0);
    }
}
