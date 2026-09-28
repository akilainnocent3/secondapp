package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportygames.chat.remote.models.NickNameResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.chat.repositories.OnlineCountRepository$setNickName$2", f = "OnlineCountRepository.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 1)
public final class gxy extends tje0 implements Function1<v1b<? super HTTPResponse<NickNameResponse>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxy(String str, v1b<? super gxy> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new gxy(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<NickNameResponse>> v1bVar) {
        return ((gxy) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object value = on0.j.getValue();
        value.getClass();
        this.a = 1;
        Object nickName = ((ksx) value).setNickName(this.b, this);
        return nickName == y5bVar ? y5bVar : nickName;
    }
}
