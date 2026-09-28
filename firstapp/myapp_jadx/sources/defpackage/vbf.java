package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListScopeImpl$draggableHandle$1", f = "DraggableList.kt", l = {230}, m = "invokeSuspend", v = 2)
public final class vbf extends tje0 implements gaj<v5b, gly, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ v5b b;
    public /* synthetic */ long c;
    public final /* synthetic */ ybf d;
    public final /* synthetic */ obf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbf(ybf ybfVar, obf obfVar, v1b v1bVar) {
        super(3, v1bVar);
        this.d = ybfVar;
        this.e = obfVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, gly glyVar, v1b<? super Unit> v1bVar) {
        long j = glyVar.a;
        vbf vbfVar = new vbf(this.d, this.e, v1bVar);
        vbfVar.b = v5bVar;
        vbfVar.c = j;
        return vbfVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ybf ybfVar = this.d;
            fcf fcfVar = ybfVar.a;
            int i2 = ybfVar.c;
            ((x5a0) fcfVar.g).setValue(Integer.valueOf(i2));
            ((x5a0) fcfVar.h).setValue(Integer.valueOf(i2));
            this.b = null;
            this.c = j;
            this.a = 1;
            if (new obf(3, this).invokeSuspend(Unit.a) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
