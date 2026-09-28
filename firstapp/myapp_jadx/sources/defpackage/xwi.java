package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xwi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xwi(ifx ifxVar, yfx.a aVar, a aVar2, Fragment fragment) {
        this.a = 0;
        this.b = aVar;
        this.c = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yfx.a aVar = (yfx.a) obj2;
                Fragment fragment = (Fragment) obj;
                for (ifx ifxVar : (Iterable) aVar.f.a.getValue()) {
                    if (a.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + ifxVar + " due to fragment " + fragment + " viewmodel being cleared");
                    }
                    aVar.b(ifxVar);
                }
                break;
            case 1:
                Function0 function0 = (Function0) obj;
                if (((n5o) obj2).b()) {
                    function0.invoke();
                }
                break;
            default:
                ((Function1) obj2).invoke(((d120.d) ((d120) obj)).b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xwi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
