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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lkxe;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ldye;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kxe extends gql {
    public final q8i0 f;
    public azm i;

    public static final /* synthetic */ class a extends saj implements Function1<ywe, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ywe yweVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            Object value8;
            Object value9;
            ywe yweVar2 = yweVar;
            yweVar2.getClass();
            fye fyeVar = (fye) this.receiver;
            ku90<ixe> ku90Var = fyeVar.e;
            wwd0 wwd0Var = fyeVar.c;
            if (yweVar2.equals(ywe.b.a)) {
                ku90Var.a(ixe.a.a);
            } else if (yweVar2.equals(ywe.c.a)) {
                do {
                    value9 = wwd0Var.getValue();
                } while (!wwd0Var.g(value9, dye.a((dye) value9, null, null, null, false, false, null, false, null, 447)));
                ku90Var.a(ixe.b.a);
            } else if (yweVar2 instanceof ywe.h) {
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, dye.a((dye) value8, null, null, null, false, false, null, false, null, 447)));
            } else if (yweVar2.equals(ywe.i.a)) {
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, dye.a((dye) value7, null, null, uxs.ENABLE, true, true, null, false, null, 391)));
                ku90Var.a(ixe.a.a);
            } else if (yweVar2.equals(ywe.j.a)) {
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, dye.a((dye) value6, null, null, uxs.DISABLE, false, false, null, false, null, 391)));
            } else if (yweVar2.equals(ywe.e.a)) {
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, dye.a((dye) value5, null, new ijf0((String) null, 0L, 7), uxs.DISABLE, true, true, null, false, null, 386)));
            } else if (yweVar2.equals(ywe.f.a)) {
                ej5.c(o8i0.d(fyeVar), null, null, new gye(fyeVar, null), 3);
            } else if (yweVar2.equals(ywe.d.a)) {
                if (((dye) wwd0Var.getValue()).f) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, dye.a((dye) value4, null, null, null, false, false, null, true, null, 383)));
                }
            } else if (yweVar2 instanceof ywe.a) {
                ijf0 ijf0Var = ((ywe.a) yweVar2).a;
                if (ijf0Var.a.b.length() <= 11) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, dye.a((dye) value3, null, ijf0Var, null, false, false, null, false, null, 507)));
                    fyeVar.x1();
                }
            } else if (yweVar2.equals(ywe.g.a)) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, dye.a((dye) value2, null, null, null, false, false, null, false, null, 383)));
            } else {
                if (!(yweVar2 instanceof ywe.k)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, dye.a((dye) value, ((ywe.k) yweVar2).a, null, null, false, false, null, false, null, 382)));
                fyeVar.x1();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.verification.DobVerificationFragment$onViewCreated$$inlined$collectWithLifecycle$default$1", f = "DobVerificationFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ kxe d;

        @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.verification.DobVerificationFragment$onViewCreated$$inlined$collectWithLifecycle$default$1$1", f = "DobVerificationFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ kxe d;

            /* JADX INFO: renamed from: kxe$b$a$a, reason: collision with other inner class name */
            public static final class C0797a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ kxe b;

                public C0797a(v5b v5bVar, kxe kxeVar) {
                    this.b = kxeVar;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    ixe ixeVar = (ixe) t;
                    boolean zG = Intrinsics.g(ixeVar, ixe.a.a);
                    yfx yfxVarA = null;
                    kxe kxeVar = this.b;
                    if (zG) {
                        try {
                            if (kxeVar.isAdded()) {
                                yfxVarA = NavHostFragment.a.a(kxeVar);
                            }
                        } catch (IllegalStateException e) {
                            itf0.a.f(e, "Failed to find NavController", new Object[0]);
                        }
                        if (yfxVarA == null || !yfxVarA.k()) {
                            kxeVar.requireActivity().finish();
                        }
                    } else if (Intrinsics.g(ixeVar, ixe.b.a)) {
                        azm azmVar = kxeVar.i;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.CONTACT_US);
                        try {
                            if (kxeVar.isAdded()) {
                                yfxVarA = NavHostFragment.a.a(kxeVar);
                            }
                        } catch (IllegalStateException e2) {
                            itf0.a.f(e2, "Failed to find NavController", new Object[0]);
                        }
                        if (yfxVarA == null || !yfxVarA.k()) {
                            kxeVar.requireActivity().finish();
                        }
                    } else {
                        if (!(ixeVar instanceof ixe.c)) {
                            uhc.a();
                            return null;
                        }
                        try {
                            if (kxeVar.isAdded()) {
                                yfxVarA = NavHostFragment.a.a(kxeVar);
                            }
                        } catch (IllegalStateException e3) {
                            itf0.a.f(e3, "Failed to find NavController", new Object[0]);
                        }
                        if (yfxVarA != null) {
                            ixe.c cVar = (ixe.c) ixeVar;
                            boolean z = cVar.a;
                            String str = cVar.b;
                            str.getClass();
                            yfx.h(yfxVarA, new hwe(z, str), bjx.a(new r8a(1, new rve())), 4);
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, kxe kxeVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = kxeVar;
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
                    C0797a c0797a = new C0797a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0797a, this) == y5bVar) {
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
        public b(ibs ibsVar, lyh lyhVar, v1b v1bVar, kxe kxeVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = kxeVar;
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
            return kxe.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? kxe.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public kxe() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(fye.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-1297093612, new Function2() { // from class: jxe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                q8i0 q8i0Var = this.a.f;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dye dyeVar = (dye) wyh.c(((fye) q8i0Var.getValue()).d, aVar, 0, 7).getValue();
                    fye fyeVar = (fye) q8i0Var.getValue();
                    boolean zA = aVar.A(fyeVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new kxe.a(1, fyeVar, fye.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/dateofbirth/ui/screens/verification/DobVerificationAction;)V", 0);
                        aVar.r(objY);
                    }
                    cye.a(dyeVar, (Function1) ((chp) objY), aVar, 8);
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
        t340 t340Var = ((fye) this.f.getValue()).f;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b(viewLifecycleOwner, t340Var, null, this), 3);
    }
}
