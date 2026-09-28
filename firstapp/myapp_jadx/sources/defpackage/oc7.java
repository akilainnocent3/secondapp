package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.repositories.ChatRepository$getChatHistory$2", f = "ChatRepository.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class oc7 extends tje0 implements Function1<v1b<? super List<? extends ChatListResponse>>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc7(String str, String str2, v1b v1bVar) {
        super(1, v1bVar);
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new oc7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super List<? extends ChatListResponse>> v1bVar) {
        return ((oc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objA = ka7VarD.a(this.b, this.c, "150", "1", "false", this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
