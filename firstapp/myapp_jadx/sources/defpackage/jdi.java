package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jdi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jdi(ogo.b bVar, Function0 function0) {
        this.a = 2;
        this.c = bVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                ((Function1) obj2).invoke(a.e.b.a);
                return Unit.a;
            case 1:
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                return new q0s((mt60) obj, o2gVar, (et60) obj2);
            default:
                Function0 function0 = (Function0) obj;
                if (((ogo.b) obj2).c > 0) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ jdi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
