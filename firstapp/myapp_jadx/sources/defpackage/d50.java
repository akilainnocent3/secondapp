package defpackage;

import androidx.compose.ui.platform.c;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2096, 2131}, m = "boundsUpdatesEventLoop$ui_release")
public final class d50 extends x1b {
    public nsw a;
    public c77 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(c cVar, x1b x1bVar) {
        super(x1bVar);
        this.d = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(this);
    }
}
