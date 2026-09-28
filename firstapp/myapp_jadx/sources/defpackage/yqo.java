package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class yqo implements gd8.a {
    public final /* synthetic */ jpk a;
    public final /* synthetic */ tlo b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ e d;

    public yqo(jpk jpkVar, tlo tloVar, Runnable runnable, e eVar) {
        this.a = jpkVar;
        this.b = tloVar;
        this.c = runnable;
        this.d = eVar;
    }

    @Override // gd8.a
    public final b a(final e eVar) {
        b.a aVar = new b.a(eVar, R.style.Widget_App_AlertDialog);
        b.a title = aVar.setTitle(sn5.b(eVar, R.string.component_betslip__confirm_remove_all_title, new Object[0]));
        title.a.f = sn5.b(eVar, R.string.component_betslip__confirm_remove_all_content, new Object[0]);
        title.c(sn5.b(eVar, R.string.common_functions__ok, new Object[0]), new xqo(this));
        title.b(sn5.b(eVar, R.string.common_functions__later, new Object[0]), new wqo());
        final b bVarCreate = aVar.create();
        bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vqo
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bVarCreate.getWindow().setBackgroundDrawable(new ColorDrawable(eVar.getColor(R.color.background_type1_secondary)));
            }
        });
        return bVarCreate;
    }
}
