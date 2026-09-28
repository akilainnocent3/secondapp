package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class lh6 extends v {
    public final /* synthetic */ CarouselLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh6(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final PointF a(int i) {
        return this.q.b(i);
    }

    @Override // androidx.recyclerview.widget.v
    public final int i(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        if (carouselLayoutManager.J == null || !carouselLayoutManager.h1()) {
            return 0;
        }
        int iU = RecyclerView.o.U(view);
        return (int) (carouselLayoutManager.E - carouselLayoutManager.e1(iU, carouselLayoutManager.d1(iU)));
    }

    @Override // androidx.recyclerview.widget.v
    public final int j(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        if (carouselLayoutManager.J == null || carouselLayoutManager.h1()) {
            return 0;
        }
        int iU = RecyclerView.o.U(view);
        return (int) (carouselLayoutManager.E - carouselLayoutManager.e1(iU, carouselLayoutManager.d1(iU)));
    }
}
