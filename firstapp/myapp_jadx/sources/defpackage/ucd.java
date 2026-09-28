package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ucd implements zdl {
    public final View a;

    public ucd(View view) {
        this.a = view;
    }

    @Override // defpackage.zdl
    public final void a(int i) {
        View view = this.a;
        if (i == 16) {
            view.performHapticFeedback(16);
            return;
        }
        if (i == 6) {
            view.performHapticFeedback(6);
            return;
        }
        if (i == 13) {
            view.performHapticFeedback(13);
            return;
        }
        if (i == 23) {
            view.performHapticFeedback(23);
            return;
        }
        if (i == 3) {
            view.performHapticFeedback(3);
            return;
        }
        if (i == 0) {
            view.performHapticFeedback(0);
            return;
        }
        if (i == 17) {
            view.performHapticFeedback(17);
            return;
        }
        if (i == 27) {
            view.performHapticFeedback(27);
            return;
        }
        if (i == 26) {
            view.performHapticFeedback(26);
            return;
        }
        if (i == 9) {
            view.performHapticFeedback(9);
            return;
        }
        if (i == 22) {
            view.performHapticFeedback(22);
        } else if (i == 21) {
            view.performHapticFeedback(21);
        } else if (i == 1) {
            view.performHapticFeedback(1);
        }
    }
}
