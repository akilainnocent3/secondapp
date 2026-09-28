package defpackage;

import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rm4 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ rm4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new fi7((srm) qn70Var.a(jq40.a(srm.class), null, null));
            default:
                zzr zzrVar = (zzr) obj2;
                return b.k(Integer.valueOf(zzrVar.h()), Integer.valueOf(zzrVar.i()));
        }
    }
}
