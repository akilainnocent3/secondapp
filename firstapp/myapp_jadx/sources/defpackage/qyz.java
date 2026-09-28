package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.BindNewPhoneApiResult;
import com.sporty.android.core.model.patron.BindNewPhoneRequest;
import com.sporty.android.core.model.patron.UserPhone;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$bindNewPhone$2", f = "PatronRepositoryImpl.kt", l = {585}, m = "invokeSuspend", v = 2)
public final class qyz extends tje0 implements Function2<v5b, v1b<? super BindNewPhoneApiResult>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nyz d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyz(String str, nyz nyzVar, String str2, String str3, String str4, String str5, v1b<? super qyz> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = nyzVar;
        this.e = str2;
        this.f = str3;
        this.i = str4;
        this.v = str5;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qyz(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BindNewPhoneApiResult> v1bVar) {
        return ((qyz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final String str;
        y5b y5bVar = y5b.a;
        int i = this.b;
        nyz nyzVar = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                String strSubstring = this.c;
                if (c.u(strSubstring, "0", false)) {
                    strSubstring = strSubstring.substring(1);
                }
                String str2 = strSubstring;
                xxz xxzVar = nyzVar.a;
                BindNewPhoneRequest bindNewPhoneRequest = new BindNewPhoneRequest(str2, this.e, this.f, this.i, this.v);
                this.a = str2;
                this.b = 1;
                obj = xxzVar.s1(bindNewPhoneRequest, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                str = str2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.a;
                uj50.b(obj);
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            BindNewPhoneApiResult bindNewPhoneApiResultI0 = nyz.I0(new Integer(baseResponse.bizCode), baseResponse.message);
            if (Intrinsics.g(bindNewPhoneApiResultI0, BindNewPhoneApiResult.Success.INSTANCE)) {
                wwd0 wwd0Var = nyzVar.v;
                lk50 lk50Var = (lk50) wwd0Var.getValue();
                final String str3 = this.e;
                wwd0Var.setValue(bm50.l(lk50Var, new Function1() { // from class: pyz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CollectionsKt.j0((List) obj2, new UserPhone(str, str3, false, false));
                    }
                }));
            }
            return bindNewPhoneApiResultI0;
        } catch (Throwable th) {
            itf0.a.e(th);
            return new BindNewPhoneApiResult.UnknownError(null);
        }
    }
}
