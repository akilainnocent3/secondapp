package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i3c extends qlr implements Function1<Object, Boolean> {
    public final /* synthetic */ dtg0<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3c(dtg0<Object> dtg0Var) {
        super(1);
        this.a = dtg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!Intrinsics.g(obj, ((x5a0) this.a.d).getValue()));
    }
}
