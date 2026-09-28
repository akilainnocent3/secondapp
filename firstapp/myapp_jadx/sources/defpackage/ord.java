package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ord implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ord(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wrd wrdVar = (wrd) obj;
                iod.a aVar = wrdVar.I;
                w9e w9eVar = wrdVar.H;
                aVar.getClass();
                w9eVar.getClass();
                return new iod(aVar.a, aVar.b, w9eVar);
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
