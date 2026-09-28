package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr3y;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lfe00;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r3y extends dyl implements k9j, fe00 {
    public azm f;
    public com.sporty.android.common.uievent.e i;
    public final q8i0 v;
    public ComposeView w;
    public final ee<String> y;
    public ge00 z;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            r3y r3yVar = (r3y) this.receiver;
            r3yVar.getClass();
            if (!NavHostFragment.a.a(r3yVar).k()) {
                r3yVar.requireActivity().finish();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsFragment$onViewCreated$1", f = "NotificationSettingsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<com.sporty.android.common.uievent.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = r3y.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sporty.android.common.uievent.a aVar, v1b<? super Unit> v1bVar) {
            return ((b) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            r3y r3yVar = r3y.this;
            com.sporty.android.common.uievent.e eVar = r3yVar.i;
            if (eVar == null) {
                Intrinsics.n("commonUiEventProcessor");
                throw null;
            }
            ComposeView composeView = r3yVar.w;
            if (composeView != null) {
                eVar.d(aVar, r3yVar, composeView, r3yVar);
                return Unit.a;
            }
            Intrinsics.n("rootView");
            throw null;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.settings.notification.NotificationSettingsFragment$onViewCreated$2", f = "NotificationSettingsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<k4y, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = r3y.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(k4y k4yVar, v1b<? super Unit> v1bVar) {
            return ((c) create(k4yVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            k4y k4yVar = (k4y) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(k4yVar, k4y.a.a);
            r3y r3yVar = r3y.this;
            if (zG) {
                z2f.c(NavHostFragment.a.a(r3yVar));
            } else {
                if (!Intrinsics.g(k4yVar, k4y.b.a)) {
                    uhc.a();
                    return null;
                }
                if (!NavHostFragment.a.a(r3yVar).k()) {
                    r3yVar.requireActivity().finish();
                }
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return r3y.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? r3y.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public r3y() {
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.v = new q8i0(jq40.a(r4y.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        ee<String> eeVarRegisterForActivityResult = registerForActivityResult(new be(), new ud() { // from class: o3y
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
        mla.i(composeView, new op8(405672260, new Function2() { // from class: p3y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final r3y r3yVar = this.a;
                    boolean zA = aVar.A(r3yVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        r3y.a aVar2 = new r3y.a(0, r3yVar, r3y.class, "leaveNotificationSettings", "leaveNotificationSettings()V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function0 function0 = (Function0) ((chp) objY);
                    boolean zA2 = aVar.A(r3yVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: q3y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                azm azmVar = r3yVar.f;
                                if (azmVar != null) {
                                    azmVar.d(wae.HOME);
                                    return Unit.a;
                                }
                                Intrinsics.n("router");
                                throw null;
                            }
                        };
                        aVar.r(objY2);
                    }
                    i4y.b(function0, (Function0) objY2, null, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
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
        r4y r4yVar = (r4y) this.v.getValue();
        ej5.c(o8i0.d(r4yVar), null, null, new l4y(r4yVar, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        q8i0 q8i0Var = this.v;
        g1i g1iVar = new g1i(((r4y) q8i0Var.getValue()).c, new b(null));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(((r4y) q8i0Var.getValue()).e, new c(null));
        s9s lifecycle2 = getViewLifecycleOwner().getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
    }
}
