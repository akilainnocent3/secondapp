package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class ty60 implements y2b {
    public static final ty60 a = new ty60();
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return ((ResponseBody) obj).string();
    }
}
