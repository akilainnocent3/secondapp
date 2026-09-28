package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.ye0;
import defpackage.ze0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RecyclerView.s {
    public androidx.viewpager2.widget.a a;
    public final ViewPager2 b;
    public final ViewPager2.k c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public static final class a {
        public int a;
        public float b;
        public int c;
    }

    public d(ViewPager2 viewPager2) {
        this.b = viewPager2;
        ViewPager2.k kVar = viewPager2.y;
        this.c = kVar;
        this.d = (LinearLayoutManager) kVar.getLayoutManager();
        this.g = new a();
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        androidx.viewpager2.widget.a aVar;
        androidx.viewpager2.widget.a aVar2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.f1();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        a aVar3 = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            e();
            if (!this.k) {
                int i4 = aVar3.a;
                if (i4 != -1 && (aVar2 = this.a) != null) {
                    aVar2.b(0.0f, i4, 0);
                }
            } else if (aVar3.c == 0) {
                int i5 = this.h;
                int i6 = aVar3.a;
                if (i5 != i6 && (aVar = this.a) != null) {
                    aVar.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (aVar3.c == 0) {
                int i7 = this.i;
                int i8 = aVar3.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    androidx.viewpager2.widget.a aVar4 = this.a;
                    if (aVar4 != null) {
                        aVar4.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        androidx.viewpager2.widget.a aVar;
        this.k = true;
        e();
        boolean z = this.j;
        a aVar2 = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == this.b.b()) {
                        if (aVar2.c != 0) {
                            i3 = aVar2.a + 1;
                        }
                    }
                }
                i3 = aVar2.a;
            } else if (aVar2.c != 0) {
                i3 = aVar2.a + 1;
            } else {
                i3 = aVar2.a;
            }
            this.i = i3;
            if (this.h != i3 && (aVar = this.a) != null) {
                aVar.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = aVar2.a;
            if (i4 == -1) {
                i4 = 0;
            }
            androidx.viewpager2.widget.a aVar3 = this.a;
            if (aVar3 != null) {
                aVar3.c(i4);
            }
        }
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = aVar2.b;
        int i6 = aVar2.c;
        androidx.viewpager2.widget.a aVar4 = this.a;
        if (aVar4 != null) {
            aVar4.b(f, i5, i6);
        }
        int i7 = aVar2.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && aVar2.c == 0 && this.f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        androidx.viewpager2.widget.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        a aVar = this.g;
        aVar.a = -1;
        aVar.b = 0.0f;
        aVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[LOOP:2: B:64:0x0138->B:67:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[SYNTHETIC] */
    public final void e() {
        int top;
        int iK;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iF1 = linearLayoutManager.f1();
        a aVar = this.g;
        aVar.a = iF1;
        if (iF1 == -1) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        View viewF = linearLayoutManager.F(iF1);
        if (viewF == null) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        int i3 = ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.left;
        int i4 = ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.right;
        int i5 = ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.top;
        int i6 = ((RecyclerView.LayoutParams) viewF.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewF.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewF.getHeight() + i5 + i6;
        int width = viewF.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.E;
        ViewPager2.k kVar = this.c;
        if (i7 == 0) {
            top = (viewF.getLeft() - i3) - kVar.getPaddingLeft();
            if (this.b.b()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewF.getTop() - i5) - kVar.getPaddingTop();
        }
        int i8 = -top;
        aVar.c = i8;
        if (i8 >= 0) {
            aVar.b = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iK2 = linearLayoutManager.K();
        if (iK2 != 0) {
            boolean z = linearLayoutManager.E == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iK2, 2);
            for (int i9 = 0; i9 < iK2; i9++) {
                View viewJ = linearLayoutManager.J(i9);
                if (viewJ == null) {
                    ib5.a("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewJ.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : ze0.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewJ.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewJ.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewJ.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewJ.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ye0());
            int i10 = 1;
            while (true) {
                if (i10 >= iK2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iK2 - 1][1] >= i13) {
                        if (linearLayoutManager.K() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iK = linearLayoutManager.K();
                for (int i14 = 0; i14 < iK; i14++) {
                    if (!ze0.a(linearLayoutManager.J(i14))) {
                        ib5.a("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.K() <= 1) {
            iK = linearLayoutManager.K();
            while (i14 < iK) {
                if (!ze0.a(linearLayoutManager.J(i14))) {
                    ib5.a("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        ib5.a(hce0.a(aVar.c, "Page can only be offset by a positive amount, not by "));
    }
}
