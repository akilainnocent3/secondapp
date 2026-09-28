package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wv3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wv3(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke(((zv3) obj).c);
                break;
            default:
                nfc0.a aVar = (nfc0.a) obj;
                ((gaj) hajVar).invoke(aVar.a, aVar.b, aVar.c);
                break;
        }
        return Unit.a;
    }
}
