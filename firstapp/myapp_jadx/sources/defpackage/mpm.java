package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mpm implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mpm(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return MediaType.INSTANCE.get("application/json; charset=utf-8");
            default:
                return Unit.a;
        }
    }
}
