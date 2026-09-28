package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nmt extends qlr implements Function0<Float> {
    public final /* synthetic */ qmt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmt(fmt fmtVar) {
        super(0);
        this.a = fmtVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.a.getValue().floatValue());
    }
}
