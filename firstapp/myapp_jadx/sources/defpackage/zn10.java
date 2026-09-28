package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.remove.viewmodel.PlayTimeControlRemoveViewModel$onRemoveTimeOut$1", f = "PlayTimeControlRemoveViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class zn10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yn10 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ yn10 a;

        public a(yn10 yn10Var) {
            this.a = yn10Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            yn10 yn10Var = this.a;
            if (z) {
                return yn10Var.z1(v1bVar);
            }
            if (!(lk50Var instanceof lk50.a)) {
                return Unit.a;
            }
            b390 b390Var = yn10Var.c;
            StringUiText stringUiText = vch0.a;
            return b390Var.emit(new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later)), v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn10(yn10 yn10Var, v1b<? super zn10> v1bVar) {
        super(2, v1bVar);
        this.b = yn10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zn10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zn10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yn10 yn10Var = this.b;
            wwd0 wwd0Var = yn10Var.a;
            do {
                value = wwd0Var.getValue();
                gr10 gr10Var = (gr10) value;
                str = gr10Var.a;
                gr10Var.getClass();
            } while (!wwd0Var.g(value, new gr10(str, true)));
            sl50 sl50Var = new sl50(bm50.a(new i750(yn10Var.e.a.I())));
            a aVar = new a(yn10Var);
            this.a = 1;
            if (sl50Var.collect(aVar, this) == y5bVar) {
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
