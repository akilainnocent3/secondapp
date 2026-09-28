package defpackage;

import android.content.Context;
import android.view.View;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ucz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ucz(qub0 qub0Var, Context context) {
        this.a = 1;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj2;
                int i2 = OverUnderComponent.e0;
                ((View) obj).getClass();
                if (overUnderComponent.betPlaced) {
                    return Unit.a;
                }
                if (overUnderComponent.binding.A0.getVisibility() != 8) {
                    return Unit.a;
                }
                if (overUnderComponent.binding.A0.getVisibility() == 8) {
                    overUnderComponent.binding.i0.setVisibility(0);
                }
                overUnderComponent.binding.e0.setVisibility(8);
                overUnderComponent.binding.f0.setVisibility(8);
                overUnderComponent.binding.g0.setVisibility(8);
                overUnderComponent.binding.h0.setVisibility(8);
                Function1<? super Boolean, Unit> function1 = overUnderComponent.O;
                if (function1 == null) {
                    Intrinsics.n("onFbgClick");
                    throw null;
                }
                function1.invoke(Boolean.TRUE);
                overUnderComponent.getOnBetChipSelected().invoke(0);
                return Unit.a;
            case 1:
                Context context = (Context) obj2;
                Long l = (Long) obj;
                l.getClass();
                HashMap mapP3 = qub0.P3(context);
                mapP3.put(l, "remind_later");
                qub0.m4(context, mapP3);
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("tournament_remind_me_later", krh0.e(str), new String[0]);
                return Unit.a;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((tch) obj2).B1(new ez4.c(str2));
                return Unit.a;
        }
    }

    public /* synthetic */ ucz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
