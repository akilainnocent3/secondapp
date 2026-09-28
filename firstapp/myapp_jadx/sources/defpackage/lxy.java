package defpackage;

import com.sportygames.compose.chat.data.model.HTTPResponse;
import com.sportygames.compose.chat.data.model.NickNameResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.OnlineCountViewModel$getNickName$1", f = "OnlineCountViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class lxy extends tje0 implements Function2<jk50<? extends HTTPResponse<NickNameResponse>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pxy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxy(pxy pxyVar, v1b<? super lxy> v1bVar) {
        super(2, v1bVar);
        this.b = pxyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lxy lxyVar = new lxy(this.b, v1bVar);
        lxyVar.a = obj;
        return lxyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jk50<? extends HTTPResponse<NickNameResponse>> jk50Var, v1b<? super Unit> v1bVar) {
        return ((lxy) create(jk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String message;
        jk50 jk50Var = (jk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = jk50Var instanceof jk50.c;
        pxy pxyVar = this.b;
        if (z) {
            wwd0 wwd0Var = pxyVar.f;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            wwd0 wwd0Var2 = pxyVar.v;
            Boolean bool2 = Boolean.FALSE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool2);
        } else if (jk50Var instanceof jk50.a) {
            HTTPResponse<Object> hTTPResponse = ((jk50.a) jk50Var).b;
            Integer bizCode = hTTPResponse != null ? hTTPResponse.getBizCode() : null;
            if (bizCode != null && bizCode.intValue() == 10000) {
                wwd0 wwd0Var3 = pxyVar.f;
                Boolean bool3 = Boolean.TRUE;
                wwd0Var3.getClass();
                wwd0Var3.k(null, bool3);
            } else {
                wwd0 wwd0Var4 = pxyVar.y;
                if ((bizCode != null && bizCode.intValue() == 11011) || (bizCode != null && bizCode.intValue() == 11000)) {
                    message = hTTPResponse.getMessage();
                    if (message == null) {
                        message = "";
                    }
                } else {
                    message = "Error setting nickname";
                }
                wwd0Var4.getClass();
                wwd0Var4.k(null, message);
                wwd0 wwd0Var5 = pxyVar.v;
                Boolean bool4 = Boolean.TRUE;
                wwd0Var5.getClass();
                wwd0Var5.k(null, bool4);
            }
        } else if (!Intrinsics.g(jk50Var, jk50.b.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
