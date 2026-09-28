package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionUiMapperImpl", f = "MissionUiMapperImpl.kt", l = {72}, m = "toMultiTaskMissionUiDataList", v = 2)
public final class uwv extends x1b {
    public Map a;
    public Set b;
    public Collection c;
    public Iterator d;
    public Collection e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ mwv v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwv(mwv mwvVar, x1b x1bVar) {
        super(x1bVar);
        this.v = mwvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, null, null, false, this);
    }
}
