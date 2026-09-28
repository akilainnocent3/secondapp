package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$unfollow$1", f = "SocialFollowViewModel.kt", l = {325, 330, 355, 359, 366, 370}, m = "invokeSuspend", v = 2)
public final class c9a0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x8a0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9a0(x8a0 x8a0Var, String str, boolean z, v1b<? super c9a0> v1bVar) {
        super(2, v1bVar);
        this.c = x8a0Var;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c9a0 c9a0Var = new c9a0(this.c, this.d, this.e, v1bVar);
        c9a0Var.b = obj;
        return c9a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((c9a0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r6.y1(r5, r8) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r6.y1(r5, r8) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r6.y1(r5, r8) == r1) goto L37;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
