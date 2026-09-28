package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$PlanetAnimationScreen$animatePlanet$1", f = "GalaxyGoFragment.kt", l = {1489, 1492, 1520}, m = "invokeSuspend", v = 1)
public final class wgj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public int c;
    public final /* synthetic */ tgj d;
    public final /* synthetic */ SnapshotStateList<tgj.c> e;
    public final /* synthetic */ int f;
    public final /* synthetic */ tgj.c i;
    public final /* synthetic */ int v;
    public final /* synthetic */ List<Integer> w;
    public final /* synthetic */ v5b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgj(tgj tgjVar, SnapshotStateList snapshotStateList, int i, tgj.c cVar, int i2, List list, v5b v5bVar, v1b v1bVar) {
        super(2, v1bVar);
        tgj.a aVar = tgj.a.a;
        this.d = tgjVar;
        this.e = snapshotStateList;
        this.f = i;
        this.i = cVar;
        this.v = i2;
        this.w = list;
        this.y = v5bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tgj.a aVar = tgj.a.a;
        return new wgj(this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wgj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[PHI: r8
      0x0051: PHI (r8v3 long) = (r8v2 long), (r8v4 long) binds: [B:15:0x004b, B:27:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x006a A[PHI: r2 r8
      0x006a: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v23 java.lang.Object) binds: [B:17:0x0066, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r8v4 long) = (r8v3 long), (r8v5 long) binds: [B:17:0x0066, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:19:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
