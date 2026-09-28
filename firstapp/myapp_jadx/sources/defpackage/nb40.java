package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.repo.RealtimeCMSRepoImpl$initCMS$2", f = "RealtimeCMSRepoImpl.kt", l = {68, 69}, m = "invokeSuspend", v = 2)
public final class nb40 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rb40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb40(rb40 rb40Var, v1b<? super nb40> v1bVar) {
        super(2, v1bVar);
        this.c = rb40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nb40 nb40Var = new nb40(this.c, v1bVar);
        nb40Var.b = obj;
        return nb40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((nb40) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r4.g(r0, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            java.lang.String r0 = (java.lang.String) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            rb40 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r8)
            goto L3f
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1d:
            defpackage.uj50.b(r8)
            goto L34
        L21:
            defpackage.uj50.b(r8)
            wwd0 r8 = r4.i
            jb40$a$a r2 = jb40.a.C0716a.a
            r7.b = r0
            r7.a = r6
            r8.setValue(r2)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L34
            goto L3e
        L34:
            r7.b = r3
            r7.a = r5
            java.lang.Object r7 = r4.g(r0, r7)
            if (r7 != r1) goto L3f
        L3e:
            return r1
        L3f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
