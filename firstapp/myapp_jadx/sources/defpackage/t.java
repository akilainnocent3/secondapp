package defpackage;

import android.widget.TextView;
import android.widget.Toast;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;
import com.sportygames.anTesting.presentation.ui.ANTestingActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ fq0 b;

    public /* synthetic */ t(fq0 fq0Var, int i) {
        this.a = i;
        this.b = fq0Var;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        String string;
        int i = this.a;
        fq0 fq0Var = this.b;
        switch (i) {
            case 0:
                ANTestingActivity aNTestingActivity = (ANTestingActivity) fq0Var;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = ANTestingActivity.e;
                int i3 = ANTestingActivity.a.a[loadingState.getStatus().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            uhc.a();
                            return;
                        } else {
                            ResultWrapper.GenericError error = loadingState.getError();
                            Toast.makeText(aNTestingActivity, String.valueOf(error != null ? error.getCode() : null), 0).show();
                            return;
                        }
                    }
                    jc jcVar = aNTestingActivity.a;
                    if (jcVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    jcVar.c.setEnabled(true);
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    jc jcVar2 = aNTestingActivity.a;
                    if (jcVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView = jcVar2.f;
                    if (hTTPResponse == null || (string = hTTPResponse.toString()) == null) {
                        string = aNTestingActivity.getString(R.string.visit_success);
                        string.getClass();
                    }
                    textView.setText(string);
                    return;
                }
                return;
            default:
                TxDetailsActivity txDetailsActivity = (TxDetailsActivity) fq0Var;
                c330 c330Var = (c330) obj;
                int i4 = TxDetailsActivity.D0;
                if (c330Var instanceof c330.b) {
                    txDetailsActivity.n0.setEnabled(false);
                    return;
                }
                if (c330Var instanceof c330.a) {
                    c330.a aVar = (c330.a) c330Var;
                    txDetailsActivity.n0.setEnabled(aVar.a);
                    UiText uiText = aVar.b;
                    if (uiText != null) {
                        txDetailsActivity.n0.setText(uiText.e(txDetailsActivity));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
