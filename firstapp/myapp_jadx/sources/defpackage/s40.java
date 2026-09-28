package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s40 implements Runnable {
    public final /* synthetic */ AndroidComposeView a;

    @Override // java.lang.Runnable
    public final void run() {
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.R0 = false;
        MotionEvent motionEvent = androidComposeView.J0;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.V(motionEvent);
        } else {
            ib5.a("The ACTION_HOVER_EXIT event was not cleared.");
        }
    }
}
