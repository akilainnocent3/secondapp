package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p8b implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                map.putAll(q8b.d.c);
                map.putAll(q8b.f);
                return map;
            default:
                return Unit.a;
        }
    }
}
