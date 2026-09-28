package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.base.mvvm.MvvmBaseFragment$observeEvents$1", f = "MvvmBaseFragment.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class yuw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zuw<Object> b;

    public static final class a<T> implements myh {
        public final /* synthetic */ zuw<Object> a;

        public a(zuw<Object> zuwVar) {
            this.a = zuwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            boolean z = id90Var instanceof foh;
            zuw<Object> zuwVar = this.a;
            if (z) {
                zuwVar.requireActivity().finish();
            } else if (id90Var instanceof rb90) {
                Context context = zuwVar.getContext();
                UiText uiText = ((rb90) id90Var).a;
                Context contextRequireContext = zuwVar.requireContext();
                contextRequireContext.getClass();
                uiText.getClass();
                Toast.makeText(context, uiText.e(contextRequireContext).toString(), 0).show();
            } else {
                zuwVar.o0(id90Var);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuw(zuw<Object> zuwVar, v1b<? super yuw> v1bVar) {
        super(2, v1bVar);
        this.b = zuwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yuw(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((yuw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to yuw for r5v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L10:
            defpackage.uj50.b(r6)
            goto L2f
        L14:
            defpackage.uj50.b(r6)
            zuw<java.lang.Object> r6 = r5.b
            avw r1 = r6.n0()
            t340 r1 = r1.d
            yuw$a r4 = new yuw$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
