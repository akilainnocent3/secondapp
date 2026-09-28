package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wjb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj;
                enb.D0(enbVar);
                ((x5a0) enbVar.L).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                ((x6p) obj).invoke(zxk.a.a);
                return Unit.a;
            default:
                return ((fjf0) obj).a();
        }
    }
}
