package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeCardRefreshLoop$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {288, 291, 295, 297, 305, 312}, m = "invokeSuspend", v = 2)
public final class uey extends tje0 implements Function2<myh<? super y7q>, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> A;
    public final /* synthetic */ Function1<z7q, Object> B;
    public final /* synthetic */ Function1<z7q, Unit> C;
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function1<Object, Long> f;
    public final /* synthetic */ g8q i;
    public final /* synthetic */ x7q v;
    public final /* synthetic */ Function0<Unit> w;
    public final /* synthetic */ Function1<q7q.b, Unit> y;
    public final /* synthetic */ afy z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uey(Object obj, long j, Function1<Object, Long> function1, g8q g8qVar, x7q x7qVar, Function0<Unit> function0, Function1<? super q7q.b, Unit> function2, afy afyVar, Function0<Unit> function3, Function1<? super z7q, Object> function4, Function1<? super z7q, Unit> function5, v1b<? super uey> v1bVar) {
        super(2, v1bVar);
        this.d = obj;
        this.e = j;
        this.f = function1;
        this.i = g8qVar;
        this.v = x7qVar;
        this.w = function0;
        this.y = function2;
        this.z = afyVar;
        this.A = function3;
        this.B = function4;
        this.C = function5;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uey ueyVar = new uey(this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, v1bVar);
        ueyVar.c = obj;
        return ueyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super y7q> myhVar, v1b<? super Unit> v1bVar) {
        return ((uey) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT, PHI: r2
      0x0046: PHI (r2v9 java.lang.Object) = (r2v1 java.lang.Object), (r2v2 java.lang.Object), (r2v11 java.lang.Object) binds: [B:12:0x0042, B:10:0x0028, B:41:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[PHI: r13
      0x00a5: PHI (r13v3 java.lang.Object) = (r13v0 java.lang.Object), (r13v12 java.lang.Object) binds: [B:7:0x001b, B:25:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[PHI: r13
      0x00d4: PHI (r13v21 java.lang.Object) = (r13v9 java.lang.Object), (r13v0 java.lang.Object) binds: [B:34:0x00d1, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:36:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uey.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
