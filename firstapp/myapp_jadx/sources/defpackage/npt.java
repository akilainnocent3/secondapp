package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class npt implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ npt(int i, String str, String str2, Function0 function0) {
        this.b = str;
        this.d = str2;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.c;
        Object obj3 = this.d;
        String str = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                spt.c((crz) obj3, str, function0, (a) obj, qj40.a(28039));
                break;
            default:
                ((Integer) obj2).getClass();
                g2j0.a(str, (String) obj3, function0, (a) obj, qj40.a(55));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ npt(crz crzVar, String str, Function0 function0, int i) {
        this.d = crzVar;
        this.b = str;
        this.c = function0;
    }
}
