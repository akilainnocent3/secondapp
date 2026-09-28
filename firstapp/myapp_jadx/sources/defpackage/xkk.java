package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.lgg.GiftGrabInfoUseCase$clearCache$1", f = "GiftGrabInfoUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 30, 35}, m = "invokeSuspend", v = 2)
public final class xkk extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public long a;
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ alk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkk(alk alkVar, v1b<? super xkk> v1bVar) {
        super(2, v1bVar);
        this.e = alkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xkk xkkVar = new xkk(this.e, v1bVar);
        xkkVar.d = obj;
        return xkkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((xkk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r14.c
            alk r3 = r14.e
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L2e
            if (r2 == r6) goto L2a
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            defpackage.uj50.b(r15)
            goto Lbc
        L1b:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            return r7
        L21:
            long r2 = r14.b
            long r5 = r14.a
            defpackage.uj50.b(r15)
            goto La9
        L2a:
            defpackage.uj50.b(r15)
            goto L3d
        L2e:
            defpackage.uj50.b(r15)
            r14.d = r0
            r14.c = r6
            java.lang.Object r15 = r3.a(r14)
            if (r15 != r1) goto L3d
            goto Lbb
        L3d:
            com.sportybet.plugin.lgg.LggInfoShowRecord r15 = (com.sportybet.plugin.lgg.LggInfoShowRecord) r15
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r15 == 0) goto Lab
            java.util.Map<java.lang.String, java.lang.Long> r15 = r15.a
            if (r15 == 0) goto Lab
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L59:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L85
            java.lang.Object r6 = r15.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r12 = r6.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            long r12 = r8 - r12
            long r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L59
            java.lang.Object r12 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r2.put(r12, r6)
            goto L59
        L85:
            m2l r15 = r3.a
            g8s[] r6 = defpackage.g8s.a
            com.sporty.android.core.model.json.JsonSerializeService r3 = r3.b
            com.sportybet.plugin.lgg.LggInfoShowRecord r6 = new com.sportybet.plugin.lgg.LggInfoShowRecord
            r6.<init>(r2)
            java.lang.String r2 = r3.toJson(r6)
            r14.d = r0
            r14.a = r8
            r14.b = r10
            r14.c = r5
            zed r15 = r15.a
            java.lang.String r3 = "pref_gift_grab_hint_show_count"
            java.lang.Object r15 = r15.putString(r3, r2, r14)
            if (r15 != r1) goto La7
            goto Lbb
        La7:
            r5 = r8
            r2 = r10
        La9:
            r10 = r2
            r8 = r5
        Lab:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r14.d = r7
            r14.a = r8
            r14.b = r10
            r14.c = r4
            java.lang.Object r14 = r0.emit(r15, r14)
            if (r14 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
