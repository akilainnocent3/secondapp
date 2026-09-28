package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;

/* JADX INFO: loaded from: classes7.dex */
public final class yg6 extends RecyclerView.h {
    public final CardStackView a;

    public yg6(CardStackView cardStackView) {
        this.a = cardStackView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        h().H.f = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void e(int i, int i2) {
        h().A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void f(int i, int i2) {
        CardStackLayoutManager cardStackLayoutManagerH = h();
        eh6 eh6Var = cardStackLayoutManagerH.H;
        int i3 = eh6Var.f;
        if (cardStackLayoutManagerH.a() == 0) {
            eh6Var.f = 0;
        } else if (i < i3) {
            eh6Var.f = Math.min(i3 - (i3 - i), cardStackLayoutManagerH.a() - 1);
        }
    }

    public final CardStackLayoutManager h() {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager instanceof CardStackLayoutManager) {
            return (CardStackLayoutManager) layoutManager;
        }
        ib5.a("CardStackView must be set CardStackLayoutManager.");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void b(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void c(int i, int i2, Object obj) {
    }
}
