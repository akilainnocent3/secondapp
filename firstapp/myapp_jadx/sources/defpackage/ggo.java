package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.android.instantwin.domain.GiftCurrentBalance;
import com.sportybet.plugin.common.gift.GiftsActivity;
import java.util.ArrayList;
import kotlin.text.b;

/* JADX INFO: loaded from: classes.dex */
public final class ggo extends vd<fqk, gqk> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        fqk fqkVar = (fqk) obj;
        fqkVar.getClass();
        Intent intent = new Intent(context, (Class<?>) GiftsActivity.class);
        intent.putExtra("order_biz_type", fqkVar.a);
        intent.putExtra("key_instant_win_gift_applicability_context", fqkVar.b);
        m780 m780Var = fqkVar.c;
        if (m780Var != null) {
            String str = m780Var.a;
            GiftDetails giftDetails = m780Var.b;
            intent.putExtra("key_gift_id", giftDetails.getGiftId());
            intent.putExtra("key_gift_kind", giftDetails.getKind());
            intent.putExtra("key_gift_value", str);
        }
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        Bundle extras;
        SelectedGiftData selectedGiftData;
        Object aVar;
        Bundle extras2;
        if (i != -1) {
            if (i != 0) {
                return gqk.b.a;
            }
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                ArrayList arrayListB = Build.VERSION.SDK_INT >= 34 ? rj5.a.b(extras2, "extra_usable_gift_current_balances", GiftCurrentBalance.class) : extras2.getParcelableArrayList("extra_usable_gift_current_balances");
                if (arrayListB != null) {
                    return new gqk.c(arrayListB);
                }
            }
            return gqk.b.a;
        }
        if (intent != null && (extras = intent.getExtras()) != null && (selectedGiftData = (SelectedGiftData) ((Parcelable) rj5.a(extras, "extra_selected_gift", SelectedGiftData.class))) != null) {
            if (selectedGiftData.hasGift()) {
                String giftValue = selectedGiftData.getGiftValue();
                aVar = (giftValue != null ? b.g(giftValue) : null) == null ? gqk.b.a : new gqk.a(selectedGiftData.getGiftId(), selectedGiftData.getGiftValue());
            } else {
                aVar = gqk.d.a;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return gqk.b.a;
    }
}
