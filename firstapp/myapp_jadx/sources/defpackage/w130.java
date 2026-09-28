package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$newAvatarHint$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w130 extends tje0 implements gaj<Integer, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Boolean bool, v1b<? super Boolean> v1bVar) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        w130 w130Var = new w130(3, v1bVar);
        w130Var.a = iIntValue;
        w130Var.b = zBooleanValue;
        return w130Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        int i = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uag uagVar = krf0.I;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (((krf0) next).a != i);
        krf0 krf0Var = (krf0) next;
        boolean z2 = false;
        boolean z3 = krf0Var != null ? krf0Var.w : false;
        if (z && z3) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
