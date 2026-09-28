package defpackage;

import android.widget.ImageView;
import com.google.android.flexbox.FlexboxLayout;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$13", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i3e extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3e(u3e u3eVar, v1b<? super i3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i3e i3eVar = new i3e(this.b, v1bVar);
        i3eVar.a = obj;
        return i3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
        return ((i3e) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<String> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u3e u3eVar = this.b;
        lke lkeVar = u3eVar.i;
        if (lkeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        lkeVar.b.removeAllViews();
        for (String str : list) {
            ImageView imageView = new ImageView(u3eVar.requireContext());
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(zch0.a(u3eVar.requireContext(), 30), zch0.a(u3eVar.requireContext(), 20));
            int iA = zch0.a(u3eVar.requireContext(), 3);
            layoutParams.setMargins(iA, iA, iA, iA);
            imageView.setLayoutParams(layoutParams);
            lke lkeVar2 = u3eVar.i;
            if (lkeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lkeVar2.b.addView(imageView);
            m9n m9nVarA = qw90.a(imageView.getContext());
            nan.a aVar = new nan.a(imageView.getContext());
            aVar.c = str;
            abn.f(aVar, imageView);
            abn.e(aVar, R.drawable.icon_default);
            abn.b(aVar, R.drawable.icon_default);
            m9nVarA.a(aVar.a());
        }
        lke lkeVar3 = u3eVar.i;
        if (lkeVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        lkeVar3.b.invalidate();
        lke lkeVar4 = u3eVar.i;
        if (lkeVar4 != null) {
            lkeVar4.b.requestLayout();
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
