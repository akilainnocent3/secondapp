package defpackage;

import android.content.DialogInterface;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bzu implements DialogInterface.OnClickListener {
    public final /* synthetic */ MatchEventDetailActivity a;

    public /* synthetic */ bzu(MatchEventDetailActivity matchEventDetailActivity) {
        this.a = matchEventDetailActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = MatchEventDetailActivity.U;
        dialogInterface.getClass();
        dialogInterface.dismiss();
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        matchEventDetailActivity.I1().A1();
        matchEventDetailActivity.G1(2);
    }
}
