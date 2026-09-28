package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x50 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ y50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(Context context, y50 y50Var) {
        super(1);
        this.a = context;
        this.b = y50Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        y50 y50Var = this.b;
        applicationContext.registerComponentCallbacks(y50Var);
        return new w50(context, y50Var);
    }
}
