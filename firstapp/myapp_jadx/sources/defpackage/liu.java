package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TabWidget;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class liu implements Runnable {
    public final /* synthetic */ MainActivity a;

    @Override // java.lang.Runnable
    public final void run() {
        TabWidget tabWidget;
        int i = MainActivity.m0;
        MainActivity mainActivity = this.a;
        if (mainActivity.v && (tabWidget = mainActivity.d.getTabWidget()) != null) {
            int iD1 = mainActivity.D1("Open Bets");
            if (vn20.c("sportybet", "openBetBubble", true)) {
                try {
                    if (mainActivity.c == null) {
                        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(mainActivity).inflate(R.layout.layout_show_tips, (ViewGroup) null), zch0.b(mainActivity.getResources(), 144), zch0.b(mainActivity.getResources(), 48));
                        mainActivity.c = popupWindow;
                        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                        mainActivity.c.setAnimationStyle(R.style.ShowTipsAnimation);
                        mainActivity.c.setFocusable(false);
                        mainActivity.c.setOutsideTouchable(false);
                    }
                    View childTabViewAt = tabWidget.getChildTabViewAt(iD1);
                    if (childTabViewAt != null) {
                        View viewFindViewById = childTabViewAt.findViewById(R.id.tab_img);
                        int[] iArr = new int[2];
                        viewFindViewById.getLocationOnScreen(iArr);
                        PopupWindow popupWindow2 = mainActivity.c;
                        popupWindow2.showAtLocation(viewFindViewById, 0, (iArr[0] - popupWindow2.getWidth()) + (viewFindViewById.getWidth() / 2), iArr[1] - (viewFindViewById.getHeight() * 2));
                        vn20.f(mainActivity, "sportybet", "openBetBubble", false, true);
                        mainActivity.d.postDelayed(new xju(mainActivity), 4000L);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
