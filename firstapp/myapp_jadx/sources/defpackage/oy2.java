package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.search.SearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oy2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oy2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                break;
            default:
                SearchFragment searchFragment = (SearchFragment) obj2;
                uvy uvyVar = (uvy) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                if (uvyVar != null) {
                    uhd0 uhd0VarP0 = searchFragment.p0();
                    zuy zuyVarA = vuy.a(uvyVar);
                    OneUpTwoUpSwitch oneUpTwoUpSwitch = uhd0VarP0.v;
                    OneUpTwoUpSwitch oneUpTwoUpSwitch2 = uhd0VarP0.A;
                    zuy zuyVarE = hih0.e(oneUpTwoUpSwitch.getA());
                    OneUpTwoUpSwitch oneUpTwoUpSwitch3 = uhd0VarP0.v;
                    avy avyVarG = hih0.g(oneUpTwoUpSwitch3.getB());
                    if (zuyVarA != zuyVarE && avyVarG == avy.c) {
                        hih0.a(oneUpTwoUpSwitch3, zuyVarA);
                    }
                    zuy zuyVarE2 = hih0.e(oneUpTwoUpSwitch2.getA());
                    avy avyVarG2 = hih0.g(oneUpTwoUpSwitch2.getB());
                    if (zuyVarA != zuyVarE2 && avyVarG2 == avy.c) {
                        hih0.a(oneUpTwoUpSwitch2, zuyVarA);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
