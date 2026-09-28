package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class waf implements Function0 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ abf b;

    public /* synthetic */ waf(Integer num, abf abfVar) {
        this.a = num;
        this.b = abfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.a.equals(((x5a0) this.b.e).getValue()));
    }
}
