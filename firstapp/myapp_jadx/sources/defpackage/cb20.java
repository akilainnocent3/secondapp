package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                s88 s88Var = preMatchEventActivity.G0;
                if (s88Var != null) {
                    if (bi50Var != null) {
                        T t = bi50Var.b;
                        if (bi50Var.a.getIsSuccessful() && t != 0) {
                            preMatchEventActivity.H1.clear();
                            PostCommentResponse postCommentResponse = (PostCommentResponse) t;
                            ArrayList arrayList = new ArrayList();
                            List<CommentsData> data = postCommentResponse.getData();
                            if (!data.isEmpty()) {
                                Iterator<CommentsData> it = data.iterator();
                                while (it.hasNext()) {
                                    m88 m88Var = new m88(it.next());
                                    m88Var.a = postCommentResponse.getFlag();
                                    m88Var.b = postCommentResponse.getHasNextPage();
                                    arrayList.add(m88Var);
                                }
                            }
                            s88Var.F = arrayList;
                            s88Var.p(true);
                        }
                    }
                    s88Var.p(false);
                    break;
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((a1b0) obj2).t0(str);
                break;
        }
        return Unit.a;
    }
}
