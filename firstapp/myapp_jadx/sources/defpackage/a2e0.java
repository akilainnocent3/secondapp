package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes7.dex */
public final class a2e0 implements tse {
    public final /* synthetic */ ComposeView a;

    public a2e0(ComposeView composeView) {
        this.a = composeView;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.setTag(null);
    }
}
