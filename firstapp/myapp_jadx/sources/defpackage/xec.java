package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xec implements PopupWindow.OnDismissListener {
    public Context a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public View f;
    public PopupWindow i;
    public wbz v;
    public Window w;
    public boolean y;

    public static class a {
        public final xec a;

        public a(Context context) {
            xec xecVar = new xec();
            xecVar.d = true;
            xecVar.e = -1;
            xecVar.y = false;
            xecVar.a = context;
            this.a = xecVar;
        }

        public final xec a() {
            PopupWindow popupWindow;
            xec xecVar = this.a;
            View viewInflate = xecVar.f;
            if (viewInflate == null) {
                viewInflate = LayoutInflater.from(xecVar.a).inflate(xecVar.e, (ViewGroup) null);
                xecVar.f = viewInflate;
            }
            Activity activity = (Activity) viewInflate.getContext();
            if (activity != null && xecVar.y) {
                Window window = activity.getWindow();
                xecVar.w = window;
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.alpha = 0.7f;
                xecVar.w.addFlags(2);
                xecVar.w.setAttributes(attributes);
            }
            if (xecVar.b == 0 || xecVar.c == 0) {
                popupWindow = new PopupWindow(xecVar.f, -2, -2);
                xecVar.i = popupWindow;
            } else {
                popupWindow = new PopupWindow(xecVar.f, xecVar.b, xecVar.c);
                xecVar.i = popupWindow;
            }
            popupWindow.setClippingEnabled(true);
            wbz wbzVar = xecVar.v;
            if (wbzVar != null) {
                popupWindow.setOnDismissListener(wbzVar);
            }
            popupWindow.setTouchable(true);
            if (xecVar.b == 0 || xecVar.c == 0) {
                xecVar.i.getContentView().measure(0, 0);
                xecVar.b = xecVar.i.getContentView().getMeasuredWidth();
                xecVar.c = xecVar.i.getContentView().getMeasuredHeight();
            }
            xecVar.i.setOnDismissListener(xecVar);
            xecVar.i.setFocusable(xecVar.d);
            xecVar.i.setBackgroundDrawable(new ColorDrawable(0));
            xecVar.i.setOutsideTouchable(true);
            xecVar.i.update();
            return xecVar;
        }
    }

    public final void a() {
        wbz wbzVar = this.v;
        if (wbzVar != null) {
            wbzVar.onDismiss();
        }
        Window window = this.w;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f;
            this.w.setAttributes(attributes);
        }
        PopupWindow popupWindow = this.i;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        a();
    }
}
