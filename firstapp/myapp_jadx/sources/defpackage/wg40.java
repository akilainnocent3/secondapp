package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.repo.RecentCodeRepoImpl$addRecentBookingCode$1", f = "RecentCodeRepoImpl.kt", l = {57, 60, 78}, m = "invokeSuspend", v = 2)
public final class wg40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ xg40 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg40(xg40 xg40Var, String str, v1b<? super wg40> v1bVar) {
        super(2, v1bVar);
        this.c = xg40Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wg40(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wg40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r3.a.putString(r1, r9, r8) == r0) goto L38;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r8.d
            xg40 r6 = r8.c
            r7 = 0
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            defpackage.uj50.b(r9)
            goto L9b
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L1f:
            java.lang.String r1 = r8.a
            defpackage.uj50.b(r9)
            goto L5e
        L25:
            defpackage.uj50.b(r9)
            goto L37
        L29:
            defpackage.uj50.b(r9)
            mgb0 r9 = r6.c
            r8.b = r4
            java.lang.Object r9 = r9.getUserId(r8)
            if (r9 != r0) goto L37
            goto L9a
        L37:
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L41
            goto L42
        L41:
            r9 = r7
        L42:
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L4a
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L4a:
            int r9 = r5.length()
            if (r9 != 0) goto L53
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L53:
            r8.a = r1
            r8.b = r3
            java.lang.Object r9 = r6.a(r8)
            if (r9 != r0) goto L5e
            goto L9a
        L5e:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r9 = kotlin.collections.CollectionsKt.C0(r9)
            boolean r3 = r9.contains(r5)
            if (r3 == 0) goto L6d
            r9.remove(r5)
        L6d:
            r9.add(r5)
            int r3 = r9.size()
            r4 = 6
            if (r3 <= r4) goto L80
            int r3 = r9.size()
            int r3 = r3 - r4
            java.util.List r9 = kotlin.collections.CollectionsKt.O(r9, r3)
        L80:
            com.sporty.android.core.model.json.JsonSerializeService r3 = r6.d
            java.lang.String r9 = r3.toJson(r9)
            m2l r3 = r6.b
            java.lang.String r4 = "recent_booking_codes_"
            java.lang.String r1 = defpackage.inm.a(r4, r1)
            r8.a = r7
            r8.b = r2
            zed r2 = r3.a
            java.lang.Object r8 = r2.putString(r1, r9, r8)
            if (r8 != r0) goto L9b
        L9a:
            return r0
        L9b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
