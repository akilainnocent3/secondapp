package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.compose.chat.data.model.ChatListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.ChatRepository$getChatHistory$2", f = "ChatRepository.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class nc7 extends tje0 implements Function1<v1b<? super List<? extends ChatListResponse>>, Object> {
    public int a;
    public final /* synthetic */ wc7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc7(wc7 wc7Var, String str, String str2, v1b v1bVar) {
        super(1, v1bVar);
        this.b = wc7Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new nc7(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super List<? extends ChatListResponse>> v1bVar) {
        return ((nc7) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objC = hc7Var.c(this.c, this.d, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
