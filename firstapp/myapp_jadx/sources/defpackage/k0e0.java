package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0e0 {
    public RecyclerView a;
    public RecyclerView.f<RecyclerView.d0> b;
    public a c;
    public LinearLayout e;
    public final mpe0 d = hwr.b(new cn0(1));
    public final b f = new b();

    public interface a {
        boolean d(int i);
    }

    public static final class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            k0e0.this.d(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(RecyclerView recyclerView, RecyclerView.f<?> fVar, a aVar) {
        recyclerView.getClass();
        fVar.getClass();
        aVar.getClass();
        this.a = recyclerView;
        this.b = fVar;
        this.c = aVar;
        ViewParent parent = recyclerView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.sticky_header_container);
            this.e = linearLayout;
            if (linearLayout == null) {
                RecyclerView recyclerView2 = this.a;
                if (recyclerView2 == null) {
                    Intrinsics.n("recyclerView");
                    throw null;
                }
                LinearLayout linearLayout2 = new LinearLayout(recyclerView2.getContext());
                linearLayout2.setId(R.id.sticky_header_container);
                linearLayout2.setOrientation(1);
                viewGroup.addView(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
                this.e = linearLayout2;
            }
        }
        recyclerView.k(this.f);
        c().clear();
        LinearLayout linearLayout3 = this.e;
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
        }
        d(false);
    }

    public final void b() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            recyclerView.k0(this.f);
        }
        c().clear();
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.e = null;
    }

    public final Map<Integer, Boolean> c() {
        return (Map) this.d.getValue();
    }

    public final void d(final boolean z) {
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: i0e0
            @Override // java.lang.Runnable
            public final void run() {
                final LinearLayout linearLayout;
                boolean z2 = z;
                k0e0 k0e0Var = this;
                if (z2) {
                    k0e0Var.c().clear();
                    LinearLayout linearLayout2 = k0e0Var.e;
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                } else {
                    RecyclerView recyclerView2 = k0e0Var.a;
                    if (recyclerView2 == null) {
                        Intrinsics.n("recyclerView");
                        throw null;
                    }
                    RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    int iF1 = linearLayoutManager != null ? linearLayoutManager.f1() : 0;
                    for (Map.Entry<Integer, Boolean> entry : k0e0Var.c().entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        boolean zBooleanValue = entry.getValue().booleanValue();
                        k0e0.a aVar = k0e0Var.c;
                        if (aVar == null) {
                            Intrinsics.n("listener");
                            throw null;
                        }
                        if (!aVar.d(iIntValue) || iIntValue > iF1) {
                            if (zBooleanValue) {
                                k0e0Var.e(iIntValue);
                            }
                        }
                    }
                }
                RecyclerView recyclerView3 = k0e0Var.a;
                if (recyclerView3 == null) {
                    Intrinsics.n("recyclerView");
                    throw null;
                }
                RecyclerView.o layoutManager2 = recyclerView3.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                for (int iF2 = linearLayoutManager2 != null ? linearLayoutManager2.f1() : 0; iF2 >= 0; iF2--) {
                    k0e0.a aVar2 = k0e0Var.c;
                    if (aVar2 == null) {
                        Intrinsics.n("listener");
                        throw null;
                    }
                    if (aVar2.d(iF2)) {
                        for (Map.Entry<Integer, Boolean> entry2 : k0e0Var.c().entrySet()) {
                            int iIntValue2 = entry2.getKey().intValue();
                            boolean zBooleanValue2 = entry2.getValue().booleanValue();
                            k0e0.a aVar3 = k0e0Var.c;
                            if (aVar3 == null) {
                                Intrinsics.n("listener");
                                throw null;
                            }
                            if (!aVar3.d(iIntValue2) || iIntValue2 < iF2) {
                                if (zBooleanValue2) {
                                    k0e0Var.e(iIntValue2);
                                }
                            }
                        }
                        Boolean bool = k0e0Var.c().get(Integer.valueOf(iF2));
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.g(bool, bool2) || (linearLayout = k0e0Var.e) == null) {
                            return;
                        }
                        RecyclerView.f<RecyclerView.d0> fVar = k0e0Var.b;
                        if (fVar == null) {
                            Intrinsics.n("adapter");
                            throw null;
                        }
                        RecyclerView.d0 d0VarCreateViewHolder = fVar.createViewHolder(linearLayout, fVar.getItemViewType(iF2));
                        d0VarCreateViewHolder.getClass();
                        RecyclerView.f<RecyclerView.d0> fVar2 = k0e0Var.b;
                        if (fVar2 == null) {
                            Intrinsics.n("adapter");
                            throw null;
                        }
                        fVar2.bindViewHolder(d0VarCreateViewHolder, iF2);
                        View view = d0VarCreateViewHolder.itemView;
                        view.getClass();
                        view.setTag(Integer.valueOf(iF2));
                        linearLayout.addView(view, -1, -2);
                        k0e0Var.c().put(Integer.valueOf(iF2), bool2);
                        RecyclerView recyclerView4 = k0e0Var.a;
                        if (recyclerView4 != null) {
                            recyclerView4.post(new Runnable() { // from class: j0e0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    linearLayout.requestLayout();
                                }
                            });
                            return;
                        } else {
                            Intrinsics.n("recyclerView");
                            throw null;
                        }
                    }
                }
            }
        });
    }

    public final void e(int i) {
        LinearLayout linearLayout;
        if (Intrinsics.g(c().get(Integer.valueOf(i)), Boolean.TRUE)) {
            LinearLayout linearLayout2 = this.e;
            View viewFindViewWithTag = linearLayout2 != null ? linearLayout2.findViewWithTag(Integer.valueOf(i)) : null;
            if (viewFindViewWithTag != null && (linearLayout = this.e) != null) {
                linearLayout.removeView(viewFindViewWithTag);
            }
            c().put(Integer.valueOf(i), Boolean.FALSE);
        }
    }
}
