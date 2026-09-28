package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionRewardUiMapper", f = "MissionRewardUiMapper.kt", l = {57}, m = "map", v = 2)
public final class auv extends x1b {
    public List a;
    public String b;
    public String c;
    public Collection d;
    public Iterator e;
    public Collection f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ ytv w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auv(ytv ytvVar, x1b x1bVar) {
        super(x1bVar);
        this.w = ytvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
