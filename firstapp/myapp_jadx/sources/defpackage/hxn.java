package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hxn implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                yw90 yw90Var = (yw90) obj;
                return new jj0(Float.intBitsToFloat((int) (yw90Var.a >> 32)), Float.intBitsToFloat((int) (yw90Var.a & 4294967295L)));
        }
    }
}
