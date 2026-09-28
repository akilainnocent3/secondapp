package defpackage;

import com.sporty.android.core.model.welcomereward.LuckyWheelMetadata;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.Reward;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$getLuckyWheelInfo$1", f = "WelcomeRewardViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class z4j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ w4j0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4j0(v1b v1bVar, w4j0 w4j0Var) {
        super(2, v1bVar);
        this.b = w4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z4j0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z4j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        LuckyWheelMetadata luckyWheelMetadata;
        Integer luckyWheelType;
        y5b y5bVar = y5b.a;
        int i = this.a;
        w4j0 w4j0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            u9k u9kVarA = w4j0Var.i.a();
            this.a = 1;
            obj = s0i.a(u9kVarA, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Iterator<T> it = ((NonFtdEngagement) obj).getRewards().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Reward) next).getType() != NonFtdRewardType.LUCKY_WHEEL);
        Reward reward = (Reward) next;
        int iIntValue = (reward == null || (luckyWheelMetadata = reward.getLuckyWheelMetadata()) == null || (luckyWheelType = luckyWheelMetadata.getLuckyWheelType()) == null) ? 0 : luckyWheelType.intValue();
        jvd0 jvd0Var = w4j0Var.z;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        w4j0Var.z = kzh.d(new g1i(w4j0Var.v.a(iIntValue), new m5j0(null, w4j0Var)), o8i0.d(w4j0Var));
        return Unit.a;
    }
}
