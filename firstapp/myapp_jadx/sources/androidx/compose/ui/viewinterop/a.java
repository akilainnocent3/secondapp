package androidx.compose.ui.viewinterop;

import defpackage.flx;
import defpackage.tsr;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0049a a = new C0049a();

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    public static final class C0049a implements flx {
    }

    public static final void a(ViewFactoryHolder viewFactoryHolder, tsr tsrVar) {
        long jI0 = tsrVar.U.c.i0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jI0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jI0 & 4294967295L)));
        viewFactoryHolder.layout(iRound, iRound2, viewFactoryHolder.getMeasuredWidth() + iRound, viewFactoryHolder.getMeasuredHeight() + iRound2);
    }
}
