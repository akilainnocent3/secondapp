package defpackage;

import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$startFallbackTimerByCashOutInfo$job$1", f = "CashOutViewModel.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 453}, m = "invokeSuspend", v = 2)
public final class qo6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ h f;
    public final /* synthetic */ String i;
    public final /* synthetic */ long v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(int i, long j, h hVar, String str, long j2, String str2, v1b<? super qo6> v1bVar) {
        super(2, v1bVar);
        this.d = i;
        this.e = j;
        this.f = hVar;
        this.i = str;
        this.v = j2;
        this.w = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qo6 qo6Var = new qo6(this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        qo6Var.c = obj;
        return qo6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qo6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:31:0x00a3, B:33:0x00a9, B:43:0x00e9, B:37:0x00b8, B:30:0x00a0), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: Exception -> 0x013f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:31:0x00a3, B:33:0x00a9, B:43:0x00e9, B:37:0x00b8, B:30:0x00a0), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[Catch: Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0031, blocks: (B:7:0x0024, B:41:0x00c3, B:14:0x003e, B:28:0x0096, B:17:0x004a, B:19:0x0056, B:21:0x007d), top: B:69:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: Exception -> 0x013f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:31:0x00a3, B:33:0x00a9, B:43:0x00e9, B:37:0x00b8, B:30:0x00a0), top: B:67:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134 A[Catch: Exception -> 0x013b, TryCatch #1 {Exception -> 0x013b, blocks: (B:49:0x0129, B:52:0x0134, B:45:0x00f7, B:57:0x0143), top: B:69:0x001c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0127 -> B:49:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
