package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class i4i {
    public final t4i a;
    public final AndroidComposeView b;
    public final stw<FocusTargetNode> c = hz60.a();
    public final stw<w3i> d = hz60.a();
    public boolean e;

    public i4i(t4i t4iVar, AndroidComposeView androidComposeView) {
        this.a = t4iVar;
        this.b = androidComposeView;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.x(new h4i(0, this, i4i.class, "invalidateNodes", "invalidateNodes()V", 0));
        this.e = true;
    }
}
