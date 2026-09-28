package defpackage;

import com.sporty.android.book.domain.entity.Tournament;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jt6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((Tournament) obj).getId());
                break;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                CommentsData commentsData = (CommentsData) obj;
                String userNickname = commentsData.getUserNickname();
                int id = commentsData.getId();
                String userId = commentsData.getUserId();
                int i2 = PreMatchEventActivity.a2;
                preMatchEventActivity.g2(id, userNickname, c.l(userId, preMatchEventActivity.getAccountHelper().getUserId(), true));
                break;
        }
        return Unit.a;
    }
}
