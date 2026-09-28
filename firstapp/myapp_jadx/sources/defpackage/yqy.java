package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.onepunch.views.OnePunchFragment$downloadSpineData$1$1", f = "OnePunchFragment.kt", l = {516, 543, 547, 551, 555}, m = "invokeSuspend", v = 1)
public final class yqy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ zqy e;
    public final /* synthetic */ Context f;

    @c0d(c = "com.sportygames.onepunch.views.OnePunchFragment$downloadSpineData$1$1$spineData$1", f = "OnePunchFragment.kt", l = {517}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
        public int a;
        public final /* synthetic */ zqy b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zqy zqyVar, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zqyVar;
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            fq5 fq5Var = (fq5) this.b.c.getValue();
            String strC = op5.c(op5.a, "player_spine:sg_1_punch", "https://test.sporty.net/common/main/res/ad6a657dd741318a538038e867f4181a.zip");
            this.a = 1;
            Object objY1 = fq5Var.y1(this.c, strC, "player_spine", this);
            return objY1 == y5bVar ? y5bVar : objY1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqy(zqy zqyVar, Context context, v1b<? super yqy> v1bVar) {
        super(2, v1bVar);
        this.e = zqyVar;
        this.f = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yqy(this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yqy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:42|78|43|(1:45)(1:46)|47|(2:61|(1:63)(2:64|60))(4:51|(3:53|(1:55)(1:56)|(1:58))|59|82)) */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:28:0x006a, B:31:0x0085, B:33:0x0089, B:35:0x008f, B:39:0x0098, B:13:0x0035, B:17:0x0043, B:20:0x004d, B:23:0x005a), top: B:80:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109 A[PHI: r2 r12 r13 r16
      0x0109: PHI (r2v3 int) = (r2v4 int), (r2v4 int), (r2v4 int), (r2v11 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r12v3 int) = (r12v5 int), (r12v6 int), (r12v7 int), (r12v13 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r13v2 int) = (r13v3 int), (r13v3 int), (r13v3 int), (r13v9 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r16v2 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v9 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00a4, B:45:0x00b2, B:47:0x00b9, B:49:0x00bf, B:51:0x00c5, B:53:0x00dd, B:58:0x00e7, B:61:0x00f8, B:65:0x010c, B:68:0x011d), top: B:78:0x00a4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
    
        if (defpackage.hkd.b(500, r17) == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        if (defpackage.hkd.b(500, r17) == r1) goto L73;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x013f -> B:74:0x0142). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
