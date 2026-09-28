package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c7d implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gfx gfxVar = (gfx) obj;
                gfxVar.getClass();
                gfxVar.a.a = djx.o;
                return Unit.a;
            default:
                return new qfw((Throwable) obj);
        }
    }
}
