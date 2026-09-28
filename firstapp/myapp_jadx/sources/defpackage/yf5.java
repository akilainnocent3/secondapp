package defpackage;

import android.view.View;
import androidx.fragment.app.d;
import com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yf5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ yf5(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((BuildAndGoRunningPageDialog) dVar).dismiss();
                break;
            default:
                ((u3e) dVar).m0().U1();
                break;
        }
    }
}
