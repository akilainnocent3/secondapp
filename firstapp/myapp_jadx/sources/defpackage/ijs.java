package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.MsgType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.adapter.MyFavoriteAdapter;
import com.sportybet.plugin.myfavorite.widget.TeamSearchEmptyLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ijs implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ijs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kjs kjsVar = (kjs) obj2;
                DefaultCommand defaultCommand = (DefaultCommand) obj;
                defaultCommand.getClass();
                itf0.a aVar = itf0.a;
                aVar.q("SPORTY_CHAT");
                aVar.l("receive socket command, type: %d, jsonBody: %s", Integer.valueOf(defaultCommand.getMsgType()), defaultCommand.getJsonBody());
                if (defaultCommand.getMsgType() == MsgType.TEXT.getType()) {
                    mpe0 mpe0Var = ljs.a;
                    ChatMessage chatMessageE = ljs.e(defaultCommand.getJsonBody());
                    if (chatMessageE != null) {
                        vd7 vd7Var = kjsVar.a;
                        aVar.q("SPORTY_CHAT");
                        aVar.a("onChatMessage from socket: " + chatMessageE, new Object[0]);
                        be7 be7VarM0 = vd7Var.a.m0();
                        be7VarM0.x1(be7VarM0.z1(b.l(chatMessageE), true), false);
                    }
                }
                break;
            default:
                d2x d2xVar = (d2x) obj2;
                hqc hqcVar = (hqc) obj;
                if (hqcVar instanceof nqc) {
                    h2x h2xVar = (h2x) ((nqc) hqcVar).a;
                    ArrayList arrayList = h2xVar.d;
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            rww rwwVar = (rww) obj3;
                            if (rwwVar.g == null) {
                                rwwVar.g = d2xVar;
                            }
                        }
                    }
                    d2xVar.y.setList(arrayList);
                    if (!TextUtils.isEmpty(h2xVar.f)) {
                        TeamSearchEmptyLayout teamSearchEmptyLayout = (TeamSearchEmptyLayout) LayoutInflater.from(d2xVar.getContext()).inflate(R.layout.my_team_search_empty_layout, (ViewGroup) null, false);
                        teamSearchEmptyLayout.setText(sn5.d(d2xVar, R.string.common_feedback__no_results_found, new Object[0]));
                        d2xVar.y.setEmptyView(teamSearchEmptyLayout);
                    } else {
                        d2xVar.y.setEmptyView((ConstraintLayout) LayoutInflater.from(d2xVar.getContext()).inflate(R.layout.white_space_layout, (ViewGroup) null, false));
                    }
                    break;
                } else if (!(hqcVar instanceof lqc)) {
                    boolean z = hqcVar instanceof kqc;
                    MyFavoriteAdapter myFavoriteAdapter = d2xVar.y;
                    if (!z) {
                        List<rww> data = myFavoriteAdapter.getData();
                        data.clear();
                        d2xVar.y.setList(data);
                        zyf0.a(R.string.common_feedback__sorry_something_went_wrong);
                    } else {
                        List<rww> data2 = myFavoriteAdapter.getData();
                        data2.clear();
                        d2xVar.y.setList(data2);
                        zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                    }
                    break;
                }
                break;
        }
    }
}
