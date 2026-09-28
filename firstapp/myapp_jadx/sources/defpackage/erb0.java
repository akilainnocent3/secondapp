package defpackage;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class erb0 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ erb0(tch tchVar) {
        this.b = tchVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                Long l = (Long) obj;
                l.getClass();
                HashMap mapP3 = qub0.P3(context);
                mapP3.put(l, "not_interested");
                qub0.m4(context, mapP3);
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("tournament_not_interested", krh0.e(str), new String[0]);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((tch) obj2).B1(new ez4.b(str2));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ erb0(qub0 qub0Var, Context context) {
        this.b = context;
    }
}
