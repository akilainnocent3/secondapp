package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s88 extends bs60<s2> {
    public final nzm A;
    public final ema B;
    public final ArrayList C;
    public int D;
    public oi40 E;
    public ArrayList F;
    public ArrayList G;
    public soi0 H;
    public String I;
    public CountryCodeName J;
    public PopupWindow K;
    public PreMatchEventActivity L;
    public final r88 M;
    public boolean N;
    public final pc20 b;
    public final String c;
    public final nh4 d;
    public final lrm e;
    public final psm f;
    public final y8j i;
    public final hd20 v;
    public final id20 w;
    public final jd20 y;
    public final kd20 z;

    public s88(pc20 pc20Var, String str, CountryCodeName countryCodeName, nh4 nh4Var, lrm lrmVar, psm psmVar, y8j y8jVar, hd20 hd20Var, id20 id20Var, jd20 jd20Var, kd20 kd20Var, nzm nzmVar) {
        str.getClass();
        nh4Var.getClass();
        lrmVar.getClass();
        psmVar.getClass();
        y8jVar.getClass();
        this.b = pc20Var;
        this.c = str;
        this.d = nh4Var;
        this.e = lrmVar;
        this.f = psmVar;
        this.i = y8jVar;
        this.v = hd20Var;
        this.w = id20Var;
        this.y = jd20Var;
        this.z = kd20Var;
        this.A = nzmVar;
        this.B = new ema();
        this.C = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        x88[] x88VarArr = x88.a;
        this.I = "NEWEST";
        this.M = new r88(this);
        this.J = countryCodeName;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty()) {
            return 1;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.C;
        if (i < arrayList.size()) {
            return ((u88) arrayList.get(i)).a();
        }
        return 0;
    }

    public final u88 l() {
        Object obj;
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            u88 u88Var = (u88) obj;
            if (u88Var.a() == 3 || u88Var.a() == 8) {
                return (u88) obj;
            }
        }
        obj = null;
        return (u88) obj;
    }

    public final void m(int i) {
        String code;
        if (i == 0) {
            this.D = 0;
            this.C.clear();
            i();
        }
        hd20 hd20Var = this.v;
        hd20Var.getClass();
        String str = this.c;
        str.getClass();
        of20 of20Var = hd20Var.a.R0;
        if (of20Var != null) {
            ct90<bi50<VoteResponse>> ct90VarB = of20Var.y.h(str).d(wm70.c).b(va0.a());
            hf20 hf20Var = new hf20(of20Var);
            ct90VarB.a(hf20Var);
            of20Var.x1(hf20Var);
        }
        id20 id20Var = this.w;
        id20Var.getClass();
        of20 of20Var2 = id20Var.a.R0;
        if (of20Var2 != null) {
            kzh.d(new yzh(new g1i(bm50.f(of20Var2.w.getRecommendCode(str)), new ff20(of20Var2, null)), new gf20(of20Var2, null)), o8i0.d(of20Var2));
        }
        CountryCodeName countryCodeName = this.J;
        String str2 = this.I;
        hd20Var.getClass();
        str.getClass();
        str2.getClass();
        of20 of20Var3 = hd20Var.a.R0;
        if (of20Var3 != null) {
            t8d0 t8d0Var = of20Var3.y;
            if (countryCodeName == null || (code = countryCodeName.getCode()) == null) {
                code = "";
            }
            ct90<bi50<PostCommentResponse>> ct90VarB2 = t8d0Var.d(code, "", 0, str, 10, str2, "PRE_MATCH").d(wm70.c).b(va0.a());
            ye20 ye20Var = new ye20(of20Var3);
            ct90VarB2.a(ye20Var);
            of20Var3.x1(ye20Var);
        }
    }

    public final void n(boolean z) {
        PreMatchEventActivity preMatchEventActivity = this.b.a;
        int i = PreMatchEventActivity.a2;
        if (wc.d(preMatchEventActivity)) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) instanceof z4w) {
                    Object obj = arrayList.get(i2);
                    obj.getClass();
                    z4w z4wVar = (z4w) obj;
                    z4wVar.c = true;
                    z4wVar.d = z;
                    j(i2);
                    return;
                }
            }
        }
    }

    public final void o(boolean z) {
        PreMatchEventActivity preMatchEventActivity = this.b.a;
        int i = PreMatchEventActivity.a2;
        if (wc.d(preMatchEventActivity)) {
            if (!z) {
                n(true);
                return;
            }
            if (!this.G.isEmpty()) {
                ArrayList arrayList = this.C;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size() - 1;
                    arrayList.addAll(size, this.G);
                    k(size, this.G.size());
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            i2 = -1;
                            break;
                        } else if (arrayList.get(i2) instanceof z4w) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        arrayList.remove(i2);
                        m88 m88Var = (m88) rh6.a(1, this.G);
                        z4w z4wVar = new z4w();
                        String.valueOf(m88Var.c.getId());
                        boolean z2 = m88Var.b;
                        z4wVar.c = !z2;
                        z4wVar.d = false;
                        z4wVar.b = z2;
                        z4wVar.a = m88Var.a;
                        arrayList.add(z4wVar);
                        i();
                        return;
                    }
                    return;
                }
            }
            n(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        s2 s2Var = (s2) d0Var;
        s2Var.getClass();
        ArrayList arrayList = this.C;
        if (!arrayList.isEmpty()) {
            u88 u88Var = (u88) arrayList.get(i);
            int iA = u88Var.a();
            if (iA != 1) {
                if (iA != 6) {
                    if (iA != 8) {
                        if (iA != 3) {
                            if (iA == 4 && (s2Var instanceof e98)) {
                                z4w z4wVar = (z4w) u88Var;
                                e98 e98Var = (e98) s2Var;
                                e98Var.c = z4wVar;
                                e98Var.d(z4wVar);
                            }
                        } else if (s2Var instanceof t98) {
                            t98 t98Var = (t98) s2Var;
                            if (!arrayList.isEmpty()) {
                                t98Var.f = arrayList;
                            }
                        }
                    } else if (s2Var instanceof qi40) {
                        ((qi40) s2Var).v = arrayList;
                    }
                } else if (s2Var instanceof z88) {
                    z88 z88Var = (z88) s2Var;
                    hgd0 hgd0Var = z88Var.b;
                    z88Var.a = this;
                    String str = this.I;
                    TextView textView = z88Var.c;
                    str.getClass();
                    x88[] x88VarArr = x88.a;
                    if (str.equals("NEWEST")) {
                        textView.setText(z88Var.itemView.getContext().getText(R.string.live__newest));
                    } else if (str.equals("POPULARITY")) {
                        textView.setText(z88Var.itemView.getContext().getText(R.string.live__most_popular));
                    } else if (str.equals("SHARED_BET")) {
                        textView.setText(z88Var.itemView.getContext().getText(R.string.live__shared_bet));
                    }
                    CountryCodeName countryCodeName = this.J;
                    CircleImageView circleImageView = hgd0Var.c;
                    if (countryCodeName == null) {
                        circleImageView.setImageResource(R.drawable.ic_sportybet_logo_flag);
                    } else {
                        int iA2 = y7b.a(countryCodeName);
                        Integer numValueOf = Integer.valueOf(iA2);
                        if (iA2 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            circleImageView.setImageResource(numValueOf.intValue());
                        } else {
                            sh8.a().a(y7b.b(countryCodeName), circleImageView);
                        }
                    }
                    hgd0Var.b.setVisibility(this.N ? 0 : 8);
                }
            } else if (s2Var instanceof roi0) {
                roi0 roi0Var = (roi0) s2Var;
                roi0Var.A = this;
                roi0Var.y = arrayList;
            }
        }
        s2Var.a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        r88 r88Var = this.M;
        if (i == 0) {
            return new c98(viewGroup, r88Var);
        }
        if (i == 1) {
            return new roi0(viewGroup);
        }
        if (i == 3) {
            return new t98(viewGroup, this.v, this.z);
        }
        if (i == 4) {
            return new e98(viewGroup, r88Var);
        }
        if (i == 5) {
            return new z3g(viewGroup, R.layout.spr_adapter_empty_comment_item);
        }
        if (i == 6) {
            return new z88(viewGroup);
        }
        if (i != 8) {
            return new cf4(viewGroup, R.layout.blank_view_container);
        }
        return new qi40(viewGroup, this.d, this.e, this.f, this.i, this.z, this.y, this.A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        s2 s2Var = (s2) d0Var;
        s2Var.getClass();
        super.onViewAttachedToWindow(s2Var);
        int bindingAdapterPosition = s2Var.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty()) {
            return;
        }
        int itemViewType = s2Var.getItemViewType();
        if ((itemViewType == 3 || itemViewType == 8) && Intrinsics.g(arrayList.get(bindingAdapterPosition), l())) {
            this.v.f(j98.c.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        s2 s2Var = (s2) d0Var;
        s2Var.getClass();
        super.onViewDetachedFromWindow(s2Var);
        int bindingAdapterPosition = s2Var.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty()) {
            return;
        }
        int itemViewType = s2Var.getItemViewType();
        if ((itemViewType == 3 || itemViewType == 8) && Intrinsics.g(arrayList.get(bindingAdapterPosition), l())) {
            this.v.f(j98.a.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        s2 s2Var = (s2) d0Var;
        s2Var.getClass();
        super.onViewRecycled(s2Var);
        s2Var.b();
    }

    public final void p(boolean z) {
        PreMatchEventActivity preMatchEventActivity = this.b.a;
        int i = PreMatchEventActivity.a2;
        if (wc.d(preMatchEventActivity)) {
            ema emaVar = this.B;
            if (emaVar.f() > 0) {
                emaVar.d();
            }
            SwipeRefreshLayout swipeRefreshLayout = preMatchEventActivity.T;
            boolean z2 = false;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            ImageView imageView = preMatchEventActivity.E0;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            if (z) {
                ArrayList arrayList = this.C;
                arrayList.clear();
                soi0 soi0Var = this.H;
                if (soi0Var != null && !soi0Var.c.isEmpty()) {
                    arrayList.add(soi0Var);
                }
                arrayList.add(new w88());
                preMatchEventActivity.i2(true);
                if (!this.F.isEmpty()) {
                    this.N = true;
                }
                oi40 oi40Var = this.E;
                if (oi40Var != null && !oi40Var.c.isEmpty()) {
                    arrayList.add(oi40Var);
                }
                if (this.F.isEmpty()) {
                    arrayList.add(new y1g());
                } else {
                    arrayList.addAll(this.F);
                    z4w z4wVar = new z4w();
                    m88 m88Var = (m88) rh6.a(1, this.F);
                    String.valueOf(m88Var.c.getId());
                    boolean z3 = m88Var.b;
                    z4wVar.c = !z3;
                    z4wVar.d = false;
                    z4wVar.b = z3;
                    z4wVar.a = m88Var.a;
                    arrayList.add(z4wVar);
                }
                i();
                PreMatchEventActivity preMatchEventActivity2 = this.L;
                if (preMatchEventActivity2 != null) {
                    RecyclerView recyclerView = preMatchEventActivity2.U;
                    RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.w1(0, 0);
                    }
                    if (preMatchEventActivity2.S != null) {
                        Rect rect = new Rect();
                        ConsecutiveScrollerLayout consecutiveScrollerLayout = preMatchEventActivity2.q1;
                        if (consecutiveScrollerLayout != null) {
                            consecutiveScrollerLayout.getHitRect(rect);
                        }
                        ComposeView composeView = preMatchEventActivity2.m0;
                        if (composeView != null && composeView.getLocalVisibleRect(rect)) {
                            z2 = true;
                        }
                        preMatchEventActivity2.Y1(z2);
                    }
                }
            } else {
                zyf0.c(0, preMatchEventActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
            }
            if (this.F.isEmpty() && this.E == null) {
                this.v.f(j98.b.a);
            }
            PopupWindow popupWindow = this.K;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    public final void q(soi0 soi0Var, boolean z) {
        this.H = soi0Var;
        if (soi0Var.c.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty() || !(arrayList.get(0) instanceof soi0)) {
            return;
        }
        arrayList.set(0, soi0Var);
        j(0);
        if (z) {
            PreMatchEventActivity preMatchEventActivity = this.b.a;
            int i = PreMatchEventActivity.a2;
            if (preMatchEventActivity.isFinishing() || preMatchEventActivity.isDestroyed()) {
                return;
            }
            zyf0.c(0, preMatchEventActivity.getCMSString(R.string.live__vote_successfully, new Object[0]));
            Unit unit = Unit.a;
        }
    }
}
