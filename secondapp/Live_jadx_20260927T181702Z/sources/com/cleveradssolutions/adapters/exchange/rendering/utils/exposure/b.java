package com.cleveradssolutions.adapters.exchange.rendering.utils.exposure;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42516d = "zr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f42517a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42519c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f42518b = new Rect();

    public static /* synthetic */ int h(Rect rect, Rect rect2) {
        return -Float.compare(rect.width() * rect.height(), rect2.width() * rect2.height());
    }

    public c b(View view) {
        if (view == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42516d, "exposure: Returning zeroExposure. Test View is null.");
            return null;
        }
        this.f42517a = new WeakReference(view);
        c cVar = new c();
        view.getDrawingRect(this.f42518b);
        this.f42519c.clear();
        if (view.isShown() && view.hasWindowFocus() && !e(view)) {
            boolean zO = o((ViewGroup) view.getParent(), view);
            boolean zC = c();
            com.cleveradssolutions.adapters.exchange.b.c(f42516d, "exposure: visitParent " + zO + " collapseBox " + zC);
            if (zO && zC) {
                List<Rect> listJ = j();
                float width = view.getWidth() * view.getHeight();
                float fWidth = this.f42518b.width() * this.f42518b.height();
                float fWidth2 = 0.0f;
                for (Rect rect : listJ) {
                    fWidth2 += rect.width() * rect.height();
                }
                return new c((fWidth - fWidth2) / width, this.f42518b, listJ);
            }
        }
        return cVar;
    }

    public final boolean c() {
        Rect rect = new Rect(this.f42518b);
        if (rect.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(this.f42518b);
        Iterator it = this.f42519c.iterator();
        do {
            ArrayList arrayList3 = arrayList2;
            arrayList2 = arrayList;
            arrayList = arrayList3;
            if (!it.hasNext()) {
                Rect rect2 = new Rect();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Rect rect3 = (Rect) arrayList2.get(i10);
                    if (i10 == 0) {
                        rect2 = rect3;
                    } else {
                        rect2.union(rect3);
                    }
                }
                if (rect.equals(rect2)) {
                    return true;
                }
                this.f42518b = rect2;
                int size = this.f42519c.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    Rect rect4 = (Rect) this.f42519c.get(i12);
                    Rect rect5 = new Rect(rect2);
                    if (!rect5.intersect(rect4)) {
                        i11++;
                    } else if (!rect2.contains(rect4)) {
                        this.f42519c.set(i12 - i11, rect5);
                    } else if (i11 > 0) {
                        this.f42519c.set(i12 - i11, rect4);
                    }
                }
                if (i11 > 0) {
                    int i13 = size - i11;
                    this.f42519c.subList(i13, i11 + i13).clear();
                }
                return true;
            }
            l((Rect) it.next(), arrayList2, arrayList, 0);
            arrayList2.clear();
        } while (!arrayList.isEmpty());
        this.f42518b = new Rect();
        return false;
    }

    public final boolean d(View view) {
        boolean z10 = view instanceof ImageView;
        return ((z10 && view.getId() == j.f42535e) || ((z10 && view.getId() == j.f42536f) || view.getId() == com.cleveradssolutions.adapters.exchange.a.b.f42009e)) || view.getId() == 16908336;
    }

    public final boolean e(View view) {
        return view.getAlpha() == 0.0f;
    }

    public boolean f(View view) {
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        Drawable foreground = view.getForeground();
        Drawable background = view.getBackground();
        return ((background == null || background.getAlpha() == 0) && (foreground == null || foreground.getAlpha() == 0)) ? false : true;
    }

    public final void g(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        Rect rectI = i(rect, view, (View) this.f42517a.get());
        Rect rect2 = new Rect(this.f42518b);
        if (rect2.intersect(rectI)) {
            this.f42519c.add(rect2);
        }
    }

    public final Rect i(Rect rect, View view, View view2) {
        if (rect == null || view == null || view2 == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42516d, "convertRect: Failed. One of the provided param is null. Returning empty rect.");
            return new Rect();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int scrollX = (iArr[0] - iArr2[0]) - view.getScrollX();
        int scrollY = (iArr[1] - iArr2[1]) - view.getScrollY();
        return new Rect(rect.left + scrollX, rect.top + scrollY, rect.right + scrollX, rect.bottom + scrollY);
    }

    public final List j() {
        if (this.f42519c.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f42519c);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = new Comparator() { // from class: com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.h((Rect) obj, (Rect) obj2);
            }
        };
        while (arrayList.size() > 0) {
            Collections.sort(arrayList, comparator);
            Rect rect = (Rect) arrayList.get(0);
            arrayList3.add(rect);
            l(rect, arrayList, arrayList2, 1);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList4.clear();
            arrayList = arrayList2;
            arrayList2 = arrayList4;
        }
        return arrayList3;
    }

    public final void k(Rect rect, Rect rect2, List list) {
        if (!Rect.intersects(rect, rect2)) {
            list.add(rect);
            return;
        }
        if (rect2.contains(rect)) {
            return;
        }
        Rect rect3 = new Rect(rect2);
        if (!rect3.intersect(rect)) {
            com.cleveradssolutions.adapters.exchange.b.h(f42516d, "fragmentize: Error. Rect is not trimmed");
            return;
        }
        int i10 = rect.left;
        int i11 = rect.top;
        Rect rect4 = new Rect(i10, i11, (rect3.left - i10) + i10, rect.height() + i11);
        int i12 = rect3.left;
        int i13 = rect.top;
        Rect rect5 = new Rect(i12, i13, rect3.right, (rect3.top - i13) + i13);
        Rect rect6 = new Rect(rect3.left, rect3.bottom, rect3.right, rect.bottom);
        int i14 = rect3.right;
        int i15 = rect.top;
        Rect rect7 = new Rect(i14, i15, rect.right, rect.height() + i15);
        Rect[] rectArr = {rect4, rect5, rect6, rect7};
        for (int i16 = 0; i16 < 4; i16++) {
            Rect rect8 = rectArr[i16];
            if (!rect8.isEmpty()) {
                list.add(rect8);
            }
        }
    }

    public final void l(Rect rect, List list, List list2, int i10) {
        int size = list.size();
        while (i10 < size) {
            k((Rect) list.get(i10), rect, list2);
            i10++;
        }
    }

    public final void m(View view) {
        if (!view.isShown() || e(view)) {
            return;
        }
        if (f(view)) {
            g(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m(viewGroup.getChildAt(i10));
            }
        }
    }

    public final boolean n(ViewGroup viewGroup) {
        return viewGroup.getClipChildren();
    }

    public final boolean o(ViewGroup viewGroup, View view) {
        if (viewGroup.getVisibility() != 0 || e(viewGroup)) {
            return false;
        }
        if (n(viewGroup)) {
            Rect rect = new Rect();
            viewGroup.getDrawingRect(rect);
            if (!this.f42518b.intersect(i(rect, viewGroup, (View) this.f42517a.get()))) {
                return false;
            }
        }
        if ((viewGroup.getParent() instanceof ViewGroup) && !o((ViewGroup) viewGroup.getParent(), viewGroup)) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
            View childAt = viewGroup.getChildAt(iIndexOfChild);
            if (!d(childAt)) {
                m(childAt);
            }
        }
        return true;
    }
}
