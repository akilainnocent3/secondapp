package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqkg0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qkg0 extends g5m {
    public cle f;
    public final q8i0 i;

    public static final class a {
        public static final void a(b72 b72Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            TradeAdditionalResult tradeAdditionalResult = Build.VERSION.SDK_INT >= 33 ? (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT", TradeAdditionalResult.class) : (TradeAdditionalResult) bundle.getParcelable("RESULT_KEY_TRADE_ADDITIONAL_RESULT");
            if (tradeAdditionalResult == null) {
                tradeAdditionalResult = new TradeAdditionalResult(null, 16383);
            }
            b72Var.invoke(tradeAdditionalResult);
            fragmentManager.g("REQUEST_KEY_TRADE_ADDITIONAL_CHECK_HOLDING");
            fragmentManager.f("REQUEST_KEY_TRADE_ADDITIONAL_CHECK_HOLDING");
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return qkg0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? qkg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public qkg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.i = new q8i0(jq40.a(wkg0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_holding_load, (ViewGroup) null, false);
        int i = R.id.cancel;
        TextView textView = (TextView) h5e.a(R.id.cancel, viewInflate);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            int i2 = R.id.progress_bar;
            if (((ProgressBar) h5e.a(R.id.progress_bar, viewInflate)) != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) h5e.a(R.id.title, viewInflate);
                if (textView2 != null) {
                    this.f = new cle(relativeLayout, textView, relativeLayout, textView2);
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    bo8 bo8Var = new bo8(contextRequireContext, 0);
                    int i3 = 1;
                    bo8Var.requestWindowFeature(1);
                    cle cleVar = this.f;
                    if (cleVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    RelativeLayout relativeLayout2 = cleVar.a;
                    relativeLayout2.getClass();
                    bo8Var.setContentView(relativeLayout2);
                    Window window = bo8Var.getWindow();
                    if (window != null) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.width = -1;
                        attributes.height = -2;
                        window.setAttributes(attributes);
                    }
                    bo8Var.setCanceledOnTouchOutside(false);
                    bo8Var.setCancelable(false);
                    as1.a(bo8Var);
                    cle cleVar2 = this.f;
                    if (cleVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    cleVar2.b.setOnClickListener(new yr80(this, i3));
                    cleVar2.c.setOnClickListener(new e440());
                    wkg0 wkg0Var = (wkg0) this.i.getValue();
                    g1i g1iVar = new g1i(wkg0Var.d, new rkg0(this, null));
                    s9s lifecycle = getLifecycle();
                    lifecycle.getClass();
                    s9s.b bVar = s9s.b.d;
                    arr.a(g1iVar, lifecycle, bVar);
                    g1i g1iVar2 = new g1i(wkg0Var.f, new skg0(this, null));
                    s9s lifecycle2 = getLifecycle();
                    lifecycle2.getClass();
                    arr.a(g1iVar2, lifecycle2, bVar);
                    Bundle arguments = getArguments();
                    wkg0Var.b = arguments != null ? arguments.getString("ARG_TRADE_ID") : null;
                    ej5.c(o8i0.d(wkg0Var), null, null, new vkg0(wkg0Var, null), 3);
                    ej5.c(o8i0.d(wkg0Var), null, null, new ukg0(wkg0Var, null), 3);
                    return bo8Var;
                }
            }
            i = i2;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
