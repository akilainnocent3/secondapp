package defpackage;

import com.sportybet.android.user.avatar.e;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$1", f = "ChangeAvatarViewModel.kt", l = {96, 97, 98, 99, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 2)
public final class f47 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Serializable a;
    public bnh0 b;
    public String[] c;
    public boolean d;
    public int e;
    public final /* synthetic */ e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f47(e eVar, v1b<? super f47> v1bVar) {
        super(2, v1bVar);
        this.f = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f47(this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f47) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2 A[PHI: r4
      0x00c2: PHI (r4v7 boolean) = (r4v6 boolean), (r4v12 boolean) binds: [B:28:0x00bf, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        if (kotlin.Unit.a == r3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.lang.String[]] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f47.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
