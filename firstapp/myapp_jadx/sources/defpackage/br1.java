package defpackage;

import com.sporty.android.core.model.bo.images.ImageBOTypes;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl", f = "BOImageRepositoryImpl.kt", l = {113, 116, 121}, m = "loadFromStorage", v = 2)
public final class br1 extends x1b {
    public long a;
    public Collection b;
    public Iterator c;
    public ImageBOTypes.Image d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wq1 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br1(wq1 wq1Var, x1b x1bVar) {
        super(x1bVar);
        this.f = wq1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
