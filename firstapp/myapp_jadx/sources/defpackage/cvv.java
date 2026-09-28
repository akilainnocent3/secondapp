package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cvv implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cvv(sx4 sx4Var, String str, String str2, Function0 function0, int i) {
        this.c = sx4Var;
        this.b = str;
        this.d = str2;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(9);
                fvv.e((yuv) obj5, (v0u) obj4, this.b, (d) obj3, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(9);
                sj00.a((sx4) obj5, this.b, (String) obj4, (Function0) obj3, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cvv(yuv yuvVar, v0u v0uVar, String str, d dVar, int i) {
        this.c = yuvVar;
        this.d = v0uVar;
        this.b = str;
        this.e = dVar;
    }
}
