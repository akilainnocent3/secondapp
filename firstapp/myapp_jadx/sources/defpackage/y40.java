package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {734}, m = "textInputSession")
public final class y40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ AndroidComposeView b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(AndroidComposeView androidComposeView, x1b x1bVar) {
        super(x1bVar);
        this.b = androidComposeView;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.v(null, this);
        return y5b.a;
    }
}
