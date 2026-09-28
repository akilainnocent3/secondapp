package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$createEventScoreSimulationFlow$1", f = "FootballFamilySettlementViewModel.kt", l = {294, 296}, m = "invokeSuspend", v = 2)
public final class wfi extends tje0 implements Function2<myh<? super fci>, v1b<? super Unit>, Object> {
    public long a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ pbi w;
    public final /* synthetic */ c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfi(pbi pbiVar, c cVar, v1b<? super wfi> v1bVar) {
        super(2, v1bVar);
        this.w = pbiVar;
        this.y = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wfi wfiVar = new wfi(this.w, this.y, v1bVar);
        wfiVar.v = obj;
        return wfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super fci> myhVar, v1b<? super Unit> v1bVar) {
        return ((wfi) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:17:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011b -> B:50:0x011e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
