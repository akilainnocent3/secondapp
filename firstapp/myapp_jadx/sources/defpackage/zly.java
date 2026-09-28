package defpackage;

import kotlin.jvm.functions.Function1;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zly implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zly(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Response response = (Response) obj;
                response.getClass();
                return response.priorResponse();
            default:
                obj.getClass();
                return new t9i(((Integer) obj).intValue());
        }
    }
}
