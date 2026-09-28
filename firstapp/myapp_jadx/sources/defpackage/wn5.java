package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.helper.CMSHelper$getSpineDataForUrl$2", f = "CMSHelper.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class wn5 extends tje0 implements Function2<v5b, v1b<? super icb0>, Object> {
    public ocb0 a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xn5 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn5(String str, xn5 xn5Var, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = xn5Var;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wn5(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super icb0> v1bVar) {
        return ((wn5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ocb0 ocb0Var;
        mp5 mp5Var = this.d.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        String str = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                CMSRes.Data data = new CMSRes.Data(0, 0, "sg_piggy_bash_game", this.c, nn5.SpineAnimation, null);
                mp5Var.getClass();
                ocb0 ocb0Var2 = new ocb0();
                this.a = ocb0Var2;
                this.b = 1;
                if (mp5Var.d(data, str, ocb0Var2) == y5bVar) {
                    return y5bVar;
                }
                ocb0Var = ocb0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ocb0Var = this.a;
                uj50.b(obj);
            }
            return ((ncb0) ocb0Var.build()).a.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
