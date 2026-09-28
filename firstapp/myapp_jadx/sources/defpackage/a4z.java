package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.collections.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class a4z {
    public static final q3z a(Context context) {
        j7g j7gVar = new j7g();
        Iterator it = b.k(Integer.valueOf(R.string.common_payment_providers__deposit_with_palmpay_content_1__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_palmpay_content_2__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_palmpay_content_3__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_palmpay_content_4__NG), Integer.valueOf(R.string.common_payment_providers__deposit_with_palmpay_content_5__NG)).iterator();
        while (it.hasNext()) {
            j7gVar.m(new String[]{sn5.b(context, ((Number) it.next()).intValue(), new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 15));
            j7gVar.a("\n");
        }
        return new q3z(j7gVar, null, null, WebSocketProtocol.PAYLOAD_SHORT);
    }
}
