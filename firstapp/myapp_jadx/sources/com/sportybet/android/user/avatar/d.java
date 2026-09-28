package com.sportybet.android.user.avatar;

import defpackage.a320;
import defpackage.c0d;
import defpackage.gaj;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getUserFrame$2", f = "ChangeAvatarViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements gaj<myh<? super f>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super f> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        d dVar = new d(3, v1bVar);
        dVar.b = myhVar;
        dVar.c = th;
        return dVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f.b bVar = f.b.a;
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a.a(a320.a("BO Config Error: ", th), new Object[0]);
        return Unit.a;
    }
}
