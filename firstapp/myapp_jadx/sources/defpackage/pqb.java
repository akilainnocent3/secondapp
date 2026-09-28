package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.ChatRoomResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.repository.CrashRepository$getChatRoom$2", f = "CrashRepository.kt", l = {63}, m = "invokeSuspend", v = 1)
public final class pqb extends tje0 implements Function1<v1b<? super HTTPResponse<ChatRoomResponse>>, Object> {
    public int a;
    public final /* synthetic */ zqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqb(zqb zqbVar, v1b<? super pqb> v1bVar) {
        super(1, v1bVar);
        this.b = zqbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new pqb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<ChatRoomResponse>> v1bVar) {
        return ((pqb) create(v1bVar)).invokeSuspend(Unit.a);
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
        dpb dpbVarA = this.b.a.a();
        this.a = 1;
        Object chatRoom = dpbVarA.getChatRoom(this);
        return chatRoom == y5bVar ? y5bVar : chatRoom;
    }
}
