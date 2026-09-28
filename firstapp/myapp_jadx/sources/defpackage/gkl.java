package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.bookingcode.presentation.smartremix.SmartRemixConfirmationUiState;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgkl;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gkl extends j8i0 {
    public final t340 A;
    public final vu60 a;
    public final gj7 b;
    public final rdd0 c;
    public final jrm d;
    public final lrm e;
    public final krm f;
    public final wwd0 i;
    public final v340 v;
    public final b390 w;
    public final t340 y;
    public final ku90<com.sporty.android.common.uievent.a> z;

    @c0d(c = "com.sportybet.android.bookingcode.presentation.smartremix.HighLiabilitySmartRemixViewModel$onSmartRemixClicked$1", f = "HighLiabilitySmartRemixViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ List<Event> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends Event> list, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = gkl.this.new a(this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object value;
            Object value2;
            gkl gklVar = gkl.this;
            wwd0 wwd0Var = gklVar.i;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, new k2a0(((k2a0) value2).b, true)));
                    String str = this.d;
                    List<Event> list = this.e;
                    zi50.a aVar = zi50.b;
                    gj7 gj7Var = gklVar.b;
                    this.b = null;
                    this.a = 1;
                    obj = gj7Var.a(this, str, list);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = (d2a0) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (!(bVar instanceof zi50.b)) {
                d2a0 d2a0Var = (d2a0) bVar;
                String str2 = d2a0Var.a;
                Integer num = d2a0Var.b;
                ArrayList arrayList = d2a0Var.c;
                c2a0 c2a0Var = d2a0Var.d;
                gklVar.y1(new SmartRemixConfirmationUiState(str2, num, arrayList, c2a0Var.a, c2a0Var.b), false);
            }
            if (zi50.a(bVar) != null) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, new k2a0(((k2a0) value).b, false)));
                gklVar.z1(d9s.a);
                ku90<com.sporty.android.common.uievent.a> ku90Var = gklVar.z;
                StringUiText stringUiText = vch0.a;
                b.i(ku90Var, new ResourceUiText(R.string.component_betslip__smart_remix_error), null, null, null, 30);
            }
            return Unit.a;
        }
    }

    public gkl(vu60 vu60Var, gj7 gj7Var, rdd0 rdd0Var, jrm jrmVar, lrm lrmVar, krm krmVar) {
        vu60Var.getClass();
        rdd0Var.getClass();
        jrmVar.getClass();
        lrmVar.getClass();
        krmVar.getClass();
        this.a = vu60Var;
        this.b = gj7Var;
        this.c = rdd0Var;
        this.d = jrmVar;
        this.e = lrmVar;
        this.f = krmVar;
        wwd0 wwd0VarA = xwd0.a(new k2a0((SmartRemixConfirmationUiState) vu60Var.b("smart_remix_confirmation"), 1));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.w = b390VarB;
        this.y = e1i.a(b390VarB);
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.z = ku90Var;
        this.A = e1i.a(ku90Var);
    }

    public final void x1(String str, List<? extends Event> list, w8s w8sVar) {
        str.getClass();
        list.getClass();
        if (((k2a0) this.i.getValue()).a) {
            return;
        }
        this.c.a(new g9s(w8sVar), k00.d, k00.c);
        ej5.c(o8i0.d(this), null, null, new a(str, list, null), 3);
    }

    public final void y1(SmartRemixConfirmationUiState smartRemixConfirmationUiState, boolean z) {
        wwd0 wwd0Var;
        Object value;
        this.a.e(smartRemixConfirmationUiState, "smart_remix_confirmation");
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
            ((k2a0) value).getClass();
        } while (!wwd0Var.g(value, new k2a0(smartRemixConfirmationUiState, z)));
    }

    public final void z1(pdd0 pdd0Var) {
        this.c.a(pdd0Var, k00.d);
    }
}
