package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kfx implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                cyb cybVar = (cyb) obj;
                cybVar.getClass();
                return new lfx.a(dv60.a(cybVar));
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.c0(1);
                return Unit.a;
        }
    }
}
