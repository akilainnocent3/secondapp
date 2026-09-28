package androidx.compose.ui.platform;

import com.sportybet.android.gp.tz.R;
import defpackage.c2a;
import defpackage.cbs;
import defpackage.ibs;
import defpackage.lma;
import defpackage.op8;
import defpackage.qlr;
import defpackage.s9s;
import defpackage.uma;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements lma, cbs {
    public final AndroidComposeView a;
    public final uma b;
    public boolean c;
    public s9s d;
    public op8 e = c2a.a;

    public static final class a extends qlr implements Function1<AndroidComposeView.b, Unit> {
        public final /* synthetic */ op8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(op8 op8Var) {
            super(1);
            this.b = op8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidComposeView.b bVar) {
            AndroidComposeView.b bVar2 = bVar;
            i iVar = i.this;
            if (!iVar.c) {
                s9s lifecycle = bVar2.a.getLifecycle();
                op8 op8Var = this.b;
                iVar.e = op8Var;
                if (iVar.d == null) {
                    iVar.d = lifecycle;
                    lifecycle.a(iVar);
                } else if (lifecycle.b().compareTo(s9s.b.c) >= 0) {
                    iVar.b.g(new op8(1330788943, new h(iVar, op8Var), true));
                }
            }
            return Unit.a;
        }
    }

    public i(AndroidComposeView androidComposeView, uma umaVar) {
        this.a = androidComposeView;
        this.b = umaVar;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar == s9s.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != s9s.a.ON_CREATE || this.c) {
                return;
            }
            g(this.e);
        }
    }

    @Override // defpackage.lma
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(R.id.wrapped_composition_tag, null);
            s9s s9sVar = this.d;
            if (s9sVar != null) {
                s9sVar.d(this);
            }
        }
        this.b.dispose();
    }

    @Override // defpackage.lma
    public final void g(Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        this.a.setOnViewTreeOwnersAvailable(new a((op8) function2));
    }
}
