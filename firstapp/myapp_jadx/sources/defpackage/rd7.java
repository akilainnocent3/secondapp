package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                l590 l590Var = ((td7) obj2).v;
                if (zBooleanValue) {
                    l590Var.i(b.l(0));
                } else {
                    l590Var.i(m2g.a);
                }
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((fgb) obj2).Q1(str);
                return Unit.a;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((x5a0) ((ylb0) obj2).O2).setValue(bool2);
                return Unit.a;
            default:
                return ((WorldCupTeam) ((List) obj2).get(((Integer) obj).intValue())).getId();
        }
    }
}
