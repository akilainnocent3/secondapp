package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v000 extends tql {
    public static final /* synthetic */ int J = 0;
    public View C;
    public LinearLayout D;
    public View E;
    public TextView F;
    public a100 G;
    public ComposeView H;
    public LoadingViewNew I;

    public v000() {
        super(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.C;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pay_bill, viewGroup, false);
        this.C = viewInflate;
        this.H = (ComposeView) viewInflate.findViewById(R.id.init_mask);
        this.I = (LoadingViewNew) this.C.findViewById(R.id.init_failed_mask);
        this.H.setOnClickListener(new q000());
        this.I.setOnClickListener(new View.OnClickListener() { // from class: r000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.G.F1();
            }
        });
        this.H.setViewCompositionStrategy(u6i0.a.a);
        ComposeView composeView = this.H;
        composeView.getClass();
        r910.b(composeView);
        this.E = this.C.findViewById(R.id.top_container);
        this.F = (TextView) this.C.findViewById(R.id.top_view);
        TextView textView = (TextView) this.C.findViewById(R.id.check_transaction);
        this.D = (LinearLayout) this.C.findViewById(R.id.description_container);
        textView.setOnClickListener(new s000());
        ((TextView) this.C.findViewById(R.id.paybill_step_guide)).setText(sn5.d(this, R.string.common_payment_providers__mpesa_desc__KE, sn5.d(this, R.string.main_footer__mpesa_value__KE, new Object[0])));
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(a100.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        a100 a100Var = (a100) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.G = a100Var;
        a100Var.D1();
        i2i.b(this.G.D).f(getViewLifecycleOwner(), new lfy() { // from class: t000
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                wgn wgnVar = (wgn) obj;
                boolean z = wgnVar instanceof wgn.c;
                v000 v000Var = this.a;
                if (z) {
                    ComposeView composeView2 = v000Var.H;
                    if (composeView2 != null) {
                        composeView2.setVisibility(0);
                    }
                    LoadingViewNew loadingViewNew = v000Var.I;
                    if (loadingViewNew != null) {
                        loadingViewNew.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (wgnVar instanceof wgn.b) {
                    ComposeView composeView3 = v000Var.H;
                    if (composeView3 != null) {
                        composeView3.setVisibility(8);
                    }
                    LoadingViewNew loadingViewNew2 = v000Var.I;
                    if (loadingViewNew2 != null) {
                        loadingViewNew2.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (wgnVar instanceof wgn.a) {
                    ComposeView composeView4 = v000Var.H;
                    if (composeView4 != null) {
                        composeView4.setVisibility(8);
                    }
                    LoadingViewNew loadingViewNew3 = v000Var.I;
                    if (loadingViewNew3 != null) {
                        loadingViewNew3.c(((wgn.a) wgnVar).a.e(v000Var.requireContext()));
                    }
                }
            }
        });
        i2i.b(this.G.O).f(getViewLifecycleOwner(), new lfy() { // from class: u000
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<String> list;
                PayHintData payHintData = (PayHintData) obj;
                v000 v000Var = this.a;
                if (payHintData != null && v000Var.D != null && (list = payHintData.descriptionLines) != null) {
                    for (String str : list) {
                        if (!TextUtils.isEmpty(str)) {
                            TextView textView2 = new TextView(v000Var.D.getContext());
                            textView2.setTextSize(12.0f);
                            textView2.setTextColor(Color.parseColor("#9ca0ab"));
                            textView2.setText(str);
                            v000Var.D.addView(textView2);
                        }
                    }
                }
                if (payHintData == null || v000Var.E == null || v000Var.F == null || TextUtils.isEmpty(payHintData.alert)) {
                    View view2 = v000Var.E;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                } else {
                    v000Var.E.setVisibility(0);
                    v000Var.F.setText(payHintData.alert);
                }
            }
        });
        return this.C;
    }
}
