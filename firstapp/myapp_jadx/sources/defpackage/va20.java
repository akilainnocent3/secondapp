package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class va20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                int i2 = PreMatchEventActivity.a2;
                if (bi50Var == null) {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__failed_to_send_please_try_again, new Object[0]));
                } else if (!bi50Var.a.getIsSuccessful() || bi50Var.b == 0) {
                    ResponseBody responseBody = bi50Var.c;
                    if (responseBody != null) {
                        zyf0.d(ui8.c(responseBody));
                    }
                } else {
                    s88 s88Var = preMatchEventActivity.G0;
                    if (s88Var != null) {
                        int i3 = preMatchEventActivity.G1;
                        ArrayList arrayList = s88Var.C;
                        CommentsData commentsData = null;
                        if (i3 >= 0 && i3 < arrayList.size() && (arrayList.get(i3) instanceof m88)) {
                            Object obj3 = arrayList.get(i3);
                            obj3.getClass();
                            commentsData = ((m88) obj3).c;
                        }
                        if (commentsData != null && !commentsData.getLikedByMe()) {
                            commentsData.setLikeCount(commentsData.getLikedCount() + 1);
                            commentsData.setLikedByMe(true);
                            s88Var.j(i3);
                        }
                        s88Var.notifyDataSetChanged();
                    }
                }
                break;
            default:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    function1.invoke(str);
                } else {
                    for (int i4 = 0; i4 < str.length(); i4++) {
                        if (Character.isDigit(str.charAt(i4))) {
                        }
                    }
                    function1.invoke(str);
                }
                break;
        }
        return Unit.a;
    }
}
