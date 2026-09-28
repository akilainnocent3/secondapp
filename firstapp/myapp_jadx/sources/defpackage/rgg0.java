package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportygames.commons.models.ComposeCashOutModel;
import com.sportygames.commons.models.ComposeCoeffModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrgg0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rgg0 extends Fragment {
    public String a;
    public String b;
    public kzb0 c;
    public lzb0 d;
    public qgg0 e;
    public long f;
    public final ytw<ComposeCoeffModel> i = m.b(new ComposeCoeffModel("0.00x", new j58(a6g0.g), null));
    public final ytw<ComposeCashOutModel> v = m.b(new ComposeCashOutModel(null, null, false, false, 15, null));

    public static final class a implements lfy, paj {
        public final /* synthetic */ c9c0 a;

        public a(c9c0 c9c0Var) {
            this.a = c9c0Var;
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
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new op8(-726976088, new Function2() { // from class: mgg0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 1;
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    isw iswVar = xag0.j;
                    ytw<Integer> ytwVar = xag0.k;
                    final rgg0 rgg0Var = this.a;
                    String str = rgg0Var.a;
                    if (str == null) {
                        str = "Tournament";
                    }
                    String strA = yk10.a(rgg0Var.b, "!");
                    ytw<ComposeCoeffModel> ytwVar2 = rgg0Var.i;
                    ytw<ComposeCashOutModel> ytwVar3 = rgg0Var.v;
                    float fFloatValue = iswVar.getValue().floatValue();
                    int iIntValue2 = ((Number) ((x5a0) ytwVar).getValue()).intValue();
                    boolean zA = aVar.A(rgg0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: ngg0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                rgg0 rgg0Var2 = rgg0Var;
                                if (!rgg0Var2.isRemoving()) {
                                    rgg0Var2.getParentFragmentManager().Y();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(rgg0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new zah(rgg0Var, i);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(rgg0Var);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: ogg0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                rgg0 rgg0Var2 = rgg0Var;
                                lzb0 lzb0Var = rgg0Var2.d;
                                if (lzb0Var != null) {
                                    lzb0Var.invoke(Long.valueOf(rgg0Var2.f));
                                }
                                if (!rgg0Var2.isRemoving()) {
                                    rgg0Var2.getParentFragmentManager().Y();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    final ComposeView composeView2 = composeView;
                    boolean zA4 = aVar.A(composeView2);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: pgg0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Intent intent = new Intent("cashoutCall");
                                intent.putExtra("betIndex", 1);
                                Context context2 = composeView2.getContext();
                                if (context2 != null) {
                                    fdt.a(context2).c(intent);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    Function0 function3 = (Function0) objY4;
                    boolean zA5 = aVar.A(composeView2);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new fem(composeView2, i2);
                        aVar.r(objY5);
                    }
                    lhg0.a(str, strA, function0, function1, function2, ytwVar2, ytwVar3, function3, (Function0) objY5, fFloatValue, iIntValue2, aVar, 0);
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
        qgg0 qgg0Var;
        super.onPause();
        Context context = getContext();
        if (context == null || (qgg0Var = this.e) == null) {
            return;
        }
        fdt.a(context).d(qgg0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        qgg0 qgg0Var;
        super.onResume();
        Context context = getContext();
        if (context == null || (qgg0Var = this.e) == null) {
            return;
        }
        fdt.a(context).b(qgg0Var, new IntentFilter("custom-event-name"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: lgg0
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager;
                rgg0 rgg0Var = this.a;
                try {
                    e activity = rgg0Var.getActivity();
                    if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                        return;
                    }
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.p(rgg0Var);
                    aVar.k(true, true);
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.e = new qgg0(this);
        mqw.a.f(getViewLifecycleOwner(), new a(new c9c0(this, 1)));
    }
}
