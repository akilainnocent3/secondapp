package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lky implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ lky(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ohw(0);
            default:
                return Unit.a;
        }
    }
}
