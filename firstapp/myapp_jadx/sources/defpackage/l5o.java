package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l5o implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l5o(int i, int i2, d dVar, String str) {
        this.c = i;
        this.d = str;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.d;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                m5o.b(i2, iA, (a) obj, dVar, (String) obj3);
                break;
            default:
                ((Integer) obj2).intValue();
                n8x.j(dVar, (e7x.c) obj3, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l5o(d dVar, e7x.c cVar, int i) {
        this.b = dVar;
        this.d = cVar;
        this.c = i;
    }
}
