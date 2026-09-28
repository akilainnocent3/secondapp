package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class py60 implements y2b {
    public static final py60 a = new py60();
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return Float.valueOf(((ResponseBody) obj).string());
    }
}
