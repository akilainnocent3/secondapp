package defpackage;

import com.sportygames.chat.remote.models.SendMessageResponse;
import com.sportygames.commons.chat.remote.models.SendMessageRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.repositories.ChatRepository$sendMessage$2", f = "ChatRepository.kt", l = {59}, m = "invokeSuspend", v = 1)
public final class vc7 extends tje0 implements Function1<v1b<? super SendMessageResponse>, Object> {
    public int a;
    public final /* synthetic */ SendMessageRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc7(SendMessageRequest sendMessageRequest, v1b<? super vc7> v1bVar) {
        super(1, v1bVar);
        this.b = sendMessageRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vc7(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super SendMessageResponse> v1bVar) {
        return ((vc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        ka7 ka7VarD = on0.d();
        this.a = 1;
        Object objD = ka7VarD.d(this.b, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
