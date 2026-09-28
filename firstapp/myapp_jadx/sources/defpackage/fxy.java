package defpackage;

import com.sportygames.compose.chat.data.api.NickNameInterface;
import com.sportygames.compose.chat.data.model.HTTPResponse;
import com.sportygames.compose.chat.data.model.NickNameResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.OnlineCountRepository$setNickName$2", f = "OnlineCountRepository.kt", l = {30}, m = "invokeSuspend", v = 1)
public final class fxy extends tje0 implements Function1<v1b<? super HTTPResponse<NickNameResponse>>, Object> {
    public int a;
    public final /* synthetic */ hxy b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxy(hxy hxyVar, String str, v1b<? super fxy> v1bVar) {
        super(1, v1bVar);
        this.b = hxyVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new fxy(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<NickNameResponse>> v1bVar) {
        return ((fxy) create(v1bVar)).invokeSuspend(Unit.a);
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
        NickNameInterface nickNameInterface = this.b.c;
        this.a = 1;
        Object nickName = nickNameInterface.setNickName(this.c, this);
        return nickName == y5bVar ? y5bVar : nickName;
    }
}
