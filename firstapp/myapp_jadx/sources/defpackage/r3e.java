package defpackage;

import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$8", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r3e extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3e(u3e u3eVar, v1b<? super r3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r3e r3eVar = new r3e(this.b, v1bVar);
        r3eVar.a = ((Boolean) obj).booleanValue();
        return r3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((r3e) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u3e u3eVar = this.b;
        lke lkeVar = u3eVar.i;
        if (lkeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ImageView imageView = lkeVar.e.D;
        if (z) {
            imageView.setImageResource(R.drawable.spr_checked3x);
            imageView.clearColorFilter();
        } else {
            imageView.setImageResource(R.drawable.spr_unchecked3x);
            imageView.setColorFilter(u3eVar.requireContext().getColor(R.color.line_type1_secondary));
        }
        return Unit.a;
    }
}
