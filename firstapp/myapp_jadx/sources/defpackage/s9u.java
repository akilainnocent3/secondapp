package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.platform.features.luckywheel.LuckyWheelActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s9u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s9u(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                u9u u9uVar = (u9u) obj2;
                Context contextRequireContext = u9uVar.requireContext();
                int i2 = LuckyWheelActivity.e;
                Context contextRequireContext2 = u9uVar.requireContext();
                contextRequireContext2.getClass();
                Intent intent = new Intent(contextRequireContext2, (Class<?>) LuckyWheelActivity.class);
                intent.putExtra("KEY_LW_TYPE", (Integer) obj);
                contextRequireContext.startActivity(intent);
                rdd0 rdd0Var = u9uVar.f;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(lbu.a, k00.d);
                u9uVar.dismiss();
                return Unit.a;
            default:
                ((Function1) obj2).invoke((String) obj);
                return Unit.a;
        }
    }
}
