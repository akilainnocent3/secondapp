package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jng implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jng(d dVar, String str, String str2, ofb0 ofb0Var, int i) {
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = ofb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                kng.a(this.b, (String) this.c, (String) this.d, (ofb0) this.e, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(1);
                oz70.a((List) this.c, (Function1) this.d, (Function1) this.e, this.b, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jng(List list, Function1 function1, Function1 function2, d dVar, int i) {
        this.c = list;
        this.d = function1;
        this.e = function2;
        this.b = dVar;
    }
}
