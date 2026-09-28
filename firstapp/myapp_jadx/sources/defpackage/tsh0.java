package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class tsh0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(xnx xnxVar, x1b x1bVar) {
        nsh0 nsh0Var;
        lb5 lb5Var;
        if (x1bVar instanceof nsh0) {
            nsh0Var = (nsh0) x1bVar;
            int i = nsh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsh0Var.c = i - Integer.MIN_VALUE;
            } else {
                nsh0Var = new nsh0(x1bVar);
            }
        } else {
            nsh0Var = new nsh0(x1bVar);
        }
        Object obj = nsh0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = nsh0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            lb5 lb5Var2 = new lb5();
            nsh0Var.a = lb5Var2;
            nsh0Var.c = 1;
            if (xnxVar.a() == y5bVar) {
                return y5bVar;
            }
            lb5Var = lb5Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lb5Var = nsh0Var.a;
            uj50.b(obj);
        }
        return lb5Var.B0(lb5Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final iox b(Response response) {
        cc5 d;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        Headers headers = response.headers();
        anx.a aVar = new anx.a();
        for (Pair<? extends String, ? extends String> pair : headers) {
            aVar.a((String) pair.a, (String) pair.b);
        }
        anx anxVar = new anx(kpu.l(aVar.a));
        ResponseBody responseBodyBody = response.body();
        return new iox(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, anxVar, (responseBodyBody == null || (d = responseBodyBody.getD()) == null) ? null : new iqa0(d), response);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[LOOP:1: B:30:0x00a5->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(wnx wnxVar, x1b x1bVar) {
        psh0 psh0Var;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        wnx wnxVar2;
        String str2;
        Headers.Builder builder4;
        String key;
        Iterator<String> it;
        if (x1bVar instanceof psh0) {
            psh0Var = (psh0) x1bVar;
            int i = psh0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                psh0Var.f = i - Integer.MIN_VALUE;
            } else {
                psh0Var = new psh0(x1bVar);
            }
        } else {
            psh0Var = new psh0(x1bVar);
        }
        Object obj = psh0Var.e;
        y5b y5bVar = y5b.a;
        int i2 = psh0Var.f;
        RequestBody requestBodyCreate$default = null;
        if (i2 == 0) {
            uj50.b(obj);
            builder = new Request.Builder();
            builder.url(wnxVar.a);
            String str3 = wnxVar.b;
            xnx xnxVar = wnxVar.d;
            if (xnxVar != null) {
                psh0Var.a = wnxVar;
                psh0Var.b = builder;
                psh0Var.c = builder;
                psh0Var.d = str3;
                psh0Var.f = 1;
                Object objA = a(xnxVar, psh0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                builder3 = builder;
                obj = objA;
                wnxVar2 = wnxVar;
                str2 = str3;
                builder2 = builder3;
            } else {
                str = str3;
                builder2 = builder;
            }
            String str4 = str;
            wnxVar2 = wnxVar;
            str2 = str4;
            builder3 = builder;
            builder3.method(str2, requestBodyCreate$default);
            anx anxVar = wnxVar2.c;
            builder4 = new Headers.Builder();
            for (Map.Entry<String, List<String>> entry : anxVar.a.entrySet()) {
                key = entry.getKey();
                it = entry.getValue().iterator();
                while (it.hasNext()) {
                    builder4.addUnsafeNonAscii(key, it.next());
                }
            }
            builder2.headers(builder4.build());
            return builder2.build();
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = psh0Var.d;
        builder3 = psh0Var.c;
        builder2 = psh0Var.b;
        wnxVar2 = psh0Var.a;
        uj50.b(obj);
        rl5 rl5Var = (rl5) obj;
        if (rl5Var != null) {
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, rl5Var, (MediaType) null, 1, (Object) null);
        } else {
            wnx wnxVar3 = wnxVar2;
            str = str2;
            wnxVar = wnxVar3;
            builder = builder3;
            String str5 = str;
            wnxVar2 = wnxVar;
            str2 = str5;
            builder3 = builder;
        }
        builder3.method(str2, requestBodyCreate$default);
        anx anxVar2 = wnxVar2.c;
        builder4 = new Headers.Builder();
        while (r6.hasNext()) {
            key = entry.getKey();
            it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder4.addUnsafeNonAscii(key, it.next());
            }
        }
        builder2.headers(builder4.build());
        return builder2.build();
    }
}
