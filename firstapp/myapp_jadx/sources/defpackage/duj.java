package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class duj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ duj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ssw<String> sswVar = ((fuj) obj2).c;
                String str = f1e0Var.c;
                if (str == null) {
                    str = "";
                }
                sswVar.j(str);
                break;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                HashMap<Integer, Integer> map = preMatchEventActivity.H1;
                bi50 bi50Var = (bi50) obj;
                int i2 = PreMatchEventActivity.a2;
                if (bi50Var != null) {
                    List<CommentsData> list = (List) bi50Var.b;
                    if (!bi50Var.a.getIsSuccessful() || list == null) {
                        ResponseBody responseBody = bi50Var.c;
                        if (responseBody != null) {
                            zyf0.d(ui8.c(responseBody));
                        }
                    } else if (preMatchEventActivity.G0 != null && (recyclerView = preMatchEventActivity.U) != null) {
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null) {
                            View viewF = linearLayoutManager.F(preMatchEventActivity.G1);
                            CommentsData commentsData = (CommentsData) CollectionsKt.V(0, list);
                            if (list.size() >= 10 && commentsData != null) {
                                Integer parentId = commentsData.getParentId();
                                int iIntValue = parentId != null ? parentId.intValue() : 0;
                                Integer numValueOf = Integer.valueOf(iIntValue);
                                Integer num = map.get(Integer.valueOf(iIntValue));
                                map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 1) + 1));
                            }
                            if (viewF != null) {
                                ((ReplyPanel) viewF.findViewById(R.id.reply_container)).setDataAndUpdate(list);
                            }
                        }
                    }
                } else {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__failed_to_send_please_try_again, new Object[0]));
                }
                break;
        }
        return Unit.a;
    }
}
