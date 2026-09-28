package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.helper.ChangeRegionHelper", f = "ChangeRegionHelper.kt", l = {35, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 47, 48, 50, 51, 53}, m = "changeRegion", v = 2)
public final class q57 extends x1b {
    public CountryCodeName a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r57 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q57(r57 r57Var, x1b x1bVar) {
        super(x1bVar);
        this.c = r57Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
