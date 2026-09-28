package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spin2win.model.response.RecentWinsResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecentWinsResponse recentWinsResponse;
        e activity;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                int i2 = PreMatchEventActivity.a2;
                if (bi50Var != null) {
                    VoteResponse voteResponse = (VoteResponse) bi50Var.b;
                    if (!bi50Var.a.getIsSuccessful() || voteResponse == null) {
                        ResponseBody responseBody = bi50Var.c;
                        if (responseBody != null) {
                            zyf0.d(ui8.c(responseBody));
                        }
                    } else {
                        soi0 soi0Var = new soi0(voteResponse.getVoteSources(), voteResponse.getEndDate(), voteResponse.getEventId(), voteResponse.getStatus(), voteResponse.getVoteCount());
                        s88 s88Var = preMatchEventActivity.G0;
                        if (s88Var != null) {
                            s88Var.q(soi0Var, true);
                        }
                    }
                } else {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.live__voted_failed_tip, new Object[0]));
                }
                return Unit.a;
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = a1b0.a.a[loadingState.getStatus().ordinal()];
                ArrayList<ArrayList<Object>> data = null;
                if (i3 != 1) {
                    int i4 = 2;
                    if (i3 == 2) {
                        Context context = a1b0Var.getContext();
                        if (context != null && (activity = a1b0Var.getActivity()) != null && !a1b0Var.isRemoving()) {
                            x3b0 x3b0Var = a1b0Var.O;
                            if (x3b0Var != null) {
                                x3b0Var.a(false);
                            }
                            x3b0 x3b0Var2 = a1b0Var.O;
                            if (x3b0Var2 != null) {
                                x3b0Var2.dismiss();
                            }
                            nya0 nya0Var = nya0.e;
                            a1b0Var.z0();
                            jcg.d(nya0Var, activity, "Spin2Win", loadingState.getError(), new Function0() { // from class: a0b0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    a1b0Var.H0(true);
                                    return Unit.a;
                                }
                            }, new b0b0(), new c0b0(), 0, context.getColor(R.color.try_again_color), new d0b0(), new e0b0(), null, new lqa(a1b0Var, i4), null, 94592);
                        }
                    } else {
                        if (i3 != 3) {
                            uhc.a();
                            return null;
                        }
                        x3b0 x3b0Var3 = a1b0Var.O;
                        if (x3b0Var3 != null) {
                            x3b0Var3.a(true);
                        }
                    }
                } else {
                    x3b0 x3b0Var4 = a1b0Var.O;
                    if (x3b0Var4 != null) {
                        x3b0Var4.a(false);
                    }
                    x3b0 x3b0Var5 = a1b0Var.O;
                    if (x3b0Var5 != null) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null && (recentWinsResponse = (RecentWinsResponse) hTTPResponse.getData()) != null) {
                            data = recentWinsResponse.getData();
                        }
                        x3b0Var5.b(a1b0.I0(data));
                    }
                }
                return Unit.a;
        }
    }
}
