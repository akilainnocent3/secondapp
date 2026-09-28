package defpackage;

import android.content.Context;
import android.view.View;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class w3z {
    public static final q3z a(Context context, mal malVar, String str, final jh5 jh5Var) {
        int iOrdinal = malVar.ordinal();
        if (iOrdinal == 0) {
            j7g j7gVar = new j7g();
            j7gVar.a(sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_1__NG, new Object[0]));
            j7gVar.i(sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_2__NG, new Object[0]), context.getColor(R.color.brand_secondary), new j7g.a() { // from class: u3z
                @Override // j7g.a
                public final void a() {
                    jh5Var.invoke();
                }
            });
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_4__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_8__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_10__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_11__NG, new Object[0])}, new boolean[]{false, true, false, true, false, true, false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_12__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_13__NG, new Object[0]), str != null ? str : "", sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_14__NG, new Object[0])}, new boolean[]{false, true, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_15__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_16__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            StringUiText stringUiText = vch0.a;
            return new q3z(j7gVar, new ResourceUiText(R.string.common_payment_providers__visit_gtbank_to_deposit__NG), new View.OnClickListener() { // from class: v3z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jh5Var.invoke();
                }
            }, 40);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            j7g j7gVar2 = new j7g();
            j7gVar2.a(sn5.b(context, R.string.common_payment_providers__gtbank_ussd_step__NG, new Object[0]));
            return new q3z(j7gVar2, null, null, 60);
        }
        j7g j7gVar3 = new j7g();
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_2__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_4__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_6__NG, new Object[0])}, new boolean[]{false, true, false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_8__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_10__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_11__NG, new Object[0])}, new boolean[]{false, true, false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_12__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_13__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_14__NG, new Object[0]), str != null ? str : "", sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_15__NG, new Object[0])}, new boolean[]{false, true, true, false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_16__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__gtbank_mobile_info_partial_17__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        return new q3z(j7gVar3, null, null, 60);
    }

    public static final f4z b(Context context, mal malVar, String str, jh5 jh5Var) {
        int iOrdinal = malVar.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            f4z f4zVar = new f4z(new ResourceUiText(R.string.page_payment__deposit_with_gtbank_website));
            f4zVar.b.add(a(context, malVar, str, jh5Var));
            return f4zVar;
        }
        if (iOrdinal == 1) {
            StringUiText stringUiText2 = vch0.a;
            f4z f4zVar2 = new f4z(new ResourceUiText(R.string.page_payment__deposit_with_gtbank_mobile));
            f4zVar2.b.add(a(context, malVar, str, jh5Var));
            return f4zVar2;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        StringUiText stringUiText3 = vch0.a;
        f4z f4zVar3 = new f4z(new ResourceUiText(R.string.page_payment__deposit_with_ussd));
        f4zVar3.b.add(a(context, malVar, str, jh5Var));
        return f4zVar3;
    }
}
