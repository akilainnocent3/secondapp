package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h84 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h84(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yfx yfxVar = (yfx) obj;
                if (((j84) obj2).isAdded()) {
                    yfxVar.k();
                }
                return Unit.a;
            default:
                zzr zzrVar = (zzr) obj2;
                v5b v5bVar = (v5b) obj;
                if (zzrVar.d()) {
                    ej5.c(v5bVar, null, null, new myc(zzrVar, null), 3);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
