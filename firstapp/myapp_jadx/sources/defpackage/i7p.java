package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.jackpot.fragments.JackpotSportyViewModel$fetchJackpotGifts$1", f = "JackpotSportyViewModel.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class i7p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j7p b;

    public static final class a<T> implements myh {
        public final /* synthetic */ j7p a;

        public a(j7p j7pVar) {
            this.a = j7pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            ayk aykVar;
            GiftDetails giftDetails;
            String strN;
            List list = (List) obj;
            if (!list.isEmpty()) {
                wwd0 wwd0Var = this.a.d;
                do {
                    value = wwd0Var.getValue();
                    aykVar = (ayk) value;
                    giftDetails = (GiftDetails) CollectionsKt.T(list);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(giftDetails.getCurrentBalance());
                    bigDecimalValueOf.getClass();
                    strN = bjb0.N(p54.b(bigDecimalValueOf));
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value, ayk.a(aykVar, false, true, list, giftDetails.getGiftId(), strN, dyk.a.a, list.size() > 1, !StringsKt.U(strN), new ResourceUiText(R.string.component_coupon__max_vamount, ay0.S(new Object[]{strN})), 1)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7p(j7p j7pVar, v1b<? super i7p> v1bVar) {
        super(2, v1bVar);
        this.b = j7pVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i7p(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i7p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            j7p j7pVar = this.b;
            h530 h530Var = j7pVar.b.a;
            com.sportybet.core.domain.model.a.C0358a c0358a = com.sportybet.core.domain.model.a.b;
            n7k n7kVar = new n7k(bm50.f(bm50.a(new m7k(h530Var.m(3, Integer.valueOf(OrderBetType.ALL.getValue()))))));
            a aVar = new a(j7pVar);
            this.a = 1;
            if (n7kVar.collect(aVar, this) == y5bVar) {
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
