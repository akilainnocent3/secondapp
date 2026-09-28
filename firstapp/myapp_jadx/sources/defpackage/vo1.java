package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.AvatarUseCase$getAvatarState$1", f = "AvatarUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vo1 extends tje0 implements jaj<String, Boolean, String, String, v1b<? super so1>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ boolean b;
    public /* synthetic */ String c;
    public final /* synthetic */ uo1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo1(uo1 uo1Var, v1b v1bVar) {
        super(5, v1bVar);
        to1 to1Var = to1.a;
        this.d = uo1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        to1 to1Var = to1.a;
        bnh0 bnh0Var = this.d.d;
        String str = this.a;
        boolean z = this.b;
        String str2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (str.length() == 0) {
            return so1.c.a;
        }
        String strE = bnh0Var.e(str);
        if (!z) {
            return new so1.b(strE);
        }
        if (str2.length() <= 0) {
            str2 = null;
        }
        return str2 != null ? new so1.a(strE, bnh0Var.e(str2)) : new so1.b(strE);
    }

    @Override // defpackage.jaj
    public final Object l(String str, Boolean bool, String str2, String str3, v1b<? super so1> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        to1 to1Var = to1.a;
        vo1 vo1Var = new vo1(this.d, v1bVar);
        vo1Var.a = str;
        vo1Var.b = zBooleanValue;
        vo1Var.c = str2;
        return vo1Var.invokeSuspend(Unit.a);
    }
}
