package defpackage;

import android.widget.ImageView;
import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinNumberBoard$glowNumberBoardBgBy$7", f = "Spin2WinNumberBoard.kt", l = {652}, m = "invokeSuspend", v = 1)
public final class t3b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinNumberBoard b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3b0(Spin2WinNumberBoard spin2WinNumberBoard, v1b<? super t3b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinNumberBoard;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t3b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t3b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Spin2WinNumberBoard spin2WinNumberBoard = this.b;
        if (i == 0) {
            uj50.b(obj);
            zp80 binding = spin2WinNumberBoard.getBinding();
            ImageView imageView = binding != null ? binding.K0 : null;
            zp80 binding2 = spin2WinNumberBoard.getBinding();
            ImageView imageView2 = binding2 != null ? binding2.V0 : null;
            zp80 binding3 = spin2WinNumberBoard.getBinding();
            ImageView imageView3 = binding3 != null ? binding3.g1 : null;
            zp80 binding4 = spin2WinNumberBoard.getBinding();
            ImageView imageView4 = binding4 != null ? binding4.o1 : null;
            zp80 binding5 = spin2WinNumberBoard.getBinding();
            ImageView imageView5 = binding5 != null ? binding5.p1 : null;
            zp80 binding6 = spin2WinNumberBoard.getBinding();
            ImageView imageView6 = binding6 != null ? binding6.q1 : null;
            zp80 binding7 = spin2WinNumberBoard.getBinding();
            ImageView imageView7 = binding7 != null ? binding7.r1 : null;
            zp80 binding8 = spin2WinNumberBoard.getBinding();
            ImageView imageView8 = binding8 != null ? binding8.s1 : null;
            zp80 binding9 = spin2WinNumberBoard.getBinding();
            ImageView imageView9 = binding9 != null ? binding9.t1 : null;
            zp80 binding10 = spin2WinNumberBoard.getBinding();
            ImageView imageView10 = binding10 != null ? binding10.L0 : null;
            zp80 binding11 = spin2WinNumberBoard.getBinding();
            ImageView imageView11 = binding11 != null ? binding11.M0 : null;
            zp80 binding12 = spin2WinNumberBoard.getBinding();
            spin2WinNumberBoard.K(new ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, binding12 != null ? binding12.N0 : null});
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
        zp80 binding13 = spin2WinNumberBoard.getBinding();
        ImageView imageView12 = binding13 != null ? binding13.K0 : null;
        zp80 binding14 = spin2WinNumberBoard.getBinding();
        ImageView imageView13 = binding14 != null ? binding14.V0 : null;
        zp80 binding15 = spin2WinNumberBoard.getBinding();
        ImageView imageView14 = binding15 != null ? binding15.g1 : null;
        zp80 binding16 = spin2WinNumberBoard.getBinding();
        ImageView imageView15 = binding16 != null ? binding16.o1 : null;
        zp80 binding17 = spin2WinNumberBoard.getBinding();
        ImageView imageView16 = binding17 != null ? binding17.p1 : null;
        zp80 binding18 = spin2WinNumberBoard.getBinding();
        ImageView imageView17 = binding18 != null ? binding18.q1 : null;
        zp80 binding19 = spin2WinNumberBoard.getBinding();
        ImageView imageView18 = binding19 != null ? binding19.r1 : null;
        zp80 binding20 = spin2WinNumberBoard.getBinding();
        ImageView imageView19 = binding20 != null ? binding20.s1 : null;
        zp80 binding21 = spin2WinNumberBoard.getBinding();
        ImageView imageView20 = binding21 != null ? binding21.t1 : null;
        zp80 binding22 = spin2WinNumberBoard.getBinding();
        ImageView imageView21 = binding22 != null ? binding22.L0 : null;
        zp80 binding23 = spin2WinNumberBoard.getBinding();
        ImageView imageView22 = binding23 != null ? binding23.M0 : null;
        zp80 binding24 = spin2WinNumberBoard.getBinding();
        Spin2WinNumberBoard.J(new ImageView[]{imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, binding24 != null ? binding24.N0 : null});
        return Unit.a;
    }
}
