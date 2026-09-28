package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a60 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(Context context, b60 b60Var) {
        super(1);
        this.a = context;
        this.b = b60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        b60 b60Var = this.b;
        applicationContext.registerComponentCallbacks(b60Var);
        return new z50(context, b60Var);
    }
}
