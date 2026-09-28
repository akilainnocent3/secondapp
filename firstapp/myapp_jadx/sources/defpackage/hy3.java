package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.data.repository.BetslipThemeRepositoryImpl", f = "BetslipThemeRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "applyTheme", v = 2)
public final class hy3 extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ly3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy3(ly3 ly3Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ly3Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
