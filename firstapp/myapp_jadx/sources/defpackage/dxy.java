package defpackage;

import com.sportygames.compose.chat.data.api.OnlineCountInterface;
import com.sportygames.compose.chat.data.model.HTTPResponse;
import com.sportygames.compose.chat.data.model.OnlineCountResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.OnlineCountRepository$getOnlineCount$2", f = "OnlineCountRepository.kt", l = {20}, m = "invokeSuspend", v = 1)
public final class dxy extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends OnlineCountResponse>>>, Object> {
    public int a;
    public final /* synthetic */ hxy b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxy(hxy hxyVar, String str, v1b<? super dxy> v1bVar) {
        super(1, v1bVar);
        this.b = hxyVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new dxy(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends OnlineCountResponse>>> v1bVar) {
        return ((dxy) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        OnlineCountInterface onlineCountInterface = this.b.b;
        this.a = 1;
        Object onlineCount = onlineCountInterface.getOnlineCount(this.c, this);
        return onlineCount == y5bVar ? y5bVar : onlineCount;
    }
}
