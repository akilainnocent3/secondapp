package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhuu;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lfe00;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class huu extends lwl implements k9j, fe00 {
    public azm f;
    public com.sporty.android.common.uievent.e i;
    public final q8i0 v;
    public ComposeView w;
    public final ee<String> y;
    public ge00 z;

    @c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertFragment$onViewCreated$1", f = "MatchAlertFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<com.sporty.android.common.uievent.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = huu.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sporty.android.common.uievent.a aVar, v1b<? super Unit> v1bVar) {
            return ((a) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            huu huuVar = huu.this;
            com.sporty.android.common.uievent.e eVar = huuVar.i;
            if (eVar == null) {
                Intrinsics.n("commonUiEventProcessor");
                throw null;
            }
            ComposeView composeView = huuVar.w;
            if (composeView != null) {
                eVar.d(aVar, huuVar, composeView, huuVar);
                return Unit.a;
            }
            Intrinsics.n("rootView");
            throw null;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return huu.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? huu.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public huu() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.v = new q8i0(jq40.a(rvu.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ee<String> eeVarRegisterForActivityResult = registerForActivityResult(new be(), new ud() { // from class: euu
            @Override // defpackage.ud
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ge00 ge00Var = this.a.z;
                if (ge00Var != null) {
                    ge00Var.a(bool.booleanValue());
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.y = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.y;
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.z = ge00Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-754460351, new p9l(this, 1), true));
        this.w = composeView;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.sporty.android.common.uievent.e eVar = this.i;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q8i0 q8i0Var = this.v;
        ((rvu) q8i0Var.getValue()).x1();
        rvu rvuVar = (rvu) q8i0Var.getValue();
        kzh.d(rvuVar.a.e(new pu0.a(0)), o8i0.d(rvuVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g1i g1iVar = new g1i(((rvu) this.v.getValue()).f, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }
}
