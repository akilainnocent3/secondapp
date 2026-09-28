package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$collectThemeData$1", f = "SettingsFragment.kt", l = {822}, m = "invokeSuspend", v = 2)
public final class ll80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hl80 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ hl80 a;

        public a(hl80 hl80Var) {
            this.a = hl80Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            TextView textView;
            ohp<Object>[] ohpVarArr = hl80.N;
            hl80 hl80Var = this.a;
            Drawable drawableA = gr0.a(hl80Var.requireContext(), R.drawable.ic_radio_btn);
            Drawable drawableA2 = gr0.a(hl80Var.requireContext(), R.drawable.ic_radio_btn_selected);
            Map mapF = kpu.f(new Pair(hl80Var.m0().F, drawableA), new Pair(hl80Var.m0().D, drawableA), new Pair(hl80Var.m0().H, drawableA));
            int i = hl80.a.a[((ThemeConfig) obj).ordinal()];
            if (i == 1) {
                textView = hl80Var.m0().F;
            } else if (i != 2) {
                textView = i != 3 ? hl80Var.m0().H : hl80Var.m0().H;
            } else {
                textView = hl80Var.m0().D;
            }
            for (Map.Entry entry : mapF.entrySet()) {
                Object key = entry.getKey();
                key.getClass();
                ((TextView) key).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) entry.getValue(), (Drawable) null);
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA2, (Drawable) null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll80(v1b v1bVar, hl80 hl80Var) {
        super(2, v1bVar);
        this.b = hl80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ll80(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ll80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to ll80 for r4v3 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.uj50.b(r5)
            goto L31
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L14:
            defpackage.uj50.b(r5)
            ohp<java.lang.Object>[] r5 = defpackage.hl80.N
            hl80 r5 = r4.b
            nm80 r1 = r5.p0()
            v340 r1 = r1.z
            ll80$a r3 = new ll80$a
            r3.<init>(r5)
            r4.a = r2
            uwd0<T> r5 = r1.a
            java.lang.Object r4 = r5.collect(r3, r4)
            if (r4 != r0) goto L31
            return r0
        L31:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
