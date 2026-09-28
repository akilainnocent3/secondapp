package defpackage;

import com.sportybet.plugin.webcontainer.WebviewEffect;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q81 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q81(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj2).setValue(Integer.valueOf((int) (((jxo) obj).a & 4294967295L)));
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function1) obj2).invoke(bool);
                return Unit.a;
            default:
                return ((WebViewActivity) obj2).lambda$collectEffect$3((WebviewEffect) obj);
        }
    }
}
