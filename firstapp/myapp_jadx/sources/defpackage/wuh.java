package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.FlexCalculateUtils", f = "FlexCalculateUtils.kt", l = {80}, m = "computeROutOfNAsync", v = 2)
public final class wuh extends x1b {
    public LinkedHashMap a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zuh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuh(zuh zuhVar, x1b x1bVar) {
        super(x1bVar);
        this.c = zuhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        zuh zuhVar = zuh.a;
        return this.c.a(null, this);
    }
}
