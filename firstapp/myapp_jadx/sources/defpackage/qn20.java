package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qn20 extends qlr implements Function0<File> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ rn20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn20(Context context, rn20 rn20Var) {
        super(0);
        this.a = context;
        this.b = rn20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        Context context = this.a;
        context.getClass();
        return uqc.a(context, this.b.a.concat(".preferences_pb"));
    }
}
