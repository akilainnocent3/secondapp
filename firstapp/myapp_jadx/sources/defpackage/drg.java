package defpackage;

import com.appsflyer.internal.h;

/* JADX INFO: loaded from: classes4.dex */
public final class drg extends Throwable {
    public final String a;

    public drg(int i, String str) {
        str.getClass();
        this.a = str;
        String strA = h.a(i, "API error from backend \nbizCode: ", " \nerrMsg: ", str, " \n");
        itf0.a aVar = itf0.a;
        aVar.q("EventStatusThrowable");
        aVar.a(strA, new Object[0]);
    }
}
