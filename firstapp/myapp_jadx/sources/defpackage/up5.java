package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase$fetchCMS$2", f = "CMSUpdateUseCase.kt", l = {52, 55}, m = "invokeSuspend", v = 2)
public final class up5 extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public xp5 a;
    public v5b b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xp5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up5(xp5 xp5Var, v1b<? super up5> v1bVar) {
        super(2, v1bVar);
        this.f = xp5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        up5 up5Var = new up5(this.f, v1bVar);
        up5Var.e = obj;
        return up5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((up5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:36:0x008e, B:38:0x0094, B:48:0x00c4, B:47:0x00c1, B:12:0x0029, B:20:0x0047, B:21:0x0052, B:23:0x0058, B:25:0x0063, B:34:0x0083, B:28:0x006a, B:29:0x006e, B:31:0x0074, B:35:0x0087, B:17:0x0035, B:7:0x001a, B:45:0x00bc, B:39:0x009a, B:42:0x00b7), top: B:58:0x000e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:7:0x001a, B:45:0x00bc, B:39:0x009a, B:42:0x00b7), top: B:56:0x001a, outer: #1 }] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
