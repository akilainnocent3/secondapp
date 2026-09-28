package defpackage;

import com.google.protobuf.RuntimeVersion;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.data.LNMissionRepository$getMissions$1", f = "LNMissionRepository.kt", l = {RuntimeVersion.MINOR, 29, 30}, m = "invokeSuspend", v = 2)
public final class ytq extends tje0 implements Function2<myh<? super osv>, v1b<? super Unit>, Object> {
    public psv a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ auq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytq(auq auqVar, v1b<? super ytq> v1bVar) {
        super(2, v1bVar);
        this.e = auqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ytq ytqVar = new ytq(this.e, v1bVar);
        ytqVar.d = obj;
        return ytqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super osv> myhVar, v1b<? super Unit> v1bVar) {
        return ((ytq) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r9 == r1) goto L25;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.c
            auq r3 = r8.e
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L30
            if (r2 == r6) goto L2c
            if (r2 == r5) goto L26
            if (r2 != r4) goto L20
            java.util.Iterator r2 = r8.b
            psv r3 = r8.a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            defpackage.uj50.b(r9)
            goto L6e
        L20:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L26:
            psv r2 = r8.a
            defpackage.uj50.b(r9)
            goto L5d
        L2c:
            defpackage.uj50.b(r9)
            goto L46
        L30:
            defpackage.uj50.b(r9)
            i6u r9 = r3.b
            ts5 r9 = r9.f
            or60 r9 = r9.a()
            r8.d = r0
            r8.c = r6
            java.lang.Object r9 = defpackage.s0i.a(r9, r8)
            if (r9 != r1) goto L46
            goto L88
        L46:
            avq r9 = (defpackage.avq) r9
            boolean r9 = r9.e
            if (r9 == 0) goto L8c
            psv r2 = r3.c
            c5u r9 = r3.a
            r8.d = r0
            r8.a = r2
            r8.c = r5
            java.lang.Object r9 = r9.q(r8)
            if (r9 != r1) goto L5d
            goto L88
        L5d:
            com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9
            java.lang.Object r9 = defpackage.n52.b(r9)
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r9 = r2.a(r9)
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L6e:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L89
            java.lang.Object r9 = r2.next()
            osv r9 = (defpackage.osv) r9
            r8.d = r0
            r8.a = r7
            r8.b = r2
            r8.c = r4
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L6e
        L88:
            return r1
        L89:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L8c:
            java.lang.String r8 = "Mission Disabled"
            defpackage.i08.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
