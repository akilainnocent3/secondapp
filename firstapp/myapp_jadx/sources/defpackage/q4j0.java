package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.mapper.WelcomeRewardUiStateMapper", f = "WelcomeRewardUiStateMapper.kt", l = {74}, m = "mapUiState", v = 2)
public final class q4j0 extends x1b {
    public ResourceUiText a;
    public ArrayList b;
    public String c;
    public ArrayList d;
    public dup e;
    public List f;
    public /* synthetic */ Object i;
    public final /* synthetic */ n4j0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4j0(n4j0 n4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = n4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, 0, 0, this);
    }
}
