package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class yec extends PopupWindow {
    public int a;

    public yec(ViewGroup viewGroup) {
        super((View) viewGroup, -1, -1, true);
        this.a = 0;
    }

    public static int a(Context context) {
        boolean zHasPermanentMenuKey = ViewConfiguration.get(context).hasPermanentMenuKey();
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0 || zHasPermanentMenuKey) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public final void b(int i, View view) {
        setBackgroundDrawable(view.getResources().getDrawable(R.color.spr_dialog_bg_black));
        showAsDropDown(view, 0, i);
        try {
            View view2 = getBackground() == null ? (View) getContentView().getParent() : (View) getContentView().getParent().getParent();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view2.getLayoutParams();
            layoutParams.flags |= 32;
            windowManager.updateViewLayout(view2, layoutParams);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("CustomPopWindow");
            aVar.p(e, "Failed to set popup window background clickable", new Object[0]);
        }
    }

    public final void c(View view) {
        super.showAsDropDown(view);
        try {
            View view2 = getBackground() == null ? (View) getContentView().getParent() : (View) getContentView().getParent().getParent();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view2.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = 0.6f;
            windowManager.updateViewLayout(view2, layoutParams);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("CustomPopWindow");
            aVar.p(e, "Failed to dim popup window background", new Object[0]);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        int iA;
        int iA2;
        if (Build.VERSION.SDK_INT >= 35) {
            iA = this.a;
            if (iA <= 0) {
                iA = a(view.getContext());
            }
        } else {
            iA = 0;
        }
        try {
            View viewFindViewById = view.getRootView().findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                viewFindViewById.getGlobalVisibleRect(rect2);
                setHeight(((rect2.bottom - rect.bottom) - iA) - i2);
            } else {
                if (Build.VERSION.SDK_INT >= 35) {
                    iA2 = this.a;
                    if (iA2 <= 0) {
                        iA2 = a(view.getContext());
                    }
                } else {
                    iA2 = 0;
                }
                try {
                    Rect rect3 = new Rect();
                    view.getGlobalVisibleRect(rect3);
                    setHeight(((view.getRootView().getHeight() - iA2) - rect3.bottom) - i2);
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    aVar.q("CustomPopWindow");
                    aVar.p(e, "error in resetHeightByRootViewHeight", new Object[0]);
                }
            }
        } catch (Exception e2) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("CustomPopWindow");
            aVar2.p(e2, "error in resetHeightByContentViewHeight", new Object[0]);
        }
        super.showAsDropDown(view, i, i2);
    }

    public yec(View view) {
        super(view, -1, -2, false);
        this.a = 0;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        showAsDropDown(view, 0, 0);
    }
}
