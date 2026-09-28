package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a18 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a18(int i, haj hajVar, Object obj) {
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
                ((ytw) obj).setValue(Boolean.FALSE);
                ((Function0) hajVar).invoke();
                break;
            default:
                ((Function1) hajVar).invoke(new njz.a(((dlz) obj).a));
                break;
        }
        return Unit.a;
    }
}
