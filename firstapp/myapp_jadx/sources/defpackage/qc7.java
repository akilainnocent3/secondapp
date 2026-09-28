package defpackage;

import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.repositories.ChatRepository$getRainClaimInfo$2", f = "ChatRepository.kt", l = {75}, m = "invokeSuspend", v = 1)
public final class qc7 extends tje0 implements Function1<v1b<? super HTTPResponse<RainClaimInfoResponse>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc7(String str, v1b<? super qc7> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new qc7(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<RainClaimInfoResponse>> v1bVar) {
        return ((qc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object value = on0.l.getValue();
        value.getClass();
        this.a = 1;
        Object objA = ((pv30) value).a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
