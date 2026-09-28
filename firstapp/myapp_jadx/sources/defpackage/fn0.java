package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fn0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fn0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpe0 mpe0Var = on0.a;
                on0.t();
                return (ksx) on0.s(on0.j(), true).a(ksx.class);
            default:
                return Unit.a;
        }
    }
}
