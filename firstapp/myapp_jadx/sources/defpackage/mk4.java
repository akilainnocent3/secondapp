package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmk4;", "Landroidx/fragment/app/Fragment;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mk4 extends Fragment implements xjj {
    public final ttr a;
    public final ttr b;
    public final ttr c;
    public String d;

    public static final class a implements Function0<f3> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [f3, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final f3 invoke() {
            qn70 qn70VarA = e80.a(mk4.this);
            dq7 dq7VarA = jq40.a(f3.class);
            qn70VarA.getClass();
            return qn70VarA.a(dq7VarA, null, null);
        }
    }

    public static final class b implements Function0<b5> {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [b5, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final b5 invoke() {
            qn70 qn70VarA = e80.a(mk4.this);
            dq7 dq7VarA = jq40.a(b5.class);
            qn70VarA.getClass();
            return qn70VarA.a(dq7VarA, null, null);
        }
    }

    public static final class c implements Function0<Fragment> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return mk4.this;
        }
    }

    public static final class d implements Function0<qq4> {
        public final /* synthetic */ c b;

        public d(c cVar) {
            this.b = cVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, qq4] */
        @Override // kotlin.jvm.functions.Function0
        public final qq4 invoke() {
            v8i0 viewModelStore = mk4.this.getViewModelStore();
            mk4 mk4Var = mk4.this;
            cyb defaultViewModelCreationExtras = mk4Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(qq4.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(mk4Var), null);
        }
    }

    public mk4() {
        a1s a1sVar = a1s.a;
        this.a = hwr.a(a1sVar, new a());
        this.b = hwr.a(a1sVar, new b());
        this.c = hwr.a(a1s.c, new d(new c()));
        this.d = "";
    }

    public final qq4 j0() {
        return (qq4) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Type inference failed for: r2v1, types: [fk4] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final CommonGameDetails commonGameDetails;
        String name;
        layoutInflater.getClass();
        e activity = getActivity();
        if (activity != null) {
            zpe0 zpe0Var = zpe0.a;
            elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        }
        e activity2 = getActivity();
        if (activity2 != null) {
            Window window = activity2.getWindow();
            window.getClass();
            qlf.c(window, Color.parseColor("#032420"));
        }
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments != null ? arguments.getBundle("bonus_cup_bundle_key") : null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle2 != null) {
                commonGameDetails = (CommonGameDetails) bundle2.getParcelable("campaign_game_details_key", CommonGameDetails.class);
            } else {
                commonGameDetails = null;
            }
        } else if (bundle2 != null) {
            commonGameDetails = (CommonGameDetails) bundle2.getParcelable("campaign_game_details_key");
        } else {
            commonGameDetails = null;
        }
        if (commonGameDetails == null || (name = commonGameDetails.getName()) == null) {
            name = "";
        }
        this.d = name;
        final boolean z = name.length() == 0;
        final ?? r2 = new Function0() { // from class: fk4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                iny onBackPressedDispatcher;
                boolean z2 = z;
                mk4 mk4Var = this;
                if (z2) {
                    e activity3 = mk4Var.getActivity();
                    if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.d();
                    }
                } else {
                    CommonGameDetails commonGameDetails2 = commonGameDetails;
                    if (commonGameDetails2 != null) {
                        f3 f3Var = (f3) mk4Var.a.getValue();
                        Context contextRequireContext = mk4Var.requireContext();
                        contextRequireContext.getClass();
                        f3Var.a(commonGameDetails2, contextRequireContext, null);
                        e activity4 = mk4Var.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                            Unit unit = Unit.a;
                        }
                    }
                }
                return Unit.a;
            }
        };
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1611486488, new Function2() { // from class: gk4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final mk4 mk4Var = this.a;
                    b bVar = (b) wyh.c(mk4Var.j0().F, aVar, 0, 7).getValue();
                    final fk4 fk4Var = r2;
                    c.a(bVar, pp8.b(-1730760879, new Function2() { // from class: hk4
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                d dVarE = j.e(d.a.b, 1.0f);
                                aiv aivVarC = g75.c(ht.a.e, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = androidx.compose.ui.c.c(aVar2, dVarE);
                                yka.k.getClass();
                                tsr.a aVar3 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar3);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                hlh0.a(aVar2, dVarC, yka.a.d);
                                final mk4 mk4Var2 = mk4Var;
                                vo4.a(mk4Var2.j0(), aVar2, 8);
                                uj4 uj4Var = (uj4) wyh.c(mk4Var2.j0().H, aVar2, 0, 7).getValue();
                                boolean zA = aVar2.A(mk4Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new ik4(mk4Var2, i);
                                    aVar2.r(objY);
                                }
                                Function1 function1 = (Function1) objY;
                                boolean zA2 = aVar2.A(mk4Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function1() { // from class: jk4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                            qq4 qq4VarJ0 = mk4Var2.j0();
                                            qq4VarJ0.getClass();
                                            ej5.c(o8i0.d(qq4VarJ0), null, null, new kq4(qq4VarJ0, null, zBooleanValue), 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                Function1 function2 = (Function1) objY2;
                                boolean zA3 = aVar2.A(mk4Var2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: kk4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            qq4 qq4VarJ0 = mk4Var2.j0();
                                            qq4VarJ0.getClass();
                                            ej5.c(o8i0.d(qq4VarJ0), null, null, new gq4(qq4VarJ0, null), 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                Function0 function0 = (Function0) objY3;
                                boolean zA4 = aVar2.A(mk4Var2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new Function0() { // from class: lk4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            qq4 qq4VarJ0 = mk4Var2.j0();
                                            qq4VarJ0.getClass();
                                            ej5.c(o8i0.d(qq4VarJ0), null, null, new jq4(qq4VarJ0, null, true), 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                rj4.b(0, uj4Var, fk4Var, aVar2, function0, (Function0) objY4, function1, function2);
                                aVar2.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 48);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ttr ttrVar = this.b;
        if (((b5) ttrVar.getValue()).getAccessToken() == null) {
            ((b5) ttrVar.getValue()).gotoSportyBet(xae.a, null);
            return;
        }
        qq4 qq4VarJ0 = j0();
        String str = this.d;
        qq4VarJ0.getClass();
        str.getClass();
        ej5.c(o8i0.d(qq4VarJ0), null, null, new yp4(qq4VarJ0, str, null), 3);
    }
}
