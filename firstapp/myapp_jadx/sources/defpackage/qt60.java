package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o2g.a.getClass();
                Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                ((rt60) obj).b.b(bundleA);
                if (bundleA.isEmpty()) {
                    return null;
                }
                return bundleA;
            default:
                ((Function1) obj).invoke(qve0.i.a);
                return Unit.a;
        }
    }
}
