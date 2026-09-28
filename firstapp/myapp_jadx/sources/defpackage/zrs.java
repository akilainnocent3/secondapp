package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zrs extends RecyclerView.f<RecyclerView.d0> {
    public final rss a;
    public List<? extends nss> b = m2g.a;

    public static final /* synthetic */ class a extends saj implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            ((zrs) this.receiver).k(bool.booleanValue());
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function2<String, Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Boolean bool) {
            String str2 = str;
            boolean zBooleanValue = bool.booleanValue();
            str2.getClass();
            zrs zrsVar = (zrs) this.receiver;
            List<? extends nss> list = zrsVar.b;
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
            zrsVar.j(arrayList);
            return Unit.a;
        }
    }

    public zrs(rss rssVar) {
        this.a = rssVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return i().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((nss) i().get(i)).d();
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = null;
        for (nss nssVar : this.b) {
            if (nssVar instanceof nss.c) {
                nss.c cVar = (nss.c) nssVar;
                str = cVar.a;
                z = cVar.j;
                arrayList.add(nssVar);
            } else if (nssVar instanceof nss.d) {
                String str2 = ((nss.d) nssVar).a;
                arrayList.add(nssVar);
                str = str2;
                z = true;
            } else if (!(nssVar instanceof nss.b)) {
                arrayList.add(nssVar);
            } else if (Intrinsics.g(((nss.b) nssVar).a, str) && z) {
                arrayList.add(nssVar);
            }
        }
        return arrayList;
    }

    public final void j(List<? extends nss> list) {
        list.getClass();
        ArrayList arrayListI = i();
        this.b = list;
        n.a(new rpe(arrayListI, i()), true).b(new androidx.recyclerview.widget.b(this));
    }

    public final void k(boolean z) {
        List<? extends nss> list = this.b;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (spe speVarE : list) {
            if (speVarE instanceof nss.a) {
                speVarE = new nss.a(z);
            } else if (speVarE instanceof nss.c) {
                speVarE = nss.c.e((nss.c) speVarE, z);
            }
            arrayList.add(speVarE);
        }
        j(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        nss nssVar = (nss) i().get(i);
        if (nssVar instanceof nss.a) {
            nss.a aVar = (nss.a) nssVar;
            a aVar2 = new a(1, this, zrs.class, "toggleAllItem", "toggleAllItem(Z)V", 0);
            v4p v4pVar = ((yrs) d0Var).a;
            sn5.f(v4pVar.b, aVar.a ? R.string.common_functions__collapse_all : R.string.common_functions__expand_all, new Object[0]);
            v4pVar.b.setOnClickListener(new xrs(0, aVar2, aVar));
            return;
        }
        if (nssVar instanceof nss.e) {
            ((ass) d0Var).a.b.setText(((nss.e) nssVar).a);
            return;
        }
        if (nssVar instanceof nss.c) {
            ((bss) d0Var).c((nss.c) nssVar, new b(2, this, zrs.class, "toggleSingleEventItem", "toggleSingleEventItem(Ljava/lang/String;Z)V", 0));
            return;
        }
        if (nssVar instanceof nss.b) {
            ((qss) d0Var).a((nss.b) nssVar);
            return;
        }
        if (!(nssVar instanceof nss.d)) {
            uhc.a();
            return;
        }
        pss pssVar = (pss) d0Var;
        final nss.d dVar = (nss.d) nssVar;
        ComposeView composeView = pssVar.a.b;
        final rss rssVar = pssVar.b;
        rssVar.getClass();
        final d.a aVar3 = d.a.b;
        composeView.setContent(new op8(599277723, new Function2() { // from class: ahc0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar4 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final nss.d dVar2 = dVar;
                    final rss rssVar2 = rssVar;
                    final d dVar3 = aVar3;
                    o0z.a(null, null, null, null, null, pp8.b(1898996556, new Function2() { // from class: ihc0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar5 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                thc0.c(dVar2, rssVar2, dVar3, aVar5, 72);
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    }, aVar4), aVar4, 196608);
                } else {
                    aVar4.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            View viewA = dzc.a(viewGroup, R.layout.iwqk_layout_live_score_action_item, viewGroup, false);
            int i2 = R.id.action_btn;
            TextView textView = (TextView) h5e.a(R.id.action_btn, viewA);
            if (textView != null) {
                i2 = R.id.divider_line;
                View viewA2 = h5e.a(R.id.divider_line, viewA);
                if (viewA2 != null) {
                    return new yrs(new v4p((RelativeLayout) viewA, textView, viewA2));
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 1) {
            View viewA3 = dzc.a(viewGroup, R.layout.iwqk_layout_live_score_event_title_item, viewGroup, false);
            TextView textView2 = (TextView) h5e.a(R.id.tv_event_title, viewA3);
            if (textView2 != null) {
                return new ass(new x4p((LinearLayout) viewA3, textView2));
            }
            bmy.a("Missing required view with ID: ".concat(viewA3.getResources().getResourceName(R.id.tv_event_title)));
            return null;
        }
        rss rssVar = this.a;
        if (i == 2) {
            int i3 = bss.y;
            return bss.a.a(viewGroup, rssVar, false);
        }
        if (i == 3) {
            return new qss(z4p.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.iwqk_layout_live_score_odds_item, viewGroup, false)), false);
        }
        if (i != 4) {
            throw new IllegalStateException(("Unable to create ViewHolder due to unknown viewType [\"" + i + "\"]").toString());
        }
        int i4 = pss.c;
        rssVar.getClass();
        View viewA4 = dzc.a(viewGroup, R.layout.iwqk_layout_live_score_legends_event_item, viewGroup, false);
        ComposeView composeView = (ComposeView) h5e.a(R.id.live_score_legends_event_item_compose_view, viewA4);
        if (composeView != null) {
            return new pss(new y4p((ConstraintLayout) viewA4, composeView), rssVar);
        }
        bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(R.id.live_score_legends_event_item_compose_view)));
        return null;
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
