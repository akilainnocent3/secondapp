package defpackage;

import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinNumberBoard$glowNumberBoardBgBy$14", f = "Spin2WinNumberBoard.kt", l = {795}, m = "invokeSuspend", v = 1)
public final class h3b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinNumberBoard b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b0(Spin2WinNumberBoard spin2WinNumberBoard, v1b<? super h3b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinNumberBoard;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h3b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h3b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Spin2WinNumberBoard spin2WinNumberBoard = this.b;
        if (i == 0) {
            uj50.b(obj);
            int i2 = Spin2WinNumberBoard.K;
            spin2WinNumberBoard.K(spin2WinNumberBoard.I(0, 18, "black"));
            this.a = 1;
            if (hkd.b(1000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int i3 = Spin2WinNumberBoard.K;
        Spin2WinNumberBoard.J(spin2WinNumberBoard.I(0, 18, "black"));
        return Unit.a;
    }
}
