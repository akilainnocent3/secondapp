package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.core.model.sharewin.ShareWinData;
import com.sportybet.feature.winning.WinningDialogActivity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class thf implements CombEditText.c, pya {
    public final /* synthetic */ Object a;

    public /* synthetic */ thf(Object obj) {
        this.a = obj;
    }

    @Override // com.sporty.android.common_ui.widgets.CombEditText.c
    public void a() {
        sif sifVarP0 = ((yhf) this.a).P0();
        if (sifVarP0.v0.getValue() != null) {
            sifVarP0.L1();
        }
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        WinningDialogActivity winningDialogActivity = (WinningDialogActivity) this.a;
        z190 z190Var = (z190) obj;
        WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
        winningDialogActivity.H.m0.a();
        if (!(z190Var instanceof z190.b)) {
            if (z190Var instanceof z190.a) {
                winningDialogActivity.V = false;
                winningDialogActivity.E1(winningDialogActivity.d0);
                return;
            }
            return;
        }
        ShareWinData shareWinData = ((z190.b) z190Var).a;
        winningDialogActivity.V = true;
        try {
            if (TextUtils.isEmpty(shareWinData.getShareUrl())) {
                winningDialogActivity.E1(winningDialogActivity.d0);
            } else {
                sh8.c().g(shareWinData.getShareUrl());
                winningDialogActivity.b0 = shareWinData.getShareUrl();
            }
        } catch (Exception unused) {
            winningDialogActivity.V = false;
            winningDialogActivity.E1(winningDialogActivity.d0);
        }
    }
}
