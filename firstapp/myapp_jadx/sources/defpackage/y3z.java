package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class y3z {
    public static final f4z a(Context context, boolean z) {
        ResourceUiText resourceUiText;
        if (z) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_payment_providers__kuda_bank_web_title__NG);
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_payment_providers__kuda_bank_mobile_title__NG);
        }
        f4z f4zVar = new f4z(resourceUiText);
        j7g j7gVar = new j7g();
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content1__NG, new Object[0]), sn5.b(context, z ? R.string.common_payment_providers__deposit_kuda_bank_web_content2__NG : R.string.common_payment_providers__deposit_kuda_bank_app_content2__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_partial__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content4__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_partial__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_partial__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content8__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_partial__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content10__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_partial__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content11__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content12__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
        f4zVar.b.add(new q3z(j7gVar, null, null, WebSocketProtocol.PAYLOAD_SHORT));
        return f4zVar;
    }
}
