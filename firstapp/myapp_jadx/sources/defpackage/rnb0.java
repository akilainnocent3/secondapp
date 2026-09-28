package defpackage;

import android.view.View;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rnb0 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = SportyDeskButton.b;
        unb0 unb0VarC = unb0.c();
        unb0VarC.a = false;
        tnb0 tnb0Var = unb0VarC.i;
        if (tnb0Var != null) {
            tnb0Var.cancel();
        }
        unb0.y.b(hp0.A, null);
        ArrayList arrayList = l88.f().a;
        if (arrayList.contains(unb0VarC)) {
            arrayList.remove(unb0VarC);
        }
        unb0VarC.b = false;
    }
}
