package defpackage;

import com.sportygames.chat.remote.models.AddGroupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.repositories.ChatRepository$addGroup$2", f = "ChatRepository.kt", l = {20}, m = "invokeSuspend", v = 1)
public final class mc7 extends tje0 implements Function1<v1b<? super AddGroupResponse>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc7(String str, String str2, v1b<? super mc7> v1bVar) {
        super(1, v1bVar);
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new mc7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super AddGroupResponse> v1bVar) {
        return ((mc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objB = ka7VarD.b(this.b, this.c, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
