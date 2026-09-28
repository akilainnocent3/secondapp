package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import com.sporty.android.core.model.virtual.MainEntranceItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$hasEntrance$1", f = "InstantWinPromotionManagerImpl.kt", l = {81, 97, 107}, m = "invokeSuspend", v = 2)
public final class nio extends tje0 implements iaj<myh<? super Boolean>, lk50<? extends InstantWinPromotionData>, lk50<? extends List<? extends MainEntranceItem>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ pio A;
    public String a;
    public String b;
    public String c;
    public String d;
    public Iterator e;
    public MainEntranceItem f;
    public int i;
    public int v;
    public /* synthetic */ myh w;
    public /* synthetic */ lk50 y;
    public /* synthetic */ lk50 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nio(v1b v1bVar, pio pioVar) {
        super(4, v1bVar);
        this.A = pioVar;
    }

    @Override // defpackage.iaj
    public final Object d(myh<? super Boolean> myhVar, lk50<? extends InstantWinPromotionData> lk50Var, lk50<? extends List<? extends MainEntranceItem>> lk50Var2, v1b<? super Unit> v1bVar) {
        nio nioVar = new nio(v1bVar, this.A);
        nioVar.w = myhVar;
        nioVar.y = lk50Var;
        nioVar.z = lk50Var2;
        return nioVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b0 -> B:58:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bf -> B:58:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e3 -> B:47:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nio.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
