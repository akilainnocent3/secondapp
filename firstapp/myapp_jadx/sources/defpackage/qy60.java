package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class qy60 implements y2b {
    public static final qy60 a = new qy60();
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return Integer.valueOf(((ResponseBody) obj).string());
    }
}
