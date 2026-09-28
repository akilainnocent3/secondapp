package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.WaitingComponentKt$WaitingComponent$3$1", f = "WaitingComponent.kt", l = {99}, m = "invokeSuspend", v = 1)
public final class owi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<Float> c;
    public final /* synthetic */ ytw<Float> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owi0(v1b v1bVar, ytw ytwVar, ytw ytwVar2, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = ytwVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new owi0(v1bVar, this.c, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((owi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Float fValueOf = Float.valueOf(0.0f);
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Float> ytwVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            String str = this.b;
            int iHashCode = str.hashCode();
            if (iHashCode == -1111393803) {
                if (str.equals("ROUND_PRE_START")) {
                    this.a = 1;
                    if (hkd.b(530L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (iHashCode == 1599022634 ? str.equals("ROUND_END_WAIT") : iHashCode == 1862985098 && str.equals("ROUND_ONGOING")) {
                ytwVar.setValue(Float.valueOf(1.0f));
            }
            return Unit.a;
            ytwVar.setValue(fValueOf);
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ytwVar.setValue(fValueOf);
        this.d.setValue(fValueOf);
        return Unit.a;
    }
}
