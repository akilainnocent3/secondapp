package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.evenodd.components.RoundResult;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.components.RoundResult", f = "RoundResult.kt", l = {272}, m = "setDynamicImagesAsDrawable", v = 1)
public final class qz50 extends x1b {
    public ConstraintLayout a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RoundResult c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz50(RoundResult roundResult, x1b x1bVar) {
        super(x1bVar);
        this.c = roundResult;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = RoundResult.b;
        return this.c.b(null, null, this);
    }
}
