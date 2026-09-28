package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils$generateCombinations$1", f = "FlexCalculateUtils.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class yuh extends ji50 implements Function2<wc80<? super List<? extends Integer>>, v1b<? super Unit>, Object> {
    public int[] b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuh(int i, int i2, v1b<? super yuh> v1bVar) {
        super(2, v1bVar);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yuh yuhVar = new yuh(this.e, this.f, v1bVar);
        yuhVar.d = obj;
        return yuhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super List<? extends Integer>> wc80Var, v1b<? super Unit> v1bVar) {
        return ((yuh) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int[] iArr;
        wc80 wc80Var = (wc80) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        int i2 = this.e;
        if (i == 0) {
            uj50.b(obj);
            iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = i3;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iArr = this.b;
            uj50.b(obj);
            int i4 = i2 - 1;
            while (i4 >= 0 && iArr[i4] == (this.f + i4) - i2) {
                i4--;
            }
            if (i4 < 0) {
                return Unit.a;
            }
            iArr[i4] = iArr[i4] + 1;
            for (int i5 = i4 + 1; i5 < i2; i5++) {
                iArr[i5] = iArr[i5 - 1] + 1;
            }
        }
        List<Integer> listQ = ay0.Q(iArr);
        this.d = wc80Var;
        this.b = iArr;
        this.c = 1;
        wc80Var.b(this, listQ);
        y5b y5bVar2 = y5b.a;
        return y5bVar;
    }
}
