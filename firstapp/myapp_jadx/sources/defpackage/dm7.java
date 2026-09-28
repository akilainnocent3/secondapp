package defpackage;

import android.view.View;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dm7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dm7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChooseBetActivity chooseBetActivity = (ChooseBetActivity) obj;
                int i2 = ChooseBetActivity.y;
                bn7 bn7VarZ1 = chooseBetActivity.z1();
                ej5.c(o8i0.d(bn7VarZ1), null, null, new xm7(bn7VarZ1, chooseBetActivity.A1(), false, null), 3);
                break;
            default:
                ((jwk) obj).dismiss();
                break;
        }
    }
}
