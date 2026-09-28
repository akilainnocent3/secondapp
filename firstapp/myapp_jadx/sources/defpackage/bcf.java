package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bcf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fcf b;

    public /* synthetic */ bcf(int i, fcf fcfVar) {
        this.a = i;
        this.b = fcfVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        Integer num = (Integer) ((x5a0) this.b.g).getValue();
        if (num == null) {
            z = false;
        } else {
            if (this.a == num.intValue()) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
