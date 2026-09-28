package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class sy60 implements y2b<ResponseBody, Short> {
    public static final sy60 a = new sy60();

    @Override // defpackage.y2b
    public final Short convert(ResponseBody responseBody) {
        return Short.valueOf(responseBody.string());
    }
}
