package defpackage;

import com.google.gson.reflect.TypeToken;
import com.google.protobuf.DescriptorProtos;
import com.sportygames.compose.chat.data.model.ChatErrorResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.BaseRepository$safeApiCallChat$2", f = "BaseRepository.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class g52 extends tje0 implements Function2<v5b, v1b<? super jj50<Object>>, Object> {
    public int a;
    public final /* synthetic */ Function1<v1b<Object>, Object> b;
    public final /* synthetic */ j52 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g52(j52 j52Var, v1b v1bVar, Function1 function1) {
        super(2, v1bVar);
        this.b = function1;
        this.c = j52Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g52(this.c, v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super jj50<Object>> v1bVar) {
        return ((g52) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            return new jj50.c(obj);
        } catch (Throwable th) {
            if (th instanceof IOException) {
                return jj50.b.a;
            }
            if (!(th instanceof tom)) {
                return new jj50.a(null, null);
            }
            tom tomVar = th;
            try {
                eal ealVar = new eal();
                Type type = new y42().getType();
                bi50<?> bi50Var = tomVar.c;
                ResponseBody responseBody = bi50Var != null ? bi50Var.c : null;
                responseBody.getClass();
                chatErrorResponse = (ChatErrorResponse) ealVar.d(responseBody.charStream(), TypeToken.get(type));
            } catch (Exception unused) {
            }
            return new jj50.a(new Integer(tomVar.a), chatErrorResponse);
        }
    }
}
