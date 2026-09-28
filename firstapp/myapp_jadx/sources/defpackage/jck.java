package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jck implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ jck(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                throw new IllegalStateException("KoinApplication has not been started");
            default:
                return new xu5(new OkHttpClient());
        }
    }
}
