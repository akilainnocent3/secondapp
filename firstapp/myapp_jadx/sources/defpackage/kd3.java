package defpackage;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kd3 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ kd3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new LinkedHashSet();
            default:
                return (psm) hwr.b(new c8b(0)).getValue();
        }
    }
}
