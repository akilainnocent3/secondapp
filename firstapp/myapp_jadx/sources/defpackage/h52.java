package defpackage;

import com.google.gson.reflect.TypeToken;
import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.ChatErrorResponse;
import com.sportygames.commons.remote.model.ResultChatWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.BaseRepository$safeApiCallChat$2", f = "BaseRepository.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class h52 extends tje0 implements Function2<v5b, v1b<? super ResultChatWrapper<Object>>, Object> {
    public int a;
    public final /* synthetic */ Function1<v1b<Object>, Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h52(Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super h52> v1bVar) {
        super(2, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h52(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ResultChatWrapper<Object>> v1bVar) {
        return ((h52) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ChatErrorResponse chatErrorResponse = null;
        try {
            if (i == 0) {
                uj50.b(obj);
                Function1<v1b<Object>, Object> function1 = this.b;
                this.a = 1;
                obj = function1.invoke(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new ResultChatWrapper.Success(obj);
        } catch (Throwable th) {
            if (th instanceof IOException) {
                return ResultChatWrapper.NetworkError.INSTANCE;
            }
            if (!(th instanceof tom)) {
                return new ResultChatWrapper.GenericError(null, null);
            }
            tom tomVar = th;
            try {
                eal ealVar = new eal();
                Type type = new x42().getType();
                bi50<?> bi50Var = tomVar.c;
                ResponseBody responseBody = bi50Var != null ? bi50Var.c : null;
                responseBody.getClass();
                chatErrorResponse = (ChatErrorResponse) ealVar.d(responseBody.charStream(), TypeToken.get(type));
            } catch (Exception unused) {
            }
            return new ResultChatWrapper.GenericError(new Integer(tomVar.a), chatErrorResponse);
        }
    }
}
