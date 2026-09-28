package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class lwj0 {
    public final Context a;
    public final k650 b;
    public final mpe0 c;

    public lwj0(Context context, k650 k650Var) {
        k650Var.getClass();
        this.a = context;
        this.b = k650Var;
        this.c = hwr.b(new Function0() { // from class: kwj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.a.b.c("android_clean_local_cached_event_interval"));
            }
        });
    }
}
