package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.social.data.remote.entity.CreatorCreditsData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsHistoryMediator", f = "CreatorCreditsHistoryMediator.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 51, 56, 62}, m = "loadMore", v = 2)
public final class m2c extends x1b {
    public xqz a;
    public CreatorCreditsData b;
    public boolean c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o2c i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2c(o2c o2cVar, x1b x1bVar) {
        super(x1bVar);
        this.i = o2cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.c(null, false, this);
    }
}
