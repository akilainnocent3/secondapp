package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class uqo implements gd8.a {
    public final /* synthetic */ DialogInterface.OnClickListener a;

    public uqo(DialogInterface.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // gd8.a
    public final b a(final e eVar) {
        b.a aVar = new b.a(eVar);
        b.a title = aVar.setTitle(sn5.b(eVar, R.string.page_instant_virtual__bet_fail, new Object[0]));
        title.a.f = sn5.b(eVar, R.string.page_instant_virtual__please_contact_customer_service_for_assistance, new Object[0]);
        title.c(sn5.b(eVar, R.string.common_functions__ok, new Object[0]), this.a);
        final b bVarCreate = aVar.create();
        bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: tqo
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar.getColor(R.color.background_type1_secondary)));
            }
        });
        return bVarCreate;
    }
}
