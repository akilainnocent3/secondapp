package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oqo implements gd8.a {
    @Override // gd8.a
    public final b a(final e eVar) {
        b.a aVar = new b.a(eVar, R.style.Widget_App_AlertDialog);
        aVar.a.f = sn5.b(eVar, R.string.page_instant_virtual__please_make_at_least_vnum_vselecttext, "1", sn5.b(eVar, R.string.common_functions__l_selection, new Object[0]));
        aVar.c(sn5.b(eVar, R.string.common_functions__ok, new Object[0]), new qqo());
        final b bVarCreate = aVar.create();
        bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: rqo
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar.getColor(R.color.background_type1_secondary)));
            }
        });
        return bVarCreate;
    }
}
