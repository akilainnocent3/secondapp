package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;

/* JADX INFO: loaded from: classes8.dex */
public final class ch6 extends RecyclerView.y {
    public final a i;
    public final CardStackLayoutManager j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("AutomaticSwipe", 0);
            a = aVar;
            a aVar2 = new a("AutomaticRewind", 1);
            b = aVar2;
            a aVar3 = new a("ManualSwipe", 2);
            c = aVar3;
            a aVar4 = new a("ManualCancel", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public ch6(a aVar, CardStackLayoutManager cardStackLayoutManager) {
        this.i = aVar;
        this.j = cardStackLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void c(int i, int i2, RecyclerView.y.a aVar) {
        if (this.i == a.b) {
            gs50 gs50Var = this.j.G.k;
            aVar.b(-h(gs50Var), -i(gs50Var), r.d.DEFAULT_DRAG_ANIMATION_DURATION, gs50Var.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void d() {
        CardStackLayoutManager cardStackLayoutManager = this.j;
        ah6 ah6Var = cardStackLayoutManager.F;
        eh6 eh6Var = cardStackLayoutManager.H;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0) {
            eh6Var.a = eh6.a.d;
            cardStackLayoutManager.U0();
            ah6Var.j0(eh6Var.f);
            return;
        }
        eh6.a aVar = eh6.a.c;
        if (iOrdinal == 1) {
            eh6Var.a = aVar;
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            eh6Var.a = aVar;
        } else {
            eh6Var.a = eh6.a.f;
            cardStackLayoutManager.U0();
            ah6Var.j0(eh6Var.f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void e() {
        CardStackLayoutManager cardStackLayoutManager = this.j;
        ah6 ah6Var = cardStackLayoutManager.F;
        int iOrdinal = this.i.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                return;
            }
            ah6Var.getClass();
        } else {
            ah6Var.getClass();
            cardStackLayoutManager.U0();
            int i = cardStackLayoutManager.H.f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void f(View view, RecyclerView.y.a aVar) {
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        int iOrdinal = this.i.ordinal();
        CardStackLayoutManager cardStackLayoutManager = this.j;
        if (iOrdinal == 0) {
            kke0 kke0Var = cardStackLayoutManager.G.j;
            aVar.b(-h(kke0Var), -i(kke0Var), kke0Var.b, kke0Var.c);
            return;
        }
        if (iOrdinal == 1) {
            gs50 gs50Var = cardStackLayoutManager.G.k;
            gs50Var.getClass();
            aVar.b(translationX, translationY, r.d.DEFAULT_DRAG_ANIMATION_DURATION, gs50Var.a);
        } else if (iOrdinal == 2) {
            kke0 kke0Var2 = cardStackLayoutManager.G.j;
            aVar.b((-translationX) * 10, (-translationY) * 10, kke0Var2.b, kke0Var2.c);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            gs50 gs50Var2 = cardStackLayoutManager.G.k;
            gs50Var2.getClass();
            aVar.b(translationX, translationY, r.d.DEFAULT_DRAG_ANIMATION_DURATION, gs50Var2.a);
        }
    }

    public final int h(wi0 wi0Var) {
        int i;
        eh6 eh6Var = this.j.H;
        int iOrdinal = wi0Var.a().ordinal();
        if (iOrdinal == 0) {
            i = -eh6Var.b;
        } else {
            if (iOrdinal != 1) {
                return 0;
            }
            i = eh6Var.b;
        }
        return i * 2;
    }

    public final int i(wi0 wi0Var) {
        eh6 eh6Var = this.j.H;
        int iOrdinal = wi0Var.a().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return eh6Var.c / 4;
        }
        if (iOrdinal == 2) {
            return (-eh6Var.c) * 2;
        }
        if (iOrdinal != 3) {
            return 0;
        }
        return eh6Var.c * 2;
    }
}
