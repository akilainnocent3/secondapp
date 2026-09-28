package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hmt extends qlr implements Function1<Long, Boolean> {
    public final /* synthetic */ jmt a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmt(jmt jmtVar, int i) {
        super(1);
        this.a = jmtVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l) {
        return Boolean.valueOf(this.a.b(this.b, l.longValue()));
    }
}
