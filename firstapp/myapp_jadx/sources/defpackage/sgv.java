package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$bindToAssetsInfo$1", f = "MeViewModel.kt", l = {384}, m = "invokeSuspend", v = 2)
public final class sgv extends tje0 implements Function2<oev, v1b<? super Unit>, Object> {
    public ztw a;
    public rhv b;
    public Object c;
    public cgv d;
    public boolean e;
    public boolean f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ rhv w;
    public final /* synthetic */ yp40 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgv(v1b v1bVar, rhv rhvVar, yp40 yp40Var) {
        super(2, v1bVar);
        this.w = rhvVar;
        this.y = yp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sgv sgvVar = new sgv(v1bVar, this.w, this.y);
        sgvVar.v = obj;
        return sgvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(oev oevVar, v1b<? super Unit> v1bVar) {
        return ((sgv) create(oevVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:13:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
