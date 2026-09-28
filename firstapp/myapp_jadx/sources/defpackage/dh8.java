package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldh8;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dh8 extends cpl {
    public final i6i0 f = new i6i0(new xg8());
    public final q8i0 i;
    public final mpe0 v;
    public final mpe0 w;
    public static final /* synthetic */ ohp<Object>[] z = {new d630(0, dh8.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentCommonPaybillBinding;")};
    public static final a y = new a();

    public static final class a {
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
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

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return dh8.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? dh8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public dh8() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.i = new q8i0(jq40.a(hh8.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.v = hwr.b(new yg8(this, 0));
        this.w = hwr.b(new zg8(this, 0));
    }

    public static void n0(PayHintData payHintData, ViewGroup viewGroup, int i, String str) {
        List<String> list = payHintData.descriptionLines;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                TextView textView = new TextView(viewGroup.getContext());
                textView.setText(str2);
                textView.setTextSize(1, i);
                textView.setLineSpacing(0.0f, 1.2f);
                textView.setPadding(0, 0, 0, zch0.a(textView.getContext(), 2));
                textView.setTextColor(Color.parseColor(str));
                viewGroup.addView(textView);
            }
        }
    }

    public final cvi m0() {
        g6i0 g6i0VarA = this.f.a(this, z[0]);
        g6i0VarA.getClass();
        return (cvi) g6i0VarA;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        hh8 hh8Var = (hh8) this.i.getValue();
        PaymentChannel paymentChannel = (PaymentChannel) this.w.getValue();
        paymentChannel.getClass();
        ej5.c(o8i0.d(hh8Var), null, null, new gh8(hh8Var, paymentChannel, null), 3);
        hh8Var.i.f(getViewLifecycleOwner(), new b(new ah8(this, 0)));
        hh8Var.e.f(getViewLifecycleOwner(), new b(new bh8(this, hh8Var)));
        PayHintData payHintData = (PayHintData) this.v.getValue();
        if (payHintData != null) {
            if (TextUtils.isEmpty(payHintData.alert)) {
                m0().w.setVisibility(8);
            } else {
                m0().w.setVisibility(0);
                m0().y.setText(payHintData.alert);
            }
            n0(payHintData, m0().f, 12, "#9ca0ab");
        }
    }
}
