package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$createMissionUIStateFlow$1", f = "MissionStateHandler.kt", l = {131, 140}, m = "invokeSuspend", v = 2)
public final class jvv extends tje0 implements kaj<lk50<? extends List<? extends qlw>>, lk50<? extends List<? extends qlw>>, Map<Integer, ? extends uxs>, Set<? extends Integer>, Set<? extends Integer>, v1b<? super jwv>, Object> {
    public int a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ lk50 c;
    public /* synthetic */ Map d;
    public /* synthetic */ Set e;
    public /* synthetic */ Set f;
    public final /* synthetic */ nvv i;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvv(nvv nvvVar, boolean z, v1b<? super jvv> v1bVar) {
        super(6, v1bVar);
        this.i = nvvVar;
        this.v = z;
    }

    @Override // defpackage.kaj
    public final Object f(lk50<? extends List<? extends qlw>> lk50Var, lk50<? extends List<? extends qlw>> lk50Var2, Map<Integer, ? extends uxs> map, Set<? extends Integer> set, Set<? extends Integer> set2, v1b<? super jwv> v1bVar) {
        jvv jvvVar = new jvv(this.i, this.v, v1bVar);
        jvvVar.b = lk50Var;
        jvvVar.c = lk50Var2;
        jvvVar.d = map;
        jvvVar.e = set;
        jvvVar.f = set2;
        return jvvVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r0 == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r0.a.emit(r2, r21) == r7) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
