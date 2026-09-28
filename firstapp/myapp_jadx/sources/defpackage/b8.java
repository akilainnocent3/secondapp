package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportybet.android.multimaker.presentation.uievent.MultiMakerAddToBetSlipOptionsUiEvent;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ b8(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = e8.z;
                ((u7) ((e8) fragment).v.getValue()).a.j("CLOSE");
                sh8.c().e(o7d.a(wae.HOME));
                break;
            default:
                gfw gfwVar = (gfw) fragment;
                gfwVar.getParentFragmentManager().m0("REQUEST_KET_SHOW_MULTI_MAKER_ADD_TO_BET_SLIP_OPTIONS_DIALOG", vj5.a(new Pair("RESULT_KEY_SHOW_MULTI_MAKER_ADD_TO_BET_SLIP_OPTIONS_DIALOG", MultiMakerAddToBetSlipOptionsUiEvent.Cancel.a)));
                gfwVar.dismissAllowingStateLoss();
                break;
        }
    }
}
