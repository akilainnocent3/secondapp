package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class sc00 {
    public static final b a(e eVar, String str, final Function0 function0, final Function0 function1) {
        eVar.getClass();
        str.getClass();
        b.a aVar = new b.a(eVar, R.style.Widget_Payment_PendingRequest_AlertDialog);
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        b.a title = aVar.setTitle(sn5.b(eVar, R.string.page_payment__pending_request, new Object[0]));
        title.c(sn5.b(eVar, R.string.common_functions__home, new Object[0]), new DialogInterface.OnClickListener() { // from class: oc00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                sh8.c().e(o7d.a(wae.HOME));
                function0.invoke();
            }
        });
        title.b(sn5.b(eVar, R.string.common_functions__transactions, new Object[0]), new DialogInterface.OnClickListener() { // from class: pc00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Bundle bundleA = x6.a(AnalyticsEvent.DEPOSIT, true);
                bundleA.putInt("key_param_tx_category", aqg0.e.c.a);
                bundleA.putSerializable("EXTRA_ENTRANCE", fag.D_PENDING_POPUP);
                Unit unit = Unit.a;
                sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundleA);
                function1.invoke();
            }
        });
        b bVarCreate = title.create();
        bVarCreate.getClass();
        return bVarCreate;
    }

    public static final b b(Context context, String str, final boolean z, final Function0<Unit> function0, final Function0<Unit> function1) {
        context.getClass();
        str.getClass();
        b.a aVar = new b.a(context, R.style.Widget_Payment_PendingRequest_AlertDialog);
        AlertController.b bVar = aVar.a;
        bVar.f = str;
        bVar.k = false;
        b.a title = aVar.setTitle(sn5.b(context, R.string.page_payment__pending_request, new Object[0]));
        title.c(sn5.b(context, R.string.common_functions__home, new Object[0]), new DialogInterface.OnClickListener() { // from class: qc00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                sh8.c().e(o7d.a(wae.HOME));
                function0.invoke();
            }
        });
        title.b(sn5.b(context, R.string.common_functions__transactions, new Object[0]), new DialogInterface.OnClickListener() { // from class: rc00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Bundle bundleA = x6.a(AnalyticsEvent.DEPOSIT, z);
                bundleA.putInt("key_param_tx_category", aqg0.j.c.a);
                bundleA.putSerializable("EXTRA_ENTRANCE", fag.W_PENDING_POPUP);
                Unit unit = Unit.a;
                sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundleA);
                function1.invoke();
            }
        });
        b bVarCreate = title.create();
        bVarCreate.getClass();
        return bVarCreate;
    }
}
