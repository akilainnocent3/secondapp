package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kb80 extends qlr implements Function1<List<Float>, Boolean> {
    public final /* synthetic */ tyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb80(tyr tyrVar) {
        super(1);
        this.a = tyrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<Float> list) {
        list.add((Float) this.a.invoke());
        return true;
    }
}
