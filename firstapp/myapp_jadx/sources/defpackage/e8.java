package defpackage;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le8;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e8 extends lll {
    public static final /* synthetic */ ohp<Object>[] z = {new d630(0, e8.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentAccountActivationResultBinding;")};
    public Integer f = 0;
    public String i = "";
    public final q8i0 v = new q8i0(jq40.a(u7.class), new b(), new d(), new c());
    public final i6i0 w = g5e.a(a.a);
    public uqm y;

    public static final /* synthetic */ class a extends saj implements Function1<View, sui> {
        public static final a a = new a(1, sui.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentAccountActivationResultBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final sui invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.btn_ok;
            TextView textView = (TextView) h5e.a(R.id.btn_ok, view2);
            if (textView != null) {
                i = R.id.content;
                TextView textView2 = (TextView) h5e.a(R.id.content, view2);
                if (textView2 != null) {
                    i = R.id.image;
                    ImageView imageView = (ImageView) h5e.a(R.id.image, view2);
                    if (imageView != null) {
                        i = R.id.title;
                        TextView textView3 = (TextView) h5e.a(R.id.title, view2);
                        if (textView3 != null) {
                            return new sui((ConstraintLayout) view2, textView, textView2, imageView, textView3);
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return e8.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return e8.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return e8.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final sui m0() {
        return (sui) this.w.a(this, z[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f = arguments != null ? Integer.valueOf(arguments.getInt("type")) : null;
        Bundle arguments2 = getArguments();
        this.i = arguments2 != null ? arguments2.getString(EventKeys.ERROR_MESSAGE) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Integer num = this.f;
        int i = 0;
        if (num != null && num.intValue() == 199) {
            m0().d.setImageResource(R.drawable.account_activation_successful);
            sn5.f(m0().e, R.string.common_info_setting__account_deactivation_successful_title, new Object[0]);
            sn5.f(m0().c, R.string.common_info_setting__account_deactivation_successful_content, new Object[0]);
            m0().b.setOnClickListener(new View.OnClickListener() { // from class: z7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ohp<Object>[] ohpVarArr = e8.z;
                    e8 e8Var = this.a;
                    uqm uqmVar = e8Var.y;
                    if (uqmVar == null) {
                        Intrinsics.n("accountHelper");
                        throw null;
                    }
                    if (uqmVar.isLogin()) {
                        uqm uqmVar2 = e8Var.y;
                        if (uqmVar2 == null) {
                            Intrinsics.n("accountHelper");
                            throw null;
                        }
                        uqmVar2.logout();
                    }
                    ((u7) e8Var.v.getValue()).a.j("CLOSE");
                }
            });
            return;
        }
        if (num != null && num.intValue() == 399) {
            m0().d.setImageResource(R.drawable.account_activation_successful);
            sn5.f(m0().e, R.string.common_info_setting__account_reactivation_successful_title, new Object[0]);
            sn5.f(m0().c, R.string.common_info_setting__account_reactivation_successful_content, new Object[0]);
            m0().b.setOnClickListener(new View.OnClickListener() { // from class: a8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ohp<Object>[] ohpVarArr = e8.z;
                    ((u7) this.a.v.getValue()).a.j("CLOSE");
                    sh8.c().e(o7d.a(wae.HOME));
                }
            });
            return;
        }
        if (num != null && num.intValue() == 400) {
            m0().d.setImageResource(R.drawable.account_activation_successful);
            sn5.f(m0().e, R.string.common_info_setting__account_reactivation_successful_title, new Object[0]);
            TextView textView = m0().c;
            String strD = this.i;
            if (strD == null) {
                strD = sn5.d(this, R.string.common_info_setting__account_deactivation_successful_content, new Object[0]);
            }
            textView.setText(strD);
            m0().b.setOnClickListener(new b8(this, i));
            return;
        }
        if (num != null && num.intValue() == 499) {
            m0().d.setImageResource(R.drawable.account_activation_failed);
            sn5.f(m0().e, R.string.common_info_setting__account_reactivation_failed_title, new Object[0]);
            m0().c.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView2 = m0().c;
            j7g j7gVar = new j7g();
            j7gVar.a(sn5.d(this, R.string.common_info_setting__account_reactivation_failed_content_1, new Object[0]));
            j7gVar.i(sn5.d(this, R.string.common_functions__customer_service_lowcase, new Object[0]), m0().c.getContext().getColor(R.color.brand_secondary), new c8(this));
            j7gVar.a(sn5.d(this, R.string.app_common__blank_space, new Object[0]));
            j7gVar.a(sn5.d(this, R.string.common_info_setting__account_reactivation_failed_content_2, new Object[0]));
            textView2.setText(j7gVar);
            m0().b.setOnClickListener(new View.OnClickListener() { // from class: d8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ohp<Object>[] ohpVarArr = e8.z;
                    ((u7) this.a.v.getValue()).a.j("CLOSE");
                }
            });
        }
    }
}
