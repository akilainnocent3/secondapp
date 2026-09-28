package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lc57;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ltvz;", "state", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c57 extends col {
    public final q8i0 f;

    public static final /* synthetic */ class a extends pf implements Function2<xuz, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xuz xuzVar, v1b<? super Unit> v1bVar) {
            xuz xuzVar2 = xuzVar;
            c57 c57Var = (c57) this.a;
            if (xuzVar2 instanceof xuz.a) {
                c57Var.requireActivity().getOnBackPressedDispatcher().d();
            } else if (xuzVar2 instanceof xuz.b) {
                c57Var.requireActivity().finish();
            } else {
                c57Var.getClass();
                if (!(xuzVar2 instanceof xuz.d) && !(xuzVar2 instanceof xuz.c) && !(xuzVar2 instanceof xuz.e) && !(xuzVar2 instanceof xuz.f)) {
                    uhc.a();
                    return null;
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<vuz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(vuz vuzVar) {
            Object value;
            Object value2;
            tvz tvzVarA;
            Object value3;
            vuz vuzVar2 = vuzVar;
            vuzVar2.getClass();
            i57 i57Var = (i57) this.receiver;
            ku90<xuz> ku90Var = i57Var.f;
            wwd0 wwd0Var = i57Var.d;
            if (vuzVar2 instanceof vuz.g) {
                ijf0 ijf0Var = ((vuz.g) vuzVar2).a;
                nk0 nk0Var = ijf0Var.a;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, tvz.a((tvz) value3, ijf0Var, null, nk0Var.b.length() > 0 ? i57Var.c.a(nk0Var.b) : n1a0.c, false, xce0.b.a, "", null, false, 202)));
            } else if (vuzVar2 instanceof vuz.f) {
                ijf0 ijf0Var2 = ((vuz.f) vuzVar2).a;
                do {
                    value2 = wwd0Var.getValue();
                    tvzVarA = tvz.a((tvz) value2, null, ijf0Var2, null, false, null, "", null, false, 221);
                } while (!wwd0Var.g(value2, tvz.a(tvzVarA, null, null, null, ijf0Var2.a.b.length() > 0 && !tvzVarA.b(), null, null, null, false, 247)));
            } else if (vuzVar2 instanceof vuz.d) {
                tvz tvzVar = (tvz) wwd0Var.getValue();
                if (tvzVar.c()) {
                    if (StringsKt.U(i57Var.v)) {
                        itf0.a aVar = itf0.a;
                        aVar.q("ChangePasswordVM");
                        aVar.d("Aborting changePassword: token is blank", new Object[0]);
                    } else {
                        String strC = tvzVar.a.a.b;
                        if (!i57Var.b.W()) {
                            strC = uel.c(strC);
                        }
                        ej5.c(o8i0.d(i57Var), null, null, new h57(i57Var, strC, null), 3);
                    }
                }
            } else if (vuzVar2 instanceof vuz.a) {
                ku90Var.a(xuz.a.a);
            } else if (vuzVar2 instanceof vuz.b) {
                ku90Var.a(xuz.b.a);
            } else if (!(vuzVar2 instanceof vuz.c)) {
                if (!(vuzVar2 instanceof vuz.e)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, null, null, null, false, 127)));
                g57 g57Var = i57Var.w;
                i57Var.w = null;
                if (g57Var != null) {
                    g57Var.invoke();
                }
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
            return c57.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? c57.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public c57() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(i57.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((i57) this.f.getValue()).i, new a(2, this, c57.class, "consumeEffect", "consumeEffect(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryEffect;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(124064500, new Function2() { // from class: z47
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final c57 c57Var = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(-281414875, new Function2() { // from class: a57
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var = c57Var.f;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tvz tvzVar = (tvz) wyh.c(((i57) q8i0Var.getValue()).e, aVar2, 0, 7).getValue();
                                fvz fvzVar = new fvz(false, false, false);
                                i57 i57Var = (i57) q8i0Var.getValue();
                                boolean zA = aVar2.A(i57Var);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    c57.b bVar = new c57.b(1, i57Var, i57.class, "handleAction", "handleAction(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryAction;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                svz.c(tvzVar, fvzVar, (Function1) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        requireActivity().getWindow().setSoftInputMode(32);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setSoftInputMode(16);
    }
}
