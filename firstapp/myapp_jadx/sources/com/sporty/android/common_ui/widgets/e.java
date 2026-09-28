package com.sporty.android.common_ui.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.e;
import defpackage.itf0;
import defpackage.srr;
import defpackage.t0g0;
import defpackage.tug;
import defpackage.uhc;
import defpackage.uwx;
import defpackage.zi50;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static final ConcurrentHashMap.KeySetView<String, Boolean> g = ConcurrentHashMap.newKeySet();
    public final Context a;
    public final PopupWindow b;
    public d c;
    public Function0<Unit> d;
    public String e;
    public String f;

    public static final class a {
        public static void a(String str, boolean z) {
            if (str == null) {
                return;
            }
            if (z) {
                e.g.add(str);
            } else {
                e.g.remove(str);
            }
        }
    }

    public e(Context context) {
        context.getClass();
        this.a = context;
        this.b = new PopupWindow(context);
        this.c = d.a.C0204a.b;
        this.d = new t0g0();
        this.e = "";
    }

    public static boolean c(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                itf0.a.a("Activity is finishing or destroyed, skip popup display", new Object[0]);
                return false;
            }
        }
        if (view.isAttachedToWindow()) {
            return true;
        }
        itf0.a.a("Anchor view is not attached to window, skip popup display", new Object[0]);
        return false;
    }

    public final void a(int i, int i2, int i3, View view) {
        Object bVar;
        PopupWindow popupWindow = this.b;
        view.getClass();
        String str = this.f;
        if (str != null && g.contains(str)) {
            itf0.a.a(tug.a("Popup with id ", this.f, " is already showing, skip display"), new Object[0]);
            return;
        }
        if (!c(view)) {
            itf0.a.a("Anchor view is not attachable, skip popup display", new Object[0]);
            return;
        }
        a.a(this.f, true);
        try {
            zi50.a aVar = zi50.b;
            srr srrVarA = srr.a(LayoutInflater.from(this.a));
            ImageView imageView = srrVarA.b;
            d(srrVarA);
            Size size = new Size(popupWindow.getContentView().getMeasuredWidth(), popupWindow.getContentView().getMeasuredHeight());
            Size size2 = new Size(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
            int width = (int) ((size.getWidth() - size2.getWidth()) * this.c.a);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: v0g0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ConcurrentHashMap.KeySetView<String, Boolean> keySetView = e.g;
                    e.a.a(this.a.f, false);
                }
            });
            popupWindow.showAtLocation(view, 8388659, ((i - width) + (i3 / 2)) - (size2.getWidth() / 2), i2 - size.getHeight());
            this.d.invoke();
            bVar = popupWindow;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, "Failed to display popup", new Object[0]);
            a.a(this.f, false);
        }
        boolean z = bVar instanceof zi50.b;
        Object obj = bVar;
        if (z) {
            obj = null;
        }
    }

    public final void b(View view) {
        Object bVar;
        View rootView;
        int height;
        PopupWindow popupWindow = this.b;
        view.getClass();
        String str = this.f;
        if (str != null && g.contains(str)) {
            itf0.a.a(tug.a("Popup with id ", this.f, " is already showing, skip display"), new Object[0]);
            return;
        }
        if (!c(view)) {
            itf0.a.a("Anchor view is not attachable, skip popup display", new Object[0]);
            return;
        }
        a.a(this.f, true);
        try {
            zi50.a aVar = zi50.b;
            srr srrVarA = srr.a(LayoutInflater.from(this.a));
            ImageView imageView = srrVarA.b;
            d(srrVarA);
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null || (rootView = view2.getRootView()) == null) {
                itf0.a.a("get parent view fail", new Object[0]);
                return;
            }
            int[] iArr = new int[2];
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int[] iArr3 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            Size size = new Size(popupWindow.getContentView().getMeasuredWidth(), popupWindow.getContentView().getMeasuredHeight());
            Size size2 = new Size(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
            int width = (int) ((size.getWidth() - size2.getWidth()) * this.c.a);
            Size size3 = new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
            d dVar = this.c;
            if (dVar instanceof d.a) {
                height = iArr3[1] - size.getHeight();
            } else {
                if (!(dVar instanceof d.b)) {
                    throw new uwx();
                }
                height = iArr3[1] + size3.getHeight();
            }
            int width2 = ((iArr3[0] - width) + (size3.getWidth() / 2)) - (size2.getWidth() / 2);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: u0g0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ConcurrentHashMap.KeySetView<String, Boolean> keySetView = e.g;
                    e.a.a(this.a.f, false);
                }
            });
            popupWindow.showAtLocation(view, 8388659, width2, height);
            this.d.invoke();
            bVar = popupWindow;
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.f(thA, "Failed to display popup", new Object[0]);
                a.a(this.f, false);
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
    }

    public final void d(srr srrVar) {
        ImageView imageView = srrVar.c;
        ImageView imageView2 = srrVar.b;
        PopupWindow popupWindow = this.b;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setClippingEnabled(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        d dVar = this.c;
        if (dVar instanceof d.a) {
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
        } else if (!(dVar instanceof d.b)) {
            uhc.a();
            return;
        } else {
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
        TextView textView = srrVar.d;
        ConstraintLayout constraintLayout = srrVar.a;
        textView.setText(this.e);
        constraintLayout.getClass();
        float f = this.c.a;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.o(imageView2.getId()).e.x = f;
        bVar.b(constraintLayout);
        constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        popupWindow.setContentView(constraintLayout);
    }
}
