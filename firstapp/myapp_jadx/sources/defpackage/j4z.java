package defpackage;

import android.content.Context;
import android.view.View;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class j4z {
    public static final q3z a(Context context, ack0 ack0Var, final kh5 kh5Var) {
        int iOrdinal = ack0Var.ordinal();
        if (iOrdinal == 0) {
            j7g j7gVar = new j7g();
            j7gVar.a(sn5.b(context, R.string.common_payment_providers__gtbank_website_info_partial_1__NG, new Object[0]));
            j7gVar.i(sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_2__NG, new Object[0]), context.getColor(R.color.brand_secondary), new j7g.a() { // from class: h4z
                @Override // j7g.a
                public final void a() {
                    kh5Var.invoke();
                }
            });
            j7gVar.a(sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_3__NG, new Object[0]));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_4__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_8__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_10__NG, new Object[0])}, new boolean[]{false, true, false, true, false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_website_partial_11__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            StringUiText stringUiText = vch0.a;
            return new q3z(j7gVar, new ResourceUiText(R.string.common_payment_providers__visit_zenith_bank_to_deposit__NG), new View.OnClickListener() { // from class: i4z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kh5Var.invoke();
                }
            }, 104);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            j7g j7gVar2 = new j7g();
            j7gVar2.a(sn5.b(context, R.string.common_payment_providers__zenith_payment_instruction_ussd_content_partial_1__NG, new Object[0]));
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_payment_instruction_ussd_content_partial_2__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            return new q3z(j7gVar2, null, null, 124);
        }
        j7g j7gVar3 = new j7g();
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_2__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_4__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_7__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_8__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_9__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar3.a("\n");
        j7gVar3.m(new String[]{sn5.b(context, R.string.common_payment_providers__zenith_deposit_with_zenith_mobile_partial_10__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        return new q3z(j7gVar3, null, null, 124);
    }

    public static final f4z b(Context context, ack0 ack0Var, kh5 kh5Var) {
        int iOrdinal = ack0Var.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            f4z f4zVar = new f4z(new ResourceUiText(R.string.page_payment__zenith_instruction_web_title));
            f4zVar.b.add(a(context, ack0Var, kh5Var));
            return f4zVar;
        }
        if (iOrdinal == 1) {
            StringUiText stringUiText2 = vch0.a;
            f4z f4zVar2 = new f4z(new ResourceUiText(R.string.page_payment__zenith_instruction_app_title));
            f4zVar2.b.add(a(context, ack0Var, kh5Var));
            return f4zVar2;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        StringUiText stringUiText3 = vch0.a;
        f4z f4zVar3 = new f4z(new ResourceUiText(R.string.page_payment__deposit_with_ussd));
        f4zVar3.b.add(a(context, ack0Var, kh5Var));
        return f4zVar3;
    }
}
