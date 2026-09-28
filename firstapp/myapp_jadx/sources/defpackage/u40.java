package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u40 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        etw<AndroidComposeView> etwVar = AndroidComposeView.b1;
        synchronized (etwVar) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = etwVar.a;
                int i2 = etwVar.b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i3];
                        boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                        Class<?> cls = AndroidComposeView.Y0;
                        androidComposeView.setShowLayoutBounds(AndroidComposeView.a.a());
                        if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                            AndroidComposeView.M(androidComposeView.getRoot());
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        AndroidComposeView.M(((AndroidComposeView) objArr[i3]).getRoot());
                        i3++;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
