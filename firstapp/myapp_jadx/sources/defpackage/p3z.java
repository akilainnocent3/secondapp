package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class p3z {
    public static final f4z a(Context context, boolean z) {
        ResourceUiText resourceUiText;
        q3z q3zVar;
        if (z) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__the_instruction_of_access_bank_website);
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__the_instruction_of_access_bank_app);
        }
        f4z f4zVar = new f4z(resourceUiText);
        if (z) {
            j7g j7gVar = new j7g();
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_2__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_3__NG, new Object[0])}, new boolean[]{false, true}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_4__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_5__NG, new Object[0])}, new boolean[]{false, true}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_8__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_10__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_11__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_12__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_13__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_14__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_15__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_16__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_17__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_18__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_19__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_20__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_21__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_web_content_22__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            q3zVar = new q3z(j7gVar, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            j7g j7gVar2 = new j7g();
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_1__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_2__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_4__NG, new Object[0])}, new boolean[]{false, true}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_6__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_7__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_8__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_10__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_11__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_12__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_13__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_14__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_15__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_16__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_17__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_18__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            j7gVar2.a("\n");
            j7gVar2.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_19__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_20__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_with_access_bank_app_content_21__NG, new Object[0])}, new boolean[]{false, true, false}, zch0.b(context.getResources(), 15));
            q3zVar = new q3z(j7gVar2, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        f4zVar.b.add(q3zVar);
        return f4zVar;
    }
}
