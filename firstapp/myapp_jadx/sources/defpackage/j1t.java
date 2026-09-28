package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository$downloadSessionCards$2", f = "LobbyRepository.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class j1t extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends cw50>>>, Object> {
    public int a;
    public final /* synthetic */ v1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1t(v1t v1tVar, v1b<? super j1t> v1bVar) {
        super(1, v1bVar);
        this.b = v1tVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new j1t(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends cw50>>> v1bVar) {
        return ((j1t) create(v1bVar)).invokeSuspend(Unit.a);
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
        iu00 iu00Var = (iu00) this.b.o.getValue();
        this.a = 1;
        Object objD = iu00Var.d(this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
