package defpackage;

import com.esotericsoftware.spine.android.SpineView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherov2.components.MultipliercomponentKt$Multipliercomponent$1", f = "Multipliercomponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class irw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ dq40<String> b;
    public final /* synthetic */ yp40 c;
    public final /* synthetic */ dq40<SpineView> d;
    public final /* synthetic */ ytw<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irw(String str, dq40<String> dq40Var, yp40 yp40Var, dq40<SpineView> dq40Var2, ytw<Boolean> ytwVar, v1b<? super irw> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = dq40Var;
        this.c = yp40Var;
        this.d = dq40Var2;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new irw(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((irw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        String str2 = "3_Fly";
        yp40 yp40Var = this.c;
        dq40<String> dq40Var = this.b;
        ytw<Boolean> ytwVar = this.e;
        switch (str) {
            case "ROUND_PRE_START":
                srw.b(ytwVar, false);
                str2 = "2_LoadingToFly";
                dq40Var.a = "2_LoadingToFly";
                yp40Var.a = false;
                break;
            case "ROUND_WAITING":
                srw.b(ytwVar, false);
                str2 = "1_LoadingScreenAnimation";
                dq40Var.a = "1_LoadingScreenAnimation";
                yp40Var.a = false;
                break;
            case "ROUND_END_WAIT":
            case "ROUND_ONGOING":
                srw.b(ytwVar, false);
                dq40Var.a = "3_Fly";
                yp40Var.a = true;
                break;
            default:
                srw.b(ytwVar, true);
                dq40Var.a = "3_Fly";
                yp40Var.a = true;
                break;
        }
        SpineView spineView = this.d.a;
        if (spineView != null) {
            spineView.setBoundsProvider(new my90(str2));
        }
        return Unit.a;
    }
}
