package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ib5;
import defpackage.n36;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewPager2.g {
    public final LinearLayoutManager a;
    public ViewPager2.i b;

    public c(ViewPager2.f fVar) {
        this.a = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(float f, int i, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i3 >= linearLayoutManager.K()) {
                return;
            }
            View viewJ = linearLayoutManager.J(i3);
            if (viewJ == null) {
                Locale locale = Locale.US;
                ib5.a(n36.a("LayoutManager returned a null child at pos ", i3, linearLayoutManager.K(), "/", " while transforming pages"));
                return;
            } else {
                this.b.a(viewJ, (RecyclerView.o.U(viewJ) - i) + f2);
                i3++;
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
    }
}
