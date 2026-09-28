package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class wje implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ wje(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ike.e((gmj) obj3, (omd0) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wdj.b((awz) obj3, (Function1) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
