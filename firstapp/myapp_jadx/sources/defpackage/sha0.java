package defpackage;

import com.sportybet.android.social.data.remote.entity.SocShareCode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.SocialShareCodeMediator$loadMore$2", f = "SocialShareCodeMediator.kt", l = {65, 66, 71, 73}, m = "invokeSuspend", v = 2)
public final class sha0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tha0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List<SocShareCode> e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sha0(boolean z, tha0 tha0Var, String str, List<SocShareCode> list, int i, int i2, v1b<? super sha0> v1bVar) {
        super(1, v1bVar);
        this.b = z;
        this.c = tha0Var;
        this.d = str;
        this.e = list;
        this.f = i;
        this.i = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new sha0(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((sha0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac A[LOOP:1: B:26:0x00a6->B:28:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:38:0x0138 A[PHI: r23
      0x0138: PHI (r23v2 com.sportybet.android.social.data.local.SocialDatabase) = 
      (r23v0 com.sportybet.android.social.data.local.SocialDatabase)
      (r23v3 com.sportybet.android.social.data.local.SocialDatabase)
     binds: [B:36:0x0135, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014c, code lost:
    
        if (r1.b(r3, r41) == r2) goto L40;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sha0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
