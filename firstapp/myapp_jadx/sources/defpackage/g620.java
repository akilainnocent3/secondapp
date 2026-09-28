package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
public final class g620 implements sym {
    public final rym a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public ComposeView c;
    public jvd0 d;

    public g620(rym rymVar) {
        this.a = rymVar;
        kfe0 kfe0VarA = lfe0.a();
        pfd pfdVar = fse.a;
        w5b.a(CoroutineContext.Element.a.d(kfe0VarA, gku.a.h0()));
        xwd0.a(0);
        xwd0.a(null);
    }

    @Override // defpackage.sym
    public final boolean isEnabled() {
        return this.b.get();
    }

    @Override // defpackage.sym
    public final void setEnabled(boolean z) {
        this.b.set(z);
        if (z) {
            return;
        }
        ComposeView composeView = this.c;
        if (composeView != null) {
            ViewParent parent = composeView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(composeView);
            }
            itf0.a aVar = itf0.a;
            aVar.q("PopupQueueOverlay");
            aVar.a("Overlay detached", new Object[0]);
        }
        this.c = null;
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = null;
    }
}
