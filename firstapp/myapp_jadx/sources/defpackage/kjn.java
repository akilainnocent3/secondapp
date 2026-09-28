package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import com.sportygames.newcms.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kjn implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ kjn() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                wrz wrzVar = (wrz) obj2;
                qn70Var.getClass();
                wrzVar.getClass();
                Context context = (Context) qn70Var.a(jq40.a(Context.class), null, null);
                d dVar = (d) qn70Var.a(jq40.a(d.class), null, null);
                en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
                kh8 kh8Var = (kh8) qn70Var.a(jq40.a(kh8.class), null, null);
                kti0 kti0Var = (kti0) qn70Var.a(jq40.a(kti0.class), null, null);
                vmy vmyVar = (vmy) qn70Var.a(jq40.a(vmy.class), null, null);
                pp5 pp5Var = (pp5) qn70Var.a(jq40.a(pp5.class), null, null);
                Object objA = wrzVar.a(jq40.a(amj.class));
                if (objA != null) {
                    return new yui0(context, dVar, en20Var, kh8Var, kti0Var, vmyVar, pp5Var, ((amj) objA).a);
                }
                throw new wjd("No value found for type '" + zgp.a(jq40.a(amj.class)) + '\'');
            default:
                ((Integer) obj2).getClass();
                p3s.c(qj40.a(1), (a) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ kjn(int i) {
    }
}
