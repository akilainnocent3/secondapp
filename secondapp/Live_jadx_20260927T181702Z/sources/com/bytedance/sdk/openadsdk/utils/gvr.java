package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class gvr {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww implements ViewTreeObserver.OnGlobalLayoutListener {
        View hww = null;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        final /* synthetic */ boolean f37644sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        final /* synthetic */ ViewGroup f37645tq;

        public hww(ViewGroup viewGroup, boolean z10) {
            this.f37645tq = viewGroup;
            this.f37644sd = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                tq tqVar = (tq) this.f37645tq.getTag(520093765);
                if (this.hww == null) {
                    ViewGroup viewGroup = this.f37645tq;
                    gvr.tq(viewGroup, tqVar, (Integer) viewGroup.getTag(520093766), this.f37644sd);
                    return;
                }
                Rect rect = new Rect();
                this.hww.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f37645tq.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (tqVar != null) {
                        tqVar.hww(this.f37645tq, false);
                    }
                    this.f37645tq.setTag(520093763, Boolean.FALSE);
                } else {
                    if (tqVar != null) {
                        tqVar.hww(this.f37645tq, true);
                    }
                    this.f37645tq.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f37645tq.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        void hww();

        void hww(View view, boolean z10);

        void hww(boolean z10);

        void tq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq(View view, tq tqVar, Integer num, boolean z10) {
        if (tqVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        tqVar.hww(view, hww(view, num.intValue(), z10));
    }

    public static void hww(final ViewGroup viewGroup, boolean z10, int i10, final boolean z11, tq tqVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, tqVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final hww hwwVar = new hww(viewGroup, z11);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gvr.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        hwwVar.hww = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        hwwVar.hww = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(hwwVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.gvr.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        tq tqVar2 = (tq) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        gvr.tq(viewGroup2, tqVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gvr.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z12) {
                try {
                    tq tqVar2 = (tq) viewGroup.getTag(520093765);
                    if (tqVar2 != null) {
                        tqVar2.hww(z12);
                        ViewGroup viewGroup2 = viewGroup;
                        gvr.tq(viewGroup2, tqVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.gvr.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                tq tqVar2 = (tq) viewGroup.getTag(520093765);
                if (tqVar2 != null) {
                    tqVar2.hww();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                tq tqVar2 = (tq) viewGroup.getTag(520093765);
                if (tqVar2 != null) {
                    tqVar2.tq();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean hww(View view, int i10, boolean z10) {
        return com.bytedance.sdk.openadsdk.core.syb.hww(view, 20, i10, z10);
    }

    public static ArrayList<View> hww(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(hww((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View hww(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return hww((View) parent, cls);
    }
}
