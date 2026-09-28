package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lt64;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t64 extends anl implements k9j {
    public azm f;
    public final q8i0 i = new q8i0(jq40.a(au7.class), new a(), new c(), new b());

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return t64.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return t64.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return t64.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final yfx yfxVarA = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(1980732816, new Function2() { // from class: o64
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final t64 t64Var = this.a;
                    au7 au7Var = (au7) t64Var.i.getValue();
                    boolean zA = aVar.A(t64Var);
                    final yfx yfxVar = yfxVarA;
                    boolean zA2 = zA | aVar.A(yfxVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA2 || objY == c0042a) {
                        objY = new Function0() { // from class: p64
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (t64Var.isAdded()) {
                                    yfxVar.k();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA3 = aVar.A(t64Var) | aVar.A(yfxVar);
                    Object objY2 = aVar.y();
                    if (zA3 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: q64
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (t64Var.isAdded()) {
                                    yfxVar.k();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA4 = aVar.A(t64Var);
                    Object objY3 = aVar.y();
                    if (zA4 || objY3 == c0042a) {
                        objY3 = new r64(t64Var, i);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA5 = aVar.A(t64Var) | aVar.A(yfxVar);
                    Object objY4 = aVar.y();
                    if (zA5 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: s64
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (t64Var.isAdded()) {
                                    nb4.a(yfxVar, gc4.BioTokenEnrollment, bjx.a(new r8a(1, new kkx())));
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    d74.a(function0, function1, function2, (Function0) objY4, null, au7Var, aVar, 262144);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
