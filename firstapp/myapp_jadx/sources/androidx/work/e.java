package androidx.work;

import defpackage.qlr;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends qlr implements Function0<d.a> {
    public final /* synthetic */ Worker a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Worker worker) {
        super(0);
        this.a = worker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final d.a invoke() {
        return this.a.c();
    }
}
