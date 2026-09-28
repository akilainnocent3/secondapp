package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.bo.images.ImageBOTypes;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.footer.impl.presentation.FooterViewModel$loadAsyncImages$1", f = "FooterViewModel.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class aqi extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bqi b;

    public static final class a<T> implements myh {
        public final /* synthetic */ bqi a;

        public a(bqi bqiVar) {
            this.a = bqiVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ooi ooiVar = (ooi) obj;
            wwd0 wwd0Var = this.a.c;
            while (true) {
                Object value = wwd0Var.getValue();
                ppi ppiVar = (ppi) value;
                p800 p800Var = ooiVar.a;
                String str = ooiVar.b;
                String str2 = ooiVar.c;
                UiText uiText = ooiVar.d;
                Integer num = ppiVar.a;
                UiText uiText2 = ppiVar.b;
                Pair<UiText, UiText> pair = ppiVar.c;
                UiText uiText3 = ppiVar.d;
                UiText uiText4 = ppiVar.e;
                boolean z = ppiVar.f;
                boolean z2 = ppiVar.g;
                UiText uiText5 = ppiVar.h;
                UiText uiText6 = ppiVar.i;
                UiText uiText7 = ppiVar.j;
                UiText uiText8 = ppiVar.k;
                ooi ooiVar2 = ooiVar;
                UiText uiText9 = ppiVar.o;
                boolean z3 = ppiVar.q;
                boolean z4 = ppiVar.r;
                boolean z5 = ppiVar.s;
                UiText uiText10 = ppiVar.t;
                u75 u75Var = ppiVar.u;
                boolean z6 = ppiVar.v;
                List<mpi> list = ppiVar.w;
                p800Var.getClass();
                uiText10.getClass();
                list.getClass();
                if (wwd0Var.g(value, new ppi(num, uiText2, pair, uiText3, uiText4, z, z2, uiText5, uiText6, uiText7, uiText8, str, str2, uiText, uiText9, p800Var, z3, z4, z5, uiText10, u75Var, z6, list))) {
                    return Unit.a;
                }
                ooiVar = ooiVar2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(bqi bqiVar, v1b<? super aqi> v1bVar) {
        super(2, v1bVar);
        this.b = bqiVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aqi(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aqi) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bqi bqiVar = this.b;
            zws zwsVar = bqiVar.a;
            vq1 vq1Var = zwsVar.b;
            odd oddVar = zwsVar.d;
            psm psmVar = zwsVar.c;
            boolean z = psmVar.F() || psmVar.W();
            boolean z2 = !psmVar.F();
            boolean zF = psmVar.F();
            rih rihVar = zwsVar.a;
            lyh lyhVarC = ozh.c(r1i.a(ozh.c(new or60(new qih(rihVar, null)), (k5b) rihVar.b), ozh.c(new wws(new vws(vq1Var.b(ImageBOTypes.Image.MAIN_FOOTER__ENDORSEMENT))), oddVar), ozh.c(new yws(new xws(vq1Var.b(ImageBOTypes.Image.MAIN_FOOTER__PARTNERSHIP))), oddVar), new uws(z2, z, zF, null)), oddVar);
            a aVar = new a(bqiVar);
            this.a = 1;
            if (lyhVarC.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
