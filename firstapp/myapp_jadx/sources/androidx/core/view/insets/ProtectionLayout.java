package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.hb5;
import defpackage.i630;
import defpackage.j630;
import defpackage.xpe0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object c = new Object();
    public final ArrayList a;
    public j630 b;

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = new ArrayList();
    }

    private xpe0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof xpe0) {
            return (xpe0) tag;
        }
        xpe0 xpe0Var = new xpe0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, xpe0Var);
        return xpe0Var;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new j630(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.b.a.size() <= 0) {
            return;
        }
        i630 i630Var = this.b.a.get(0);
        getContext();
        i630Var.getClass();
        hb5.a("Unexpected side: 0");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            j630 j630Var = this.b;
            int childCount = getChildCount() - (j630Var != null ? j630Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.a.size(), this.b.a.size());
            int size = this.b.a.size();
            j630 j630Var = this.b;
            if (size > 0) {
                j630Var.a.get(0).getClass();
                throw null;
            }
            ArrayList<i630> arrayList = j630Var.a;
            if (!j630Var.d) {
                j630Var.d = true;
                j630Var.b.b.remove(j630Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    arrayList.get(size2).a = null;
                }
                arrayList.clear();
            }
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof xpe0) {
            final xpe0 xpe0Var = (xpe0) tag;
            if (xpe0Var.b.isEmpty()) {
                xpe0Var.a.post(new Runnable() { // from class: wpe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        xpe0.a aVar = xpe0Var.a;
                        ViewParent parent = aVar.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(aVar);
                        }
                    }
                });
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<i630> list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.a = new ArrayList();
    }
}
