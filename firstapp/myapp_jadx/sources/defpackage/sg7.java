package defpackage;

import com.sportygames.compose.chat.data.model.ChatListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sg7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChatListResponse chatListResponse;
        tcp tcpVarJ;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xg7 xg7Var = (xg7) obj2;
                xdp xdpVarD = qva.c(((f1e0) obj).c).d();
                try {
                    if (xdpVarD.a.containsKey("data")) {
                        tcp tcpVarJ2 = xdpVarD.j("data");
                        tcpVarJ2.getClass();
                        if (tcpVarJ2 instanceof xdp) {
                            xdpVarD = xdpVarD.k("data");
                        }
                    }
                    if (xdpVarD.a.containsKey("jsonBody") && (tcpVarJ = xdpVarD.j("jsonBody")) != null && !(tcpVarJ instanceof tdp) && (!(tcpVarJ instanceof cep) || !(tcpVarJ.e().a instanceof String))) {
                        xdpVarD.i("jsonBody", tcpVarJ.toString());
                    }
                    chatListResponse = (ChatListResponse) xg7Var.i.b(xdpVarD, ChatListResponse.class);
                } catch (Exception unused) {
                    chatListResponse = null;
                }
                if (chatListResponse != null) {
                    xg7Var.getClass();
                    try {
                        String jsonBody = chatListResponse.getJsonBody();
                        if (!StringsKt.U(jsonBody)) {
                            JSONObject jSONObject = new JSONObject(jsonBody);
                            if (jSONObject.has("jsonBody")) {
                                String strOptString = jSONObject.optString("jsonBody");
                                strOptString.getClass();
                                if (c.u(strOptString, "{", false)) {
                                    jSONObject = new JSONObject(strOptString);
                                }
                            }
                            if (jSONObject.has("text") || jSONObject.has("json") || jSONObject.has("gif")) {
                                ej5.c(o8i0.d(xg7Var), null, null, new wg7(xg7Var, chatListResponse, null), 3);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                break;
            case 1:
                fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                fgbVar.o1 = str;
                ((x5a0) fgbVar.k1).setValue(Boolean.TRUE);
                break;
            default:
                ((snp) obj).getClass();
                ((k4i) obj2).t(false);
                break;
        }
        return Unit.a;
    }
}
