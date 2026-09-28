package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.mapper.ChallengeUiMapper", f = "ChallengeUiMapper.kt", l = {147, 159}, m = "mapToCardUiModels", v = 2)
public final class m37 extends x1b {
    public ChallengeType A;
    public ChallengeCardStatus B;
    public ResourceUiText C;
    public ResourceUiText D;
    public String E;
    public Collection F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public long L;
    public long M;
    public long N;
    public /* synthetic */ Object O;
    public final /* synthetic */ j37 P;
    public int Q;
    public Collection a;
    public Iterator b;
    public jx6 c;
    public qw6 d;
    public j27 e;
    public ChallengeCardStatus f;
    public UiText i;
    public String v;
    public Long w;
    public Object y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m37(j37 j37Var, x1b x1bVar) {
        super(x1bVar);
        this.P = j37Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.d(0, this, null);
    }
}
