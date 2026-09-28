package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class euf extends saj implements Function1 {
    public final /* synthetic */ int a = 1;

    public euf(Object obj) {
        super(1, obj, muf.class, "onDailyLimitChanged", "onDailyLimitChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                muf mufVar = (muf) this.receiver;
                mufVar.getClass();
                juf.c cVarZ1 = mufVar.z1();
                if (cVarZ1 != null) {
                    Pair<UiText, UiText> pairA1 = mufVar.A1(ijf0Var.a.b, cVarZ1.f.a.b);
                    wwd0 wwd0Var = mufVar.a;
                    juf.c cVarA = juf.c.a(cVarZ1, ijf0Var, pairA1.a, null, pairA1.b, false, 179);
                    wwd0Var.getClass();
                    wwd0Var.k(null, cVarA);
                }
                break;
            default:
                bri0 bri0Var = (bri0) obj;
                bri0Var.getClass();
                ((yui0) this.receiver).J1(bri0Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ euf(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
