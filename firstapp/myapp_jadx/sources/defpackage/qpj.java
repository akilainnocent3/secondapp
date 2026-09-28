package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.manager.gameplay.GameplayPayloadManager", f = "GameplayPayloadManager.kt", l = {73, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, HttpStatusCodesKt.HTTP_PROCESSING, 119, 123, 149, 166, 167}, m = "mapGameplayPayloadToEvents", v = 1)
public final class qpj extends x1b {
    public int A;
    public int B;
    public int C;
    public int D;
    public double E;
    public long F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ rpj I;
    public int J;
    public pye a;
    public Object b;
    public List c;
    public Object d;
    public ngs e;
    public Collection f;
    public sye i;
    public Iterator v;
    public sye w;
    public Collection y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpj(rpj rpjVar, x1b x1bVar) {
        super(x1bVar);
        this.I = rpjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, this);
    }
}
