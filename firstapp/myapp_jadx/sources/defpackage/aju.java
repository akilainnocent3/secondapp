package defpackage;

import android.content.Intent;
import com.sportybet.android.home.MainActivity;
import com.sportybet.feature.loyal.LoyalJoinDialogActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aju implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = MainActivity.m0;
        if (((Boolean) obj).booleanValue()) {
            MainActivity mainActivity = this.a;
            oku okuVar = mainActivity.I;
            u2u u2uVar = okuVar.e;
            et7 et7VarD = o8i0.d(okuVar);
            u2uVar.getClass();
            ej5.c(et7VarD, u2uVar.a, null, new p2u(null, u2uVar), 2);
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) LoyalJoinDialogActivity.class));
        }
    }
}
