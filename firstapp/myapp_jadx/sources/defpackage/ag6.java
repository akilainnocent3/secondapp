package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.Card3DSAuthUseCase", f = "Card3DSAuthUseCase.kt", l = {30, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 57, 97, 87}, m = "invoke", v = 2)
public final class ag6 extends x1b {
    public int A;
    public BigDecimal a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public Function1 f;
    public String i;
    public String v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ bg6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag6(bg6 bg6Var, x1b x1bVar) {
        super(x1bVar);
        this.z = bg6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, null, null, null, this);
    }
}
