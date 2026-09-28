package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$5$1", f = "GameplayScreen.kt", l = {302}, m = "invokeSuspend", v = 1)
public final class jqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m6a0<Long, Long> b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqj(m6a0<Long, Long> m6a0Var, long j, long[] jArr, v1b<? super jqj> v1bVar) {
        super(2, v1bVar);
        this.b = m6a0Var;
        this.c = j;
        this.d = jArr;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jqj(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(700L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Long l = new Long(this.c);
        CMSRes[] cMSResArr = eqj.a;
        long[] jArr = this.d;
        long j = jArr[0] + 1;
        jArr[0] = j;
        this.b.put(l, new Long(j));
        return Unit.a;
    }
}
