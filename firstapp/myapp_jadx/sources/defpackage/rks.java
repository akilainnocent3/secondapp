package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportybet.android.verifybet.VerifyBetActivity;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rks implements nnf.a, ClearEditText.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ rks(Object obj) {
        this.a = obj;
    }

    @Override // nnf.a
    public void a(ErrorDataInfo errorDataInfo) {
        lkg lkgVar = (lkg) this.a;
        int i = LiveEventHeaderView.L;
        lkgVar.a();
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public void l(CharSequence charSequence) {
        df dfVar = (df) this.a;
        int i = VerifyBetActivity.f;
        dfVar.B.setError((String) null);
        dfVar.d.setEnabled((charSequence != null ? charSequence.length() : 0) > 0);
    }
}
