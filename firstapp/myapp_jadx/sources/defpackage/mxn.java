package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mxn implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                return iIntValue == -1 ? "(\\d+)" : String.valueOf(iIntValue);
            default:
                long j = ((iwo) obj).a;
                return new jj0((int) (j >> 32), (int) (j & 4294967295L));
        }
    }
}
