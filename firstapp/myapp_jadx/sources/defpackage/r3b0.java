package defpackage;

import android.widget.ImageView;
import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinNumberBoard$glowNumberBoardBgBy$5", f = "Spin2WinNumberBoard.kt", l = {590}, m = "invokeSuspend", v = 1)
public final class r3b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinNumberBoard b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3b0(Spin2WinNumberBoard spin2WinNumberBoard, v1b<? super r3b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinNumberBoard;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r3b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r3b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Spin2WinNumberBoard spin2WinNumberBoard = this.b;
        if (i == 0) {
            uj50.b(obj);
            zp80 binding = spin2WinNumberBoard.getBinding();
            ImageView imageView = binding != null ? binding.b1 : null;
            zp80 binding2 = spin2WinNumberBoard.getBinding();
            ImageView imageView2 = binding2 != null ? binding2.c1 : null;
            zp80 binding3 = spin2WinNumberBoard.getBinding();
            ImageView imageView3 = binding3 != null ? binding3.d1 : null;
            zp80 binding4 = spin2WinNumberBoard.getBinding();
            ImageView imageView4 = binding4 != null ? binding4.e1 : null;
            zp80 binding5 = spin2WinNumberBoard.getBinding();
            ImageView imageView5 = binding5 != null ? binding5.f1 : null;
            zp80 binding6 = spin2WinNumberBoard.getBinding();
            spin2WinNumberBoard.K(new ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5, binding6 != null ? binding6.h1 : null});
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
        zp80 binding7 = spin2WinNumberBoard.getBinding();
        ImageView imageView6 = binding7 != null ? binding7.b1 : null;
        zp80 binding8 = spin2WinNumberBoard.getBinding();
        ImageView imageView7 = binding8 != null ? binding8.c1 : null;
        zp80 binding9 = spin2WinNumberBoard.getBinding();
        ImageView imageView8 = binding9 != null ? binding9.d1 : null;
        zp80 binding10 = spin2WinNumberBoard.getBinding();
        ImageView imageView9 = binding10 != null ? binding10.e1 : null;
        zp80 binding11 = spin2WinNumberBoard.getBinding();
        ImageView imageView10 = binding11 != null ? binding11.f1 : null;
        zp80 binding12 = spin2WinNumberBoard.getBinding();
        Spin2WinNumberBoard.J(new ImageView[]{imageView6, imageView7, imageView8, imageView9, imageView10, binding12 != null ? binding12.h1 : null});
        return Unit.a;
    }
}
