package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {93, 95}, m = "invokeSuspend")
public final class h350 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Throwable a;
    public int b;
    public int c;
    public final /* synthetic */ g350 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ pnt f;
    public final /* synthetic */ ytw<ont> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h350(g350 g350Var, Context context, pnt pntVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = g350Var;
        this.e = context;
        this.f = pntVar;
        this.i = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h350(this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h350) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[PHI: r0 r1
      0x006a: PHI (r0v23 int) = (r0v27 int), (r0v28 int) binds: [B:23:0x0068, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r1v4 java.lang.Throwable) = (r1v7 java.lang.Throwable), (r1v8 java.lang.Throwable) binds: [B:23:0x0068, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a3, B:35:0x0096, B:38:0x009e, B:28:0x007a, B:31:0x0084), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a3, B:35:0x0096, B:38:0x009e, B:28:0x007a, B:31:0x0084), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a3, B:35:0x0096, B:38:0x009e, B:28:0x007a, B:31:0x0084), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:7:0x0012, B:43:0x00b5, B:44:0x00bf, B:47:0x00d1, B:50:0x00df, B:54:0x00e6, B:45:0x00c0, B:49:0x00d3), top: B:79:0x0012, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:45:0x00c0, B:49:0x00d3), top: B:75:0x00c0, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b4 -> B:43:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ea -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h350.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
