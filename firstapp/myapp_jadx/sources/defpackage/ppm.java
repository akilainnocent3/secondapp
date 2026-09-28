package defpackage;

import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ppm implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MediaType.INSTANCE.get("application/x-www-form-urlencoded; charset=utf-8");
    }
}
