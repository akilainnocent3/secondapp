package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class my60 implements y2b<ResponseBody, Byte> {
    public static final my60 a = new my60();

    @Override // defpackage.y2b
    public final Byte convert(ResponseBody responseBody) {
        return Byte.valueOf(responseBody.string());
    }
}
