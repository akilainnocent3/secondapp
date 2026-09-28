package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vff0 implements Function1 {
    public final /* synthetic */ osf a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ dq40 c;

    public /* synthetic */ vff0(osf osfVar, l6s l6sVar, dq40 dq40Var) {
        this.a = osfVar;
        this.b = l6sVar;
        this.c = dq40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dkf0 dkf0Var = (dkf0) this.c.a;
        ijf0 ijf0VarA = this.a.a((List) obj);
        if (dkf0Var != null) {
            dkf0Var.a(null, ijf0VarA);
        }
        this.b.invoke(ijf0VarA);
        return Unit.a;
    }
}
