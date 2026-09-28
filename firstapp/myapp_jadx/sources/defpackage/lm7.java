package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import com.sportybet.plugin.realsports.widget.ProgressLoadingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.ChooseBetActivity$initViewModel$3", f = "ChooseBetActivity.kt", l = {187}, m = "invokeSuspend", v = 2)
public final class lm7 extends tje0 implements Function2<cm2, v1b<? super Unit>, Object> {
    public RTicket a;
    public zy80 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ChooseBetActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm7(ChooseBetActivity chooseBetActivity, v1b<? super lm7> v1bVar) {
        super(2, v1bVar);
        this.e = chooseBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lm7 lm7Var = new lm7(this.e, v1bVar);
        lm7Var.d = obj;
        return lm7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cm2 cm2Var, v1b<? super Unit> v1bVar) {
        return ((lm7) create(cm2Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RTicket rTicket;
        zy80 zy80Var;
        String cMSString;
        cm2 cm2Var = (cm2) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        ChooseBetActivity chooseBetActivity = this.e;
        if (i == 0) {
            uj50.b(obj);
            if (!Intrinsics.g(cm2Var, cm2.b.a)) {
                if (Intrinsics.g(cm2Var, cm2.c.a)) {
                    zfd0 zfd0Var = chooseBetActivity.b;
                    if (zfd0Var == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ProgressLoadingView progressLoadingView = zfd0Var.e;
                    progressLoadingView.setVisibility(0);
                    progressLoadingView.c.setVisibility(0);
                    progressLoadingView.a.setVisibility(8);
                    progressLoadingView.b.setVisibility(8);
                } else if (Intrinsics.g(cm2Var, cm2.a.a)) {
                    zfd0 zfd0Var2 = chooseBetActivity.b;
                    if (zfd0Var2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var2.e.setVisibility(8);
                } else {
                    if (!(cm2Var instanceof cm2.d)) {
                        uhc.a();
                        return null;
                    }
                    RTicket rTicket2 = ((cm2.d) cm2Var).a;
                    nzm nzmVar = chooseBetActivity.w;
                    if (nzmVar == null) {
                        Intrinsics.n("stakeConfigAgent");
                        throw null;
                    }
                    zy80 zy80Var2 = new zy80(chooseBetActivity, nzmVar);
                    this.d = cm2Var;
                    this.a = rTicket2;
                    this.b = zy80Var2;
                    this.c = 1;
                    if (zy80Var2.i(rTicket2, this) == y5bVar) {
                        return y5bVar;
                    }
                    rTicket = rTicket2;
                    zy80Var = zy80Var2;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zy80Var = this.b;
        rTicket = this.a;
        uj50.b(obj);
        String strB = zy80Var.b(null, rTicket.winningStatus == 20);
        zfd0 zfd0Var3 = chooseBetActivity.b;
        if (zfd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zfd0Var3.e.setVisibility(8);
        if (strB != null) {
            ShareBetData shareBetData = ((cm2.d) cm2Var).b;
            int i2 = rTicket.winningStatus;
            if (i2 == 0) {
                cMSString = chooseBetActivity.getCMSString(R.string.bet_history__running, new Object[0]);
            } else if (i2 == 5) {
                cMSString = chooseBetActivity.getCMSString(R.string.bet_history__partial_win, new Object[0]);
            } else if (i2 != 20) {
                cMSString = i2 != 30 ? "" : chooseBetActivity.getCMSString(R.string.bet_history__lost, new Object[0]);
            } else {
                cMSString = chooseBetActivity.getCMSString(R.string.bet_history__won, new Object[0]);
            }
            ShareBetData shareBetDataCopy$default = ShareBetData.copy$default(shareBetData, null, null, null, cMSString, null, false, null, 119, null);
            Uri uri = Uri.parse(strB);
            Intent intent = new Intent();
            intent.putExtra("result_uri", uri);
            intent.putExtra("key_share_bet_data", shareBetDataCopy$default);
            chooseBetActivity.setResult(-1, intent);
            chooseBetActivity.finish();
        }
        return Unit.a;
    }
}
