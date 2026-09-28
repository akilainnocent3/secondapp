package com.sportybet.android.user.avatar;

import defpackage.c0d;
import defpackage.iaj;
import defpackage.so1;
import defpackage.tje0;
import defpackage.to1;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$framePreviewState$1", f = "ChangeAvatarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends tje0 implements iaj<f, String, Boolean, v1b<? super so1>, Object> {
    public /* synthetic */ f a;
    public /* synthetic */ String b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(f fVar, String str, Boolean bool, v1b<? super so1> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        b bVar = new b(4, v1bVar);
        bVar.a = fVar;
        bVar.b = str;
        bVar.c = zBooleanValue;
        return bVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f fVar = this.a;
        String str = this.b;
        boolean z = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (str.length() == 0) {
            return so1.c.a;
        }
        if (!(fVar instanceof f.a) || !z) {
            return new so1.b(str);
        }
        String str2 = ((f.a) fVar).a;
        to1 to1Var = to1.a;
        return new so1.a(str, str2);
    }
}
