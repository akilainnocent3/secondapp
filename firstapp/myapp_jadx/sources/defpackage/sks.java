package defpackage;

import android.view.View;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportybet.android.verifybet.VerifyBetActivity;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sks implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sks(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = LiveEventHeaderView.L;
                ((LiveEventHeaderView) obj).J.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
                break;
            default:
                df dfVar = (df) obj;
                int i3 = VerifyBetActivity.f;
                dfVar.A.setVisibility(8);
                ClearEditText clearEditText = dfVar.B;
                clearEditText.setEnabled(true);
                clearEditText.setActivated(false);
                clearEditText.setText("");
                break;
        }
    }
}
