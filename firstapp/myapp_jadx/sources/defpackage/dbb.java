package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dbb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dbb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgb) obj).M0();
                return Unit.a;
            case 1:
                return Float.valueOf(((fmt) obj).g());
            default:
                return Long.valueOf(((fhb0) obj).e.c("version_data_max_cache_time_in_minutes"));
        }
    }
}
