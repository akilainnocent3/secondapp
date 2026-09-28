package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gii implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gii(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ebi.h.a);
                return Unit.a;
            default:
                zzr zzrVar = (zzr) obj;
                zyr zyrVar = (zyr) CollectionsKt.d0(zzrVar.j().k());
                boolean z = false;
                if (zyrVar != null && zyrVar.getIndex() == zzrVar.j().i() - 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
