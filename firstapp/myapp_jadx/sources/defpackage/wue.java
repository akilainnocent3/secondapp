package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.gift.domain.DobGift;
import com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity;
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class wue {
    public static final void a(View view) {
        view.getClass();
        vc80 vc80VarA = zc80.a(new z7i0(view, null));
        while (vc80VarA.hasNext()) {
            ArrayList<z120> arrayList = c((View) vc80VarA.next()).a;
            for (int iJ = b.j(arrayList); -1 < iJ; iJ--) {
                arrayList.get(iJ).a();
            }
        }
    }

    public static lff0 b(a aVar) {
        long jA = c68.a(R.color.brand_secondary, aVar);
        long jA2 = c68.a(R.color.line_type1_secondary, aVar);
        return t9z.d(c68.a(R.color.text_type1_primary, aVar), c68.a(R.color.text_type1_primary, aVar), c68.a(R.color.text_disable_type1_primary, aVar), 0L, 0L, 0L, 0L, c68.a(R.color.brand_secondary, aVar), jA, jA2, c68.a(R.color.background_type1_primary, aVar), c68.a(R.color.warning_primary, aVar), c68.a(R.color.brand_secondary, aVar), c68.a(R.color.text_type1_primary, aVar), c68.a(R.color.text_disable_type1_primary, aVar), aVar, 2088732408);
    }

    public static final a220 c(View view) {
        a220 a220Var = (a220) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (a220Var != null) {
            return a220Var;
        }
        a220 a220Var2 = new a220();
        view.setTag(R.id.pooling_container_listener_holder_tag, a220Var2);
        return a220Var2;
    }

    public static final String e(String str, String str2) {
        str.getClass();
        str2.getClass();
        int iV = StringsKt.V(6, str, str2);
        return iV != -1 ? StringsKt.b0(iV, str2.length() + iV, str).toString() : str;
    }

    public void d(Context context, DobGift dobGift) {
        context.getClass();
        dobGift.getClass();
        int i = DobGiftReceivedActivity.e;
        Intent intent = new Intent(context, (Class<?>) DobGiftReceivedActivity.class);
        intent.putExtra("dob_gift_domain_model", dobGift);
        context.startActivity(intent);
    }
}
