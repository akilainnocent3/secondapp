package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljsa;", "Landroidx/fragment/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "b", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public final class jsa extends hpl implements View.OnClickListener {
    public b A;
    public psm B;
    public r700 f;
    public String i;
    public String v;
    public String w;
    public String y;
    public h400 z;

    public static final class a {
        public static jsa a(r700 r700Var, String str, String str2, String str3, String str4, h400 h400Var, b bVar) {
            str.getClass();
            str2.getClass();
            str4.getClass();
            jsa jsaVar = new jsa();
            Bundle bundle = new Bundle();
            bundle.putString("confirm_dialog_type", r700Var.toString());
            bundle.putString("bank_name", str);
            bundle.putString("amount", str2);
            bundle.putString("account_value", str3);
            bundle.putString("name", str4);
            bundle.putString("name", str4);
            if (h400Var != null) {
                bundle.putInt(AnalyticsParam.EVENT_STREAM_PROVIDER, h400Var.ordinal());
            }
            jsaVar.setArguments(bundle);
            jsaVar.A = bVar;
            return jsaVar;
        }

        public static /* synthetic */ jsa b(r700 r700Var, String str, String str2, String str3, String str4, b bVar, int i) {
            if ((i & 16) != 0) {
                str4 = "";
            }
            return a(r700Var, str, str2, str3, str4, null, bVar);
        }
    }

    public interface b {
        void h();
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r700.values().length];
            try {
                r700 r700Var = r700.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                r700 r700Var2 = r700.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        if (id == R.id.cancel) {
            dismiss();
        } else if (id == R.id.confirm) {
            b bVar = this.A;
            if (bVar != null) {
                bVar.h();
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            dismiss();
        }
        if (getArguments() != null) {
            String string = requireArguments().getString("confirm_dialog_type");
            this.f = string != null ? r700.valueOf(string) : null;
            this.i = requireArguments().getString("bank_name");
            this.v = requireArguments().getString("amount");
            this.w = requireArguments().getString("account_value");
            this.y = requireArguments().getString("name");
            this.z = h400.values()[requireArguments().getInt(AnalyticsParam.EVENT_STREAM_PROVIDER)];
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        String strD;
        String strD2;
        String strD3;
        String strB;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(requireActivity());
        aVar.e(R.layout.dialog_confirm_payment_amount);
        aVar.a.k = false;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        bVarCreate.findViewById(R.id.cancel).setOnClickListener(this);
        bVarCreate.findViewById(R.id.confirm).setOnClickListener(this);
        TextView textView = (TextView) bVarCreate.findViewById(R.id.title);
        r700 r700Var = this.f;
        int i = r700Var == null ? -1 : c.a[r700Var.ordinal()];
        if (i != 1) {
            strD = i != 2 ? sn5.d(this, R.string.component_betslip__confirm_to_pay, new Object[0]) : sn5.d(this, R.string.page_withdraw__confirm_to_withdraw, new Object[0]);
        } else {
            strD = sn5.d(this, R.string.page_payment__deposit_confirmation, new Object[0]);
        }
        textView.setText(strD);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.payment_to_label);
        h400 h400Var = this.z;
        h400 h400Var2 = h400.OZOW;
        if (h400Var == h400Var2) {
            strD2 = sn5.d(this, R.string.page_payment__bank_name, new Object[0]);
        } else {
            r700 r700Var2 = this.f;
            if (r700Var2 == r700.a) {
                strD2 = sn5.d(this, R.string.page_transaction__deposit_from, new Object[0]);
            } else {
                strD2 = r700Var2 == r700.b ? sn5.d(this, R.string.page_transaction__withdraw_to, new Object[0]) : sn5.d(this, R.string.page_transaction__withdraw_to, new Object[0]);
            }
        }
        textView2.setText(strD2);
        ((TextView) bVarCreate.findViewById(R.id.payment_to_name)).setText(this.i);
        TextView textView3 = (TextView) bVarCreate.findViewById(R.id.account_number_label);
        textView3.getClass();
        String str = this.w;
        textView3.setVisibility((str == null || str.length() <= 0) ? 8 : 0);
        if (this.z == h400Var2) {
            strD3 = sn5.d(this, R.string.page_payment__account_number, new Object[0]);
        } else {
            String str2 = this.i;
            if (str2 == null || str2.length() == 0 || !Intrinsics.g(this.i, sn5.d(this, R.string.int_provider_pix, new Object[0]))) {
                String str3 = this.i;
                strD3 = (str3 == null || str3.length() == 0 || !Intrinsics.g(this.i, sn5.d(this, R.string.int_spei_by_stp, new Object[0]))) ? sn5.d(this, R.string.page_payment__mobile_number, new Object[0]) : getString(R.string.page_payment__account_number);
            } else {
                strD3 = getString(R.string.page_withdraw__pix_key);
            }
        }
        textView3.setText(strD3);
        TextView textView4 = (TextView) bVarCreate.findViewById(R.id.account_number_value);
        textView4.getClass();
        String str4 = this.w;
        textView4.setVisibility((str4 == null || str4.length() <= 0) ? 8 : 0);
        textView4.setText(this.w);
        TextView textView5 = (TextView) bVarCreate.findViewById(R.id.account_name);
        TextView textView6 = (TextView) bVarCreate.findViewById(R.id.account_name_label);
        if (TextUtils.isEmpty(this.y)) {
            textView5.setVisibility(8);
            textView6.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            textView5.setText(this.y);
        }
        TextView textView7 = (TextView) bVarCreate.findViewById(R.id.amount_label);
        psm psmVar = this.B;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        boolean zO = psmVar.O();
        psm psmVar2 = this.B;
        if (zO) {
            if (psmVar2 == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            strB = psmVar2.f();
        } else {
            if (psmVar2 == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            strB = psmVar2.B();
        }
        textView7.setText(sn5.d(this, R.string.common_functions__amount_label, strB));
        ((TextView) bVarCreate.findViewById(R.id.amount)).setText(bjb0.P(this.v, Locale.US));
        return bVarCreate;
    }
}
