package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yt4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yt4(int i, d dVar, String str) {
        this.d = str;
        this.b = dVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        d dVar = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                cu4.d(dVar, (Function1) obj3, (a) obj, qj40.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = qj40.a(i2 | 1);
                r610.a(iA, (a) obj, dVar, (String) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yt4(int i, d dVar, Function1 function1) {
        this.b = dVar;
        this.d = function1;
        this.c = i;
    }
}
