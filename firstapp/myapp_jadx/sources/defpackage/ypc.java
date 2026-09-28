package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class ypc extends qlr implements Function0<wqz<Object, Object>> {
    public final /* synthetic */ k5b a;
    public final /* synthetic */ aqc.d<Object, Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypc(k5b k5bVar, aqc.d<Object, Object> dVar) {
        super(0);
        this.a = k5bVar;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final wqz<Object, Object> invoke() {
        return new u5s(this.a, this.b.a());
    }
}
