package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jm90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jm90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kzr kzrVarJ = ((zzr) obj).j();
                int i2 = kzrVarJ.i();
                zyr zyrVar = (zyr) CollectionsKt.d0(kzrVarJ.k());
                return Boolean.valueOf(i2 > 0 && i2 - ((zyrVar != null ? zyrVar.getIndex() : -1) + 1) <= 5);
            default:
                ((Function1) obj).invoke(s3d0.b.C1078b.a);
                return Unit.a;
        }
    }
}
