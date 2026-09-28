package defpackage;

import android.widget.PopupWindow;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class xju implements Runnable {
    public final /* synthetic */ MainActivity a;

    public xju(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = MainActivity.m0;
        PopupWindow popupWindow = this.a.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
