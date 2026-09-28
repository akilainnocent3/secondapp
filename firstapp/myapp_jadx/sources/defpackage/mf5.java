package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mf5 extends RecyclerView.f<RecyclerView.d0> {
    public final rss a;
    public List<? extends nss> b = m2g.a;

    public static final class a extends RecyclerView.d0 {
        public static final /* synthetic */ int a = 0;
    }

    public static final /* synthetic */ class b extends saj implements Function2<String, Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Boolean bool) {
            String str2 = str;
            boolean zBooleanValue = bool.booleanValue();
            str2.getClass();
            mf5 mf5Var = (mf5) this.receiver;
            List<? extends nss> list = mf5Var.b;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (spe speVarE : list) {
                if (speVarE instanceof nss.c) {
                    nss.c cVar = (nss.c) speVarE;
                    if (Intrinsics.g(cVar.a, str2)) {
                        speVarE = nss.c.e(cVar, zBooleanValue);
                    }
                }
                arrayList.add(speVarE);
            }
            mf5Var.i(arrayList);
            return Unit.a;
        }
    }

    public mf5(rss rssVar) {
        this.a = rssVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.b.get(i).d();
    }

    public final void i(List<? extends nss> list) {
        List<? extends nss> list2 = this.b;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            spe speVarE = (nss) obj;
            if (speVarE instanceof nss.c) {
                speVarE = nss.c.e((nss.c) speVarE, true);
            }
            arrayList.add(speVarE);
        }
        this.b = arrayList;
        list2.getClass();
        n.a(new rpe(list2, arrayList), true).b(new androidx.recyclerview.widget.b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        nss nssVar = this.b.get(i);
        if (nssVar instanceof nss.c) {
            ((bss) d0Var).c((nss.c) nssVar, new b(2, this, mf5.class, "toggleSingleEventItem", "toggleSingleEventItem(Ljava/lang/String;Z)V", 0));
        } else if (nssVar instanceof nss.b) {
            ((qss) d0Var).a((nss.b) nssVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 2) {
            int i2 = bss.y;
            return bss.a.a(viewGroup, this.a, true);
        }
        if (i == 3) {
            return new qss(z4p.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.iwqk_layout_live_score_odds_item, viewGroup, false)), true);
        }
        int i3 = a.a;
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        return new a(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        d0Var.getClass();
        super.onViewRecycled(d0Var);
        bss bssVar = d0Var instanceof bss ? (bss) d0Var : null;
        if (bssVar != null) {
            bssVar.onViewRecycled();
        }
    }
}
