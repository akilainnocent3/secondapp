package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lywf;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "Llxf;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ywf extends pql implements k9j {
    public final q8i0 f;
    public azm i;

    public static final /* synthetic */ class a extends saj implements Function1<wwf, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(wwf wwfVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            Object value8;
            Object value9;
            Object value10;
            wwf wwfVar2 = wwfVar;
            wwfVar2.getClass();
            mxf mxfVar = (mxf) this.receiver;
            rdd0 rdd0Var = mxfVar.b;
            wwd0 wwd0Var = mxfVar.d;
            if (wwfVar2.equals(wwf.a.a)) {
                if (((lxf) wwd0Var.getValue()).g) {
                    do {
                        value10 = wwd0Var.getValue();
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var.g(value10, lxf.a((lxf) value10, null, null, null, new ResourceUiText(R.string.email_change__this_entered_email_unmatched_please_try_again), uxs.DISABLE, null, 39)));
                } else {
                    do {
                        value9 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value9, lxf.a((lxf) value9, null, null, null, vch0.a, null, null, 55)));
                    ej5.c(o8i0.d(mxfVar), null, null, new nxf(mxfVar, null), 3);
                }
                rdd0Var.a(gzf.a, k00.c);
            } else if (wwfVar2 instanceof wwf.c) {
                ijf0 ijf0Var = ((wwf.c) wwfVar2).a;
                if (qag.b(ijf0Var) || qag.b(((lxf) wwd0Var.getValue()).b)) {
                    do {
                        value6 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value6, lxf.a((lxf) value6, null, null, null, null, uxs.DISABLE, null, 47)));
                } else {
                    do {
                        value8 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value8, lxf.a((lxf) value8, null, null, null, null, uxs.ENABLE, null, 47)));
                }
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, lxf.a((lxf) value7, null, null, ijf0Var, null, null, null, 59)));
            } else if (wwfVar2 instanceof wwf.e) {
                ijf0 ijf0Var2 = ((wwf.e) wwfVar2).a;
                if (qag.b(ijf0Var2) || qag.b(((lxf) wwd0Var.getValue()).c)) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, lxf.a((lxf) value3, null, null, null, null, uxs.DISABLE, null, 47)));
                } else {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, lxf.a((lxf) value5, null, null, null, null, uxs.ENABLE, null, 47)));
                }
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, lxf.a((lxf) value4, null, ijf0Var2, null, null, null, null, 61)));
            } else if (wwfVar2.equals(wwf.b.a)) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, lxf.a((lxf) value2, null, null, null, null, null, null, 31)));
                mxfVar.f.a(axf.a.a);
                rdd0Var.a(fzf.a, k00.c);
            } else {
                if (!wwfVar2.equals(wwf.d.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lxf.a((lxf) value, null, null, null, null, null, null, 31)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.newemail.EmailChangeNewEmailFragment$onViewCreated$$inlined$collectWithLifecycle$default$1", f = "EmailChangeNewEmailFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ywf d;

        @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.newemail.EmailChangeNewEmailFragment$onViewCreated$$inlined$collectWithLifecycle$default$1$1", f = "EmailChangeNewEmailFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ywf d;

            /* JADX INFO: renamed from: ywf$b$a$a, reason: collision with other inner class name */
            public static final class C1369a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ywf b;

                public C1369a(v5b v5bVar, ywf ywfVar) {
                    this.b = ywfVar;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    if (((axf) t) instanceof axf.a) {
                        ywf ywfVar = this.b;
                        yfx yfxVarA = null;
                        try {
                            if (ywfVar.isAdded()) {
                                yfxVarA = NavHostFragment.a.a(ywfVar);
                            }
                        } catch (IllegalStateException e) {
                            itf0.a.f(e, "Failed to find NavController", new Object[0]);
                        }
                        if (yfxVarA != null) {
                            yfxVarA.k();
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, ywf ywfVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = ywfVar;
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
                    C1369a c1369a = new C1369a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1369a, this) == y5bVar) {
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
        public b(ibs ibsVar, lyh lyhVar, v1b v1bVar, ywf ywfVar) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = ibsVar;
            this.c = lyhVar;
            this.d = ywfVar;
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
            return ywf.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ywf.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ywf() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(mxf.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(649913513, new xwf(this, 0), true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t340 t340Var = ((mxf) this.f.getValue()).i;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b(viewLifecycleOwner, t340Var, null, this), 3);
    }
}
