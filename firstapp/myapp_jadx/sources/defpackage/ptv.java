package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.data.MissionRepositoryImpl", f = "MissionRepositoryImpl.kt", l = {77, 78}, m = "writeToCache", v = 2)
public final class ptv extends x1b {
    public ntv a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ntv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptv(ntv ntvVar, x1b x1bVar) {
        super(x1bVar);
        this.c = ntvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Type type = ntv.g;
        return this.c.c(null, this);
    }
}
