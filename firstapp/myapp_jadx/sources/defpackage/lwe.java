package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llwe;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lwe extends fql {
    public final q8i0 f;
    public azm i;

    public static final /* synthetic */ class a extends saj implements Function1<iwe, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(iwe iweVar) {
            iwe iweVar2 = iweVar;
            iweVar2.getClass();
            ku90<jwe> ku90Var = ((uwe) this.receiver).a;
            if (iweVar2.equals(iwe.a.a)) {
                ku90Var.a(jwe.a.a);
            } else if (iweVar2.equals(iwe.b.a)) {
                ku90Var.a(jwe.c.a);
            } else {
                if (!iweVar2.equals(iwe.c.a)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(jwe.b.a);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.success.DobSuccessFragment$onViewCreated$$inlined$collectWithLifecycle$default$1", f = "DobSuccessFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ lwe d;

        @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.success.DobSuccessFragment$onViewCreated$$inlined$collectWithLifecycle$default$1$1", f = "DobSuccessFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ lwe d;

            /* JADX INFO: renamed from: lwe$b$a$a, reason: collision with other inner class name */
            public static final class C0842a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ lwe b;

                public C0842a(v5b v5bVar, lwe lweVar) {
                    this.b = lweVar;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    jwe jweVar = (jwe) t;
                    boolean zG = Intrinsics.g(jweVar, jwe.a.a);
                    yfx yfxVarA = null;
                    lwe lweVar = this.b;
                    if (zG) {
                        try {
                            if (lweVar.isAdded()) {
                                yfxVarA = NavHostFragment.a.a(lweVar);
                            }
                        } catch (IllegalStateException e) {
                            itf0.a.f(e, "Failed to find NavController", new Object[0]);
                        }
                        if (yfxVarA != null) {
                            yfxVarA.k();
                        }
                    } else if (Intrinsics.g(jweVar, jwe.b.a)) {
                        azm azmVar = lweVar.i;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.ME_GIFTS);
                        lweVar.requireActivity().finish();
                    } else {
                        if (!Intrinsics.g(jweVar, jwe.c.a)) {
                            uhc.a();
                            return null;
                        }
                        azm azmVar2 = lweVar.i;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar2.d(wae.HOME);
                        lweVar.requireActivity().finish();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, lwe lweVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = lweVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0842a c0842a = new C0842a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0842a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ibs ibsVar, lyh lyhVar, v1b v1bVar, lwe lweVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = lweVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return lwe.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? lwe.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public lwe() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(uwe.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final hwe hweVar = (hwe) mfx.a(NavHostFragment.a.a(this).b(jq40.a(hwe.class)), jq40.a(hwe.class));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-1577630290, new Function2() { // from class: kwe
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwe uweVar = (uwe) this.f.getValue();
                    boolean zA = aVar.A(uweVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        lwe.a aVar2 = new lwe.a(1, uweVar, uwe.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/dateofbirth/ui/screens/success/DobSuccessAction;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    hwe.b bVar = hwe.Companion;
                    twe.a(hweVar, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t340 t340Var = ((uwe) this.f.getValue()).b;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b(viewLifecycleOwner, t340Var, null, this), 3);
    }
}
