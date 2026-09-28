package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ryr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ryr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((uyr) obj).E.b());
            case 1:
                zzr zzrVar = (zzr) obj;
                return new mp70(zzrVar.j().k(), zzrVar.i.c(), zzrVar.h(), zzrVar.i());
            default:
                ((aeh0) obj).dismiss();
                return Unit.a;
        }
    }
}
