package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dcb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dcb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                throw new IllegalStateException("No Radius provided");
        }
    }
}
