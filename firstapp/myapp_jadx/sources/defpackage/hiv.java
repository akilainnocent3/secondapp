package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class hiv extends qlr implements Function1<Context, iiv> {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiv(Context context) {
        super(1);
        this.a = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final iiv invoke(Context context) {
        context.getClass();
        return new iiv(this.a);
    }
}
