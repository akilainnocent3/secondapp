package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zm3 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zm3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                m6a0 m6a0Var = (m6a0) obj2;
                ((wv60) obj).getClass();
                m6a0Var.getClass();
                return m6a0Var.c().c;
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.arrow_back, 0, aVar), cb40.a(R.string.common_functions__close, new Object[0], aVar), null, c68.a(R.color.text_type1_secondary, aVar), aVar, 0, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
