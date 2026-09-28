package defpackage;

import com.sportygames.compose.chat.data.model.AddGroupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.ChatRepository$addGroup$2", f = "ChatRepository.kt", l = {24}, m = "invokeSuspend", v = 1)
public final class lc7 extends tje0 implements Function1<v1b<? super AddGroupResponse>, Object> {
    public int a;
    public final /* synthetic */ wc7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc7(wc7 wc7Var, String str, String str2, v1b<? super lc7> v1bVar) {
        super(1, v1bVar);
        this.b = wc7Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new lc7(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super AddGroupResponse> v1bVar) {
        return ((lc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        hc7 hc7Var = this.b.b;
        this.a = 1;
        Object objA = hc7Var.a(this.c, this.d, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
