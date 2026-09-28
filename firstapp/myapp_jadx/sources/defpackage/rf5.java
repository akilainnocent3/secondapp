package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.kickoff.betresult.BetResultAdapter;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf5;", "Lk12;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rf5 extends nnl {
    public awi B;
    public final rss C;
    public Map<Integer, ? extends List<? extends ess>> D;
    public final mf5 E;
    public final oss F;
    public BetResultAdapter G;
    public BigDecimal H;
    public enj I;
    public ValueAnimator J;
    public long K;
    public final q8i0 L;
    public gtm M;
    public jlo N;
    public ji2 O;
    public gbn P;
    public psm Q;
    public rdd0 R;
    public y8j S;
    public ie3 T;

    public static final class a implements lfy, paj {
        public final /* synthetic */ sf5 a;

        public a(sf5 sf5Var) {
            this.a = sf5Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) throws Throwable {
            this.a.invoke(obj);
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return rf5.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? rf5.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public rf5() {
        rss rssVar = new rss();
        this.C = rssVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.D = o2gVar;
        this.E = new mf5(rssVar);
        this.F = new oss();
        this.H = BigDecimal.ZERO;
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.L = new q8i0(jq40.a(dz50.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nnl, defpackage.aml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        enj enjVar;
        context.getClass();
        super.onAttach(context);
        if (getParentFragment() instanceof enj) {
            nv60 parentFragment = getParentFragment();
            parentFragment.getClass();
            enjVar = (enj) parentFragment;
        } else {
            enjVar = context instanceof enj ? (enj) context : null;
        }
        this.I = enjVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        awi awiVarA = awi.a(layoutInflater);
        this.B = awiVarA;
        ConstraintLayout constraintLayout = awiVarA.a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.end();
            valueAnimator.cancel();
        }
        this.J = null;
        q0();
        awi awiVar = this.B;
        if (awiVar != null) {
            awiVar.f.setAdapter(null);
        }
        this.G = null;
        this.B = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        awi awiVar = this.B;
        if (awiVar != null) {
            NextButtonLayout nextButtonLayout = awiVar.c;
            msr msrVar = awiVar.w;
            awiVar.i.setVisibility(8);
            msrVar.w.setVisibility(8);
            awiVar.b.setVisibility(8);
            awiVar.z.setVisibility(8);
            ProgressBar progressBar = awiVar.y;
            progressBar.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
            if (layoutParams == null) {
                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(bqe.a(16.0f), 0, bqe.a(16.0f), 0);
            progressBar.setLayoutParams(marginLayoutParams);
            ConstraintLayout constraintLayout = msrVar.d;
            constraintLayout.setBackground(null);
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 == null) {
                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMargins(bqe.a(16.0f), 0, bqe.a(16.0f), 0);
            constraintLayout.setLayoutParams(marginLayoutParams2);
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            if (layoutParams3 == null) {
                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams3.height = bqe.a(136.0f);
            constraintLayout.setLayoutParams(layoutParams3);
            msrVar.i.setBackgroundResource(R.drawable.bg_bng_gif_image);
            RecyclerView recyclerView = awiVar.f;
            recyclerView.setBackgroundColor(requireContext().getColor(R.color.transparent));
            recyclerView.setAdapter(this.E);
            nextButtonLayout.c.setBackgroundColor(nextButtonLayout.getResources().getColor(R.color.virtual_build_and_go));
            nextButtonLayout.setData(sn5.d(this, R.string.page_instant_virtual__skip_to_result, new Object[0]), "", new NextButtonLayout.a() { // from class: of5
                @Override // com.sportybet.android.instantwin.presentation.widget.NextButtonLayout.a
                public final void a() {
                    rf5 rf5Var = this.a;
                    rf5Var.p0();
                    long jCurrentTimeMillis = System.currentTimeMillis() - rf5Var.K;
                    rdd0 rdd0Var = rf5Var.R;
                    if (rdd0Var == null) {
                        Intrinsics.n("sportyTrackingUseCase");
                        throw null;
                    }
                    f5o f5oVar = new f5o(0);
                    k00 k00Var = k00.d;
                    rdd0Var.a(f5oVar, k00Var);
                    rdd0 rdd0Var2 = rf5Var.R;
                    if (rdd0Var2 != null) {
                        rdd0Var2.a(new b5o(String.valueOf(jCurrentTimeMillis)), k00Var);
                    } else {
                        Intrinsics.n("sportyTrackingUseCase");
                        throw null;
                    }
                }
            });
            this.G = new BetResultAdapter(Boolean.TRUE);
        }
        ((dz50) this.L.getValue()).f.f(getViewLifecycleOwner(), new a(new sf5(1, this, rf5.class, "handleRoundState", "handleRoundState(Lcom/sportybet/android/common/DataState;)V", 0)));
    }

    public final void p0() {
        q0();
        psm psmVar = this.Q;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        String strB = psmVar.b();
        BigDecimal bigDecimal = this.H;
        Locale locale = Locale.US;
        String strD = sn5.d(this, R.string.page_instant_virtual__total_win_with_stake, yk10.a(strB, bjb0.L(bigDecimal, locale)));
        if (this.H.compareTo(BigDecimal.ZERO) > 0) {
            awi awiVar = this.B;
            if (awiVar != null) {
                awiVar.w.d.setVisibility(8);
            }
            awi awiVar2 = this.B;
            if (awiVar2 != null) {
                awiVar2.y.setVisibility(8);
            }
            awi awiVar3 = this.B;
            if (awiVar3 != null) {
                awiVar3.e.setVisibility(0);
            }
            gbn gbnVar = this.P;
            if (gbnVar == null) {
                Intrinsics.n("imageService");
                throw null;
            }
            awi awiVar4 = this.B;
            gbnVar.a("https://s.sporty.net/ke/main/res/bc6f624bd2732642a0620f20c85d78a4.png", awiVar4 != null ? awiVar4.v : null);
            awi awiVar5 = this.B;
            if (awiVar5 != null) {
                TextView textView = awiVar5.A;
                psm psmVar2 = this.Q;
                if (psmVar2 == null) {
                    Intrinsics.n("countryManager");
                    throw null;
                }
                textView.setText(psmVar2.b() + bjb0.L(this.H, locale));
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if (r0b.d(contextRequireContext)) {
                    textView.setShadowLayer(30.0f, 0.0f, 0.0f, -16777216);
                }
            }
            enj enjVar = this.I;
            if (enjVar != null) {
                enjVar.D();
            }
        } else {
            enj enjVar2 = this.I;
            if (enjVar2 != null) {
                enjVar2.c0();
            }
        }
        awi awiVar6 = this.B;
        if (awiVar6 != null) {
            awiVar6.c.setData(sn5.d(this, R.string.page_instant_virtual__next_round, new Object[0]), strD, new NextButtonLayout.a() { // from class: pf5
                @Override // com.sportybet.android.instantwin.presentation.widget.NextButtonLayout.a
                public final void a() {
                    rf5 rf5Var = this.a;
                    enj enjVar3 = rf5Var.I;
                    if (enjVar3 != null) {
                        enjVar3.P();
                    }
                    c5o c5oVar = new c5o(0);
                    rdd0 rdd0Var = rf5Var.R;
                    if (rdd0Var == null) {
                        Intrinsics.n("sportyTrackingUseCase");
                        throw null;
                    }
                    rdd0Var.a(c5oVar, k00.d);
                    y8j y8jVar = rf5Var.S;
                    if (y8jVar != null) {
                        y8j.a(y8jVar, "bng__next_round__click");
                    } else {
                        Intrinsics.n("fullStoryCommonManager");
                        throw null;
                    }
                }
            });
        }
        awi awiVar7 = this.B;
        if (awiVar7 != null) {
            awiVar7.f.setAdapter(this.G);
        }
        awi awiVar8 = this.B;
        if (awiVar8 != null) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            awiVar8.y.setProgress(100);
            msr msrVar = awiVar8.w;
            ImageView imageView = msrVar.i;
            Drawable drawable = imageView.getDrawable();
            thk thkVar = drawable instanceof thk ? (thk) drawable : null;
            if (thkVar != null && thkVar.b) {
                thkVar.stop();
                thkVar.setVisible(false, false);
            }
            imageView.setImageDrawable(requireContext().getDrawable(R.drawable.img__bng_game_end));
            msrVar.I.setText(sn5.d(this, R.string.page_instant_virtual__game_end, new Object[0]));
            msrVar.e.setVisibility(8);
            msrVar.c.setVisibility(8);
            msrVar.b.setVisibility(8);
            msrVar.w.setVisibility(8);
            msrVar.C.setVisibility(0);
        }
    }

    public final void q0() {
        rss rssVar = this.C;
        jvd0 jvd0Var = rssVar.a;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        rssVar.a = null;
        rssVar.b.clear();
        rssVar.c = 0;
        rssVar.d = 0;
        Iterator<Map.Entry<Integer, ? extends List<? extends ess>>> it = this.D.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((ess) it2.next()).release();
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.D = o2gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (obj2 instanceof nss.c) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        do {
            if (i2 >= size2) {
                obj = null;
                break;
            } else {
                obj = arrayList2.get(i2);
                i2++;
            }
        } while (!((nss.c) obj).k);
        nss.c cVar = (nss.c) obj;
        if (cVar == null) {
            p0();
            return;
        }
        String str = cVar.b;
        String str2 = cVar.c;
        String str3 = cVar.d;
        String str4 = cVar.e;
        awi awiVar = this.B;
        if (awiVar != null) {
            msr msrVar = awiVar.w;
            Drawable drawableA = gr0.a(requireContext(), R.drawable.ic_default_team_logo_home);
            u7n u7nVarB = drawableA != null ? zbn.b(drawableA) : null;
            Drawable drawableA2 = gr0.a(requireContext(), R.drawable.ic_default_team_logo_away);
            u7n u7nVarB2 = drawableA2 != null ? zbn.b(drawableA2) : null;
            msrVar.H.setText(str);
            ImageView imageView = msrVar.z;
            m9n m9nVarA = qw90.a(imageView.getContext());
            nan.a aVar = new nan.a(imageView.getContext());
            aVar.c = str2;
            abn.f(aVar, imageView);
            aVar.d(u7nVarB);
            aVar.b(u7nVarB);
            m9nVarA.a(aVar.a());
            msrVar.G.setText(str3);
            ImageView imageView2 = msrVar.y;
            m9n m9nVarA2 = qw90.a(imageView2.getContext());
            nan.a aVar2 = new nan.a(imageView2.getContext());
            aVar2.c = str4;
            abn.f(aVar2, imageView2);
            aVar2.d(u7nVarB2);
            aVar2.b(u7nVarB2);
            m9nVarA2.a(aVar2.a());
            msrVar.L.setText(str);
            ImageView imageView3 = msrVar.B;
            m9n m9nVarA3 = qw90.a(imageView3.getContext());
            nan.a aVar3 = new nan.a(imageView3.getContext());
            aVar3.c = str2;
            abn.f(aVar3, imageView3);
            aVar3.d(u7nVarB);
            aVar3.b(u7nVarB);
            m9nVarA3.a(aVar3.a());
            msrVar.J.setText(str3);
            ImageView imageView4 = msrVar.A;
            m9n m9nVarA4 = qw90.a(imageView4.getContext());
            nan.a aVar4 = new nan.a(imageView4.getContext());
            aVar4.c = str4;
            abn.f(aVar4, imageView4);
            aVar4.d(u7nVarB2);
            aVar4.b(u7nVarB2);
            m9nVarA4.a(aVar4.a());
            String str5 = cVar.f;
            uqm uqmVar = this.f;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            Pair pairA = o8i0.a(msrVar, str, str2, str3, str4, str5, uqmVar, tss.a);
            int iIntValue = ((Number) pairA.a).intValue();
            Map<Integer, ? extends List<? extends ess>> map = (Map) pairA.b;
            q0();
            this.D = map;
            tf5 tf5Var = new tf5(map, iIntValue, this);
            rss rssVar = this.C;
            rssVar.getClass();
            rssVar.b.add(tf5Var);
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            rssVar.a(iIntValue, ebs.a(viewLifecycleOwner.getLifecycle()));
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
            valueAnimatorOfInt.setDuration(((long) iIntValue) * 1000);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nf5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    valueAnimator2.getClass();
                    awi awiVar2 = this.a.B;
                    if (awiVar2 != null) {
                        ProgressBar progressBar = awiVar2.y;
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        animatedValue.getClass();
                        progressBar.setProgress(((Integer) animatedValue).intValue());
                    }
                }
            });
            valueAnimatorOfInt.addListener(new qf5(this));
            valueAnimatorOfInt.start();
            this.J = valueAnimatorOfInt;
        }
    }
}
