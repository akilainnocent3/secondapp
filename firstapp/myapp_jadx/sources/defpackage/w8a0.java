package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$follow$1", f = "SocialFollowViewModel.kt", l = {216, 217, 270, 278, 289, 293}, m = "invokeSuspend", v = 2)
public final class w8a0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x8a0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8a0(x8a0 x8a0Var, String str, boolean z, v1b<? super w8a0> v1bVar) {
        super(2, v1bVar);
        this.d = x8a0Var;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w8a0 w8a0Var = new w8a0(this.d, this.e, this.f, v1bVar);
        w8a0Var.c = obj;
        return w8a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((w8a0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r7.y1(r6, r13) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (r7.y1(r6, r13) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
    
        if (r7.y1(r6, r13) == r1) goto L76;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
