package com.cleveradssolutions.internal.consent;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends androidx.customview.widget.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zm f43268a;

    public e(zm zmVar) {
        this.f43268a = zmVar;
    }

    @Override // androidx.customview.widget.d.c
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.d.c
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        int iF = this.f43268a.f();
        zm zmVar = this.f43268a;
        return s1.a.e(i10, iF, zmVar.f43344w ? zmVar.G : zmVar.f43343v);
    }

    @Override // androidx.customview.widget.d.c
    public final int getViewVerticalDragRange(View view) {
        zm zmVar = this.f43268a;
        return zmVar.f43344w ? zmVar.G : zmVar.f43343v;
    }

    @Override // androidx.customview.widget.d.c
    public final void onViewDragStateChanged(int i10) {
        if (i10 == 1) {
            zm zmVar = this.f43268a;
            if (zmVar.f43346y) {
                zmVar.k(1);
            }
        }
    }

    @Override // androidx.customview.widget.d.c
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        this.f43268a.u(i11);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    @Override // androidx.customview.widget.d.c
    public final void onViewReleased(View view, float f10, float f11) {
        int i10;
        if (f11 < 0.0f) {
            if (!this.f43268a.f43324c) {
                int top = view.getTop();
                System.currentTimeMillis();
                this.f43268a.getClass();
                if (top > this.f43268a.f43341t) {
                    i10 = 6;
                }
            }
            i10 = 3;
        } else {
            zm zmVar = this.f43268a;
            if (zmVar.f43344w && zmVar.y(view, f11)) {
                if (Math.abs(f10) >= Math.abs(f11) || f11 <= 500.0f) {
                    int top2 = view.getTop();
                    zm zmVar2 = this.f43268a;
                    if (top2 <= (zmVar2.f() + zmVar2.G) / 2) {
                        if (!this.f43268a.f43324c && Math.abs(view.getTop() - this.f43268a.f()) >= Math.abs(view.getTop() - this.f43268a.f43341t)) {
                            i10 = 6;
                        } else {
                            i10 = 3;
                        }
                    }
                }
                i10 = 5;
            } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                int top3 = view.getTop();
                zm zmVar3 = this.f43268a;
                if (!zmVar3.f43324c) {
                    int i11 = zmVar3.f43341t;
                    if (top3 < i11) {
                        if (top3 < Math.abs(top3 - zmVar3.f43343v)) {
                            i10 = 3;
                        } else {
                            this.f43268a.getClass();
                        }
                    } else if (Math.abs(top3 - i11) < Math.abs(top3 - this.f43268a.f43343v)) {
                        this.f43268a.getClass();
                    } else {
                        i10 = 4;
                    }
                    i10 = 6;
                } else if (Math.abs(top3 - zmVar3.f43340s) < Math.abs(top3 - this.f43268a.f43343v)) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else {
                if (!this.f43268a.f43324c) {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - this.f43268a.f43341t) < Math.abs(top4 - this.f43268a.f43343v)) {
                        this.f43268a.getClass();
                        i10 = 6;
                    }
                }
                i10 = 4;
            }
        }
        zm zmVar4 = this.f43268a;
        zmVar4.getClass();
        zmVar4.w(view, i10, true);
    }

    @Override // androidx.customview.widget.d.c
    public final boolean tryCaptureView(View view, int i10) {
        zm zmVar = this.f43268a;
        int i11 = zmVar.f43347z;
        if (i11 == 1 || zmVar.N) {
            return false;
        }
        if (i11 == 3 && zmVar.L == i10) {
            WeakReference weakReference = zmVar.I;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.f43268a.H;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
