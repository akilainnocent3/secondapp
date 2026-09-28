package defpackage;

import com.sporty.android.core.model.realsports.StakeConfig;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o3j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o3j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj;
                r750.d(n2jVar.t0(), new p3j(n2jVar, 0));
                return Unit.a;
            default:
                return (StakeConfig) dj5.a(e.a, new jrd0.b((jrd0) obj, null));
        }
    }
}
