package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes8.dex */
public final class hdd<REQUEST, RESPONSE> {
    public final i1z a;
    public final aom<REQUEST, RESPONSE> d;
    public final ArrayList b = new ArrayList();
    public final UnaryOperator<lra0<REQUEST, RESPONSE>> c = UnaryOperator.identity();
    public final UnaryOperator<era0<REQUEST>> f = UnaryOperator.identity();
    public final boolean g = false;
    public final dqm<REQUEST> e = new dqm<>();

    static {
        kyo.a(g21.a, "peer.service");
    }

    public hdd(i1z i1zVar) {
        this.a = i1zVar;
        HashSet hashSet = ynm.f;
        this.d = new aom<>();
    }
}
