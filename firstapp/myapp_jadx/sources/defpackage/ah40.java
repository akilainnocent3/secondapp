package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.repo.RecentCodeRepoImpl$replaceRecentBookingCodes$1", f = "RecentCodeRepoImpl.kt", l = {82, 83, 89}, m = "invokeSuspend", v = 2)
public final class ah40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ xg40 c;
    public final /* synthetic */ List<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah40(xg40 xg40Var, List<String> list, v1b<? super ah40> v1bVar) {
        super(2, v1bVar);
        this.c = xg40Var;
        this.d = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ah40(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ah40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r3.a.putString(r1, r12, r11) == r0) goto L33;
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.b
            r2 = 3
            r3 = 2
            r4 = 1
            xg40 r5 = r11.c
            r6 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            defpackage.uj50.b(r12)
            goto L98
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r6
        L1d:
            java.lang.String r1 = r11.a
            defpackage.uj50.b(r12)
            goto L53
        L23:
            defpackage.uj50.b(r12)
            goto L35
        L27:
            defpackage.uj50.b(r12)
            mgb0 r12 = r5.c
            r11.b = r4
            java.lang.Object r12 = r12.getUserId(r11)
            if (r12 != r0) goto L35
            goto L97
        L35:
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            goto L40
        L3f:
            r12 = r6
        L40:
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L48
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L48:
            r11.a = r1
            r11.b = r3
            java.lang.Object r12 = r5.a(r11)
            if (r12 != r0) goto L53
            goto L97
        L53:
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.ArrayList r12 = kotlin.collections.CollectionsKt.C0(r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r12.size()
            r7 = 0
        L63:
            if (r7 >= r4) goto L7a
            java.lang.Object r8 = r12.get(r7)
            int r7 = r7 + 1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.util.List<java.lang.String> r10 = r11.d
            boolean r9 = r10.contains(r9)
            if (r9 != 0) goto L63
            r3.add(r8)
            goto L63
        L7a:
            r12.removeAll(r3)
            com.sporty.android.core.model.json.JsonSerializeService r3 = r5.d
            java.lang.String r12 = r3.toJson(r12)
            m2l r3 = r5.b
            java.lang.String r4 = "recent_booking_codes_"
            java.lang.String r1 = defpackage.inm.a(r4, r1)
            r11.a = r6
            r11.b = r2
            zed r2 = r3.a
            java.lang.Object r11 = r2.putString(r1, r12, r11)
            if (r11 != r0) goto L98
        L97:
            return r0
        L98:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
