package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class NonOverlappingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<ArrayList<View>> f12105d;

    public NonOverlappingLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.f12104c) {
            super.focusableViewAvailable(view);
            return;
        }
        View view2 = view;
        while (true) {
            if (view2 == this || view2 == null) {
                iIndexOfChild = -1;
                break;
            } else {
                if (view2.getParent() == this) {
                    iIndexOfChild = indexOfChild(view2);
                    break;
                }
                view2 = (View) view2.getParent();
            }
        }
        if (iIndexOfChild != -1) {
            this.f12105d.get(iIndexOfChild).add(view);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:16:0x001e A[Catch: all -> 0x0014, LOOP:0: B:16:0x001e->B:18:0x002a, LOOP_START, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0006, B:8:0x000c, B:16:0x001e, B:18:0x002a, B:19:0x0035, B:21:0x0041), top: B:53:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002a A[Catch: all -> 0x0014, LOOP:0: B:16:0x001e->B:18:0x002a, LOOP_END, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0006, B:8:0x000c, B:16:0x001e, B:18:0x002a, B:19:0x0035, B:21:0x0041), top: B:53:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[Catch: all -> 0x0014, LOOP:1: B:19:0x0035->B:21:0x0041, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0006, B:8:0x000c, B:16:0x001e, B:18:0x002a, B:19:0x0035, B:21:0x0041), top: B:53:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:24:0x0052, B:27:0x005a, B:30:0x0063, B:32:0x0071), top: B:55:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[LOOP:5: B:40:0x0091->B:42:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[LOOP:2: B:49:0x00b1->B:51:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        NonOverlappingLinearLayout nonOverlappingLinearLayout;
        Throwable th2;
        boolean z11;
        int i14;
        int i15;
        int i16 = 0;
        try {
            if (!this.f12103b) {
                z11 = false;
                this.f12104c = z11;
                if (z11) {
                    while (this.f12105d.size() > getChildCount()) {
                        ArrayList<ArrayList<View>> arrayList = this.f12105d;
                        arrayList.remove(arrayList.size() - 1);
                    }
                    while (this.f12105d.size() < getChildCount()) {
                        this.f12105d.add(new ArrayList<>());
                    }
                }
                nonOverlappingLinearLayout = this;
                super.onLayout(z10, i10, i11, i12, i13);
                if (nonOverlappingLinearLayout.f12104c) {
                    for (i14 = 0; i14 < nonOverlappingLinearLayout.f12105d.size(); i14++) {
                        for (i15 = 0; i15 < nonOverlappingLinearLayout.f12105d.get(i14).size(); i15++) {
                            super.focusableViewAvailable(nonOverlappingLinearLayout.f12105d.get(i14).get(i15));
                        }
                    }
                }
                if (nonOverlappingLinearLayout.f12104c) {
                    nonOverlappingLinearLayout.f12104c = false;
                    while (i16 < nonOverlappingLinearLayout.f12105d.size()) {
                        nonOverlappingLinearLayout.f12105d.get(i16).clear();
                        i16++;
                    }
                    return;
                }
                return;
            }
            try {
                if (getOrientation() == 0 && getLayoutDirection() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f12104c = z11;
                if (z11) {
                    while (this.f12105d.size() > getChildCount()) {
                        ArrayList<ArrayList<View>> arrayList2 = this.f12105d;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    while (this.f12105d.size() < getChildCount()) {
                        this.f12105d.add(new ArrayList<>());
                    }
                }
                nonOverlappingLinearLayout = this;
                try {
                    super.onLayout(z10, i10, i11, i12, i13);
                    if (nonOverlappingLinearLayout.f12104c) {
                        while (i14 < nonOverlappingLinearLayout.f12105d.size()) {
                            while (i15 < nonOverlappingLinearLayout.f12105d.get(i14).size()) {
                                super.focusableViewAvailable(nonOverlappingLinearLayout.f12105d.get(i14).get(i15));
                            }
                        }
                    }
                    if (nonOverlappingLinearLayout.f12104c) {
                        nonOverlappingLinearLayout.f12104c = false;
                        while (i16 < nonOverlappingLinearLayout.f12105d.size()) {
                            nonOverlappingLinearLayout.f12105d.get(i16).clear();
                            i16++;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    if (nonOverlappingLinearLayout.f12104c) {
                        throw th2;
                    }
                    nonOverlappingLinearLayout.f12104c = false;
                    while (i16 < nonOverlappingLinearLayout.f12105d.size()) {
                        nonOverlappingLinearLayout.f12105d.get(i16).clear();
                        i16++;
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                nonOverlappingLinearLayout = this;
            }
        } catch (Throwable th5) {
            th = th5;
            nonOverlappingLinearLayout = this;
        }
        if (nonOverlappingLinearLayout.f12104c) {
            throw th2;
        }
        nonOverlappingLinearLayout.f12104c = false;
        while (i16 < nonOverlappingLinearLayout.f12105d.size()) {
            nonOverlappingLinearLayout.f12105d.get(i16).clear();
            i16++;
        }
        throw th2;
    }

    public void setFocusableViewAvailableFixEnabled(boolean z10) {
        this.f12103b = z10;
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12103b = false;
        this.f12105d = new ArrayList<>();
    }
}
