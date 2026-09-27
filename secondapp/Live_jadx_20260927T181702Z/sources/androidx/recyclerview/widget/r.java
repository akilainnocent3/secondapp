package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f19046j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f19047k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f19048l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19049m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19050n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19055e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19059i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19051a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19056f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19057g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f19053c;
        return i10 >= 0 && i10 < b0Var.d();
    }

    public View b(RecyclerView.w wVar) {
        View viewP = wVar.p(this.f19053c);
        this.f19053c += this.f19054d;
        return viewP;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f19052b + ", mCurrentPosition=" + this.f19053c + ", mItemDirection=" + this.f19054d + ", mLayoutDirection=" + this.f19055e + ", mStartLine=" + this.f19056f + ", mEndLine=" + this.f19057g + fw.b.f85383j;
    }
}
