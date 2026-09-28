package defpackage;

import com.sportybet.plugin.realsports.data.BoostResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel", f = "HomeViewModel.kt", l = {675}, m = "mapFeaturedData", v = 2)
public final class bjm extends x1b {
    public List a;
    public String b;
    public ArrayList c;
    public BoostResult d;
    public /* synthetic */ Object e;
    public final /* synthetic */ iim f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjm(iim iimVar, x1b x1bVar) {
        super(x1bVar);
        this.f = iimVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.C1(this, null, null);
    }
}
