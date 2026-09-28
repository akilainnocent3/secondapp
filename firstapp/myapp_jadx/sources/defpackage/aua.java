package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aua implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aua(Object obj, Function0 function0, Function0 function1, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                bua.a(iA, (a) obj, (String) obj3, function1, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                att.f((l6f) obj3, function1, function0, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
