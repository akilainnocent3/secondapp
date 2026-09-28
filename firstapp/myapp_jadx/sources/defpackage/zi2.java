package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zi2 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        fj2 fj2Var = (fj2) this.receiver;
        return Boolean.valueOf(((List) fj2Var.z.getValue()).size() >= ((Number) fj2Var.A.getValue()).intValue());
    }
}
