package defpackage;

import com.sporty.android.core.model.patron.FavoriteSummary;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.myfavorite.MyFavoriteRepositoryImpl$getStakeWithCallback$1", f = "MyFavoriteRepositoryImpl.kt", l = {232, 238, 242}, m = "invokeSuspend", v = 2)
public final class zxw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yxw b;
    public final /* synthetic */ CoroutineContext c;
    public final /* synthetic */ rop d;

    @c0d(c = "com.sporty.android.core.data.repository.myfavorite.MyFavoriteRepositoryImpl$getStakeWithCallback$1$1", f = "MyFavoriteRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ rop a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rop ropVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ropVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(null);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.myfavorite.MyFavoriteRepositoryImpl$getStakeWithCallback$1$2", f = "MyFavoriteRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ rop a;
        public final /* synthetic */ yxw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rop ropVar, yxw yxwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ropVar;
            this.b = yxwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            FavoriteSummary favoriteSummary = this.b.d;
            this.a.invoke(favoriteSummary != null ? favoriteSummary.stake : null);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.myfavorite.MyFavoriteRepositoryImpl$getStakeWithCallback$1$3", f = "MyFavoriteRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ rop a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rop ropVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ropVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxw(yxw yxwVar, CoroutineContext coroutineContext, rop ropVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = yxwVar;
        this.c = coroutineContext;
        this.d = ropVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zxw(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zxw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (defpackage.ej5.d(r2, r9, r8) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (defpackage.ej5.d(r2, r9, r8) == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            kotlin.coroutines.CoroutineContext r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            rop r6 = r8.d
            r7 = 0
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L18
            defpackage.uj50.b(r9)
            goto L5c
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L1e:
            defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L4e
            goto L5c
        L22:
            defpackage.uj50.b(r9)
            goto L3d
        L26:
            defpackage.uj50.b(r9)
            yxw r9 = r8.b
            com.sporty.android.core.model.patron.FavoriteSummary r1 = r9.d
            if (r1 != 0) goto L40
            zxw$a r9 = new zxw$a
            r9.<init>(r6, r7)
            r8.a = r5
            java.lang.Object r8 = defpackage.ej5.d(r2, r9, r8)
            if (r8 != r0) goto L3d
            goto L5b
        L3d:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L40:
            zxw$b r1 = new zxw$b     // Catch: java.lang.Exception -> L4e
            r1.<init>(r6, r9, r7)     // Catch: java.lang.Exception -> L4e
            r8.a = r4     // Catch: java.lang.Exception -> L4e
            java.lang.Object r8 = defpackage.ej5.d(r2, r1, r8)     // Catch: java.lang.Exception -> L4e
            if (r8 != r0) goto L5c
            goto L5b
        L4e:
            zxw$c r9 = new zxw$c
            r9.<init>(r6, r7)
            r8.a = r3
            java.lang.Object r8 = defpackage.ej5.d(r2, r9, r8)
            if (r8 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
